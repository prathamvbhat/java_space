package FlightTracker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.*;


public class FlightTrackerGUI 
{
	private static final String APP_ID = "ccbd306aD"; // Replace with your FlightStats API App ID
    private static final String APP_KEY = "436f11eea2efb89af03c1c436e23d157Y"; // Replace with your FlightStats API App Key
	
	private JFrame frame;
	private JPanel panel;
	private JLabel flightNumberLabel;
	private JLabel departureDateLabel;
	private JTextField flightNumberField;
	private JTextField departureDateField;
	private JButton trackButton;
	private JLabel statusLabel;
	
	public FlightTrackerGUI()
	{
		createGUI();
	}
	
	private void createGUI()
	{
		frame=new JFrame("Flight Tracker");
		panel=new JPanel(new BorderLayout());
		flightNumberLabel=new JLabel("Flight Number: ");
		departureDateLabel=new JLabel("Departure Date (YYYY/MM/DD): ");
		flightNumberField=new JTextField(10);
		departureDateField=new JTextField(10);
		trackButton=new JButton("Track");
		statusLabel=new JLabel("");
		
		//Add the Components to the Panel
		JPanel p=new JPanel();
		p.add(flightNumberLabel);
		p.add(flightNumberField);
		p.add(departureDateLabel);
		p.add(departureDateField);
		p.add(trackButton);
		panel.add(p, BorderLayout.NORTH);
		panel.add(statusLabel, BorderLayout.CENTER);
		
		//Add an ActionListener To the TrackButton
		trackButton.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e)
					{
						try
						{
							String flightNumber=flightNumberField.getText();
							String departureDate=departureDateField.getText();
							
							//APi call to get flight Status information
							String url="https://api.flightstats.com/flex/flightstatus/rest/v2/json/flight/status/"+flightNumber+"/dep/"+departureDate+"?appID="+APP_ID+"&appKey="+APP_KEY;
							HttpURLConnection connection=(HttpURLConnection) new URL(url).openConnection();
		                    connection.setRequestMethod("GET");

		                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

		                    String line;
		                    StringBuffer response = new StringBuffer();

		                    while ((line = reader.readLine()) != null) {
		                        response.append(line);
		                    }

		                    reader.close();

		                    // Parse the JSON response to extract the flight status information
		                    JSONObject jsonResponse = new JSONObject(response.toString());
		                    String status = jsonResponse.getJSONObject("flightStatus").getString("status");
		                    String scheduledDepartureTime = jsonResponse.getJSONObject("flightStatus")
		                            .getJSONObject("operationalTimes").getJSONObject("scheduledGateDeparture").getString("dateLocal");
		                    String departureAirport = jsonResponse.getJSONObject("flightStatus")
		                            .getJSONObject("departureAirport").getString("name");
		                    String arrivalAirport = jsonResponse.getJSONObject("flightStatus")
		                            .getJSONObject("arrivalAirport").getString("name");
		                    System.out.println("Status: "+status);
		                    // Update the statusLabel with the flight status information
		                    String statusText = "Flight " + flightNumber + " departing from " + departureAirport + " to "
		                            + arrivalAirport + " on " + scheduledDepartureTime + " is " + status + ".";
		                    statusLabel.setText(statusText);

		                } catch (Exception ex) {
		                    statusLabel.setText ("Error: " + ex.getMessage());
		                }
			        }
			    });
		
		// Frame Setup
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().add(panel);
	    frame.pack();
	    frame.setSize(1000,300);
	    frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		 new FlightTrackerGUI();
	}

}

public class datatypes {
    public static void main(String[] args){
        // Data Types
        byte aSingleByte = 100; //-128 to 127
        short aSmallNumber = 20000; //-32,768 to 32,767
        int aInteger = 2147483647; //-2,147,483,648 to 2,147,483,647
        long aLargeNumber = 9223372036854775807L; //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        //Decimal Types
        double aDouble = 3.14161; //4.9E-324 to 1.8E+308
        float aFloat = 3.14161f; //1.4E-45 to 3.4E+38

        //Boolean Type
        boolean isWeekday = true;
        boolean isWorkday = false;

        //characters
        char copyrightSymbol = '\u00A9'; //unicode character
        System.out.println("The Copyright Symbol: " +copyrightSymbol);
    }
}

class Result {
    public static String dayOfProgrammer(int year) {
        String a = "12.09.";
        String b = "13.09.";
        if(year == 1918){
            return "26.09.1918";
        }
        else if(year < 1918){
            if(year % 4 == 0){
                return a+String.valueOf(year);
            }
            else return b+String.valueOf(year);
        }
        else{
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                return a+String.valueOf(year);
            }
            else return b+String.valueOf(year);
        }
    }
}
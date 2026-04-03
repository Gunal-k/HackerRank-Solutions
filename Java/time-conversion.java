class Result {
    public static String timeConversion(String s) {
        String[] arr = s.split("(?=[A-Z]{2}$)");
        String[] time = arr[0].split(":");
        int hr = Integer.parseInt(time[0]);
        String ampm = arr[1];
        if("PM".equals(ampm)){
            if(hr!=12){
                hr+= 12;
            }
        }
        else{
            if(hr==12){
                hr = 0;
            }
        }
        time[0] = String.format("%02d",hr);
        return String.join(":", time);
    }
}
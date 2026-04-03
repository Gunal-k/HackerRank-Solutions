class Result {
    public static int countingValleys(int steps, String path) {
        int count = 0, valley = 0;
        char[] arr = path.toCharArray();
        for(int i = 0; i<steps;i++){
            if(arr[i] == 'U'){
                count++;
                if(count == 0) valley++;
            }
            else {
                count--;
            }
        }
        return valley;
    }
}
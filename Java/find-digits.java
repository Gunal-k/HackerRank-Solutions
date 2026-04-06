class Result {
    public static int findDigits(int n) {
        int val = n;
        int count = 0;
        while(val > 0){
            int temp = val % 10;
            if(temp != 0 && n % temp == 0) count++;
            val = (int) val/10;
        }
        return count;
    }
}
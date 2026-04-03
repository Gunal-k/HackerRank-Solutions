class Result {
    public static int viralAdvertising(int n) {
        int val = 5;
        int sum = 0;
        for(int i=1;i<=n;i++){
            int like = (int) (val /2);
            sum += like;
            val = like * 3;
        }
        return sum;
    }
}
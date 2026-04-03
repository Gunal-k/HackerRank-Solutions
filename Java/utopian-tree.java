class Result {
    public static int utopianTree(int n) {
        int sum = 0;
        for(int i=0; i<=n;i++){
            if(i%2==0) sum += 1;
            else sum *= 2;
        }
        return sum;
    }
}
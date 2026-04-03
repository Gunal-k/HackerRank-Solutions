class Result {
    public static int beautifulDays(int i, int j, int k) {        
        int count = 0;
        for(int x=i;x<=j;x++){
            int num = x;
            int rev = 0;
            while(num>0){
                int temp = num % 10;
                num = num/10;
                rev = (rev* 10) + temp;
            }
            int val = Math.abs(rev-x);
            if(val % k == 0) count++;
        }
        return count;
    }
}
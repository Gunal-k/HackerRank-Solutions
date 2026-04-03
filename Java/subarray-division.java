class Result {
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int n = s.size();
        for(int i = 0;i<=n-m;i++){
            int sum = 0;
            for(int j = i;j<i+m;j++){
                sum += s.get(j);
            }
            if(sum == d){
                count++;
            }
        }
        return count;
    }
}
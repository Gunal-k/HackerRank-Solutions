class Result {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count = 0;
        int first = Collections.max(a);
        int last = Collections.min(b);
        for(int i=first;i<=last;i++){
            boolean div = true;
            for(Integer num : a){
                if(i%num != 0){
                    div = false;
                }
            }
            for(Integer num : b){
                if(num % i != 0){
                    div = false;
                }
            }
            if(div){
                count++;
            }
        }
        return count;
    }
}
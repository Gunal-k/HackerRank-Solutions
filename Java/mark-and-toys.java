class Result {
    public static int maximumToys(List<Integer> prices, int k) {
        Collections.sort(prices);
        int max = 0, count = 0;
        for(Integer val: prices){
            max += val;
            if(max < k){
                count ++;
            }
            else{
                break;
            }    
        }
        return count;
    }
}
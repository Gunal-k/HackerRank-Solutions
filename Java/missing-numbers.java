class Result {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(Integer num : brr){
            freq.put(num,freq.getOrDefault(num, 0)+1);
        }
        for(Integer num : arr){
            if(freq.containsKey(num)){
                freq.put(num,freq.get(num)-1);
            }
            else freq.put(num, 0);
        }
        List<Integer> ans = new ArrayList<>();
        for(Integer key: freq.keySet()){
            int value = freq.get(key);
            if( value > 0){
                ans.add(key);
            }
        }
        return ans;
    }
}
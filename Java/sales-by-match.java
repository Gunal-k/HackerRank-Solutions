class Result {
    public static int sockMerchant(int n, List<Integer> ar) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // int count = 0 ;
        // for(Integer num : ar){
        //     if(arr.contains(num)){
        //         count++;
        //         arr.remove(num);
        //     }
        //     else arr.add(num);
        // }
        // return count;
        
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(Integer num:ar){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        
        int pair = 0;
        for(Integer value: freq.values()){
            pair += value/2;
        }
        return pair;
    }
}
class Result {
    public static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer,Integer> ar = new HashMap<>();
        for(Integer num : arr){
            if(ar.containsKey(num)){
                int val = ar.getOrDefault(num,0);
                ar.put(num, val+1);
            }
            else{
                ar.put(num, 1);
            }
        }
        int mx=0;
        int ans=0;
        for(Integer key:ar.keySet()){
            int value=ar.get(key);
            if(value>mx){
                mx=value;
                ans=key;
            }
        }
        return ans;
    }
}
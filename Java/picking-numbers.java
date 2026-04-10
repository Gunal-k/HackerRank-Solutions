class Result {
    public static int pickingNumbers(List<Integer> a) {
        HashMap<Integer,Integer> arr = new HashMap<>();
        for(Integer num:a){
            arr.put(num, arr.getOrDefault(num,0)+1);
        }
        int max = 0;
        for(Integer key:arr.keySet()){
            max = Math.max(max, arr.get(key) + arr.getOrDefault(key+1,0));
        }
        return max;
    }
}
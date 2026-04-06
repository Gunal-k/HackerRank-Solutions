class Result {
    public static List<Integer> permutationEquation(List<Integer> p) {
        int n = p.size();
        HashMap<Integer,Integer> val = new HashMap<>();
        
        for(int i = 0;i< n;i++){
            val.put(p.get(i),i+1);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1;i <= n;i++){
            int ans = val.get(val.get(i));
            list.add(ans);
        }
        return list;
    }
}
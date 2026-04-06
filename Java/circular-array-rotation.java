class Result {
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> newar = a;
        List<Integer> ans = new ArrayList<>();
        
        int n = a.size();
        for(int i = 0; i<k;i++){
            int val = newar.remove(n-1);
            newar.add(0,val);
        }
        for(Integer num: queries){
            ans.add(newar.get(num));
        }
        return ans;
    }
}
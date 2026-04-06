class Result {
    public static List<Integer> jimOrders(List<List<Integer>> orders) {
        int n = orders.size();
        int[][] customers = new int[n][2];
        
        for(int i =0;i<n;i++){
            customers[i][0] = orders.get(i).get(0) + orders.get(i).get(1);
            customers[i][1] = i+1;
        }
        
        Arrays.sort(customers,(a,b) -> Integer.compare(a[0], b[0]));
        
        List<Integer> ans = new ArrayList<>();
        for(int[] c: customers){
            ans.add(c[1]);
        }
        return ans;
    }
}
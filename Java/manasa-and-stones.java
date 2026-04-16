class Result {
    public static List<Integer> stones(int n, int a, int b) {
        List<Integer> res = new ArrayList<>();
        if(a>b){
            int temp = a;
            a = b;
            b = temp;
        }
        int gap = b - a;
        int fav = a * (n-1);
        res.add(fav);
        if( gap == 0) return res;
        
        for(int i = 1;i<n;i++){
            res.add(fav + (gap * i));
        }
        return res;
    }
}
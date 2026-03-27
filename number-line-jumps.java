class Result {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        int a = x1, b = x2;
        while(a<=b){
            if(a==b){
                return "YES";
            }
            a+=v1;
            b+=v2;
        }
        return "NO";
    }   
}
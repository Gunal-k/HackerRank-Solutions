class Result {
    public static void plusMinus(List<Integer> arr) {
        int p = 0;
        int n = 0;
        int z = 0;
        int size_arr = arr.size();
        for(int i = 0; i< size_arr; i++){
            int val = arr.get(i);
            if(val>0){
                p++;
            }
            else if(val<0){
                n++;
            }
            else{
                z++;
            }
        }
        System.out.printf("%.6f%n",(float)p/(float)size_arr);
        System.out.printf("%.6f%n",(float)n/(float)size_arr);
        System.out.printf("%.6f%n",(float)z/(float)size_arr);
    }
}
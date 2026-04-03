class Result {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int count_a = 0;
        int count_b = 0;
        for(int val : apples){
            int pos = a+val;
            if(pos >= s && pos <= t){
                count_a++;
            }
        }
        for(int val : oranges){
            int pos = b+val;
            if(pos >= s && pos <= t){
                count_b++;
            }
        }
        System.out.println(count_a);
        System.out.println(count_b);
    }
}
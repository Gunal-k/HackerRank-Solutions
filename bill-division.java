class Result {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;
        for(int i =0;i<bill.size();i++){
            if(i==k) continue;
            sum += bill.get(i);
        }
        int fin_val = (sum/2);
        if(fin_val == b) System.out.println("Bon Appetit");
        else{
            int dif = Math.abs(fin_val-b);
            System.out.println(dif);
        }
    }
}
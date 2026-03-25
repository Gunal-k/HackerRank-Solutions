class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int m = arr.get(0).size();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                List<Integer> arr1 = arr.get(i);
                if(i == j){
                    sum1+= arr1.get(j);
                }
            }
        }
        System.out.println();
        //with repeating
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                List<Integer> arr1 = arr.get(i);
                if(m-i-1 == j){
                    sum2 += arr1.get(j);
                }
            }
        }
        return Math.abs(sum1 - sum2);
    }
}
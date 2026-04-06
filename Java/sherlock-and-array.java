class Result {
    public static String balancedSums(List<Integer> arr) {
        int sum = 0;
        for(Integer num : arr){
            sum += num;
        }
        int left = 0;
        for(Integer num : arr){
            if(left == (sum - left - num)){
                return "YES";
            }
            left+=num;
        }
        return "NO";
    }
}
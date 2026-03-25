class Result {
    public static void miniMaxSum(List<Integer> arr) {
        long total = 0, min = Long.MAX_VALUE, max = 0;
        for(int num : arr) {
            total += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        System.out.println((total-max) + " " + (total-min));
    }
}
class Result {
    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        int n = arr.size()/2;
        return arr.get(n);
    }
}
class Result{
    public static List<Integer> closestNumbers(List<Integer> arr) {
        Collections.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        ArrayList <Integer> ar = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            int result = arr.get(i + 1) - arr.get(i);

            if (result < min_diff) {
                ar.clear();
                min_diff = result;
            }

            if (result == min_diff) {
                ar.add(arr.get(i));
                ar.add(arr.get(i + 1));
            }
        }
        return ar;
    }
}
class Result {
    public static long aVeryBigSum(List<Long> ar) {
        Long sum = 0l;
        for (int i = 0; i < ar.size(); i++) {
            sum+= ar.get(i);
        }
        return sum;
    }
}
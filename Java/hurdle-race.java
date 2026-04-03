class Result {
    public static int hurdleRace(int k, List<Integer> height) {
        return Math.max(Collections.max(height)-k,0);
    }
}
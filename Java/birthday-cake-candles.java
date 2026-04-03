class Result {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int n = Collections.max(candles);
        return Collections.frequency(candles, n);
    }
}
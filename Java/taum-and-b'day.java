class Result {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long black = Math.min(bc, wc +z);
        long white = Math.min(wc, bc +z);
        return (long)(b*black) + (long)(w*white);
    }
}

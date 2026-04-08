class Result {
    public static int howManyGames(int p, int d, int m, int s) {
        int count = 0;
        while(s >= p){
            s -= p;
            count++;
            p -= d;
            if (p < m) p = m;
        }
        return count;
    }
}
class Result {
    public static int pageCount(int n, int p) {
        int target_flip = n/2;
        int target_flip_front = p/2;
        int target_flip_back = target_flip - target_flip_front;
        int flip = Math.min(target_flip_back,target_flip_front);
        return flip;
    }
}
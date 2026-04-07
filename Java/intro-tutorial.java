class Result {
    public static int introTutorial(int V, List<Integer> arr) {
        // return arr.indexOf(V);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == V){
                return i;
            }
        }
        return -1;
    }
}
class Result {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int max = scores.get(0), min = scores.get(0), max_count = 0, min_count = 0;
        for(int i=1;i<scores.size();i++){
            int a = scores.get(i);
            if(a>max){
                max = a;
                max_count++;
            }
            else if(a<min){
                min = a;
                min_count++;
            }
        }
        return List.of(max_count, min_count);
    }
}
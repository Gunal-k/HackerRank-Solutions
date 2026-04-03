class Result {
    public static String angryProfessor(int k, List<Integer> a) {
        int count = 0;
        for(Integer num : a){
            if(num<=0) count++;
        }
        if(count < k) return "YES";
        else return "NO";
    }
}
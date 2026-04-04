class Result {
    public static List<Integer> cutTheSticks(List<Integer> arr) {
         Collections.sort(arr);
         ArrayList<Integer> newar = new ArrayList<>();
         while(!arr.isEmpty()){
            newar.add(arr.size());
            int min = arr.get(0);
            arr.removeIf(n -> n<=min);
         }
         return newar;
    }
}
class Result { 
    public static int runningTime(List<Integer> arr) {
        int sum = 0;
        for(int i =1;i<arr.size();i++){
            int key = arr.get(i);
            int j = i-1, count = 0;
            
            while(j>=0 && arr.get(j)> key){
                arr.set(j+1, arr.get(j));
                j--;
                count++;
            }
            arr.set(j+1, key);
            sum += count;
        }
        return sum;
    }
}
class Result {
    public static void insertionSort1(int n, List<Integer> arr) {
        int key = arr.get(n-1);
        for(int i=n-2;i>-1;i--){
            if(arr.get(i) > key){
                arr.set(i+1,arr.get(i));
                printArray(arr);
            }
            else{
                arr.set(i+1,key);
                printArray(arr);
                return ;
            }
        }
        arr.set(0,key);
        printArray(arr);
    }
    
    private static void printArray(List<Integer> arr){
        for(Integer num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
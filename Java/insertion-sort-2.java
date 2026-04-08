class Result {
    public static void insertionSort2(int n, List<Integer> arr) {
        for (int i = 1; i < n; i++) {
            int key = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));  // shift right
                j--;
            }

            arr.set(j + 1, key);  // insert key

            printArray(arr);
        }
    }
    
    private static void printArray(List<Integer> arr){
        for (Integer num : arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
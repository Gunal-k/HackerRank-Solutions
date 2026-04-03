class Result {
    public static int designerPdfViewer(List<Integer> h, String word) {
        char[] arr = word.toCharArray();
        int mx = 0;
        for(char alpha : arr){
            int i = (int)alpha-97;
            mx = Math.max(h.get(i),mx);
        }
        return (arr.length * mx);
    }
}

// int mx = 0;
//         for(int i=0;i<word.length();i++){
//             int val = h.get(word.charAt(i) - 97);
//             if(val > mx){
//                 mx = val;   
//             }
//         }
//         return (word.length() * mx);
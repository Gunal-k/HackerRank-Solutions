class Result {
    public static List<String> cavityMap(List<String> grid) {
        int n = grid.size();
        List<String> result = grid;
        
        for(int i =1;i<n-1;i++){
            char[] row = grid.get(i).toCharArray();
            for (int j = 1; j < n-1; j++) {
                char curr = grid.get(i).charAt(j);
                char top = grid.get(i-1).charAt(j);
                char bottom = grid.get(i+1).charAt(j);
                char left = grid.get(i).charAt(j-1);
                char right = grid.get(i).charAt(j+1);
                if(curr > top && curr > bottom && curr > left && curr >  right){
                    row[j] = 'X';
                }
            }
            result.set(i, new String(row));
        }
        return result;
    }
}
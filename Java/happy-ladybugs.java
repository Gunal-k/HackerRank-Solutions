class Result {
    public static String happyLadybugs(String b) {
        HashMap<Character,Integer> freq = new HashMap<>();
        boolean val = b.contains("_");
        for(char a : b.toCharArray()){
            if(a != '_') freq.put(a, freq.getOrDefault(a, 0)+1);
        }
        if(!val){
            for(int i=1;i<b.length()-1;i++){
                if(b.charAt(i) != b.charAt(i-1) && b.charAt(i) != b.charAt(i+1)){
                    return "NO";
                }
            }
        }
        for(int count : freq.values()){
            if(count == 1) return "NO";
        }
        return "YES";
    }
}
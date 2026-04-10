class Result {
    public static List<Integer> acmTeam(List<String> topic) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<topic.size()-1;i++){
            for(int j=i+1;j<topic.size();j++){
                int count =0;
                char[] a = topic.get(i).toCharArray();
                char[] b = topic.get(j).toCharArray();
                for(int k=0;k<a.length;k++){
                    if(a[k] == '1' || b[k] == '1' ){
                        count++;
                    }
                }
            freq.put(count,freq.getOrDefault(count, 0)+1);
            }
        }
        int maxTopics = Collections.max(freq.keySet());
        int teams = freq.get(maxTopics);

        return List.of(maxTopics, teams);
    }
}
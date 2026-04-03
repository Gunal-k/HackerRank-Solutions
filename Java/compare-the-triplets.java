public class result{
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int n=0;
        int m=0;
        
        for(int i=0;i<a.size();i++){
            if(a.get(i)<b.get(i)){
                n++;
            }
            else if(a.get(i)>b.get(i)){
                m++;
            }
        }
        return List.of(m,n);
    }
}
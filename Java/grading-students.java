class Result {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> fingrade = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);
            if(grade >=38 && grade%5>=3){
                grade = grade + 5 - grade % 5;
            }
            fingrade.add(grade);
        }
        return fingrade;
    }
}
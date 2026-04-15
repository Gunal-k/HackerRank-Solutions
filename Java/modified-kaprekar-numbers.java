class Result {
    public static void kaprekarNumbers(int p, int q) {
        StringBuilder result = new StringBuilder();

        for (int i = p; i <= q; i++) {
            long sq = (long) i * i;
            String s = String.valueOf(sq);
            int d = String.valueOf(i).length();

            String left = (s.length() > d) ? s.substring(0, s.length() - d) : "0";
            String right = s.substring(s.length() - d);

            long leftNum = Long.parseLong(left);
            long rightNum = Long.parseLong(right);

            if (leftNum + rightNum == i) {
                result.append(i).append(" ");
            }
        }

        if (result.length() == 0) {
            System.out.println("INVALID RANGE");
        } else {
            System.out.println(result.toString().trim());
        }
    }
}
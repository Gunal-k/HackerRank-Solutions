public class Solution {
    public static void main(String[] args) {
        // no-op main method to satisfy Java entry point requirements
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int mx = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int val = keyboards[i] + drives[j];
                if (val <= b) {
                    mx = Math.max(mx, val);
                }
            }
        }
        return mx;
    }
}
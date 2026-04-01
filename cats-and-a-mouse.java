class Solution {
    static String catAndMouse(int x, int y, int z) {
        int pos_a = Math.abs(z - x);
        int pos_b = Math.abs(z - y);

        if (pos_a < pos_b)
            return "Cat A";
        else if (pos_a > pos_b)
            return "Cat B";
        else
            return "Mouse C";
    }
}
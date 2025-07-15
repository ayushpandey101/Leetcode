class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        int a = 0, b = 0;
        for (char ch : word.toCharArray()) {
            if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
                return false;
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                a = 1;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                b = 1;
            }
        }
        if (a != 1 || b != 1) {
            return false;
        }

        return true;
    }
}
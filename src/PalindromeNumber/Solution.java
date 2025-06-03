package PalindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        String numString = Integer.toString(x);
        char numChar[] = numString.toCharArray();
        int i = 0;
        int j = numChar.length - 1;

        while (i < j) {
            if (numChar[i] != numChar[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
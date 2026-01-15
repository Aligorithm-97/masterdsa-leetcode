package twopointers.leetcode125_validpalindrome;

public class ValidPalindrome {

    public boolean isPalindromeReverse(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }

    public boolean isPalindromeTwoPointers(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right){
            while(left < right && !alphaNum(s.charAt(left))){
                left++;
            }
            while(right > left && !alphaNum(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
        public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();
        System.out.println(solution.isPalindromeReverse("Was it a car or a cat I saw?"));
        System.out.println(solution.isPalindromeTwoPointers("Was it a car or a cat I saw?"));
    }
}

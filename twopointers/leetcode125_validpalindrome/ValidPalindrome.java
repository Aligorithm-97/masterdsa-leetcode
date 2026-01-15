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


    public static void main(String[] args) {

        ValidPalindrome solution = new ValidPalindrome();
        System.out.println(solution.isPalindromeReverse("Was it a car or a cat I saw?"));
    }
}

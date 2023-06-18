package jav;
public class Palindrome {
    public boolean isPalindrome(String s) {
        String letters = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] chars = letters.toCharArray();
        int tail = chars.length - 1;

        for (int head = 0; head < chars.length - 1; head++) {
            if (!(chars[head] == chars[tail])) {
                return false;
            }
            tail --;
        }

        return true;
    }



    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(s));
    }
}


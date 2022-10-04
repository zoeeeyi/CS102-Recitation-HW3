public class Palindrome {
    private static String m_inputString = "Hi Mom";

    public static void main(String[] args) {
        if (isPalindrome(m_inputString)) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("It's not a palindrome!");
        }
    }

    private static boolean isPalindrome(String _s){
        if (_s.length() <= 1){
            return true;
        } else if (_s.charAt(0) == _s.charAt(_s.length() - 1)){
            _s = _s.substring(1, _s.length() - 1);
            return isPalindrome(_s);
        } else {
            return false;
        }
    }
}

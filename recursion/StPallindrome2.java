package recursion;

public class StPallindrome2 {

    static boolean isPalindrome(String s, int l, int r) {
       
        if (l >= r) {
            return true;
        }
        
        if (s.charAt(l) != s.charAt(r)) {
            return false;
        }
      
        return isPalindrome(s, l + 1, r - 1);
    }

    public static void main(String[] args) {
        String str = "racecar"; 
        boolean result = isPalindrome(str, 0, str.length() - 1); 
        System.out.println(result); 
    }
}

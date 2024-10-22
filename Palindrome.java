class Palindrome {
    public boolean isPalindrome(int x) {
        return ispalindrome(x); 
    }

    static boolean ispalindrome(int x) {
        int temp = x;
        int rv = 0;
        while(x > 0) {
            int digit = x % 10;
            rev = (rev * 10) + digit;
            x = x / 10;   
        }
         if(rv == temp)
         {
            return true;
         }
         return false;
    }

    public static void main(String[] args) {
           Palindrome sol = new Palindrome();
        System.out.println(sol.isPalindrome(121)); 
    }
}

public class PalindromeNumber {
    public static boolean isPalindrome(int x){
        if (x<0||x%10==0 &&x!=0){
            return false;
        }
        int r=0,copy=x;
        while(copy>0){
            int digit=copy%10;
            r=r*10+digit;
            copy=copy/10;
        }
        return r==x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
}

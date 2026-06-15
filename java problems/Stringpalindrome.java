public class Stringpalindrome {
    public static void main(String[] args) {
        String s="ppopp";
        String original=palindrome(s);
        //System.out.println("Original: '" + s + "'");
        //System.out.println("Reversed: '" + original + "'");
        if(s.equals(original)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    static String palindrome(String s){
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse += s.charAt(i);

        }
        return reverse;
    }
}

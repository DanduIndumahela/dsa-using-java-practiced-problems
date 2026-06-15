public class Stringreverse {
    public static void main(String[] args) {
        String s="indu";
        reverse(s);
    }
    static void reverse(String s){
        int n=s.length()-1;
        for(int i=n;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}

public class Pattern5 {
    public static void main(String[] args) {
    pattern(4);
    }
    static void pattern(int n){
        for(int i=0;i<2*n;i++){
            int total=i>n ? 2*n-i : i;
            for(int j=0;j<total;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

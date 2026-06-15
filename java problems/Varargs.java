public class Varargs {
    public static void main(String[] args) {
        fun(1,2,3,4); 
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    
}
static void multiple(int a,int b, String ....v){
    
}

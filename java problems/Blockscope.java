import javax.sql.rowset.spi.SyncResolver;

public class Blockscope {
    public static void main(String args[]){
        int a=10;
        int b=20;
        System.out.println(a);
        {
            a=999999;
            System.out.println(a);
            int c=99;
        }
        System.out.println(a);
        }
    static void random(int marks){
        int num=88;
        System.out.println(num);
        System.out.println(marks);
    }
    //System.out.println(a);
}

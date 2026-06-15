public class Ifelse {
        public static void main(String args[])
    
        {
            int sal=0;
            if(sal>800){
                System.out.println("hi");
                sal=sal+200;
            }else if (sal<800) { 
                System.out.println("hello");
                sal=sal+100;
            }
            else{
                sal=sal+12;

            }
            System.out.println(sal);
        }  
}

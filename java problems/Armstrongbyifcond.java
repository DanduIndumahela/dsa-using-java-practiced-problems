public class Armstrongbyifcond {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            int num=i;
            int sum=0;
            while(num>0){
                int rem=num%10;
                num=num/10;
                sum=sum+rem*rem*rem;
                //System.out.println(i);
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    } 
}

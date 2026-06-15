public class Perimeterofcircle {
    public static void main(String[] args) {
        double r=9.0;
        double ans=perimeter(r);
        System.out.println(ans);
        
    }
    static double perimeter(double r){
        return 2*Math.PI*r;
    }
    
}

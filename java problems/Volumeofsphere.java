public class Volumeofsphere {
    public static void main(String[] args) {
        double radius=9;
        System.out.println(volume(radius));
        
    }
    static double volume(double radius){
        return 4.0/3*Math.PI*Math.pow(radius,3);
    }
    
}

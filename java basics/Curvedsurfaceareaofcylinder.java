public class Curvedsurfaceareaofcylinder {
    public static void main(String[] args) {
        double radius=9.0;
        double height=8.0;
        double ans=volume(radius,height);
        System.out.println(ans);  
    }//2*pi*radius*height
    static double volume(double radius,double height){
        return 2*Math.PI*radius*height;
    }

    
}

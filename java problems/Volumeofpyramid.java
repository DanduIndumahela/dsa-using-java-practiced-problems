public class Volumeofpyramid {
    public static void main(String[] args) {
        double basearea=9.0;
        double height=8.0;
        double ans=volume(basearea,height);
        System.out.println(ans);  
    }
    static double volume(double basearea,double height){
        return 1.0/3*basearea*height;
    }

    
}

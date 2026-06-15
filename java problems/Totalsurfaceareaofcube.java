public class Totalsurfaceareaofcube {
    public static void main(String[] args) {
        double onesideofcube=9.0;
        double ans=volume(onesideofcube);
        System.out.println(ans);  
    }
    static double volume(double onesideofcube){
        return 6*onesideofcube*onesideofcube;
    }    
}

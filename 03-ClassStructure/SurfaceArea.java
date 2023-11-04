public class SurfaceArea {
    static float rectangle(float a, float b){
        return a*b;
    }
    static double circle(double r){
        double pi = 3.14;
        double a = r*r*pi;        
        return a;
    }
     static float triangle(float height,float base){
        float a = height*base;
        a = a/2;
        return a;
    }
    public static void main(String[] args) {
        
        System.out.println(circle(3));
        System.out.println(triangle(4,3));
    }
}



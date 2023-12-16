public class Circle extends Shape {
    private double r;


    public Circle(double r) {
        this.r = r;
    }


    @Override
    public double area(){
        return r*r*Math.PI;      
        
    
}
        @Override
    public double perimeter(){
        return 2*r*Math.PI;
    }
}

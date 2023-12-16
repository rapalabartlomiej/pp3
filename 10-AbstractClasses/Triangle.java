public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;


   
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }



    @Override
    public double area(){
       double p = (a+b+c)/2;
       double wynik = p*(p-a)*(p-b)*(p-c);
        wynik = Math.sqrt(wynik);
        return wynik;

    }
    @Override
    public double perimeter(){
        return a+b+c;
    }
    
}

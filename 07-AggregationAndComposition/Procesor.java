public class Procesor{
    private String brand;
    private int cores;
    private int threads;


    Procesor(String brand, int cores, int threads){
        this.brand = brand;
        this.cores = cores;
        this.threads = threads;
    }

    public int sum(int a,int b){
        return a+b;
    }
    public void compute(){
        System.out.println("obiliczam");

    }
    public void terminate(){
        System.out.println("tekst");

    }
    public static void main(String[] args) {
    Procesor p = new Procesor("intel",1,1);
    }
    
}
public class Computer {
    private int storage;
    private String brand;
    private String operatingSystem;
    private boolean isOn;
    private Procesor procesor;
   

    Computer(boolean isOn,String operatingSystem, String brand,int storage){
        this.isOn = isOn;
        this.operatingSystem = operatingSystem;
        this.brand = brand;
        this.storage = storage;
        this.procesor = new Procesor("amd",12,24);

    }


    public void switchOnOff(){
        if(this.isOn){
            isOn = false;
        }else{
            isOn = true;
        }
    }

    public void runProgram(){
        System.out.println("running program");

    }
    public void openfile(){
        System.out.println("otwieram plik");
    }
    public void openBrowser(){
        System.out.println("otwieram chrome");
    }
    
    public static void main(String[] args){
        Computer pc = new Computer(true,"win","dell",12);
        pc.openfile();
        int z = pc.procesor.sum(1,2);
        System.out.println(z);
    }
    


}

public class Pisarz {
    private String name;
    private int age;
    private Ksiazka ksiazka;

    public Pisarz(String name,int age){
        this.name = name;
        this.age = age;
        Ksiazka ksiazka = new Ksiazka("name", "autor", 50, 1);
    }

    public static void main(String[] args){
        Pisarz p = new Pisarz("nameee", 31);
        p.ksiazka.show();

    }

    
}

public class StudentTest {    
    public static void main(String[] args) {
        
        // object creation
        Student s = new Student();
        Student s1 = new Student();
        Student s2 = new Student();
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        System.out.println(s.name + " " + s.age);

        s1.name = "Andrew";
        s1.age = 54;
        System.out.println(s1.name + " " + s.age);

        s2.name = "John";
        s2.age = 31;
        System.out.println(s2.name + " " + s.age);

       

    }

}

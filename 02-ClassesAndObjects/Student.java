public class Student{
    public String name;
    public int age;
    public int idCard;
    public boolean idCorrect;
    public int semester;
    public float averageGrade;
    


    void sayHello(){
        System.out.println("hello from " + name);

    }
     void displayName(){
        System.out.println("my name is " + name);

    }
     void displayAge(){
        System.out.println("my age " + age);

    }

    void displayTree(){
         System.out.println(name + " " + semester + " " + averageGrade);    
    }
    void changeStatus(){
        if(idCorrect == true){idCorrect = false;}
        else{idCorrect = true;}
    }
    void displayTwo(){
        String status = idCorrect == true ? "valid" : "invalid";
        System.out.println(name + " " + idCard + " " + idCorrect);    
    }





}




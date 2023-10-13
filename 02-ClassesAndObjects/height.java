public class height {

    public static void main(String[] args) {
        int heigthSize = 170;
        float feet = heigthSize * 0.032808f;
        int feetRound = Math.round(feet);
        float inches = (feet - feetRound)* 12;
        int inchRound = Math.round(inches);

        System.out.println(heigthSize + " " + feetRound + "" + inchRound);
  


        
       
    }
    

}


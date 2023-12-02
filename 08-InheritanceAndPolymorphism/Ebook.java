public class Ebook extends Book{
    private String fileName;
    
    public Ebook(String author,String title,String fileName){
        super(author,title);
        this.fileName = fileName;
    }
    

     public String getFileName() {
        return fileName;
    }
    public void display(){
        System.out.println(getAuthor());
    }
    


    public static void main(String[] args) {
        Ebook b = new Ebook("jan","od jana", "c;d;a;a");
        b.display();
        
    }
    
}

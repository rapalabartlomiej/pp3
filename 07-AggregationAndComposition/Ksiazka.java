public class Ksiazka {
    private String name;
    private String autor;
    private int pageCount;
    private int currentPage;


    public Ksiazka(String name,String autor,int pageCount,int currentPage){
        this.name = name;
        this.autor = autor;
        this.pageCount = pageCount;
        this.currentPage = currentPage;
    }
    public void nextpage(){
        currentPage++;
    }
    public void previousPage(){
        currentPage--;
    }
    public void show(){
        System.out.println(currentPage);
    }
}

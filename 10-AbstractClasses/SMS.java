public class SMS extends Message {
    private int phoneNumber;

    public SMS(int phoneNumber){
        super();
        this.phoneNumber = phoneNumber
    }
    public SMS(int phoneNumber,String a){
        super(a);
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void send() {
        
        
    }
    
    
}

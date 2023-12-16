public abstract class Message {
    String text;

    public Message(){
        text = "";
    }
    public Message(String a){
        this.text = a;
    }

    public String getText() {
        return text;
    }

    public  void setText(String text) {
        this.text = text;
    }
    public int charNumber(){
        return text.length();
    }
    public abstract void send();

    
}

public class Message {
    private String msg;
    public Message(String msg) {
        this.msg = msg;
    }
    public Message updateMessage(String msg) {
        this.msg = msg;
        return this;
    }
    public void displayMessage() {
        System.out.println("Message: " + this.msg);
    }
}

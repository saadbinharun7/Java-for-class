
public class Main {
    public static void main(String[] args) {
        Box myBox = new Box(5, 3, 2);
        Box myClone = new Box(myBox);


    System.out.println("Box Volume: " + myBox.volume());
    System.out.println("Clone Volume: " + myClone.volume());
    }

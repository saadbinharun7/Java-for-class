class MyClass {
    private int a = 0;
    MyClass(){
        System.out.println("No Argument Constructor");
    }
    MyClass(int newA){
        System.out.println("Constuctor with Argument");
        a = newA;
    }
    public void show(){
        System.out.println(a);
    }
}

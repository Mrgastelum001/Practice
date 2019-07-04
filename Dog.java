public class Dog extends Animal{

    String tail;
    public Dog(String name, String wieght, String size, String tail) {
        super(name, wieght, size);
        this.tail = tail;
    }
    void tail(){
        System.out.println("Your dogs tail is "+ tail + ".");
    }
    void sound(){
        System.out.println("Ruff Ruff");
    }

}
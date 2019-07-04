public class Health extends Dog{

    String health;

    public Health(String name, String wieght, String size, String tail, String health) {
        super(name, wieght, size, tail);
        this.health = health;
    }

    void status(){
        System.out.println("Your dogs health status is "+ health + ".");
    }
}
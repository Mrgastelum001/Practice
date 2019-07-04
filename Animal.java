
public class Animal{
    String name;
    String wieght;
    String size;

    Animal(String name, String wieght, String size){
        this.name = name;
        this.wieght = wieght;
        this.size = size;
    }

    void details(){
        System.out.println("Animal name is "+ name + " wieght is "+ wieght + " size is "+ size +".");
    }

}


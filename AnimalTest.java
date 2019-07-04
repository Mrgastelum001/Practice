class AnimalTest{

    public static void main(String args[]){
        Animal Fluffy = new Animal("Fluffy","135 pounds","Medium");
        Dog Maxy = new Dog("Maxy", "25 kilograms", "medium", "short");
        Health Archie = new Health("Archie", "120 pounds", "medium", "fluffy and short", "in fantastic health");
        Fluffy.details();

        Maxy.details();
        Maxy.tail();
        Maxy.sound();

        Archie.status();
    }
}   
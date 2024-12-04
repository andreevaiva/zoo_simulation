public class Main {
    public static void main(String[] args) {

        Habitat Tropical = new Habitat("tropical", 300.50, 28.5);
        Habitat Native = new Habitat("native", 300.50, 21.25);
        Habitat Arctic = new Habitat("arctic", 300.50, 5.3);

        Zoo zoo = new Zoo();

        //composition
        zoo.addAnimal1("Max", "monkey", 3, "tropical", 300.50, 28.5);
        zoo.addAnimal2("Simba", "lion", 4, "native", 300.50, 21.25);
        zoo.addAnimal3("Richard", "rhino", 5, "tropical", 300.50, 28.5);
        zoo.addAnimal4("Pedro", "polarBear", 6, "arctic", 300.50, 5.3);

        Staff employee1 = new Staff("Mark", "cleaner");
        Staff employee2 = new Staff("John", "feeder");
        Staff employee3 = new Staff("Peter", "closer");

        employee1.assignStaff(Tropical);
        employee2.assignStaff(Native);
        employee3.assignStaff(Arctic);

    }
}
class Animal{
    String name;
    String species;
    int age;
    Habitat habitat;

    public Animal(String name, String species, int age, String type, double size, double temperature) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.habitat = new Habitat(type, size, temperature);    //composition
    }
}

class Habitat{
    String type;
    double size;
    double temperature;

    public Habitat(String type, double size, double temperature) {
        this.type = type;
        this.size = size;
        this.temperature = temperature;
    }
}

class Zoo{
    private Animal a1;
    private Animal a2;
    private Animal a3;
    private Animal a4;

    //association
    void addAnimal1(String name, String species, int age, String type, double size, double temperature) {
        a1 = new Animal( name,  species,  age,  type,  size,  temperature);
    }
    void addAnimal2(String name, String species, int age, String type, double size, double temperature) {
        a2 = new Animal( name,  species,  age,  type,  size,  temperature);
    }
    void addAnimal3(String name, String species, int age, String type, double size, double temperature) {
        a3 = new Animal( name,  species,  age,  type,  size,  temperature);
    }
    void addAnimal4(String name, String species, int age, String type, double size, double temperature) {
        a4 = new Animal( name,  species,  age,  type,  size,  temperature);
    }
}

class Staff{
    String name;
    String role;
    String assignedHabitat;

    public Staff(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void assignStaff(Habitat habitat){
        assignedHabitat = habitat.type;     //association
    }
}

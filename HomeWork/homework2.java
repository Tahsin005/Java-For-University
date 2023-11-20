package HomeWork;
class Dog{
    String name;
    String breed;

    Dog(String name,String breed){
        this.name = name;
        this.breed = breed;
    }
    public void setter(String newName,String newBreed){
        name = newName;
        breed = newBreed;
    }

}
public class homework2 {
    public static void main(String[] args) {
        Dog d = new Dog("Sven", "Scotish");
        System.out.println("Name before modifying : " + d.name);
        System.out.println("Breed before modifying : " + d.breed);
        
        // Setting new name and breed using setter
        d.setter("Bear", "German Shepherd");
        System.out.println("Name after modifying : " + d.name);
        System.out.println("Breed after modifying : " + d.breed);
    }
}

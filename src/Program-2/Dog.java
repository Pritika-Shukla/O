//Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog"
// class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
public class Dog {
    String breed;
    String name;
  public Dog(String breed,String name){
      this.breed=breed;

      this.name=name;
  }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed=breed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public static void main(String[] args) {
        Dog d1=new Dog("Husky","Evan");
        Dog d2=new Dog("Shepherd","Ross");
        System.out.println(d1.getName()+" is a "+ d1.getBreed());
        System.out.println(d2.getName()+" is a "+ d2.getBreed());
        System.out.println("\nSet the new Breed of dog1 and new name of dog2:");
        d1.setBreed("Labrador Retriever");
        d2.setName("Daisy");
        System.out.println(d1.getName() + " is now a " + d1.getBreed() + ".");
        System.out.println(d2.getName() + " is now a " + d2.getBreed() + ".");

    }
}

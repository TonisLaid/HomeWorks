package AmirEric0613.dogAndPocket;

public class Main {
    public static void main(String[] args) {
    // Create an object of class Dog. Verify if everything works as expected
    Dog dog1 = new Dog("Fluffy", 12, "female", "white", 10);
    Dog dog = new Dog(dog1);
        System.out.println(dog);
        System.out.println(dog1);

    // Pocket exercise
    Pocket pocket = new Pocket();
    System.out.println(pocket.getMoney(5));
    pocket.setMoney(3333);
    }
}

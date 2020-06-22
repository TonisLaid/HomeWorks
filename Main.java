package AmirEric0613.dogAndMuzzle;

public class Main {
    //b) Assign the created object to a Dog object
    //c) How to use a Dog object to show all attributes of a Muzzle object
    public static void main(String[] args) {
        Dog dog = new Dog("Labrador", 12);
        Muzzle muzzle = new Muzzle("angry", 15);
        muzzle.setCharacter("Angry");
        dog.setMuzzle(muzzle);

        System.out.println(dog.getMuzzle());
        System.out.println(dog.getMuzzle().getCharacter());
        System.out.println(dog.getMuzzle().getLenghtOfTale());
    }
}

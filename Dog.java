package AmirEric0613.dogAndCat;

public class Dog extends Animal {

    public Dog (){
        super("Lotte", "Taufa", "Roosi", "Auh-auh", "Gaf-gaf", "Wow-wow");
    }
    public void yieldVoice() {
        System.out.println(getAnimal1() + " makes sound " + getNoice1());
        System.out.println(getAnimal2() + " makes sound " + getNoice2());
        System.out.println(getAnimal3() + " makes sound " + getNoice3());
    }
}

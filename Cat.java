package AmirEric0613.dogAndCat;

class Cat extends Animal {

    public Cat (){
        super("Kiisu", "Miisu", "Liisu", "Miu-miu", "Mäu-mäu", "Näu-näu");
    }

    public void yieldVoice() {
        System.out.println(getAnimal1() + " makes sound " + getNoice1());
        System.out.println(getAnimal2() + " makes sound " + getNoice2());
        System.out.println(getAnimal3() + " makes sound " + getNoice3());
    }
}

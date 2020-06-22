package AmirEric0613.dogAndCat;

// a) Move common methods and fields to the class Animal
// b) Create method yieldVoice

// 1. Change Animal class to be abstract. Which methods should may be abstract.
public abstract class Animal {
    private String animal1;
    private String animal2;
    private String animal3;

    private String noice1;
    private String noice2;
    private String noice3;

    public Animal(String animal1, String animal2, String animal3, String noice1, String noice2, String noice3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
        this.noice1 = noice1;
        this.noice2 = noice2;
        this.noice3 = noice3;
    }

    public String getAnimal1() {
        return animal1;
    }

    public String getAnimal2() {
        return animal2;
    }

    public String getAnimal3() {
        return animal3;
    }

    public String getNoice1() {
        return noice1;
    }

    public String getNoice2() {
        return noice2;
    }

    public String getNoice3() {
        return noice3;
    }

    public void setAnimal1(String animal1) {
        this.animal1 = animal1;
    }

    public void setAnimal2(String animal2) {
        this.animal2 = animal2;
    }

    public void setAnimal3(String animal3) {
        this.animal3 = animal3;
    }

    public void setNoice1(String noice1) {
        this.noice1 = noice1;
    }

    public void setNoice2(String noice2) {
        this.noice2 = noice2;
    }

    public void setNoice3(String noice3) {
        this.noice3 = noice3;
    }

    public abstract void yieldVoice();
}

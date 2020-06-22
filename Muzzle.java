package AmirEric0613.dogAndMuzzle;

// 1. Create a Muzzle class
public class Muzzle {

    private String character;
    private Integer lenghtOfTale;

    public Muzzle(String character, Integer lenghtOfTale) {
        this.character = character;
        this.lenghtOfTale = lenghtOfTale;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public Integer getLenghtOfTale() {
        return lenghtOfTale;
    }

    public void setMuzzleAttribute2(Integer lenghtOfTale) {
        this.lenghtOfTale = lenghtOfTale;
    }

    @Override
    public String toString() {
        return "Muzzle character is = " + getCharacter() + "Muzzle length of tale is = " + getLenghtOfTale();
    }

}

package AmirEric0613.dogAndMuzzle;

public class Dog {
    // a) Create a Muzzle object
    private Muzzle muzzle;
    private String breed;
    private Integer age;

    public Dog(String breed, Integer age) {
        this.breed = breed;
        this.age = age;
    }

    public Muzzle getMuzzle() {
        return muzzle;
    }

    public void setMuzzle(Muzzle muzzle) {
        this.muzzle = muzzle;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString()  {
        return "Dog{" +
                "breed ='" + breed + '\'' +
                ", age ='" + age + '\'' +
                '}';
    }



}

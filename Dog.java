package AmirEric0613.dogAndPocket;

// Add private fields to the class , like name , age , gender , race, weigth
public class Dog {
    private String name;
    private Integer age;
    private String gender;
    private String race;
    private Integer weight;

    public Dog(){

    }

    // Create constructor that accepts all of the class fields
    public Dog(String name, int age, String gender, String race, int weight) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    // Create additional constructor , that will accept only gender and race. It should call main
    //constructor with default values
    public Dog(Dog dog) {
      gender = dog.gender;
      race = dog.race;
    }

    // Create getters and setters for age and weigth
    public Integer getAge() {
        return age;
    }

        // Add verification for all arguments passed to the setters . E.g . setWeigth method should
        //not accept values below or equal to 0.
    public void setAge(Integer age) {
        if(age>=0 && age< 20){
        this.age = age;}
        System.out.println("Wrong age");
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        if(weight>=0){
            this.weight = weight;}
        System.out.println("Wrong weight");
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }
}

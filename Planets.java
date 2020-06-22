package AmirEric0613.enumPlanets;

//1. Create enum Planets
// a) Override toString method . It should print relative size of a planet and it’s name.
//      E.g . Huge Jupiter”, „Small Pluto”.
// b) Create distanceFromEarth method
// c) Verify both methods for multiple planets
public enum Planets {

        MERCURY(2_439.7, "Small Mercury"),
        VENUS(6_051.8, "Small Venus"),
        EARTH(6_371, "Small Earth"),
        MARS(3_389.5, "Small Mars"),
        JUPITER(69_911, "Huge Jupiter"),
        SATURN(58_232, "Huge Saturn"),
        URANUS(25_362, "Big Uranus"),
        NEPTUNE(24_622, "Big Neptune");

        double doubleValue;
        String appearance;
        Planets(double doubleValue, String appearance){
            this.doubleValue = doubleValue;
            this.appearance = appearance;
        }

    double getValue(){
        return doubleValue;
    }

    String getAppearance(){
            return appearance;
    }

    public static void distanceFromEarth(Planets planet){
    switch (planet){
        case MERCURY:
            System.out.println("Distance from earth is: 91,691 thousand km");
            break;
        case VENUS:
            System.out.println("Distance from earth is: 41,400 thousand km");
            break;
        case EARTH:
            System.out.println("Distance from earth is: 0 km");
            break;
        case MARS:
            System.out.println("Distance from earth is: 78,340 thousand km");
            break;
        case JUPITER:
            System.out.println("Distance from earth is: 628,730 thousand km");
            break;
        case SATURN:
            System.out.println("Distance from earth is: 1,275,000 thousand km");
            break;
        case URANUS:
            System.out.println("Distance from earth is: 2,723,950 thousand km");
            break;
        case NEPTUNE:
            System.out.println("Distance from earth is: 4,351,400 thousand km");
            break;
    }
    }

    @Override
    public String toString(){
        return "Radius of the planet is '" + doubleValue + '\'' +
                ", Appearance is '" + appearance + '\'' +
                '}';
    }

}

package AmirEric0613.enumPlanets;

public class Main {
    public static void main(String[] args) {

        for (Planets planets : Planets.values()){
            System.out.println(planets);
        }

        System.out.println("About Mercury: " + Planets.MERCURY);

        Planets.distanceFromEarth(Planets.EARTH);
    }
}

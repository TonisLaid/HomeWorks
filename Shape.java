package AmirEric0613.inheritance;
// b) Create classes Rectangle and Circle . Both of them should inherit class Shape .

// 1. Change Shape class to be abstract. Which methods should may be abstract?
// 2. Add getPerimeter and getArea methods declaration to the Shape abstract class.
// Implement and verify those methods for both Circle and Rectangle classes


abstract class Shape {
    // a) Add fields , create constructor , getters and setters
    private Integer perimeter;
    private Integer area;

    public Shape(Integer perimeter, Integer area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public abstract Integer getPerimeter();

    public void setPerimeter(Integer perimeter) {
        this.perimeter = perimeter;
    }

    public abstract Integer getArea();

    public void setArea(Integer area) {
        this.area = area;
    }
}

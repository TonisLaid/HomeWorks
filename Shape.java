package AmirEric0613.inheritance;
// b) Create classes Rectangle and Circle . Both of them should inherit class Shape .

// 1. Change Shape class to be abstract. Which methods should may be abstract?
/** Didn't find any method that could be turned into abstract */

abstract class Shape {
    // a) Add fields , create constructor , getters and setters
    private Integer perimeter;
    private Integer area;

    public Shape(Integer perimeter, Integer area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public Integer getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Integer perimeter) {
        this.perimeter = perimeter;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }
}

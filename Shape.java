package AmirEric0613.inheritance;
// b) Create classes Rectangle and Circle . Both of them should inherit class Shape .

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

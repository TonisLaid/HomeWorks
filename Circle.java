package AmirEric0613.inheritance;

public class Circle extends Shape {
    private Integer radius;

    @Override
    public Integer getPerimeter() {
        return null;
    }

    @Override
    public Integer getArea() {
        return null;
    }

    public enum values {
        PI,
    }
    public Circle(Integer perimeter, Integer area, Integer radius) {
        super(perimeter, area); // Which fields and methods are common?
                                /** Those inside the super! */
        this.radius = radius;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

/*    @ Override
    public String toString (){
        return "Fields values : Perimeter =" + getPerimeter();}*/

    @Override
    public String toString() {
        return "Circle{" +
                "Perimeter ='" + getPerimeter() + '\'' +
                ", Area =" + getArea() +
                ", Radius ='" + getRadius() + '\'' +
                '}';
    }
}
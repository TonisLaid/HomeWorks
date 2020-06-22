package AmirEric0613.inheritance;

public class Rectangle extends Shape {

    private Integer sideA;
    private Integer sideB;

    public Rectangle(Integer perimeter, Integer area, Integer sideA, Integer sideB) {
        super(perimeter, area); // Which fields and methods are common? inside the super!
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Integer getSideA() {
        return sideA;
    }

    public void setSideA(Integer sideA) {
        this.sideA = sideA;
    }

    public Integer getSideB() {
        return sideB;
    }

    public void setSideB(Integer sideB) {
        this.sideB = sideB;
    }

/*    @Override
    public String toString() {
        return super.toString()
                + "perimeter = " + getPerimeter() + ", area = " + getArea() +
                ", Side A = " + getSideA() + ", SideB = " + getSideB();}*/

    @Override
    public String toString() {
        return "Rectangle{" +
                "Perimeter='" + getPerimeter() + '\'' +
                ", Area=" + getArea() +
                ", SideA='" + getSideA() + '\'' +
                ", SideB='" + getSideB() + '\'' +
                '}';
    }
}

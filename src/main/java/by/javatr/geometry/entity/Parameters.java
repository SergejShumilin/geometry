package by.javatr.geometry.entity;

public class Parameters {
    private int area;
    private int perimeter;

    public Parameters(int area, int perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parameters{");
        sb.append("area=").append(area);
        sb.append(", perimeter=").append(perimeter);
        sb.append('}');
        return sb.toString();
    }
}

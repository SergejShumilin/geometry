package by.javatr.geometry.entity;

import by.javatr.geometry.observer.Observer;

public class Quadrangle {
    private long id;
    private Point first;
    private Point second;
    private Point third;
    private Point fourth;
    private Observer observer;
    private static long idCounter = 0;

    public Quadrangle(Point first, Point second, Point third, Point fourth) {
        this.id = ++idCounter;
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public long getId() {
        return id;
    }

    public void setFirst(Point first) {
        this.first = first;
        notifyObserver();
    }

    public void setSecond(Point second) {
        this.second = second;
        notifyObserver();
    }

    public void setThird(Point third) {
        this.third = third;
        notifyObserver();
    }

    public void setFourth(Point fourth) {
        this.fourth = fourth;
        notifyObserver();
    }

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    private void notifyObserver() {
        if (observer!=null){
            observer.update(this);
        }
    }

    public Point getFirst() {
        return first;
    }

    public Point getSecond() {
        return second;
    }

    public Point getThird() {
        return third;
    }

    public Point getFourth() {
        return fourth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        Quadrangle that = (Quadrangle) o;

        if (first != null ? !first.equals(that.first) : that.first != null){
            return false;
        }
        if (second != null ? !second.equals(that.second) : that.second != null){
            return false;
        }
        if (third != null ? !third.equals(that.third) : that.third != null){
            return false;
        }
        return fourth != null ? fourth.equals(that.fourth) : that.fourth == null;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (third != null ? third.hashCode() : 0);
        result = 31 * result + (fourth != null ? fourth.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Quadrangle{");
        sb.append("first=").append(first);
        sb.append(", second=").append(second);
        sb.append(", third=").append(third);
        sb.append(", fourth=").append(fourth);
        sb.append('}');
        return sb.toString();
    }
}

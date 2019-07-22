package by.javatr.geometry.entity;

import by.javatr.geometry.observer.Observer;

import java.util.concurrent.atomic.AtomicLong;

public class QuadrangleCopy {
    private long id;
    private Point first;
    private Point second;
    private Point third;
    private Point fourth;
    public Observer observer;
    private AtomicLong idGeneration = new AtomicLong(0);

    public QuadrangleCopy(Point first, Point second, Point third, Point fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public QuadrangleCopy(long id, Point first, Point second, Point third, Point fourth) {
        this.id = id;
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return idGeneration.incrementAndGet();
    }

    public void setFirst(Point first) {
        this.first = first;
        notifyObserver();
    }

    private void notifyObserver() {
        if (observer != null) {
            observer.update(new Quadrangle(first, second, third, fourth));
        }
    }

    public void setSecond(Point second) {
        this.second = second;
    }

    public void setThird(Point third) {
        this.third = third;
    }

    public void setFourth(Point fourth) {
        this.fourth = fourth;
    }
}

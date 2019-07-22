package by.javatr.geometry.entity;

import by.javatr.geometry.observer.Observer;

import java.util.concurrent.atomic.AtomicLong;

public class QuadrangleCopy extends Quadrangle {
    private long id;
    public Observer observer;
    private AtomicLong idGeneration;

    public QuadrangleCopy(Point first, Point second, Point third, Point fourth, int id, Observer observer) {
        super(first, second, third, fourth);
        this.id = id;
        this.observer = observer;
    }

    public long getId() {
       return idGeneration.incrementAndGet();

    }

    public void setId(int id) {
        this.id = id;
    }


}

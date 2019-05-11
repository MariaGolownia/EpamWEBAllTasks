package by.javatr.rep;

import by.javatr.entity.Plane;

public interface PlaneSpecification<T> {
    boolean specified(Plane plane);
}

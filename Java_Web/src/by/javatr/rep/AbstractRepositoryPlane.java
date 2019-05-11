package by.javatr.rep;
import by.javatr.entity.Plane;

import java.util.List;

public interface AbstractRepositoryPlane <T extends Plane> {

    void addPlane(T plane);
    void removePlane(T plane);
    void updatePlane(T plane);
    List<T> query(PlaneSpecification specification);
}

package by.javatr.entity;

import java.util.Comparator;

public interface PlaneDao {
    public void addPlane(Plane plane);
    public void addAllPlanes(Plane... plane);
    public void removePlane(Plane plane);
    public Plane get(int id);
    public int size();
    public void sort();
    public void sort(Comparator<Plane> c);
    //public List<Plane> searchByTag(TagContains tagContains, Object tagValue)
}

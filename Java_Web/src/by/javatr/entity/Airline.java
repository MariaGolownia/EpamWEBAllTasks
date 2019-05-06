package by.javatr.entity;

import by.javatr.reader.ReaderPlanes;
import by.javatr.util.AbstractCheckByTagForSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Airline {
    List<Plane> listOfPlanes = new ArrayList<>();

    public void addPlane(Plane plane) {
        listOfPlanes.add(plane);
    }

    public void addPlanes(Plane... plane) {
        for (int i = 1; i < plane.length; i++) {
            listOfPlanes.add(plane[i]);
        }
    }

    public void addPlanes(String repository) {
        ReaderPlanes readerPlanes = new ReaderPlanes();
        List<Plane> listOfPlanesTemp = readerPlanes.readearPlanesFromFile(repository);
        if (listOfPlanes.size() == 0) {
            listOfPlanes = listOfPlanesTemp;
        } else {
            listOfPlanes.addAll(listOfPlanesTemp);
        }
    }

    public Plane getPlaneByIndex(int index) {
        return listOfPlanes.get(index);
    }

    public Integer getCountOfPlanes() {
        return listOfPlanes.size();
    }

    public class Search {

        public List<Plane> searchByTag(AbstractCheckByTagForSearch checkByTag, Object tagValue) {
            List<Plane> rezList = new ArrayList<>();
            for (Plane planeItem : listOfPlanes) {
                if (checkByTag.ifContainsTag(planeItem, tagValue)) {
                    rezList.add(planeItem);
                }
            }
            return rezList;
        }


        public List<Plane> searchByTagInRange(AbstractCheckByTagForSearch checkByTag, Object tagValue1, Object tagValue2) {
            List<Plane> rezList = new ArrayList<>();
            for (Plane planeItem : listOfPlanes) {
                if (checkByTag.ifContainsTag(planeItem, tagValue1, tagValue2)) {
                    rezList.add(planeItem);
                }
            }
            return rezList;
        }


    }

    public void sort(Comparator<Plane> c) {listOfPlanes.sort(c);
    }

    public void sort() {
        Collections.sort(listOfPlanes);
    }
}

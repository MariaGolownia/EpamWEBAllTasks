package by.javatr.util;

import by.javatr.entity.Plane;

import java.util.Comparator;

public class PlaneComparatorForSort {

    public static class ByModelComparator implements Comparator<Plane> {
        public int compare(Plane plane1, Plane plane2) {
            int result = (plane1.getModelOfPlane().toString()).compareTo(plane2.getManufacturingCompany().toString());
            return result;
        }
    }

    public static class ByTypeComparator implements Comparator<Plane> {
        public int compare(Plane plane1, Plane plane2) {
            int result = (plane1.getTypeOfPlane().toString()).compareTo(plane2.getTypeOfPlane().toString());
            return result;
        }
    }

    public static class ByYearComparator implements Comparator<Plane> {
        public int compare(Plane plane1, Plane plane2) {
            int result = (plane1.getYearOfProduction().toString()).compareTo(plane2.getYearOfProduction().toString());
            return result;
        }
    }

    public static class ByProducingCountry implements Comparator<Plane> {
        public int compare(Plane plane1, Plane plane2) {
            int result = (plane1.getProducingCountry().toString()).compareTo(plane2.getProducingCountry().toString());
            return result;
        }
    }

    public static class ByManufacturingCompany implements Comparator<Plane> {
        public int compare(Plane plane1, Plane plane2) {
            int result = (plane1.getManufacturingCompany().toString()).compareTo(plane2.getManufacturingCompany().toString());
            return result;
        }
    }

    public static class BySeatingCapacity implements Comparator<Plane> {
        public int compare(Plane plane1, Plane plane2) {
            int result = (plane1.getSeatingCapacityUnit().toString()).compareTo(plane2.getSeatingCapacityUnit().toString());
            return result;
        }
    }

    public static class ByCarryingCapacity implements Comparator<Plane> {
        public int compare(Plane plane1, Plane plane2) {
            int result = (plane1.getCarryingCapacityKilo().toString()).compareTo(plane2.getCarryingCapacityKilo().toString());
            return result;
        }
    }

    public static class ByFuelConsumption implements Comparator<Plane> {
        public int compare(Plane plane1, Plane plane2) {
            int result = (plane1.getFuelConsumptionKiloPerHour().toString()).compareTo(plane2.getFuelConsumptionKiloPerHour().toString());
            return result;
        }
    }

    public static class ByEmptyWeight implements Comparator<Plane> {
        public int compare(Plane plane1, Plane plane2) {
            int result = (plane1.getEmptyWeightKilo().toString()).compareTo(plane2.getEmptyWeightKilo().toString());
            return result;
        }
    }

    public static class ByHoursOfFlightsHours implements Comparator<Plane> {
        public int compare(Plane plane1, Plane plane2) {
            int result = (plane1.getHoursOfFlightsHours().toString()).compareTo(plane2.getHoursOfFlightsHours().toString());
            return result;
        }
    }
}

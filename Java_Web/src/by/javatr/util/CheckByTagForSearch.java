package by.javatr.util;
import by.javatr.entity.Plane;

public class CheckByTagForSearch {

    public static class CheckByModelTagForSearch implements AbstractCheckByTagForSearch {
        @Override
        public boolean ifContainsTag(Plane plane, Object tag) {
            return plane.getModelOfPlane().toString().trim().equals(((String)tag).trim());
        }

        // Для поиска самолета, который является или одной или другой моделью поиска
        @Override
        public boolean ifContainsTag(Plane plane, Object tag1, Object tag2) {
            return plane.getModelOfPlane().toString().trim().equals(((String)tag1).trim()) || plane.getModelOfPlane().toString().trim().equals(((String)tag2).trim());
        }
    }

    public static class CheckByTypeTagForSearch implements AbstractCheckByTagForSearch {
        @Override
        public boolean ifContainsTag(Plane plane, Object tag) {
            return plane.getTypeOfPlane().toString().trim().equals(((String)tag).trim());
        }

        @Override
        public boolean ifContainsTag(Plane plane, Object tag1, Object tag2) {
            return plane.getTypeOfPlane().toString().trim().equals(((String)tag1).trim())||
                    plane.getTypeOfPlane().toString().trim().equals(((String)tag2).trim());
        }
    }

    public static class CheckByYearTagForSearch implements AbstractCheckByTagForSearch {
        @Override
        public boolean ifContainsTag(Plane plane, Object tag) {
            return plane.getYearOfProduction().equals((Integer)tag);
        }

        // Для поиска самолета, произведенного в диапазоне лет
        @Override
        public boolean ifContainsTag(Plane plane, Object tag1, Object tag2) {
            return Integer.parseInt(plane.getYearOfProduction().toString()) >= (Integer)tag1 &&
                    Integer.parseInt(plane.getYearOfProduction().toString()) <= (Integer)tag2;
        }
    }

    public static class CheckByProducingCountryTagForSearch implements AbstractCheckByTagForSearch {
        @Override
        public boolean ifContainsTag(Plane plane, Object tag) {
            return plane.getProducingCountry().toString().trim().equals(((String)tag).trim());
        }

        @Override
        public boolean ifContainsTag(Plane plane, Object tag1, Object tag2) {
            return plane.getProducingCountry().toString().trim().equals(((String)tag1).trim()) ||
                    plane.getProducingCountry().toString().trim().equals(((String)tag2).trim());
        }
    }

    public static class CheckByManufacturingCompanyTagForSearch implements AbstractCheckByTagForSearch {
        @Override
        public boolean ifContainsTag(Plane plane, Object tag) {
            return plane.getManufacturingCompany().toString().trim().equals(((String)tag).trim());
        }

        @Override
        public boolean ifContainsTag(Plane plane, Object tag1, Object tag2) {
            return plane.getManufacturingCompany().toString().trim().equals(((String)tag1).trim()) ||
                    plane.getManufacturingCompany().toString().trim().equals(((String)tag2).trim());
        }
    }

    public static class CheckBySeatingCapacityTagForSearch implements AbstractCheckByTagForSearch {
        @Override
        public boolean ifContainsTag(Plane plane, Object tag) {
            return plane.getSeatingCapacityUnit().equals((Integer)tag);
        }

        @Override
        public boolean ifContainsTag(Plane plane, Object tag1, Object tag2) {
            return Integer.parseInt(plane.getSeatingCapacityUnit().toString()) >= (Integer)tag1 &&
                    Integer.parseInt(plane.getSeatingCapacityUnit().toString()) <= (Integer)tag2;
        }
    }

    public static class CheckByCarryingCapacityTagForSearch implements AbstractCheckByTagForSearch {
        @Override
        public boolean ifContainsTag(Plane plane, Object tag) {
            return plane.getCarryingCapacityKilo().equals((Integer)tag);
        }

        @Override
        public boolean ifContainsTag(Plane plane, Object tag1, Object tag2) {
            return Integer.parseInt(plane.getCarryingCapacityKilo().toString()) >= (Integer)tag1 &&
                    Integer.parseInt(plane.getCarryingCapacityKilo().toString()) <= (Integer)tag2;
        }
    }

    public static class CheckByFuelConsumptionTagForSearch implements AbstractCheckByTagForSearch {
        @Override
        public boolean ifContainsTag(Plane plane, Object tag) {
            return plane.getFuelConsumptionKiloPerHour().equals((Integer)tag);
        }

        @Override
        public boolean ifContainsTag(Plane plane, Object tag1, Object tag2) {
            return Integer.parseInt(plane.getFuelConsumptionKiloPerHour().toString()) >= (Integer)tag1 &&
                    Integer.parseInt(plane.getFuelConsumptionKiloPerHour().toString()) <= (Integer)tag2;
        }
    }

    public static class CheckByEmptyWeightTagForSearch implements AbstractCheckByTagForSearch {
        @Override
        public boolean ifContainsTag(Plane plane, Object tag) {
            return plane.getEmptyWeightKilo().equals((Integer)tag);
        }

        @Override
        public boolean ifContainsTag(Plane plane, Object tag1, Object tag2) {
            return Integer.parseInt(plane.getEmptyWeightKilo().toString()) >= (Integer)tag1 &&
                    Integer.parseInt(plane.getEmptyWeightKilo().toString()) <= (Integer)tag2;
        }
    }

    public static class CheckByHoursOfFlightsTagForSearch implements AbstractCheckByTagForSearch {
        @Override
        public boolean ifContainsTag(Plane plane, Object tag) {
            return plane.getHoursOfFlightsHours().equals((Integer)tag);
        }

        @Override
        public boolean ifContainsTag(Plane plane,  Object tag1, Object tag2) {
            return Integer.parseInt(plane.getHoursOfFlightsHours().toString()) >= (Integer)tag1 &&
                    Integer.parseInt(plane.getHoursOfFlightsHours().toString()) <= (Integer)tag2;
        }
    }


}

package by.javatr.entity;
import java.util.Optional;

public class Plane {
    private static Integer ID = 0;
    private Integer IDOfPlane;
    private Optional<String> modelOfPlane;
    private Optional<Integer> yearOfProduction;
    private Optional<String> producingCountry;
    private Optional<String> manufacturingCompany;
    private Optional<Integer> seatingCapacityUnit;          // Вместимость
    private Optional<Integer> carryingCapacityKilo;         // Грузоподъемность
    private Optional<Integer> fuelConsumptionKiloPerHour;   // Потребление горючего
    private Optional<Integer> emptyWeightKilo;              // Масса пустого самолета
    private Optional<Integer> hoursOfFlightsHours;          // Часы налетов

    public Plane() {
        ID++;
        this.IDOfPlane=ID;
        this.modelOfPlane = Optional.of("No set");
        this.yearOfProduction = Optional.of(2019);
        this.producingCountry = Optional.of("No set");
        this.manufacturingCompany = Optional.of("No set");
        this.seatingCapacityUnit = Optional.of(2);
        this.carryingCapacityKilo = Optional.of(100);
        this.fuelConsumptionKiloPerHour = Optional.of(100);
        this.emptyWeightKilo = Optional.of(100);
        this.hoursOfFlightsHours = Optional.of(1);
    }

    public Plane(String modelOfPlane,Integer yearOfProduction, String producingCountry,
                 String manufacturingCompany, Integer seatingCapacityUnit, Integer carryingCapacityKilo,
                 Integer fuelConsumptionKiloPerHour, Integer emptyWeightKilo, Integer hoursOfFlightsHours) {
        ID++;
        this.IDOfPlane=ID;
        setModelOfPlane(modelOfPlane);
        setYearOfProduction(yearOfProduction);
        setProducingCountry(producingCountry);
        setManufacturingCompany(manufacturingCompany);
        setSeatingCapacityUnit(seatingCapacityUnit);
        setCarryingCapacityKilo(carryingCapacityKilo);
        setFuelConsumptionKiloPerHour(fuelConsumptionKiloPerHour);
        setEmptyWeightKilo(emptyWeightKilo);
        setHoursOfFlightsHours(hoursOfFlightsHours);

    }

    public void setModelOfPlane(String modelOfPlane) {
        this.modelOfPlane = Optional.ofNullable(modelOfPlane);
        if (!this.modelOfPlane.isPresent())
            System.out.println("Warning: not a valid value (null)!" +
                    "'Model of plane' parameter must be filled!");
}

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = Optional.ofNullable(yearOfProduction);
        if (!this.yearOfProduction.isPresent())
            System.out.println("Warning: not a valid value (null)!" +
                    "'Year of production' parameter must be filled!");
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = Optional.ofNullable(producingCountry);
        if (!this.producingCountry.isPresent())
            System.out.println("Warning: not a valid value (null)!" +
                    "'Producing country' parameter must be filled!");
    }

    public void setManufacturingCompany(String manufacturingCompany) {
        this.manufacturingCompany = Optional.ofNullable(manufacturingCompany);
        if (!this.manufacturingCompany.isPresent())
            System.out.println("Warning: not a valid value (null)!" +
                    "'Manufacturing company' parameter must be filled!");
    }

    public void setSeatingCapacityUnit(Integer seatingCapacityUnit) {
        this.seatingCapacityUnit = Optional.ofNullable(seatingCapacityUnit);
        if (!this.seatingCapacityUnit.isPresent())
            System.out.println("Warning: not a valid value (null)!" +
                    "'SeatingCapacityUnit' parameter must be filled!");
    }

    public void setCarryingCapacityKilo(Integer carryingCapacityKilo) {
        this.carryingCapacityKilo = Optional.ofNullable(carryingCapacityKilo);
        if (!this.carryingCapacityKilo.isPresent())
            System.out.println("Warning: not a valid value (null)!" +
                    "'CarryingCapacityKilo' parameter must be filled!");
    }

    public void setFuelConsumptionKiloPerHour(Integer fuelConsumptionKiloPerHour) {
        this.fuelConsumptionKiloPerHour = Optional.ofNullable(fuelConsumptionKiloPerHour);
        if (!this.fuelConsumptionKiloPerHour.isPresent())
            System.out.println("Warning: not a valid value (null)!" +
                    "'FuelConsumptionKiloPerHour' parameter must be filled!");
    }

    public void setEmptyWeightKilo(Integer emptyWeightKilo) {
        this.emptyWeightKilo = Optional.ofNullable(emptyWeightKilo);
        if (!this.emptyWeightKilo.isPresent())
            System.out.println("Warning: not a valid value (null)!" +
                    "'emptyWeightKilo' parameter must be filled!");
    }

    public void setHoursOfFlightsHours(Integer hoursOfFlightsHours) {
        this.hoursOfFlightsHours = Optional.ofNullable(hoursOfFlightsHours);
        if (!this.hoursOfFlightsHours.isPresent())
            System.out.println("Warning: not a valid value (null)!" +
                    "'hoursOfFlightsHours' parameter must be filled!");
    }


    @Override
    public String toString() {
        return "Plane {" +
                "\n IDOfPlane=" + IDOfPlane +
                ",\n modelOfPlane=" + modelOfPlane +
                ",\n yearOfProduction=" + yearOfProduction +
                ",\n producingCountry=" + producingCountry +
                ",\n manufacturingCompany=" + manufacturingCompany +
                ",\n seatingCapacityUnit=" + seatingCapacityUnit +
                ",\n carryingCapacityKilo=" + carryingCapacityKilo +
                ",\n fuelConsumptionKiloPerHour=" + fuelConsumptionKiloPerHour +
                ",\n emptyWeightKilo=" + emptyWeightKilo +
                ",\n hoursOfFlightsHours=" + hoursOfFlightsHours +
                "}\n";
    }

}

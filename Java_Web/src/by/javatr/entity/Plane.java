package by.javatr.entity;
import by.javatr.print.PrintToConsole;
import by.javatr.exc.NotCorrectCountryException;
import by.javatr.exc.NotCorrectModelException;
import by.javatr.exc.NotCorrectTypeException;
import by.javatr.exc.NotCorrectYearException;
import by.javatr.valid.ValidationPlane;

import java.util.Optional;

public class Plane implements Comparable<Plane>{
    private static Integer ID = 0;
    private Integer IDOfPlane;
    private Optional<String> modelOfPlane;
    private Optional<String> typeOfPlane;
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
        this.typeOfPlane = Optional.of("No set");
        this.yearOfProduction = Optional.of(2019);
        this.producingCountry = Optional.of("No set");
        this.manufacturingCompany = Optional.of("No set");
        this.seatingCapacityUnit = Optional.of(2);
        this.carryingCapacityKilo = Optional.of(100);
        this.fuelConsumptionKiloPerHour = Optional.of(100);
        this.emptyWeightKilo = Optional.of(100);
        this.hoursOfFlightsHours = Optional.of(1);
    }

    public Plane(String modelOfPlane, String typeOfPlane, Integer yearOfProduction, String producingCountry,
                 String manufacturingCompany, Integer seatingCapacityUnit, Integer carryingCapacityKilo,
                 Integer fuelConsumptionKiloPerHour, Integer emptyWeightKilo, Integer hoursOfFlightsHours) {
        ID++;
        this.IDOfPlane=ID;
        setModelOfPlane(modelOfPlane);
        setTypeOfPlane(typeOfPlane);
        setYearOfProduction(yearOfProduction);
        setProducingCountry(producingCountry);
        setManufacturingCompany(manufacturingCompany);
        setSeatingCapacityUnit(seatingCapacityUnit);
        setCarryingCapacityKilo(carryingCapacityKilo);
        setFuelConsumptionKiloPerHour(fuelConsumptionKiloPerHour);
        setEmptyWeightKilo(emptyWeightKilo);
        setHoursOfFlightsHours(hoursOfFlightsHours);

    }

    // Метод private, т.к. необходим только для реализации clone()
    private static void setID(Integer ID) {
        Plane.ID = ID;
    }

    public void setModelOfPlane(String modelOfPlane) {
        try {
            if (ValidationPlane.ifCorrectModel(modelOfPlane)) {
                this.modelOfPlane = Optional.ofNullable(modelOfPlane);
                if (!this.modelOfPlane.isPresent())
                    PrintToConsole.print("Warning: not a valid value (null)!" +
                            "'Model of plane' parameter must be filled!");
            }
            else{
            throw new NotCorrectModelException("Error: Check the correctness of modelOfPlane (" + modelOfPlane + ")!");
        }
        }
        catch(NotCorrectModelException ex) {
            PrintToConsole.println(ex.getMessage());
        }
    }

    public void setTypeOfPlane(String typeOfPlane) {
        try {
            if (ValidationPlane.ifCorrectType(typeOfPlane)) {
                this.typeOfPlane = Optional.ofNullable(typeOfPlane);
                if (!this.typeOfPlane.isPresent())
                    PrintToConsole.print("Warning: not a valid value (null)!" +
                            "'TypeOfPlane' parameter must be filled!");
            }
            else{
                throw new NotCorrectTypeException("Error: Check the correctness of typeOfPlane (" + typeOfPlane + ")!");
            }
        }
        catch(NotCorrectTypeException ex) {
            PrintToConsole.println(ex.getMessage());
        }
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        try {
            if (ValidationPlane.ifCorrectYear(yearOfProduction)) {
                this.yearOfProduction = Optional.ofNullable(yearOfProduction);
                if (!this.yearOfProduction.isPresent())
                    System.out.println("Warning: not a valid value (null)!" +
                            "'Year of production' parameter must be filled!");
            }
            else {
                throw new NotCorrectYearException("Error: Check the correctness of yearOfProduction (" + yearOfProduction + ")!");
            }
        }
        catch(NotCorrectYearException ex) {
            PrintToConsole.println(ex.getMessage());
        }
    }

    public void setProducingCountry(String producingCountry) {
        try {
            if (ValidationPlane.ifCorrectCountry(producingCountry)) {
                this.producingCountry = Optional.ofNullable(producingCountry);
                if (!this.producingCountry.isPresent())
                    System.out.println("Warning: not a valid value (null)!" +
                            "'Producing country' parameter must be filled!");
            }
            else {
                throw new NotCorrectCountryException("Error: Check the correctness of producingCountry ("
                        + producingCountry + ")!");
            }
        }
        catch(NotCorrectCountryException ex) {
            PrintToConsole.println(ex.getMessage());
        }

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

    public static Integer getID() {
        return ID;
    }

    public Integer getIDOfPlane() {
        return IDOfPlane;
    }

    public Optional<String> getModelOfPlane() {
        return modelOfPlane;
    }

    public Optional<String> getTypeOfPlane() {
        return typeOfPlane;
    }

    public Optional<Integer> getYearOfProduction() {
        return yearOfProduction;
    }

    public Optional<String> getProducingCountry() {
        return producingCountry;
    }

    public Optional<String> getManufacturingCompany() {
        return manufacturingCompany;
    }

    public Optional<Integer> getSeatingCapacityUnit() {
        return seatingCapacityUnit;
    }

    public Optional<Integer> getCarryingCapacityKilo() {
        return carryingCapacityKilo;
    }

    public Optional<Integer> getFuelConsumptionKiloPerHour() {
        return fuelConsumptionKiloPerHour;
    }

    public Optional<Integer> getEmptyWeightKilo() {
        return emptyWeightKilo;
    }

    public Optional<Integer> getHoursOfFlightsHours() {
        return hoursOfFlightsHours;
    }

    @Override
    public String toString() {
        return "\n\n Plane {" +
                "\n IDOfPlane=" + IDOfPlane +
                ",\n modelOfPlane=" + modelOfPlane +
                ",\n typeOfPlane=" + typeOfPlane +
                ",\n yearOfProduction=" + yearOfProduction +
                ",\n producingCountry=" + producingCountry +
                ",\n manufacturingCompany=" + manufacturingCompany +
                ",\n seatingCapacityUnit=" + seatingCapacityUnit +
                ",\n carryingCapacityKilo=" + carryingCapacityKilo +
                ",\n fuelConsumptionKiloPerHour=" + fuelConsumptionKiloPerHour +
                ",\n emptyWeightKilo=" + emptyWeightKilo +
                ",\n hoursOfFlightsHours=" + hoursOfFlightsHours +
                ", \n";
    }


    @Override
    public int compareTo(Plane anotherPlane) {
        int result = this.getModelOfPlane().toString().compareTo(anotherPlane.getModelOfPlane().toString());
        if(result !=0) return result;

        result = this.getTypeOfPlane().toString().compareTo(anotherPlane.getTypeOfPlane().toString());
        if(result !=0) return result;

        result= Integer.parseInt(this.getYearOfProduction().toString()) -
                Integer.parseInt(anotherPlane.getYearOfProduction().toString());
        if(result !=0) return result;

        result=this.getProducingCountry().toString().compareTo(anotherPlane.getProducingCountry().toString());
        if(result !=0) return result;

        result= Integer.parseInt(this.getYearOfProduction().toString())-
                Integer.parseInt(anotherPlane.getYearOfProduction().toString());
        if(result !=0) return result;

        result=this.getManufacturingCompany().toString().compareTo(anotherPlane.getYearOfProduction().toString());
        if(result !=0) return result;

        result= Integer.parseInt(this.getSeatingCapacityUnit().toString()) -
                Integer.parseInt(anotherPlane.getSeatingCapacityUnit().toString());
        if(result !=0) return result;

        result= Integer.parseInt(this.getFuelConsumptionKiloPerHour().toString()) -
                Integer.parseInt(anotherPlane.getFuelConsumptionKiloPerHour().toString());
        if(result !=0) return result;

        result= Integer.parseInt(this.getEmptyWeightKilo().toString()) -
                Integer.parseInt(anotherPlane.getEmptyWeightKilo().toString());
        if(result !=0) return result;

        result= Integer.parseInt(this.getHoursOfFlightsHours().toString()) -
                Integer.parseInt(anotherPlane.getHoursOfFlightsHours().toString());
        return result;
    }


    public Object clone()     {
        Plane planeClone = new Plane();
        planeClone.setID(this.getIDOfPlane());
        planeClone.setModelOfPlane(this.getModelOfPlane().toString());
        planeClone.setTypeOfPlane(this.getTypeOfPlane().toString());
        planeClone.setProducingCountry(this.producingCountry.toString());
        planeClone.setManufacturingCompany(this.getManufacturingCompany().toString());
        planeClone.setSeatingCapacityUnit(Integer.parseInt(this.getSeatingCapacityUnit().toString()));
        planeClone.setCarryingCapacityKilo(Integer.parseInt(this.getCarryingCapacityKilo().toString()));
        planeClone.setFuelConsumptionKiloPerHour(Integer.parseInt(this.getFuelConsumptionKiloPerHour().toString()));
        planeClone.setEmptyWeightKilo(Integer.parseInt(this.getEmptyWeightKilo().toString()));
        planeClone.setHoursOfFlightsHours(Integer.parseInt(this.getHoursOfFlightsHours().toString()));
        return planeClone;
    }
}

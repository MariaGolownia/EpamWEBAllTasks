package by.javatr.rep;
import by.javatr.entity.PassengerPlane;
import by.javatr.entity.Plane;
import by.javatr.entity.TransportPlane;
import by.javatr.exc.ValidationException;
import by.javatr.valid.ValidationFile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileRepository implements  AbstractRepository {
    public static final String AIRCRAFT_DATA_SEPARATOR_IN_FILE = ",";

    @Override
    public List<Plane> read (String nameOfFile) throws IOException {
        List <Plane> listOfPlanes = new ArrayList<>();      //   Окончательный массив самолетов
        List <Plane> listOfPlanesTemp;                      // Промежуточный массив самолетов
        PassengerPlane plane1;                                    // Создание самолета, который будет создан данными одной строки
        TransportPlane plane2;

        File file = new File (nameOfFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            ValidationFile validationFile = new ValidationFile ();
            fileReader = new FileReader(nameOfFile);
            bufferedReader = new BufferedReader (fileReader);

            if (validationFile.checkFile(file))
            {
                String str;
                while ((str = bufferedReader.readLine()) != null)
                {
                    String[] value=str.split(AIRCRAFT_DATA_SEPARATOR_IN_FILE);

                    try
                    {
                        if (value.length==11)
                        {
                            plane2=new TransportPlane();

                            plane2.setModelOfPlane(value[0].trim());
                            plane2.setYearOfProduction(Integer.parseInt(value[1].trim()));
                            plane2.setProducingCountry(value[2]);
                            plane2.setManufacturingCompany(value[3]);
                            plane2.setSeatingCapacityUnit(Integer.parseInt(value[4].trim()));
                            plane2.setCarryingCapacityKilo(Integer.parseInt(value[5].trim()));
                            plane2.setFuelConsumptionKiloPerHour(Integer.parseInt(value[6].trim()));
                            plane2.setEmptyWeightKilo(Integer.parseInt(value[7].trim()));
                            plane2.setHoursOfFlightsHours(Integer.parseInt(value[8].trim()));
                            plane2.setVolumeOfCargoCompartmentCubicMeter(Integer.parseInt(value[9].trim()));
                            plane2.setAreaOfCargoHatchSquareMeter(Integer.parseInt(value[10].trim()));

                            listOfPlanes.add(plane2);
                        }
                        else if (value.length==12)
                        {
                            plane1=new PassengerPlane();

                            plane1.setModelOfPlane(value[0]);
                            plane1.setYearOfProduction(Integer.parseInt(value[1].trim()));
                            plane1.setProducingCountry(value[2]);
                            plane1.setManufacturingCompany(value[3]);
                            plane1.setSeatingCapacityUnit(Integer.parseInt(value[4].trim()));
                            plane1.setCarryingCapacityKilo(Integer.parseInt(value[5].trim()));
                            plane1.setFuelConsumptionKiloPerHour(Integer.parseInt(value[6].trim()));
                            plane1.setEmptyWeightKilo(Integer.parseInt(value[7].trim()));
                            plane1.setHoursOfFlightsHours(Integer.parseInt(value[8].trim()));
                            plane1.setNumberOfEconomyClassSeats(Integer.parseInt(value[9].trim()));
                            plane1.setBusinessClassAvailability(Boolean.parseBoolean(value[10].trim()));
                            plane1.setNumberOfBusinessClassSeats(Integer.parseInt(value[11].trim()));

                            listOfPlanes.add(plane1);
                        }
                    }
                    catch (Exception ex) {
                        System.out.println("Error!" + ex.getMessage());
                    }
                    /*
                    for (String value  : str.split(AIRCRAFT_DATA_SEPARATOR_IN_FILE)) {
                        planeTemp.
                    }
                    */
                }
            }
            else throw new ValidationException ("Error accessing file! Check the file!");
        }
        catch (Exception ex) {
            System.out.println("File read error!" + ex.getMessage());
        }
        finally {
            if (fileReader!=null) fileReader.close();
            if (bufferedReader!=null) bufferedReader.close();
        }

        return listOfPlanes;
    }
}



/*       listOfPlanesTemp = new ArrayList<>();
                    for (String value  : str.split(AIRCRAFT_DATA_SEPARATOR_IN_FILE))
                    {
                        try
                        {
                            listOfPlanesTemp.add(Double.parseDouble(valueToParse));
                        } catch (NumberFormatException exc) {
                            listDoubleTemp.clear();
                            break;
                        }
                    }
                    if (!listDoubleTemp.isEmpty()) {
                        listDouble.addAll(listDoubleTemp);
                    }*/


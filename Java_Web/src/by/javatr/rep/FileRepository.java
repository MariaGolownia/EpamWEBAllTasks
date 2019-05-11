package by.javatr.rep;
import by.javatr.entity.Airline;
import by.javatr.entity.Plane;
import by.javatr.reader.ReaderAirlineFromFile;
import by.javatr.record.RecordAirlineToFile;

import java.io.IOException;
import java.util.List;

public class FileRepository implements AbstractRepositoryPlane<Plane> {
    String FILE_NAME = "result.txt";
    @Override
    public void addPlane(Plane plane) {
        Airline airlineFromFile = new Airline();
        ReaderAirlineFromFile readerAirlineFromFile = new ReaderAirlineFromFile();
        airlineFromFile = readerAirlineFromFile.readPlanesFromFile(FILE_NAME);
        airlineFromFile.addPlane(plane);
        RecordAirlineToFile recordAirlineToFile = new RecordAirlineToFile();
        try {
            recordAirlineToFile.record(airlineFromFile, FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removePlane(Plane plane) {
        Airline airlineFromFile = new Airline();
        ReaderAirlineFromFile readerAirlineFromFile = new ReaderAirlineFromFile();
        airlineFromFile = readerAirlineFromFile.readPlanesFromFile(FILE_NAME);
        airlineFromFile.remove(plane);
        RecordAirlineToFile recordAirlineToFile = new RecordAirlineToFile();
        try {
            recordAirlineToFile.record(airlineFromFile, FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updatePlane(Plane plane) {
        Airline airlineFromFile = new Airline();
        ReaderAirlineFromFile readerAirlineFromFile = new ReaderAirlineFromFile();
        airlineFromFile = readerAirlineFromFile.readPlanesFromFile(FILE_NAME);
        airlineFromFile.update(plane);
        RecordAirlineToFile recordAirlineToFile = new RecordAirlineToFile();
        try {
            recordAirlineToFile.record(airlineFromFile, FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Plane> query(PlaneSpecification  specification) {
        Airline airlineFromFile = new Airline();
        ReaderAirlineFromFile readerAirlineFromFile = new ReaderAirlineFromFile();
        airlineFromFile = readerAirlineFromFile.readPlanesFromFile(FILE_NAME);
        return null;
    }
}

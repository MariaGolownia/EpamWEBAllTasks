package by.runner;
import by.javatr.entity.Plane;
import by.javatr.rep.FileRepository;

import java.io.IOException;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException {

        /*
        Plane plane1 = new Plane("B737-300", 2019, "USA",
               "BOEING", 250, 20000,2600,
                32820, 1000);
        System.out.println(plane1);

        Plane plane2 = new TransportPlane("E195AR", 1998, "BRAZIL",
                "EMBRAER", 200, 38000,3300, 37000, 30200, 170, 1200);

        Plane plane3 = new TransportPlane("EMB-720 MINUANO", 1998, "BRAZIL",
                "EMBRAER", 170, 34000,2700, 77000, 400000, 4300, 1100);

        Plane plane4 = new PassengerPlane("B737_300", 2019, "USA", "BOEING", 250, 20000, 2600, 32820, 1000, 150, true, 20);
        System.out.println(plane2);
        System.out.println(plane3);
        System.out.println(plane4);*/

        FileRepository fileRep = new FileRepository ();
        List<Plane> plane =fileRep.read("D:\\data.txt");

        for (Plane value: plane)
        {
            System.out.println(value);
        }
    }
}

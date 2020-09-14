package by.epamlab.manually.jaxb;

import by.epamlab.manually.classes.Itinerary;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class UnmarshalRunner {

    public static void main(String[] args) {

        try {
            File file = new File("src/main/java/by/epamlab/task6.xml");
            JAXBContext context = JAXBContext.newInstance(Itinerary.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Itinerary itinerary = (Itinerary) unmarshaller.unmarshal(file);
            System.out.println(itinerary);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

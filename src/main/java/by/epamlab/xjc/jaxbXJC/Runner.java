package by.epamlab.xjc.jaxbXJC;

import by.epamlab.xjc.ItineraryType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Runner {

    public static void main(String[] args) {

        File file = new File("src/main/java/by/epamlab/task6.xml");

        try {
            JAXBContext context = JAXBContext.newInstance(ItineraryType.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            ItineraryType itineraryType = (ItineraryType) unmarshaller.unmarshal(file);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(itineraryType, new FileOutputStream("src/main/java/by/epamlab/xjc/xml/xjc-marshal.xml"));
            marshaller.marshal(itineraryType, System.out);
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

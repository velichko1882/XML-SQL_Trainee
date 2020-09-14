package by.epamlab.manually.jaxb;

import by.epamlab.manually.classes.*;
import by.epamlab.manually.classes.extention.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MarshalRunner {

    public static void main(String[] args) {

        //Creating an object Air

        Extension extensionForFlight1 = new Extension();
        extensionForFlight1.setFlightSupplementalInfo(new FlightSupplementalInfo("PT1H5M"));
        extensionForFlight1.setBookingClassAvailability(new BookingClassAvailability("K", 9, "Economy"));
        extensionForFlight1.setEticket("E");
        extensionForFlight1.setTerminalInformation(new TerminalInformation(1));
        extensionForFlight1.setInventorySystem(new InventorySystem("ABC"));
        Flight flight1 = new Flight("2018-12-29T09:00:00.000", "2018-12-29T10:05:00.000",
                "K", 0, 0, "0000", 1, extensionForFlight1);

        Extension extensionForFlight2 = new Extension();
        extensionForFlight2.setFlightSupplementalInfo(new FlightSupplementalInfo("PT55M"));
        extensionForFlight2.setBookingClassAvailability(new BookingClassAvailability("K", 9, "Economy"));
        extensionForFlight2.setEticket("E");
        extensionForFlight2.setTerminalInformation(new TerminalInformation(1));
        extensionForFlight2.setInventorySystem(new InventorySystem("ABC"));
        Flight flight2 = new Flight("2018-12-29T11:00:00.000", "2018-12-29T11:55:00.000",
                "K", 0, 1, "1111", 1, extensionForFlight2);

        Extension extensionForOption = new Extension();
        extensionForOption.setInventorySystem(new InventorySystem("ABC"));
        extensionForOption.setSource("GDS");

        Option option = new Option(extensionForOption);
        option.addFlight(flight1);
        option.addFlight(flight2);

        Options options = new Options();
        options.addOption(option);

        Extension extensionForAir = new Extension();
        extensionForAir.setAttributes(new Attributes("OW"));

        Air air = new Air("OneWay", "PT2H55M", options, extensionForAir);

        //Creating an object PricingInfo

        Base base = new Base(91.00, "EUR");

        Taxes taxes = new Taxes();
        taxes.addTax(new Tax(7.38, "EUR", "AA"));
        taxes.addTax(new Tax(9.50, "EUR", "BB"));
        taxes.addTax(new Tax(26.56, "EUR", "CC"));
        taxes.addTax(new Tax(19.08, "EUR", "DD"));

        Fees fees = new Fees(new Fee("EE", "10.00", "EUR"));

        Total totalInner = new Total();
        totalInner.setAmount(163.52);
        totalInner.setCurrencyCode("EUR");

        TaxInfos taxInfosForTotal = new TaxInfos();

        TaxInfo taxInfoForTotal1 = new TaxInfo();
        taxInfoForTotal1.setTaxCode("AA");
        taxInfoForTotal1.setBaseCurrency("EUR");
        taxInfosForTotal.addTaxInfo(taxInfoForTotal1);

        TaxInfo taxInfoForTotal2 = new TaxInfo();
        taxInfoForTotal2.setTaxCode("BB");
        taxInfoForTotal2.setBaseCurrency("EUR");
        taxInfosForTotal.addTaxInfo(taxInfoForTotal2);

        TaxInfo taxInfoFortotal3 = new TaxInfo();
        taxInfoFortotal3.setTaxCode("CC");
        taxInfoFortotal3.setBaseCurrency("EUR");
        taxInfosForTotal.addTaxInfo(taxInfoFortotal3);

        TaxInfo taxInfoForTotal4 = new TaxInfo();
        taxInfoForTotal4.setTaxCode("DD");
        taxInfoForTotal4.setBaseCurrency("EUR");
        taxInfosForTotal.addTaxInfo(taxInfoForTotal4);

        FeeInfos feeInfos = new FeeInfos(new FeeInfo("EE", "EUR"));

        Extension extensionForTotal = new Extension();
        extensionForTotal.setTaxInfos(taxInfosForTotal);
        extensionForTotal.setFeeInfos(feeInfos);

        Total total = new Total();
        total.setBase(base);
        total.setTaxes(taxes);
        total.setFees(fees);
        total.setTotal(totalInner);
        total.setExtension(extensionForTotal);

        PassengerQuantity passengerQuantity = new PassengerQuantity("ADT", 1);

        BasisCodes basisCodes = new BasisCodes("AAAAAAA");

        TaxInfos taxInfosForPTC = new TaxInfos();

        TaxInfo taxInfoForPTC1 = new TaxInfo();
        taxInfoForPTC1.setTaxCode("AA");
        taxInfoForPTC1.setCurrencyCode("EUR");
        taxInfosForPTC.addTaxInfo(taxInfoForPTC1);

        TaxInfo taxInfoForPTC2 = new TaxInfo();
        taxInfoForPTC2.setTaxCode("BB");
        taxInfoForPTC2.setCurrencyCode("EUR");
        taxInfosForPTC.addTaxInfo(taxInfoForPTC2);

        TaxInfo taxInfoForPTC3 = new TaxInfo();
        taxInfoForPTC3.setTaxCode("CC");
        taxInfoForPTC3.setCurrencyCode("EUR");
        taxInfosForPTC.addTaxInfo(taxInfoForPTC3);

        TaxInfo taxInfoForPTC4 = new TaxInfo();
        taxInfoForPTC4.setTaxCode("DD");
        taxInfoForPTC4.setCurrencyCode("EUR");
        taxInfosForPTC.addTaxInfo(taxInfoForPTC4);

        Extension extensionForPassengerFare = new Extension();
        extensionForPassengerFare.setTaxInfos(taxInfosForPTC);
        extensionForPassengerFare.setFeeInfos(feeInfos);

        PassengerFare passengerFare = new PassengerFare(base, taxes, fees, totalInner, extensionForPassengerFare);

        Passenger passenger = new Passenger("ADT", 0, 35,
                new RemoteSystemPTCs("ADT"));

        Extension extensionForPTC = new Extension();
        extensionForPTC.setPassenger(passenger);

        PTC ptc = new PTC("Private", passengerQuantity, basisCodes, passengerFare, extensionForPTC);

        PTCs ptCs = new PTCs();
        ptCs.addPtc(ptc);

        Extension extensionForFareInfo = new Extension();
        extensionForFareInfo.setBase(base);
        extensionForFareInfo.setTaxInfos(taxInfosForPTC);
        extensionForFareInfo.setFeeInfos(feeInfos);
        extensionForFareInfo.setTotal(totalInner);
        extensionForFareInfo.addSegment(new Segment(0));
        extensionForFareInfo.addSegment(new Segment(1));
        extensionForFareInfo.setPassenger(passenger);
        extensionForFareInfo.setCarrier("LH");

        FareInfo fareInfo = new FareInfo("2018-12-29T09:00:00.000", "AAAAAAA", extensionForFareInfo);

        FareInfos fareInfos = new FareInfos();
        fareInfos.addFareInfo(fareInfo);

        Extension extensionForPricingInfo = new Extension();
        extensionForPricingInfo.setPricingSystem("");
        extensionForPricingInfo.setProvider(new Provider("EEEEEEEE"));

        PricingInfo pricingInfo = new PricingInfo("Private", total, ptCs, fareInfos, extensionForPricingInfo);

        //Creating an object TicketingInfo

        TicketingInfo ticketingInfo = new TicketingInfo("eTicket");

        //Creating a root element object Itinerary

        Itinerary itinerary = new Itinerary(1, 1, 0, air, pricingInfo, ticketingInfo);

        System.out.println(itinerary);

        try {
            JAXBContext context = JAXBContext.newInstance(Itinerary.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(itinerary, new FileOutputStream("src/main/java/by/epamlab/task6-marshal.xml"));
            marshaller.marshal(itinerary, System.out);
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

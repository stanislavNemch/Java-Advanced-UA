package Lesson_7.Exercise_4;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {

        String currentDir = System.getProperty("user.dir");
        String filename = currentDir + "/src/Lesson_7/Exercise_4/city.xml";

        List<Region> regions = new ArrayList<>();

        regions.add(new Region("big","Kyiv", "Borispolskaya", 10));
        regions.add(new Region("middle","Kremenchuk", "Bogdan Khmelnitsky", 23));
        regions.add(new Region("small","Mirgorod", "Gogol", 124));

        RegionBuilderJAXB regionBuilderJAXB = new RegionBuilderJAXB(regions);

        convertObjectToXml(regionBuilderJAXB, filename);

        convertXmlToObject(filename);
    }

    // сохраняем объект в XML файл
    private static void convertObjectToXml(RegionBuilderJAXB regionBuilderJAXB, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(RegionBuilderJAXB.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // маршаллинг объекта в файл
            marshaller.marshal(regionBuilderJAXB, new File(filePath));

            // маршаллинг объекта на консоль
            marshaller.marshal(regionBuilderJAXB, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    // загружаем объект из XML файла
    private static void convertXmlToObject(String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(RegionBuilderJAXB.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // демаршалинг объекта из файла
            RegionBuilderJAXB regionBuilderJAXB = (RegionBuilderJAXB) unmarshaller.unmarshal(new File(filePath));

            // вывод объекта на консоль
            System.out.println(regionBuilderJAXB.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

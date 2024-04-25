package Lesson_7.Exercise_3;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        String currentDir = System.getProperty("user.dir");
        String filename = currentDir + "/src/Lesson_7/Exercise_3/city.xml";

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            // главный элемент
            Element rootElement = doc.createElement("country");
            doc.appendChild(rootElement);

            RegionBuilder regionBuilder = new RegionBuilder(doc);

            ArrayList<Element> regions = new ArrayList<>();

            Element city1 = regionBuilder.createCity("big", "Kyiv");
            Element street1 = regionBuilder.createStreet("Borispolskaya");
            Element house1 = regionBuilder.createHouse("10");
            regions.add(regionBuilder.createRegion(city1, street1, house1));

            Element city2 = regionBuilder.createCity("middle", "Kremenchuk");
            Element street2 = regionBuilder.createStreet("Bogdan Khmelnitsky");
            Element house2 = regionBuilder.createHouse("18");
            regions.add(regionBuilder.createRegion(city2, street2, house2));

            Element city3 = regionBuilder.createCity("small", "Mirgorod");
            Element street3 = regionBuilder.createStreet("Gogol");
            Element house3 = regionBuilder.createHouse("169");
            regions.add(regionBuilder.createRegion(city3, street3, house3));

            for (Element region : regions) {
                rootElement.appendChild(region);
            }

            // записываем данные в xml файл
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filename));
            transformer.transform(source, result);

            // Выводим в консоль для проверки записанных данных
            StreamResult consoleResult = new StreamResult(System.out);
            transformer.transform(source, consoleResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
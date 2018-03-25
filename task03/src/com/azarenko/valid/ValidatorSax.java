package com.azarenko.valid;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class ValidatorSax {
    public static void main(String[] args) {
        String fileName = "src/data/Site.xml";
        String schemeName = "src/data/Site.xsd";
        String longName = "src/com/azarenko/log/log.txt";
        Schema schema = null;
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        SchemaFactory factory = SchemaFactory.newInstance(language);
        try {
            //Установка проверки с исползованием XSD
            schema = factory.newSchema(new File(schemeName));
            SAXParserFactory spf = SAXParserFactory.newInstance();
            spf.setSchema(schema);
            //создание объекта парсера
            SAXParser parser = spf.newSAXParser();
            //установка обработчика ошибок и запуск
            parser.parse(fileName, new SiteErrorHandler(longName));
            System.out.println(fileName + " valid");
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

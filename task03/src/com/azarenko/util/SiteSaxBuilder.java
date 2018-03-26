package com.azarenko.util;

import com.azarenko.model.Page;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.List;

public class SiteSaxBuilder {
    private List<Page> pageList;
    private PageHandler ph;
    private XMLReader reader;

    public List<Page> getPageList() {
        return pageList;
    }

    public SiteSaxBuilder() {
        // Создание SAX  анализатора
        ph = new PageHandler();
        try {
            //создание объекта разработчика
            reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(ph);
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

    public void buildListPages(String filename){
        try{
            reader.parse(filename);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        pageList = ph.getPageList();
    }
}

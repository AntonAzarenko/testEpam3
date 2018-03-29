package com.azarenko;

import com.azarenko.model.Page;
import com.azarenko.model.Site;
import com.azarenko.util.SiteSaxBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SiteSaxBuilder siteSaxBuilder = new SiteSaxBuilder();
        siteSaxBuilder.buildListPages("src/data/Site.xml");
        Site site = new Site();
        site.setPageList(siteSaxBuilder.getPageList());
        List<Page> pageList = site.getPageList();
        pageList.forEach(m ->System.out.println(m));




    }

}

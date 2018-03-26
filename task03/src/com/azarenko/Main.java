package com.azarenko;

import com.azarenko.model.Site;
import com.azarenko.util.SiteSaxBuilder;

public class Main {
    public static void main(String[] args) {
        SiteSaxBuilder siteSaxBuilder = new SiteSaxBuilder();
        siteSaxBuilder.buildListPages("src/data/Site.xml");
        Site site = new Site();
        site.setPageList(siteSaxBuilder.getPageList());
        System.out.println(site.getPageList());

    }

}

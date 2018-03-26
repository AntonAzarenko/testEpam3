package com.azarenko.model;

import java.util.List;

public class Site {
    private List<Page> pageList;

    public Site(List<Page> pageList) {
        this.pageList = pageList;
    }

    public Site() {
    }

    public List<Page> getPageList() {

        return pageList;
    }

    public void setPageList(List<Page> pageList) {
        this.pageList = pageList;
    }
}

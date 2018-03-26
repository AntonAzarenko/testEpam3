package com.azarenko.util;

import com.azarenko.model.*;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class PageHandler extends DefaultHandler {
    private List<Page> pageList;
    private Page current = null;
    private PageEnum currentEnam;
    private EnumSet<PageEnum> withText;

    public PageHandler() {
        pageList = new ArrayList<>();
        withText = EnumSet.range(PageEnum.SITE, PageEnum.ARCHIVES);
    }

    public List<Page> getPageList() {
        return pageList;
    }

    public void startElement(String uri, String localname, String qName, Attributes attrs) {
        if ("site".equals(localname)) {
            return;
        }
        if ("page".equals(localname)) {
            current = getPage(attrs);
        } else {
            PageEnum temp = PageEnum.valueOf(localname.toUpperCase());
            if (withText.contains(temp)) {
                currentEnam = temp;
            }
        }

    }

    public void characters(char[] ch, int start, int length) {
        String s = new String(ch, start, length);
        if (currentEnam != null) {
            switch (currentEnam) {
                case TYPE:
                    current.setType(s);
                    break;
                case AUTORIZE:
                    current.setType(s);
                    break;
                case EMAIL:
                    current.setEmail(s);
                    break;
                case NEWS:
                    current.setNews(Boolean.parseBoolean(s));
                    break;
                case PAID:
                    current.setPaid(Boolean.parseBoolean(s));
                    break;
                case VOTE:
                    current.setVote(Boolean.parseBoolean(s));
                    break;
                case VOTEAUTORIZE:
                    current.setVoteauthorize(Boolean.parseBoolean(s));
                    break;
                case ARCHIVES:
                    current.setArcives(Boolean.parseBoolean(s));
                    break;
                case TITLE:
                    current.setTitle(s);
                default:
                    // throw new EnumConstantNotPresentException(currentEnam.getDeclaringClass(), currentEnam.name());
            }
        }
        currentEnam = null;

    }

    public void endElement(String Uri, String localName, String qName) {
        if ("page".equals(localName)) {
            pageList.add(current);
        }
    }

    private Page getPage(Attributes attr) {
        int id = Integer.parseInt(attr.getValue(0));
        if (id == 1) {
            return new AdvertisingPage();
        } else if (id == 2) {
            return new NewsPage();
        } else if (id == 3) {
            return new PortalPage();
        } else if (id == 4) {
            return new MirrorPage();
        }
        return null;
    }
}

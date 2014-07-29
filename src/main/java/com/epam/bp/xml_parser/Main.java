package com.epam.bp.xml_parser;

import com.epam.bp.xml_parser.parser.SAXhandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class Main {
    /*   private static final int WARES_AMOUNT = 5;
       private static final BigDecimal LOW_PRICE = BigDecimal.valueOf(20000);
       private static final BigDecimal HIGH_PRICE = BigDecimal.valueOf(100000); */
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
 /*     HwShop hwShop = HwShopFactory.createRandomHWShop(WARES_AMOUNT);
        LOGGER.info("Generated random HWShop:\n" + hwShop);
        LOGGER.info("Cloned and sorted by price HWShop:\n" + HwShopUtil.SortByPrice(hwShop, Ware.PRICE_COMPARATOR));
        LOGGER.info("\n" + HwShopUtil.SelectByPrice(hwShop, LOW_PRICE, HIGH_PRICE));    */

        javax.xml.parsers.SAXParserFactory spf = SAXParserFactory.newInstance();
        spf.setValidating(false);
        javax.xml.parsers.SAXParser sp = spf.newSAXParser();
        SAXhandler SaxHandler = new SAXhandler();
        sp.parse(new File("src/main/resources/HwShop.xml"), SaxHandler);

    }
}

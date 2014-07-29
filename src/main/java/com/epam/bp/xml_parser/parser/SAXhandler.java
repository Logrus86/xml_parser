package com.epam.bp.xml_parser.parser;

import com.epam.bp.xml_parser.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import java.math.BigDecimal;

public class SAXhandler extends DefaultHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(SAXhandler.class);
    StringBuilder sb = new StringBuilder();
    HwShop hwShop;
    Ware ware;
    Cpu cpu;
    Hdd hdd;
    /*  Monitor monitor;
      Motherboard motherboard;
      Notebook notebook;
      Pc pc;
      Ram ram;*/
    VideoCard videoCard;

    @Override
    public void startDocument() {
        LOGGER.info("Parsing started. Generating HwShop...");
        hwShop = new HwShop();
    }

    @Override
    public void endDocument() throws SAXException {
        LOGGER.info("SAX parsing ended.");
        LOGGER.info("Generated HwShop: " + hwShop.toString());
    }

    @Override
    public void startElement(String URI, String localName, String qName, org.xml.sax.Attributes attributes) throws SAXException {
        sb.setLength(0);

        if (qName.equals("Cpu")) {
            cpu = new Cpu();
            ware = cpu;
        } else if (qName.equals("Hdd")) {
            hdd = new Hdd();
            ware = hdd;
   /*     } else if (qName.equals("Monitor")) {
            ware = new Monitor();
        } else if (qName.equals("Motherboard")) {
            ware = new Motherboard();
        } else if (qName.equals("Notebook")) {
            ware = new Notebook();
        } else if (qName.equals("Pc")) {
            ware = new Pc();
        } else if (qName.equals("Ram")) {
            ram = new Ram();
            ware = ram;*/
        } else if (qName.equals("VideoCard")) {
            videoCard = new VideoCard();
            ware = videoCard;
        }
    }

    @Override
    public void characters(char[] buffer, int start, int length) throws SAXException {
        sb.append(buffer, start, length);
    }

    @Override
    public void endElement(String URI, String localName, String qName) throws SAXException {
        //    System.out.println("URI:" + URI + ", localName:" + localName + ", qName:" + qName + ", sb:|" + sb.toString().trim() + "|");

        if (qName.equals("Title")) {
            hwShop.setTitle(sb.toString().trim());
        } else if (qName.equals("Address")) {
            hwShop.setAddress(sb.toString().trim());

        } else if (qName.equals("Price")) {
            ware.setPrice(BigDecimal.valueOf(Integer.parseInt(sb.toString().trim())));
        } else if (qName.equals("Weight")) {
            ware.setWeight(Integer.parseInt(sb.toString().trim()));
        } else if (qName.equals("Model")) {
            ware.setModel(sb.toString().trim());
        } else if (qName.equals("Vendor")) {
            ware.setVendor(sb.toString().trim());

        } else if (qName.equals("frequencyMHz")) {
            cpu.setFrequencyMHz(Integer.parseInt(sb.toString().trim()));
        } else if (qName.equals("coreQuantity")) {
            cpu.setCoreQuantity(Integer.parseInt(sb.toString().trim()));
        } else if (qName.equals("techProcessNm")) {
            cpu.setTechProcessNm(Integer.parseInt(sb.toString().trim()));
        } else if (qName.equals("socket")) {
            cpu.setSocket(Cpu.Socket.valueOf(sb.toString().trim()));

        } else if (qName.equals("capacityGb")) {
            hdd.setCapacityGb(Integer.parseInt(sb.toString().trim()));
        } else if (qName.equals("rotatingSpeedRpm")) {
            hdd.setRotatingSpeedRpm(Integer.parseInt(sb.toString().trim()));
        } else if (qName.equals("formfactorHdd")) {
            hdd.setFormfactorHdd(Hdd.FormFactor.valueOf(sb.toString().trim()));

        } else if (qName.equals("ramSizeMb")) {
            videoCard.setRamSizeMb(Integer.parseInt(sb.toString().trim()));
        } else if (qName.equals("ramFrequencyMHz")) {
            videoCard.setRamFrequencyMHz(Integer.parseInt(sb.toString().trim()));
        } else if (qName.equals("cpuFrequencyMHz")) {
            videoCard.setCpuFrequencyMHz(Integer.parseInt(sb.toString().trim()));
        } else if (qName.equals("busWidthBit")) {
            videoCard.setBusWidthBit(Integer.parseInt(sb.toString().trim()));
        } else if (qName.equals("VideoCardChipset")) {
            videoCard.setVideoCardChipset(VideoCard.VideoCardChipset.valueOf(sb.toString().trim()));

        } else if (qName.equals("Ware")) {
            hwShop.add(ware);
            hwShop.setWaresAmount(hwShop.wares.size());
            ware = null;
        }
    }

    public void warning(SAXParseException exception) {
        LOGGER.warn("line " + exception.getLineNumber() + ": "
                + exception.getMessage());
    }

    public void error(SAXParseException exception) {
        LOGGER.error("line " + exception.getLineNumber() + ": "
                + exception.getMessage());
    }

    public void fatalError(SAXParseException exception) throws SAXException {
        LOGGER.error("FATAL: line " + exception.getLineNumber() + ": "
                + exception.getMessage());
        throw (exception);
    }
}

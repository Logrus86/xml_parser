
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epam.bp.xml_parser.generated_entities package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HwShop_QNAME = new QName("http://www.example.com/HwShop", "HwShop");
    private final static QName _WareEntityType_QNAME = new QName("", "Type");
    private final static QName _WareEntityPrice_QNAME = new QName("", "Price");
    private final static QName _WareEntityModel_QNAME = new QName("", "Model");
    private final static QName _WareEntityVendor_QNAME = new QName("", "Vendor");
    private final static QName _WareEntityWeight_QNAME = new QName("", "Weight");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.bp.xml_parser.generated_entities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HwShopEntity }
     * 
     */
    public HwShopEntity createHwShopEntity() {
        return new HwShopEntity();
    }

    /**
     * Create an instance of {@link WareEntity }
     * 
     */
    public WareEntity createWareEntity() {
        return new WareEntity();
    }

    /**
     * Create an instance of {@link CpuEntity }
     * 
     */
    public CpuEntity createCpuEntity() {
        return new CpuEntity();
    }

    /**
     * Create an instance of {@link RamEntity }
     * 
     */
    public RamEntity createRamEntity() {
        return new RamEntity();
    }

    /**
     * Create an instance of {@link VideocardEntity }
     * 
     */
    public VideocardEntity createVideocardEntity() {
        return new VideocardEntity();
    }

    /**
     * Create an instance of {@link HddEntity }
     * 
     */
    public HddEntity createHddEntity() {
        return new HddEntity();
    }

    /**
     * Create an instance of {@link MotherboardEntity }
     * 
     */
    public MotherboardEntity createMotherboardEntity() {
        return new MotherboardEntity();
    }

    /**
     * Create an instance of {@link WareType }
     * 
     */
    public WareType createWareType() {
        return new WareType();
    }

    /**
     * Create an instance of {@link WaresEntity }
     * 
     */
    public WaresEntity createWaresEntity() {
        return new WaresEntity();
    }

    /**
     * Create an instance of {@link NotebookEntity }
     * 
     */
    public NotebookEntity createNotebookEntity() {
        return new NotebookEntity();
    }

    /**
     * Create an instance of {@link MonitorEntity }
     * 
     */
    public MonitorEntity createMonitorEntity() {
        return new MonitorEntity();
    }

    /**
     * Create an instance of {@link PcEntity }
     * 
     */
    public PcEntity createPcEntity() {
        return new PcEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HwShopEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/HwShop", name = "HwShop")
    public JAXBElement<HwShopEntity> createHwShop(HwShopEntity value) {
        return new JAXBElement<HwShopEntity>(_HwShop_QNAME, HwShopEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WareType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Type", scope = WareEntity.class)
    public JAXBElement<WareType> createWareEntityType(WareType value) {
        return new JAXBElement<WareType>(_WareEntityType_QNAME, WareType.class, WareEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Price", scope = WareEntity.class)
    public JAXBElement<Integer> createWareEntityPrice(Integer value) {
        return new JAXBElement<Integer>(_WareEntityPrice_QNAME, Integer.class, WareEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Model", scope = WareEntity.class)
    public JAXBElement<String> createWareEntityModel(String value) {
        return new JAXBElement<String>(_WareEntityModel_QNAME, String.class, WareEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Vendor", scope = WareEntity.class)
    public JAXBElement<VendorType> createWareEntityVendor(VendorType value) {
        return new JAXBElement<VendorType>(_WareEntityVendor_QNAME, VendorType.class, WareEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Weight", scope = WareEntity.class)
    public JAXBElement<Integer> createWareEntityWeight(Integer value) {
        return new JAXBElement<Integer>(_WareEntityWeight_QNAME, Integer.class, WareEntity.class, value);
    }

}

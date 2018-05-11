package zajecia8;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import java.io.File;

/**
 * Created by Krzysztof Podlaski on 11.05.2018.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Furniture {
    @XmlAttribute(name="ref")
    private String refNumber;
    @XmlElement(name="opis")
    private String desc;
    private String roomNumber;
    @XmlTransient
    private int poleDodatkowe;

    private Furniture(){}
    public Furniture(String refNumber, String desc, String roomNumber) {
        this.refNumber = refNumber;
        this.desc = desc;
        this.roomNumber = roomNumber;
    }

    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Furniture.class);
        Marshaller marsh =context.createMarshaller();
        Furniture f = new Furniture("TTT123","Biurko","A333");
        marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marsh.marshal(f,System.out);
        marsh.marshal(f, new File("mebel.xml"));
        Unmarshaller umarsh = context.createUnmarshaller();
        Furniture f2 = (Furniture) umarsh.unmarshal(new File("mebel2.xml"));
        System.out.println(f2.refNumber);
    }
}

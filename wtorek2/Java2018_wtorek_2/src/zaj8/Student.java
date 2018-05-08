package zaj8;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Krzysztof Podlaski on 08.05.2018.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
    @XmlElement(name="imie")
    private String name;
    private String surname;
    private int index;

    public Student(){}

    public Student(String name, String surname, int index) {
        this.name = name;
        this.surname = surname;
        this.index = index;
    }

    public String toString(){
        return name+" "+surname+" "+ " "+index;
    }

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(Student.class);
        Student st = new Student(
                    "Adam","Adamski",
                    123321);
        Marshaller marsh = context.createMarshaller();
        marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marsh.marshal(st,System.out);
        marsh.marshal(st,new FileOutputStream("student.xml"));
        Unmarshaller umarsh = context.createUnmarshaller();
        Student st2 = (Student) umarsh.unmarshal(
                        new File("student2.xml"));
        System.out.println(st2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //if (o == null ||  o instanceof Student) return false;

        Student student = (Student) o;

        if (index != student.index) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return surname != null ? surname.equals(student.surname) : student.surname == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + index;
        return result;
    }
}

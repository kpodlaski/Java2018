package zajecia4;

/**
 * Created by Krzysztof Podlaski on 16.03.2018.
 */
public class Student {
    private static int last_index=1;
    private int index;
    private String name;
    private String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        index=last_index++;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    /*public boolean equals(Object o){
        System.out.print("=");
        if (o instanceof Student){
            Student s = (Student) o;
            return s.index==this.index;
        }
        return false;
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (index != student.index) return false;
        return surname != null ? surname.equals(student.surname) : student.surname == null;
    }

    @Override
    public int hashCode() {
        int result = index;
        result = 31 * result +
                (surname != null ? surname.hashCode() : 0);
        return result;
    }
}


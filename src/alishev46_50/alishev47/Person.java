package alishev46_50.alishev47;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = -2903308697559853893L;
    //@Serial
    //private static final long serialVersionUID = 8730197840478978982L;
    //private transient int id;
    //private transient String name;
    private int id;
    //private String name;
    private String personName;
    private int age;
    private byte type;

    public Person(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return id + " : " + personName;
    }
}

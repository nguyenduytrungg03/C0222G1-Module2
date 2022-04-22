package _15_io_text_file.exercise.reader_file_csv;

import java.io.Serializable;

public class Country implements Serializable {

    private int id;
    private String code;
    private String Name;


    public Country(int i) {
    }

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        Name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Country: " +
                "id= " + id +
                ", code= " + code +
                ", Name= " + Name ;
    }
}

package lv.company.api.persistence;

public class Person {
    private String name;
    private String surname;


    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String newSurname) {
        this.surname = newSurname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

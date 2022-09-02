package ba.sum.fpmoz.informatika.fpmozjavafx.model;

public class User extends Table{
    @Entity(type = "INTEGER", size = 32, primary = true)
    int id;

    @Entity(type="VARCHAR", size=50)
    String name;

    @Entity(type = "VARCHAR", size=50)
    String surname;

    @Entity(type="VARCHAR", size = 150)
    String email;

    @Entity(type = "VARCHAR", size = 256)
    String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return email;
    }

}
package ba.sum.fpmoz.informatika.fpmozjavafx.model;

public class Moviename extends Table{
    @Entity(type = "INTEGER", size = 32, primary = true)
    int id;

    @Entity(type="VARCHAR", size=400)
    String name;


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

    @Override
    public String toString() {
        return name;
    }
}

package ba.sum.fpmoz.informatika.fpmozjavafx.model;

public class Usingvideo extends Table {
    @Entity(type = "INTEGER", size = 32, primary = true)
    int id;

    @Entity(type = "VARCHAR", size = 50)
    String usingvideo_date;

    @Entity(type = "VARCHAR", size = 50)
    String cancel_name_date;

    @ForeignKey(table = "moviename", attribute = "id")
    @Entity(type = "INTEGER", size = 32)
    int moviename_id;

    @ForeignKey(table = "user", attribute = "id")
    @Entity(type = "INTEGER", size = 32)
    int user_id;

    public int getId() {
        return id;
    }



    public String getUsingvideo_date() {
        return usingvideo_date;
    }

    public void setUsingvideo_date(String usingvideo_date) {
        this.usingvideo_date = usingvideo_date;
    }

    public String getCancel_name_date() {
        return cancel_name_date;
    }

    public void setCancel_name_date(String cancel_name_date) {
        this.cancel_name_date = cancel_name_date;
    }

    public int getName_id() {
        return moviename_id;
    }

    public void setName_id(int name_id) {
        this.moviename_id = name_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}




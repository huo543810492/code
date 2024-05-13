package Theory.RemoveListDuplicate;

import java.util.Date;

public class record {
    private String ID;
    private Date date;
    private String value;

    @Override
    public String toString() {
        return "record{" +
                "ID='" + ID + '\'' +
                ", date=" + date +
                ", value='" + value + '\'' +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public record(String ID, Date date, String value) {

        this.ID = ID;
        this.date = date;
        this.value = value;
    }
}

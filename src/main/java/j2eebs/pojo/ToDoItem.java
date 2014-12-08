package j2eebs.pojo;

import java.sql.Date;

/**
 * Created by jiachiliu on 11/22/14.
 */
public class ToDoItem {
    private Long id;
    private String description;
    private Date datetime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToDoItem)) return false;

        ToDoItem toDoItem = (ToDoItem) o;

        if (datetime != null ? !datetime.equals(toDoItem.datetime) : toDoItem.datetime != null) return false;
        if (description != null ? !description.equals(toDoItem.description) : toDoItem.description != null)
            return false;
        if (id != null ? !id.equals(toDoItem.id) : toDoItem.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (datetime != null ? datetime.hashCode() : 0);
        return result;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Long getId() {

        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getDatetime() {
        return datetime;
    }
}

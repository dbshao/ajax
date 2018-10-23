package entiy;

import java.util.Arrays;

/**
 * Created by itachi on 2017/1/8.
 */
public class City {
    private String[] id;
    private String[] name;

    public String[] getId() {
        return id;
    }

    public String[] getName() {
        return name;
    }

    public void setId(String[] id) {
        this.id = id;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("City{");
        sb.append("id=").append(id == null ? "null" : Arrays.asList(id).toString());
        sb.append(", name=").append(name == null ? "null" : Arrays.asList(name).toString());
        sb.append('}');
        return sb.toString();
    }
}

import java.beans.ConstructorProperties;
import java.lang.reflect.Constructor;

import javax.management.ConstructorParameters;

public class Organ {
    private String name;
    private String condition;

    public Organ(String name, String condition) {
        this.name = name;
        this.condition = condition;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return this.condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

}

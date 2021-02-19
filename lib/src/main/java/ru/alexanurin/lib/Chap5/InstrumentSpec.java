package ru.alexanurin.lib.Chap5;

import org.omg.CORBA.OBJ_ADAPTER;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class InstrumentSpec {

    private Map properties;

    public InstrumentSpec(Map properties) {
        if (properties == null) {
            this.properties = new HashMap();
        } else {
            this.properties = new HashMap(properties);
        }
    }

    public Object getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    public Map getProperties() {
        return properties;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        for (Iterator i = otherSpec.getProperties().keySet().iterator(); i.hasNext(); ) {
            String properyName = (String) i.next();
            if (!properties.get(properyName).equals(otherSpec.getProperty(properyName))) {
                otherSpec.getProperty(properyName);
                return false;
            }
        }
        return true;
    }
}

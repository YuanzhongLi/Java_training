package prototype_pattern;

import java.util.HashMap;
import java.util.Map;

public class PrototypeKeeper {
    private Map<String, Cloneable> map;
    public PrototypeKeeper() {
        this.map = new HashMap<String, Cloneable>();
    }

    public void add(String key, Cloneable prototype) {
        map.put(key, prototype);
    }

    public Cloneable getClone(String key) {
        Cloneable prototype = map.get(key);
        return prototype.creatClone();
    }
}

package spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SpringCollection {

    private Set<String> setNames;
    private List<String> listNames;
    private Map<Integer,String> mapNames;

    public Set<String> getSetNames() {
        return setNames;
    }

    public void setSetNames(Set<String> setNames) {
        this.setNames = setNames;
    }

    public List<String> getListNames() {
        return listNames;
    }

    public void setListNames(List<String> listNames) {
        this.listNames = listNames;
    }

    public Map<Integer, String> getMapNames() {
        return mapNames;
    }

    public void setMapNames(Map<Integer, String> mapNames) {
        this.mapNames = mapNames;
    }
}

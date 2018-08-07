package liuchen;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


/*用来完成注入集合*/
public class JavaCollection {
    List addressList;
    Set addressSet;
    Map addressMap;
    Properties addressPro;

    public List getAddressList() {
        System.out.println("List Elements:" + addressList);
        return addressList;
    }

    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    public Set getAddressSet() {
        System.out.println("Set Elements:" + addressSet);
        return addressSet;
    }

    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }

    public Map getAddressMap() {
        System.out.println("Map Elements:" + addressMap);
        return addressMap;
    }

    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    public Properties getAddressPro() {
        System.out.println("Properties Elemenets:" + addressPro);
        return addressPro;
    }

    public void setAddressPro(Properties addressPro) {
        this.addressPro = addressPro;
    }
}

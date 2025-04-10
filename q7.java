import java.util.*;
class Address {
    private int plotNo;
    private String at;
    private String post;
    public Address(int plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }
    @Override
    public String toString() {
        return "Plot No: " + plotNo + ", At: " + at + ", Post: " + post;
    }
}

public class q7 {
    public static void main(String[] args) {
        TreeMap<String, Address> addressMap = new TreeMap<>();
        addressMap.put("Somaya", new Address(101, "Bareilly", "UttarPradesh"));
        addressMap.put("Anurag", new Address(202, "Jamshedpur", "Jharkhand"));
        addressMap.put("Piyush", new Address(303, "Gaya", "Bihar"));
        Iterator<Map.Entry<String, Address>> iterator = addressMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Address> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Address: " + entry.getValue());
        }
    }
}

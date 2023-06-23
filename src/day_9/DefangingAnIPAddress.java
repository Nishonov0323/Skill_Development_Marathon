package src.day_9;

public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        String[] str = address.split("\\.");
        StringBuilder sb = new StringBuilder();
        sb.append(str[0]);
        for (int i = 1; i < str.length; i ++) {
            sb.append("[").append(".").append("]").append(str[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new DefangingAnIPAddress().defangIPaddr("1.1.1.1"));
    }

}

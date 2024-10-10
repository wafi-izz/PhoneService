package leet_code;

public class StringReplace {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("192.169.1.2"));
    }
    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}

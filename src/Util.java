public class Util {

    public boolean checkValidMACAddress(String macAddress) {
        final String regex = "^[a-fA-F0-9]{2}:([a-fA-F0-9]{2}:){4}[a-fA-F0-9]{2}$";
        return macAddress.matches(regex);
    }

    public boolean checkValidIPAddress(String ip) {
        final String regex = "^([0-9])";
        return ip.matches(regex);
    }


}

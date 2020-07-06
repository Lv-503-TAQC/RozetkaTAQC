package pageobjects.helpers;

public class Hacks {
    public static String sms(String str) {
        return sms(str, "x");
    }
    public static String sms(String str, String border) {
        String sticks = "";
        for(int i = 0; i < str.length() && i < 30; i++) {
            sticks += border;
        }
        return sticks + "\n" + str + "\n" + sticks;
    }
}

package my.com.teleport.util;

import java.util.Random;

public class TrackingUtil {
    private static final String ALPHANUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final Random RANDOM = new Random();

    public static String generateTrackingId(String category, String origin_country_id, String destination_country_id) {
        String randomStr = generateRandomString(8);
        StringBuilder sb = new StringBuilder(12);
        sb.append(category);
        sb.append("-");
        sb.append(origin_country_id);
        sb.append(randomStr);
        sb.append(destination_country_id);
        return sb.toString();
    }

    public static String generateRandomString(int strLength) {
            StringBuilder sb = new StringBuilder(strLength);
            for (int i = 0; i < strLength; i++) {
                sb.append(ALPHANUMERIC.charAt(RANDOM.nextInt(ALPHANUMERIC.length())));
            }
            return sb.toString();
    }
}

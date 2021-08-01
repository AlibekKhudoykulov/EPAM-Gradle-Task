public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (((int) ch >= 48 && (int) ch <= 57)) {
                    if ((i != 0) && ((int) str.charAt(i - 1) == 45)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

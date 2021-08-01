public class Main {
    public static void main(String[] args) {
        boolean positiveNumber = StringUtils.isPositiveNumber("-5");
        if (positiveNumber) System.out.println("NUMBER IS POSITIVE");
        else System.out.println("NUMBER IS NEGATIVE");
    }
}

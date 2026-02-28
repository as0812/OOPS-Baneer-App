

public class OOPSBannerUC3 {

    public static void main(String[] args) {

        String line1 = String.join(" ",
                "O O O O", "  P P P P", "  S S S S");

        String line2 = String.join(" ",
                "O       O", " P       P", " S");

        String line3 = String.join(" ",
                "O       O", " P P P P", "  S S S S");

        String line4 = String.join(" ",
                "O       O", " P", "          S");

        String line5 = String.join(" ",
                "O O O O", "  P", "      S S S S");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}
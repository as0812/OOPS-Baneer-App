public class OOPSBannerUC4 {

    public static void main(String[] args) {

        String[] banner = new String[5];

        banner[0] = String.join(" ", "O O O O", "  O O O O", "  P P P P", "  S S S S");
        banner[1] = String.join(" ", "O       O", " O       O", " P       P", " S");
        banner[2] = String.join(" ", "O       O", " O       O", " P P P P", "  S S S S");
        banner[3] = String.join(" ", "O       O", " O       O", " P", "          S");
        banner[4] = String.join(" ", "O O O O", "  O O O O", "  P", "      S S S S");

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
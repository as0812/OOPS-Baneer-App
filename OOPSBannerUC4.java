public class OOPSBannerUC4 {

    public static void main(String[] args) {

        String[] banner = {
                String.join(" ", "O O O O", "  O O O O", "  P P P P", "  S S S S"),
                String.join(" ", "O       O", " O       O", " P       P", " S"),
                String.join(" ", "O       O", " O       O", " P P P P", "  S S S S"),
                String.join(" ", "O       O", " O       O", " P", "          S"),
                String.join(" ", "O O O O", "  O O O O", "  P", "      S S S S")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
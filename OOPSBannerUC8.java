import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    private static final Map<Character, String[]> patternLibrary = new HashMap<>();

    static {
        patternLibrary.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternLibrary.put('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        });

        patternLibrary.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });
    }

    public static void main(String[] args) {

        String word = "OOPS";
        int height = patternLibrary.get('O').length;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(patternLibrary.get(ch)[i]).append("   ");
            }

            System.out.println(line);
        }
    }
}
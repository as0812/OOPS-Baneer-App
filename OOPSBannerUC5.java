public class OOPSBannerUC5 {

    public static void main(String[] args) {

        String star = "*";
        String space = "  ";   // double space for separation

        String[] banner = {
                String.join("", "*****", space, "*****", space, "*****", space, "*****"),
                String.join("", "*   *", space, "*   *", space, "*   *", space, "*"),
                String.join("", "*   *", space, "*****", space, "*****", space, "*****"),
                String.join("", "*   *", space, "*", space, "*   *", space, "    *"),
                String.join("", "*****", space, "*", space, "*****", space, "*****"),
                "",
                "OOPS Banner - UC5"
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
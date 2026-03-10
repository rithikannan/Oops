public class OOPSBannerAppUC3 {
    public static void main(String[] args) {
        System.out.println("OOPS Banner App - UC3: Render using String.join()");
        System.out.println();

        // Each line of the banner is constructed using String.join(" ", ...)
        String[] banner = {
            String.join(" ", "*****", "*****", "*****", "*****"),   // Line 1
            String.join(" ", "*   *", "*   *", "*   *", "*    "),   // Line 2
            String.join(" ", "*   *", "*   *", "*   *", "*    "),   // Line 3
            String.join(" ", "*   *", "*   *", "*****", "*****"),   // Line 4
            String.join(" ", "*   *", "*   *", "*    ", "    *"),   // Line 5
            String.join(" ", "*   *", "*   *", "*    ", "*   *"),   // Line 6
            String.join(" ", "*****", "*****", "*    ", "*****")    // Line 7
        };

        // Print the banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
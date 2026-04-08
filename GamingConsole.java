class GamingConsole {
    static void consoleInfo() {
        System.out.println("PLAYSTATION 5");
        checkStock(true);
    }
    static void checkStock(boolean inStock) {
        System.out.println("In Stock: " + inStock);
        String region = getRegion();
        System.out.println("Region: " + region);
    }
    static String getRegion() {
        return "INDIA";
    }
}
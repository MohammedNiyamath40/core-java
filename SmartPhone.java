class SmartPhone {
    static void showModel() {
        System.out.println("IPHONE 15 PRO");
        checkStorage(256);
    }
    static void checkStorage(int gb) {
        System.out.println("Storage: " + gb + " GB");
        double cost = getPrice();
        System.out.println("Price: $" + cost);
    }
    static double getPrice() {
        return 999.99;
    }
}
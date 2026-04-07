class WashingMachine {
    static void machineBrand() {
        System.out.println("WHIRLPOOL 7KG");
        spinSpeed(1200.0);
    }
    static void spinSpeed(double rpm) {
        System.out.println("Spin Speed: " + rpm + " RPM");
        String warranty = getWarranty();
        System.out.println("Warranty: " + warranty);
    }
    static String getWarranty() {
        return "2 Years";
    }
}

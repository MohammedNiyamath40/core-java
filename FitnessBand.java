class FitnessBand {
    static void bandName() {
        System.out.println("MI SMART BAND 8");
        batteryDays(16);
    }
    static void batteryDays(int days) {
		int bandCost = bandPrice();
        System.out.println(bandCost);
        System.out.println("Battery: " + days + " days");
    }
    static int bandPrice() {
        return 3499;
    }
}
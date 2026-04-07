class VacuumCleaner {
    static void vacuumBrand() {
        System.out.println("DYSON V15");
        suctionPower(240);
    }
    static void suctionPower(int watts) {
        System.out.println("Suction: " + watts + " Watts");
        int vacuumCost = vacuumPrice();
        System.out.println(vacuumCost);
    }
    static int vacuumPrice() {
        return 54999;
    }
}
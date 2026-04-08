class ElectricBike{
    static void bikeName() {
        System.out.println("REVOLT RV400");
        rangePerCharge(150000L);
    }
    static void rangePerCharge(long meters) {
        System.out.println("Range: " + meters + " meters");
        float efficiency = getEfficiency();
        System.out.println("Efficiency: " + efficiency + " km/kWh");
    }
    static float getEfficiency() {
        return 4.5f;
    }
}
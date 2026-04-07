class CoffeeMaker {
    static void makerBrand() {
        System.out.println("PHILIPS COFFEE MAKER");
        cupCapacity(10);
    }
    static void cupCapacity(int cups) {
        System.out.println("Capacity: " + cups + " cups");
        float brewTime = getBrewTime();
        System.out.println("Brew Time: " + brewTime + " mins");
    }
    static float getBrewTime() {
        return 5.5f;
    }
}
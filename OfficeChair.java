class OfficeChair {
    static void chairName() {
        System.out.println("ERGONOMIC CHAIR");
        adjustHeight(45.5f);
    }
    static void adjustHeight(float cm) {
        System.out.println("Height: " + cm + " cm");
        int maxWeight = getWeightCapacity();
        System.out.println("Max Weight: " + maxWeight + " kg");
    }
    static int getWeightCapacity() {
        return 120;
    }
}

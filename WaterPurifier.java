class WaterPurifier {
    static void purifierName() {
        System.out.println("KENT GRAND+");
        filterType('R');
    }
    static void filterType(char type) {
        System.out.println("Filter Type: " + type + "O");
        long serviceNumber = getServiceNumber();
        System.out.println("Service No: " + serviceNumber);
    }
    static long getServiceNumber() {
        return 5551234567L;
    }
}
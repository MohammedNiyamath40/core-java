class SmartWatch {
    static void watchModel() {
        System.out.println("APPLE WATCH ULTRA");
        batteryLife(36.5f);
    }
    static void batteryLife(float hours) {
        System.out.println("Battery: " + hours + " hours");
        long serialNo = getSerialNumber();
        System.out.println("Serial No: " + serialNo);
    }
    static long getSerialNumber() {
        return 9876543210L;
    }
}
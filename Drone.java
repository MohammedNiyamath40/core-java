class Drone {
    static void droneModel() {
        System.out.println("DJI MINI 4 PRO");
        setMode("SPORT");
    }
    static void setMode(String mode) {
        System.out.println("Flight Mode: " + mode);
        boolean isGpsEnabled = checkGps();
        System.out.println("GPS Enabled: " + isGpsEnabled);
    }
    static boolean checkGps() {
        return true;
    }
}
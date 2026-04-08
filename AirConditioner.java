class AirConditioner {
    static void acName() {
        System.out.println("DAIKIN 1.5 TON");
        setTemperature((byte)24);
    }
    static void setTemperature(byte temp) {
        System.out.println("Temperature: " + temp + "°C");
        short coolingPower = getCoolingPower();
        System.out.println("Cooling Power: " + coolingPower + " BTU");
    }
    static short getCoolingPower() {
        return 18000;
    }
}
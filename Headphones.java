class Headphones {
    static void headphoneModel() {
        System.out.println("SONY WH-1000XM5");
        noiseCancellation(100);
    }
    static void noiseCancellation(int percent) {
        System.out.println("Noise Cancellation: " + percent + "%");
        int hpPrice = headphoneCost();
        System.out.println(hpPrice);
    }
    static int headphoneCost() {
        return 29999;
    }
}
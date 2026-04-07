class SmartSpeaker {
    static void speakerModel() {
        System.out.println("AMAZON ECHO DOT");
        setVolume(75L);
    }
    static void setVolume(long level) {
        System.out.println("Volume Level: " + level);
        boolean isAlexaEnabled = checkAlexa();
        System.out.println("Alexa Enabled: " + isAlexaEnabled);
    }
    static boolean checkAlexa() {
        return true;
    }
}
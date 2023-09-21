class TelevisionTester {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Television.onOrOff();
        Television.increaseChannel();
        Television.increaseChannel();
        Television.changeChannelNumber(0);
        Television.increaseChannel();
        Television.increaseChannel();
        Television.increaseChannel();
        Television.increaseVolume();
        Television.increaseVolume();
        Television.increaseVolume();
        Television.increaseVolume();
        Television.changeChannelNumber(9);
        Television.increaseVolume();
        Television.increaseVolume();
        Television.increaseVolume();
        Television.onOrOff();
        Television.increaseVolume();
        Television.decreaseVolume();
        Television.decreaseChannel();
        Television.increaseChannel();
        Television.onOrOff();
        Television.decreaseChannel();
        Television.decreaseChannel();
        Television.decreaseChannel();
        Television.decreaseChannel();
        Television.changeChannelNumber(40);
        Television.decreaseChannel();
        Television.decreaseVolume();
        Television.decreaseVolume();
        Television.decreaseVolume();
        Television.decreaseVolume();
        Television.decreaseVolume();
        Television.decreaseVolume();
        System.out.println("Main Ended");
    }
}

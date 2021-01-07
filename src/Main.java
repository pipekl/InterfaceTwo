public class Main {

    public static void main(String[] args) {
        Guitar guitar1 = new Guitar();
        guitar1.quantityStrings = 7;
        Drum drum1 = new Drum();
        drum1.size = 10;
        Trumpet trumpet1 = new Trumpet();
        trumpet1.diameter = 28;

        Instrument[] array = {guitar1, drum1, trumpet1};

        for (Instrument instrument : array)
            instrument.play();
    }
}

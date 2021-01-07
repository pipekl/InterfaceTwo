public class Trumpet implements Instrument {
    int diameter;

    public void play() {
        System.out.println("Играет труба, её диаметр: " + this.diameter);
    }
}

public class Drum implements Instrument {
    int size;

    public void play() {
        System.out.println("Играет барабан, его размер: " + this.size);
    }
}

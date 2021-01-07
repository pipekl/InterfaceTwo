public class Guitar implements Instrument {
    int quantityStrings;

    public void play() {
        System.out.println("Играет гитара, количество струн: " + this.quantityStrings);
    }
}

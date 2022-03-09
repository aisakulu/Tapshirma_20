package Peaksoft;

public class Car implements AutoCloseable {

    void drive() {
        System.out.println("Машина журуп жатат!");
    }

    public void close() {
        System.out.println("Машина жабылып жатат!");
    }

}

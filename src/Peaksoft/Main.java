package Peaksoft;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try (Car car = new Car()){
            car.drive();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

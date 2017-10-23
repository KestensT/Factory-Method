public class VolvoFactory extends Factory {

    @Override
    protected Car createCar(String type) {
     return new Volvo();
    }
}

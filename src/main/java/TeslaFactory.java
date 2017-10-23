public class TeslaFactory extends Factory{

    @Override
    protected Car createCar(String type) {
        return  new Tesla();
    }
}

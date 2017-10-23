public abstract class Factory {

    public Car orderCar(String type) {
        Car car;

        car = createCar(type);

        return car;
    }

    protected abstract Car createCar(String type);

}


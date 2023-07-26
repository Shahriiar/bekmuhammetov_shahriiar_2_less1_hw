public class Cars {
    private int year;
    private CarDealership carDealership;
    private CarColor carColor;

    public Cars(int year , CarDealership carDealership , CarColor carColor) {
        this.year = year;
        this.carDealership = carDealership;
        this.carColor = carColor;
    }


    public int getYear() {
        return year;
    }

    public CarDealership getCarDealership() {
        return carDealership;
    }

    public CarColor getCarColor() {
        return carColor;
    }
}

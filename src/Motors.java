final public class Motors extends CarsModel {
    private int valve = 12;
    private int weight = 700;

    public Motors(int year, CarDealership carDealership, CarColor carColor, String model, int horsePower) {
        super(year, carDealership, carColor, model, horsePower);
    }

    public int getValve() {
        return valve;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nMachine valves : " + valve +
                "\nMotor weight : " +weight;
    }
}

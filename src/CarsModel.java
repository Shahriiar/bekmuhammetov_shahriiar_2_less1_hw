public class CarsModel extends Cars{

    private String model;
    private int horsePower;

    public CarsModel(int year, CarDealership carDealership, CarColor carColor, String model, int horsePower) {
        super(year, carDealership, carColor);
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    final public void makeSound(){
        System.out.println("Wrooooooom");
    }
    public void makeSound(String sound){
        System.out.println(sound + "Ra ta ta ta ta");
    }

    public String getInfo(){
        return "Cars year : " + getYear() +
                "\nCars model : " + model +
                "\nCars HP : " +horsePower+
                "\nDealer address : " + getCarDealership().getAddress() +
                "\nDealer name : " + getCarDealership().getName();
    }

}

public class Main {
    public static void main(String[] args) {
        CarDealership carDealership = new CarDealership("Aitmatova 37 " , "Mercedes Centre");
        CarDealership carDealership2 = new CarDealership("Chkalova 42 " , "Toyota Centre");
        CarDealership carDealership3 = new CarDealership("Boronchieva 37" , "Cadillac Centre");
    CarsModel car = new CarsModel(2022 ,carDealership,CarColor.BLACK,"CLS AMG 63S",777 );
    Motors motors = new Motors(2019 , carDealership2 ,CarColor.DARK_GREEN , "Nissan GTR R35 NISMO" ,800);
    Motors motors1 = new Motors(2023 , carDealership3 , CarColor.WHITE , "Cadillac Escalade SE",920);
        System.out.println(car.getInfo());
        System.out.println("--------------------------------");
        System.out.println(motors1.getInfo());
        System.out.println("--------------------------------");
        System.out.println(motors.getInfo());
        car.makeSound();
        car.makeSound("Stfutututu ");
    }
}
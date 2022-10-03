public class Vehicle {
    private String sportsCar;
    private String familyCar;
    private String economyCar;

    public Vehicle(String sportsCar, String familyCar, String economyCar) {
        this.sportsCar = sportsCar;
        this.familyCar = familyCar;
        this.economyCar = economyCar;
    }

    public String getSportsCar() {
        return sportsCar;
    }

    public void setSportsCar(String sportsCar) {
        this.sportsCar = sportsCar;
    }

    public String getFamilyCar() {
        return familyCar;
    }

    public void setFamilyCar(String familyCar) {
        this.familyCar = familyCar;
    }

    public String getEconomyCar() {
        return economyCar;
    }

    public void setEconomyCar(String economyCar) {
        this.economyCar = economyCar;
    }


    public static class Car extends Vehicle{

        public Car (String sportsCar, String familyCar, String economyCar) {
            super(sportsCar, familyCar, economyCar);
        }
    }

    public static void main(String[] args) {

        Car car = new Car("Ferrari","Audi","Perado");
        System.out.println("SportCar is :"+ car.getSportsCar());
        System.out.println("FamilyCar is :"+ car.getFamilyCar());
        System.out.println("EconomyCar is :"+ car.getEconomyCar());
    }
}

package instance;

class Car {
    static String showroomName="Dell";
    String modelName;
    int price;

    void displayDetails() {
        System.out.println("Showroom Name : " + showroomName);
        System.out.println("Car Model : " + modelName);
        System.out.println("Car Price : " + price);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.modelName="Tesla Model S";
        car1.price=80000;
        car1.displayDetails();
        
        car2.modelName="BMW X5";
        car2.price=75000;
        car2.displayDetails();
      
    }
}


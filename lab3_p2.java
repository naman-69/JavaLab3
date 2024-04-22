import java.util.Scanner;
public class lab3_p2 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the make: ");
     String make = sc.nextLine();
     System.out.println("Enter the model: ");
     String model = sc.nextLine();
     System.out.println("Enter the year: ");
     int year = sc.nextInt();
     System.out.println("Enter the fuel type: ");
     String fuelType = sc.next();
     System.out.println("Enter the distance: ");
     double distance = sc.nextDouble();
     System.out.println("Enter the fuel efficiency: ");
     double fuelEfficiency = sc.nextDouble();
     System.out.println("Enter the maximum speed: ");
     double maxSpeed = sc.nextDouble();
     Vehicle v = new Vehicle(make, model, year, fuelType, distance, fuelEfficiency, maxSpeed);
     System.out.println("Fuel Efficiency: " + v.fuelEfficiency());
     System.out.println("Distance Travelled: " + v.distanceTravelled());
     System.out.println("Maximum Speed: " + v.maxSpeed());
 }
 static class Vehicle {
     private String make;
     private String model;
     private int year;
     private String fuelType;
     private double distance;
     private double fuelEfficiency;
     private double maxSpeed;
     Vehicle(String make, String model, int year, String fuelType, double distance, double fuelEfficiency, double maxSpeed){
         this.make = make;
         this.model = model;
         this.year = year;
         this.fuelType = fuelType;
         this.distance = distance;
         this.fuelEfficiency = fuelEfficiency;
         this.maxSpeed = maxSpeed;
     }
     double fuelEfficiency(){
         return distance / fuelEfficiency;
     }
     double distanceTravelled(){
         return distance;
     }
     double maxSpeed(){
         return maxSpeed;
     }
 }
}
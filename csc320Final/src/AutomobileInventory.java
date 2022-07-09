import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AutomobileInventory {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    private ArrayList<AutomobileInventory> vehicleList;
    private final static String FILENAME = "/home/lilletdown/Documents/SCHOOL/CSC320/module8/AutoMobileList.txt";
    static String answer;
    static boolean YN;

    public AutomobileInventory() {
        vehicleList = new ArrayList<>();
    }

    public AutomobileInventory(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    //GETTERS
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    public int getMileage() {
        return mileage;
    }

    //SETTERS
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    //add
    public void addVehicle(AutomobileInventory vehicle) {
        vehicleList.add(vehicle);
        System.out.println("\nThe " + vehicle.getMake()+ " " + vehicle.getModel()+ " has been added to the inventory.");
        Display();
    }

    //remove
    public void removeVehicle(String make, String model, String color, int year, int mileage) {
        for (int i=0;i<vehicleList.size();i++) {
            AutomobileInventory vehicle = vehicleList.get(i);
            if (vehicle.getMake().equalsIgnoreCase(make)
                    && vehicle.getModel().equalsIgnoreCase(model)
                    && vehicle.getColor().equalsIgnoreCase(color)
                    && vehicle.getYear()==year
                    && vehicle.getMileage()==mileage) {
                System.out.println("The " + vehicle.getMake() + " " + vehicle.getModel()  + " has been removed.");
                vehicleList.remove(vehicle);
            }
        }
    }
    //update
    public void updateVehicle(String makeOld, String modelOld, String colorOld, int yearOld, int
            mileageOld, String makeNew, String modelNew, String colorNew, int yearNew, int mileageNew) {

        for (int i=0;i<vehicleList.size();i++) {
            AutomobileInventory vehicle = vehicleList.get(i);

            if (vehicle.getMake().equalsIgnoreCase(makeOld) &&
                    vehicle.getModel().equalsIgnoreCase(modelOld)
                    && vehicle.getColor().equalsIgnoreCase(colorOld) &&
                    vehicle.getYear()==yearOld
                    && vehicle.getMileage()==mileageOld) {

                        vehicle.setMake(makeNew);
                        vehicle.setModel(modelNew);
                        vehicle.setColor(colorNew);
                        vehicle.setYear(yearNew);
                        vehicle.setMileage(mileageNew);

                System.out.println("\nThe " + vehicle.getMake()+ " " + vehicle.getModel()+ " has been updated and added to the inventory.");
                Display();
            }
        }
    }

    //User 'GUI'
    public void Display() {
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter(FILENAME);
            bw = new BufferedWriter(fw);
            System.out.println("\nVehicles Information:\n");
            for (int i=0;i<vehicleList.size();i++) {
                AutomobileInventory vehicle = vehicleList.get(i);
                System.out.println("Vehicle "+(i+1)+":");
                bw.write("Vehicle "+(i+1)+":");
                bw.newLine();
                System.out.println("Make: " + vehicle.getMake());
                bw.write("Make: " + vehicle.getMake());
                bw.newLine();
                System.out.println("Model: " + vehicle.getModel());
                bw.write("Model: " + vehicle.getModel());
                bw.newLine();
                System.out.println("Color: " + vehicle.getColor());
                bw.write("Color: " + vehicle.getColor());
                bw.newLine();
                System.out.println("Year: " + vehicle.getYear());
                bw.write("Year: " + vehicle.getYear());
                bw.newLine();
                System.out.println("Mileage: " + vehicle.getMileage());
                bw.write("Mileage: " + vehicle.getMileage());
                bw.newLine();
                bw.newLine();
                System.out.println("");
            }
            bw.flush();// Flushing File Write

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
                try {
                    if (bw != null) {
                        bw.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
    }

    //main
    public static void main (String[] args) {
        AutomobileInventory automobile = new AutomobileInventory();
        Scanner userInput = new Scanner(System.in);
        while(true) {
            System.out.println("\nSelect An Option Below:");
            System.out.println("Enter 1 for Add Vehicle");
            System.out.println("Enter 2 for Update Vehicle");
            System.out.println("Enter 3 for Remove Vehicle");
            System.out.println("Enter 4 for Display Vehicles");
            System.out.println("Enter 5 to Print to File");
            System.out.println("Enter 6 for Close Program");
            System.out.print("Chosen option: ");
            int option = userInput.nextInt();
            userInput.nextLine();
            if (option == 1) {
                System.out.println("\nEnter Vehicle Information to Add:");
                System.out.print("Enter Make: ");
                String maker = userInput.nextLine();
                System.out.print("Enter Model: ");
                String model = userInput.nextLine();
                System.out.print("Enter Color: ");
                String color = userInput.nextLine();
                System.out.print("Enter Year: ");
                int year = userInput.nextInt();
                userInput.nextLine();
                System.out.print("Enter Mileage: ");
                int mileage = userInput.nextInt();
                userInput.nextLine();

                AutomobileInventory vehicle = new AutomobileInventory(maker,
                        model, color, year, mileage);
                automobile.addVehicle(vehicle);
            } else if (option == 2) {
                System.out.println("\nEnter Old Vehicle Information to Update:");
                System.out.print("Enter Make: ");
                String makerOld = userInput.nextLine();
                System.out.print("Enter Model: ");
                String modelOld = userInput.nextLine();
                System.out.print("Enter Color: ");
                String colorOld = userInput.nextLine();
                System.out.print("Enter Year: ");
                int yearOld = userInput.nextInt();
                userInput.nextLine();
                System.out.print("Enter Mileage: ");
                int mileageOld = userInput.nextInt();
                userInput.nextLine();
                System.out.println("\nEnter New Vehicle Information to Update:");
                System.out.print("Enter Make: ");
                String makerNew = userInput.nextLine();
                System.out.print("Enter Model: ");
                String modelNew = userInput.nextLine();
                System.out.print("Enter Color: ");
                String colorNew = userInput.nextLine();
                System.out.print("Enter Year: ");
                int yearNew = userInput.nextInt();
                userInput.nextLine();
                System.out.print("Enter Mileage: ");
                int mileageNew = userInput.nextInt();
                userInput.nextLine();
                automobile.updateVehicle(makerOld, modelOld, colorOld,
                        yearOld, mileageOld,
                        makerNew, modelNew, colorNew, yearNew,
                        mileageNew);
            } else if (option == 3) {
                System.out.println("\nEnter Vehicle Information to Remove:");
                System.out.print("Enter Maker: ");
                String maker = userInput.nextLine();
                System.out.print("Enter Model: ");
                String model = userInput.nextLine();
                System.out.print("Enter Color: ");
                String color = userInput.nextLine();
                System.out.print("Enter Year: ");
                int year = userInput.nextInt();
                userInput.nextLine();
                System.out.print("Enter Mileage: ");
                int mileage = userInput.nextInt();
                userInput.nextLine();
                automobile.removeVehicle(maker, model, color, year, mileage);
            } else if (option == 4) {
                automobile.Display();
            } else if (option == 5) {
                System.out.print("Print to file? Y/N: ");
                while (true) {
                    answer = userInput.nextLine().trim().toUpperCase();
                    if (answer.equals("Y")) {
                        YN = true;
                        System.out.println("Printing to file...");
                        automobile.Display();
                        System.out.println("Vehicles Saved!");
                        break;
                    }if(answer.equals("N")) {
                        YN = false;
                        System.out.println("Did not print to file.");
                        break;
                    }
                }
            } else {
                System.out.println("Program Closing");
                break;
            }
        }
        userInput.close();
    }
}

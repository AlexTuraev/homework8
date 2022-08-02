import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printSeparator("Task1");
        printIsLeapYear(2022);
        printSeparator("Task2");
        identifyAndPrintAppVersion(0, 2022);
        printSeparator("Task3");
        int deliveryDays = getNumberOfDeliveryDays(95);
        printNumberOfDeliveryDays(deliveryDays);

    }

    // Task1 Homework8
    public static void printIsLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " is leap year");
        } else{
            System.out.println(year + " isn't leap year");
        }
    }

    // Task1 Homework8
    public static void identifyAndPrintAppVersion(int clientOS, int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear < currentYear){
            System.out.println("Install iOS light version by following link");
        } else if (clientOS == 1 && clientDeviceYear < currentYear){
            System.out.println("Install Android light version by following link");
        } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Install iOS version by following link");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Install Android version by following link");
        }
    }

    public static int getNumberOfDeliveryDays(int distance){
        int timeDelivery = 1;
        if (distance > 20 && distance <= 60){
            timeDelivery++;
        } else if (distance > 60 && distance <= 100){
            timeDelivery += 2;
        }
        return timeDelivery;
    }

    public static void printNumberOfDeliveryDays(int deliveryDays){
        if (deliveryDays == 1){
            System.out.println("Доставка займет " + deliveryDays + " день");
        } else if(deliveryDays == 2 || deliveryDays == 3){
            System.out.println("Доставка займет " + deliveryDays + " дня");
        }
    }
    public static void printSeparator(String str){
        System.out.println("\n======================= " + str + " =======================\n");
    }
}
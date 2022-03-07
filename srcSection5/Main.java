public class Main {

    public static void main(String[] args) {
	int value = 1;
    if(value == 1) {
        System.out.println("Value was 1");
    } else if(value == 2) {
        System.out.println("Value was 2");
    } else {
        System.out.println("Value was not one or two");
    }

    int switchValue = 4;
    switch(switchValue) {
        case 1:
            System.out.println("Value was one");
            break;

        case 2:
            System.out.println("Value was two");
            break;

        case 3: case 4: case 5:
            System.out.println("Was a three, four, or five");
            System.out.println(switchValue);
            break;

        default:
            System.out.println("Value was not one or two");
            break;
    }


    char charValue = 'j';
    switch(charValue) {
        case 'a':
            System.out.println("This is an A");
            break;
        case 'b':
            System.out.println("This is a B");
            break;
        case 'c':
            System.out.println("This is a C");
            break;
        case 'd':
            System.out.println("This is a D");
            break;
        case 'e':
            System.out.println("This is an E");
            break;
        default:
            System.out.println("Your letter was not found");
    }

    String month = "January";
    switch (month.toLowerCase()) {
        case "january":
            System.out.println("Jan");
            break;
        case "february":
            System.out.println("Feb");
            break;
        case "october":
            System.out.println("Oct");
            break;
        default:
            System.out.println("Not sure");
            break;
    }

    printDayOfTheWeek(2);
    printDayOfTheWeekELSE(2);


    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }

    public static void printDayOfTheWeekELSE(int day) {
        if(day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2 ) {
            System.out.println("Tuesday");
        } else {
            System.out.println("Invalid Day");
        }
        // ETC
    }
}

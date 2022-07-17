public class Exercises2 {

    public static void main(String[] args) {

        //IF EXAMPLE
        int number = -5;
        if (number > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

        //WHILE EXAMPLE
       int counter = 0;
        while (counter < 3) {
            counter++;
            System.out.println("Iteration " + counter);
        }

        //DO WHILE EXAMPLE
        do {
            counter++;
            System.out.println("Iteration Do while " + counter);
        }
        while (counter < 0);

        //FOR EXAMPLE
        for (int forNumber = 0; forNumber <= 3; forNumber++) {
            System.out.println(forNumber);
        }

        //SWITCH EXAMPLE

        String season = "Summer";
        switch (season) {
            case "Summer":
                System.out.println("Summer");
                break;
            case "Autumn":
                System.out.println("Autumn");
                break;
            case "Winter":
                System.out.println("Winter");
                break;
            case "Spring":
                System.out.println("Spring");
                break;
            default:
                System.out.println("Invalid enter, try again");
        }
    }
}

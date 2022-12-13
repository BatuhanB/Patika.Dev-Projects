import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your grades: ");
        System.out.print("Psychs: ");
        var psychs = scanner.nextFloat();
        System.out.print("Math: ");
        var math = scanner.nextFloat();
        System.out.print("History: ");
        var history = scanner.nextFloat();
        System.out.print("Music: ");
        var music = scanner.nextFloat();
        System.out.print("Turkish: ");
        var turkish = scanner.nextFloat();
        System.out.print("Chemistry: ");
        var chemistry = scanner.nextFloat();

        float sum = 0;
        sum = (math + psychs + history + music + turkish + chemistry);
        float average = CalculateAverage(sum);
        PrintMessage(average);
    }

    private static float CalculateAverage(float sum) {
        float average = 0;
        average = sum / 6;
        return average;
    }

    private static void PrintMessage(float average) {
        if (average > 60) {
            System.out.println("You have passed the class!");
        } else {
            System.out.println("Sorry! You have not passed the class!");
        }
    }
}
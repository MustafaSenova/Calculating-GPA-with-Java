import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math,pyhsics,history,music,turkish,chemistry;

        // define the input class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Math grade :");
        math = input.nextInt();

        System.out.println("Enter your Pyhsics grade :");
        pyhsics = input.nextInt();

        System.out.println("Enter your History grade :");
        history = input.nextInt();

        System.out.println("Enter your Music grade :");
        music = input.nextInt();

        System.out.println("Enter your Turkish grade :");
        turkish = input.nextInt();

        System.out.println("Enter your Chemistry grade :");
        chemistry = input.nextInt();

        double sum = ( math + music + pyhsics + history + turkish + chemistry);
        double average = sum  / 6 ;

        System.out.println("Your average is : " + average);

        String result = (average > 60) ?  "Congratulations! You passed the class" : "You Failed" ;
        System.out.println(result);
    }
}

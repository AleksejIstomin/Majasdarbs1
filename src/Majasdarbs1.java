import java.util.Scanner;

public class Majasdarbs1 {
        public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
              //  int colorRange = 100;  //  Enter range here (visible range from 380 to 750, invisible range all others)
                System.out.print("Input a number: ");
                int colorRange = in.nextInt();

                if ((colorRange >= 380) && (colorRange <= 449)) {
                        System.out.println("violet");
                } else if ((colorRange >= 450) && (colorRange <= 494)) {
                        System.out.println("blue");
                } else if ((colorRange >= 495) && (colorRange <= 569)) {
                        System.out.println("green");
                } else if ((colorRange >= 570) && (colorRange <= 589)) {
                        System.out.println("yellow");
                } else if ((colorRange >= 590) && (colorRange <= 619)) {
                        System.out.println("orange");
                } else if ((colorRange >= 620) && (colorRange <= 750)) {
                        System.out.println("red");
                } else {
                        System.out.println("Invisible light");
                }
        }
}

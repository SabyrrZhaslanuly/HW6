import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest;
        double average;
        double smallest;
        //todo дописать логику программы ниже.

        /*if (first >= second && first >= third) {
            greatest = first;
        } else if (second >= first && second >= third) {
            greatest = second;
        } else {
            greatest = third;
        }*/
        greatest = (first >= second && first >= third) ? first :
                (second >= first && second >= third) ? second : third;

        /*if (first <= second && first <= third) {
            smallest = first;
        } else if (second <= first && second <= third) {
            smallest = second;
        } else {
            smallest = third;
        }*/

        smallest = (first <= second && first <= third) ? first :
                (second <= first && second <= third) ? second : third;

        double sumOfNumbers = first + second + third;

        average = sumOfNumbers - greatest - smallest;

        //todo


        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}

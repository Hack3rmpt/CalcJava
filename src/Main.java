import java.security.PublicKey;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберете действие:\nСложение - 1:\nВычетание - 2:\nУмножение - 3:\nДеление - 4:\nВозведение в степень - 5:\nФакториал - 6:");


        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {

                int vibor = scanner.nextInt();
                int a = scanner.nextInt();
                int b = scanner.nextInt();


                if (vibor == 1) {
                    cloj(a, b);
                } else if (vibor == 2) {
                    vijitanie(a, b);
                } else if (vibor == 3) {
                    ymnojenie(a, b);
                } else if (vibor == 4) {
                    if (b == 0) {
                        System.out.println("Деление на ноль не возможно");
                    } else {
                        delenie(a, b);
                    }
                } else if (vibor == 5) {
                    stepen(a, b);
                } else if (vibor == 6) {
                    factorial(a);
                } else {
                    System.out.println("Вы ввели не существующее действие");
                }
            }

        }
        catch(Exception e){
            System.out.println("Вы ввели некорректные данные");

        }
    }
    public static void cloj(int a, int b) {
        int peremenaya;
        peremenaya = a + b;
        System.out.println(peremenaya);
    }

    public static void vijitanie(int a, int b) {
        int peremenaya;
        peremenaya = a - b;
        System.out.println(peremenaya);
    }

    public static void ymnojenie(int a, int b) {
        int peremenaya;
        peremenaya = a * b;
        System.out.println(peremenaya);
    }

    public static void delenie(int a, int b) {
        int peremenaya;
        peremenaya = a / b;
        System.out.println(peremenaya);
    }

    public static int stepen(int a, int b) {
        double peremenaya;
        peremenaya = Math.pow(a, b);
        System.out.println(peremenaya);
        return a;
    }
    public static void factorial(int a){
        int peremenaya = 1;

        for (int i = 1; i <= a ; i++){
            peremenaya *= i;
        }
        System.out.println(peremenaya);
    }
}
package lab_1;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.sin;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class Basics {

    public static void startAll() {
        Basics.sayHelloWorld();

        Basics.SecondQuestion.start();

        Basics.ThirdQuestion.start();

        Basics.ForthQuestion.start();

        Basics.FifthQuestion.start();

        Basics.SixthQuestion.start();

        Basics.SeventhQuestion.start();
    }

    public static void selectQuestion() {
        Scanner in = new Scanner(System.in);
        int number;
        do {
            System.out.print("Введите номер задания (или 0 для выхода): ");
            number = in.nextInt();

            switch (number) {
                case 1:
                    sayHelloWorld();
                    break;
                case 2:
                    SecondQuestion.start();;
                    break;
                case 3:
                    ThirdQuestion.start();
                    break;
                case 4:
                    ForthQuestion.start();
                    break;
                case 5:
                    FifthQuestion.start();
                    break;
                case 6:
                    SixthQuestion.start();
                    break;
                case 7:
                    SeventhQuestion.start();
                    break;

            }
        } while (number != 0);

    }

    public static void sayHelloWorld() {
        System.out.println("Hello, World!");
    }

    public static class SecondQuestion {

        public static void start() {
            System.out.println("Задача с вещественными числами\nВведите вещественные значения трёх переменных");

            double a;
            double b;
            double c;

            Scanner s = new Scanner(System.in);
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();

            calculate(a, b, c);
        }

        static void calculate(
                double a, double b, double c
        ) {
            double composition = a * b * c;
            double average = (a + b + c) / 3;

            double buff;
            for (int i = 0; i < 2; i++) {
                if (b < a) {
                    buff = a;
                    a = b;
                    b = buff;
                }
                if (c < b) {
                    buff = b;
                    b = c;
                    c = buff;
                }
            }

            System.out.println(composition);
            System.out.println(average);
            System.out.printf("%f, %f, %f\n", a, b, c);
        }
    }

    public static class ThirdQuestion {
        public static void start() {
            System.out.println("Задача с целыми числами\nВведите целые значения трёх переменных");

            int a;
            int b;
            int c;

            Scanner s = new Scanner(System.in);
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();

            calculate(a, b, c);
        }

        public static void calculate(int a, int b, int c) {
            int composition = a * b * c;
            double average = (a + b + c) / 3.0;

            int buff;
            for (int i = 0; i < 2; i++) {
                if (b < a) {
                    buff = a;
                    a = b;
                    b = buff;
                }
                if (c < b) {
                    buff = b;
                    b = c;
                    c = buff;
                }
            }

            System.out.println(composition);
            System.out.printf("%f\n", average);
            System.out.printf("%d, %d, %d\n", a, b, c);
        }
    }

    public static class ForthQuestion {

        public static void start() {
            System.out.println("Задача с вещественными значениями коэффициентов квадратного уравнения\nВведите вещественные значения трёх переменных");
            double a;
            double b;
            double c;

            Scanner s = new Scanner(System.in);
            a = s.nextDouble();
            b = s.nextDouble();
            c = s.nextDouble();

            calculate(a, b, c);
        }

        public static void calculate(
                double a, double b, double c
        ) {
            double D;
            D = b * b - 4 * a * c;

            if (D < 0) {
                System.out.println("Корней нет");
            } else if (D == 0) {
                System.out.println("Решение есть\nОтвет\n");

                double res = -b / (2 * a);
                System.out.printf("%f\n", res);
            } else if (D > 0 && a != 0) {
                System.out.println("Решение есть\nОтвет\n");

                double res1 = -b - sqrt(D) / (2 * a);
                double res2 = -b + sqrt(D) / (2 * a);
                System.out.printf("%f, %f\n", res1, res2);
            } else {
                System.out.println("Решение есть\nОтвет\n");

                double res1 = -c / b;
                System.out.printf("%f\n", res1);
            }
        }
    }

    public static class FifthQuestion {

        public static void start() {
            System.out.println("Табулирование функции sin(x)\nВведите границы табулирования");

            double a;
            double b;
            double step;

            Scanner s = new Scanner(System.in);
            a = s.nextDouble();
            b = s.nextDouble();

            System.out.println("Введите шаг\n");
            step = s.nextDouble();

            calculate(a, b, step);
        }

        public static void calculate(double a, double b, double step) {
            double result;

            while (Math.abs(a - b) < 1e-9 || a < b) {
                System.out.printf("%f - ", a);
                result = sin(a);
                System.out.println(result);
                a = a + step;
            }
        }
    }

    public static class SixthQuestion {

        public static void start() {
            Scanner s = new Scanner(System.in);

            System.out.println("Программа для решения СЛУ\nax + by = c, dx + ey = f");

            System.out.println("Введите необходимые значения a, b, c для первого уравнения");

            double a, b, c;
            a = s.nextDouble();
            b = s.nextDouble();
            c = s.nextDouble();

            System.out.println("Введите необходимые значения d, e, f для второго уравнения");

            double d, e, f;
            d = s.nextDouble();
            e = s.nextDouble();
            f = s.nextDouble();

            calculate(a, b, c, d, e, f);
        }

        public static void calculate(
                double a, double b, double c, double d, double e, double f
        ) {
            double determinateMain;
            double determinate1, determinate2;
            double result1, result2;

            determinateMain = a * e - b * d;
            determinate1 = c * e - b * f;
            determinate2 = a * f - c * d;

            if (determinateMain == 0 && determinate1 != 0 && determinate2 != 0) {
                System.out.println("Система решений не имеет\n");
            } else if (determinateMain == 0 && determinate1 == 0 && determinate2 == 0) {
                System.out.println("Решений бесконечное количество\n");
            } else if (determinateMain != 0) {
                result1 = determinate1 / determinateMain;
                result2 = determinate2 / determinateMain;

                System.out.printf("x = %f, y = %f", result1, result2);
            }
        }
    }

    public static class SeventhQuestion {

        public static void start() {
            Scanner s = new Scanner(System.in);
            double x, accuracy;

            System.out.println("\nРазложение в ряд Тейлора функции e^x\nВведите значение х");
            x = s.nextDouble();

            System.out.println("Введите точность вычисления");
            accuracy = s.nextDouble();

            calculate(x, accuracy);
        }

        public static void calculate(double x, double accuracy) {
            double i = 1;
            double sum = 1;
            double nextsum = x;

            System.out.printf("%f\n", sum);

            while (nextsum > accuracy) {
                i++;
                sum = sum + nextsum;
                nextsum = nextsum * x / i;
                System.out.println(sum);
            }
        }
    }
}
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {

            System.out.println("----Calculator----");
            System.out.println("1) Add!tion");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.println("0) End");
            System.out.println("Select a number from 0-4 ");


            String choice = sc.nextLine();

            if (choice.equals("0")) {
                System.out.println("Break");
                break;
            }

            switch (choice) {
                case "1":
                    while (true) {
                        System.out.print("Enter two numbers for addition (or 0 0 to go back): ");
                        String[] input = sc.nextLine().trim().split("\\s+");
                        if (input.length != 2) {
                            System.out.println(("Wrong, enter two numbers with space between"));
                            continue;
                        }
                        double a = Double.parseDouble(input[0]);
                        double b = Double.parseDouble(input[1]);
                        if (a == 0 && b == 0) break;
                        System.out.println("You entered: " + a + " and " + b);
                        System.out.println("[Addition mode] Result: " + add(a, b));
                    }
                    break;

                case "2":
                    while (true) {
                        System.out.print("Enter two numbers for Subtract!on (or 0 0 to go back): ");
                        String[] input = sc.nextLine().trim().split("\\s+");
                        if (input.length != 2) {
                            System.out.println(("Wrong, enter two numbers with space between"));
                            continue;
                        }
                        double a = Double.parseDouble(input[0]);
                        double b = Double.parseDouble(input[1]);
                        if (a == 0 && b == 0) break;
                        System.out.println("You entered: " + a + " and " + b);
                        System.out.println("[Subtraction mode] Result: " + sub(a, b));
                    }
                    break;

                case "3":
                    while (true) {
                        System.out.print("Enter two numbers for Mult!plication (or 0 0 to go back): ");
                        String[] input = sc.nextLine().trim().split("\\s+");
                        if (input.length != 2) {
                            System.out.println(("Wrong, enter two numbers with space between"));
                            continue;
                        }
                        double a = Double.parseDouble(input[0]);
                        double b = Double.parseDouble(input[1]);
                        if (a == 0 && b == 0) break;
                        System.out.println("You entered: " + a + " and " + b);
                        System.out.println("[Multiplication mode] Result: " + mul(a, b));
                    }
                    break;

                case "4":
                    while (true) {
                        System.out.print("Enter two numbers for D!vision (or 0 0 to go back): ");
                        String[] input = sc.nextLine().trim().split("\\s+");
                        if (input.length != 2) {
                            System.out.println(("Wrong, enter two numbers with space between"));
                            continue;
                        }
                        double a = Double.parseDouble(input[0]);
                        double b = Double.parseDouble(input[1]);
                        if (a == 0 && b == 0) break;
                        if (b == 0) {
                            System.out.println("Error: Division by zero is not allowed");
                            continue;
                        }
                        System.out.println("You entered: " + a + " and " + b);
                        System.out.println("[Division mode] Result: " + div(a, b));
                    }
                    break;

                default:
                    System.out.println("Wrong: Forbidden choice");
            }
            System.out.println();

            }
        sc.close();

        }

        private static double add(double a, double b) { return a + b; }
        private static double sub(double a, double b) { return a - b; }
        private static double mul(double a, double b) { return a * b; }
        private static double div(double a, double b) { return a / b; }

        }
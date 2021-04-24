import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! Please enter your name:");
        String name = scan.next();

        System.out.println("Dear " + name + " please enter your gender (Male/Female):");
        String sex = scan.next();
        double BMI=0;
        double K;
        double height;
        int weight;
        int age;
        String durum;

        if (sex.equalsIgnoreCase("male")) {
            name="Mr."+name;
            System.out.print(name + ", please enter your height: (meters,centimeters)");
            height = scan.nextDouble();
            System.out.print(name + ", please enter your weight:");
            weight = scan.nextInt();
            System.out.print(name + ", please enter your age:");
            age = scan.nextInt();
            if (age < 40) {
                K = 1;
            } else {
                K = 0.98;
            }
            BMI=K*weight/Math.pow(height,2);
        } else if (sex.equalsIgnoreCase("female")) {
            name="Mrs."+name;
            System.out.print(name + ", please enter your height:");
            height = scan.nextDouble();
            System.out.print(name + ", please enter your weight:");
            weight = scan.nextInt();
            System.out.print(name + ", please enter your age:");
            age = scan.nextInt();
            if (age < 30) {
                K = 1.01;
            } else {
                K = 0.95;
            }
            BMI = K*(weight-1)/Math.pow(height,2);
        } else {
            System.out.print("Wrong input! Please re-run you code.");
            System.exit(0);
        }

        if(BMI<18.5){durum="Underweight";}
        else if(BMI<25){durum="Normal weight";}
        else if(BMI<30){durum="Overweight";}
        else if(BMI<35){durum="Obese Class I";}
        else if(BMI<40){durum="Obese Class II";}
        else {durum="Obese Class III";}

        System.out.println(name+String.format(", your BMI values is %.2f",BMI)+" and your category is "+"\""+durum+"\"");
        switch (durum) {
            case "Underweight" -> System.out.println("You must eat more.");
            case "Normal weight" -> System.out.println("Please save your weight.");
            case "Overweight" -> System.out.println("You should do exercise.");
            case "Obese Class I" -> System.out.println("You should go to the doctor or do more exercise.");
            case "Obese Class II" -> System.out.println("You must go to the doctor.");
            case "Obese Class III" -> System.out.println("You must go to the doctor as soon as possible.");
        }
    }}
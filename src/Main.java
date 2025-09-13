import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    start();
    }
    static void start(){
        System.out.println("Введите вашу сумму: ");
        Scanner scanner = new Scanner(System.in);
        int valueSum = scanner.nextInt();

        System.out.println("Выберите нужнкю валюту: ");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        int choiceType = scanner.nextByte();
        String resault=convertCurrency(valueSum,choiceType);
        int dotIndex=resault.indexOf(".");
        String finalResault=resault.substring(0,dotIndex+2);
        System.out.println("По текущему курсу сумму составит: "+finalResault);
        start();
    }
    static String convertCurrency(int valueSum,int choiceType){
        double rubToUsd = 0.012;
        double rubToEur= 0.011;

        switch (choiceType){
            case 1:
               double usdResault = valueSum * rubToUsd;
               return String.valueOf(usdResault);

            case 2:
                double eurResault = valueSum * rubToEur;
                return String.valueOf(eurResault);

        }
        return "0";
    }
}

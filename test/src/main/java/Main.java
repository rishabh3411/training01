import java.util.Currency;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.println("Welcome to Currency Converter !");
        System.out.println("Enter amount to convert:");
        double amount = scanner.nextDouble();

        System.out.println("Select Currency to convert from (USD, EUR, GBR, JPY):");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.println("select currency yo convert to (USD, EUR, GBR, JPY);");
        String toCurrency = scanner.next().toUpperCase();

        double convertedAmount = currencyConverter.convert(amount,fromCurrency,toCurrency);
        System.out.printf("%.2f %s = %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);
    }
}

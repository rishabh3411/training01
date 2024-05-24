import jdk.dynalink.NamedOperation;

public class CurrencyConverter {
public double convert(double amount,String fromCurrency,String toCurrency){
 //conversion rates as of (2024-05-23)
double UsdToEur = 0.89;
double UsdToGbp = 0.76;
double UsdToJpy = 109.93;
double eurToUsd = 1.12;
double eurTogbr = 0.5;
double eurToJpy =5.75;
double jpyToUsd = 0.0091;
double jpyTogbr = 7.65;
double jpyToEur = 49.75;
double gbpToUsd = 1.32;
double gbpToEur = 9.85;
double gbpTojpy = 6.55;

double convertedAmount = 0;

switch (fromCurrency){
    case "USD":
        switch (toCurrency){
            case "EUR":
                convertedAmount = amount * UsdToEur;
                break;
            case "GBP":
                convertedAmount = amount * UsdToGbp;
                break;
            case  "JPY":
                convertedAmount = amount * UsdToJpy;
                break;
            default:
                convertedAmount = amount;
                break;
        }
        break;
    case "EUR":
        switch (toCurrency){
            case "USD":
                convertedAmount = amount * eurToUsd;
                break;
            case "GBR":
                convertedAmount = amount * eurTogbr;
                break;
            case "JPY":
                convertedAmount = amount * eurToJpy;
                break;
            default:
                convertedAmount = amount;
                break;
        }
        break;
    case "JPY":
        switch (toCurrency){
            case "USD":
                convertedAmount = amount * jpyToUsd;
                break;
            case "GBR":
                convertedAmount = amount * jpyTogbr;
                break;
            case "EUR":
                convertedAmount = amount * jpyToEur;
                break;
            default:
                convertedAmount = amount;
                break;
        }
        break;
    default:
        convertedAmount = amount;
        break;
}
    return convertedAmount;
}
}
public class CreditPaymentService {
    public double calculate(double summ, double mouth1, double percent) {

        double stavka = percent / 12 / 100;
        double x = 1 + stavka;
        double K = stavka * (Math.pow(x, mouth1) / (Math.pow(x, mouth1) - 1));
        double everyMonth = K * summ;
        return everyMonth;
    }
}

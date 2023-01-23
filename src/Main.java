public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double result = service.calculate(1000000, 12, 9.99);
        System.out.println("Значение : " + result);
        double result2 = service.calculate(1000000, 24, 9.99);
        System.out.println("Значение : " + result2);
        double result3 = service.calculate(1000000, 36, 9.99);
        System.out.println("Значение : " + result3);
    }
}

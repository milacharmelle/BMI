public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(69, 1.74);

        System.out.println("Индекс массы тела: " + bmi);

    }
}

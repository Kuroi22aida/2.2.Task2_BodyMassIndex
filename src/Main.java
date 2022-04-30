public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 88;
        double height = 1.87;
        double index = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела: " + index);
    }
}

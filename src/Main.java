public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        int weightKilogram = 98;
        double heightMetre = 1.87;
        int bodyMassIndex = bmiService.calculate(weightKilogram, heightMetre);
        System.out.println("Индекс массы тела: " + bodyMassIndex);
    }
}
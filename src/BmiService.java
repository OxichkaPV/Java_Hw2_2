public class BmiService {
    public int calculate(int weight, double height) {
        System.out.println("Вес: " + weight+ " кг.");
        System.out.println("Рост: " + height + " м.");
        double result = weight / Math.pow(height, 2);
        return (int) result;
    }
}

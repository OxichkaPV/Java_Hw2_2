public class BmiService {
    public int calculate(int ves, double rost, int e_izm) {
        double result;
        System.out.println("Вес: " + ves + " кг.");
        if (e_izm == 1) {//сантиметры
            double rost_sm = rost / 100;
            result = ves / Math.pow(rost_sm, 2);
            System.out.println("Рост: " + (int) rost + " см.");
        } else { //  метры
            result = ves / Math.pow(rost, 2);
            System.out.println("Рост: " + rost + " м.");
        }
        return (int) result;
    }
}

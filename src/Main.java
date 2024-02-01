public class Main {
    public static void main(String[] args) {
        BmiService bmService = new BmiService();
        int imt;
        int p_ves = 98;
        double p_rost = 1.87;
        int p_e_izm = 0; // 0 - метр, 1 - сантиметр
        imt = bmService.calculate(p_ves, p_rost, p_e_izm);

        System.out.println("Индекс массы тела: " + imt);
    }
}
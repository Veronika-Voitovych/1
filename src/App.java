public class App {
    public static void main(String args[]) {

        System.out.println(task1_1(10, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(task1_2(10, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(task1_3(10, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(task1_4(10, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(task2 (   "Ведення","бізнесу" ,"вимагає" ,"обережності" ,"планування", "та" ,"стратегічного" ,"мислення" ,"для" ,"досягнення" ,"успіху"));

    }

    public static double task1_1(int... num) {
        int sum = 0;
        for (int i : num)
            sum += i;
        return sum;

    }

    public static double task1_2(int... num) {
        int sum = num[0] * 2;
        for (int i : num)
            sum -= i;
        return sum;

    }

    public static double task1_3(int... num) {
        int sum = 1;
        for (int i : num)
            sum = sum * i;
        return sum;
    }

    public static double task1_4(int... num) {
        int sum = num[0];
        for (int i : num)
            sum = sum / i;
        return sum * num[0];
    }

   public static String task2(String... letter) {
    String sum = "";
    for (String i: letter)
        sum += i + " ";
    return sum;
}

   

}





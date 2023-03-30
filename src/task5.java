
public class task5 {
    public static void main(String args[]) {

        var number = 5521;

        var result = 0;
        var temp = number;
        while (temp != 0) {
            var digit = temp % 10;
            result = result * 10 + digit;
            temp /= 10;
        }

        System.out.println("revers:" + result);
    }
}

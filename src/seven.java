import java.util.Scanner;
public class seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        float a = scanner.nextInt();
        System.out.println(a + " первое число ");
        System.out.println("Введите второе число ");
        float b = scanner.nextInt();
        float c = a / b;
        System.out.println("Ответ: " + c);
    }
}

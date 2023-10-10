import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Завдання 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть значення X:");
        int x = scanner.nextInt();

        System.out.println("Введіть значення Y:");
        int y = scanner.nextInt();

        System.out.println("Введіть значення Z:");
        int z = scanner.nextInt();

        double q = Math.pow(x, 3) - y - Math.pow(z, 2);
        if (x > y && y > z && x > 0) {
            q = q;
        } else {
            q = 0;
        }

        q += x * x + y * z;
        if (y > x && x >= z) {
            q = q;
        } else {
            q = 0;
        }

        q += x * y + Math.pow(z, x);
        if (z >= y && y > x) {
            q = q;
        } else {
            q = 0;
        }

        q -= (x + y + z);
        System.out.println("Результат обчислення системи рівнянь: " + q);
        //Завдання 2
        String str;
        boolean upCase = false;
        System.out.println("Введіть рядок:");
        str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                upCase = true;
                break;
            }
        }
        System.out.println("Чи містить введений рядок велики літери ?");
        if (upCase) {
            System.out.println("ТАК");
        } else {
            System.out.println("НІ");
        }
    }
}
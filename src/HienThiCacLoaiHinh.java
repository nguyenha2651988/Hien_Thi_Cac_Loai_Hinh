import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 in hinh chu nhat");
        System.out.println("2 in tam giac vuong goc duoi");
        System.out.println("3 in tam giac vuong goc tren");
        System.out.println("4 in tam giac vuong can");
        System.out.println("0 Exit");
        int number = scanner.nextInt();
        while (number != 0) {
            if (number > 4) {
                number = scanner.nextInt();
            }
            switch (number) {
                case 1:
                    hinhChuNhat();
                    System.out.println();
                    number = scanner.nextInt();
                    break;
                case 2:
                    tamGiacVuongGocDuoi();
                    System.out.println();
                    number = scanner.nextInt();
                    break;
                case 3:
                    tamGiacVuongGocTren();
                    System.out.println();
                    number = scanner.nextInt();
                    break;
                case 4:
                    tamGiacCan();
                    System.out.println();
                    number = scanner.nextInt();
                    break;

            }
        }

    }

    public static void hinhChuNhat() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 7; j++)
                System.out.print("* ");
        }
    }

    public static void tamGiacVuongGocDuoi() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
        }
    }

    public static void tamGiacVuongGocTren() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
            for (int j = 5; i < j; j--) {
                System.out.print("* ");
            }
        }
    }

    public static void tamGiacCan() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; i < j; j--) {
                System.out.print("* ");
            }
            System.out.println();
            for (int x = 0; x <= i; x++) {
                System.out.print(" ");
            }
        }
    }
}


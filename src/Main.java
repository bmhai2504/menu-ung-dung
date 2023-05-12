//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
//}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        System.out.println("Menu");
        System.out.println("1. Ve hinh tam giac");
        System.out.println("2. Ve hinh vuong");
        System.out.println("3. Ve hinh chu nhat");
        System.out.println("4. Thoat chuong trinh");

        do {
            System.out.printf("Nhap vao lua chon cua ban: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("**");
                    System.out.println("**");
                    break;
                case 3:
                    System.out.println("**");
                    System.out.println("**");
                    System.out.println("**");
                    break;
                case 4:
                    System.out.println("Ban da thoat ra khoi chuong trinh!!!");
                    break;
                default:
                    System.out.println("Lua chon khong phu hop vui long chon lai ");
            }
        } while (choice != 4);

    }
}
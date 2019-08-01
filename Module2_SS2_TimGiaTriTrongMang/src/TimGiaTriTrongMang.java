import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        System.out.println("Tim ten sv trong danh sach");
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten can tim");
        String inputName = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(inputName)) {
                System.out.println("vi tri cua sv " + inputName + " trong ds la: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (isExist == false) {
            System.out.println("ko co ten " + inputName + " trong danh sach");
        }
    }
}

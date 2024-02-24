import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
//        ===========MENU==========
//        1. Nhập vào giá trị các phần tử mảng
//        2. In ra các phần tử mảng
//        3. Hiển thị dưới dạng ma trận
//        4. In ra đường chéo chính
//        5. In ra Đường chéo phụ
//        6. In ra đường biên
//        7. Thoát chường trình
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao hang");
        int row = sc.nextInt();
        System.out.println("nhap vao cot");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        do {
            System.out.println("===========MENU==========");
            System.out.println(" 1. Nhập vào giá trị các phần tử mảng");
            System.out.println("2. In ra các phần tử mảng");
            System.out.println("3. Hiển thị dưới dạng ma trận");
            System.out.println("4. In ra đường chéo chính");
            System.out.println("5. In ra Đường chéo phụ");
            System.out.println("6. In ra đường biên");
            System.out.println("7. Thoát chương trình");
            System.out.println("moi lua chon");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("moi nhap cac gia tri cua mang");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.printf("arr[%d][%d]", i, j);
                            matrix[i][j] = sc.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("in ra cac phan tu mang");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.println(matrix[i][j] + " ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("in ra duoi dang ma tran");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[i][j] + "\t");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    System.out.println("in dg cheo chinh");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if (i == j) {
                                System.out.println(matrix[i][j] + "\t");
                            }
                            System.out.printf("%s\t","");
                        }
                        System.out.println("\n");
                    }
                case 5:
                    System.out.println("in dg cheo phu");
                    if (row == col){
                        for (int i = 0; i < matrix.length; i++) {
                            for (int j = 0; j < matrix[i].length; j++) {
                                if (i + j == matrix.length - 1) {
                                    System.out.println(matrix[i][j] + "\t");
                                }
                                System.out.printf("%s\t","");
                            }
                            System.out.println("\n");
                        }
                    } else {
                        System.out.println("nếu muốn in đg chéo phụ mời nhập số hàng bằng số cột");
                    }
                    break;
                case 6:
                    System.out.println("in duong bien cua ma tran");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            if (i == 0 || i == matrix.length - 1) {
                                System.out.print(matrix[i][j] + "\t");
                            } else if (j == 0 || j == matrix[i].length - 1) {
                                System.out.printf(matrix[i][j] + "\t");
                            } else {
                                System.out.printf("%s\t","");
                            }
                        }
                        System.out.println("\n");
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println(" mời chọn lại");

            }
        } while (true);
    }
}
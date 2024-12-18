package buoi9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Hiển thị danh sách sinh viên");
            System.out.println("4. Tìm kiếm sinh viên theo tên");
            System.out.println("5. Sắp xếp sinh viên theo điểm");
            System.out.println("6. Kiểm tra sinh viên có tồn tại không");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID sinh viên: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên sinh viên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập điểm sinh viên: ");
                    double grade = Double.parseDouble(sc.nextLine());
                    try {
                        manager.addStudent(id, name, grade);
                    } catch (StudentAlreadyExistsException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Nhập ID sinh viên cần xóa: ");
                    String idDel = sc.nextLine();
                    try {
                        manager.deleteStudent(idDel);
                    } catch (StudentNotFoundException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }
                    break;
                case 3:
                    manager.showStudents();
                    break;
                case 4:
                    System.out.print("Nhập tên sinh viên cần tìm: ");
                    String searchName = sc.nextLine();
                    try {
                        manager.searchStudentByName(searchName);
                    } catch (StudentNotFoundException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        manager.sortStudentsByGrade();
                        System.out.println("Danh sách sau khi sắp xếp:");
                        manager.showStudents();
                    } catch (EmptyListException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }
                    break;
                case 6:
                    System.out.print("Nhập ID sinh viên cần kiểm tra: ");
                    String checkId = sc.nextLine();
                    boolean exists = manager.checkStudentExist(checkId);
                    if (exists) {
                        System.out.println("Sinh viên với ID " + checkId + " tồn tại.");
                    } else {
                        System.out.println("Sinh viên với ID " + checkId + " không tồn tại.");
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}


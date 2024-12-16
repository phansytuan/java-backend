package BaiKiemTraCuoiModule1;

import java.util.Scanner;

public class StudentManager {
    private Student[] students;
    private int size; // số lượng sinh viên hiện có
    private Scanner scanner;

    public StudentManager() {
        // Khởi tạo mảng ban đầu
        students = new Student[2];
        size = 0;
        scanner = new Scanner(System.in);
    }

    public void menu() {
        int choice;
        do {
            System.out.println("Menu Quản Lý Danh Sách Sinh Viên");
            System.out.println("1. Thêm sinh viên vào danh sách.");
            System.out.println("2. Sửa thông tin sinh viên.");
            System.out.println("3. Xóa sinh viên khỏi danh sách.");
            System.out.println("4. Tìm kiếm sinh viên theo tên.");
            System.out.println("5. Hiển thị danh sách sinh viên.");
            System.out.println("6. Thoát.");
            System.out.print("Nhập lựa chọn: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudentById();
                    break;
                case 3:
                    deleteStudentById();
                    break;
                case 4:
                    searchStudentByName();
                    break;
                case 5:
                    displayStudents();
                    break;
                case 6:
                    System.out.println("Đã thoát khỏi chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại!");
            }

        } while (choice != 6);
    }

    // 1. Thêm sinh viên
    private void addStudent() {
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi sinh viên: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập mã sinh viên: ");
        String studentId = scanner.nextLine();

        // Kiểm tra trùng mã sinh viên
        if (findStudentIndexById(studentId) != -1) {
            System.out.println("Mã sinh viên đã tồn tại, không thể thêm sinh viên.");
            return;
        }

        // Nếu mảng đầy thì mở rộng
        if (size == students.length) {
            expandArray();
        }

        students[size++] = new Student(name, age, studentId);
        System.out.println("Sinh viên đã được thêm vào danh sách.");
    }

    // 2. Sửa thông tin sinh viên theo mã
    private void editStudentById() {
        System.out.print("Nhập mã sinh viên cần chỉnh sửa: ");
        String studentId = scanner.nextLine();

        int index = findStudentIndexById(studentId);
        if (index == -1) {
            System.out.println("Không tìm thấy sinh viên với mã " + studentId + ".");
            return;
        }

        Student st = students[index];
        System.out.println("Thông tin sinh viên hiện tại:");
        System.out.println(st.toString());

        System.out.print("Nhập tên sinh viên chỉnh sửa: ");
        String newName = scanner.nextLine();
        System.out.print("Nhập tuổi sinh viên chỉnh sửa: ");
        int newAge = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập mã sinh viên chỉnh sửa: ");
        String newId = scanner.nextLine();

        // Kiểm tra nếu đổi mã sang mã khác và mã đó đã tồn tại
        if (!newId.equals(studentId) && findStudentIndexById(newId) != -1) {
            System.out.println("Mã sinh viên đã tồn tại, không thể cập nhật mã sinh viên.");
            return;
        }

        st.setName(newName);
        st.setAge(newAge);
        st.setStudentId(newId);
        System.out.println("Thông tin sinh viên đã được cập nhật.");
    }

    // 3. Xóa sinh viên theo mã
    private void deleteStudentById() {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        String studentId = scanner.nextLine();

        int index = findStudentIndexById(studentId);
        if (index == -1) {
            System.out.println("Không tìm thấy sinh viên với mã " + studentId + ".");
            return;
        }

        // Xóa bằng cách dời các phần tử phía sau lên
        for (int i = index; i < size - 1; i++) {
            students[i] = students[i + 1];
        }
        // Giảm size, phần tử cuối set null để tránh rò rỉ tham chiếu
        students[size - 1] = null;
        size--;

        System.out.println("Sinh viên đã được xóa khỏi danh sách.");
    }

    // 4. Tìm kiếm sinh viên theo tên
    private void searchStudentByName() {
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String name = scanner.nextLine();

        Student[] result = new Student[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                result[count++] = students[i];
            }
        }

        if (count == 0) {
            System.out.println("Không tìm thấy sinh viên nào có tên " + name + ".");
        } else {
            System.out.println("Kết quả tìm kiếm:");
            for (int i = 0; i < count; i++) {
                System.out.println(result[i].toString());
            }
        }
    }

    // 5. Hiển thị danh sách sinh viên
    private void displayStudents() {
        if (size == 0) {
            System.out.println("Danh sách sinh viên hiện đang trống.");
            return;
        }
        System.out.println("Danh sách sinh viên hiện tại:");
        for (int i = 0; i < size; i++) {
            System.out.println(students[i].toString());
        }
    }

    // Hàm hỗ trợ: Mở rộng mảng
    private void expandArray() {
        int newLength = students.length * 2;
        Student[] newArray = new Student[newLength];
        for (int i = 0; i < students.length; i++) {
            newArray[i] = students[i];
        }
        students = newArray;
    }

    // Hàm hỗ trợ: Tìm chỉ số sinh viên theo mã
    private int findStudentIndexById(String studentId) {
        for (int i = 0; i < size; i++) {
            if (students[i].getStudentId().equalsIgnoreCase(studentId)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.menu();
    }
}


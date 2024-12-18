package buoi9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class StudentManager {
    private ArrayList<Student> studentList;
    private HashSet<String> studentIds;

    public StudentManager() {
        studentList = new ArrayList<>();
        studentIds = new HashSet<>();
    }

    // 1. Thêm sinh viên
    public void addStudent(String id, String name, double grade) throws StudentAlreadyExistsException {
        // Kiểm tra trùng ID
        if (studentIds.contains(id)) {
            throw new StudentAlreadyExistsException("Sinh viên với ID " + id + " đã tồn tại.");
        }
        Student s = new Student(id, name, grade);
        studentList.add(s);
        studentIds.add(id);
        System.out.println("Thêm sinh viên thành công!");
    }

    // 2. Xóa sinh viên
    public void deleteStudent(String id) throws StudentNotFoundException {
        Student toRemove = null;
        for (Student s : studentList) {
            if (s.getId().equals(id)) {
                toRemove = s;
                break;
            }
        }
        if (toRemove == null) {
            throw new StudentNotFoundException("Không tìm thấy sinh viên với ID: " + id);
        }
        studentList.remove(toRemove);
        studentIds.remove(id);
        System.out.println("Xóa sinh viên thành công!");
    }

    // 3. Hiển thị danh sách sinh viên
    public void showStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
            return;
        }
        System.out.println("Danh sách sinh viên:");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    // 4. Tìm kiếm sinh viên theo tên
    public void searchStudentByName(String name) throws StudentNotFoundException {
        ArrayList<Student> foundStudents = new ArrayList<>();
        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name)) {
                foundStudents.add(s);
            }
        }
        if (foundStudents.isEmpty()) {
            throw new StudentNotFoundException("Không tìm thấy sinh viên với tên: " + name);
        }
        System.out.println("Kết quả tìm kiếm:");
        for (Student s : foundStudents) {
            System.out.println(s);
        }
    }

    // 5. Sắp xếp danh sách sinh viên theo điểm
    public void sortStudentsByGrade() throws EmptyListException {
        if (studentList.isEmpty()) {
            throw new EmptyListException("Không thể sắp xếp. Danh sách trống.");
        }
        Collections.sort(studentList, Comparator.comparingDouble(Student::getGrade));
        System.out.println("Sắp xếp thành công!");
    }

    // 6. Kiểm tra sinh viên có tồn tại không
    public boolean checkStudentExist(String id) {
        return studentIds.contains(id);
    }
}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Mã sinh viên: " + id + ", Tên: " + name + ", Tuổi: " + age;
    }
}

class StudentManager {
    private List<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi sinh viên: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập mã sinh viên: ");
        String id = scanner.nextLine();

        if (students.stream().anyMatch(s -> s.getId().equals(id))) {
            System.out.println("Mã sinh viên đã tồn tại, không thể thêm sinh viên.");
            return;
        }

        students.add(new Student(id, name, age));
        System.out.println("Sinh viên đã được thêm vào danh sách.");
    }

    public void editStudent() {
        System.out.print("Nhập mã sinh viên cần chỉnh sửa: ");
        String id = scanner.nextLine();

        Student student = students.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
        if (student == null) {
            System.out.println("Không tìm thấy sinh viên với mã " + id + ".");
            return;
        }

        System.out.println("Thông tin sinh viên hiện tại: ");
        System.out.println(student);

        System.out.print("Nhập tên sinh viên chỉnh sửa: ");
        student.setName(scanner.nextLine());
        System.out.print("Nhập tuổi sinh viên chỉnh sửa: ");
        student.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập mã sinh viên chỉnh sửa: ");
        student.setId(scanner.nextLine());

        System.out.println("Thông tin sinh viên đã được cập nhật.");
    }

    public void deleteStudent() {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        String id = scanner.nextLine();

        Student student = students.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
        if (student == null) {
            System.out.println("Không tìm thấy sinh viên với mã " + id + ".");
            return;
        }

        students.remove(student);
        System.out.println("Sinh viên đã được xóa khỏi danh sách.");
    }

    public void searchStudentByName() {
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String name = scanner.nextLine();

        List<Student> foundStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                foundStudents.add(student);
            }
        }

        if (foundStudents.isEmpty()) {
            System.out.println("Không tìm thấy sinh viên nào có tên " + name + ".");
            return;
        }

        System.out.println("Kết quả tìm kiếm:");
        for (Student student : foundStudents) {
            System.out.println(student);
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên hiện đang trống.");
            return;
        }

        System.out.println("Danh sách sinh viên hiện tại:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void showMenu() {
        while (true) {
            System.out.println("\nMenu Quản Lý Danh Sách Sinh Viên");
            System.out.println("1. Thêm sinh viên vào danh sách");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Xóa sinh viên khỏi danh sách");
            System.out.println("4. Tìm kiếm sinh viên theo tên");
            System.out.println("5. Hiển thị danh sách sinh viên");
            System.out.println("6. Thoát");

            System.out.print("Chọn chức năng: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    editStudent();
                    break;
                case "3":
                    deleteStudent();
                    break;
                case "4":
                    searchStudentByName();
                    break;
                case "5":
                    displayStudents();
                    break;
                case "6":
                    System.out.println("Đã thoát khỏi chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.showMenu();
    }
}

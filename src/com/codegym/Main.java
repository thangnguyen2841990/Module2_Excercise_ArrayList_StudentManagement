package com.codegym;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = -1;
        StudentManagement studentManagement = new StudentManagement();
        System.out.println("----MENU QUẢN LÝ SINH VIÊN----");
        System.out.println("1. Hiển thị toàn bộ sinh viên");
        System.out.println("2. Thêm sinh viên.");
        System.out.println("3. Xóa sinh viên");
        System.out.println("4. Sửa thông tin  sinh viên");
        System.out.println("5. Xóa toàn bộ danh sách sinh viên");
        System.out.println("6. Kiểm tra danh sách sinh viên có rỗng hay không");


        System.out.println("7. Thoát");

        while (true) {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            if (choice > 7) {
                System.out.println("Menu chỉ có từ 1 => 3");
            }
            if (choice == 7) {
                break;
            }
            switch (choice) {
                case 1: {
                    System.out.println("----Hiển thị toàn bộ sinh viên----");
                    studentManagement.displayAllStudent();
                    break;
                }
                case 2: {
                    System.out.println("----Thêm sinh viên----");
                    System.out.println("Nhập số lương sinh viên cần thêm: ");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin sinh viên " + (i + 1));
                        Student newStudent = inputStudentInfo();
                        studentManagement.addStudent(newStudent);
                    }
                    break;
                }
                case 3: {
                    System.out.println("----Xóa sinh viên----");
                    System.out.println("Nhập vị trí sinh viên muốn xóa");
                    int index = scanner.nextInt();
                    if (index - 1 < 0 || index - 1 > studentManagement.getStudents().size()) {
                        System.out.println("Vị trí không xác định");
                    } else {
                        studentManagement.removeStudent(index - 1);
                    }
                    break;
                }
                case 4: {
                    System.out.println("----Sửa thông tin sinh viên----");
                    System.out.println("Nhập vị trí sinh viên muốn sửa: ");
                    int index = scanner.nextInt();
                    if (index - 1 < 0 || index - 1 > studentManagement.getStudents().size()) {
                        System.out.println("Vị trí không xác định");
                    } else {
                        Student newStudent = inputStudentInfo();
                        studentManagement.updateStudent(index - 1, newStudent);
                    }
                    break;
                }
                case 5: {
                    System.out.println("----Xóa toàn bộ danh sách sinh viên");
                    studentManagement.removeAllStudent();
                    break;
                }
                case 6: {
                    System.out.println("----Kiểm tra danh sách sinh viên có rỗng hay không ----");
                    if (studentManagement.isEmpty()) {
                        System.out.println("Danh sách sinh viên rỗng");
                    } else {
                        System.out.println("Danh sách sinh viên không rỗng");
                    }
                    break;
                }
            }
        }
    }

    public static Student inputStudentInfo() {
        Scanner inputStudent = new Scanner(System.in);
        System.out.println("Mẫ số sinh viên: ");
        String studentCode = inputStudent.nextLine();
        System.out.println("Họ và tên: ");
        String name = inputStudent.nextLine();
        System.out.println("Năm sinh");
        int yearOfBirth = scanner.nextInt();
        System.out.println("Điểm trung bình: ");
        float mediumScore = scanner.nextFloat();
        return new Student(studentCode, name, yearOfBirth, mediumScore);
    }
}

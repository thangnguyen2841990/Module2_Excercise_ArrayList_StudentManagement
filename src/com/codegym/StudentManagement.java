package com.codegym;

import java.util.ArrayList;

public class StudentManagement {
    private ArrayList<Student> students;

    public StudentManagement() {
        this.students = new ArrayList<>();
    }

    public StudentManagement(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    //Hiển thị danh sách sinh viên
    public void displayAllStudent(){
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i+1)+". "+students.get(i));
        }
    }
    //thêm sinh viên vào danh sách
    public void addStudent(Student newStudent){
        this.students.add(newStudent);
    }
    //Xóa sinh viên
    public void removeStudent(int index){
        this.students.remove(index);
    }
    //Sửa thông tin sinh viên
    public void updateStudent(int index, Student newStudent){
        this.students.set(index,newStudent);
    }

}

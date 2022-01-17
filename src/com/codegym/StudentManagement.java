package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
    //Xóa toàn bộ sinh viên
    public void removeAllStudent(){
        this.students.removeAll(students);
    }
    //Kiểm tra danh sách sinh viên có rỗng hay không
    public boolean isEmpty(){
        return this.students.isEmpty();
    }
    //lấy số lượng sinh viên trong danh sách
    public int quantilyStudent(){
        return this.students.size();
    }
    // tìm kiếm sinh vien dựa trên MSSV
    public int findStudentMSSV(String studentCode){
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentCode().equals(studentCode)){
                index = i;
            }
        }
        return index;
    }
    //tìm kiếm sinh viên dựa trên tên
    public int findNameStudent(String name){
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)){
                index = i;
            }
        }
        return index;
    }
    //sắp xếp sinh viên theo điểm TB từ cao đến thấp
    public void sortStudents(){
        Collections.sort(this.students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getMediumScore()<o2.getMediumScore()){
                    return 1;
                }else if (o1.getMediumScore() > o2.getMediumScore()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
}

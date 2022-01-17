package com.codegym;

public class Student {
    private String studentCode;
    private String name;
    private int YearOfBirth;
    private float mediumScore;

    public Student(String studentCode, String name, int yearOfBirth, float mediumScore) {
        this.studentCode = studentCode;
        this.name = name;
        YearOfBirth = yearOfBirth;
        this.mediumScore = mediumScore;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        YearOfBirth = yearOfBirth;
    }

    public float getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(float mediumScore) {
        this.mediumScore = mediumScore;
    }

    @Override
    public String toString() {
        return "MSSV: " + this.studentCode + ", Họ và tên: "+this.name + ", Năm sinh: "
                + this.YearOfBirth+ ", Điểm TB: "+this.mediumScore;
    }


}

package week10test;
public class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    // เพิ่ม Method สำหรับตั้งค่าชื่อใหม่
    public void setName(String name) {
        this.name = name;
    }

    // เพิ่ม Method สำหรับตั้งค่าเกรดใหม่
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void showInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | GPA: " + gpa);
    }
}
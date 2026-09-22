package week10test;
import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students; //[cite: 2]

    public StudentManager() {
        students = new ArrayList<>();
    }

    // Method เพิ่มนักศึกษา[cite: 2]
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method แสดงนักศึกษาทั้งหมด[cite: 2]
    public void showAllStudents() {
        for (Student s : students) {
            s.showInfo();
        }
    }

    // ภารกิจที่ 3: Algorithm สำหรับค้นหา[cite: 2]
    public Student findStudentById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    // ภารกิจที่ 4: Algorithm สำหรับลบ[cite: 2, 3]
    public boolean removeStudentById(String id) {
        Student student = findStudentById(id);
        
        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }
}
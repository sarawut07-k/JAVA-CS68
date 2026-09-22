package week10test;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        // Initial dummy data
        manager.addStudent(new Student("001", "Somchai", 3.25));
        manager.addStudent(new Student("002", "Somsri", 3.75));
        manager.addStudent(new Student("003", "Anan", 2.80));

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=== All Students ===");
            manager.showAllStudents();
            System.out.println("====================");

            // Menu Options updated
            System.out.println("[ Student Management Menu ]");
            System.out.println("Press 1 : Search student (by ID)");
            System.out.println("Press 2 : Remove student (by ID)");
            System.out.println("Press 3 : Add new student");
            System.out.println("Press 4 : Edit student (Name & GPA)");
            System.out.println("Press 5 : Exit");
            System.out.print("Please select a menu (1-5): ");
            
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("\nEnter student ID to search: ");
                    String searchId = scanner.nextLine();
                    Student foundStudent = manager.findStudentById(searchId);
                    
                    System.out.println("--- Search Result ---");
                    if (foundStudent != null) {
                        foundStudent.showInfo();
                    } else {
                        System.out.println("Student not found with ID: " + searchId);
                    }
                    System.out.println("---------------------");
                    break;

                case "2":
                    System.out.print("\nEnter student ID to remove: ");
                    String removeId = scanner.nextLine();
                    boolean isRemoved = manager.removeStudentById(removeId);
                    
                    if (isRemoved) {
                        System.out.println(">>> Successfully removed student with ID: " + removeId + " <<<");
                    } else {
                        System.out.println(">>> Failed to remove (ID not found: " + removeId + ") <<<");
                    }
                    break;

                case "3":
                    System.out.println("\n--- Add New Student ---");
                    System.out.print("Enter ID: ");
                    String newId = scanner.nextLine();
                    
                    System.out.print("Enter Name: ");
                    String newName = scanner.nextLine();
                    
                    System.out.print("Enter GPA: ");
                    try {
                        double newGpa = Double.parseDouble(scanner.nextLine());
                        manager.addStudent(new Student(newId, newName, newGpa));
                        System.out.println(">>> Student added successfully <<<");
                    } catch (NumberFormatException e) {
                        System.out.println(">>> Error: Please enter a valid number for GPA <<<");
                    }
                    break;

                case "4":
                    // ระบบแก้ไขข้อมูลนักศึกษา (Edit system)
                    System.out.print("\nEnter student ID to edit: ");
                    String editId = scanner.nextLine();
                    Student studentToEdit = manager.findStudentById(editId);
                    
                    if (studentToEdit != null) {
                        System.out.println("--- Current Student Info ---");
                        studentToEdit.showInfo(); // แสดงข้อมูลเดิมก่อนแก้
                        
                        System.out.print("Enter new Name: ");
                        String updatedName = scanner.nextLine();
                        
                        System.out.print("Enter new GPA: ");
                        try {
                            double updatedGpa = Double.parseDouble(scanner.nextLine());
                            
                            // ใช้ Setter เพื่อบันทึกข้อมูลใหม่ลงใน Object ตัวเดิม
                            studentToEdit.setName(updatedName);
                            studentToEdit.setGpa(updatedGpa);
                            
                            System.out.println(">>> Student info updated successfully <<<");
                        } catch (NumberFormatException e) {
                            System.out.println(">>> Error: Please enter a valid number for GPA <<<");
                        }
                    } else {
                        System.out.println(">>> Edit failed (ID not found: " + editId + ") <<<");
                    }
                    break;

                case "5":
                    isRunning = false;
                    System.out.println("\nExiting system... Thank you!");
                    break;

                default:
                    System.out.println("\n!!! Invalid choice. Please select 1-5 !!!");
                    break;
            }
        }
        
        scanner.close();
    }
}
public class Main {
    public static void main(String[] args) {
        MedicineStock para = new MedicineStock("Paracetamol", 30);

        // ทดสอบเบิกยาปกติ (ผ่านฉลุย)
        try {
            para.dispense(10);
        } catch (InSuff e) {
            System.err.println("[ข้อผิดพลาด] " + e.getMessage());
        }

        // ทดสอบเบิกเกินจำนวนคงเหลือ (จะเกิด InSuff Exception)
        try {
            para.dispense(25); // ปัจจุบันเหลือแค่ 20 แต่จะเบิก 25
        } catch (InSuff e) {
            System.err.println("[ข้อผิดพลาด] " + e.getMessage());
        }
    }
}
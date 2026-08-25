class MedicineStock {
    private String medicineName;
    private int quantity;

    public MedicineStock(String medicineName, int quantity) {
        this.medicineName = medicineName;
        this.quantity = quantity;
    }

    // เมธอดเบิกยา: หากจำนวนที่ขอน้อยกว่าหรือเท่ากับสต็อกจะตัดยอด แต่ถ้าเกินจะ throw InSuff
    public void dispense(int amount) throws InSuff {
        if (amount > this.quantity) {
            throw new InSuff("ยาไม่พอ! " + medicineName + " เหลือ " + quantity + " ชิ้น แต่ต้องการเบิก " + amount + " ชิ้น");
        }
        this.quantity -= amount;
        System.out.println("เบิกยา " + medicineName + " จำนวน " + amount + " ชิ้น สำเร็จ (คงเหลือ: " + quantity + ")");
    }

    public int getQuantity() {
        return quantity;
    }
}
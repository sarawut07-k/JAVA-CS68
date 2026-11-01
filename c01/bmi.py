# IPO
# Input: รับน้ำหนัก (kg) และส่วนสูง (cm)
# Process: แปลงส่วนสูงเป็นเมตร และคำนวณ BMI
# Output: แสดงค่า BMI ทศนิยม 2 ตำแหน่ง

# Pseudocode
# START
# INPUT weight, height
# height = height / 100
# bmi = weight / (height * height)
# OUTPUT bmi
# END

weight = float(input("น้ำหนัก (kg): "))
height = float(input("ส่วนสูง (cm): "))

height = height / 100
bmi = weight / (height * height)

print(f"BMI = {bmi:.2f}")
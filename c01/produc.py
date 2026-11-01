# IPO
# Input: ชื่อสินค้า ราคาต่อชิ้น และจำนวน
# Process: คำนวณยอดก่อนภาษี ภาษี 7% และยอดสุทธิ
# Output: แสดงยอดเงินทั้งหมด

# Pseudocode
# START
# INPUT name, price, quantity
# total = price * quantity
# vat = total * 0.07
# net = total + vat
# OUTPUT name, total, vat, net
# END

name = input("ชื่อสินค้า: ")
price = float(input("ราคาต่อชิ้น: "))
quantity = int(input("จำนวน: "))

total = price * quantity
vat = total * 0.07
net = total + vat

print(f"ชื่อสินค้า: {name}")
print(f"ยอดก่อนภาษี: {total:,.2f} บาท")
print(f"ภาษี 7%: {vat:,.2f} บาท")
print(f"ยอดสุทธิ: {net:,.2f} บาท")
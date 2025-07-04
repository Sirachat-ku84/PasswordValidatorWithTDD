package lib;

public class PasswordValidator {

    /**
     * ตรวจสอบความยากง่ายของ password โดยจะมี enumeration ทั้ง INVARID,WEAK,MEDIUM,STRONG 
       ถ้า password มีขนาดไม่เกิน 8 ตัวจะเป็น INVARID 
       ขนาดตัวอักษรพิมพ์เล็กทั้งหมด --> WEAK
       ขนาดตัวอักษรพิมพ์ใหญ่ทั้งหมด --> MEDUIM
       มีการสลับการใช้ทั้งพิมพ์ใหญ่และพิมพ์เล็ก --> STRONG
     * @param password String ที่ต้องการตรวจสอบ
     * @return PasswordStrength เป็น IMVARID และ ค่าต่างๆตามเงื่อนไข
     */
    
    public static PasswordStrength validate(String password) {
        
        
        if (password == null || password.length() < 8) {
            return PasswordStrength.INVALID;
        }

        boolean hasLower = false;
        boolean hasUpper = false;

        for(char c : password.toCharArray()){
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
        }
        
        if (hasLower && hasUpper) {
            return PasswordStrength.STRONG;
        } else if (hasUpper) {
            return PasswordStrength.MEDIUM;
        } else if (hasLower) {
            return PasswordStrength.WEAK;
        }

        return PasswordStrength.INVALID ;
    }
}
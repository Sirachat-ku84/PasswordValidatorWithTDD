package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นที่น้อยกว่า 8 ตัวควรจะ INVALID
        String pw = "1234567";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 : "+pw+" : Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 : "+pw+"  FAILED: Expected INVALID but got " + result1);
        }

        // Test Case 2: รหัสผ่านต้องมีมากกว่า 8 ตัว และตัวอักษรพิมพ์เล็กทั้งหมดจะ WEAK
        pw = "bogieeis56";
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 : "+pw+" : Passed: only lowercase is WEAK.");
        } else {
            System.out.println("Test Case 2 : "+pw+" : FAILED: Expected WEAK but god " + result2);
        }

        // Test Case 3: รหัสผ่านต้องมีมากกว่า 8 ตัว และตัวอักษรพิมพ์ใหญ่ทั้งหมดจะ MEDUIM
        pw = "MYNAMEEEE844";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 : "+pw+" : Passed: only uppercase is MEDUIM.");
        } else {
            System.out.println("Test Case 3 : "+pw+" : FAILED: Expected MEDUIM but god " + result3);
        }

        // Test Case 4: รหัสผ่านต้องมีมากกว่า 8 ตัว และตัวอักษรผสมกันทั้งพิมพ์ใหญ่และเล็กจะ STRONG
       pw = "TechPrombbbr84";
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 : "+pw+" : Passed: A mix of uppercase and lowercase is STRONG.");
        } else {
            System.out.println("Test Case 4 : "+pw+" : FAILED: Expected STRONG but god " + result4);
        }

        System.out.println("--------------------------------");
    }
}

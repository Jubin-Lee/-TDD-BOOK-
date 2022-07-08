package java.chap03;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordStrengthMeterTest2 {
    @Test
    void meetsAllCriteria_Then_Strong() {
        PasswordStrengthMeter2 meter = new PasswordStrengthMeter2();
        PasswordStrength2 result = meter.meter("ab12!@AB");
        assertEquals(PasswordStrength2.STRONG, result);
        PasswordStrength2 result2 = meter.meter("abc!Add");
        assertEquals(PasswordStrength2.STRONG, result2);
    }

    @Test
    void meetsOtherCriteria_except_for_Length_Then_Normal() {
        PasswordStrengthMeter2 meter = new PasswordStrengthMeter2();
        PasswordStrength2 result = meter.meter("ab12!@A");
        assertEquals(PasswordStrength2.NORMAL, result);
        PasswordStrength2 result2 = meter.meter("Ab12!c");
        assertEquals(PasswordStrength2.NORMAL, result2);
    }

}

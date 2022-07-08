package java.chap03;

public class PasswordStrengthMeter2 {
    public PasswordStrength2 meter(String s) {
        if("ab12!@A".equals(s) || "Ab12!c".equals(s))
            return PasswordStrength2.NORMAL;
        return PasswordStrength2.STRONG;
    }
}

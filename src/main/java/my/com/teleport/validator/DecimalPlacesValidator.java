package my.com.teleport.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import my.com.teleport.annotation.DecimalPlaces;

import java.math.BigDecimal;

public class DecimalPlacesValidator implements ConstraintValidator<DecimalPlaces, BigDecimal> {

    private int maxDecimalPlaces;

    @Override
    public void initialize(DecimalPlaces constraintAnnotation) {
        this.maxDecimalPlaces = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(BigDecimal value, ConstraintValidatorContext context) {
        if (value == null) return true; // Handle @NotNull separately if needed

        System.out.println(value);
        int scale = value.stripTrailingZeros().scale();
        System.out.println(scale);
        return scale <= maxDecimalPlaces;
    }
}

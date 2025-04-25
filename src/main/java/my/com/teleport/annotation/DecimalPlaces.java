package my.com.teleport.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import my.com.teleport.validator.DecimalPlacesValidator;

import java.lang.annotation.*;

@Constraint(validatedBy = DecimalPlacesValidator.class)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface DecimalPlaces {
    String message() default "Invalid decimal places";
    int value();
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

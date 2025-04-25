package my.com.teleport.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import my.com.teleport.annotation.CountryCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class CountryCodeValidator implements ConstraintValidator<CountryCode, String> {
    private static final Set<String> ISO_COUNTRIES =  new HashSet<>(Arrays.asList(Locale.getISOCountries()));

    @Override
    public boolean isValid(String code, ConstraintValidatorContext context) {
        return code != null && ISO_COUNTRIES.contains(code.toUpperCase());
    }
}

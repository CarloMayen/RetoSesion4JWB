package neyam.currencies.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AmountExchangeValidator implements ConstraintValidator<AmountExchange, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && value.matches("^\\d+([.]\\d+)?$");
    }
}

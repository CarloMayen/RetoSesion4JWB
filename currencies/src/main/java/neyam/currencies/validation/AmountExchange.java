package neyam.currencies.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AmountExchangeValidator.class)
public @interface AmountExchange {
    String message() default "Incorrect amount, please check it.";
    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default{};
}

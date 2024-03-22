package ru.nkarskanov.skb.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@Length(min = 6, max = 18, message = "Password must contain at least 6 characters and no more than 18 characters")
@NotNull(message = "Value must not be null")
@Documented
public @interface PasswordConstraint {
    String message() default "Wrong Value";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
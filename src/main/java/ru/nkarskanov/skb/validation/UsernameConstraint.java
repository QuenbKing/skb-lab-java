package ru.nkarskanov.skb.validation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UsernameValidator.class)
@Documented
public @interface UsernameConstraint {
    String message() default "Username must contain at least 4 characters and must not contain numbers";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
package com.example.config.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

@Constraint(validatedBy = GreaterThanValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GreaterThan {
    String message() default "{number_greater_than}";
    Class<?>[] groups() default {};
    Class<? extends javax.validation.Payload>[] payload() default {};
    
    int value() default 0;
}
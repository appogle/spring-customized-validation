package com.example.config.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

@Constraint(validatedBy = SpecificValuesValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SpecificValues {
	String message() default "{field_specific_values}";
    Class<?>[] groups() default {};
    Class<? extends javax.validation.Payload>[] payload() default {};

    String[] strValues() default {};
	int[] intValues() default {};
}

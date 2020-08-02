package com.example.config.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NullOrNotBlankValidator implements ConstraintValidator<NullOrNotBlank, String> {

    public void initialize(NullOrNotBlank constraintAnnotation) {}

    public boolean isValid(String fieldValue, ConstraintValidatorContext constraintValidatorContext) {
		return fieldValue == null || fieldValue.trim().length() != 0;
    }
}

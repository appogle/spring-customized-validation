package com.example.config.validation;

import java.math.BigDecimal;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GreaterThanValidator implements ConstraintValidator<GreaterThan, Object> {

	private int minValue;
	
	public void initialize(GreaterThan constraintAnnotation) {
		minValue = constraintAnnotation.value();
	}

    public boolean isValid(Object fieldValue, ConstraintValidatorContext constraintValidatorContext) {
    	if (fieldValue == null) return true;
    	
    	if (fieldValue instanceof Integer) {
    		if (((Integer)fieldValue).intValue() <= minValue) {
    			return false;
    		}
    	} else if (fieldValue instanceof BigDecimal) {
    		if (((BigDecimal)fieldValue).compareTo(new BigDecimal(minValue)) <= 0) {
    			return false;
    		}
    	}
    	
    	return true;
    }
}

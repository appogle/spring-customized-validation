package com.example.config.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SpecificValuesValidator implements ConstraintValidator<SpecificValues, Object> {

	private String[] strValues;
	private int[] intValues;
	
	public void initialize(SpecificValues constraintAnnotation) {
		strValues = constraintAnnotation.strValues();
		intValues = constraintAnnotation.intValues();

	}
	
	public boolean isValid(Object fieldValue, ConstraintValidatorContext constraintValidatorContext) {
		if (fieldValue == null) {
			return false;
		}
		
		if(fieldValue instanceof String) {
			for (String s : strValues) {
				if (s.equals(fieldValue)) {
					return true;
				}
			}
		} else if (fieldValue instanceof Integer) {
			for (int i : intValues) {
				if (i == ((Integer) fieldValue).intValue()) {
					return true;
				}
			}
		} else if (fieldValue instanceof Short) {
			for (int i : intValues) {
				if (i == ((Short) fieldValue).intValue()) {
					return true;
				}
			}
		}
		
		return false;
	}
	
}
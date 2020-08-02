package com.example.config.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NullOrSpecificValuesValidator implements ConstraintValidator<NullOrSpecificValues, Object> {

	private String[] strValues;
	private int[] intValues;
	
	public void initialize(NullOrSpecificValues constraintAnnotation) {
		strValues = constraintAnnotation.strValues();
		intValues = constraintAnnotation.intValues();

	}
	
	public boolean isValid(Object fieldValue, ConstraintValidatorContext constraintValidatorContext) {
		if (fieldValue == null) {
			return true;
		}
		
		if(fieldValue instanceof String) {
			for (String s : strValues) {
				if (s.equals(fieldValue)) {
					return true;
				}
			}
		} else if (fieldValue instanceof Integer) {
			for (int i : intValues) {
				if (i == ((Integer)fieldValue).intValue()) {
					return true;
				}
			}
		} else if (fieldValue instanceof Short) {
			for (int i : intValues) {
				if (i == ((Short)fieldValue).intValue()) {
					return true;
				}
			}
		}
		
		return false;
	}
	
}
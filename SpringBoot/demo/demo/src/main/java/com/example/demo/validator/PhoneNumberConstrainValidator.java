package com.example.demo.validator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberConstrainValidator implements ConstraintValidator<PhoneNumberConstraint, String> {

    @Override
    public void initialize(PhoneNumberConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String phoneContactField, ConstraintValidatorContext constraintValidatorContext) {
        return phoneContactField != null && phoneContactField.matches("[0-9]+")
                && (phoneContactField.length() > 8) && (phoneContactField.length() < 11);
    }
}


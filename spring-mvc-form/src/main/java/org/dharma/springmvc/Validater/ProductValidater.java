package org.dharma.springmvc.Validater;

import org.dharma.springmvc.model.Product;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ProductValidater implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Product.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"id","id.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name","name.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"type","type.required");
    }
}

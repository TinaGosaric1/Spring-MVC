package com.tg.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
// helper class that contains business rules / validation logic
@Target({ElementType.METHOD, ElementType.FIELD}) // can apply our annotation to a method or field
@Retention(RetentionPolicy.RUNTIME) // how long will the marked annotation be stored or used

public @interface CourseCode {

    // define default course code
    public String value() default "ABC";

    // define default error message
    public String message() default "must start with ABC";

    // define default groups
    public Class<?>[] groups() default {}; // can group related constraints

    // define default payloads
    public Class<? extends Payload>[] payload() default {}; // provide custom details about validation failure (severity level, error code, ...)
}

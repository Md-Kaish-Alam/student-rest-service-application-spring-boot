package com.nuwaish.student_rest_service_application.student;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String exception) {
        super(exception);
    }
}

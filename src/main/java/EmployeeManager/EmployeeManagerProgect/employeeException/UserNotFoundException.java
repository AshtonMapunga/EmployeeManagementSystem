package EmployeeManager.EmployeeManagerProgect.employeeException;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}

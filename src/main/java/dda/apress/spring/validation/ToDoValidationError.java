package dda.apress.spring.validation;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

public class ToDoValidationError {
    @JsonInclude(JsonInclude.Include.NON_EMPTY) //Поле errors должно быть включено даже если оно пустое
    private final List<String> errors = new ArrayList<>();
    private final String errorMessage;

    public ToDoValidationError(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void addValidationError(String error) {
        errors.add(error);
    }

    public List<String> getErrors() {
        return errors;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}

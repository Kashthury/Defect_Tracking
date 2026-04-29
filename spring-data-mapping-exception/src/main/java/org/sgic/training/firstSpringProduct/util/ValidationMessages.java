package org.sgic.training.firstSpringProduct.util;

public class ValidationMessages {
    public static final String SAVED_SUCCESSFULL = "Saved successfully.";
    public static final String SAVE_FAILED = "Save Failed.";
    public static final String DELETE_SUCCESS = "Delete successfully";
    public static final String DELETE_FAILED = "Delete Failed";
    public static final String RETRIEVED = "Retrieved Successfully.";
    public static final String RETRIEVED_FAILED = "Retrieve Failed.";
    public static final String EMAIL_NOT_EMPTY = "please enter email address";
    public static final String INVALID_NAME = "Firstname can contain only A-Z or a-z characters only.";
    public static final String INVALID_EMAIL = "An email should be in the form of: your-email@example.com";

    // Exception Handler
    public static final String FOREIGN_KEY_CONSTRIN = "Unable to Delete: This Record Linked to Another Record.";
    public static final String DUPLICATE_ENTRY = "Duplicate Entry: You are try to insert a data that already in the database.";
    public static final String WRONG_API_CALL = "Wrong API method or path: Please ensure that your API path and method are correct.";
    public static final String WRONG_JSON = "JSON is not in a valid format.";
    public static final String MIN_REQUIREMENT = "At least one attribute must be present";

    // Login
    public static final String INVALID_CREDENTIAL = "Invalid email or password";

    // Invalid Fields
    public static final String INVALID_ID = "Invalid ID: No Value Present.";

    //Others
    public static final String MISMATCH_INPUT = "Input is not in a valid format.";
}

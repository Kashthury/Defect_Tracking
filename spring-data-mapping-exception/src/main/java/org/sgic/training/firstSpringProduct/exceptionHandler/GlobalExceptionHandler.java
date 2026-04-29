package org.sgic.training.firstSpringProduct.exceptionHandler;




import org.sgic.training.firstSpringProduct.enums.RestApiResponseStatusCodes;
import org.sgic.training.firstSpringProduct.util.ErrorCodes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @Autowired
    private ErrorCodes errorCodes;

//    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
//    public ResponseEntity<String> handleHttpRequestMethodNotSupportedException(
//            HttpRequestMethodNotSupportedException e) {
//
//        return ResponseEntity.ok(RestApiResponseStatusCodes.BAD_REQUEST.getMessage());
//    }
//
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> customException(
            Exception e) {
        logger.info("email id not present");
        return ResponseEntity.ok(RestApiResponseStatusCodes.BAD_REQUEST.getMessage());
    }
}

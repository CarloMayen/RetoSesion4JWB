package neyam.currencies.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import neyam.currencies.exception.CurrencyNotFoundException;
import neyam.currencies.models.response.ErrorResponse;

@ControllerAdvice
public class GlobalExeptionHandler {
    @ExceptionHandler(CurrencyNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFound(CurrencyNotFoundException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorResponse(String.format("Currency \" %s \" not found.", e.getCurrency())));
    }
}

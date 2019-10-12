package com.stackroute.MovieApp.exception;

<<<<<<< HEAD
=======
import com.stackroute.MovieApp.exception.MovieNotFoundException;
>>>>>>> 03df5db2c1d07214aa7127c1b620a65bc05c169a
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AdviceController extends ResponseEntityExceptionHandler {

  @ExceptionHandler(value = Exception.class)
  public ResponseEntity<String> exceptionHandler(Exception e) {
    return new ResponseEntity<>("Error thrown globally : " + e.getMessage(), HttpStatus.CONFLICT);
  }

}

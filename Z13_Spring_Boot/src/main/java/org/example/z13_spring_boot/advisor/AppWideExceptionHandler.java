package org.example.z13_spring_boot.advisor;

import jakarta.servlet.http.HttpServletRequest;
import org.example.z13_spring_boot.utill.ResponseUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseUtil exceptionHandler(Exception ex) {
        return new ResponseUtil(
                500,
                "ex.getMessage()",
                null );
    }
}

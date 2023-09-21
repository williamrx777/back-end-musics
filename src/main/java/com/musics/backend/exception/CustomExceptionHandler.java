package com.musics.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(MusicNotFoundException.class)
    public ResponseEntity<String> handleMusicNotFoundException(MusicNotFoundException musicNotFoundException){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(musicNotFoundException.getMessage());
    }

}

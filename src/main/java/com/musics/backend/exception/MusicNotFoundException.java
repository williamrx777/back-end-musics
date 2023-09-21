package com.musics.backend.exception;

public class MusicNotFoundException extends RuntimeException{

    public MusicNotFoundException(Long id) {
        super("Musica não encontrada com o id: " + id);
    }

}

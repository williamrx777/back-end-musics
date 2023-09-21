package com.musics.backend.mappers;

import com.musics.backend.dtos.MusicsDTO;
import com.musics.backend.models.Music;
import org.springframework.stereotype.Component;

@Component
public class MusicMapper {

    public MusicsDTO toDTO(Music music){
        return new MusicsDTO(music.getTitle(), music.getDescription(), music.getImage(), music.getUrl());
    }

    public Music toEntity(MusicsDTO musicsDTO){
        Music music = new Music();
        music.setTitle(musicsDTO.title());
        music.setDescription(musicsDTO.description());
        music.setImage(musicsDTO.image());
        music.setUrl(musicsDTO.url());
        return music;
    }

}

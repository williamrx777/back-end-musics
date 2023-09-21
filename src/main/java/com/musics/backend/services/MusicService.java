package com.musics.backend.services;

import com.musics.backend.dtos.MusicsDTO;

import java.util.List;

public interface MusicService {

    List<MusicsDTO> findAll();

    MusicsDTO post(MusicsDTO musicsDTO);

    MusicsDTO getOne(Long id);

    MusicsDTO update(Long id, MusicsDTO musicsDTO);

    void delete(Long id);


}

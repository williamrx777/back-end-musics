package com.musics.backend.services.impl;

import com.musics.backend.dtos.MusicsDTO;
import com.musics.backend.exception.MusicNotFoundException;
import com.musics.backend.mappers.MusicMapper;
import com.musics.backend.repositories.MusicsRepository;
import com.musics.backend.services.MusicService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {


    private final MusicsRepository musicsRepository;
    private final MusicMapper musicMapper;
    public MusicServiceImpl(MusicsRepository musicsRepository, MusicMapper musicMapper) {
        this.musicsRepository = musicsRepository;
        this.musicMapper = musicMapper;
    }

    @Override
    public List<MusicsDTO> findAll() {
        return musicsRepository.findAll().stream().map(musicMapper::toDTO).toList();
    }

    @Override
    public MusicsDTO post(MusicsDTO musicsDTO) {
        return musicMapper.toDTO(musicsRepository.save(musicMapper.toEntity(musicsDTO)));
    }

    @Override
    public MusicsDTO getOne(Long id) {
        return musicsRepository.findById(id).map(musicMapper::toDTO).orElseThrow(() -> new MusicNotFoundException(id));
    }

    @Override
    public MusicsDTO update(Long id, MusicsDTO musicsDTO) {
        return musicsRepository.findById(id)
                .map(music -> {
                    music.setId(musicsDTO.id());
                    music.setTitle(musicsDTO.title());
                    music.setDescription(musicsDTO.description());
                    music.setImage(musicsDTO.image());
                    music.setUrl(musicsDTO.url());
                    return musicMapper.toDTO(musicsRepository.save(music));
                }).orElseThrow(() -> new MusicNotFoundException(id));
    }

    @Override
    public void delete(Long id) {
        musicsRepository.deleteById(id);
    }
}

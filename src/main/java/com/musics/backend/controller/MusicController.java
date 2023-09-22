package com.musics.backend.controller;

import com.musics.backend.dtos.MusicsDTO;
import com.musics.backend.services.MusicService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/musics")
public class MusicController {

    private final MusicService musicService;

    public MusicController(MusicService musicService) {
        this.musicService = musicService;
    }
    @GetMapping
    public ResponseEntity<List<MusicsDTO>> findAll(){
        var list = musicService.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity<MusicsDTO> post(@RequestBody @Valid MusicsDTO musicsDTO){
        musicService.post(musicsDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(musicsDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MusicsDTO> getOne(@PathVariable Long id){
        return ResponseEntity.ok(musicService.getOne(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MusicsDTO> update(@PathVariable Long id, @RequestBody @Valid MusicsDTO musicsDTO){
        return ResponseEntity.ok(musicService.update(id, musicsDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        musicService.delete(id);
        return ResponseEntity.noContent().build();
    }


}

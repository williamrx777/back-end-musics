package com.musics.backend.repositories;

import com.musics.backend.models.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicsRepository extends JpaRepository<Music,Long> {
}

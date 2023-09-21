package com.musics.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "musics")
@Table(name = "musics")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String image;
    private String url;

}

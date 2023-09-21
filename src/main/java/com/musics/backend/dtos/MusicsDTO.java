package com.musics.backend.dtos;

import jakarta.validation.constraints.NotBlank;

public record MusicsDTO(@NotBlank String title,@NotBlank String description,@NotBlank String image,@NotBlank String url) {
}

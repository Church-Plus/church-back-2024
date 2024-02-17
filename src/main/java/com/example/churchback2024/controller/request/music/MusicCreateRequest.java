package com.example.churchback2024.controller.request.music;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MusicCreateRequest {
    private String musicName;
    private String code;
    private String link;
    private String description;
    private String musicImage;
    private Long folderId;
}
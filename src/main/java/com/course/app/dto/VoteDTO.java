package com.course.app.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VoteDTO {
    private String artistName;
    private String ganrName;
    private String textAbout;
    private String currentTime;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH::mm::ss");

    public VoteDTO(String artistName, String ganrName, String textAbout, LocalDateTime time) {
        this.artistName = artistName;
        this.ganrName = ganrName;
        this.textAbout = textAbout;
        this.currentTime = LocalDateTime.now().format(formatter);
    }

    public String getArtistName() {
        return artistName;
    }

    public String getGanrName() {
        return ganrName;
    }

    public String getTextAbout() {
        return textAbout;
    }

    public String getCurrentTime() {
        return currentTime;
    }

}

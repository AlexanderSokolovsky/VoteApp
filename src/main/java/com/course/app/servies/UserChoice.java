package com.course.app.servies;

import com.course.app.servies.IStatistics;
import com.course.app.servies.IVotes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UserChoice implements IVotes, IStatistics {
  private Set<String> artists = new HashSet<>();
  private Set<String> genres = new HashSet<>();
  private String text;
  private String currentTime;
  private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

  public UserChoice(String[] artistsArr, String[] genresArr, String text) {
    Collections.addAll(artists, artistsArr);
    Collections.addAll(genres, genresArr);
    this.text = text;
    this.currentTime = LocalDateTime.now().format(format);
  }

  public Set<String> getArtists() {
    return artists;
  }

  public Set<String> getGenres() {
    return genres;
  }

  public String getText() {
    return text;
  }

  public String getCurrentTime() {
    return currentTime;
  }

  @Override
  public String getStatisc() {
    return null;
  }

  @Override
  public String getVotes() {
    return null;
  }
}

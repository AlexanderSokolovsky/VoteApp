package com.course.app.dao;

import com.course.app.dto.VoteDTO;
import com.course.app.servies.UserChoice;

import java.util.*;

public class VotesStorage {
	private static VotesStorage instance;
	private List<VoteDTO> voteList = new ArrayList<VoteDTO>();

	private VotesStorage(){

	};

	public static VotesStorage getInstance() {
		if (instance == null) {
			instance = new VotesStorage();
		}
		return instance;
	}

	public void acceptVote (UserChoice choice){
		Set<String> artists = choice.getArtists();
		Set<String> genres = choice.getGenres();
		String currentTime = choice.getCurrentTime();

		for (String artist : artists) {
			if (!artistsMap.containsKey(artist)){
				artistsMap.put(artist, 0);
			}else{
				incrementValue(artistsMap, artist);
			}
		}

		for (String genre : genres) {
			if (!genresMap.containsKey(genre)){
				genresMap.put(genre, 0);
			}else{
				incrementValue(genresMap, genre);
			}
		}

		textMap.put(currentTime, choice.getText());
	}

	public Map<String, Integer> getArtistsMap() {
		return artistsMap;
	}

	public Map<String, Integer> getGenresMap() {
		return genresMap;
	}

	public Map<String, String> getTextMap() {
		return textMap;
	}

	private static void incrementValue (Map<String, Integer> map, String key) {
		Integer count = map.get(key);
		if(count == null){
			map.put(key, 1);
		}else {
			map.put(key, count + 1);
		}
	}
}

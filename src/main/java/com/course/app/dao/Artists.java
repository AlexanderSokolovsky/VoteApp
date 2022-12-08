package com.course.app.dao;

import com.course.app.servies.ISingers;

import java.util.ArrayList;
import java.util.List;

public class Artists implements ISingers {
    private static Artists instance;
    private List<String> list = new ArrayList<>();
    private Artists() {
        list.add("Adele");
        list.add("Billie Eilish");
        list.add("Taylor Swift");
        list.add("Ed Sheeran");
    }

    public static Artists getInstance() {
        if (instance == null) {
            instance = new Artists();
        }
        return instance;
    }
    public void addArtist(String name) {
        list.add(name);
    }

    public void deleteArtist(String name){
        list.remove(name);
    }

    public List<String> getArtists() {
        return list;
    }

    @Override
    public String getSinger() {
        return null;
    }
}

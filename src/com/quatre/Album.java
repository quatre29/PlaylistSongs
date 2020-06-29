package com.quatre;

import org.w3c.dom.html.HTMLInputElement;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String artist;
    private String name;
    private ArrayList<Song> listOfSongs;

    public Album(String artist, String name) {
        this.artist = artist;
        this.name = name;
        this.listOfSongs = new ArrayList<Song>();
    }

    public String getArtist() {
        return this.artist;
    }

    public String getName() {
        return this.name;
    }
    public ArrayList<Song> getListOfSongs() {
        return listOfSongs;
    }

    public void setName(String name) {
        this.name = name;
    }


    private Song findSong(String title){
        for (int i=0; i<this.listOfSongs.size(); i++) {
            Song song = this.listOfSongs.get(i);
            if (song.getTitle().contains(title)) {
                return song;
            }
        }return null;
    }


    public void addSongToAlbum(String title, double duration) {
        if (findSong(title) == null) {
            this.listOfSongs.add(new Song(title, duration));
            System.out.println("Song added to album");
        } else {
            System.out.println("This song is already in the album");
        }
    }


    public void addSongToPlaylist(LinkedList<Song> playlist, String title) {
        Song song = findSong(title);
        if (song != null) {
            playlist.add(song);
            System.out.println("Song added to playlist");
        } else {
            System.out.println("Song not found in the album");
        }
    }

    public void printListOfSongs() {
        for (int i=0; i<listOfSongs.size(); i++) {
            System.out.println(listOfSongs.get(i).getTitle());
        }
    }

}

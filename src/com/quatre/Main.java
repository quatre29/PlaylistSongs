package com.quatre;

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static LinkedList<Song> playList= new LinkedList<Song>();
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {


        Album meteora = new Album("Linkin Park", "Meteora");
        meteora.addSongToAlbum("Breaking the habit", 3.17);
        meteora.addSongToAlbum("Hit The Floor", 2.44);
        meteora.addSongToAlbum("Numb", 3.06);
        albums.add(meteora);

        Album encore = new Album("Eminem", "Encore");
        encore.addSongToAlbum("Mockingbird", 4.18);
        encore.addSongToAlbum("Never enough", 2.39);
        encore.addSongToAlbum("Rain Man", 5.14);
        albums.add(encore);

        meteora.addSongToPlaylist(playList, "Breaking the habit");
        encore.addSongToPlaylist(playList, "Mockingbird");
        encore.addSongToPlaylist(playList, "Mockingbird");

//        printPlayList(playList);
    }

    public static void printPlayList(LinkedList<Song> songList) {
        Iterator<Song> songListIterator = songList.iterator();
        while (songListIterator.hasNext()) {
            System.out.println("ss");

    }

}
}

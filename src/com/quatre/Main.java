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
        meteora.addSongToPlaylist(playList, "Numb");
        encore.addSongToPlaylist(playList, "Mockingbird");
        encore.addSongToPlaylist(playList, "Never enough");
        encore.addSongToPlaylist(playList, "Rain Man");
        encore.addSongToPlaylist(playList, "Castle of Glass"); //not in the album

        printPlayList(playList);
        System.out.println();
        options(playList);
//        meteora.printListOfSongs();
    }

    private static void options(LinkedList<Song> playList) {
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> songListIterator = playList.listIterator();
        printOptions();
        if (playList.isEmpty()) {
            System.out.println("There is no song added in the playlist");
        }else {
            System.out.println("* " + songListIterator.next().getTitle() + " is now playing *");
            System.out.println();
        }
        while (!quit) {
            System.out.print("Enter option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Quiting the menu...");
                    quit = true;
                case 1:
                    if (!forward) {
                        if (songListIterator.hasNext()){
                            songListIterator.next();
                        }
                    }
                    forward = true;
                    playNext(songListIterator);
                    break;
                case 2:
                    if (forward) {
                        if (songListIterator.hasPrevious()) {
                            songListIterator.previous();
                        }
                    }
                    forward = false;
                    playPreview(songListIterator);
                    break;
                case 3:
                    //not in current build
                    break;
                case 4:
                    removeSong(songListIterator);
                    break;
                case 5:
                    replay(songListIterator);
                    break;
                case 6:
                    printPlayList(playList);
                    break;
            }
        }
    }

    public static void printOptions() {
        System.out.println("Choose option\n" +
                "0 - Quit menu\n" +
                "1 - Next song\n" +
                "2 - Previous song\n" +
                "3 - N/A\n" +
                "4 - Remove song\n" +
                "5 - Replay current song\n" +
                "6 - List of songs in the playlist");
    }

    public static void printPlayList(LinkedList<Song> songList) {
        Iterator<Song> songListIterator = songList.iterator();
        while (songListIterator.hasNext()) {
            System.out.println(songListIterator.next().getTitle());

    }
}

    public static void playNext(ListIterator<Song> song) {
        if (song.hasNext()) {
            System.out.println("* " + song.next().getTitle() + " is now playing *");
        } else {
            System.out.println("You've reached the end of the list!");
        }
    }
    public static void playPreview(ListIterator<Song> song) {
        if (song.hasPrevious()) {
            System.out.println("* " + song.previous().getTitle() + " is now playing *");
        } else {
            System.out.println("You've reached the start of the list!");
        }
    }

    public static void replay(ListIterator<Song> song) {

        System.out.println("* " + song.previous().getTitle() + " is now replaying!");
        if (song.hasPrevious() || song.hasNext()) {
            song.next();
        }
    }

    public static void removeSong(ListIterator<Song> song) {
        song.previous();
        System.out.println(song.next().getTitle() + " has been removed from the playlist!");
        song.remove();
    }
}

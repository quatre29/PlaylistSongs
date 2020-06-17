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

        printPlayList(playList);
        System.out.println();
        options(playList);
//        meteora.printListOfSongs();
    }

    private static void options(LinkedList<Song> playList) {
        boolean quit = false;
        ListIterator<Song> songListIterator = playList.listIterator();
        printOptions();
        if (playList.isEmpty()) {
            System.out.println("There is no song added in the playlist");
        }else {
            System.out.println(songListIterator.next() + " is now playing");
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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }
    }

    public static void printOptions() {
        System.out.println("Choose option\n" +
                "0 - Quit menu\n" +
                "1 - Next song\n" +
                "2 - Previous song\n" +
                "3 - Skip forward\n" +
                "4 - Skip backwards\n" +
                "5 - Replay current song\n" +
                "6 - List of songs in the playlist");
    }

    public static void printPlayList(LinkedList<Song> songList) {
        Iterator<Song> songListIterator = songList.iterator();
        while (songListIterator.hasNext()) {
            System.out.println(songListIterator.next().getTitle());

    }

}
}

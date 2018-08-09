package com.company;

public class Main {

    public static void main(String[] args) {

        JukeBox jukebox = new JukeBox();

        for (int i = 0; i < 10; i++) {

            jukebox.kiesNummer(i);

            jukebox.werpMuntIn();

            System.out.println(jukebox.speel());
        }

        jukebox.verwijderMunten();

        jukebox.kiesNummer(2);

        jukebox.werpMuntIn();

        System.out.println(jukebox.speel());
    }
}

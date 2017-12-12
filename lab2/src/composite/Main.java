package composite;

/**
 * Created by vitiok on 12/12/17.
 */
public class Main {
    public static void main(String[] args){

        SongComponent houseMusic =
                new SongGroup("House",
                        "is a genre of electronic music created by club DJs and music producers in Chicago in the early 1980s.");

        SongComponent dubstepMusic =
                new SongGroup("\nDubstep",
                        "is a genre of rock that developed in the late 1960s, largely in the UK and in the US");

        SongComponent classicMusic =
                new SongGroup("\nClassic",
                        "is art music produced or rooted in the traditions of Western music, including both liturgical (religious) and secular music.");

        // Top level component that holds everything

        SongComponent everySong = new SongGroup("Song List", "My cool song list");

        everySong.add(houseMusic);

        houseMusic.add(new Song("All day sunshine", "ADF", 1999));
        houseMusic.add(new Song("Headhunter", "House Chill", 2000));

        houseMusic.add(classicMusic);

        classicMusic.add(new Song("For Elise", "beethoven", 1810));
        classicMusic.add(new Song("Wihuri Sibelius Prize", "Igor Stravinsky", 1963));

        // This is a SongGroup that just holds Songs

        everySong.add(dubstepMusic);

        dubstepMusic.add(new Song("The hero", "Sabath", 2010));
        dubstepMusic.add(new Song("Ages", "Motorhead", 2015));

        RetroDisk crazyLarry = new RetroDisk(everySong);

        crazyLarry.getSongList();

    }
}

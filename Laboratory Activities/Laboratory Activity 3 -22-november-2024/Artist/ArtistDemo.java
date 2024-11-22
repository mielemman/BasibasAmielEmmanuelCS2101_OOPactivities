public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Singer.Genre.POP);
        singer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Pablo Picasso", "Spanish", 91, "Visual Arts", Painter.Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Brandon Sanderson", "American", 45, "Literature", Writer.WritingStyle.FICTION);
        writer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Niana Guerrero", "Filipino", 18, "Dance", Dancer.DanceStyle.HIPHOP);
        dancer.displayInfo();

    }
}

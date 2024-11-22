public class Singer extends Artist {
    public enum Genre {
        POP,
        ROCK,
        CLASSICAL,
        JAZZ,
        HIPHOP
    }

    private Genre genre;

    public Singer(String name, String nationality, int age, String specialty, Genre genre) {
        super(name, nationality, age, specialty);
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("== Singer's Info ==");
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}

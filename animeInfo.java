public class animeInfo {
    String animeTitle, animeChar;

    // this is a constructor
    animeInfo(String animeTitle, String animeChar) {
        this.animeTitle = animeTitle;
        this.animeChar = animeChar;
    }

    // declaring setter and getter
    public void setAnimeTitle(String animeTitle) {
        this.animeTitle = animeTitle;
    }

    public String getAnimeTitle() {
        return animeTitle;
    }

    public void setAnimeChar(String animeChar) {
        this.animeChar = animeChar;
    }

    public String getAnimeChar() {
        return animeChar;
    }
}
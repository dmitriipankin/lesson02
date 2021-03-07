package lesson02;

public class Song {

    private String nameOfSong;
    private String nameOfPerformer;

    public Song(String nameOfSong, String nameOfPerformer){
        this.nameOfSong = nameOfSong;
        this.nameOfPerformer = nameOfPerformer;
    }
    public String getNameOfPerformer() {

        return this.nameOfPerformer;
    }

    public void setNameOfPerformer(String nameOfPerformer) {

        this.nameOfPerformer = nameOfPerformer;
    }

    public String getNameOfSong() {

        return this.nameOfSong;
    }

    public void setNameOfSong(String nameOfSong) {

        this.nameOfSong = nameOfSong;
    }
}

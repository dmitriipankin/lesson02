package lesson02;

public  class SoundMedia {

    private String nameOfMedia;
    private Song song;

    SoundMedia(String nameOfMedia){
        this.nameOfMedia = nameOfMedia;

    }
    public Song getSong() {

        return this.song;
    }
    public Boolean IsEmpty(){
        if(song==null)
            return true;
        else
            return false;
    }
    public String getNameOfMedia() {

        return this.nameOfMedia;
    }

    public void setNameOfMedia(String nameOfMedia) {

        this.nameOfMedia = nameOfMedia;
    }

    public  String writeSong(Song song){
        this.song = song;
        return "успешно!";
    }
    public  String whatSong(){

        return song.getNameOfSong();
    }



}

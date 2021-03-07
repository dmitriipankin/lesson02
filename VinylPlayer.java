package lesson02;

public class VinylPlayer extends SoundDevice{

    VinylPlayer(){

        super("Виниловый проигрыватель");
    }

    public Boolean isVinyl(SoundMedia soundMedia){
        if(soundMedia instanceof Vinyl)
            return true;
        else
            return false;
    }
    @Override
    public void play(SoundMedia soundMedia) {

        if (isVinyl(soundMedia) && !soundMedia.IsEmpty()){
            System.out.println(getNameOfDevice() + " текущая песня:"+ "\nназвание композиции: "+soundMedia.getSong().getNameOfSong() + "\nимя исполнителя: " + soundMedia.getSong().getNameOfPerformer());
        }
        else if (!(isVinyl(soundMedia))){
            System.out.println(getNameOfDevice() + " не может воспроизвести " + soundMedia.getNameOfMedia());
        }
        else if (soundMedia.IsEmpty() && isVinyl(soundMedia))
            System.out.println( "Устройство воспроизводит пустой носитель, запишите на носитель песню ");

    }
}

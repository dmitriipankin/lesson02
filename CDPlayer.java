package lesson02;

public class CDPlayer extends SoundDevice{


    CDPlayer() {
        super("CD-player");
    }
    public Boolean isCD(SoundMedia soundMedia){
        if(soundMedia instanceof CD)
            return true;
        else
            return false;
    }

    @Override
    public void play(SoundMedia soundMedia) {
        if (isCD(soundMedia) && !soundMedia.IsEmpty()){
            System.out.println(getNameOfDevice() + " текущая песня:"+ "\nназвание композиции: "+soundMedia.getSong().getNameOfSong() + "\nимя исполнителя: " + soundMedia.getSong().getNameOfPerformer());
        }
        else if (!(isCD(soundMedia))){
            System.out.println(getNameOfDevice() + " не может воспроизвести " + soundMedia.getNameOfMedia());
        }
        else if (soundMedia.IsEmpty() && isCD(soundMedia))
            System.out.println( "Устройство воспроизводит пустой носитель, запишите на носитель песню ");

    }
}

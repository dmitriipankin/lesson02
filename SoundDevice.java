package lesson02;

public abstract class  SoundDevice {

    private String nameOfDevice;

    SoundDevice(String nameOfDevice){
        this.nameOfDevice= nameOfDevice;
    }

    public String getNameOfDevice() {

        return this.nameOfDevice;
    }

    public void setNameOfDevice(String nameOfDevice) {

        this.nameOfDevice = nameOfDevice;
    }


    public  abstract void play (SoundMedia soundMedia);

}

package lesson02;

/**
 * Структура программы:
 * Существует абстрактный класс SoundDevice, являющийся супер классом для VinylPlayer и CDPlayer
 * классы, наследующие SoundDevice реализуют метод play. Параметром метода является объект класса SoundMedia
 * класс SoundMedia имеет метод writeSong (по сути метод setSong) с параметром Song song, для записи песни на носитель.
 * Класс Song имеет поля: название песни и название исполнителя. А так же методы get и set. Каждый наследник класса SoundDevice
 * реализует абстрактный метод play с пармаметром SoundMedia soundMedia. В методе play проверяется является ли носитель экземпляром
 * класса подходящего для воспроизведения конктретным устройстьвом, а так же обработка nullPointerException, что по сути является случаем,
 * когда на носитель не записана песня. Метод isEmpty класса SoundMedia, проверяет поле Song song на null.
 * Использование:
 * -создать SoundDevice;
 * -создать SoundMedia;
 * -создать Song;
 * -записать песню на носитель(если не записать, то устройство проиграет пустой носитель);
 * -проиграть носитель на устройстве.
 */
public class Main {
    public static void main(String[] args) {
        // создание музыкального устройства, в дефолтном конструкторе инициализируется имя устройства в значении соответсвующем названию класса
        VinylPlayer vinylPlayer = new VinylPlayer();
        CDPlayer cdPlayer = new CDPlayer();

        // создание винилового диска, в дефолтном конструкторе инициализируется имя носителя в значении "Винил"
        Vinyl vinyl = new Vinyl();
        CD cd = new CD();
        //Создание песни, коструктор принимает название песни и имя исполнителя
        Song song = new Song("What's next", "Drake");
        Song song1 = new Song("Wants needs", "Drake");

        //Запись песни на носитель
        vinyl.writeSong(song);

        //Попытка проиграть носитель устройством
        vinylPlayer.play(vinyl);
        cdPlayer.play(vinyl);


    }
}

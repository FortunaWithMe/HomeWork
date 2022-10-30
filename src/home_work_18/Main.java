package home_work_18;

public class Main {
    public static void main(String[] args) {

        MusicStyles[] bands = new MusicStyles[3];
        bands[0] = new ClassicMusic();
        bands[1] = new PopMusic();
        bands[2] = new RockMusic();

        for (MusicStyles style : bands) {
            style.playMusic();
        }
    }
}

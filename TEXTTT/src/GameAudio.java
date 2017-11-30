import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class GameAudio {
    public static void AttackSound(String path) throws Exception
    {
        //Opens sound file
        String AttackSound = "audio/Attack.wav";
        InputStream in = new FileInputStream(AttackSound);

        //Create audio stream from input stream
        AudioStream audioStream = new AudioStream(in);

        //Play the audio clip with the audioPlayer class
        AudioPlayer.player.start(audioStream);

    }
    public static void BoostSound(String path) throws Exception
    {
        //Opens sound file
        String BoostSound = "audio/Boost.wav";
        InputStream in = new FileInputStream(BoostSound);

        //Create audio stream from input stream
        AudioStream audioStream = new AudioStream(in);

        //Play the audio clip with the audioPlayer class
        AudioPlayer.player.start(audioStream);

    }
}

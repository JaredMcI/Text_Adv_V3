import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.InputStream;

// Got this off of Jack Teahan, T00192059, he helped me with putting audio into my programme.
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
    public static void TingSound(String path) throws Exception
    {
        //Opens sound file
        String TingSound = "audio/Ting.wav";
        InputStream in = new FileInputStream(TingSound);

        //Create audio stream from input stream
        AudioStream audioStream = new AudioStream(in);

        //Play the audio clip with the audioPlayer class
        AudioPlayer.player.start(audioStream);

    }
}

package main.infrastructure;

import java.nio.file.Path;
import java.time.Duration;

public interface IMediaEngine {
    
    void load(Path path);
    
    void play();
    
    void pause();

    void stop();

    void seek(Duration position);

    void setVolume(double volume);

    Duration getCurrentPosition();

    Duration getDuration();

    boolean isPlaying();
}

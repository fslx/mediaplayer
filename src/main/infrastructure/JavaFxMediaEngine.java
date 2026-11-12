package main.infrastructure;

import java.nio.file.Path;
import java.time.Duration;

import javax.print.attribute.standard.Media;

public class JavaFxMediaEngine implements IMediaEngine {

    private MediaPlayer player;

    @Override
    public void load(Path path) {
        stop();

        Media media = new Media(path.toUri().toString());
        player = new MediaPlayer(media);
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pause'");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }

    @Override
    public void seek(Duration position) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'seek'");
    }

    @Override
    public void setVolume(double volume) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVolume'");
    }

    @Override
    public Duration getCurrentPosition() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCurrentPosition'");
    }

    @Override
    public Duration getDuration() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDuration'");
    }

    @Override
    public boolean isPlaying() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isPlaying'");
    }
    
}

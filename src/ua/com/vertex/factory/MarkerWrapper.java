package ua.com.vertex.factory;

import ua.com.vertex.factory.impl.GreenMarker;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by sweet_home on 10.09.16.
 */
public class MarkerWrapper{
    Marker wrapped;

    public MarkerWrapper(Marker wrapped) {
        this.wrapped = wrapped;
    }

    public void print(String string) {
        wrapped.print(string);
    }

    public void print(String s, OutputStream outputStream) throws IOException {
        outputStream.write((s + "\n").getBytes());
        outputStream.flush();
    }
}

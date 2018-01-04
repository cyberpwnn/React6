/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;

public class Xtjf
extends GZIPInputStream {
    public Xtjf(InputStream inputStream) throws IOException {
        super(inputStream);
        this.inf = new Inflater(false);
    }
}


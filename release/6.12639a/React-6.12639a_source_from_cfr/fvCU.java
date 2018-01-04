/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;

public class fvCU
extends GZIPOutputStream {
    public fvCU(OutputStream outputStream, int n) throws IOException {
        super(outputStream);
        this.def = new Deflater(n, false);
    }
}


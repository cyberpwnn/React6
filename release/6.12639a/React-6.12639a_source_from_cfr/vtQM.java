/*
 * Decompiled with CFR 0_123.
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class vtQM
implements yBDo<BufferedInputStream, BufferedOutputStream> {
    private final int bufferSize;

    public vtQM(int n) {
        this.bufferSize = n;
    }

    public vtQM() {
        this(8192);
    }

    public BufferedInputStream UtIU(InputStream inputStream) throws IOException {
        return new BufferedInputStream(inputStream, (Integer)o.a(this, -1156170099));
    }

    public BufferedOutputStream UtIU(OutputStream outputStream) throws IOException {
        return new BufferedOutputStream(outputStream, (Integer)o.a(this, -1156170099));
    }

    @Override
    public /* synthetic */ OutputStream yJLS(OutputStream outputStream) throws IOException {
        return this.UtIU(outputStream);
    }

    @Override
    public /* synthetic */ InputStream yJLS(InputStream inputStream) throws IOException {
        return this.UtIU(inputStream);
    }
}


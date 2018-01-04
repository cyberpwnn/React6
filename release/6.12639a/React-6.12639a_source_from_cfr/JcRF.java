/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;

public class JcRF
implements yBDo<CipherInputStream, CipherOutputStream> {
    private final Cipher sJIc;

    public JcRF(Cipher cipher) {
        this.sJIc = cipher;
    }

    public CipherInputStream biLo(InputStream inputStream) throws IOException {
        return new CipherInputStream(inputStream, (Cipher)o.a(this, 2072395404));
    }

    public CipherOutputStream biLo(OutputStream outputStream) throws IOException {
        return new CipherOutputStream(outputStream, (Cipher)o.a(this, 2072395404));
    }

    @Override
    public /* synthetic */ OutputStream yJLS(OutputStream outputStream) throws IOException {
        return this.biLo(outputStream);
    }

    @Override
    public /* synthetic */ InputStream yJLS(InputStream inputStream) throws IOException {
        return this.biLo(inputStream);
    }
}


/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IqPU
implements yBDo<Xtjf, fvCU> {
    private final int jjBv;

    public IqPU(int n) {
        this.jjBv = n;
    }

    public IqPU() {
        this(1);
    }

    public Xtjf VwLY(InputStream inputStream) throws IOException {
        return new Xtjf(inputStream);
    }

    public fvCU VwLY(OutputStream outputStream) throws IOException {
        return new fvCU(outputStream, (Integer)o.a(this, -878756213));
    }

    @Override
    public /* synthetic */ OutputStream yJLS(OutputStream outputStream) throws IOException {
        return this.VwLY(outputStream);
    }

    @Override
    public /* synthetic */ InputStream yJLS(InputStream inputStream) throws IOException {
        return this.VwLY(inputStream);
    }
}


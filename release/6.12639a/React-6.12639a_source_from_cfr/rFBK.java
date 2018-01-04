/*
 * Decompiled with CFR 0_123.
 */
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import javax.crypto.Cipher;

public class rFBK
extends InputStream {
    private InputStream in;
    private final sQUP rFbX;
    private boolean aNGG;
    private byte[] MnAE = new byte[8];

    public rFBK(InputStream inputStream) {
        this.in = inputStream;
        this.rFbX = new sQUP();
        this.aNGG = false;
    }

    public rFBK(byte[] arrby) {
        this(new ByteArrayInputStream(arrby));
    }

    public rFBK Dqxl(int n) {
        rFBK.Oq((sQUP)o.a(this, 172048026), n);
        return this;
    }

    public final feCR<String> WOht() throws IOException {
        int n = this.readInt();
        feCR<String> feCR2 = new feCR<String>();
        int n2 = 0;
        while (n2 < n) {
            rFBK.Oq(feCR2, this.readString());
            ++n2;
        }
        return feCR2;
    }

    public final feCR<Double> jGAA() throws IOException {
        int n = this.readInt();
        feCR<Double> feCR2 = new feCR<Double>();
        int n2 = 0;
        while (n2 < n) {
            rFBK.Oq(feCR2, rFBK.Oq(this.readDouble()));
            ++n2;
        }
        return feCR2;
    }

    public final feCR<Long> XdNf() throws IOException {
        int n = this.readInt();
        feCR<Long> feCR2 = new feCR<Long>();
        int n2 = 0;
        while (n2 < n) {
            rFBK.Oq(feCR2, rFBK.Oq(this.readLong()));
            ++n2;
        }
        return feCR2;
    }

    public final feCR<mGQw> yJLS(mGQw mGQw2) throws Exception {
        int n = this.readInt();
        feCR<mGQw> feCR2 = new feCR<mGQw>();
        int n2 = 0;
        while (n2 < n) {
            mGQw mGQw3 = (mGQw)rFBK.Oq(rFBK.Oq(rFBK.Oq(mGQw2), new Class[0]), new Object[0]);
            this.UtIU(mGQw3);
            rFBK.Oq(feCR2, mGQw3);
            ++n2;
        }
        return feCR2;
    }

    public rFBK yJLS(Cipher cipher) {
        rFBK.Oq((sQUP)o.a(this, 172048026), cipher);
        return this;
    }

    public rFBK MBLa() {
        rFBK.Oq((sQUP)o.a(this, 172048026));
        return this;
    }

    private void Vnil() throws IOException {
        if (!((Boolean)o.a(this, 682507926)).booleanValue()) {
            o.v(this, 682507926, true);
            o.v(this, 1426341525, rFBK.Oq((sQUP)o.a(this, 172048026), (InputStream)o.a(this, 1426341525)));
        }
    }

    @Override
    public int read() throws IOException {
        this.Vnil();
        Object object = rFBK.Oq((InputStream)o.a(this, 1426341525));
        return (int)object;
    }

    public final boolean readBoolean() throws IOException {
        int n = this.read();
        if (n < 0) {
            throw new EOFException();
        }
        if (n != 0) {
            return true;
        }
        return false;
    }

    public final byte readByte() throws IOException {
        int n = this.read();
        if (n < 0) {
            throw new EOFException();
        }
        return (byte)n;
    }

    public final short readShort() throws IOException {
        int n;
        int n2 = this.read();
        if ((n2 | (n = this.read())) < 0) {
            throw new EOFException();
        }
        return (short)((n2 << 8) + n);
    }

    public final char readChar() throws IOException {
        int n;
        int n2 = this.read();
        if ((n2 | (n = this.read())) < 0) {
            throw new EOFException();
        }
        return (char)((n2 << 8) + n);
    }

    public final int readInt() throws IOException {
        int n;
        int n2;
        int n3;
        int n4 = this.read();
        if ((n4 | (n2 = this.read()) | (n3 = this.read()) | (n = this.read())) < 0) {
            throw new EOFException();
        }
        return (n4 << 24) + (n2 << 16) + (n3 << 8) + n;
    }

    public final void readFully(byte[] arrby) throws IOException {
        this.readFully(arrby, 0, arrby.length);
    }

    public final void readFully(byte[] arrby, int n, int n2) throws IOException {
        if (n2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int n3 = 0;
        while (n3 < n2) {
            int n4 = this.read(arrby, n + n3, n2 - n3);
            if (n4 < 0) {
                throw new EOFException();
            }
            n3 += n4;
        }
    }

    @Override
    public int read(byte[] arrby) throws IOException {
        return this.read(arrby, 0, arrby.length);
    }

    @Override
    public int read(byte[] arrby, int n, int n2) throws IOException {
        int n3;
        if (arrby == null) {
            throw new NullPointerException();
        }
        if (n < 0 || n2 < 0 || n2 > arrby.length - n) {
            throw new IndexOutOfBoundsException();
        }
        if (n2 == 0) {
            return 0;
        }
        int n4 = this.read();
        if (n4 == -1) {
            return -1;
        }
        arrby[n] = (byte)n4;
        n3 = 1;
        try {
            while (n3 < n2) {
                n4 = this.read();
                if (n4 != -1) {
                    arrby[n + n3] = (byte)n4;
                    ++n3;
                    continue;
                }
                break;
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return n3;
    }

    public final long readLong() throws IOException {
        this.readFully((byte[])o.a(this, -37732717), 0, 8);
        return ((long)((byte[])o.a(this, -37732717))[0] << 56) + ((long)(((byte[])o.a(this, -37732717))[1] & 255) << 48) + ((long)(((byte[])o.a(this, -37732717))[2] & 255) << 40) + ((long)(((byte[])o.a(this, -37732717))[3] & 255) << 32) + ((long)(((byte[])o.a(this, -37732717))[4] & 255) << 24) + (long)((((byte[])o.a(this, -37732717))[5] & 255) << 16) + (long)((((byte[])o.a(this, -37732717))[6] & 255) << 8) + (long)(((byte[])o.a(this, -37732717))[7] & 255);
    }

    public final float readFloat() throws IOException {
        return (float)rFBK.Oq(this.readInt());
    }

    public final double readDouble() throws IOException {
        return (double)rFBK.Oq(this.readLong());
    }

    public final String readString() throws IOException {
        int n = this.readInt();
        Object object = "";
        int n2 = 0;
        while (n2 < n) {
            object = rFBK.Oq(rFBK.Oq(new StringBuilder((String)rFBK.Oq(object)), this.readChar()));
            ++n2;
        }
        return object;
    }

    public final void UtIU(mGQw mGQw2) throws Exception {
        mGQw2.yJLS(this);
    }

    @Override
    public void close() throws IOException {
        rFBK.Oq((InputStream)o.a(this, 1426341525));
    }

    private static Object Oq(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


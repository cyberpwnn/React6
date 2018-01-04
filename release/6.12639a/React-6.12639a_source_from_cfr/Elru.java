/*
 * Decompiled with CFR 0_123.
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.OutputStream;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import javax.crypto.Cipher;

public class Elru
extends OutputStream {
    private OutputStream out;
    private OutputStream ebbr;
    private final sQUP rFbX;
    private boolean aNGG;
    private byte[] OtFh = new byte[8];

    public Elru(OutputStream outputStream) {
        this.out = outputStream;
        this.ebbr = outputStream;
        this.rFbX = new sQUP();
        this.aNGG = false;
    }

    public Elru() {
        this(new ByteArrayOutputStream());
    }

    public Elru MSAa(int n) {
        Elru.Pg((sQUP)o.a(this, 238305024), n);
        return this;
    }

    public Elru JIWX(int n) {
        Elru.Pg((sQUP)o.a(this, 238305024), n);
        return this;
    }

    public Elru UtIU(Cipher cipher) {
        Elru.Pg((sQUP)o.a(this, 238305024), cipher);
        return this;
    }

    private void Vnil() throws IOException {
        if (!((Boolean)o.a(this, 1485717246)).booleanValue()) {
            o.v(this, 1485717246, true);
            o.v(this, -1386332419, Elru.Pg((sQUP)o.a(this, 238305024), (OutputStream)o.a(this, -1386332419)));
        }
    }

    public final void writeBoolean(boolean bl) throws IOException {
        this.write(bl ? 1 : 0);
    }

    public final void writeByte(int n) throws IOException {
        this.write(n);
    }

    public final void writeShort(int n) throws IOException {
        this.write(n >>> 8 & 255);
        this.write(n & 255);
    }

    public final void writeChar(int n) throws IOException {
        this.write(n >>> 8 & 255);
        this.write(n & 255);
    }

    public final void writeInt(int n) throws IOException {
        this.write(n >>> 24);
        this.write(n >>> 16 & 255);
        this.write(n >>> 8 & 255);
        this.write(n & 255);
    }

    public final void ktHX(feCR<String> feCR2) throws IOException {
        this.writeInt((int)Elru.Pg(feCR2));
        Object object = Elru.Pg(feCR2);
        while (object.hasNext()) {
            String string = (String)object.next();
            this.writeString(string);
        }
    }

    public final void HeSD(feCR<Double> feCR2) throws IOException {
        this.writeInt((int)Elru.Pg(feCR2));
        Object object = Elru.Pg(feCR2);
        while (object.hasNext()) {
            Double d = (Double)object.next();
            this.writeDouble((double)Elru.Pg(d));
        }
    }

    public final void Ipep(feCR<Long> feCR2) throws IOException {
        this.writeInt((int)Elru.Pg(feCR2));
        Object object = Elru.Pg(feCR2);
        while (object.hasNext()) {
            Long l = (Long)object.next();
            this.writeLong((long)Elru.Pg(l));
        }
    }

    public final void qcvH(feCR<mGQw> feCR2) throws Exception {
        this.writeInt((int)Elru.Pg(feCR2));
        Object object = Elru.Pg(feCR2);
        while (object.hasNext()) {
            mGQw mGQw2 = (mGQw)object.next();
            this.biLo(mGQw2);
        }
    }

    public final void writeLong(long l) throws IOException {
        ((byte[])o.a((Object)this, (int)1253195515))[1] = (byte)(l >>> 48);
        ((byte[])o.a((Object)this, (int)1253195515))[2] = (byte)(l >>> 40);
        ((byte[])o.a((Object)this, (int)1253195515))[3] = (byte)(l >>> 32);
        ((byte[])o.a((Object)this, (int)1253195515))[4] = (byte)(l >>> 24);
        ((byte[])o.a((Object)this, (int)1253195515))[5] = (byte)(l >>> 16);
        ((byte[])o.a((Object)this, (int)1253195515))[6] = (byte)(l >>> 8);
        ((byte[])o.a((Object)this, (int)1253195515))[7] = (byte)l;
        this.write((byte[])o.a(this, 1253195515), 0, 8);
    }

    public final void writeFloat(float f) throws IOException {
        this.writeInt((int)Elru.Pg(f));
    }

    public final void writeDouble(double d) throws IOException {
        this.writeLong((long)Elru.Pg(d));
    }

    public final void writeString(String string) throws IOException {
        Object object = Elru.Pg(string);
        this.writeInt((int)object);
        int n = 0;
        while (n < object) {
            Object object2 = Elru.Pg(string, n);
            this.writeChar((int)object2);
            ++n;
        }
    }

    public void NVQY() {
    }

    @Override
    public void write(int n) throws IOException {
        this.Vnil();
        Elru.Pg((OutputStream)o.a(this, -1386332419), n);
    }

    public void biLo(mGQw mGQw2) throws Exception {
        Elru elru = new Elru();
        mGQw2.yJLS(elru);
        this.write(elru.getBytes());
    }

    public final byte[] getBytes() throws IOException {
        if ((OutputStream)o.a(this, -917553527) instanceof ByteArrayOutputStream) {
            this.flush();
            return (byte[])Elru.Pg((ByteArrayOutputStream)((OutputStream)o.a(this, -917553527)));
        }
        throw new InvalidClassException(mrFx$WjFM.d("\u9fa0\ufa47\u1931\u974a\u0739\u63af\u1d90\u340b\u4b7a\u043e\uabd2\u585b\u8e01\uc809\uc5f0\ud1b7\ufb6c\u05da\u260d\u7c4d\u9e4c\u88b9\uef4f\u2c0f\u680c\u2ea0\ufd1a\ue575\u1df7\uad2b\uf5a2\u6ff6\u6ccb\uf6e4\u82b7\u618a\uf719\u29c8\u24ef\u5696\u5a7a\u3dcc\ue9a2\u566f\ub295\ue7e7\uce5a\u5023\u0abd\u4506\u5ee1\ud820\u89a9\u31fb\u93a3\ub6c5\u50c8"));
    }

    @Override
    public void close() throws IOException {
        Elru.Pg((OutputStream)o.a(this, -1386332419));
    }

    @Override
    public void flush() throws IOException {
        Elru.Pg((OutputStream)o.a(this, -1386332419));
    }

    private static Object Pg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


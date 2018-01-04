/*
 * Decompiled with CFR 0_123.
 */
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.net.URL;

public class BuLd {
    private mrHN PDCa;
    private ktRX ekSD;
    private QEdN lERe;
    private oVJh bagW;
    private URL url;
    private File tLiC;
    private int bufferSize;
    private byte[] buffer;

    public BuLd(oVJh oVJh2, URL uRL, File file, int n) {
        this.url = uRL;
        this.tLiC = file;
        this.bagW = oVJh2;
        this.bufferSize = n;
        this.buffer = new byte[n];
        this.lERe = new QEdN();
        this.PDCa = (mrHN)((Object)o.k(1023688251));
        this.ekSD = (ktRX)((Object)o.k(-1645330742));
    }

    public void start() throws IOException {
        if (BuLd.Mt((mrHN)((Object)o.a(this, 662388425)), (mrHN)((Object)o.k(1506164424))) != false) {
            throw new IOException(FMkR$WjFM.a("\u2fe1\u58a2\ucda3\u001e\u1d06\u0b6a\u1514\u5cfe\u76a0\ua80e\u7ac6\u3645\u4ffd\u3d58\u4c65\ue887\u1979\u2b75\u2497\u6373\uc4c4\ue43d\u1dd4\ua568\uf673"));
        }
        try {
            Object object = BuLd.Mt((URL)o.a(this, -568508730));
            Object object2 = BuLd.Mt(object);
            Object object3 = BuLd.Mt();
            Object object4 = false;
            BufferedInputStream bufferedInputStream = new BufferedInputStream((InputStream)BuLd.Mt((URL)o.a(this, -568508730)));
            FileOutputStream fileOutputStream = new FileOutputStream((File)o.a(this, -1444135228));
            mrHN mrHN2 = (mrHN)((Object)o.a(this, 662388425));
            BuLd.Mt((QEdN)o.a(this, 1922121411), object2);
            BuLd.Mt((QEdN)o.a(this, 1922121411), 0);
            o.v(this, 1798258351, (Object)(object2 <= 0 ? (ktRX)((Object)o.k(-1645330742)) : (ktRX)((Object)o.k(1453473456))));
            o.v(this, 662388425, (Object)((mrHN)((Object)o.k(1506164424))));
            ((oVJh)o.a(this, -324845906)).yJLS(this, mrHN2, (mrHN)((Object)o.a(this, 662388425)));
            ((oVJh)o.a(this, -324845906)).yJLS(this);
            do {
                Object object5 = BuLd.Mt(bufferedInputStream, (byte[])o.a(this, 1136410285), false, ((Integer)o.a(this, 756629164)).intValue());
                object4 = object5;
                if (object5 == -1) break;
                BuLd.Mt(fileOutputStream, (byte[])o.a(this, 1136410285), false, object4);
                BuLd.Mt((QEdN)o.a(this, 1922121411), BuLd.Mt((QEdN)o.a(this, 1922121411)) + (Object)object4);
                BuLd.Mt((QEdN)o.a(this, 1922121411), BuLd.Mt() - object3);
                ((oVJh)o.a(this, -324845906)).yJLS(this, (long)BuLd.Mt((QEdN)o.a(this, 1922121411)), (long)BuLd.Mt((QEdN)o.a(this, 1922121411)), (double)BuLd.Mt((QEdN)o.a(this, 1922121411)));
            } while (true);
            BuLd.Mt(bufferedInputStream);
            BuLd.Mt(fileOutputStream);
            mrHN2 = (mrHN)((Object)o.a(this, 662388425));
            o.v(this, 662388425, (Object)((mrHN)((Object)o.k(-1147584842))));
            ((oVJh)o.a(this, -324845906)).yJLS(this, mrHN2, (mrHN)((Object)o.a(this, 662388425)));
            ((oVJh)o.a(this, -324845906)).UtIU(this);
            return;
        }
        catch (IOException iOException) {
            mrHN mrHN3 = (mrHN)((Object)o.a(this, 662388425));
            o.v(this, 662388425, (Object)((mrHN)((Object)o.k(1187528373))));
            ((oVJh)o.a(this, -324845906)).yJLS(this, mrHN3, (mrHN)((Object)o.a(this, 662388425)));
            ((oVJh)o.a(this, -324845906)).biLo(this);
            throw new IOException(FMkR$WjFM.a("\u2fe1\u58a2\ucda3\u001e\u1d06\u0b6a\u1514\u5cfe\u76a0\ua829\u7acb\u365e\u4ff4\u3d5c\u4c65"), iOException);
        }
    }

    public mrHN OirP() {
        return (mrHN)((Object)o.a(this, 662388425));
    }

    public ktRX hPyb() {
        return (ktRX)((Object)o.a(this, 1798258351));
    }

    public QEdN maKI() {
        return (QEdN)o.a(this, 1922121411);
    }

    public oVJh Cfqo() {
        return (oVJh)o.a(this, -324845906);
    }

    public URL getUrl() {
        return (URL)o.a(this, -568508730);
    }

    public File getFile() {
        return (File)o.a(this, -1444135228);
    }

    public int getBufferSize() {
        return (Integer)o.a(this, 756629164);
    }

    private static Object Mt(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


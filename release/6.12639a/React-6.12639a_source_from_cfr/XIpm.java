/*
 * Decompiled with CFR 0_123.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;

public abstract class XIpm<T extends IgvC<?>>
implements equl<T> {
    private File kdCy;
    private vbpi UJRv;
    private String type;

    public XIpm(String string, File file) {
        IOException iOException;
        this.kdCy = file;
        this.type = string;
        this.UJRv = new vbpi();
        if (XIpm.xE(file) == false) {
            try {
                this.write();
            }
            catch (IOException iOException2) {
                iOException = iOException2;
                XIpm.xE(iOException2);
            }
        }
        try {
            this.read();
            return;
        }
        catch (IOException iOException3) {
            iOException = iOException3;
            XIpm.xE(iOException3);
            return;
        }
    }

    @Override
    public void save() {
        try {
            this.write();
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            XIpm.xE(iOException);
            return;
        }
    }

    @Override
    public int getSize() {
        return XIpm.xE((vbpi)o.a(this, 530797096)).size();
    }

    @Override
    public void yJLS(T t) {
        XIpm.xE((vbpi)o.a(this, 530797096), XIpm.xE(new StringBuilder((String)XIpm.xE(t.OPWR()))), t.ivSs());
    }

    @Override
    public T yJLS(long l) {
        if (XIpm.xE((vbpi)o.a(this, 530797096), XIpm.xE(l)) != false) {
            T t = this.yJLS(l, (String)o.a(this, 461591075));
            Object object = XIpm.xE((vbpi)o.a(this, 530797096), XIpm.xE(l));
            t.yJLS((vbpi)object);
            return t;
        }
        return null;
    }

    public abstract T yJLS(long var1, String var3);

    @Override
    public long jxuv() {
        Object object = Long.MAX_VALUE;
        Iterator<E> iterator = XIpm.xE((vbpi)o.a(this, 530797096)).iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            Object object2 = XIpm.xE(XIpm.xE(string));
            if (object2 >= object) continue;
            object = object2;
        }
        return (long)object;
    }

    @Override
    public long jNbl() {
        Object object = Long.MIN_VALUE;
        Iterator<E> iterator = XIpm.xE((vbpi)o.a(this, 530797096)).iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            Object object2 = XIpm.xE(XIpm.xE(string));
            if (object2 <= object) continue;
            object = object2;
        }
        return (long)object;
    }

    private boolean yJLS(long l, long l2, long l3) {
        if (l >= l2 && l <= l3) {
            return true;
        }
        return false;
    }

    @Override
    public int yJLS(long l, long l2) {
        int n = 0;
        Iterator<E> iterator = XIpm.xE((vbpi)o.a(this, 530797096)).iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            Object object = XIpm.xE(XIpm.xE(string));
            n += this.yJLS((long)object, l, l2) ? 1 : 0;
        }
        return n;
    }

    @Override
    public TNku<Long, T> UtIU(long l, long l2) {
        TNku<K, V> tNku = new TNku<K, V>();
        Iterator<E> iterator = XIpm.xE((vbpi)o.a(this, 530797096)).iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            Object object = XIpm.xE(XIpm.xE(string));
            if (!this.yJLS((long)object, l, l2)) continue;
            XIpm.xE(tNku, XIpm.xE(object), this.yJLS((long)object));
        }
        return tNku;
    }

    @Override
    public int UtIU(long l) {
        int n = 0;
        Object object = XIpm.xE(new feCR<T>(XIpm.xE((vbpi)o.a(this, 530797096))));
        while (object.hasNext()) {
            String string = (String)object.next();
            Object object2 = XIpm.xE(XIpm.xE(string));
            if (!this.yJLS((long)object2, Long.MIN_VALUE, l)) continue;
            ++n;
            XIpm.xE((vbpi)o.a(this, 530797096), XIpm.xE(object2));
        }
        return n;
    }

    @Override
    public File getFile() {
        return (File)o.a(this, -1970580978);
    }

    private void write() throws IOException {
        XIpm.xE(XIpm.xE((File)o.a(this, -1970580978)));
        XIpm.xE((File)o.a(this, -1970580978));
        FileWriter fileWriter = new FileWriter((File)o.a(this, -1970580978));
        PrintWriter printWriter = new PrintWriter(fileWriter);
        XIpm.xE(printWriter, XIpm.xE((vbpi)o.a(this, 530797096), 4));
        XIpm.xE(printWriter);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void read() throws IOException {
        Object object;
        FileReader fileReader = new FileReader((File)o.a(this, -1970580978));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Object object2 = "";
        while ((object = XIpm.xE(bufferedReader)) != null) {
            object2 = XIpm.xE(XIpm.xE(new StringBuilder((String)XIpm.xE(object2)), object));
        }
        XIpm.xE(bufferedReader);
        o.v(this, 530797096, new vbpi((String)object2));
    }

    private static Object xE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


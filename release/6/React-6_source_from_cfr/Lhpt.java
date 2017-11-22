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

public abstract class Lhpt<T extends NxGC<?>>
implements GsQl<T> {
    private File rEii;
    private vslr OrjV;
    private String type;

    public Lhpt(String string, File file) {
        IOException iOException;
        this.rEii = file;
        this.type = string;
        this.OrjV = new vslr();
        if (Lhpt.DX(file) == false) {
            try {
                this.write();
            }
            catch (IOException iOException2) {
                iOException = iOException2;
                Lhpt.DX(iOException2);
            }
        }
        try {
            this.read();
            return;
        }
        catch (IOException iOException3) {
            iOException = iOException3;
            Lhpt.DX(iOException3);
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
            Lhpt.DX(iOException);
            return;
        }
    }

    @Override
    public int getSize() {
        return Lhpt.DX((vslr)cv.b(this, 577965569)).size();
    }

    @Override
    public void ssNb(T t) {
        Lhpt.DX((vslr)cv.b(this, 577965569), Lhpt.DX(Lhpt.DX(new StringBuilder(), t.OOtu())), t.aLYV());
    }

    @Override
    public T ssNb(long l) {
        if (Lhpt.DX((vslr)cv.b(this, 577965569), Lhpt.DX(Lhpt.DX(new StringBuilder(), l))) != false) {
            T t = this.ssNb(l, (String)cv.b(this, 956567052));
            Object object = Lhpt.DX((vslr)cv.b(this, 577965569), Lhpt.DX(Lhpt.DX(new StringBuilder(), l)));
            t.ssNb((vslr)object);
            return t;
        }
        return null;
    }

    public abstract T ssNb(long var1, String var3);

    @Override
    public long oVCY() {
        Object object = Long.MAX_VALUE;
        Iterator<E> iterator = Lhpt.DX((vslr)cv.b(this, 577965569)).iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            Object object2 = Lhpt.DX(Lhpt.DX(string));
            if (object2 >= object) continue;
            object = object2;
        }
        return (long)object;
    }

    @Override
    public long nImU() {
        Object object = Long.MIN_VALUE;
        Iterator<E> iterator = Lhpt.DX((vslr)cv.b(this, 577965569)).iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            Object object2 = Lhpt.DX(Lhpt.DX(string));
            if (object2 <= object) continue;
            object = object2;
        }
        return (long)object;
    }

    private boolean ssNb(long l, long l2, long l3) {
        if (l >= l2 && l <= l3) {
            return true;
        }
        return false;
    }

    @Override
    public int ssNb(long l, long l2) {
        int n = 0;
        Iterator<E> iterator = Lhpt.DX((vslr)cv.b(this, 577965569)).iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            Object object = Lhpt.DX(Lhpt.DX(string));
            n += this.ssNb((long)object, l, l2) ? 1 : 0;
        }
        return n;
    }

    @Override
    public ktOu<Long, T> DYFV(long l, long l2) {
        ktOu<K, V> ktOu2 = new ktOu<K, V>();
        Iterator<E> iterator = Lhpt.DX((vslr)cv.b(this, 577965569)).iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            Object object = Lhpt.DX(Lhpt.DX(string));
            if (!this.ssNb((long)object, l, l2)) continue;
            Lhpt.DX(ktOu2, Lhpt.DX(object), this.ssNb((long)object));
        }
        return ktOu2;
    }

    @Override
    public int DYFV(long l) {
        int n = 0;
        Object object = Lhpt.DX(new wfPa<T>(Lhpt.DX((vslr)cv.b(this, 577965569))));
        while (object.hasNext()) {
            String string = (String)object.next();
            Object object2 = Lhpt.DX(Lhpt.DX(string));
            if (!this.ssNb((long)object2, Long.MIN_VALUE, l)) continue;
            ++n;
            Lhpt.DX((vslr)cv.b(this, 577965569), Lhpt.DX(Lhpt.DX(new StringBuilder(), object2)));
        }
        return n;
    }

    @Override
    public File getFile() {
        return (File)cv.b(this, -31388149);
    }

    private void write() throws IOException {
        Lhpt.DX(Lhpt.DX((File)cv.b(this, -31388149)));
        Lhpt.DX((File)cv.b(this, -31388149));
        FileWriter fileWriter = new FileWriter((File)cv.b(this, -31388149));
        PrintWriter printWriter = new PrintWriter(fileWriter);
        Lhpt.DX(printWriter, Lhpt.DX((vslr)cv.b(this, 577965569), 4));
        Lhpt.DX(printWriter);
    }

    private void read() throws IOException {
        FileReader fileReader = new FileReader((File)cv.b(this, -31388149));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Object object = "";
        do {
            Object object2 = Lhpt.DX(bufferedReader);
            if (object2 == null) break;
            object = Lhpt.DX(Lhpt.DX(Lhpt.DX(new StringBuilder(), object), object2));
        } while (true);
        Lhpt.DX(bufferedReader);
        cv.e(this, 577965569, new vslr((String)object));
    }

    private static Object DX(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


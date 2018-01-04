/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class DirU
implements kAOQ {
    private feCR<kAOQ> nCNh = new feCR();
    private String NFSs;

    public DirU(String string) {
        this.NFSs = string;
    }

    @Override
    public feCR<kAOQ> SvcY() {
        return (feCR)o.a(this, -1951705094);
    }

    @Override
    public void aTvv() {
        if (!this.klJY()) {
            return;
        }
        Object object = DirU.Ae(this.SvcY());
        while (object.hasNext()) {
            kAOQ kAOQ2 = (kAOQ)object.next();
            new DirU$1(this, kAOQ2);
        }
        this.NxWm();
    }

    @Override
    public void yJLS(kAOQ kAOQ2) {
        DirU.Ae(this.SvcY(), kAOQ2);
    }

    @Override
    public feCR<kAOQ> owua() {
        Object object = DirU.Ae(this.SvcY());
        Object object2 = DirU.Ae(this.SvcY());
        while (object2.hasNext()) {
            kAOQ kAOQ2 = (kAOQ)object2.next();
            if (kAOQ2.klJY()) continue;
            DirU.Ae(object, kAOQ2);
        }
        return object;
    }

    @Override
    public boolean klJY() {
        return this.OPgL();
    }

    @Override
    public String getTag() {
        return (String)o.a(this, 84957177);
    }

    @Override
    public void update() {
        Object object = DirU.Ae(this.SvcY());
        while (object.hasNext()) {
            kAOQ kAOQ2 = (kAOQ)object.next();
            kAOQ2.update();
        }
        if (this.klJY()) {
            this.aTvv();
        }
    }

    @Override
    public abstract boolean OPgL();

    @Override
    public abstract void NxWm();

    private static Object Ae(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class QVde
implements fTAa {
    private wfPa<fTAa> AjMy = new wfPa();
    private String DsXU;

    public QVde(String string) {
        this.DsXU = string;
    }

    @Override
    public wfPa<fTAa> JbqW() {
        return (wfPa)cv.b(this, 418313157);
    }

    @Override
    public void YUkF() {
        if (!this.Rayq()) {
            return;
        }
        Object object = QVde.KW(this.JbqW());
        while (object.hasNext()) {
            fTAa fTAa2 = (fTAa)object.next();
            fTAa2.YUkF();
        }
        this.VCsR();
    }

    @Override
    public void ssNb(fTAa fTAa2) {
        QVde.KW(this.JbqW(), fTAa2);
    }

    @Override
    public wfPa<fTAa> fvCa() {
        Object object = QVde.KW(this.JbqW());
        Object object2 = QVde.KW(this.JbqW());
        while (object2.hasNext()) {
            fTAa fTAa2 = (fTAa)object2.next();
            if (fTAa2.Rayq()) continue;
            QVde.KW(object, fTAa2);
        }
        return object;
    }

    @Override
    public boolean Rayq() {
        return this.esCa();
    }

    @Override
    public String getTag() {
        return (String)cv.b(this, -1653869628);
    }

    @Override
    public void update() {
        Object object = QVde.KW(this.JbqW());
        while (object.hasNext()) {
            fTAa fTAa2 = (fTAa)object.next();
            fTAa2.update();
        }
        if (this.Rayq()) {
            this.YUkF();
        }
    }

    @Override
    public abstract boolean esCa();

    @Override
    public abstract void VCsR();

    private static Object KW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


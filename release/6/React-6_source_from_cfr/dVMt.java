/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.java.JavaPlugin
 */
import java.io.IOException;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class dVMt
extends JavaPlugin
implements Pdcq,
XSJd {
    private wfPa<ndLE> rNhP;
    private SuxL WGju;
    private psDx NNRd;

    public dVMt() {
        try {
            this.wLbX();
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            dVMt.vy(exception);
            return;
        }
        this.rNhP = new wfPa();
        this.WGju = new dVMt$1(this, KUXS$dwji.S("\ufae8\u11ff\ubf20\uf743\ud633\ua1d1\u8cff\u5518"), this.getThreadCount(), (hjbh)((Object)cv.e(-1841761742)));
        this.NNRd = new psDx();
        this.aLcY();
        this.fKRe();
    }

    public abstract void wLbX() throws IOException, ClassNotFoundException;

    public abstract long rowT();

    public abstract int getThreadCount();

    public void onLoad() {
        this.dVMt();
        dVMt.vy((SuxL)cv.b(this, -323096003));
        cv.V(702214719, (SuxL)cv.b(this, -323096003));
        cv.V(-384306626, (SuxL)cv.b(this, -323096003));
        dVMt.vy((psDx)cv.b(this, -1065291207));
    }

    public void onEnable() {
        dVMt.vy(dVMt.vy(this));
        Object object = dVMt.vy(this.FMwy());
        while (object.hasNext()) {
            ndLE ndLE2 = (ndLE)object.next();
            ndLE2.start();
        }
        this.ssNb((vswA)((Object)dVMt.vy()));
        dVMt.vy(this);
    }

    public void onDisable() {
        Object object = dVMt.vy(this.FMwy());
        while (object.hasNext()) {
            ndLE ndLE2 = (ndLE)object.next();
            ndLE2.stop();
        }
        this.KMEw();
        dVMt.vy((SuxL)cv.b(this, -323096003));
        dVMt.vy((psDx)cv.b(this, -1065291207));
        dVMt.vy(dVMt.vy());
    }

    @Override
    public wfPa<ndLE> FMwy() {
        return (wfPa)cv.b(this, -1880427551);
    }

    @Override
    public void ssNb(ndLE ndLE2) {
        dVMt.vy(this.FMwy(), ndLE2);
    }

    @Override
    public void FFBA() {
        if (dVMt.vy() == false) {
            return;
        }
        Object object = dVMt.vy(this.FMwy());
        while (object.hasNext()) {
            ndLE ndLE2 = (ndLE)object.next();
            ndLE2.tick();
        }
        dVMt.vy((SuxL)cv.b(this, -323096003));
    }

    @Override
    public String BuHU() {
        return dVMt.vy(dVMt.vy(new StringBuilder((String)dVMt.vy(this.getName())), rgig$AWxc.r("\u758d\u6afc\ue743\u2614\uc1ba")));
    }

    @Override
    public SuxL IWbc() {
        return (SuxL)cv.b(this, -323096003);
    }

    @Override
    public abstract void aLcY();

    @Override
    public abstract void ssNb(vswA var1);

    @Override
    public abstract void KMEw();

    @Override
    public abstract void dVMt();

    @Override
    public abstract void fKRe();

    private static Object vy(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


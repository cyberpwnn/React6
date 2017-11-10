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

public abstract class upkX
extends JavaPlugin
implements XJTi,
wncc {
    private PBUD<Wyua> wgCQ;
    private SnBs agDE;
    private pinh awcs;

    public upkX() {
        try {
            this.upkX();
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            upkX.Xi(exception);
            return;
        }
        this.wgCQ = new PBUD();
        this.agDE = new upkX$1(this, BkvY$LhxG.I("\u09a1\uf7ad\u8114\uc104\uf0a0\ub433\uaeb0\u0218"), this.getThreadCount(), (JRFt)((Object)yy.p(-181213024)));
        this.awcs = new pinh();
        this.xrET();
        this.OHMP();
    }

    public abstract void upkX() throws IOException, ClassNotFoundException;

    public abstract long oUhC();

    public abstract int getThreadCount();

    public void onLoad() {
        this.rpTB();
        upkX.Xi((SnBs)yy.h(this, -1756174091));
        yy.K(774498547, (SnBs)yy.h(this, -1756174091));
        yy.K(-730273548, (SnBs)yy.h(this, -1756174091));
        upkX.Xi((pinh)yy.h(this, 2100750569));
    }

    public void onEnable() {
        upkX.Xi(upkX.Xi(this));
        Object object = upkX.Xi(this.INmP());
        while (object.hasNext()) {
            Wyua wyua = (Wyua)object.next();
            wyua.start();
        }
        this.mXJp((YpAW)((Object)upkX.Xi()));
        upkX.Xi(this);
    }

    public void onDisable() {
        Object object = upkX.Xi(this.INmP());
        while (object.hasNext()) {
            Wyua wyua = (Wyua)object.next();
            wyua.stop();
        }
        this.PJoH();
        upkX.Xi((SnBs)yy.h(this, -1756174091));
        upkX.Xi((pinh)yy.h(this, 2100750569));
        upkX.Xi(upkX.Xi());
    }

    @Override
    public PBUD<Wyua> INmP() {
        return (PBUD)yy.h(this, 1632299260);
    }

    @Override
    public void mXJp(Wyua wyua) {
        upkX.Xi(this.INmP(), wyua);
    }

    @Override
    public void AWsr() {
        if (upkX.Xi() == false) {
            return;
        }
        Object object = upkX.Xi(this.INmP());
        while (object.hasNext()) {
            Wyua wyua = (Wyua)object.next();
            wyua.tick();
        }
        upkX.Xi((SnBs)yy.h(this, -1756174091));
    }

    @Override
    public String LrGi() {
        return upkX.Xi(upkX.Xi(new StringBuilder((String)upkX.Xi(this.getName())), KDGY$JAHk.Y("\ub7b9\u8f3b\u3c37\ua441\ud0b4")));
    }

    @Override
    public SnBs rotp() {
        return (SnBs)yy.h(this, -1756174091);
    }

    @Override
    public abstract void xrET();

    @Override
    public abstract void mXJp(YpAW var1);

    @Override
    public abstract void PJoH();

    @Override
    public abstract void rpTB();

    @Override
    public abstract void OHMP();

    private static Object Xi(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


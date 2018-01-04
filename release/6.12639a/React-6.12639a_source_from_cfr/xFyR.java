/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public abstract class xFyR
extends Thread {
    private long Obtd;
    private long bjlG;
    private long HUoq;
    private long LYkj;
    private long XfAL;
    private long cnQE;
    private long hBIq;
    private long KNXf;
    private long fDTq;
    private long Hfqj;
    private long EfYn;
    private long Yprm;
    private long uXpY;
    private long gWxU;

    public xFyR() {
        this.setName(mrFx$WjFM.d("\u0157\ue86e\u0eab\u67eb\u5d93\ub9ac\ubb38\u1fb3\u76b0\u6c81\u712f\u4a29\uccd5\u0ce2\ua2b0\u48ce\u69a1\u93f1\u3f5a\uca24"));
        this.Obtd = xFyR.ji(xFyR.ji());
        this.HUoq = xFyR.ji(xFyR.ji());
        this.bjlG = (Long)o.a(this, 382750015) - (Long)o.a(this, -723497666);
        this.LYkj = (Long)o.a(this, -1854386883);
        this.cnQE = 0;
        this.hBIq = 0;
        this.uXpY = 0;
        this.gWxU = 0;
        this.KNXf = 0;
        this.XfAL = 0;
        this.fDTq = xFyR.ji();
        this.Hfqj = 0;
        this.EfYn = 0;
        this.Yprm = 0;
    }

    public abstract void MJee();

    @Override
    public void run() {
        while (!xFyR.interrupted()) {
            if (xFyR.interrupted()) {
                return;
            }
            o.v(this, 382750015, (long)xFyR.ji(xFyR.ji()));
            o.v(this, -723497666, (long)(xFyR.ji(xFyR.ji()) + ((Long)o.a(this, 382750015) - xFyR.ji(xFyR.ji()))));
            o.v(this, -1854386883, (Long)o.a(this, 382750015) - (Long)o.a(this, -723497666));
            if ((Long)o.a(this, 1352158523) == 0) {
                o.v(this, 1352158523, (long)((Long)o.a(this, -1854386883)));
            }
            if ((Long)o.a(this, -1854386883) >= (Long)o.a(this, 1155943882)) {
                xFyR xFyR2 = this;
                o.v(xFyR2, -1009889847, (Long)o.a(xFyR2, -1009889847) + ((Long)o.a(this, -1854386883) - (Long)o.a(this, 1155943882)));
                xFyR xFyR3 = this;
                o.v(xFyR3, -1648865848, (Long)o.a(xFyR3, -1648865848) + ((Long)o.a(this, -1854386883) - (Long)o.a(this, 1155943882)));
            } else {
                o.v(this, -1049080377, (Long)o.a(this, 1155943882) - (Long)o.a(this, -1854386883));
                o.v(this, 1352158523, (long)((Long)o.a(this, -1854386883)));
                o.v(this, -1009889847, 0);
            }
            o.v(this, 1155943882, (long)((Long)o.a(this, -1854386883)));
            if (xFyR.ji() - (Long)o.a(this, 1003376070) >= 50) {
                o.v(this, 1003376070, (long)xFyR.ji());
                o.v(this, 2107461061, (long)((Long)o.a(this, -1009889847)));
                o.v(this, 132140484, (long)((Long)o.a(this, -1049080377)));
                o.v(this, -2032906830, (long)xFyR.ji(0, (Long)o.a(this, 2107461061) - (Long)o.a(this, 132140484)));
                o.v(this, -433041999, (Long)o.a(this, -1648865848) * 20);
                o.v(this, -1648865848, 0);
                this.MJee();
            }
            try {
                xFyR.ji(1);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
    }

    public long pajf() {
        return (Long)o.a(this, -723497666);
    }

    public long getMemoryUsed() {
        return (Long)o.a(this, -1854386883);
    }

    public long XKEb() {
        return (Long)o.a(this, 382750015);
    }

    public long rEmh() {
        return (Long)o.a(this, 1155943882);
    }

    public long uNvj() {
        return (Long)o.a(this, 1352158523);
    }

    public long getAllocated() {
        return (Long)o.a(this, -1009889847);
    }

    public long MAtX() {
        return (Long)o.a(this, -1049080377);
    }

    public long MSVh() {
        return (Long)o.a(this, -487240272);
    }

    public long iDEW() {
        return (Long)o.a(this, 1003376070);
    }

    public long QEpT() {
        return (Long)o.a(this, 2107461061);
    }

    public long JuAt() {
        return (Long)o.a(this, 132140484);
    }

    public long HvkY() {
        return (Long)o.a(this, -2032906830);
    }

    public long RcDy() {
        return (Long)o.a(this, -1648865848);
    }

    public long LqtU() {
        return (Long)o.a(this, -433041999);
    }

    private static Object ji(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class tLCm
extends jqQR {
    private WqhV WXdi;
    public boolean vlPR;

    @Override
    public void start() {
        tLCm.GW(this);
        cv.e(this, -2104625850, new jOKx());
        cv.e(this, -1823403542, true);
        LPFt lPFt = new LPFt();
        lPFt.ssNb(new AXWQ());
        lPFt.ssNb(new ntjb());
        lPFt.ssNb(new WFtI());
        lPFt.ssNb(new SKhs());
        ((WqhV)cv.b(this, -2104625850)).ssNb(lPFt);
    }

    @Override
    public void stop() {
        tLCm.GW(this);
    }

    @Override
    public void tick() {
        if (((Boolean)cv.b(this, -1823403542)).booleanValue()) {
            ((WqhV)cv.b(this, -2104625850)).tick();
        }
    }

    private static Object GW(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


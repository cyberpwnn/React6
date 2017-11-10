/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@tLIK(value=2)
public class kHxI
extends CLtX {
    @Override
    public void pOsy() {
        this.setName(NVIs$JbpD.H("\u9f31\ubee0\u2e3f\u41fd\u0318\u379e\u4f14\uf96a\u5bea\ua29b\ue912\u1409\u3cf9\u3c42\u45e2\ubdc5"));
        this.setDescription(NVIs$JbpD.H("\u9f31\ubee0\u2e3f\u41fd\u0318\u37be\u4f13\uf962\u5be1\ua297\ue948\u141e\u3ce4\u3c4a\u45ad\ubddb\u91a8\u3407\u3b1d\u0526\u86d2\u773b"));
        this.setID((String)kHxI.fw((qSYN)((Object)yy.p(-1720121566))));
        this.setValue(1.0);
        this.mXJp((ydHl)((Object)yy.p(1274341524)), (ydHl)((Object)yy.p(1274341524)));
        this.dMNe(1);
    }

    @Override
    public void qKGr() {
        this.setValue((double)kHxI.fw(this.JAHk()));
    }

    @Override
    public String get() {
        return kHxI.fw(this.getValue(), false);
    }

    private static Object fw(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


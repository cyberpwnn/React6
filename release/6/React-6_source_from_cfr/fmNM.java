/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@tLIK(value=2)
public class fmNM
extends CLtX {
    @Override
    public void pOsy() {
        this.setName(KDGY$JAHk.Y("\uaeb0\u9aab\u2333\ud263\udb68\ud202"));
        this.setDescription(KDGY$JAHk.Y("\uaea8\u9aad\u2331\ud26b\udb6a\ud245\u591e\ub13d\u477b\u5187\ufae1\ufac1"));
        this.setID((String)fmNM.yB((qSYN)((Object)yy.p(-1890449560))));
        this.setValue(0.0);
        this.mXJp((ydHl)((Object)yy.p(-1388378419)), (ydHl)((Object)yy.p(-1388378419)));
        this.dMNe(1);
    }

    @Override
    public void qKGr() {
        this.setValue((double)fmNM.yB(this.JAHk()));
    }

    @Override
    public String get() {
        Object object = fmNM.yB((IFYW)yy.h((CLqw)yy.p(1998252577), 1617160327));
        return fmNM.yB(fmNM.yB(fmNM.yB(fmNM.yB(fmNM.yB(new StringBuilder(KDGY$JAHk.Y("\ude42")), fmNM.yB((int)this.getValue())), (ydHl)((Object)yy.p(2001267044))), KDGY$JAHk.Y("\ud8e0")), fmNM.yB(object)));
    }

    private static Object yB(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


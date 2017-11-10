/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@tLIK(value=2)
public class MJTO
extends CLtX {
    @Override
    public void pOsy() {
        this.setName(KDGY$JAHk.Y("\u71e8\ue415\u0558\u956e\uda25\ud1f0\u51b3\u4731\u2bce\u8c9c"));
        this.setDescription(KDGY$JAHk.Y("\u71e8\ue415\u0558\u9527\uda05\ud1e0\u51b3\u477e\u2bf1\u8c80\ubbca\u575a\u4858\u7f42"));
        this.setID((String)MJTO.Hd((qSYN)((Object)yy.p(878053164))));
        this.setValue(1.0);
        this.mXJp((ydHl)((Object)yy.p(-278730615)), (ydHl)((Object)yy.p(-278730615)));
        this.dMNe(1);
    }

    @Override
    public void qKGr() {
        this.setValue((double)MJTO.Hd(MJTO.Hd(this.JAHk())));
    }

    @Override
    public String get() {
        return MJTO.Hd((long)this.getValue());
    }

    private static Object Hd(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


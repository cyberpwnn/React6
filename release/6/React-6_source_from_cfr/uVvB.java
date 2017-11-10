/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@tLIK(value=2)
public class uVvB
extends CLtX {
    @Override
    public void pOsy() {
        this.setName(NVIs$JbpD.H("\uca1c\ua0ec\u2d3b\u80e0\u70cf\u8f06\u745f\u4e58\u396e\u02d1\ub356"));
        this.setDescription(NVIs$JbpD.H("\uca17\ua0fb\u2d33\u80ea\u709d\u8f32\u741a\u4e56\u3974\u02d1\ub35d\u8cf3\u5a2c\u15a4\u0d98\udddc\u0276\u8e3a\u6cfa\u2d4a\u9ea4"));
        this.setID((String)uVvB.uO((qSYN)((Object)yy.p(1732314918))));
        this.setValue(1.0);
        this.mXJp((ydHl)((Object)yy.p(-278730615)), (ydHl)((Object)yy.p(-278730615)));
        this.dMNe(1);
    }

    @Override
    public void qKGr() {
        this.setValue((double)(uVvB.uO(uVvB.uO(this.JAHk())) - uVvB.uO(this.JAHk())));
    }

    @Override
    public String get() {
        return uVvB.uO((long)this.getValue());
    }

    private static Object uO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


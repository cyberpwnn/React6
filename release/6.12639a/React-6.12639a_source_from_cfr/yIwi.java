/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class yIwi
extends FMkR {
    private ntkx Fyjx;

    public yIwi() {
        this.Fyjx = new yIwi$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)yIwi.EJ(FMkR$WjFM.a("\ua2fb\u05b7\u54ab\u2abc\u9b85\uf104\u5569\ufc3d\u33c5\udfad\u4cfa\uf54c\u1246\uf2be\uaaec\u9e71\u746e\uaed5\uac5b\u0296\u4e8f\ufc0c\u6178")));
        this.setDescription((String)yIwi.EJ(FMkR$WjFM.a("\ua2fb\u05b7\u54ab\u2abc\u9b85\uf104\u5569\ufc3d\u33c5\udfad\u4cfa\uf54c\u1246\uf2be\uaaec\u9e71\u746e\uaed5\uac5b\u029c\u4e8b\ufc12\u617e\u6549\ucee5\ud100\uee1ew\u6479\u73c0")));
        this.setID((String)yIwi.EJ((biRJ)((Object)o.k(-917482794))));
        this.setValue(1.0);
        this.yJLS((psKX)((Object)o.k(-1118678018)), (psKX)((Object)o.k(-1118678018)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        this.setValue(yIwi.EJ(yIwi.EJ(yIwi.EJ(yIwi.EJ()))).size());
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, -914139537);
    }

    private static Object EJ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


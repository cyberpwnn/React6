/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class owvU {
    private eHVp grlK;
    private eHVp DtyD;

    public owvU(eHVp eHVp2, eHVp eHVp3) {
        this.grlK = eHVp2;
        this.DtyD = eHVp3;
    }

    public eHVp MJjT() {
        return (eHVp)((Object)o.a(this, 171131163));
    }

    public eHVp lgGC() {
        return (eHVp)((Object)o.a(this, -685948630));
    }

    public boolean biLo(eHVp eHVp2) {
        if (owvU.HE(eHVp2) >= owvU.HE((eHVp)((Object)o.a(this, 171131163)))) {
            if (owvU.HE(eHVp2) <= owvU.HE((eHVp)((Object)o.a(this, -685948630)))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return owvU.HE(owvU.HE(owvU.HE(new StringBuilder((String)owvU.HE(owvU.HE((eHVp)((Object)o.a(this, 171131163))))), nJPf$sILv.G("\u514f\u7a33\u04ab")), owvU.HE((eHVp)((Object)o.a(this, -685948630)))));
    }

    private static Object HE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Material;

public final class OGmN$mXJp
extends OGmN$halY {
    public OGmN$mXJp(Material material, byte by) throws IllegalArgumentException {
        super(material, by);
        if (OGmN$mXJp.KY(material) == false) {
            throw new IllegalArgumentException(BkvY$LhxG.I("\ub078\ua514\u5ddd\u1369\u768b\uc7ff\u0186\uea37\u0c6e\u482b\uad12\u43cb\u2de8\u1edf\u466f\u9188\uc38c\u19a0\ue12b\u2e61\uf789\uf3a1\u9fb7\u20bd\u48f3\ub618\u9cef"));
        }
    }

    private static Object KY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


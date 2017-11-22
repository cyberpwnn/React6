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

public final class JbuU$ssNb
extends JbuU$BkpW {
    public JbuU$ssNb(Material material, byte by) throws IllegalArgumentException {
        super(material, by);
        if (JbuU$ssNb.pt(material) == false) {
            throw new IllegalArgumentException(rgig$AWxc.r("\u54cd\u87ea\u8ced\u5745\u4c0e\u1f62\u8ceb\u9463\u223f\u1557\u181b\ud913\u6c12\uee6d\u39ec\u7a59\u216e\u7727\u1508\u1cb2\u7cb6\u979d\ued2f\ubc80\ucedd\u8e80\u4b2f"));
        }
    }

    private static Object pt(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


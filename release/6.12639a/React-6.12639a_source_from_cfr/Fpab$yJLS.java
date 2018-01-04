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

public final class Fpab$yJLS
extends Fpab$GPlk {
    public Fpab$yJLS(Material material, byte by) throws IllegalArgumentException {
        super(material, by);
        if (Fpab$yJLS.xY(material) == false) {
            throw new IllegalArgumentException(FMkR$WjFM.a("\u116e\u3f0d\ucc82\u2cf0\uebcd\u20b4\uab93\u7a89\ua8dd\uc0fb\u411d\ud002\u298d\u8ea5\uc078\u04d4\u4209\u8af3\ucc70\u8db7\uaba1\u9c97\u9495\ua5af\u45e0\u6e61\ue6fb"));
        }
    }

    private static Object xY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


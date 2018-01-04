/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.util.Vector
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.util.Vector;

public final class nuUa
extends Enum<nuUa> {
    public static final /* enum */ nuUa BfCw;
    public static final /* enum */ nuUa PoJy;
    public static final /* enum */ nuUa Yydg;
    private int x;
    private int y;
    private int z;
    private static final /* synthetic */ nuUa[] DtXq;

    static {
        o.w(-1743766990, (Object)new nuUa(mrFx$WjFM.d("\uc8ac"), 0, 1, 0, 0));
        o.w(2038774321, (Object)new nuUa(mrFx$WjFM.d("\uc8ad"), 1, 0, 1, 0));
        o.w(-1500104144, (Object)new nuUa(mrFx$WjFM.d("\uc8ae"), 2, 0, 0, 1));
        o.w(1336425007, new nuUa[]{(nuUa)((Object)o.k(-1743766990)), (nuUa)((Object)o.k(2038774321)), (nuUa)((Object)o.k(-1500104144))});
    }

    private nuUa(String string2, int n2, int n3, int n4, int n5) {
        this.x = string2;
        this.y = n2;
        this.z = n3;
    }

    public Vector Droj() {
        return new Vector(((Integer)o.a((Object)this, 1621506606)).intValue(), ((Integer)o.a((Object)this, 1659386413)).intValue(), ((Integer)o.a((Object)this, 127482412)).intValue());
    }

    public Vector jWit() {
        return nuUa.QO(this.Droj());
    }

    public static nuUa[] values() {
        nuUa[] arrnuUa = (nuUa[])o.k(1336425007);
        int n = arrnuUa.length;
        nuUa[] arrnuUa2 = new nuUa[n];
        nuUa.QO(arrnuUa, false, arrnuUa2, false, n);
        return arrnuUa2;
    }

    public static nuUa valueOf(String string) {
        return (nuUa)((Object)nuUa.QO(nuUa.class, string));
    }

    private static Object QO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


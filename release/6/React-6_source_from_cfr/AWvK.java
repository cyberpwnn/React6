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

public final class AWvK
extends Enum<AWvK> {
    public static final /* enum */ AWvK ejdr;
    public static final /* enum */ AWvK HMAX;
    public static final /* enum */ AWvK bHIs;
    private int x;
    private int y;
    private int z;
    private static final /* synthetic */ AWvK[] sYyg;

    static {
        yy.K(-1284373536, (Object)new AWvK(NVIs$JbpD.H("\ued9a"), 0, 1, 0, 0));
        yy.K(-1811152075, (Object)new AWvK(NVIs$JbpD.H("\ued9b"), 1, 0, 1, 0));
        yy.K(-719125714, (Object)new AWvK(NVIs$JbpD.H("\ued98"), 2, 0, 0, 1));
        yy.K(-1736244429, new AWvK[]{(AWvK)((Object)yy.p(-1284373536)), (AWvK)((Object)yy.p(-1811152075)), (AWvK)((Object)yy.p(-719125714))});
    }

    private AWvK(String string2, int n2, int n3, int n4, int n5) {
        this.x = string2;
        this.y = n2;
        this.z = n3;
    }

    public Vector TNnN() {
        return new Vector(((Integer)yy.h((Object)this, -1158413516)).intValue(), ((Integer)yy.h((Object)this, 2083521321)).intValue(), ((Integer)yy.h((Object)this, -933297358)).intValue());
    }

    public Vector ryHL() {
        return AWvK.vE(this.TNnN());
    }

    public static AWvK[] values() {
        AWvK[] arraWvK = (AWvK[])yy.p(-1736244429);
        int n = arraWvK.length;
        AWvK[] arraWvK2 = new AWvK[n];
        AWvK.vE(arraWvK, false, arraWvK2, false, n);
        return arraWvK2;
    }

    public static AWvK valueOf(String string) {
        return (AWvK)((Object)AWvK.vE(AWvK.class, string));
    }

    private static Object vE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


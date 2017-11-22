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

public final class mrKm
extends Enum<mrKm> {
    public static final /* enum */ mrKm bisQ;
    public static final /* enum */ mrKm lgQT;
    public static final /* enum */ mrKm GkgO;
    private int x;
    private int y;
    private int z;
    private static final /* synthetic */ mrKm[] FOQy;

    static {
        cv.V(-1515981579, (Object)new mrKm(rgig$AWxc.r("\ud036"), 0, 1, 0, 0));
        cv.V(681309428, (Object)new mrKm(rgig$AWxc.r("\ud037"), 1, 0, 1, 0));
        cv.V(1817572599, (Object)new mrKm(rgig$AWxc.r("\ud034"), 2, 0, 0, 1));
        cv.V(1700197622, new mrKm[]{(mrKm)((Object)cv.e(-1515981579)), (mrKm)((Object)cv.e(681309428)), (mrKm)((Object)cv.e(1817572599))});
    }

    private mrKm(String string2, int n2, int n3, int n4, int n5) {
        this.x = string2;
        this.y = n2;
        this.z = n3;
    }

    public Vector qJwE() {
        return new Vector(((Integer)cv.b((Object)this, -2048723727)).intValue(), ((Integer)cv.b((Object)this, -739511056)).intValue(), ((Integer)cv.b((Object)this, -988875533)).intValue());
    }

    public Vector rWKg() {
        return mrKm.TI(this.qJwE());
    }

    public static mrKm[] values() {
        mrKm[] arrmrKm = (mrKm[])cv.e(1700197622);
        int n = arrmrKm.length;
        mrKm[] arrmrKm2 = new mrKm[n];
        mrKm.TI(arrmrKm, false, arrmrKm2, false, n);
        return arrmrKm2;
    }

    public static mrKm valueOf(String string) {
        return (mrKm)((Object)mrKm.TI(mrKm.class, string));
    }

    private static Object TI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


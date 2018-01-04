/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;

class oUjh$1
extends xGOy {
    final /* synthetic */ oUjh oqGs;
    private final /* synthetic */ Chunk QrBo;

    oUjh$1(oUjh oUjh2, Chunk chunk) {
        this.oqGs = oUjh2;
        this.QrBo = chunk;
    }

    @Override
    public void run() {
        Chunk chunk = (Chunk)o.a(this, 69425108);
        Object object = oUjh$1.kp((wwNq)o.a((TEqA)o.k(911295720), 1729188757), (WOYg)((Object)o.k(41239730)));
        nJPf nJPf2 = new nJPf();
        Rapb rapb = new Rapb();
        oUjh$1.kp(rapb, chunk, (Integer)o.k(1378441444));
        CgHM cgHM = new CgHM();
        oUjh$1.kp(cgHM, oUjh$1.kp((long)((double)((long)(oUjh$1.kp(oUjh$1.kp((oUjh)o.a(this, -1112188973)), chunk) != false ? (Object)oUjh$1.kp((Integer)oUjh$1.kp(oUjh$1.kp((oUjh)o.a(this, -1112188973)), chunk)) : 1)) * ((double)((Integer)o.k(-1385342749)).intValue() * oUjh$1.kp()))));
        oUjh$1.kp(oUjh$1.kp((oUjh)o.a(this, -1112188973)), chunk, oUjh$1.kp(oUjh$1.kp(oUjh$1.kp((oUjh)o.a(this, -1112188973)), chunk) != false ? (Object)(oUjh$1.kp((Integer)oUjh$1.kp(oUjh$1.kp((oUjh)o.a(this, -1112188973)), chunk)) + 4) : 1));
        oUjh$1.kp((wwNq)o.a((TEqA)o.k(911295720), 1729188757), object.Mkpo(), nJPf2, new GjaJ[]{rapb, cgHM});
        String[] arrstring = new String[2];
        arrstring[0] = object.getName();
        arrstring[1] = oUjh$1.kp(mrFx$WjFM.d("\u8a41\ubb83\uf3c2\uddf8\u7964\ub8b4\ub817\uf0c4\uebf7\u2c9c\u1e07\ub2e8\u3f05\u02db\u93cb\u2550\u73e9\u20a5\u3a4c\u284f\u0836\u7b41\u6a02\uc6f2\ua51b\u0c00\ub630\ubd7e\u9d64\u79a9\u2d61\u2093\u25cb\ue796\ucd85"));
        oUjh$1.kp((uqOm)o.k(-609594549), new hHgD((vsrN)((Object)o.k(400971763)), arrstring));
    }

    private static Object kp(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


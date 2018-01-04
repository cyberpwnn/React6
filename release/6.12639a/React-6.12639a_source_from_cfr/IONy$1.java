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

class IONy$1
extends xGOy {
    final /* synthetic */ IONy yCPF;
    private final /* synthetic */ Chunk QrBo;

    IONy$1(IONy iONy, Chunk chunk) {
        this.yCPF = iONy;
        this.QrBo = chunk;
    }

    @Override
    public void run() {
        Object object = IONy$1.kf((wwNq)o.a((TEqA)o.k(911295720), 1729188757), (WOYg)((Object)o.k(1796686912)));
        nJPf nJPf2 = new nJPf();
        Rapb rapb = new Rapb();
        IONy$1.kf(rapb, (Chunk)o.a(this, 1559779301), (Integer)o.k(1327454419));
        CgHM cgHM = new CgHM();
        IONy$1.kf(cgHM, IONy$1.kf((long)((double)((long)(IONy$1.kf(IONy$1.kf((IONy)o.a(this, 1769953252)), (Chunk)o.a(this, 1559779301)) != false ? (Object)IONy$1.kf((Integer)IONy$1.kf(IONy$1.kf((IONy)o.a(this, 1769953252)), (Chunk)o.a(this, 1559779301))) : 1)) * ((double)((Integer)o.k(-1297786814)).intValue() * IONy$1.kf()))));
        IONy$1.kf(IONy$1.kf((IONy)o.a(this, 1769953252)), (Chunk)o.a(this, 1559779301), IONy$1.kf(IONy$1.kf(IONy$1.kf((IONy)o.a(this, 1769953252)), (Chunk)o.a(this, 1559779301)) != false ? (Object)(IONy$1.kf((Integer)IONy$1.kf(IONy$1.kf((IONy)o.a(this, 1769953252)), (Chunk)o.a(this, 1559779301))) + 4) : 1));
        IONy$1.kf((wwNq)o.a((TEqA)o.k(911295720), 1729188757), object.Mkpo(), nJPf2, new GjaJ[]{rapb, cgHM});
        String[] arrstring = new String[2];
        arrstring[0] = object.getName();
        arrstring[1] = IONy$1.kf(FMkR$WjFM.a("\u31cd\uf9bf\u34c9\u9cfa\u5787\u638b\u9cf1\udb2f\u108b\u43e6\u0ef3\ude83\uc0aa\u67da\u4efd\uff2f\ub77d\u229f\ufefa\u7d79\u91b5\u9a44\u7956\udbdf\uf022\u7599\ua101\u374e\u4769"));
        IONy$1.kf((uqOm)o.k(-609594549), new hHgD((vsrN)((Object)o.k(400971763)), arrstring));
    }

    private static Object kf(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


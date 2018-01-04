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

class cBGi$2
extends xGOy {
    final /* synthetic */ cBGi BBrI;
    private final /* synthetic */ Chunk QrBo;

    cBGi$2(cBGi cBGi2, Chunk chunk) {
        this.BBrI = cBGi2;
        this.QrBo = chunk;
    }

    @Override
    public void run() {
        Chunk chunk = (Chunk)o.a(this, 38623199);
        Object object = cBGi$2.sZ((wwNq)o.a((TEqA)o.k(911295720), 1729188757), (WOYg)((Object)o.k(-1259060001)));
        nJPf nJPf2 = new nJPf();
        Rapb rapb = new Rapb();
        cBGi$2.sZ(rapb, chunk, (Integer)o.k(351099097));
        String[] arrstring = new String[2];
        arrstring[0] = object.getName();
        arrstring[1] = cBGi$2.sZ(FMkR$WjFM.a("\uab8b\u756d\u8e40\u5306\u9329\uaa4b\uce03\uc446\u2848\u92a8\u9d36\uf313\u7981\uf69b\u73de\u7d14\uf301\ua614\ube55\ua8b4\u884d\u5120\ue567\u1614\u5740\ub670\ub7b3\u44d3\u36a7\u75e7\u5608\u628b\ufc05\ufee5\ubfaa\u6395\u9f2f\ua29a\u2547"));
        cBGi$2.sZ((uqOm)o.k(-609594549), new hHgD((vsrN)((Object)o.k(400971763)), arrstring));
        cBGi$2.sZ((wwNq)o.a((TEqA)o.k(911295720), 1729188757), object.Mkpo(), nJPf2, new GjaJ[]{rapb});
    }

    private static Object sZ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


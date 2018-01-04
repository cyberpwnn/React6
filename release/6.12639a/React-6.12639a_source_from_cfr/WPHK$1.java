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

class WPHK$1
extends xGOy {
    final /* synthetic */ WPHK UAxi;
    private final /* synthetic */ Chunk QrBo;

    WPHK$1(WPHK wPHK, Chunk chunk) {
        this.UAxi = wPHK;
        this.QrBo = chunk;
    }

    @Override
    public void run() {
        Chunk chunk = (Chunk)o.a(this, -1139648565);
        Object object = WPHK$1.yK((wwNq)o.a((TEqA)o.k(911295720), 1729188757), (WOYg)((Object)o.k(1206600904)));
        nJPf nJPf2 = new nJPf();
        Rapb rapb = new Rapb();
        WPHK$1.yK(rapb, chunk, (Integer)o.k(-1337829171));
        CgHM cgHM = new CgHM();
        WPHK$1.yK(cgHM, WPHK$1.yK((long)((double)((long)(WPHK$1.yK(WPHK$1.yK((WPHK)o.a(this, 1123309530)), chunk) != false ? (Object)WPHK$1.yK((Integer)WPHK$1.yK(WPHK$1.yK((WPHK)o.a(this, 1123309530)), chunk)) : 1)) * ((double)((Integer)o.k(1562532044)).intValue() * WPHK$1.yK()))));
        WPHK$1.yK(WPHK$1.yK((WPHK)o.a(this, 1123309530)), chunk, WPHK$1.yK(WPHK$1.yK(WPHK$1.yK((WPHK)o.a(this, 1123309530)), chunk) != false ? (Object)(WPHK$1.yK((Integer)WPHK$1.yK(WPHK$1.yK((WPHK)o.a(this, 1123309530)), chunk)) + 4) : 1));
        String[] arrstring = new String[2];
        arrstring[0] = object.getName();
        arrstring[1] = WPHK$1.yK(FMkR$WjFM.a("\ubbf1\u1b6e\ud9bc\ucc7b\ue102\u9aee\u9688\ufdd7\u6c35\uc843\u2d8b\uafd4\udc03\u41cf\u67bc\uc90c\u9f7a\u36b6\u3eed\ufd26\u987f\u6941\u67ec\u45cd\u37c7\u8143\u8ac9\ua386\u5899\u2515\u68e7\u70ef\u2f0e\uea07\u5c17\u69bc\u819e\udd0e"));
        WPHK$1.yK((uqOm)o.k(-609594549), new hHgD((vsrN)((Object)o.k(400971763)), arrstring));
        WPHK$1.yK((wwNq)o.a((TEqA)o.k(911295720), 1729188757), object.Mkpo(), nJPf2, new GjaJ[]{rapb, cgHM});
    }

    private static Object yK(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


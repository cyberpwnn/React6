/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class Fpab$Ipep
extends Enum<Fpab$Ipep> {
    public static final /* enum */ Fpab$Ipep PMeM;
    public static final /* enum */ Fpab$Ipep TtEL;
    public static final /* enum */ Fpab$Ipep OApc;
    public static final /* enum */ Fpab$Ipep LJIl;
    private static final /* synthetic */ Fpab$Ipep[] ukRP;

    static {
        o.w(-508215234, (Object)new Fpab$Ipep(nJPf$sILv.G("\u8035\u4d41\ud9a9\ud6be\ufe62\u67ec\u8204\u1c9a\u1de7\ua496\u723a\u1542\u1fb4\u0b3e"), 0));
        o.w(-775012291, (Object)new Fpab$Ipep(nJPf$sILv.G("\u8035\u4d41\ud9a9\ud6be\ufe62\u67ec\u8204\u1c9a\u1de7\ua485\u723a\u1542\u1fb0"), 1));
        o.w(-2033434564, (Object)new Fpab$Ipep(nJPf$sILv.G("\u8023\u4d4d\ud9aa\ud6ae\ufe68\u67ea\u8208\u1c86\u1df6\ua480\u7237"), 2));
        o.w(-2043068357, (Object)new Fpab$Ipep(nJPf$sILv.G("\u8024\u4d4b\ud9b4\ud6a4\ufe79\u67ff\u8203\u1c85\u1dfd"), 3));
        o.w(-231980854, new Fpab$Ipep[]{(Fpab$Ipep)((Object)o.k(-508215234)), (Fpab$Ipep)((Object)o.k(-775012291)), (Fpab$Ipep)((Object)o.k(-2033434564)), (Fpab$Ipep)((Object)o.k(-2043068357))});
    }

    private Fpab$Ipep(String string2, int n2) {
    }

    public static Fpab$Ipep[] values() {
        Fpab$Ipep[] arrfpab$Ipep = (Fpab$Ipep[])o.k(-231980854);
        int n = arrfpab$Ipep.length;
        Fpab$Ipep[] arrfpab$Ipep2 = new Fpab$Ipep[n];
        Fpab$Ipep.fB(arrfpab$Ipep, false, arrfpab$Ipep2, false, n);
        return arrfpab$Ipep2;
    }

    public static Fpab$Ipep valueOf(String string) {
        return (Fpab$Ipep)((Object)Fpab$Ipep.fB(Fpab$Ipep.class, string));
    }

    private static Object fB(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


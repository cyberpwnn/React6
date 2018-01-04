/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class KwVE
implements cAiw {
    @Override
    public TNku<Long, mGQw> biLo(long l, long l2) {
        TNku<Long, mGQw> tNku = new TNku<Long, mGQw>();
        Object object = KwVE.XP((cJUN)o.a((TEqA)o.k(911295720), -1378592710));
        Object object2 = KwVE.XP(KwVE.XP(object));
        while (object2.hasNext()) {
            biRJ biRJ2 = (biRJ)((Object)object2.next());
            String string = KwVE.XP(biRJ2).getID();
            xyxr xyxr2 = (xyxr)KwVE.XP(object, biRJ2);
            mrIy mrIy2 = xyxr2.FViO();
            Object object3 = KwVE.XP(mrIy2, l, l2);
            Object object4 = KwVE.XP(KwVE.XP(object3));
            while (object4.hasNext()) {
                Long l3 = (Long)object4.next();
                long l4 = 35 * (KwVE.XP(l3) / 35);
                if (KwVE.XP(tNku, KwVE.XP(l4)) == false) {
                    KwVE.XP(tNku, KwVE.XP(l4), new ArMt());
                }
                KwVE.XP(KwVE.XP((ArMt)KwVE.XP(tNku, KwVE.XP(l4))), string, (Double)KwVE.XP(object3, l3));
            }
        }
        return tNku;
    }

    private static Object XP(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


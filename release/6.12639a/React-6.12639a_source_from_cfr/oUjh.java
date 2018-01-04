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

public class oUjh
extends DirU {
    private boolean GRax = false;
    private TNku<Chunk, Integer> QiQm = new TNku();

    public oUjh() {
        super((String)oUjh.Jd(mrFx$WjFM.d("\u4bab\u14d1\ufbc4\u3480\u4ef8\ucea4\u200d\uad98\u3da0\ua0b9\u280c\u1a6c\uab6b\u3216\u6c09\u3b35\ue1ba\ufe1b\uadfe\uc819\u4ca9\ue82e\u2c8f\u5a79\u3dc7\u07e8\u6132\u7d13\ucb4d\u6c3a\u885f\u9181\u75b2")));
    }

    @Override
    public void NxWm() {
        Chunk chunk;
        if (!((Boolean)o.k(-1438164814)).booleanValue()) {
            return;
        }
        Chunk chunk2 = null;
        Object object = -1;
        Object object2 = oUjh.Jd(oUjh.Jd(oUjh.Jd((bXTW)o.a((TEqA)o.k(911295720), -550610684))));
        while (object2.hasNext()) {
            chunk = (Chunk)object2.next();
            if (oUjh.Jd(oUjh.Jd((Rjca)oUjh.Jd(oUjh.Jd((bXTW)o.a((TEqA)o.k(911295720), -550610684)), chunk)), (GkCK)((Object)o.k(1070941663))) == false) continue;
            Object object3 = oUjh.Jd((Integer)oUjh.Jd(oUjh.Jd((Rjca)oUjh.Jd(oUjh.Jd((bXTW)o.a((TEqA)o.k(911295720), -550610684)), chunk)), (GkCK)((Object)o.k(1070941663))));
            if (object3 <= object) continue;
            object = object3;
            chunk2 = chunk;
        }
        if (chunk2 != null) {
            chunk = chunk2;
            new oUjh$1(this, chunk);
        }
    }

    @Override
    public boolean OPgL() {
        boolean bl = false;
        double d = 1000000.0;
        double d2 = oUjh.Jd((FWER)o.a((TEqA)o.k(911295720), 1286751627), oUjh.Jd((biRJ)((Object)o.k(711152348)))).getValue() * 1000000.0;
        double d3 = oUjh.Jd((FWER)o.a((TEqA)o.k(911295720), 1286751627), oUjh.Jd((biRJ)((Object)o.k(-1952623888)))).getValue();
        Object object = oUjh.Jd(d2 * (Double)o.k(1148410086) + (double)((Long)o.k(-1553180441)).longValue(), (Long)o.k(-1264953111), (Long)o.k(-1231136536));
        if (d3 > object && d3 / 1000000.0 - object / 1000000.0 > (Double)o.k(-348759835)) {
            bl = true;
        }
        if (bl != (Boolean)o.a(this, -353609921)) {
            o.v(this, -353609921, bl);
            new oUjh$2(this);
        }
        return bl;
    }

    static /* synthetic */ TNku yJLS(oUjh oUjh2) {
        return (TNku)o.a(oUjh2, -1818667202);
    }

    static /* synthetic */ boolean UtIU(oUjh oUjh2) {
        return (Boolean)o.a(oUjh2, -353609921);
    }

    private static Object Jd(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


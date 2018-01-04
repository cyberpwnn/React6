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

public class WPHK
extends DirU {
    private boolean GRax = false;
    private TNku<Chunk, Integer> QiQm = new TNku();

    public WPHK() {
        super((String)WPHK.PY(mrFx$WjFM.d("\uf430\ue02c\u6395\u0a01\uca4e\ud29a\u7b92\u155b\ub3f9\ue1c2\ubbc9\u7c95\uf539\u6cf0\ub62c\ued96\u3417\u47ab\u8f68\ud3a0\ud200\uab23\u5cd0\u420b\u3dcd\u0c76\u10ef\u7de8\u251f\ubaf6\u179f\uc3db\uc8f7\ued10\u9ef8\u5ba0")));
    }

    @Override
    public void NxWm() {
        Chunk chunk;
        if (!((Boolean)o.k(1814911171)).booleanValue()) {
            return;
        }
        Chunk chunk2 = null;
        Object object = -1;
        Object object2 = WPHK.PY(WPHK.PY(WPHK.PY((bXTW)o.a((TEqA)o.k(911295720), -550610684))));
        while (object2.hasNext()) {
            chunk = (Chunk)object2.next();
            if (WPHK.PY(WPHK.PY((Rjca)WPHK.PY(WPHK.PY((bXTW)o.a((TEqA)o.k(911295720), -550610684)), chunk)), (GkCK)((Object)o.k(1460684256))) == false) continue;
            Object object3 = WPHK.PY((Integer)WPHK.PY(WPHK.PY((Rjca)WPHK.PY(WPHK.PY((bXTW)o.a((TEqA)o.k(911295720), -550610684)), chunk)), (GkCK)((Object)o.k(1460684256))));
            if (object3 <= object) continue;
            object = object3;
            chunk2 = chunk;
        }
        if (chunk2 != null) {
            chunk = chunk2;
            new WPHK$1(this, chunk);
        }
    }

    @Override
    public boolean OPgL() {
        boolean bl = false;
        double d = 1000000.0;
        double d2 = WPHK.PY((FWER)o.a((TEqA)o.k(911295720), 1286751627), WPHK.PY((biRJ)((Object)o.k(711152348)))).getValue() * 1000000.0;
        double d3 = WPHK.PY((FWER)o.a((TEqA)o.k(911295720), 1286751627), WPHK.PY((biRJ)((Object)o.k(-529313032)))).getValue();
        Object object = WPHK.PY(d2 * (Double)o.k(1304385743) + (double)((Long)o.k(-1593747248)).longValue(), (Long)o.k(-283748142), (Long)o.k(2068404433));
        if (d3 > object && d3 / 1000000.0 - object / 1000000.0 > (Double)o.k(-2033166130)) {
            bl = true;
        }
        if (bl != (Boolean)o.a(this, -138586154)) {
            o.v(this, -138586154, bl);
            new WPHK$2(this);
        }
        return bl;
    }

    static /* synthetic */ TNku yJLS(WPHK wPHK) {
        return (TNku)o.a(wPHK, 148264917);
    }

    static /* synthetic */ boolean UtIU(WPHK wPHK) {
        return (Boolean)o.a(wPHK, -138586154);
    }

    private static Object PY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


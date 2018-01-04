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

public class IONy
extends DirU {
    private boolean GRax = false;
    private TNku<Chunk, Integer> QiQm = new TNku();

    public IONy() {
        super((String)IONy.aD(nJPf$sILv.G("\u5662\u9f3f\u030f\u8d61\uc30f\uf445\ua29f\ua9ac\uf8e4\ud8a0\u4414\u5d4a\u7325\u15fd\u3f06\u6a25\ua5a8\uf78b\uab19\ue745\uf1e9\u9dc9\u8837\ubf50\u0fc6\u9aa2\u1ccc\u3782\ucd97\u034d\u09a3\u166d\u5beb\u62a5\u488e\ucaa3\ubbb2")));
    }

    @Override
    public void NxWm() {
        Chunk chunk;
        if (!((Boolean)o.k(995973317)).booleanValue()) {
            return;
        }
        Chunk chunk2 = null;
        Object object = -1;
        Object object2 = IONy.aD(IONy.aD(IONy.aD((bXTW)o.a((TEqA)o.k(911295720), -550610684))));
        while (object2.hasNext()) {
            chunk = (Chunk)object2.next();
            if (IONy.aD(IONy.aD((Rjca)IONy.aD(IONy.aD((bXTW)o.a((TEqA)o.k(911295720), -550610684)), chunk)), (GkCK)((Object)o.k(-365017634))) == false) continue;
            Object object3 = IONy.aD((Integer)IONy.aD(IONy.aD((Rjca)IONy.aD(IONy.aD((bXTW)o.a((TEqA)o.k(911295720), -550610684)), chunk)), (GkCK)((Object)o.k(-365017634))));
            if (object3 <= object) continue;
            object = object3;
            chunk2 = chunk;
        }
        if (chunk2 != null) {
            chunk = chunk2;
            new IONy$1(this, chunk);
        }
    }

    @Override
    public boolean OPgL() {
        boolean bl = false;
        double d = 1000000.0;
        double d2 = IONy.aD((FWER)o.a((TEqA)o.k(911295720), 1286751627), IONy.aD((biRJ)((Object)o.k(711152348)))).getValue() * 1000000.0;
        double d3 = IONy.aD((FWER)o.a((TEqA)o.k(911295720), 1286751627), IONy.aD((biRJ)((Object)o.k(459035360)))).getValue();
        Object object = IONy.aD(d2 * (Double)o.k(1508268245) + (double)((Long)o.k(119888086)).longValue(), (Long)o.k(-809871144), (Long)o.k(581589207));
        if (d3 > object && d3 / 1000000.0 - object / 1000000.0 > (Double)o.k(-1265346348)) {
            bl = true;
        }
        if (bl != (Boolean)o.a(this, 81876941)) {
            o.v(this, 81876941, bl);
            new IONy$2(this);
        }
        return bl;
    }

    static /* synthetic */ TNku yJLS(IONy iONy) {
        return (TNku)o.a(iONy, 783374284);
    }

    static /* synthetic */ boolean UtIU(IONy iONy) {
        return (Boolean)o.a(iONy, 81876941);
    }

    private static Object aD(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


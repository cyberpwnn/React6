/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.spigotmc.TickLimiter
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.spigotmc.TickLimiter;

public class UcJv
extends TickLimiter {
    public double rplX;
    public long YotH;
    public double qdvw;
    public long YVal = UcJv.eT();
    public double KVKA;
    public OXoN mHKG = new OXoN(5);
    public OXoN qTWG = new OXoN(20);
    private int kthY;
    private boolean Bdbu;

    public UcJv(double d, boolean bl) {
        super((int)d);
        this.rplX = d;
        this.KVKA = d;
        this.kthY = 0;
        this.Bdbu = bl;
    }

    public void initTick() {
        o.v((Object)this, -1281075858, (double)((Long)o.a((Object)this, -270576272) - (Long)o.a((Object)this, 844715375)) / 1000000.0);
        o.v((Object)this, 844715375, (long)UcJv.eT());
        UcJv.eT((OXoN)o.a((Object)this, -1567795859), UcJv.eT((Double)o.a((Object)this, -1281075858), 0.0, 1000.0));
        UcJv.eT((OXoN)o.a((Object)this, -2126490261), (Integer)o.a((Object)this, 687625594));
        if (((Boolean)o.a((Object)this, -2027530887)).booleanValue() && ((Boolean)o.k(-246721160)).booleanValue() || !((Boolean)o.a((Object)this, -2027530887)).booleanValue() && ((Boolean)o.k(574313847)).booleanValue()) {
            reference var1_1 = UcJv.eT((OXoN)o.a((Object)this, -1567795859));
            if ((Integer)o.a((Object)this, 687625594) > 0) {
                var1_1 += 0.25;
            }
            o.v((Object)this, -2030676621, (double)(UcJv.eT(var1_1, 0.15, 50.0) + ((Boolean)o.a((Object)this, -2027530887) != false ? ((Double)o.k(469521781)).doubleValue() : ((Double)o.k(-1729800844)).doubleValue())));
            if (UcJv.eT((Double)o.a((Object)this, -2030676621) - (Double)o.a((Object)this, 1251628386)) > 0.01) {
                reference var3_2 = UcJv.eT((Double)o.a((Object)this, -2030676621) - (Double)o.a((Object)this, 1251628386)) / ((Boolean)o.a((Object)this, -2027530887) != false ? ((Double)o.k(1028347232)).doubleValue() : ((Double)o.k(-169519777)).doubleValue());
                if ((Double)o.a((Object)this, -2030676621) > (Double)o.a((Object)this, 1251628386)) {
                    UcJv ucJv = this;
                    o.v((Object)ucJv, 1251628386, (Double)o.a((Object)ucJv, 1251628386) + var3_2);
                } else {
                    UcJv ucJv = this;
                    o.v((Object)ucJv, 1251628386, (Double)o.a((Object)ucJv, 1251628386) - var3_2);
                }
            }
        } else {
            o.v((Object)this, 1251628386, 50.0);
            o.v((Object)this, -2030676621, 50.0);
        }
        o.v((Object)this, 687625594, 0);
    }

    public boolean shouldContinue() {
        reference var1_1 = UcJv.eT() - (Long)o.a((Object)this, 844715375);
        boolean bl = var1_1 < (long)((Double)o.a((Object)this, 1251628386) * 1000000.0);
        if (bl) {
            o.v((Object)this, -270576272, (long)UcJv.eT());
        } else {
            UcJv ucJv = this;
            o.v((Object)ucJv, 687625594, (Integer)o.a((Object)ucJv, 687625594) + 1);
        }
        return bl;
    }

    private static Object eT(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


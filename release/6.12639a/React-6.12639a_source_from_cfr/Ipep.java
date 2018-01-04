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

@BtuM(value=1)
public class Ipep
extends IFQY {
    private int opGo;

    public Ipep() {
        super((WOYg)((Object)o.k(1206600904)));
        this.yJLS((String[])o.k(1472742599));
        this.yJLS(Chunk.class, new Ipep$1(this));
        this.yJLS(Long.class, new Ipep$2(this));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public /* varargs */ void yJLS(xynF var1_1, GjaJ ... var2_2) {
        var3_3 = new yJSB(0);
        var4_4 = new yJSB(0);
        var5_5 = new yJSB(0);
        var6_6 = new yJSB(0);
        var7_7 = 10000;
        var12_8 = var2_2;
        var11_9 = var12_8.length;
        var10_10 = 0;
        while (var10_10 < var11_9) {
            var9_11 = var12_8[var10_10];
            if (Ipep.zB(var9_11.getType(), Long.class) != false) {
                var7_7 = Ipep.zB((CgHM)var9_11);
            }
            ++var10_10;
        }
        var12_8 = var2_2;
        var11_9 = var12_8.length;
        var10_10 = 0;
        while (var10_10 < var11_9) {
            var9_11 = var12_8[var10_10];
            if (Ipep.zB(var9_11.getType(), Chunk.class) != false) {
                Ipep.zB(var3_3, Ipep.zB(var9_11.IFSe()));
                var14_13 = Ipep.zB(var9_11.IFSe());
                while (var14_13.hasNext()) {
                    var13_12 = var14_13.next();
                    if (!var9_11.TEqA(var13_12)) continue;
                    Ipep.zB((mXRj)o.a((TEqA)o.k(911295720), 878134470), (Chunk)var13_12, var7_7);
                    Ipep.zB(var6_6, true);
                    var15_14 = (String)o.k(1598047428);
                    this.setProgress((double)((Object)Ipep.zB(var6_6) / (Object)Ipep.zB(var3_3)));
                    var15_14 = Ipep.zB(var15_14, mrFx$WjFM.d("\ubd97\u029b"), Ipep.zB(Ipep.zB(var6_6)));
                    var15_14 = Ipep.zB(var15_14, mrFx$WjFM.d("\ubd97\u028c"), Ipep.zB(Ipep.zB(var3_3)));
                    var15_14 = Ipep.zB(var15_14, mrFx$WjFM.d("\ubd97\u0288"), Ipep.zB(this.getProgress(), false));
                    this.yJLS((String)var15_14);
                    Ipep.zB(var4_4, (Integer)o.a(this, 478692547));
                    if ((Integer)o.a(this, 478692547) <= 0) continue;
                    Ipep.zB(var5_5, true);
                }
            }
            ++var10_10;
        }
        this.wKtV();
        if (Ipep.zB(var6_6) > true) ** GOTO lbl-1000
        if (Ipep.zB(var6_6) == false) lbl-1000: // 2 sources:
        {
            v0 = mrFx$WjFM.d("\ubdc0");
        } else {
            v0 = "";
        }
        var1_1.biLo((String)Ipep.zB(Ipep.zB(Ipep.zB(Ipep.zB(Ipep.zB(Ipep.zB(new StringBuilder((String)Ipep.zB(Ipep.zB(mrFx$WjFM.d("\ubdd2\u029b\u663b\uc7db\u8992\u73c5\u30d3\u6c0c\u5b47\u3163\ucb35\uf2d0\uacf3\u2ccc\ud546\ufbb4\ud34a\u8c4b\uf8b1\uabd1\u4d30\u2554\u847f\u5b7d\u8d04\u11f1\uac08\u576f")))), Ipep.zB(Ipep.zB(var6_6))), Ipep.zB(mrFx$WjFM.d("\ubdd2\u029b\u663b\uc7db\u8992\u73c5\u30d3\u6c0c\u5b47\u3163\ucb35\uf2d0\uacf3\u2ccc\ud546\ufbb4\ud34a\u8c4b\uf8b1\uabde\u4d37\u2542\u847a\u5b73"))), v0), Ipep.zB(mrFx$WjFM.d("\ubdd2\u029b\u663b\uc7db\u8992\u73c5\u30d3\u6c0c\u5b47\u3163\ucb35\uf2d0\uacf3\u2ccc\ud546\ufbb4\ud34a\u8c4b\uf8b1\uabdb\u4d30\u2545"))), Ipep.zB(var7_7, true))));
    }

    private static Object zB(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


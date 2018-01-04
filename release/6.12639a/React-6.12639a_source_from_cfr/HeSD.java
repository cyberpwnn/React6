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
public class HeSD
extends IFQY {
    private int opGo;

    public HeSD() {
        super((WOYg)((Object)o.k(1796686912)));
        this.yJLS((String[])o.k(-472562625));
        this.yJLS(Chunk.class, new HeSD$1(this));
        this.yJLS(Long.class, new HeSD$2(this));
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
            if (HeSD.Ey(var9_11.getType(), Long.class) != false) {
                var7_7 = HeSD.Ey((CgHM)var9_11);
            }
            ++var10_10;
        }
        var12_8 = var2_2;
        var11_9 = var12_8.length;
        var10_10 = 0;
        while (var10_10 < var11_9) {
            var9_11 = var12_8[var10_10];
            if (HeSD.Ey(var9_11.getType(), Chunk.class) != false) {
                HeSD.Ey(var3_3, HeSD.Ey(var9_11.IFSe()));
                var14_13 = HeSD.Ey(var9_11.IFSe());
                while (var14_13.hasNext()) {
                    var13_12 = var14_13.next();
                    if (!var9_11.TEqA(var13_12)) continue;
                    HeSD.Ey((eilm)o.a((TEqA)o.k(911295720), 180896829), (Chunk)var13_12, var7_7);
                    HeSD.Ey(var6_6, true);
                    var15_14 = (String)o.k(-1638906821);
                    this.setProgress((double)((Object)HeSD.Ey(var6_6) / (Object)HeSD.Ey(var3_3)));
                    var15_14 = HeSD.Ey(var15_14, FMkR$WjFM.a("\u5448\ucec1"), HeSD.Ey(HeSD.Ey(var6_6)));
                    var15_14 = HeSD.Ey(var15_14, FMkR$WjFM.a("\u5448\uced6"), HeSD.Ey(HeSD.Ey(var3_3)));
                    var15_14 = HeSD.Ey(var15_14, FMkR$WjFM.a("\u5448\uced2"), HeSD.Ey(this.getProgress(), false));
                    this.yJLS((String)var15_14);
                    HeSD.Ey(var4_4, (Integer)o.a(this, 900547786));
                    if ((Integer)o.a(this, 900547786) <= 0) continue;
                    HeSD.Ey(var5_5, true);
                }
            }
            ++var10_10;
        }
        this.wKtV();
        if (HeSD.Ey(var6_6) > true) ** GOTO lbl-1000
        if (HeSD.Ey(var6_6) == false) lbl-1000: // 2 sources:
        {
            v0 = FMkR$WjFM.a("\u541f");
        } else {
            v0 = "";
        }
        var1_1.biLo((String)HeSD.Ey(HeSD.Ey(HeSD.Ey(HeSD.Ey(HeSD.Ey(HeSD.Ey(new StringBuilder((String)HeSD.Ey(HeSD.Ey(FMkR$WjFM.a("\u540d\ucec1\u2294\ub847\ua438\u61d6\ua82c\u6bec\ue59a\ua5b0\u6178\uf2d9\uc51f\u74ab\uc522\u434e\ub5da\ub78c\u9d53\u95f4\u4eaf\ucca1\u2a05\u5f43\ud7cf\u8692\u31f8")))), HeSD.Ey(HeSD.Ey(var6_6))), HeSD.Ey(FMkR$WjFM.a("\u540d\ucec1\u2294\ub847\ua438\u61d6\ua82c\u6bec\ue59a\ua5b0\u6178\uf2d9\uc51f\u74ab\uc522\u434e\ub5da\ub78c\u9d5c\u95f3\u4eb9\ucca4\u2a0b"))), v0), HeSD.Ey(FMkR$WjFM.a("\u540d\ucec1\u2294\ub847\ua438\u61d6\ua82c\u6bec\ue59a\ua5b0\u6178\uf2d9\uc51f\u74ab\uc522\u434e\ub5da\ub78c\u9d59\u95f4\u4ebe"))), HeSD.Ey(var7_7, true))));
    }

    private static Object Ey(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


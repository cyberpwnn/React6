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

@IWbc(value=1)
public class lCdp
extends TyVf {
    private int YEMO;

    public lCdp() {
        super((cIji)((Object)cv.e(-154857164)));
        this.ssNb((String[])cv.e(862720311));
        this.ssNb(Chunk.class, new lCdp$1(this));
        this.ssNb(Long.class, new lCdp$2(this));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public /* varargs */ void ssNb(ftyu var1_1, EmKi ... var2_2) {
        var3_3 = new TFYr(0);
        var4_4 = new TFYr(0);
        var5_5 = new TFYr(0);
        var6_6 = new TFYr(0);
        var7_7 = 10000;
        var12_8 = var2_2;
        var11_9 = var12_8.length;
        var10_10 = 0;
        while (var10_10 < var11_9) {
            var9_11 = var12_8[var10_10];
            if (lCdp.cS(var9_11.getType(), Long.class) != false) {
                var7_7 = lCdp.cS((uWVB)var9_11);
            }
            ++var10_10;
        }
        var12_8 = var2_2;
        var11_9 = var12_8.length;
        var10_10 = 0;
        while (var10_10 < var11_9) {
            var9_11 = var12_8[var10_10];
            if (lCdp.cS(var9_11.getType(), Chunk.class) != false) {
                lCdp.cS(var3_3, lCdp.cS(var9_11.mXMK()));
                var14_13 = lCdp.cS(var9_11.mXMK());
                while (var14_13.hasNext()) {
                    var13_12 = var14_13.next();
                    if (!var9_11.OXeK(var13_12)) continue;
                    lCdp.cS((TOJM)cv.b((YoSa)cv.e(239341894), 630329654), (Chunk)var13_12, var7_7);
                    lCdp.cS(var6_6, true);
                    var15_14 = (String)cv.e(80679216);
                    this.setProgress((double)((Object)lCdp.cS(var6_6) / (Object)lCdp.cS(var3_3)));
                    var15_14 = lCdp.cS(var15_14, YEBy$TyVf.W("\u7dda\u718b"), lCdp.cS(lCdp.cS(var6_6)));
                    var15_14 = lCdp.cS(var15_14, YEBy$TyVf.W("\u7dda\u719c"), lCdp.cS(lCdp.cS(var3_3)));
                    var15_14 = lCdp.cS(var15_14, YEBy$TyVf.W("\u7dda\u7198"), lCdp.cS(this.getProgress(), false));
                    this.ssNb((String)var15_14);
                    lCdp.cS(var4_4, (Integer)cv.b(this, -125693645));
                    if ((Integer)cv.b(this, -125693645) <= 0) continue;
                    lCdp.cS(var5_5, true);
                }
            }
            ++var10_10;
        }
        this.WGJn();
        if (lCdp.cS(var6_6) > true) ** GOTO lbl-1000
        if (lCdp.cS(var6_6) == false) lbl-1000: // 2 sources:
        {
            v0 = YEBy$TyVf.W("\u7d8d");
        } else {
            v0 = "";
        }
        var1_1.IWSm((String)lCdp.cS(lCdp.cS(lCdp.cS(lCdp.cS(lCdp.cS(lCdp.cS(new StringBuilder(YEBy$TyVf.W("\u7db2\u7187\u594e\u5241\uf6bf\udd2c\u627e\ued19\ucb2e\u264b\u791e\u7c91\ub771\ue745\u9ea1\u5487\u3d89\ue74c\u7b00")), lCdp.cS(lCdp.cS(var6_6))), YEBy$TyVf.W("\u7dde\u718b\u5945\u525f\uf6b4\udd23")), v0), YEBy$TyVf.W("\u7dde\u718e\u5942\u5258\uf6fa")), lCdp.cS(var7_7, true))));
    }

    private static Object cS(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


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
public class BkpW
extends TyVf {
    private int YEMO;

    public BkpW() {
        super((cIji)((Object)cv.e(-1414393524)));
        this.ssNb((String[])cv.e(1911820623));
        this.ssNb(Chunk.class, new BkpW$1(this));
        this.ssNb(Long.class, new BkpW$2(this));
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
            if (BkpW.mM(var9_11.getType(), Long.class) != false) {
                var7_7 = BkpW.mM((uWVB)var9_11);
            }
            ++var10_10;
        }
        var12_8 = var2_2;
        var11_9 = var12_8.length;
        var10_10 = 0;
        while (var10_10 < var11_9) {
            var9_11 = var12_8[var10_10];
            if (BkpW.mM(var9_11.getType(), Chunk.class) != false) {
                BkpW.mM(var3_3, BkpW.mM(var9_11.mXMK()));
                var14_13 = BkpW.mM(var9_11.mXMK());
                while (var14_13.hasNext()) {
                    var13_12 = var14_13.next();
                    if (!var9_11.OXeK(var13_12)) continue;
                    BkpW.mM((XthG)cv.b((YoSa)cv.e(239341894), 1871515977), (Chunk)var13_12, var7_7);
                    BkpW.mM(var6_6, true);
                    var15_14 = (String)cv.e(-1615720117);
                    this.setProgress((double)((Object)BkpW.mM(var6_6) / (Object)BkpW.mM(var3_3)));
                    var15_14 = BkpW.mM(var15_14, KUXS$dwji.S("\u1f1a\uc79a"), BkpW.mM(BkpW.mM(var6_6)));
                    var15_14 = BkpW.mM(var15_14, KUXS$dwji.S("\u1f1a\uc78d"), BkpW.mM(BkpW.mM(var3_3)));
                    var15_14 = BkpW.mM(var15_14, KUXS$dwji.S("\u1f1a\uc789"), BkpW.mM(this.getProgress(), false));
                    this.ssNb((String)var15_14);
                    BkpW.mM(var4_4, (Integer)cv.b(this, -922349238));
                    if ((Integer)cv.b(this, -922349238) <= 0) continue;
                    BkpW.mM(var5_5, true);
                }
            }
            ++var10_10;
        }
        this.WGJn();
        if (BkpW.mM(var6_6) > true) ** GOTO lbl-1000
        if (BkpW.mM(var6_6) == false) lbl-1000: // 2 sources:
        {
            v0 = KUXS$dwji.S("\u1f4d");
        } else {
            v0 = "";
        }
        var1_1.IWSm((String)BkpW.mM(BkpW.mM(BkpW.mM(BkpW.mM(BkpW.mM(BkpW.mM(new StringBuilder(KUXS$dwji.S("\u1f72\uc796\u240c\u79a9\u12dd\ua0da\uf09c\u48c6\ufa9e\u18b5\u74eb\ue683\ubd17\ua1c8\u4a49\ud13e\u31c3\u8603")), BkpW.mM(BkpW.mM(var6_6))), KUXS$dwji.S("\u1f1e\uc79a\u2407\u79b7\u12d6\ua0d5")), v0), KUXS$dwji.S("\u1f1e\uc79f\u2400\u79b0\u1298")), BkpW.mM(var7_7, true))));
    }

    private static Object mM(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


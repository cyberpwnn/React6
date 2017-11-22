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
public class WGJn
extends TyVf {
    private int YEMO;

    public WGJn() {
        super((cIji)((Object)cv.e(-1511452938)));
        this.ssNb((String[])cv.e(-1043198223));
        this.ssNb(Chunk.class, new WGJn$1(this));
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
        var10_7 = var2_2;
        var9_8 = var10_7.length;
        var8_9 = 0;
        while (var8_9 < var9_8) {
            block5 : {
                var7_10 = var10_7[var8_9];
                if (WGJn.Su(var7_10.getType(), Chunk.class) == false) break block5;
                WGJn.Su(var3_3, WGJn.Su(var7_10.mXMK()));
                var12_12 = WGJn.Su(var7_10.mXMK());
                while (var12_12.hasNext()) {
                    var11_11 = var12_12.next();
                    if (!var7_10.OXeK(var11_11)) continue;
                    WGJn.Su((TOJM)cv.b((YoSa)cv.e(239341894), 630329654), (Chunk)var11_11);
                    WGJn.Su(var6_6, true);
                    var13_13 = (String)cv.e(80679216);
                    this.setProgress((double)((Object)WGJn.Su(var6_6) / (Object)WGJn.Su(var3_3)));
                    var13_13 = WGJn.Su(var13_13, KUXS$dwji.S("\ub0a4\u907d"), WGJn.Su(WGJn.Su(var6_6)));
                    var13_13 = WGJn.Su(var13_13, KUXS$dwji.S("\ub0a4\u906a"), WGJn.Su(WGJn.Su(var3_3)));
                    var13_13 = WGJn.Su(var13_13, KUXS$dwji.S("\ub0a4\u906e"), WGJn.Su(this.getProgress(), false));
                    this.ssNb((String)var13_13);
                    WGJn.Su(var4_4, (Integer)cv.b(this, -1041297680));
                    if ((Integer)cv.b(this, -1041297680) > 0) {
                        WGJn.Su(var5_5, true);
                    }
                    if (WGJn.Su(var6_6) != WGJn.Su(var3_3)) continue;
                    this.WGJn();
                    if (WGJn.Su(var6_6) > true) ** GOTO lbl-1000
                    if (WGJn.Su(var6_6) == false) lbl-1000: // 2 sources:
                    {
                        v0 = KUXS$dwji.S("\ub0f3");
                    } else {
                        v0 = "";
                    }
                    var1_1.IWSm((String)WGJn.Su(WGJn.Su(WGJn.Su(WGJn.Su(new StringBuilder(KUXS$dwji.S("\ub0d5\u9070\u47e8\u58d7\u14e7\ud413\uf884\u0987\uc7c3\uba11\ucdde\u7007\u20e8\u14ff\u4873\u080c\ude0e\uf665\u4406\u72bb\u9fde")), WGJn.Su(WGJn.Su(var6_6))), KUXS$dwji.S("\ub0a0\u907d\u47ec\u58cd\u14ea\ud413")), v0)));
                }
            }
            ++var8_9;
        }
    }

    private static Object Su(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


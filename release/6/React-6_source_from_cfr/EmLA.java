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
public class EmLA
extends TyVf {
    private int YEMO;

    public EmLA() {
        super((cIji)((Object)cv.e(1297813770)));
        this.ssNb((String[])cv.e(-1727328523));
        this.ssNb(Chunk.class, new EmLA$1(this));
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
                if (EmLA.bg(var7_10.getType(), Chunk.class) == false) break block5;
                EmLA.bg(var3_3, EmLA.bg(var7_10.mXMK()));
                var12_12 = EmLA.bg(var7_10.mXMK());
                while (var12_12.hasNext()) {
                    var11_11 = var12_12.next();
                    if (!var7_10.OXeK(var11_11)) continue;
                    EmLA.bg((TOJM)cv.b((YoSa)cv.e(239341894), 630329654), (Chunk)var11_11);
                    EmLA.bg(var6_6, true);
                    var13_13 = (String)cv.e(-1615720117);
                    this.setProgress((double)((Object)EmLA.bg(var6_6) / (Object)EmLA.bg(var3_3)));
                    var13_13 = EmLA.bg(var13_13, rgig$AWxc.r("\ua76a\u1fdd"), EmLA.bg(EmLA.bg(var6_6)));
                    var13_13 = EmLA.bg(var13_13, rgig$AWxc.r("\ua76a\u1fca"), EmLA.bg(EmLA.bg(var3_3)));
                    var13_13 = EmLA.bg(var13_13, rgig$AWxc.r("\ua76a\u1fce"), EmLA.bg(this.getProgress(), false));
                    this.ssNb((String)var13_13);
                    EmLA.bg(var4_4, (Integer)cv.b(this, 2120093431));
                    if ((Integer)cv.b(this, 2120093431) > 0) {
                        EmLA.bg(var5_5, true);
                    }
                    if (EmLA.bg(var6_6) != EmLA.bg(var3_3)) continue;
                    this.WGJn();
                    if (EmLA.bg(var6_6) > true) ** GOTO lbl-1000
                    if (EmLA.bg(var6_6) == false) lbl-1000: // 2 sources:
                    {
                        v0 = rgig$AWxc.r("\ua73d");
                    } else {
                        v0 = "";
                    }
                    var1_1.IWSm((String)EmLA.bg(EmLA.bg(EmLA.bg(EmLA.bg(new StringBuilder(rgig$AWxc.r("\ua71b\u1fd0\udb1a\u7f02\ud521\u92b3\u0ccf\u95d0\u099d\u87f5\u666d\ued15\u255a\ua20e\ubf06\u77b6\ufc0d\u5310\u9259\u5d6a")), EmLA.bg(EmLA.bg(var6_6))), rgig$AWxc.r("\ua76e\u1fdd\udb1e\u7f18\ud52c\u92b3")), v0)));
                }
            }
            ++var8_9;
        }
    }

    private static Object bg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


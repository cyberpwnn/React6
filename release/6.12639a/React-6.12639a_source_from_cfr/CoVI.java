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
public class CoVI
extends IFQY {
    private int opGo;

    public CoVI() {
        super((WOYg)((Object)o.k(-581218462)));
        this.yJLS((String[])o.k(-1675997343));
        this.yJLS(Chunk.class, new CoVI$1(this));
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
        var10_7 = var2_2;
        var9_8 = var10_7.length;
        var8_9 = 0;
        while (var8_9 < var9_8) {
            block5 : {
                var7_10 = var10_7[var8_9];
                if (CoVI.mD(var7_10.getType(), Chunk.class) == false) break block5;
                CoVI.mD(var3_3, CoVI.mD(var7_10.IFSe()));
                var12_12 = CoVI.mD(var7_10.IFSe());
                while (var12_12.hasNext()) {
                    var11_11 = var12_12.next();
                    if (!var7_10.TEqA(var11_11)) continue;
                    CoVI.mD((eilm)o.a((TEqA)o.k(911295720), 180896829), (Chunk)var11_11);
                    CoVI.mD(var6_6, true);
                    var13_13 = (String)o.k(-1638906821);
                    this.setProgress((double)((Object)CoVI.mD(var6_6) / (Object)CoVI.mD(var3_3)));
                    var13_13 = CoVI.mD(var13_13, nJPf$sILv.G("\uc2ae\ueeb3"), CoVI.mD(CoVI.mD(var6_6)));
                    var13_13 = CoVI.mD(var13_13, nJPf$sILv.G("\uc2ae\ueea4"), CoVI.mD(CoVI.mD(var3_3)));
                    var13_13 = CoVI.mD(var13_13, nJPf$sILv.G("\uc2ae\ueea0"), CoVI.mD(this.getProgress(), false));
                    this.yJLS((String)var13_13);
                    CoVI.mD(var4_4, (Integer)o.a(this, 1134431));
                    if ((Integer)o.a(this, 1134431) > 0) {
                        CoVI.mD(var5_5, true);
                    }
                    if (CoVI.mD(var6_6) != CoVI.mD(var3_3)) continue;
                    this.wKtV();
                    if (CoVI.mD(var6_6) > true) ** GOTO lbl-1000
                    if (CoVI.mD(var6_6) == false) lbl-1000: // 2 sources:
                    {
                        v0 = nJPf$sILv.G("\uc2f9");
                    } else {
                        v0 = "";
                    }
                    var1_1.biLo((String)CoVI.mD(CoVI.mD(CoVI.mD(CoVI.mD(new StringBuilder((String)CoVI.mD(CoVI.mD(nJPf$sILv.G("\uc2ff\ueebe\ud21f\udc25\u1fd3\u9be2\u4dae\ub767\u3c0a\ua6da\ue340\u3a42\ue971\uf72f\ub7f0\ud27f\u6229\u6f21\uadbb\u7dce\ub5a2\ue9e6\u59a8\u5a56")))), CoVI.mD(CoVI.mD(var6_6))), CoVI.mD(nJPf$sILv.G("\uc2ff\ueebe\ud21f\udc25\u1fd3\u9be2\u4dae\ub767\u3c0a\ua6da\ue340\u3a42\ue971\uf739\ub7f6\ud266\u6228\u6f29"))), v0)));
                }
            }
            ++var8_9;
        }
    }

    private static Object mD(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


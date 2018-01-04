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
public class wKtV
extends IFQY {
    private int opGo;

    public wKtV() {
        super((WOYg)((Object)o.k(1622626142)));
        this.yJLS((String[])o.k(617828189));
        this.yJLS(Chunk.class, new wKtV$1(this));
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
                if (wKtV.wE(var7_10.getType(), Chunk.class) == false) break block5;
                wKtV.wE(var3_3, wKtV.wE(var7_10.IFSe()));
                var12_12 = wKtV.wE(var7_10.IFSe());
                while (var12_12.hasNext()) {
                    var11_11 = var12_12.next();
                    if (!var7_10.TEqA(var11_11)) continue;
                    wKtV.wE((mXRj)o.a((TEqA)o.k(911295720), 878134470), (Chunk)var11_11);
                    wKtV.wE(var6_6, true);
                    var13_13 = (String)o.k(1598047428);
                    this.setProgress((double)((Object)wKtV.wE(var6_6) / (Object)wKtV.wE(var3_3)));
                    var13_13 = wKtV.wE(var13_13, FMkR$WjFM.a("\ua938\ub711"), wKtV.wE(wKtV.wE(var6_6)));
                    var13_13 = wKtV.wE(var13_13, FMkR$WjFM.a("\ua938\ub706"), wKtV.wE(wKtV.wE(var3_3)));
                    var13_13 = wKtV.wE(var13_13, FMkR$WjFM.a("\ua938\ub702"), wKtV.wE(this.getProgress(), false));
                    this.yJLS((String)var13_13);
                    wKtV.wE(var4_4, (Integer)o.a(this, 8539995));
                    if ((Integer)o.a(this, 8539995) > 0) {
                        wKtV.wE(var5_5, true);
                    }
                    if (wKtV.wE(var6_6) != wKtV.wE(var3_3)) continue;
                    this.wKtV();
                    if (wKtV.wE(var6_6) > true) ** GOTO lbl-1000
                    if (wKtV.wE(var6_6) == false) lbl-1000: // 2 sources:
                    {
                        v0 = FMkR$WjFM.a("\ua96f");
                    } else {
                        v0 = "";
                    }
                    var1_1.biLo((String)wKtV.wE(wKtV.wE(wKtV.wE(wKtV.wE(new StringBuilder((String)wKtV.wE(wKtV.wE(FMkR$WjFM.a("\ua97d\ub711\u4bb0\uc385\u876d\u8260\u4f9d\u1611\u8dd1\uf333\ufada\ufca4\u383f\u829e\u9232\u0a2b\u3033\u1740\ufe98\u9789\u46ab\uff27\ube0d\u4c01\uf08b\u6f7b\u7c4b\u6bb0\u0e66\uc785\uebd1\u4cac")))), wKtV.wE(wKtV.wE(var6_6))), wKtV.wE(FMkR$WjFM.a("\ua97d\ub711\u4bb0\uc385\u876d\u8260\u4f9d\u1611\u8dd1\uf333\ufada\ufca4\u383f\u829e\u9232\u0a2b\u3033\u1740\ufe98\u9789\u46ab\uff31\ube0b\u4c18\uf08a\u6f73"))), v0)));
                }
            }
            ++var8_9;
        }
    }

    private static Object wE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


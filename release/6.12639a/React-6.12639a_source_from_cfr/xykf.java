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
public class xykf
extends IFQY {
    private int opGo;

    public xykf() {
        super((WOYg)((Object)o.k(-2035593366)));
        this.yJLS((String[])o.k(-1463267479));
        this.yJLS(Chunk.class, new xykf$1(this));
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
                if (xykf.io(var7_10.getType(), Chunk.class) == false) break block5;
                xykf.io(var3_3, xykf.io(var7_10.IFSe()));
                var12_12 = xykf.io(var7_10.IFSe());
                while (var12_12.hasNext()) {
                    var11_11 = var12_12.next();
                    if (!var7_10.TEqA(var11_11)) continue;
                    xykf.io((WiUt)o.a((TEqA)o.k(911295720), 1578190000), (Chunk)var11_11);
                    xykf.io(var6_6, true);
                    var13_13 = (String)o.k(-1920580434);
                    this.setProgress((double)((Object)xykf.io(var6_6) / (Object)xykf.io(var3_3)));
                    var13_13 = xykf.io(var13_13, FMkR$WjFM.a("\ub4ed\uf640"), xykf.io(xykf.io(var6_6)));
                    var13_13 = xykf.io(var13_13, FMkR$WjFM.a("\ub4ed\uf657"), xykf.io(xykf.io(var3_3)));
                    var13_13 = xykf.io(var13_13, FMkR$WjFM.a("\ub4ed\uf653"), xykf.io(this.getProgress(), false));
                    this.yJLS((String)var13_13);
                    xykf.io(var4_4, (Integer)o.a(this, -1110683801));
                    if ((Integer)o.a(this, -1110683801) > 0) {
                        xykf.io(var5_5, true);
                    }
                    if (xykf.io(var6_6) != xykf.io(var3_3)) continue;
                    this.wKtV();
                    if (xykf.io(var6_6) > true) ** GOTO lbl-1000
                    if (xykf.io(var6_6) == false) lbl-1000: // 2 sources:
                    {
                        v0 = FMkR$WjFM.a("\ub4ba");
                    } else {
                        v0 = "";
                    }
                    var1_1.biLo((String)xykf.io(xykf.io(xykf.io(xykf.io(new StringBuilder((String)xykf.io(xykf.io(FMkR$WjFM.a("\ub4a8\uf640\u9079\u2150\u01fa\u08bc\u0289\ub510\u79cb\u18c9\ub82b\ue7b3\u2a06\u06ca\u5e47\u5b5a\u3507\u51b2\u8c16\uc8ed\u7632\ua32a\u8b83\uf9a1\u7841\u99aa\u1b96\u5421\ub2f1\u782d\uf19a\u5031\uc65d\u8cb0")))), xykf.io(xykf.io(var6_6))), xykf.io(FMkR$WjFM.a("\ub4a8\uf640\u9079\u2150\u01fa\u08bc\u0289\ub510\u79cb\u18c9\ub82b\ue7b3\u2a06\u06ca\u5e47\u5b5a\u3507\u51b2\u8c16\uc8ed\u7632\ua32a\u8b83\uf9b7\u7847\u99b3\u1b97\u5429"))), v0)));
                }
            }
            ++var8_9;
        }
    }

    private static Object io(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


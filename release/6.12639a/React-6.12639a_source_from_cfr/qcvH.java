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
public class qcvH
extends IFQY {
    private int opGo;

    public qcvH() {
        super((WOYg)((Object)o.k(41239730)));
        this.yJLS((String[])o.k(-1992407887));
        this.yJLS(Chunk.class, new qcvH$1(this));
        this.yJLS(Long.class, new qcvH$2(this));
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
            if (qcvH.CG(var9_11.getType(), Long.class) != false) {
                var7_7 = qcvH.CG((CgHM)var9_11);
            }
            ++var10_10;
        }
        var12_8 = var2_2;
        var11_9 = var12_8.length;
        var10_10 = 0;
        while (var10_10 < var11_9) {
            var9_11 = var12_8[var10_10];
            if (qcvH.CG(var9_11.getType(), Chunk.class) != false) {
                qcvH.CG(var3_3, qcvH.CG(var9_11.IFSe()));
                var14_13 = qcvH.CG(var9_11.IFSe());
                while (var14_13.hasNext()) {
                    var13_12 = var14_13.next();
                    if (!var9_11.TEqA(var13_12)) continue;
                    qcvH.CG((WiUt)o.a((TEqA)o.k(911295720), 1578190000), (Chunk)var13_12, var7_7);
                    qcvH.CG(var6_6, true);
                    var15_14 = (String)o.k(-1920580434);
                    this.setProgress((double)((Object)qcvH.CG(var6_6) / (Object)qcvH.CG(var3_3)));
                    var15_14 = qcvH.CG(var15_14, nJPf$sILv.G("\u0f9e\ue2f6"), qcvH.CG(qcvH.CG(var6_6)));
                    var15_14 = qcvH.CG(var15_14, nJPf$sILv.G("\u0f9e\ue2e1"), qcvH.CG(qcvH.CG(var3_3)));
                    var15_14 = qcvH.CG(var15_14, nJPf$sILv.G("\u0f9e\ue2e5"), qcvH.CG(this.getProgress(), false));
                    this.yJLS((String)var15_14);
                    qcvH.CG(var4_4, (Integer)o.a(this, -196000595));
                    if ((Integer)o.a(this, -196000595) <= 0) continue;
                    qcvH.CG(var5_5, true);
                }
            }
            ++var10_10;
        }
        this.wKtV();
        if (qcvH.CG(var6_6) > true) ** GOTO lbl-1000
        if (qcvH.CG(var6_6) == false) lbl-1000: // 2 sources:
        {
            v0 = nJPf$sILv.G("\u0fc9");
        } else {
            v0 = "";
        }
        var1_1.biLo((String)qcvH.CG(qcvH.CG(qcvH.CG(qcvH.CG(qcvH.CG(qcvH.CG(new StringBuilder((String)qcvH.CG(qcvH.CG(nJPf$sILv.G("\u0fdb\ue2f6\u4432\u673f\uee4f\ub7a7\ub851\u74b5\ua347\u7a5b\u44d2\u0696\u9b1c\u47ed\u36ef\ucd39\u3c9f\ua844\udc4e\ub4ae\u317c\ua490\ub0ea\u3d50\ua78b\udbb5\u9e4e\u16ff\ud2bb\u68e6")))), qcvH.CG(qcvH.CG(var6_6))), qcvH.CG(nJPf$sILv.G("\u0fdb\ue2f6\u4432\u673f\uee4f\ub7a7\ub851\u74b5\ua347\u7a5b\u44d2\u0696\u9b1c\u47ed\u36ef\ucd39\u3c9f\ua844\udc4e\ub4ae\u317c\ua49f\ub0ed\u3d46\ua78e\udbbb"))), v0), qcvH.CG(nJPf$sILv.G("\u0fdb\ue2f6\u4432\u673f\uee4f\ub7a7\ub851\u74b5\ua347\u7a5b\u44d2\u0696\u9b1c\u47ed\u36ef\ucd39\u3c9f\ua844\udc4e\ub4ae\u317c\ua49a\ub0ea\u3d41"))), qcvH.CG(var7_7, true))));
    }

    private static Object CG(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


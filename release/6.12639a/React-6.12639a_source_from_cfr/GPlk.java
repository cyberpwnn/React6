/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.entity.EntityType
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.entity.EntityType;

@BtuM(value=1)
public class GPlk
extends IFQY {
    private long LOqF;
    private int opGo;

    public GPlk() {
        super((WOYg)((Object)o.k(-1259060001)));
        this.yJLS((String[])o.k(1450984670));
        this.yJLS(Chunk.class, new GPlk$1(this));
        this.yJLS(EntityType.class, new GPlk$2(this));
    }

    @Override
    public /* varargs */ void yJLS(xynF xynF2, GjaJ ... arrgjaJ) {
        Object object;
        Object e;
        GjaJ gjaJ;
        yJSB yJSB2 = new yJSB(0);
        yJSB yJSB3 = new yJSB(0);
        yJSB yJSB4 = new yJSB(0);
        yJSB yJSB5 = new yJSB(0);
        o.v(this, 956777693, (long)GPlk.Gn());
        int n = 0;
        int n2 = 0;
        GjaJ[] arrgjaJ2 = arrgjaJ;
        int n3 = arrgjaJ2.length;
        int n4 = 0;
        while (n4 < n3) {
            gjaJ = arrgjaJ2[n4];
            if (GPlk.Gn(gjaJ.getType(), Chunk.class) != false) {
                n += GPlk.Gn(gjaJ.IFSe());
            }
            if (GPlk.Gn(gjaJ.getType(), EntityType.class) != false) {
                object = GPlk.Gn(gjaJ.IFSe());
                while (object.hasNext()) {
                    e = object.next();
                    if (!gjaJ.TEqA(e)) continue;
                    ++n2;
                }
            }
            ++n4;
        }
        xynF2.TEqA((String)GPlk.Gn(GPlk.Gn(GPlk.Gn(GPlk.Gn(GPlk.Gn(GPlk.Gn(GPlk.Gn(GPlk.Gn(GPlk.Gn(GPlk.Gn(new StringBuilder((String)GPlk.Gn(GPlk.Gn(nJPf$sILv.G("\u8cdf\ubbd0\u234a\u146a\uc6f5\u2fbb\u9891\u679c\ud87e\u846a\udaba\ude7e\u7754\u427e\u1cf6\u2d5b\u1346\u3afa\ub4a1\u1908\ud1a0\ufbc8\u4c9d\ufe4e\u1780\ub15f\ue5df\ueefd")))), n2), GPlk.Gn(nJPf$sILv.G("\u8cdf\ubbd0\u234a\u146a\uc6f5\u2fbb\u9891\u679c\ud87e\u846a\udaba\ude7e\u7754\u427e\u1cf6\u2d5b\u1346\u3afa\ub4a1\u1908\ud1a0\ufbdf\u4c91\ufe52\u1789"))), n2 == 0 || n2 > 1 ? nJPf$sILv.G("\u8ccd") : ""), GPlk.Gn(nJPf$sILv.G("\u8cdf\ubbd0\u234a\u146a\uc6f5\u2fbb\u9891\u679c\ud87e\u846a\udaba\ude7e\u7754\u427e\u1cf6\u2d5b\u1346\u3afa\ub4a1\u1908\ud1a0\ufbc4\u4c8e\ufe0f\u178a\ub159\ue5c3\ueeb7\u1ce1\ub0fe\uefee\u53c6\u4e71\u6865\u1c4a"))), n2 == 0 || n2 > 1 ? GPlk.Gn(nJPf$sILv.G("\u8cdf\ubbd0\u234a\u146a\uc6f5\u2fbb\u9891\u679c\ud87e\u846a\udaba\ude7e\u7754\u427e\u1cf6\u2d5b\u1346\u3afa\ub4a1\u1908\ud1a0\ufbce\u4c86\ufe56\u1785\ub142\ue5d8\ueeff\u1cf1")) : GPlk.Gn(nJPf$sILv.G("\u8cdf\ubbd0\u234a\u146a\uc6f5\u2fbb\u9891\u679c\ud87e\u846a\udaba\ude7e\u7754\u427e\u1cf6\u2d5b\u1346\u3afa\ub4a1\u1908\ud1a0\ufbce\u4c86\ufe56\u1785\ub142\ue5c8"))), GPlk.Gn(nJPf$sILv.G("\u8cdf\ubbd0\u234a\u146a\uc6f5\u2fbb\u9891\u679c\ud87e\u846a\udaba\ude7e\u7754\u427e\u1cf6\u2d5b\u1346\u3afa\ub4a1\u1908\ud1a0\ufbca\u4c8b\ufe50\u1783\ub145\ue5c2"))), GPlk.Gn(n)), GPlk.Gn(nJPf$sILv.G("\u8cdf\ubbd0\u234a\u146a\uc6f5\u2fbb\u9891\u679c\ud87e\u846a\udaba\ude7e\u7754\u427e\u1cf6\u2d5b\u1346\u3afa\ub4a1\u1908\ud1a0\ufbc8\u4c80\ufe57\u1782\ub15d"))), n > 1 || n == 0 ? nJPf$sILv.G("\u8ccd") : "")));
        arrgjaJ2 = arrgjaJ;
        n3 = arrgjaJ2.length;
        n4 = 0;
        while (n4 < n3) {
            gjaJ = arrgjaJ2[n4];
            if (GPlk.Gn(gjaJ.getType(), Chunk.class) != false) {
                GPlk.Gn(yJSB2, GPlk.Gn(gjaJ.IFSe()));
                object = GPlk.Gn(gjaJ.IFSe());
                while (object.hasNext()) {
                    e = object.next();
                    if (!gjaJ.TEqA(e)) continue;
                    this.yJLS((Chunk)e, new GPlk$3(this, yJSB5, yJSB2, yJSB3, yJSB4, xynF2), xynF2, arrgjaJ);
                }
            }
            ++n4;
        }
        new GPlk$4(this, nJPf$sILv.G("\u8cdd\ubbc6\u2352\u146f\uc6ff\u2fa7\u9892\u6792\ud864\u8468\udabf\ude27\u775e\u4262\u1caf\u2d51\u1353\u3aff\ub4a8\u1919\ud1ef\ufbc8\u4c83"), 2, xynF2, yJSB3, yJSB4);
    }

    public /* varargs */ void yJLS(Chunk chunk, Runnable runnable, xynF xynF2, GjaJ ... arrgjaJ) {
        o.v(this, 798508261, (int)GPlk.Gn((SmjV)o.a((TEqA)o.k(911295720), 229721319), chunk));
        runnable.run();
    }

    static /* synthetic */ void yJLS(GPlk gPlk, long l) {
        o.v(gPlk, 956777693, l);
    }

    static /* synthetic */ int yJLS(GPlk gPlk) {
        return (Integer)o.a(gPlk, 798508261);
    }

    static /* synthetic */ long UtIU(GPlk gPlk) {
        return (Long)o.a(gPlk, 956777693);
    }

    private static Object Gn(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


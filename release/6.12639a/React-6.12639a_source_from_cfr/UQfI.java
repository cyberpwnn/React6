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
public class UQfI
extends IFQY {
    private long LOqF;
    private int opGo;
    private boolean NohV = false;

    public UQfI() {
        super((WOYg)((Object)o.k(-437042026)));
        this.yJLS((String[])o.k(-2004925291));
        this.yJLS(Chunk.class, new UQfI$1(this));
    }

    @Override
    public /* varargs */ void yJLS(xynF xynF2, GjaJ ... arrgjaJ) {
        GjaJ gjaJ;
        yJSB yJSB2 = new yJSB(0);
        yJSB yJSB3 = new yJSB(0);
        yJSB yJSB4 = new yJSB(0);
        yJSB yJSB5 = new yJSB(0);
        yJSB yJSB6 = new yJSB(0);
        o.v(this, -1490860908, (long)UQfI.HO());
        int n = 0;
        GjaJ[] arrgjaJ2 = arrgjaJ;
        int n2 = arrgjaJ2.length;
        int n3 = 0;
        while (n3 < n2) {
            gjaJ = arrgjaJ2[n3];
            if (UQfI.HO(gjaJ.getType(), Chunk.class) != false) {
                n += UQfI.HO(gjaJ.IFSe());
            }
            ++n3;
        }
        xynF2.TEqA((String)UQfI.HO(UQfI.HO(UQfI.HO(UQfI.HO(new StringBuilder((String)UQfI.HO(UQfI.HO(FMkR$WjFM.a("\ud88c\u92c8\u204d\u898e\udb9c\u2fe7\u8ecd\uafd4\uf942\u1584\u272f\u49ad\ue5c1\ued25\u46a5\u06a7\uaa48\u7d81\ubd18\u12f4\u76e5\u8b76\u15d2\u51cd\u6e41\u9d3f\ud47d")))), UQfI.HO(n)), UQfI.HO(FMkR$WjFM.a("\ud88c\u92c8\u204d\u898e\udb9c\u2fe7\u8ecd\uafd4\uf942\u1584\u272f\u49ad\ue5c1\ued25\u46a5\u06a7\uaa48\u7d81\ubd18\u12f4\u76f6\u8b6b\u15d5\u51c4\u6e43"))), n > 1 || n == 0 ? FMkR$WjFM.a("\ud89e") : "")));
        arrgjaJ2 = arrgjaJ;
        n2 = arrgjaJ2.length;
        n3 = 0;
        while (n3 < n2) {
            gjaJ = arrgjaJ2[n3];
            if (UQfI.HO(gjaJ.getType(), Chunk.class) != false) {
                UQfI.HO(yJSB2, UQfI.HO(gjaJ.IFSe()));
                double d = 2.0;
                Object object = UQfI.HO(gjaJ.IFSe());
                while (object.hasNext()) {
                    Object e = object.next();
                    if (!gjaJ.TEqA(e)) continue;
                    int n4 = (int)(d += 0.03);
                    new UQfI$2(this, FMkR$WjFM.a("\ud89a\u92ca\u2050\u8993\udb96\u2ffb\u8ece\uafd0\uf945"), 0, n4, n4, e, xynF2, arrgjaJ, yJSB6, yJSB5, yJSB2, yJSB3, yJSB4);
                }
            }
            ++n3;
        }
        new UQfI$3(this, FMkR$WjFM.a("\ud89d\u92de\u204b\u8980\udb96\u2ffb\u8ece\uafc9\uf958\u1598\u2721\u49bc\ue583\ued34\u46e0\u06b1\uaa47\u7d86\ubd07\u12b8\u76f4\u8b60\u15cb"), 30, xynF2, yJSB6);
    }

    public /* varargs */ void UtIU(Chunk chunk, Runnable runnable, xynF xynF2, GjaJ ... arrgjaJ) {
        new UQfI$4(this, chunk, runnable);
    }

    static /* synthetic */ boolean yJLS(UQfI uQfI) {
        return (Boolean)o.a(uQfI, 607863955);
    }

    static /* synthetic */ void yJLS(UQfI uQfI, long l) {
        o.v(uQfI, -1490860908, l);
    }

    static /* synthetic */ int UtIU(UQfI uQfI) {
        return (Integer)o.a(uQfI, -768064254);
    }

    static /* synthetic */ long biLo(UQfI uQfI) {
        return (Long)o.a(uQfI, -1490860908);
    }

    static /* synthetic */ void yJLS(UQfI uQfI, boolean bl) {
        o.v(uQfI, 607863955, bl);
    }

    private static Object HO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.EntityType
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

@BtuM(value=1)
public class Mkpo
extends IFQY {
    private long LOqF;
    private int opGo;

    public Mkpo() {
        super((WOYg)((Object)o.k(927158134)));
        this.yJLS((String[])o.k(-177320075));
        this.yJLS(Chunk.class, new Mkpo$1(this));
        this.yJLS(EntityType.class, new Mkpo$2(this));
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
        o.v(this, 1783779188, (long)Mkpo.UE());
        int n = 0;
        int n2 = 0;
        GjaJ[] arrgjaJ2 = arrgjaJ;
        int n3 = arrgjaJ2.length;
        int n4 = 0;
        while (n4 < n3) {
            gjaJ = arrgjaJ2[n4];
            if (Mkpo.UE(gjaJ.getType(), Chunk.class) != false) {
                n += Mkpo.UE(gjaJ.IFSe());
            }
            if (Mkpo.UE(gjaJ.getType(), EntityType.class) != false) {
                object = Mkpo.UE(gjaJ.IFSe());
                while (object.hasNext()) {
                    e = object.next();
                    if (!gjaJ.TEqA(e)) continue;
                    ++n2;
                }
            }
            ++n4;
        }
        xynF2.TEqA((String)Mkpo.UE(Mkpo.UE(Mkpo.UE(Mkpo.UE(Mkpo.UE(Mkpo.UE(Mkpo.UE(Mkpo.UE(Mkpo.UE(Mkpo.UE(new StringBuilder((String)Mkpo.UE(Mkpo.UE(mrFx$WjFM.d("\u441e\u6114\ucedb\u81ab\u8759\u06e6\ua974\ua212\uebd9\u3ca2\u6a5d\u8dd0\u21a1\ue042\u67b4\u6f68\u45aa\u6fc8\ua62f\u07ce\u54fc\ud02b\ubb47\uc3e3\uc0c4\u3148\u0b1d\u4ab4\udfa6")))), n2), Mkpo.UE(mrFx$WjFM.d("\u441e\u6114\ucedb\u81ab\u8759\u06e6\ua974\ua212\uebd9\u3ca2\u6a5d\u8dd0\u21a1\ue042\u67b4\u6f68\u45aa\u6fc8\ua62f\u07ce\u54fc\ud02b\ubb43\uc3ef\uc0c6\u314a"))), n2 == 0 || n2 > 1 ? mrFx$WjFM.d("\u440c") : ""), Mkpo.UE(mrFx$WjFM.d("\u441e\u6114\ucedb\u81ab\u8759\u06e6\ua974\ua212\uebd9\u3ca2\u6a5d\u8dd0\u21a1\ue042\u67b4\u6f68\u45aa\u6fc8\ua62f\u07ce\u54fc\ud02b\ubb58\uc3f0"))), n2 == 0 || n2 > 1 ? Mkpo.UE(mrFx$WjFM.d("\u441e\u6114\ucedb\u81ab\u8759\u06e6\ua974\ua212\uebd9\u3ca2\u6a5d\u8dd0\u21a1\ue042\u67b4\u6f68\u45aa\u6fc8\ua62f\u07ce\u54fc\ud02b\ubb52\uc3f8\uc0c2\u3146\u0b00\u4ab3\udfa4\u5d08")) : Mkpo.UE(mrFx$WjFM.d("\u441e\u6114\ucedb\u81ab\u8759\u06e6\ua974\ua212\uebd9\u3ca2\u6a5d\u8dd0\u21a1\ue042\u67b4\u6f68\u45aa\u6fc8\ua62f\u07ce\u54fc\ud02b\ubb52\uc3f8\uc0c2\u3146\u0b00\u4aa3"))), Mkpo.UE(mrFx$WjFM.d("\u441e\u6114\ucedb\u81ab\u8759\u06e6\ua974\ua212\uebd9\u3ca2\u6a5d\u8dd0\u21a1\ue042\u67b4\u6f68\u45aa\u6fc8\ua62f\u07ce\u54fc\ud02b\ubb56\uc3f5\uc0c4\u3140\u0b07\u4aa9"))), Mkpo.UE(n)), Mkpo.UE(mrFx$WjFM.d("\u441e\u6114\ucedb\u81ab\u8759\u06e6\ua974\ua212\uebd9\u3ca2\u6a5d\u8dd0\u21a1\ue042\u67b4\u6f68\u45aa\u6fc8\ua62f\u07ce\u54fc\ud02b\ubb54\uc3fe\uc0c3\u3141\u0b1f"))), n > 1 || n == 0 ? mrFx$WjFM.d("\u440c") : "")));
        arrgjaJ2 = arrgjaJ;
        n3 = arrgjaJ2.length;
        n4 = 0;
        while (n4 < n3) {
            gjaJ = arrgjaJ2[n4];
            if (Mkpo.UE(gjaJ.getType(), Chunk.class) != false) {
                Mkpo.UE(yJSB2, Mkpo.UE(gjaJ.IFSe()));
                object = Mkpo.UE(gjaJ.IFSe());
                while (object.hasNext()) {
                    e = object.next();
                    if (!gjaJ.TEqA(e)) continue;
                    this.UtIU((Chunk)e, new Mkpo$3(this, yJSB5, yJSB2, yJSB3, yJSB4, xynF2), xynF2, arrgjaJ);
                }
            }
            ++n4;
        }
        new Mkpo$4(this, mrFx$WjFM.d("\u440f\u6102\ucedd\u81a5\u8753\u06fa\ua977\ua20f\uebc3\u3cbe\u6a53\u8dc1\u21e3\ue055\u67f7\u6f7f\u45a2\u6fd0\ua62a\u07c9\u54ee\ud066\ubb5c"), 2, xynF2, yJSB3, yJSB4);
    }

    public /* varargs */ void UtIU(Chunk chunk, Runnable runnable, xynF xynF2, GjaJ ... arrgjaJ) {
        boolean bl = false;
        yJSB yJSB2 = new yJSB(0);
        int n = 0;
        while (n < chunk.getEntities().length) {
            block4 : {
                int n2 = n;
                Entity entity = chunk.getEntities()[n];
                GjaJ[] arrgjaJ2 = arrgjaJ;
                int n3 = arrgjaJ2.length;
                int n4 = 0;
                while (n4 < n3) {
                    GjaJ gjaJ = arrgjaJ2[n4];
                    if (Mkpo.UE(gjaJ.getType(), EntityType.class) == false || gjaJ.TEqA((Object)entity.getType())) {
                        ++n4;
                        continue;
                    }
                    break block4;
                }
                bl = true;
                new Mkpo$5(this, entity, yJSB2, n2, chunk, runnable);
            }
            ++n;
        }
        if (!bl) {
            o.v(this, -411545741, (int)Mkpo.UE(yJSB2));
            runnable.run();
        }
    }

    static /* synthetic */ void yJLS(Mkpo mkpo, long l) {
        o.v(mkpo, 1783779188, l);
    }

    static /* synthetic */ int yJLS(Mkpo mkpo) {
        return (Integer)o.a(mkpo, -411545741);
    }

    static /* synthetic */ long UtIU(Mkpo mkpo) {
        return (Long)o.a(mkpo, 1783779188);
    }

    static /* synthetic */ void yJLS(Mkpo mkpo, int n) {
        o.v(mkpo, -411545741, n);
    }

    private static Object UE(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


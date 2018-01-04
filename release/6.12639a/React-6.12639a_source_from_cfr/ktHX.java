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
public class ktHX
extends IFQY {
    public ktHX() {
        super((WOYg)((Object)o.k(-1205320487)));
        this.yJLS((String[])o.k(-1952627496));
        this.yJLS(Chunk.class, new ktHX$1(this));
    }

    @Override
    public /* varargs */ void yJLS(xynF xynF2, GjaJ ... arrgjaJ) {
        int n = 0;
        if (ktHX.ny((JIWX)o.k(-1178188585)) == false) {
            ktHX.ny((JIWX)o.k(-1178188585), xynF2);
            this.wKtV();
            return;
        }
        GjaJ[] arrgjaJ2 = arrgjaJ;
        int n2 = arrgjaJ2.length;
        int n3 = 0;
        while (n3 < n2) {
            GjaJ gjaJ = arrgjaJ2[n3];
            if (ktHX.ny(gjaJ.getType(), Chunk.class) != false) {
                n += ktHX.ny(gjaJ.IFSe());
            }
            ++n3;
        }
        int n4 = n;
        if (ktHX.ny() == false) {
            xynF2.VwLY((String)ktHX.ny(mrFx$WjFM.d("\udd62\u15fb\uf914\u356e\u2da4\u72e8\ufea0\ud849\uf087\uad94\ub639\uc3f4\u0ca7\uedfd\u961b\u63a9\u6cfc\u07f8\uc856\u1089\u75fd\uce17\uacc0\u5751\u13fb\u813b\u0b2e\ua970\u446f\u9744\u0f18\u3297\ua663\uf769\uae8a\u8b02\ucef7\u80a5\udcca\u56da")));
            this.wKtV();
        }
        xynF2.TEqA((String)ktHX.ny(ktHX.ny(ktHX.ny(ktHX.ny(new StringBuilder((String)ktHX.ny(ktHX.ny(mrFx$WjFM.d("\udd62\u15fb\uf914\u356e\u2da4\u72e8\ufea0\ud849\uf087\uad94\ub639\uc3f4\u0ca7\uedfd\u961b\u63a9\u6cfc\u07f8\uc856\u1089\u75e9\uce13\uacc5\u5754\u13b1\u8121\u0b3f\ua975\u4468\u9744")))), ktHX.ny(n)), ktHX.ny(mrFx$WjFM.d("\udd62\u15fb\uf914\u356e\u2da4\u72e8\ufea0\ud849\uf087\uad94\ub639\uc3f4\u0ca7\uedfd\u961b\u63a9\u6cfc\u07f8\uc856\u1089\u75f8\uce1e\uacdc\u5753\u13bd"))), n > 1 || n == 0 ? mrFx$WjFM.d("\udd70") : "")));
        GjaJ[] arrgjaJ3 = arrgjaJ;
        int n5 = arrgjaJ3.length;
        n2 = 0;
        while (n2 < n5) {
            GjaJ gjaJ = arrgjaJ3[n2];
            if (ktHX.ny(gjaJ.getType(), Chunk.class) != false) {
                if (ktHX.ny() != false) {
                    ktHX.ny((Rapb)gjaJ, new ktHX$2(this, xynF2, n4), new ktHX$3(this));
                }
            }
            ++n2;
        }
    }

    private static Object ny(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class NVQY
extends FMkR {
    private OXoN RBAJ = new OXoN(19);
    private ntkx Fyjx;

    public NVQY() {
        this.Fyjx = new NVQY$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)NVQY.fl(nJPf$sILv.G("\u3443\u6c8e\udcf6\u6293\u8ff5\ubf71\ua938\ue6d0\u5cf4\u23f8\u3e01\ua88a\ua3dd\ub6d5\u6da0\u0ff1\u7ef8\uc320\u24f2\u3f66\u4b08\u1211\uc52c\u955a\u3539\u6212\ud490\u762c\u836c\ua3f9\u2321\u9047\uc1ef\u8b62\uc01e\u7cd4")));
        this.setDescription((String)NVQY.fl(nJPf$sILv.G("\u3443\u6c8e\udcf6\u6293\u8ff5\ubf71\ua938\ue6d0\u5cf4\u23f8\u3e01\ua88a\ua3dd\ub6d5\u6da0\u0ff1\u7ef8\uc320\u24f2\u3f66\u4b08\u1211\uc52c\u955a\u3539\u6212\ud490\u762c\u836c\ua3f9\u2321\u9047\uc1ef\u8b61\uc01e\u7cc5\ua59d\u40e3\u7d6b\u0168\u33a9\u72b0\u94ec")));
        this.setID((String)NVQY.fl((biRJ)((Object)o.k(603673300))));
        this.setValue(1.0);
        this.yJLS((psKX)((Object)o.k(568215020)), (psKX)((Object)o.k(568215020)));
        this.UtIU(0);
    }

    @Override
    public void IgvC() {
        NVQY.fl((OXoN)o.a(this, 1243109302), NVQY.fl(this.IVtS()));
        this.setValue((double)NVQY.fl((OXoN)o.a(this, 1243109302)));
    }

    @Override
    public String get() {
        return NVQY.fl(NVQY.fl(NVQY.fl(new StringBuilder((String)NVQY.fl(NVQY.fl(mrFx$WjFM.d("\u422b\uee9b\udb29\u4c5e\u57d6\uaaec\u8fc0\ue666\u802c\uf2b9\u8f9e\ua841\u522a\ua27b\ub75c\u56d7\u6014\u2b12\ufedf\u2355\uc37f\u73f5\u0955\u7e54\uc724\u805a\u4c55\ua90a\uab94\u48d7\u56cb\udb93")))), this.xynF().uVol(this.getValue())), NVQY.fl(mrFx$WjFM.d("\u422b\uee9b\udb29\u4c5e\u57d6\uaaec\u8fc0\ue666\u802c\uf2b9\u8f9e\ua841\u522a\ua27b\ub75c\u56d7\u6014\u2b12\ufedf\u2355\uc37f\u73f5\u0955\u7e54\uc724\u805a\u4c56\ua900"))));
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, -403875916);
    }

    private static Object fl(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


/*
 * Decompiled with CFR 0_123.
 */
import java.io.File;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class MSHX$4
implements oVJh {
    final /* synthetic */ MSHX RsxR;
    private final /* synthetic */ File AYUy;

    MSHX$4(MSHX mSHX, File file) {
        this.RsxR = mSHX;
        this.AYUy = file;
    }

    @Override
    public void yJLS(BuLd buLd, long l, long l2, double d) {
    }

    @Override
    public void yJLS(BuLd buLd, mrHN mrHN2, mrHN mrHN3) {
    }

    @Override
    public void yJLS(BuLd buLd) {
    }

    @Override
    public void UtIU(BuLd buLd) {
        MSHX$4.eT(MSHX$4.eT(MSHX$4.eT(new StringBuilder(FMkR$WjFM.a("\uae41\udb49\u90b7\u640e\u6d8b\u998b\u34db\u4bf5\ubec3\ue71c\ufbad\u2af3\ua89c\uc10d\ue1e1\u289d\u0edd\u82e5\u32fe\ua879\u091b")), ((String[])MSHX$4.eT(MSHX$4.eT((File)o.a(this, -1898096221)), FMkR$WjFM.a("\uae59\udb08")))[0])));
    }

    @Override
    public void biLo(BuLd buLd) {
    }

    private static Object eT(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


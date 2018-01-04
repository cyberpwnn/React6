/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class nJPf
implements xynF {
    @Override
    public void UtIU(String string) {
        nJPf.As(nJPf.As(nJPf.As(new StringBuilder(nJPf$sILv.G("\u0dd0\u2f31\u1671\u30a0\u643c\u3626\u76d4")), string)));
    }

    @Override
    public void biLo(String string) {
        nJPf.As(nJPf.As(nJPf.As(new StringBuilder(FMkR$WjFM.a("\ue85f\uf354\uff52\ud05b\u072a\ua272\u0ee2")), string)));
    }

    @Override
    public void VwLY(String string) {
        nJPf.As(nJPf.As(nJPf.As(new StringBuilder(FMkR$WjFM.a("\ud051\ue5e0\u3879\ub118\ub722\u22fc\ud45a")), string)));
    }

    @Override
    public void TEqA(String string) {
        nJPf.As(nJPf.As(nJPf.As(new StringBuilder(nJPf$sILv.G("\ufe0e\ubbf0\ua1e5\ua94c\ufa33\u0bb1\u44d6")), string)));
    }

    private static Object As(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class UtIU$1
extends CxNA {
    private final /* synthetic */ Rapb Bcie;
    private final /* synthetic */ XAcv SnJT;
    private final /* synthetic */ XAcv Elpk;

    UtIU$1(Rapb rapb, XAcv xAcv, XAcv xAcv2) {
        this.Bcie = rapb;
        this.SnJT = xAcv;
        this.Elpk = xAcv2;
    }

    @Override
    public void run() {
        if (UtIU$1.SI() != false) {
            try {
                Object object = UtIU$1.SI(mrFx$WjFM.d("\u0be0\u43f2\uc306\u8257\u1061\ued80\u384f\ucf87\ua316\u597b\u7ecb\u9b0d\u2e1b\u21a3\ub255\ub99a\uf462\ub634\u3a1f\uabd2\u95e7\u5878\udd11\u0757\u99d5\uecb4"));
                Object object2 = UtIU$1.SI(mrFx$WjFM.d("\u0be0\u43f2\uc306\u8257\u1061\ued80\u384f\ucf87\ua316\u597b\u7ecb\u9b0d\u2e1b\u21a3\ub255\ub99a\uf462\ub634\u3a1f\uabd2\u95c3\u5878\udd15\u074a\u99d5\ueca8\ue459\uaff8\ub5ce\u3be7\uc9da\u9aa9\u33d2\uee21\u970b\u026a\uf7f8\u9a13\u076d\u21ac"));
                Object object3 = UtIU$1.SI(mrFx$WjFM.d("\u0be0\u43f2\uc306\u8257\u1061\ued80\u384f\ucf87\ua316\u597b\u7ecb\u9b0d\u2e1b\u21a3\ub255\ub99a\uf462\ub634\u3a1f\uabd2\u95c3\u5878\udd15\u074a\u99d5\ueca8\ue459\uaff8\ub5df\u3bf7\uc9df\u9aaf\u33d4\uee2b"));
                Object object4 = UtIU$1.SI(mrFx$WjFM.d("\u0be0\u43f2\uc306\u8257\u1070\ued84\u380e\ucfda\ua313\u593c\u7e92\u9b04\u2e08\u21b8\ub254\ub9d1\uf440\ub63c\u3a1c\uab99\u95f0\u584d\udd3b"));
                Object object5 = UtIU$1.SI(object2, new Class[]{object, object});
                Object object6 = UtIU$1.SI(object, new Class[]{(Class)o.k(836130996), (Class)o.k(836130996), (Class)o.k(836130996)});
                Object object7 = UtIU$1.SI(object4, mrFx$WjFM.d("\u0be5\u43f4\uc313\u8235\u107b\ued8c\u381f\ucfca\ua30e\u593b\u7edb"), new Class[]{String.class, object3});
                Integer[] arrinteger = new Integer[1];
                arrinteger[0] = UtIU$1.SI(false);
                Integer[] arrinteger2 = arrinteger;
                Integer[] arrinteger3 = new Integer[1];
                arrinteger3[0] = UtIU$1.SI(false);
                Integer[] arrinteger4 = arrinteger3;
                Object object8 = UtIU$1.SI(UtIU$1.SI(UtIU$1.SI((Rapb)o.a(this, 1006196419))));
                int n = 0;
                Object object9 = UtIU$1.SI(UtIU$1.SI((Rapb)o.a(this, 1006196419)));
                while (object9.hasNext()) {
                    Object e = object9.next();
                    if (UtIU$1.SI((Rapb)o.a(this, 1006196419), e) == false) continue;
                    if (UtIU$1.SI(UtIU$1.SI(0.05)) != false) {
                        n += 2;
                    }
                    new UtIU$1$1(this, mrFx$WjFM.d("\u0be5\u43ec\uc346\u821a\u107a\ued9e\u3819\ucfd5\ua310\u5934\u7ed5\u9b16"), n, e, (Constructor)object6, (Constructor)object5, (Method)object7, arrinteger2, arrinteger4, (XAcv)o.a(this, -2141104463), (Integer)object8);
                }
                new UtIU$1$2(this, mrFx$WjFM.d("\u0be5\u43ec\uc346\u821a\u107a\ued9e\u3819\ucfd5\ua310\u5934\u7ed5\u9b16\u2e44\u21a9\ub258\ub991\uf46f\ub62e\u3a03"), n, (XAcv)o.a(this, -2141104463), (XAcv)o.a(this, -321235280), arrinteger2);
                return;
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                UtIU$1.SI(exception);
                UtIU$1.SI((XAcv)o.a(this, -2141104463), UtIU$1.SI(1.0));
                UtIU$1.SI((XAcv)o.a(this, -321235280), UtIU$1.SI(-1));
                return;
            }
        }
    }

    private static Object SI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


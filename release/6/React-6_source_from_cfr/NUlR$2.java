/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class NUlR$2
extends INmP {
    final /* synthetic */ NUlR xrYE;

    NUlR$2(NUlR nUlR) {
        this.xrYE = nUlR;
    }

    @Override
    public void qdcE() {
        NUlR$2.OQ((NUlR)yy.h(this, 956302768), this.jqQA());
        NUlR$2.OQ((NUlR)yy.h(this, 956302768), this.myyE());
        NUlR$2.OQ(NUlR$2.OQ((NUlR)yy.h(this, 956302768)), NUlR$2.OQ((NUlR)yy.h(this, 956302768)));
        NUlR$2.OQ(NUlR$2.OQ((NUlR)yy.h(this, 956302768)), NUlR$2.OQ((NUlR)yy.h(this, 956302768)));
        NUlR$2.OQ((NUlR)yy.h(this, 956302768), NUlR$2.OQ(NUlR$2.OQ((NUlR)yy.h(this, 956302768))));
        NUlR$2.OQ((NUlR)yy.h(this, 956302768), NUlR$2.OQ(NUlR$2.OQ((NUlR)yy.h(this, 956302768))));
        NUlR$2.OQ((NUlR)yy.h(this, 956302768), NUlR$2.OQ((NUlR)yy.h(this, 956302768)) / 50.0);
        NUlR$2.OQ((NUlR)yy.h(this, 956302768), NUlR$2.OQ((NUlR)yy.h(this, 956302768)) / 50.0);
        NUlR$2.OQ((NUlR)yy.h(this, 956302768), 50.0 - NUlR$2.OQ((NUlR)yy.h(this, 956302768)) < 0.0 ? 0.0 : 50.0 - NUlR$2.OQ((NUlR)yy.h(this, 956302768)));
    }

    private static Object OQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


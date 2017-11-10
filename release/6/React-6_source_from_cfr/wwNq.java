/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@tLIK(value=2)
public class wwNq
extends CLtX {
    private dMNe kJKL = new dMNe(19);

    @Override
    public void pOsy() {
        this.setName(BkvY$LhxG.I("\ufad1\u211a\u7c4b\u212b\u163c\u5ca7\udf60\ua314"));
        this.setDescription(BkvY$LhxG.I("\ufad1\u211a\u7c4b\u212b\u163c\u5ca7\udf6f\ua317\ubd9e\u3139\uc978\u398a\ua076\u5fba\u4b95\uf6f4\ue6bb"));
        this.setID((String)wwNq.On((qSYN)((Object)yy.p(-1588983948))));
        this.setValue(1.0);
        this.mXJp((ydHl)((Object)yy.p(-329382161)), (ydHl)((Object)yy.p(-329382161)));
        this.dMNe(0);
    }

    @Override
    public void qKGr() {
        wwNq.On((dMNe)yy.h(this, 1043196048), wwNq.On(this.JAHk()));
        this.setValue((double)wwNq.On((dMNe)yy.h(this, 1043196048)));
    }

    @Override
    public String get() {
        return wwNq.On(wwNq.On(wwNq.On(new StringBuilder(KDGY$JAHk.Y("\u25eb\u0b38")), wwNq.On((int)this.getValue())), KDGY$JAHk.Y("\u0c35\u0b6b")));
    }

    private static Object On(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


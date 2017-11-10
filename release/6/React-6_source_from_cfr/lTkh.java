/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@tLIK(value=2)
public class lTkh
extends CLtX {
    @Override
    public void pOsy() {
        this.setName(BkvY$LhxG.I("\u8a11\u6c73\u483b\u9607\u5f27\u2cee\u33fb\u4f65"));
        this.setDescription(BkvY$LhxG.I("\u8a00\u6c72\u483b\u960f\u5f3f\u2ca7\u33db\u4f78\ue487\u0d46\u3d20\u9559\u7f12\ucdd4"));
        this.setID((String)lTkh.TG((qSYN)((Object)yy.p(-1372846222))));
        this.setValue(0.0);
        this.mXJp((ydHl)((Object)yy.p(-1388378419)), (ydHl)((Object)yy.p(-1388378419)));
        this.dMNe(1);
    }

    @Override
    public void qKGr() {
        this.setValue((double)lTkh.TG(this.JAHk()));
    }

    @Override
    public String get() {
        return lTkh.TG(lTkh.TG(lTkh.TG(new StringBuilder(), lTkh.TG((int)this.getValue())), BkvY$LhxG.I("\u3a92")));
    }

    private static Object TG(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


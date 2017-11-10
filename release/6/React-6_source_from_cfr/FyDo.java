/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@tLIK(value=2)
public class FyDo
extends CLtX {
    @Override
    public void pOsy() {
        this.setName(NVIs$JbpD.H("\uda0f\u72bc\u5d4f\u791b\u5604\u937f\ufb8a\ucc64\u5cd5\uf300\uf160\u2b01\u7ba4\ue853\u7e43\ue876"));
        this.setDescription(NVIs$JbpD.H("\uda08\u72b4\u5d41\u7900\u561b\u933a\ufba9\ucc21\u5cd3\uf348\uf156\u2b44\u7bb3\ue84c\u7e5e"));
        this.setID((String)FyDo.sS((qSYN)((Object)yy.p(1606551326))));
        this.setValue(20.0);
        this.mXJp((ydHl)((Object)yy.p(1274341524)), (ydHl)((Object)yy.p(1274341524)));
        this.dMNe(1);
    }

    @Override
    public void qKGr() {
        this.setValue((double)FyDo.sS(this.JAHk()));
    }

    @Override
    public String get() {
        if (- this.getValue() > 20.0) {
            return FyDo.sS(FyDo.sS(FyDo.sS(FyDo.sS(FyDo.sS(FyDo.sS(new StringBuilder(), FyDo.sS(FyDo.sS(0.5)) != false ? (ydHl)((Object)yy.p(-278730615)) : (ydHl)((Object)yy.p(-329382161))), BkvY$LhxG.I("\uf55c")), (ydHl)((Object)yy.p(-329382161))), BkvY$LhxG.I("\ud3dc")), FyDo.sS(- this.getValue(), true)));
        }
        return FyDo.sS(FyDo.sS(FyDo.sS(new StringBuilder(), FyDo.sS(this.getValue() > 19.89 ? 20.0 : this.getValue(), false)), BkvY$LhxG.I("\uf2da")));
    }

    private static Object sS(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


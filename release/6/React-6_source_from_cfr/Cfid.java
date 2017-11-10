/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@tLIK(value=2)
public class Cfid
extends CLtX {
    @Override
    public void pOsy() {
        this.setName(NVIs$JbpD.H("\u9e4a\u1daf\ua8d6\u156a\u0ccf\ue69d\u21a4\ub30a\u9fe8"));
        this.setDescription(NVIs$JbpD.H("\u9e4a\u1daf\ua8d6\u156a\u0ccf\ue6bd\u21a4\ub30a\u9fe8\ua0d0\ud06c\ubf7c\ubb35\uf3d1\uee08\u1d60\u4c13\ua468\u56d4\u8188\u1469\ue4fb\ub0fa\u45b8\u9563"));
        this.setID((String)Cfid.ce((qSYN)((Object)yy.p(155911972))));
        this.setValue(1.0);
        this.mXJp((ydHl)((Object)yy.p(1274341524)), (ydHl)((Object)yy.p(1274341524)));
        this.dMNe(1);
    }

    @Override
    public void qKGr() {
        this.setValue((double)Cfid.ce(this.JAHk()));
    }

    @Override
    public String get() {
        return Cfid.ce(Cfid.ce(Cfid.ce(new StringBuilder(), Cfid.ce(this.getValue(), false)), NVIs$JbpD.H("\uf0bf\u30cf\ucbe7\u7610")));
    }

    private static Object ce(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


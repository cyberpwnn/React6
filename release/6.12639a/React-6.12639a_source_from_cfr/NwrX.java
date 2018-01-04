/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class NwrX
extends FMkR {
    private ntkx Fyjx;

    public NwrX() {
        this.Fyjx = new NwrX$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)NwrX.sL(nJPf$sILv.G("\ubca2\u58ca\u37c0\ud2b3\u705e\uca2b\u3120\uc61c\u2e5b\u431c\ua34d\u1738\ue32e\udcb3\ud99f\u6508\u6f2a\u2b03\u608c\uc984\u4497\u6d38\u3b1c\udef0\u410d\ue346\uedd0\u9a57\u2505\u2a1c")));
        this.setDescription((String)NwrX.sL(nJPf$sILv.G("\ubca2\u58ca\u37c0\ud2b3\u705e\uca2b\u3120\uc61c\u2e5b\u431c\ua34d\u1738\ue32e\udcb3\ud99f\u6508\u6f2a\u2b03\u608c\uc984\u4497\u6d38\u3b1c\udef0\u410d\ue346\uedda\u9a53\u251b\u2a1a\u8e63\u180c\u8809\ufec7\u3a93\u6576\u89c1")));
        this.setID((String)NwrX.sL((biRJ)((Object)o.k(1838109434))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(568215020)), (psKX)((Object)o.k(568215020)));
        this.UtIU(5);
    }

    @Override
    public void IgvC() {
        this.setValue((double)NwrX.sL(NwrX.sL((mXRj)o.a((TEqA)o.k(911295720), 878134470))));
    }

    @Override
    public String get() {
        return this.xynF().uVol(this.getValue());
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, -1156884585);
    }

    private static Object sL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


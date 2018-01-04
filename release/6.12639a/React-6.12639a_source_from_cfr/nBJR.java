/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class nBJR
extends FMkR {
    private ntkx Fyjx;

    public nBJR() {
        this.Fyjx = new nBJR$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)nBJR.EX(mrFx$WjFM.d("\u40aa\ue1c7\ud3e1\uc5c4\u93d2\u18a7\ud786\uc835\u53e9\u203a\u82c3\ud819\u3a87\ub85c\u8928\u9bb6\u15d1\u6ceb\u01c7\u4e51\u9161\ua100\u91b6\ue563\u6c15\u06cb\uc24e\u8e90\ud84b\u978b\u18de\uefbe\u6ba3\uf3e9\ufc63\u4477")));
        this.setDescription((String)nBJR.EX(mrFx$WjFM.d("\u40aa\ue1c7\ud3e1\uc5c4\u93d2\u18a7\ud786\uc835\u53e9\u203a\u82c3\ud819\u3a87\ub85c\u8928\u9bb6\u15d1\u6ceb\u01c7\u4e51\u9161\ua100\u91b6\ue563\u6c15\u06cb\uc24e\u8e90\ud84b\u978b\u18de\uefbe\u6ba9\uf3ed\ufc7d\u4471\u301b\u3637\u2b9a\u6e42\ua9d3\u4724\ubed7")));
        this.setID((String)nBJR.EX((biRJ)((Object)o.k(1728991982))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(568215020)), (psKX)((Object)o.k(568215020)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        try {
            this.setValue((double)(nBJR.EX(nBJR.EX((mXRj)o.a((TEqA)o.k(911295720), 878134470))) / 5.0E7));
            return;
        }
        catch (Exception exception) {
            this.setValue(0.0);
            return;
        }
    }

    @Override
    public String get() {
        return nBJR.EX(new StringBuilder((String)nBJR.EX(this.xynF().uVol(this.getValue()))));
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, -221292542);
    }

    private static Object EX(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


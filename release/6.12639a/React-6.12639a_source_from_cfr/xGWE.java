/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@BtuM(value=2)
public class xGWE
extends FMkR {
    private ntkx Fyjx;

    public xGWE() {
        this.Fyjx = new xGWE$1(this);
    }

    @Override
    public void equl() {
        this.setName((String)xGWE.OL(nJPf$sILv.G("\uddca\ud000\u457e\u44b2\ub4ca\ub4d5\u1353\u4253\u4806\u3639\u0daf\u218c\uc4f5\ucce2\u45ef\u03b9\ucd28\uda70\u7145\u4661\u933c\ub709\u9c89\u63be\u0c54\uc690\u5f35\u6a71\u57f3\u9818\u643b\ue105\u1374\ub481\u3425")));
        this.setDescription((String)xGWE.OL(nJPf$sILv.G("\uddca\ud000\u457e\u44b2\ub4ca\ub4d5\u1353\u4253\u4806\u3639\u0daf\u218c\uc4f5\ucce2\u45ef\u03b9\ucd28\uda70\u7145\u4661\u933c\ub709\u9c89\u63be\u0c54\uc690\u5f35\u6a71\u57f3\u9818\u643b\ue10f\u1370\ub49f\u3423\u9304\ub9ff\u91e9\u71f6\uba77\u10a9\u371f")));
        this.setID((String)xGWE.OL((biRJ)((Object)o.k(-1708961034))));
        this.setValue(0.0);
        this.yJLS((psKX)((Object)o.k(568215020)), (psKX)((Object)o.k(568215020)));
        this.UtIU(1);
    }

    @Override
    public void IgvC() {
        try {
            this.setValue((double)(xGWE.OL(xGWE.OL((eilm)o.a((TEqA)o.k(911295720), 180896829))) / 5.0E7));
            return;
        }
        catch (Exception exception) {
            this.setValue(0.0);
            return;
        }
    }

    @Override
    public String get() {
        return xGWE.OL(new StringBuilder((String)xGWE.OL(this.xynF().uVol(this.getValue()))));
    }

    @Override
    public ntkx xynF() {
        return (ntkx)o.a(this, 1300584345);
    }

    private static Object OL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


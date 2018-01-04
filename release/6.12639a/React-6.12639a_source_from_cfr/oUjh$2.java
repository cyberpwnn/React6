/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class oUjh$2
extends xGOy {
    final /* synthetic */ oUjh oqGs;

    oUjh$2(oUjh oUjh2) {
        this.oqGs = oUjh2;
    }

    @Override
    public void run() {
        if (oUjh$2.zI((oUjh)o.a(this, 603543361)) != false) {
            String[] arrstring = new String[2];
            arrstring[0] = oUjh$2.zI(FMkR$WjFM.a("\ud0d5\ubeb6\u910b\u5cc4\u3399\u2781\u9114\u3244\udf07\u7c21\u1763\ua39f\u50cf\ua9d9\uf0e3\u3866\u837c\ue193\u7b76\ud0da\u2439\ubcdc\ue6d2\ue637\ud72a\ua714\uf5c7\u1a80\u36c4\ub68e\ue1ff\uf478\ua6a5\u81c0"));
            arrstring[1] = oUjh$2.zI(FMkR$WjFM.a("\ud0d5\ubeb6\u910b\u5cc4\u3399\u2781\u9114\u3244\udf07\u7c21\u1763\ua39f\u50cf\ua9d9\uf0e3\u3866\u837c\ue193\u7b76\ud0da\u2439\ubcdc\ue6d2\ue62e\ud72a\ua715\uf5c4\u1ad9\u36d8\ub694\ue1fb\uf437\ua6bd\u81cc\u3f0a\u4bbb"));
            oUjh$2.zI((uqOm)o.k(-609594549), new hHgD((vsrN)((Object)o.k(871061494)), arrstring));
            return;
        }
        String[] arrstring = new String[2];
        arrstring[0] = oUjh$2.zI(FMkR$WjFM.a("\ud0d5\ubeb6\u910b\u5cc4\u3399\u2781\u9114\u3244\udf07\u7c21\u1763\ua39f\u50cf\ua9d9\uf0e3\u3866\u837c\ue193\u7b76\ud0da\u2439\ubcdc\ue6d2\ue637\ud72a\ua714\uf5c7\u1ac4\u36d9\ub69d\ue1b3\uf469\ua6bd\u81c4\u3f0b\u4bbc\u7b53"));
        arrstring[1] = oUjh$2.zI(FMkR$WjFM.a("\ud0d5\ubeb6\u910b\u5cc4\u3399\u2781\u9114\u3244\udf07\u7c21\u1763\ua39f\u50cf\ua9d9\uf0e3\u3866\u837c\ue193\u7b76\ud0da\u2439\ubcdc\ue6d2\ue62e\ud72a\ua715\uf5c4\u1ad9\u36d8\ub694\ue1fb\uf437\ua6bd\u81cc\u3f0a\u4bbb"));
        oUjh$2.zI((uqOm)o.k(-609594549), new hHgD((vsrN)((Object)o.k(1411405812)), arrstring));
    }

    private static Object zI(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


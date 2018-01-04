/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

class cBGi$1
extends xGOy {
    final /* synthetic */ cBGi BBrI;

    cBGi$1(cBGi cBGi2) {
        this.BBrI = cBGi2;
    }

    @Override
    public void run() {
        if (cBGi$1.pv((cBGi)o.a(this, 678647777)) != false) {
            String[] arrstring = new String[2];
            arrstring[0] = cBGi$1.pv(FMkR$WjFM.a("\ue51f\uddb2\ud497\u6060\u9114\ub81b\u7d56\u1163\u49dd\uae4a\ubfb2\u8ff8\u575d\ua95a\u11f3\u4b13\u57c2\ub423\u75a5\ueb7a\u346e\u5ead\u8b6e\u4b84\ue873\u1a05\ub01a\u1064\uf788\ue54a\u850c\u6624\ue479"));
            arrstring[1] = cBGi$1.pv(FMkR$WjFM.a("\ue51f\uddb2\ud497\u6060\u9114\ub81b\u7d56\u1163\u49dd\uae4a\ubfb2\u8ff8\u575d\ua95a\u11f3\u4b13\u57c2\ub423\u75a5\ueb7a\u346e\u5ead\u8b60\u4b8f\ue862\u1a1c\ub043\u106e\uf7d1\ue548\u8501\u663d\ue472\ucfa1"));
            cBGi$1.pv((uqOm)o.k(-609594549), new hHgD((vsrN)((Object)o.k(871061494)), arrstring));
            return;
        }
        String[] arrstring = new String[2];
        arrstring[0] = cBGi$1.pv(FMkR$WjFM.a("\ue51f\uddb2\ud497\u6060\u9114\ub81b\u7d56\u1163\u49dd\uae4a\ubfb2\u8ff8\u575d\ua95a\u11f3\u4b13\u57c2\ub423\u75a5\ueb7a\u346e\u5ead\u8b6e\u4b84\ue873\u1a05\ub01a\u1064\uf788\ue54a\u850c\u6624\ue479"));
        arrstring[1] = cBGi$1.pv(FMkR$WjFM.a("\ue51f\uddb2\ud497\u6060\u9114\ub81b\u7d56\u1163\u49dd\uae4a\ubfb2\u8ff8\u575d\ua95a\u11f3\u4b13\u57c2\ub423\u75a5\ueb7a\u346e\u5ead\u8b60\u4b8f\ue862\u1a1c\ub043\u106e\uf7d1\ue548\u8501\u663d\ue472\ucfa1"));
        cBGi$1.pv((uqOm)o.k(-609594549), new hHgD((vsrN)((Object)o.k(1411405812)), arrstring));
    }

    private static Object pv(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


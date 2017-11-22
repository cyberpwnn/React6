/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.entity.Entity
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.entity.Entity;

public class WFtI
extends QVde {
    private boolean rqJg = false;

    public WFtI() {
        super(YEBy$TyVf.W("\ua1b7\u6f1f\u42d0\ubc72\ud90c\u737f\ue4d9\ud32d\u0702\u6f32\u50c5\u0995\u8dc7\u61a1\u2609\ua004\u6df5\u799e\u986d\u496c\u0352"));
    }

    @Override
    public boolean esCa() {
        int n = -1;
        Object object = WFtI.qK(WFtI.qK());
        while (object.hasNext()) {
            Chunk chunk = (Chunk)object.next();
            int n2 = chunk.getEntities().length;
            if (n2 <= n) continue;
            n = n2;
        }
        int n3 = (int)(WFtI.qK((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), WFtI.qK((pqxh)((Object)cv.e(-2043277115)))).getValue() + WFtI.qK((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), WFtI.qK((pqxh)((Object)cv.e(1928990939)))).getValue());
        int n4 = (int)WFtI.qK((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), WFtI.qK((pqxh)((Object)cv.e(-893710179)))).getValue();
        boolean bl = n4 * 3 < n3 && n > 40;
        if (bl != (Boolean)cv.b(this, -1235684401)) {
            cv.e(this, -1235684401, bl);
            if (((Boolean)cv.b(this, -1235684401)).booleanValue()) {
                WFtI.qK((jOKx)cv.e(-1547234860), new OsCE((QyID)((Object)cv.e(871691201)), rgig$AWxc.r("\uc5d4\u6fdf\ua05c\u03a9\u955c\uf7a0\u80b4\ue6c6\u198a\u72c9\u464e\ub319\ua101\ua99d\u3635\u5da3\u95ff\u95a6\u2f2a\u60c8\u10c7\u45e0\ua155\uc6db\u8f21\udd7e"), rgig$AWxc.r("\uc5da\u6fd4\ua04d\u03b0\u9508\uf7b8\u80b4\ue6d6\u1991\u72dd\u4642\ub301")));
            } else {
                WFtI.qK((jOKx)cv.e(-1547234860), new OsCE((QyID)((Object)cv.e(-388566077)), rgig$AWxc.r("\uc5d4\u6fdf\ua05c\u03a9\u955c\uf7a0\u80b4\ue6c6\u198a\u72c9\u464e\ub319\ua101\ua99d\u3635\u5da3\u95ff\u95a6\u2f2a\u60c8\u10c7\u45e0\ua155\uc6db\u8f21\udd7e"), rgig$AWxc.r("\uc5da\u6fd4\ua04d\u03b0\u9508\uf7b8\u80b4\ue6d6\u1991\u72dd\u4642\ub301")));
            }
        }
        return bl;
    }

    @Override
    public void VCsR() {
        Object object;
        if ((Long)cv.e(871764466) % 6 != 0) {
            return;
        }
        Chunk chunk = null;
        int n = -1;
        Object object2 = WFtI.qK(WFtI.qK());
        while (object2.hasNext()) {
            object = (Chunk)object2.next();
            int n2 = object.getEntities().length;
            if (n2 <= n) continue;
            n = n2;
            chunk = object;
        }
        if (chunk != null) {
            object = WFtI.qK((yuFb)cv.b((YoSa)cv.e(239341894), 73011438), (cIji)((Object)cv.e(-2006183655)));
            object2 = new gEYM();
            jyXs jyXs2 = new jyXs();
            WFtI.qK(jyXs2, chunk, 2);
            WFtI.qK((jOKx)cv.e(-1547234860), new OsCE((QyID)((Object)cv.e(-1062341683)), object.getName(), KUXS$dwji.S("\u8735\ud926\u2404\u5b4e\u9ea6\u537b\u7e7d\u89ed\u0783\u8be0\u98ba\u3560\ua735\ueac2\u2506\u97e4\u13b5")));
            WFtI.qK((yuFb)cv.b((YoSa)cv.e(239341894), 73011438), object.vtFs(), object2, new EmKi[]{jyXs2});
        }
    }

    private static Object qK(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;

public class AXWQ
extends QVde {
    private boolean rqJg = false;
    private ktOu<Chunk, Integer> JAcU = new ktOu();

    public AXWQ() {
        super(YEBy$TyVf.W("\u49c9\u982f\uf2fe\uca49\ud5c8\u9834\u6408\u59a5\u16d3\u6ffe\u21e5\u88b8\u6ca4\udaf6\uaee4\ufac4\u7a1e\u7f73\u690f\u4901\u38e6\u200e\uc556"));
    }

    @Override
    public void VCsR() {
        Object object;
        Object object2 = null;
        Object object3 = -1;
        Object object4 = AXWQ.KM(AXWQ.KM(AXWQ.KM((YUgh)cv.b((YoSa)cv.e(239341894), -2047282554))));
        while (object4.hasNext()) {
            object = (Chunk)object4.next();
            if (AXWQ.KM(AXWQ.KM((HKdE)AXWQ.KM(AXWQ.KM((YUgh)cv.b((YoSa)cv.e(239341894), -2047282554)), object)), (NUdB)((Object)cv.e(760942516))) == false) continue;
            Object object5 = AXWQ.KM((Integer)AXWQ.KM(AXWQ.KM((HKdE)AXWQ.KM(AXWQ.KM((YUgh)cv.b((YoSa)cv.e(239341894), -2047282554)), object)), (NUdB)((Object)cv.e(760942516))));
            if (object5 <= object3) continue;
            object3 = object5;
            object2 = object;
        }
        if (object2 != null) {
            object = AXWQ.KM((yuFb)cv.b((YoSa)cv.e(239341894), 73011438), (cIji)((Object)cv.e(-154857164)));
            object4 = new gEYM();
            jyXs jyXs2 = new jyXs();
            AXWQ.KM(jyXs2, object2, 2);
            uWVB uWVB2 = new uWVB();
            AXWQ.KM(uWVB2, AXWQ.KM((long)((double)((long)(AXWQ.KM((ktOu)cv.b(this, -1025051724), object2) != false ? (Object)AXWQ.KM((Integer)AXWQ.KM((ktOu)cv.b(this, -1025051724), object2)) : 1)) * (10000.0 * AXWQ.KM()))));
            AXWQ.KM((ktOu)cv.b(this, -1025051724), object2, AXWQ.KM(AXWQ.KM((ktOu)cv.b(this, -1025051724), object2) != false ? (Object)(AXWQ.KM((Integer)AXWQ.KM((ktOu)cv.b(this, -1025051724), object2)) + 4) : 1));
            AXWQ.KM((yuFb)cv.b((YoSa)cv.e(239341894), 73011438), object.vtFs(), object4, new EmKi[]{jyXs2, uWVB2});
            AXWQ.KM((jOKx)cv.e(-1547234860), new OsCE((QyID)((Object)cv.e(-1062341683)), object.getName(), KUXS$dwji.S("\u57b0\ua8f0\u1bc4\u4e09\u34fc\u9525\ub87f\ucb30\ua51b\u0cd0\u0d14\u7bbd")));
        }
    }

    @Override
    public boolean esCa() {
        boolean bl = false;
        double d = 1000000.0;
        double d2 = AXWQ.KM((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), AXWQ.KM((pqxh)((Object)cv.e(1212616879)))).getValue() * 1000000.0;
        double d3 = AXWQ.KM((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), AXWQ.KM((pqxh)((Object)cv.e(71700647)))).getValue();
        Object object = AXWQ.KM(d2 * 0.36 + 2360000.0, 2000000.0, 3.0E7);
        if (d3 > object && d3 / 1000000.0 - object / 1000000.0 > 1.5) {
            bl = true;
        }
        if (bl != (Boolean)cv.b(this, -1264454729)) {
            cv.e(this, -1264454729, bl);
            if (((Boolean)cv.b(this, -1264454729)).booleanValue()) {
                AXWQ.KM((jOKx)cv.e(-1547234860), new OsCE((QyID)((Object)cv.e(871691201)), KUXS$dwji.S("\ub5fb\u7b58\u8f25\u2efc\uec6e\ud720\u60df\u8fd6\u2901\ub261\ue508\ua83a\uc079\u164c\uea16\uf240\u2ebb\udf9c\u045c\u7d22\u52e4\u03c5\u3bde\u1837\u0ccf\ud94c\u53a4"), KUXS$dwji.S("\ub5e2\u7b58\u8f24\u2eff\uec3a\ud72e\u6091\u8fc0\u2955\ub274\ue503\ua835\uc077")));
            } else {
                AXWQ.KM((jOKx)cv.e(-1547234860), new OsCE((QyID)((Object)cv.e(-388566077)), KUXS$dwji.S("\ub5fb\u7b58\u8f25\u2efc\uec27\ud72f\u6098\u8f85\u2914\ub220\ue519\ua822\uc07d\u160e\uea08\uf240\u2eff\udf9d\u044d\u7d29\u52f9\u03d4\u3b97\u1821\u0cc3\ud90f\u53bb\u9f79\uce29\uca84"), KUXS$dwji.S("\ub5e2\u7b58\u8f24\u2eff\uec3a\ud72e\u6091\u8fc0\u2955\ub274\ue503\ua835\uc077")));
            }
        }
        return bl;
    }

    private static Object KM(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


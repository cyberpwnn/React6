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

public class ntjb
extends QVde {
    private boolean rqJg = false;
    private ktOu<Chunk, Integer> JAcU = new ktOu();

    public ntjb() {
        super(KUXS$dwji.S("\u982b\u62ec\u2c46\ub23b\u9484\ue429\uec72\ue713\u74ee\ue6d2\ub833\uabf2\u26b0\u7113\u3488\uc1f7\u2bc3\ub888\ueac0\ud241\u50db"));
    }

    @Override
    public void VCsR() {
        Object object;
        Object object2 = null;
        Object object3 = -1;
        Object object4 = ntjb.Bp(ntjb.Bp(ntjb.Bp((YUgh)cv.b((YoSa)cv.e(239341894), -2047282554))));
        while (object4.hasNext()) {
            object = (Chunk)object4.next();
            if (ntjb.Bp(ntjb.Bp((HKdE)ntjb.Bp(ntjb.Bp((YUgh)cv.b((YoSa)cv.e(239341894), -2047282554)), object)), (NUdB)((Object)cv.e(-1111289931))) == false) continue;
            Object object5 = ntjb.Bp((Integer)ntjb.Bp(ntjb.Bp((HKdE)ntjb.Bp(ntjb.Bp((YUgh)cv.b((YoSa)cv.e(239341894), -2047282554)), object)), (NUdB)((Object)cv.e(-1111289931))));
            if (object5 <= object3) continue;
            object3 = object5;
            object2 = object;
        }
        if (object2 != null) {
            object = ntjb.Bp((yuFb)cv.b((YoSa)cv.e(239341894), 73011438), (cIji)((Object)cv.e(-1414393524)));
            object4 = new gEYM();
            jyXs jyXs2 = new jyXs();
            ntjb.Bp(jyXs2, object2, 2);
            uWVB uWVB2 = new uWVB();
            ntjb.Bp(uWVB2, ntjb.Bp((long)((double)((long)(ntjb.Bp((ktOu)cv.b(this, -677317685), object2) != false ? (Object)ntjb.Bp((Integer)ntjb.Bp((ktOu)cv.b(this, -677317685), object2)) : 1)) * (10000.0 * ntjb.Bp()))));
            ntjb.Bp((ktOu)cv.b(this, -677317685), object2, ntjb.Bp(ntjb.Bp((ktOu)cv.b(this, -677317685), object2) != false ? (Object)(ntjb.Bp((Integer)ntjb.Bp((ktOu)cv.b(this, -677317685), object2)) + 4) : 1));
            ntjb.Bp((jOKx)cv.e(-1547234860), new OsCE((QyID)((Object)cv.e(-1062341683)), object.getName(), KUXS$dwji.S("\uccd2\uafe4\u7f80\u1754\ucb9b\uddd2\uc919\u2f0a\uaad4\u009d")));
            ntjb.Bp((yuFb)cv.b((YoSa)cv.e(239341894), 73011438), object.vtFs(), object4, new EmKi[]{jyXs2, uWVB2});
        }
    }

    @Override
    public boolean esCa() {
        boolean bl = false;
        double d = 1000000.0;
        double d2 = ntjb.Bp((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), ntjb.Bp((pqxh)((Object)cv.e(1212616879)))).getValue() * 1000000.0;
        double d3 = ntjb.Bp((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), ntjb.Bp((pqxh)((Object)cv.e(951914659)))).getValue();
        Object object = ntjb.Bp(d2 * 0.16 + 2360000.0, 2000000.0, 3.0E7);
        if (d3 > object && d3 / 1000000.0 - object / 1000000.0 > 1.5) {
            bl = true;
        }
        if (bl != (Boolean)cv.b(this, -1060047947)) {
            cv.e(this, -1060047947, bl);
            if (((Boolean)cv.b(this, -1060047947)).booleanValue()) {
                ntjb.Bp((jOKx)cv.e(-1547234860), new OsCE((QyID)((Object)cv.e(871691201)), KUXS$dwji.S("\u7734\u6411\ud816\u0e9b\uc7e2\u4e9b\u9700\u320b\uc662\u753c\u0b2d\u3c0d\u5ffd\u8f46\u0e2a\u8655\ud918\u4909\ufa75\ub68e\u4318\u16c0\u4ffc\u54fd\ue54f"), KUXS$dwji.S("\u7737\u641b\ud803\u0e9b\uc7a7\u4e88\u9700\u320c\uc67f\u753e\u0b24")));
            } else {
                ntjb.Bp((jOKx)cv.e(-1547234860), new OsCE((QyID)((Object)cv.e(-388566077)), KUXS$dwji.S("\u7734\u6411\ud816\u0e9b\uc7ab\u4e94\u9747\u3258\uc677\u757d\u0b3c\u3c15\u5ff9\u8f04\u0e2e\u865f\ud948\u4911\ufa7f\ub68c\u4348\u16d1\u4fe7\u54be\ue550\uf7f2\udc1a\udc79"), KUXS$dwji.S("\u7737\u641b\ud803\u0e9b\uc7a7\u4e88\u9700\u320c\uc67f\u753e\u0b24")));
            }
        }
        return bl;
    }

    private static Object Bp(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


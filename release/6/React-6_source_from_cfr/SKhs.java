/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class SKhs
extends QVde {
    boolean rqJg = false;

    public SKhs() {
        super(rgig$AWxc.r("\ufe93\u7481\u095b\u3f73\u2f68\u9837\uc497\u24b4\ua41e\u5216\udf10\uc58e\u6832\u2969\ub9ef\uea4f\ubd95\ud913"));
    }

    private int UtUW() {
        return (int)((Object)SKhs.fT((SKhs.fT() << 1) + true, 2.0));
    }

    private int DYRf() {
        return this.UtUW() * (SKhs.fT().size() + 1);
    }

    @Override
    public boolean esCa() {
        boolean bl;
        int n = (int)SKhs.fT((uOFv)cv.b((YoSa)cv.e(239341894), -1436020878), SKhs.fT((pqxh)((Object)cv.e(-893710179)))).getValue();
        boolean bl2 = bl = n > this.DYRf();
        if ((Boolean)cv.b(this, 2036790214) != bl) {
            cv.e(this, 2036790214, bl);
            if (((Boolean)cv.b(this, 2036790214)).booleanValue()) {
                SKhs.fT((jOKx)cv.e(-1547234860), new OsCE((QyID)((Object)cv.e(871691201)), KUXS$dwji.S("\u44ba\ua69c\u6a2a\u7e3c\u77da\udc2d\ue1c0\u4db7\u6fc3\ue637\u4406\u0d98\u7c34\u81c1\u5a39\u5028\uc6fb\uca11\u437f\u2d6d\u4e4a\udcff\ua294\ud726\u2735"), KUXS$dwji.S("\u44b2\ua691\u6a3a\u7e22\u7791\udc6c\ue183\u4dab\u6fc2\ue638\u4410")));
            } else {
                SKhs.fT((jOKx)cv.e(-1547234860), new OsCE((QyID)((Object)cv.e(-388566077)), KUXS$dwji.S("\u44ba\ua69c\u6a2a\u7e3c\u77da\udc2d\ue1c0\u4db7\u6fc3\ue637\u4406\u0d98\u7c34\u81c1\u5a39\u5028\uc6fb\uca11\u437f\u2d6d\u4e4a\udcff\ua294\ud726\u2735"), KUXS$dwji.S("\u44b2\ua691\u6a3a\u7e22\u7791\udc6c\ue183\u4dab\u6fc2\ue638\u4410")));
            }
        }
        return bl;
    }

    @Override
    public void VCsR() {
        if ((Long)cv.e(871764466) % 20 == 0) {
            Object object = SKhs.fT((yuFb)cv.b((YoSa)cv.e(239341894), 73011438), (cIji)((Object)cv.e(-1064825111)));
            SKhs.fT((jOKx)cv.e(-1547234860), new OsCE((QyID)((Object)cv.e(-1062341683)), object.getName(), rgig$AWxc.r("\u566f\u52b4\u5a68\u2726\u3cc1\u8e03\u518c\ufd29\uf528\u86fb")));
            SKhs.fT((yuFb)cv.b((YoSa)cv.e(239341894), 73011438), object.vtFs(), new gEYM(), new EmKi[0]);
        }
    }

    private static Object fT(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


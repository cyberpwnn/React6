/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@IWbc(value=2)
public class KvwI
extends VCgr {
    @Override
    public void CMSR() {
        this.setName(rgig$AWxc.r("\u5d20\u00a0\u127b\u06d5\u7665\uba0d\u4c3c\u1bcf\ua7a7\u9b00\u63da\u6023\u6ba9\u60a7\u37bd"));
        this.setDescription(rgig$AWxc.r("\u5d3b\u00ae\u1266\u06d5\u766c\uba1a\u4c6f\u1bbf\ua7aa\u9b1d\u638a\u6007\u6ba5\u60b6\u37f6\ubea6\u6866\u84ef\uecd6\u2a95\u502d\u6d87\ua343\u0ba6\u6f4c\u00eb\ud719\u8939\ue3ad\ub9e8\ubec1"));
        this.setID((String)KvwI.SA((pqxh)((Object)cv.e(701960353))));
        this.setValue(0.0);
        this.ssNb((APKB)((Object)cv.e(-314502936)), (APKB)((Object)cv.e(-314502936)));
        this.DYFV(1);
    }

    @Override
    public void avmQ() {
        try {
            this.setValue((double)KvwI.SA(KvwI.SA((XthG)cv.b((YoSa)cv.e(239341894), 1871515977))));
            return;
        }
        catch (Exception exception) {
            this.setValue(0.0);
            return;
        }
    }

    @Override
    public String get() {
        return KvwI.SA(KvwI.SA(new StringBuilder((String)KvwI.SA(KvwI.SA(this.getValue(), false))), KUXS$dwji.S("\udb40\u86fc")));
    }

    private static Object SA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


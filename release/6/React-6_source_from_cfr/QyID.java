/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class QyID
extends Enum<QyID> {
    public static final /* enum */ QyID wEFA;
    public static final /* enum */ QyID BJoF;
    public static final /* enum */ QyID ggxj;
    private String[] qTTb;
    private static final /* synthetic */ QyID[] PLFM;

    public static QyID[] values() {
        return (QyID[])((QyID[])cv.e(1563947876)).clone();
    }

    public static QyID valueOf(String string) {
        return (QyID)((Object)QyID.AQ(QyID.class, string));
    }

    private /* varargs */ QyID(String ... arrstring) {
        this.qTTb = arrstring;
    }

    public int getSize() {
        return ((String[])cv.b((Object)this, 398193511)).length;
    }

    public int byyi() {
        return (int)((Object)(QyID.AQ() * (double)(this.getSize() - 1)));
    }

    public String ssNb(int n, String[] arrstring) {
        Object object = ((String[])cv.b((Object)this, 398193511))[n];
        int n2 = 0;
        for (String string : arrstring) {
            object = QyID.AQ(object, QyID.AQ(QyID.AQ(new StringBuilder(rgig$AWxc.r("\u9814")), ++n2)), string);
        }
        return object;
    }

    static {
        cv.V(-1062341683, (Object)new QyID(rgig$AWxc.r("\u7edd\u64da\u39b4\ua3f1\uc02d\u6be9\u20a0\u8e53\u599f\uc335\uc4f6\u5e39\ub990\uadfb\u0dc6\uc485\udb86\u15ea\u19af\u1bc2\u35ae\u58e4\udb9d\u0358\ub095\u1e94\ua081\uf63d"), rgig$AWxc.r("\u7edd\u64da\u39b5\ua3bd\uc059\u6bfd\u20b0\u8e48\u5994\uc372\uc4f3\u5e7c\ub9df\uadaf\u0dcf\uc4cc\udb96\u15af\u19e6\u1b80\u35ae\u58f1\udb8d\u030c\ub08f\u1ec1\ua0ca\uf661\u3ce7\ua761\ucc94\ub04b\u9f12\ube0f"), rgig$AWxc.r("\u7edd\u64da\u39b5\ua3bd\uc05e\u6bfb\u20a0\u8e4d\u5996\uc335\uc487\u5e7a\ub9c9\uade6\u0dc7\uc4c2\udbce\u15fb\u19ac\u1b92\u35e8\u58fa\udb8c\u030c\ub0d8\u1e86\ua084\uf678\u3ce7\ua77b\ucc9b\ub04b\u9f12\ube0f")));
        cv.V(871691201, (Object)new QyID(rgig$AWxc.r("\u7edd\u6489\u39f8\ua3ee\uc068\u6bea\u20a4\u8e52\u59da\uc379\uc4ba\u5e63\ub9d5\uadaf\u0ddd\uc4cd\udb8b\u15af\u19b0\u1bd7\u35fc\u58e5\udb91\u035e\ub0dd\u1edd\ua0d7\uf62f\u3ce8\ua76e\ucc9a\ub007\u9f5e\ube50\u6664\u9e7d\ucc88\u0b01\u0ec1\u04c1\udc89"), rgig$AWxc.r("\u7ed8\u6492\u39b7\ua3f6\uc07e\u6baf\u20a5\u8e48\u5991\uc370\uc4f3\u5e7f\ub9d5\uadaf\u0dca\uc4c4\udb80\u15fb\u19e3\u1b97\u35bf"), rgig$AWxc.r("\u7edd\u6489\u39f8\ua3ee\uc068\u6bea\u20a4\u8e52\u59da\uc379\uc4ba\u5e63\ub9d5\uadaf\u0ddd\uc4cd\udb8b\u15af\u19e6\u1b80\u35ae\u58fa\udb87\u030c\ub093\u1edb\ua0d0\uf62f\u3cfd\ua77b\ucc92\ub009\u9f5b\ube5b\u662d")));
        cv.V(-388566077, (Object)new QyID(rgig$AWxc.r("\u7ed8\u6492\u39b7\ua3f6\uc07e\u6baf\u20a5\u8e48\u5991\uc370\uc4f3\u5e7f\ub9d5\uadaf\u0dc8\uc4d7\udb8b\u15af\u19ad\u1bdd\u35f9\u58b3\udbd1\u031d"), rgig$AWxc.r("\u7ec0\u6495\u39bd\ua3bd\uc028\u6bbd\u20e9\u8e4d\u5995\uc37a\uc4b8\u5e7b\ub990\uade8\u0dc6\uc4ca\udb8a\u15af\u19b7\u1bdd\u35ae\u58fe\udb91\u030d")));
        cv.V(1563947876, new QyID[]{(QyID)((Object)cv.e(-1062341683)), (QyID)((Object)cv.e(871691201)), (QyID)((Object)cv.e(-388566077))});
    }

    private static Object AQ(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


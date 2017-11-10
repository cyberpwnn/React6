/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class ogLP
extends Enum<ogLP> {
    public static final /* enum */ ogLP mXvC;
    public static final /* enum */ ogLP DbbT;
    public static final /* enum */ ogLP APiI;
    private static final /* synthetic */ ogLP[] WiyF;

    static {
        yy.K(18417735, (Object)new ogLP(BkvY$LhxG.I("\ud315"), 0));
        yy.K(1608386653, (Object)new ogLP(BkvY$LhxG.I("\ud314"), 1));
        yy.K(684197979, (Object)new ogLP(BkvY$LhxG.I("\ud317"), 2));
        yy.K(-1914828708, new ogLP[]{(ogLP)((Object)yy.p(18417735)), (ogLP)((Object)yy.p(1608386653)), (ogLP)((Object)yy.p(684197979))});
    }

    private ogLP(String string2, int n2) {
    }

    public static ogLP[] values() {
        ogLP[] arrogLP = (ogLP[])yy.p(-1914828708);
        int n = arrogLP.length;
        ogLP[] arrogLP2 = new ogLP[n];
        ogLP.oi(arrogLP, false, arrogLP2, false, n);
        return arrogLP2;
    }

    public static ogLP valueOf(String string) {
        return (ogLP)((Object)ogLP.oi(ogLP.class, string));
    }

    private static Object oi(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


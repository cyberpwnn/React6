/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class DijM
extends Enum<DijM> {
    public static final /* enum */ DijM rgjC;
    public static final /* enum */ DijM IWcn;
    private static final /* synthetic */ DijM[] BdRR;

    public static DijM[] values() {
        return (DijM[])((DijM[])yy.p(-1693841543)).clone();
    }

    public static DijM valueOf(String string) {
        return (DijM)((Object)DijM.GS(DijM.class, string));
    }

    private DijM() {
    }

    static {
        yy.K(-1262745790, (Object)new DijM());
        yy.K(-751310334, (Object)new DijM());
        yy.K(-1693841543, new DijM[]{(DijM)((Object)yy.p(-1262745790)), (DijM)((Object)yy.p(-751310334))});
    }

    private static Object GS(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public final class cIji
extends Enum<cIji> {
    public static final /* enum */ cIji kQsA;
    public static final /* enum */ cIji WaKm;
    public static final /* enum */ cIji UARh;
    public static final /* enum */ cIji KUXS;
    public static final /* enum */ cIji FMwy;
    public static final /* enum */ cIji IWbc;
    public static final /* enum */ cIji gVhV;
    private String name;
    private String description;
    private rwyd dfmS;
    private rMgK WaHe;
    private static final /* synthetic */ cIji[] mrKm;

    public static cIji[] values() {
        return (cIji[])((cIji[])cv.e(772673427)).clone();
    }

    public static cIji valueOf(String string) {
        return (cIji)((Object)cIji.bd(cIji.class, string));
    }

    private cIji(rwyd rwyd2, rMgK rMgK2, String string2, String string3) {
        this.name = string2;
        this.description = string3;
        this.dfmS = rwyd2;
        this.WaHe = rMgK2;
    }

    public String getName() {
        return (String)cv.b((Object)this, 604901266);
    }

    public String getDescription() {
        return (String)cv.b((Object)this, -497807459);
    }

    public rwyd ykmX() {
        return (rwyd)((Object)cv.b((Object)this, -1992552548));
    }

    public rMgK nJLQ() {
        return (rMgK)((Object)cv.b((Object)this, 371330975));
    }

    static {
        cv.V(1297813770, (Object)new cIji((rwyd)((Object)cv.e(324276116)), (rMgK)((Object)cv.e(1552289681)), (String)cv.e(-2075979874), (String)cv.e(1227755417)));
        cv.V(-1414393524, (Object)new cIji((rwyd)((Object)cv.e(324276116)), (rMgK)((Object)cv.e(1552289681)), (String)cv.e(-1586098216), (String)cv.e(-1906503717)));
        cv.V(-1511452938, (Object)new cIji((rwyd)((Object)cv.e(324276116)), (rMgK)((Object)cv.e(1552289681)), (String)cv.e(1687752666), (String)cv.e(1239486405)));
        cv.V(-154857164, (Object)new cIji((rwyd)((Object)cv.e(324276116)), (rMgK)((Object)cv.e(1552289681)), (String)cv.e(827396036), (String)cv.e(-1057681465)));
        cv.V(-2006183655, (Object)new cIji((rwyd)((Object)cv.e(324276116)), (rMgK)((Object)cv.e(1552289681)), (String)cv.e(-790032442), (String)cv.e(2007306177)));
        cv.V(423694606, (Object)new cIji((rwyd)((Object)cv.e(324276116)), (rMgK)((Object)cv.e(1552289681)), (String)cv.e(1913917376), (String)cv.e(-797175869)));
        cv.V(-1064825111, (Object)new cIji((rwyd)((Object)cv.e(324276116)), (rMgK)((Object)cv.e(1552289681)), (String)cv.e(-1156051006), (String)cv.e(-1716514867)));
        cv.V(772673427, new cIji[]{(cIji)((Object)cv.e(1297813770)), (cIji)((Object)cv.e(-1414393524)), (cIji)((Object)cv.e(-1511452938)), (cIji)((Object)cv.e(-154857164)), (cIji)((Object)cv.e(-2006183655)), (cIji)((Object)cv.e(423694606)), (cIji)((Object)cv.e(-1064825111))});
    }

    private static Object bd(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


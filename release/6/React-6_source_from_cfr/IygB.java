/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class IygB {
    public static String repeat(String string, int n) {
        return IygB.gm(string, n);
    }

    public static wfPa<String> jhSt(String string, int n) {
        Object object = IygB.gm(string);
        wfPa<String> wfPa2 = new wfPa<String>();
        String[] arrstring = (String[])IygB.gm(IygB.gm(string, n), rgig$AWxc.r("\u08bf"));
        int n2 = arrstring.length;
        int n3 = 0;
        while (n3 < n2) {
            String string2 = arrstring[n3];
            IygB.gm(wfPa2, IygB.gm(IygB.gm(IygB.gm(new StringBuilder((String)IygB.gm(object)), IygB.gm(string2)), IygB.gm(string2))));
            ++n3;
        }
        return wfPa2;
    }

    public static String ssNb(APKB aPKB, APKB aPKB2, APKB aPKB3, APKB aPKB4, String string) {
        return IygB.gm(IygB.gm(IygB.gm(IygB.gm(IygB.gm(IygB.gm(IygB.gm(IygB.gm(IygB.gm(IygB.gm(new StringBuilder(), aPKB), rgig$AWxc.r("\ud40e")), aPKB2), string), aPKB), rgig$AWxc.r("\ud408")), aPKB3), rgig$AWxc.r("\ud46f\u35ea")), aPKB4));
    }

    public static String ssNb(APKB aPKB, APKB aPKB2, APKB aPKB3, String string) {
        return IygB.gm(IygB.gm(IygB.gm(IygB.gm(IygB.gm(IygB.gm(IygB.gm(IygB.gm(new StringBuilder(), aPKB), YEBy$TyVf.W("\u52d4")), aPKB2), string), aPKB), YEBy$TyVf.W("\u52d2\u8466\uce82")), aPKB3));
    }

    public static String ssNb(APKB aPKB, int n) {
        return IygB.gm(IygB.gm(IygB.gm(IygB.gm(new StringBuilder(), aPKB), (APKB)((Object)cv.e(-1538722743))), IygB.repeat(YEBy$TyVf.W("\u52af"), n)));
    }

    public static String DYFV(APKB aPKB, int n) {
        return IygB.gm(IygB.gm(IygB.gm(IygB.gm(new StringBuilder(), aPKB), (APKB)((Object)cv.e(-1538722743))), IygB.repeat(rgig$AWxc.r("\u3da0"), n)));
    }

    public static String ssNb(APKB aPKB, int object, double d, String string, String string2, String string3) {
        Object object2 = IygB.gm(IygB.gm(IygB.gm(IygB.gm(new StringBuilder(), aPKB), (APKB)((Object)cv.e(223736904))), string));
        object = object < IygB.gm(string) + IygB.gm(string3) + IygB.gm(string2) ? (Object)(IygB.gm(string) + IygB.gm(string3) + IygB.gm(string2) + 6) : object;
        int n = object - (IygB.gm(string) + IygB.gm(string3) + IygB.gm(string2));
        int n2 = (int)((double)n * d);
        int n3 = object - n2;
        if (d == 0.0) {
            return IygB.gm(IygB.gm(IygB.gm(IygB.gm(IygB.gm(IygB.gm(IygB.gm(new StringBuilder((String)IygB.gm(object2)), (APKB)((Object)cv.e(416543530))), (APKB)((Object)cv.e(223736904))), IygB.gm(rgig$AWxc.r("\ud475"), n3)), (APKB)((Object)cv.e(416543530))), (APKB)((Object)cv.e(223736904))), string3));
        }
        return IygB.gm(IygB.gm(IygB.gm(new StringBuilder((String)IygB.gm(object2)), IygB.gm(rgig$AWxc.r("\ud475"), n2)), d == 1.0 ? string3 : IygB.gm(IygB.gm(IygB.gm(IygB.gm(IygB.gm(IygB.gm(IygB.gm(new StringBuilder((String)IygB.gm(string2)), (APKB)((Object)cv.e(416543530))), (APKB)((Object)cv.e(223736904))), IygB.gm(rgig$AWxc.r("\ud475"), n3)), (APKB)((Object)cv.e(416543530))), (APKB)((Object)cv.e(223736904))), string3))));
    }

    private static Object gm(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


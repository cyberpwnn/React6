/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.HashMap;

public class GkIA
extends FouE {
    public static final HashMap<String, Character> mjHs;

    public GkIA(String string) {
        super(string);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String sPsW() throws TOKE {
        var3_1 = new StringBuilder();
        do lbl-1000: // 5 sources:
        {
            var1_2 = this.next();
            if (this.MAeq()) {
                throw this.aLYV(rgig$AWxc.r("\u4d9a\ued89\uef3b\u575d\u988d\u2e56\u8024\u5db2\u8195\u0f01\ueb5c\uc3ea\ucebc\u40b0"));
            }
            GkIA.wg(var3_1, var1_2);
            var2_3 = GkIA.wg(var3_1) - 3;
            if (var2_3 < 0) ** GOTO lbl-1000
            if (GkIA.wg(var3_1, var2_3) != 93) ** GOTO lbl-1000
            if (GkIA.wg(var3_1, var2_3 + true) != 93) ** GOTO lbl-1000
        } while (GkIA.wg(var3_1, var2_3 + 2) != 62);
        GkIA.wg(var3_1, var2_3);
        return GkIA.wg(var3_1);
    }

    public Object tLFo() throws TOKE {
        char c;
        do {
            c = this.next();
        } while (GkIA.wg(c) != false);
        if (c == '\u0000') {
            return null;
        }
        if (c == '<') {
            return (Character)cv.e(-490538795);
        }
        StringBuilder stringBuilder = new StringBuilder();
        do {
            if (c == '<' || c == '\u0000') {
                this.yReg();
                return GkIA.wg(GkIA.wg(stringBuilder));
            }
            if (c == '&') {
                GkIA.wg(stringBuilder, this.BkpW(c));
            } else {
                GkIA.wg(stringBuilder, c);
            }
            c = this.next();
        } while (true);
    }

    public Object BkpW(char c) throws TOKE {
        char c2;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            c2 = this.next();
            if (GkIA.wg(c2) == false && c2 != '#') break;
            GkIA.wg(stringBuilder, GkIA.wg(c2));
        } while (true);
        if (c2 != ';') {
            throw this.aLYV((String)GkIA.wg(GkIA.wg(new StringBuilder(YEBy$TyVf.W("\uef42\u1478\ubf48\ubafa\u2fef\ue439\uc3bd\ufeb1\u0c62\u6de3\ud0a6\u144c\ub0a5\u4955\uc3be\ude4f\u82ba\u4e2d\u3075\ud812\uc7df\u2f21\u8671\uf0d5\u331f\u8e4d\ud888\u3b7d")), stringBuilder)));
        }
        Object object = GkIA.wg(stringBuilder);
        Object object2 = GkIA.wg((HashMap)cv.e(288029144), object);
        if (object2 != null) {
            return object2;
        }
        return GkIA.wg(GkIA.wg(GkIA.wg(GkIA.wg(new StringBuilder(), c), object), YEBy$TyVf.W("\uef34")));
    }

    public Object eHME() throws TOKE {
        char c;
        do {
            c = this.next();
        } while (GkIA.wg(c) != false);
        switch (c) {
            case '\u0000': {
                throw this.aLYV(rgig$AWxc.r("\u6824\uceb0\u01cd\ua943\u26a0\ue42c\u9522\u91a7\ub963\ud276\uace6\u7107\u7f2b\ua067\u3346\ua051\u04f7\u78a0"));
            }
            case '<': {
                return (Character)cv.e(-490538795);
            }
            case '>': {
                return (Character)cv.e(-2091321130);
            }
            case '/': {
                return (Character)cv.e(-588646185);
            }
            case '=': {
                return (Character)cv.e(1041299678);
            }
            case '!': {
                return (Character)cv.e(1168177361);
            }
            case '?': {
                return (Character)cv.e(-1596458785);
            }
            case '\"': 
            case '\'': {
                char c2 = c;
                do {
                    if ((c = this.next()) != '\u0000') continue;
                    throw this.aLYV(rgig$AWxc.r("\u683c\uceb7\u01ca\ua955\u26ba\ue420\u953b\u91ac\ub966\ud222\uacee\u7106\u7f7f\ua075\u3312\ua057\u04ff\u78a9\u3e34"));
                } while (c != c2);
                return (Boolean)cv.e(-811926723);
            }
        }
        do {
            c = this.next();
            if (GkIA.wg(c) != false) {
                return (Boolean)cv.e(-811926723);
            }
            switch (c) {
                case '\u0000': 
                case '!': 
                case '\"': 
                case '\'': 
                case '/': 
                case '<': 
                case '=': 
                case '>': 
                case '?': {
                    this.yReg();
                    return (Boolean)cv.e(-811926723);
                }
            }
        } while (true);
    }

    public Object mXSo() throws TOKE {
        char c;
        do {
            c = this.next();
        } while (GkIA.wg(c) != false);
        switch (c) {
            case '\u0000': {
                throw this.aLYV(rgig$AWxc.r("\u5009\u6950\u50bc\u5b06\uab99\ue94e\uc329\uab45\ub778\u81b8\u07cd\u16f6\u4c91\u6f07\u5d97\uc026\u401b"));
            }
            case '<': {
                throw this.aLYV(rgig$AWxc.r("\u5009\u6950\u50bc\u5b05\uab9d\ue94e\uc33a\uab45\ub778\u81b8\u078f\u16a6\u4cd3"));
            }
            case '>': {
                return (Character)cv.e(-2091321130);
            }
            case '/': {
                return (Character)cv.e(-588646185);
            }
            case '=': {
                return (Character)cv.e(1041299678);
            }
            case '!': {
                return (Character)cv.e(1168177361);
            }
            case '?': {
                return (Character)cv.e(-1596458785);
            }
            case '\"': 
            case '\'': {
                char c2 = c;
                StringBuilder stringBuilder = new StringBuilder();
                do {
                    if ((c = this.next()) == '\u0000') {
                        throw this.aLYV(rgig$AWxc.r("\u5011\u6957\u50bb\u5b10\uab83\ue942\uc330\uab4e\ub77d\u81ec\u07cd\u16fe\u4cd4\u6f19\u5d86\uc03a\u4006\u7631\u9739"));
                    }
                    if (c == c2) {
                        return GkIA.wg(stringBuilder);
                    }
                    if (c == '&') {
                        GkIA.wg(stringBuilder, this.BkpW(c));
                        continue;
                    }
                    GkIA.wg(stringBuilder, c);
                } while (true);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        do {
            GkIA.wg(stringBuilder, c);
            c = this.next();
            if (GkIA.wg(c) != false) {
                return GkIA.wg(stringBuilder);
            }
            switch (c) {
                case '\u0000': {
                    return GkIA.wg(stringBuilder);
                }
                case '!': 
                case '/': 
                case '=': 
                case '>': 
                case '?': 
                case '[': 
                case ']': {
                    this.yReg();
                    return GkIA.wg(stringBuilder);
                }
                case '\"': 
                case '\'': 
                case '<': {
                    throw this.aLYV(rgig$AWxc.r("\u5006\u6958\u50ab\u5b55\uab92\ue947\uc338\uab52\ub77d\u81fb\u07dc\u16ff\u4c86\u6f4a\u5d9b\uc026\u404f\u763e\u977e\uc971\u1845\uc540\ua336"));
                }
            }
        } while (true);
    }

    public boolean KwOT(String string) throws TOKE {
        char c;
        int n;
        int n2 = 0;
        Object object = GkIA.wg(string);
        char[] arrc = new char[object];
        for (n = 0; n < object; ++n) {
            c = this.next();
            if (c == '\u0000') {
                return false;
            }
            arrc[n] = c;
        }
        do {
            int n3 = n2;
            boolean bl = true;
            for (n = 0; n < object; ++n) {
                if (arrc[n3] != GkIA.wg(string, n)) {
                    bl = false;
                    break;
                }
                if (++n3 < object) continue;
                n3 -= object;
            }
            if (bl) {
                return true;
            }
            c = this.next();
            if (c == '\u0000') {
                return false;
            }
            arrc[n2] = c;
            if (++n2 < object) continue;
            n2 -= object;
        } while (true);
    }

    static {
        HashMap hashMap = new HashMap(8);
        cv.V(288029144, hashMap);
        GkIA.wg(hashMap, KUXS$dwji.S("\u5cc2\u2a32\uc184"), (Character)cv.e(-291898989));
        GkIA.wg((HashMap)cv.e(288029144), KUXS$dwji.S("\u5cc2\u2a2f\uc19b\u1044"), (Character)cv.e(1183119762));
        GkIA.wg((HashMap)cv.e(288029144), KUXS$dwji.S("\u5cc4\u2a2b"), (Character)cv.e(-2091321130));
        GkIA.wg((HashMap)cv.e(288029144), KUXS$dwji.S("\u5ccf\u2a2b"), (Character)cv.e(-490538795));
        GkIA.wg((HashMap)cv.e(288029144), KUXS$dwji.S("\u5cd2\u2a2a\uc19b\u1043"), (Character)cv.e(592837021));
    }

    private static Object wg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.HashMap;

public class jEqq
extends RjaO {
    public static final HashMap<String, Character> LFlN;

    public jEqq(String string) {
        super(string);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String Ahqh() throws Bkpl {
        var3_1 = new StringBuilder();
        do lbl-1000: // 5 sources:
        {
            var1_2 = this.next();
            if (this.BIor()) {
                throw this.ePQp(NVIs$JbpD.H("\ud33a\u627f\u79a4\u26fc\u4c33\u1a7f\ub4d4\u1110\u0674\ub38a\u37d2\u99e4\u74a3\u3ef9"));
            }
            jEqq.ON(var3_1, var1_2);
            var2_3 = jEqq.ON(var3_1) - 3;
            if (var2_3 < 0) ** GOTO lbl-1000
            if (jEqq.ON(var3_1, var2_3) != 93) ** GOTO lbl-1000
            if (jEqq.ON(var3_1, var2_3 + true) != 93) ** GOTO lbl-1000
        } while (jEqq.ON(var3_1, var2_3 + 2) != 62);
        jEqq.ON(var3_1, var2_3);
        return jEqq.ON(var3_1);
    }

    public Object WFnH() throws Bkpl {
        char c;
        do {
            c = this.next();
        } while (jEqq.ON(c) != false);
        if (c == '\u0000') {
            return null;
        }
        if (c == '<') {
            return (Character)yy.p(-1679098088);
        }
        StringBuilder stringBuilder = new StringBuilder();
        do {
            if (c == '<' || c == '\u0000') {
                this.VfLY();
                return jEqq.ON(jEqq.ON(stringBuilder));
            }
            if (c == '&') {
                jEqq.ON(stringBuilder, this.halY(c));
            } else {
                jEqq.ON(stringBuilder, c);
            }
            c = this.next();
        } while (true);
    }

    public Object halY(char c) throws Bkpl {
        char c2;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            c2 = this.next();
            if (jEqq.ON(c2) == false && c2 != '#') break;
            jEqq.ON(stringBuilder, jEqq.ON(c2));
        } while (true);
        if (c2 != ';') {
            throw this.ePQp((String)jEqq.ON(jEqq.ON(new StringBuilder(NVIs$JbpD.H("\uae8f\u9b00\udc51\u8efb\u3046\uec23\u6db3\u063e\ufcc5\u2131\u4263\ua979\u79bc\uc8bb\uf5eb\uc80b\ue169\u0b2d\uc47d\uc89f\ub905\uf60c\ub020\u3027\u28d5\uc2e9\u29c9\u6f2b")), stringBuilder)));
        }
        Object object = jEqq.ON(stringBuilder);
        Object object2 = jEqq.ON((HashMap)yy.p(-195231896), object);
        if (object2 != null) {
            return object2;
        }
        return jEqq.ON(jEqq.ON(jEqq.ON(jEqq.ON(new StringBuilder(), c), object), NVIs$JbpD.H("\uaef9")));
    }

    public Object AXPu() throws Bkpl {
        char c;
        do {
            c = this.next();
        } while (jEqq.ON(c) != false);
        switch (c) {
            case '\u0000': {
                throw this.ePQp(BkvY$LhxG.I("\ub188\ud164\ucaa7\u7713\u00d7\u8541\uc3ce\u4690\ud988\ufb3a\ufb3a\u6284\ue365\ucf5c\uec74\uc8ef\u3630\u8f6e"));
            }
            case '<': {
                return (Character)yy.p(-1679098088);
            }
            case '>': {
                return (Character)yy.p(954466283);
            }
            case '/': {
                return (Character)yy.p(-1980170266);
            }
            case '=': {
                return (Character)yy.p(-1870463180);
            }
            case '!': {
                return (Character)yy.p(622985196);
            }
            case '?': {
                return (Character)yy.p(-824115405);
            }
            case '\"': 
            case '\'': {
                char c2 = c;
                do {
                    if ((c = this.next()) != '\u0000') continue;
                    throw this.ePQp(BkvY$LhxG.I("\ub190\ud163\ucaa0\u7705\u00cd\u854d\uc3d7\u469b\ud98d\ufb6e\ufb32\u6285\ue331\ucf4e\uec20\uc8e9\u3638\u8f67\u2813"));
                } while (c != c2);
                return (Boolean)yy.p(-203750976);
            }
        }
        do {
            c = this.next();
            if (jEqq.ON(c) != false) {
                return (Boolean)yy.p(-203750976);
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
                    this.VfLY();
                    return (Boolean)yy.p(-203750976);
                }
            }
        } while (true);
    }

    public Object XktK() throws Bkpl {
        char c;
        do {
            c = this.next();
        } while (jEqq.ON(c) != false);
        switch (c) {
            case '\u0000': {
                throw this.ePQp(KDGY$JAHk.Y("\u7d18\ud0cd\u7ea7\u19b5\u2611\u35ba\u38ef\u7d7b\ub5b9\u6b9b\u78a1\u16c7\uc2db\uba64\ue3c9\u8e63\u08d6"));
            }
            case '<': {
                throw this.ePQp(KDGY$JAHk.Y("\u7d18\ud0cd\u7ea7\u19b6\u2615\u35ba\u38fc\u7d7b\ub5b9\u6b9b\u78e3\u1697\uc299"));
            }
            case '>': {
                return (Character)yy.p(954466283);
            }
            case '/': {
                return (Character)yy.p(-1980170266);
            }
            case '=': {
                return (Character)yy.p(-1870463180);
            }
            case '!': {
                return (Character)yy.p(622985196);
            }
            case '?': {
                return (Character)yy.p(-824115405);
            }
            case '\"': 
            case '\'': {
                char c2 = c;
                StringBuilder stringBuilder = new StringBuilder();
                do {
                    if ((c = this.next()) == '\u0000') {
                        throw this.ePQp(KDGY$JAHk.Y("\u7d00\ud0ca\u7ea0\u19a3\u260b\u35b6\u38f6\u7d70\ub5bc\u6bcf\u78a1\u16cf\uc29e\uba7a\ue3d8\u8e7f\u08cb\u610c\ud893"));
                    }
                    if (c == c2) {
                        return jEqq.ON(stringBuilder);
                    }
                    if (c == '&') {
                        jEqq.ON(stringBuilder, this.halY(c));
                        continue;
                    }
                    jEqq.ON(stringBuilder, c);
                } while (true);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        do {
            jEqq.ON(stringBuilder, c);
            c = this.next();
            if (jEqq.ON(c) != false) {
                return jEqq.ON(stringBuilder);
            }
            switch (c) {
                case '\u0000': {
                    return jEqq.ON(stringBuilder);
                }
                case '!': 
                case '/': 
                case '=': 
                case '>': 
                case '?': 
                case '[': 
                case ']': {
                    this.VfLY();
                    return jEqq.ON(stringBuilder);
                }
                case '\"': 
                case '\'': 
                case '<': {
                    throw this.ePQp(KDGY$JAHk.Y("\u7d17\ud0c5\u7eb0\u19e6\u261a\u35b3\u38fe\u7d6c\ub5bc\u6bd8\u78b0\u16ce\uc2cc\uba29\ue3c5\u8e63\u0882\u6103\ud8d4\u63a1\u7c4c\uf453\u09f7"));
                }
            }
        } while (true);
    }

    public boolean eYCP(String string) throws Bkpl {
        char c;
        int n;
        int n2 = 0;
        Object object = jEqq.ON(string);
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
                if (arrc[n3] != jEqq.ON(string, n)) {
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
        yy.K(-195231896, hashMap);
        jEqq.ON(hashMap, NVIs$JbpD.H("\uc9ee\uead6\u8842"), (Character)yy.p(754843509));
        jEqq.ON((HashMap)yy.p(-195231896), NVIs$JbpD.H("\uc9ee\ueacb\u885d\uedba"), (Character)yy.p(-82837650));
        jEqq.ON((HashMap)yy.p(-195231896), NVIs$JbpD.H("\uc9e8\ueacf"), (Character)yy.p(954466283));
        jEqq.ON((HashMap)yy.p(-195231896), NVIs$JbpD.H("\uc9e3\ueacf"), (Character)yy.p(-1679098088));
        jEqq.ON((HashMap)yy.p(-195231896), NVIs$JbpD.H("\uc9fe\ueace\u885d\uedbd"), (Character)yy.p(888471411));
    }

    private static Object ON(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


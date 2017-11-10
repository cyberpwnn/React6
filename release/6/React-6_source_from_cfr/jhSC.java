/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class jhSC {
    private final Map<String, Object> map = new HashMap<String, Object>();
    public static final Object TEsR;

    public jhSC() {
    }

    public jhSC(jhSC jhSC2, String[] arrstring) {
        this();
        for (int i = 0; i < arrstring.length; ++i) {
            try {
                this.SnBs(arrstring[i], jhSC2.gUxV(arrstring[i]));
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public jhSC(RjaO rjaO) throws Bkpl {
        this();
        if (jhSC.Ou(rjaO) != 123) {
            throw jhSC.Ou(rjaO, KDGY$JAHk.Y("\uf0d5\u55a0\uae5c\u5647\u75c2\ud4dc\uae39\u82f3\u33b1\ub64a\u0910\u6eea\u82bc\u2c7c\u14af\ua5ff\u58ae\uc0b4\u1f25\uff32\uc291\u89dc\u2210\u55eb\ud096\u62e3\u25a9\uc21d\u38af\ube73\u12c4\u3244\ud895\u15d9\u80a7\u5f01\u9a23"));
        }
        block8 : do {
            Object object = jhSC.Ou(rjaO);
            switch (object) {
                case 0: {
                    throw jhSC.Ou(rjaO, KDGY$JAHk.Y("\uf0d5\u55a0\uae5c\u5647\u75c2\ud4dc\uae39\u82f3\u33b1\ub64a\u0910\u6eea\u82bc\u2c7c\u14af\ua5ff\u58ae\uc0b4\u1f25\uff32\uc291\u89dc\u2210\u55ec\ud09d\u62e0\u25e0\uc204\u38e6\ube70\u12c5\u3210\ud8da\u1584\u80a7"));
                }
                case 125: {
                    return;
                }
            }
            jhSC.Ou(rjaO);
            Object object2 = jhSC.Ou(jhSC.Ou(rjaO));
            object = jhSC.Ou(rjaO);
            if (object != 58) {
                throw jhSC.Ou(rjaO, KDGY$JAHk.Y("\uf0d1\u55f8\uae66\u5671\u75ee\ud4e6\uae13\u82f5\u33fb\ub64e\u0953\u6eb9\u82a6\u2c2f\u14ea\ua5e6\u58bc\uc0e0\u1f2d\uff35\uc2c2\u89c9\u2210\u55e2\ud096\u62fd"));
            }
            this.SnBs((String)object2, jhSC.Ou(rjaO));
            switch (jhSC.Ou(rjaO)) {
                case 44: 
                case 59: {
                    if (jhSC.Ou(rjaO) == 125) {
                        return;
                    }
                    jhSC.Ou(rjaO);
                    continue block8;
                }
                case 125: {
                    return;
                }
            }
            break;
        } while (true);
        throw jhSC.Ou(rjaO, KDGY$JAHk.Y("\uf0d1\u55f8\uae66\u5671\u75ee\ud4e6\uae13\u82f5\u33fb\ub64e\u0953\u6eb9\u82b0\u2c2f\u14ea\ua5e8\u58a8\uc0b4\u1f6f\uff3a\uc2c5"));
    }

    public jhSC(Map<String, Object> map) {
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Object object = entry.getValue();
                if (object == null) continue;
                ((Map)yy.h(this, 2034827013)).put(entry.getKey(), jhSC.wrap(object));
            }
        }
    }

    public jhSC(Object object) {
        this();
        this.qArm(object);
    }

    public jhSC(Object object, String[] arrstring) {
        this();
        Object object2 = jhSC.Ou(object);
        for (int i = 0; i < arrstring.length; ++i) {
            String string = arrstring[i];
            try {
                this.qdWJ(string, jhSC.Ou(jhSC.Ou(object2, string), object));
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public jhSC(String string) throws Bkpl {
        this(new RjaO(string));
    }

    public jhSC(String string, Locale locale) throws Bkpl {
        this();
        Object object = jhSC.Ou(string, locale, jhSC.Ou(jhSC.Ou()));
        Object object2 = jhSC.Ou(object);
        while (object2.hasMoreElements()) {
            Object e = object2.nextElement();
            if (e == null) continue;
            String[] arrstring = (String[])jhSC.Ou((String)e, NVIs$JbpD.H("\uab30\uc6cd"));
            int n = arrstring.length - 1;
            jhSC jhSC2 = this;
            for (int i = 0; i < n; ++i) {
                String string2 = arrstring[i];
                jhSC jhSC3 = jhSC2.SnAm(string2);
                if (jhSC3 == null) {
                    jhSC3 = new jhSC();
                    jhSC2.yJLL(string2, jhSC3);
                }
                jhSC2 = jhSC3;
            }
            jhSC2.yJLL(arrstring[n], jhSC.Ou(object, (String)e));
        }
    }

    public jhSC mXJp(String string, Object object) throws Bkpl {
        jhSC.Fomb(object);
        Object object2 = this.gUxV(string);
        if (object2 == null) {
            this.yJLL(string, object instanceof vHqM ? jhSC.Ou(new vHqM(), object) : object);
        } else if (object2 instanceof vHqM) {
            jhSC.Ou((vHqM)object2, object);
        } else {
            this.yJLL(string, jhSC.Ou(jhSC.Ou(new vHqM(), object2), object));
        }
        return this;
    }

    public jhSC ksfs(String string, Object object) throws Bkpl {
        jhSC.Fomb(object);
        Object object2 = this.gUxV(string);
        if (object2 == null) {
            this.yJLL(string, jhSC.Ou(new vHqM(), object));
        } else if (object2 instanceof vHqM) {
            this.yJLL(string, jhSC.Ou((vHqM)object2, object));
        } else {
            throw new Bkpl((String)jhSC.Ou(jhSC.Ou(jhSC.Ou(new StringBuilder(BkvY$LhxG.I("\uc9d9\ua017\u0704\u7e55\ubae8\u3eb1\u24b1\u5077\u5652\u4618\ue46e")), string), BkvY$LhxG.I("\uc9ce\ua064\u0722\u7e68\uba87\u3ebd\u24b4\u5066\u5611\u460d\ue415\u09d6\u428c\u9f0c\udfe5\ub6eb\ub4ca\ue181\u99fd\u163f\ucfd6"))));
        }
        return this;
    }

    public static String CVAs(double d) {
        block9 : {
            block8 : {
                if (jhSC.Ou(d) != false) break block8;
                if (jhSC.Ou(d) == false) break block9;
            }
            return KDGY$JAHk.Y("\u0207\u41a4\ua782\u3ad9");
        }
        Object object = jhSC.Ou(d);
        if (jhSC.Ou(object, 46) > 0) {
            if (jhSC.Ou(object, 101) < 0) {
                if (jhSC.Ou(object, 69) < 0) {
                    do {
                        if (jhSC.Ou(object, KDGY$JAHk.Y("\u0259")) == false) break;
                        object = jhSC.Ou(object, false, jhSC.Ou(object) - true);
                    } while (true);
                    if (jhSC.Ou(object, KDGY$JAHk.Y("\u0247")) != false) {
                        object = jhSC.Ou(object, false, jhSC.Ou(object) - true);
                    }
                }
            }
        }
        return object;
    }

    public Object get(String string) throws Bkpl {
        if (string == null) {
            throw new Bkpl(KDGY$JAHk.Y("\u37aa\u4264\uf679\u3cdd\u81bd\u5383\ufa43\u4f61\u9709"));
        }
        Object object = this.gUxV(string);
        if (object == null) {
            throw new Bkpl((String)jhSC.Ou(jhSC.Ou(jhSC.Ou(new StringBuilder(KDGY$JAHk.Y("\u37ae\u4242\uf65a\u3cff\u81d2\u538a\ufa4c\u4f7d\u9744\uf2c7\u6175")), jhSC.quote(string)), KDGY$JAHk.Y("\u37b9\u4231\uf67b\u3cde\u81e9\u53c8\ufa40\u4f77\u9752\uf2dd\u614a\u2007"))));
        }
        return object;
    }

    public <E extends Enum<E>> E getEnum(Class<E> class_, String string) throws Bkpl {
        E e = this.mXJp(class_, string);
        if (e == null) {
            throw new Bkpl((String)jhSC.Ou(jhSC.Ou(jhSC.Ou(jhSC.Ou(jhSC.Ou(new StringBuilder(BkvY$LhxG.I("\u102a\u0864\u4937\uc5fd\ue1a8\ue1eb\ubfef\u70ad\u41d1\u26bd\u46bd")), jhSC.quote(string)), BkvY$LhxG.I("\u103d\u0817\u4911\uc5c0\ue1c7\ue1e7\ubfea\u70bc\u4192\u26a8\u4688\ua404\uee07\u8c79\ud4d8\u95fd\u5023\u3434\u948d\u6215\u4c64\u707c\udb85\u5ff0\u7a26")), jhSC.quote((String)jhSC.Ou(class_))), BkvY$LhxG.I("\u104e"))));
        }
        return e;
    }

    public boolean getBoolean(String string) throws Bkpl {
        block7 : {
            block6 : {
                Object object;
                block5 : {
                    block4 : {
                        object = this.get(string);
                        if (jhSC.Ou(object, (Boolean)yy.p(1132200383)) != false) break block4;
                        if (!(object instanceof String)) break block5;
                        if (jhSC.Ou((String)object, BkvY$LhxG.I("\u44b3\ued3e\u1db0\u6e29\ufe91")) == false) break block5;
                    }
                    return false;
                }
                if (jhSC.Ou(object, (Boolean)yy.p(-203750976)) != false) break block6;
                if (!(object instanceof String)) break block7;
                if (jhSC.Ou((String)object, BkvY$LhxG.I("\u44a1\ued2d\u1da9\u6e3f")) == false) break block7;
            }
            return true;
        }
        throw new Bkpl((String)jhSC.Ou(jhSC.Ou(jhSC.Ou(new StringBuilder(BkvY$LhxG.I("\u449f\ued0c\u1d93\u6e14\ufebb\u67f2\uce46\u4f84\u956a\u43c8\u89f3")), jhSC.quote(string)), BkvY$LhxG.I("\u4488\ued7f\u1db5\u6e29\ufed4\u67fe\uce43\u4f95\u9529\u43dd\u8988\u0c6c\u673e\uaf5e\u45c3\ub544\u37a0\u300c\u787e"))));
    }

    public BigInteger halY(String string) throws Bkpl {
        Object object = this.get(string);
        try {
            return new BigInteger((String)jhSC.Ou(object));
        }
        catch (Exception exception) {
            throw new Bkpl((String)jhSC.Ou(jhSC.Ou(jhSC.Ou(new StringBuilder(KDGY$JAHk.Y("\ubf19\u4f07\uf6b9\u33f2\u019b\u96e9\uad93\ucf4c\u3b5a\u0ff5\u166b")), jhSC.quote(string)), KDGY$JAHk.Y("\ubf0e\u4f74\uf695\u33d3\u01a1\u96e7\uad9d\ucf09\u3b57\u0fee\u1644\u2e91\u17df\u795d\u6b2d\ub3ab\uf83a\ue370\udbbd\ua2b6\u5eba\uda84\u3665\uda85\u33c1\uc773\uaec4\ud151\u0294\ufd22\u11a8\u38e7\u8c21\u46bd\uea87\u9a8b\uf59e\uae37\u7596"))));
        }
    }

    public BigDecimal getBigDecimal(String string) throws Bkpl {
        Object object = this.get(string);
        try {
            return new BigDecimal((String)jhSC.Ou(object));
        }
        catch (Exception exception) {
            throw new Bkpl((String)jhSC.Ou(jhSC.Ou(jhSC.Ou(new StringBuilder(KDGY$JAHk.Y("\uea82\u29b3\u062e\u3ad9\ub283\u122a\u1b31\u65c3\u5585\u5cb1\uc669")), jhSC.quote(string)), KDGY$JAHk.Y("\uea95\u29c0\u0602\u3af8\ub2b9\u1224\u1b3f\u6586\u5588\u5caa\uc646\u855d\u844e\u1a4a\uc733\u3862\uddc1\u913b\u8242\ue93e\ua3e2\ud92e\u7d44\u093a\u1c2a\uee41\uccb0\ue60f\ua93c\u5c8c\ude1c\uef30\u054a\u12c4\ue7e3\u3c2e\u18c3\u336d\u7f0a"))));
        }
    }

    public double getDouble(String string) throws Bkpl {
        Object object = this.get(string);
        try {
            if (object instanceof Number) {
                return (double)jhSC.Ou((Number)object);
            }
            return (double)jhSC.Ou((String)object);
        }
        catch (Exception exception) {
            throw new Bkpl((String)jhSC.Ou(jhSC.Ou(jhSC.Ou(new StringBuilder(KDGY$JAHk.Y("\u432d\u4f9f\uba09\u8d1a\u03f8\u3f62\u0913\u255d\u8392\u6980\u2fad")), jhSC.quote(string)), KDGY$JAHk.Y("\u433a\u4fec\uba2f\u8d27\u0397\u3f6e\u0916\u254c\u83d1\u6995\u2fd6\u62ab\u379e\u3afa\ub984\u5977\ua9d5\u890d"))));
        }
    }

    public int getInt(String string) throws Bkpl {
        Object object = this.get(string);
        try {
            if (object instanceof Number) {
                return (int)jhSC.Ou((Number)object);
            }
            return (int)jhSC.Ou((String)object);
        }
        catch (Exception exception) {
            throw new Bkpl((String)jhSC.Ou(jhSC.Ou(jhSC.Ou(new StringBuilder(KDGY$JAHk.Y("\ua540\u02af\u2773\ue428\u3942\u20c5\u7682\ube67\u895c\u6893\uc54f")), jhSC.quote(string)), KDGY$JAHk.Y("\ua557\u02dc\u2755\ue415\u392d\u20c9\u7687\ube76\u891f\u6886\uc57a\u2eab\u26b6\u405d\uee89\ubeb1"))));
        }
    }

    public vHqM ssMm(String string) throws Bkpl {
        Object object = this.get(string);
        if (object instanceof vHqM) {
            return (vHqM)object;
        }
        throw new Bkpl((String)jhSC.Ou(jhSC.Ou(jhSC.Ou(new StringBuilder(KDGY$JAHk.Y("\ub8b3\uddc6\u4d24\ufd77\u5301\uaa84\udba4\ubf29\u3d89\ue0b8\u6240")), jhSC.quote(string)), KDGY$JAHk.Y("\ub8a4\uddb5\u4d02\ufd4a\u536e\uaa88\udba1\ubf38\u3dca\ue0ad\u623b\u8e71\u7564\ue41a\ue027\u2aec\u10e2\u4da7\u37db\u6087\u8e75"))));
    }

    public jhSC yIkI(String string) throws Bkpl {
        Object object = this.get(string);
        if (object instanceof jhSC) {
            return (jhSC)object;
        }
        throw new Bkpl((String)jhSC.Ou(jhSC.Ou(jhSC.Ou(new StringBuilder(KDGY$JAHk.Y("\u91ac\ufd26\u1a99\ua046\u745c\u2ca3\u4bc6\u3195\u9139\uc692\u6f5d")), jhSC.quote(string)), KDGY$JAHk.Y("\u91bb\ufd55\u1abf\ua07b\u7433\u2caf\u4bc3\u3184\u917a\uc687\u6f26\uf423\uacda\ub099\u4f01\ucf34\u9572\u3ae9\udc83\ubbe8\u7dc1\ucbc8"))));
    }

    public long getLong(String string) throws Bkpl {
        Object object = this.get(string);
        try {
            if (object instanceof Number) {
                return (long)jhSC.Ou((Number)object);
            }
            return (long)jhSC.Ou((String)object);
        }
        catch (Exception exception) {
            throw new Bkpl((String)jhSC.Ou(jhSC.Ou(jhSC.Ou(new StringBuilder(BkvY$LhxG.I("\u0930\u75a4\ufea6\u8a1e\ueefc\udbbd\uf1a6\uabf0\uebb7\u3c13\u1254")), jhSC.quote(string)), BkvY$LhxG.I("\u0927\u75d7\ufe80\u8a23\uee93\udbb1\uf1a3\uabe1\uebf4\u3c06\u122f\u14a5\u66aa\u5ba6\u9d2b\ue7d5"))));
        }
    }

    public static String[] ksfs(jhSC jhSC2) {
        int n = jhSC2.length();
        if (n == 0) {
            return null;
        }
        Iterator<String> iterator = jhSC2.keys();
        String[] arrstring = new String[n];
        int n2 = 0;
        while (iterator.hasNext()) {
            arrstring[n2] = iterator.next();
            ++n2;
        }
        return arrstring;
    }

    public static String[] yIkA(Object object) {
        if (object == null) {
            return null;
        }
        Object object2 = jhSC.Ou(object);
        Field[] arrfield = (Field[])jhSC.Ou(object2);
        int n = arrfield.length;
        if (n == 0) {
            return null;
        }
        String[] arrstring = new String[n];
        for (int i = 0; i < n; ++i) {
            arrstring[i] = jhSC.Ou(arrfield[i]);
        }
        return arrstring;
    }

    public String getString(String string) throws Bkpl {
        Object object = this.get(string);
        if (object instanceof String) {
            return (String)object;
        }
        throw new Bkpl((String)jhSC.Ou(jhSC.Ou(jhSC.Ou(new StringBuilder(BkvY$LhxG.I("\u387b\u2faf\uabd1\u69ca\ud4e7\uc583\ua72c\ue594\u7c58\u110b\u8787")), jhSC.quote(string)), BkvY$LhxG.I("\u386c\u2fdc\uabf0\u69eb\ud4dc\uc5c1\ua727\ue5d1\u7c48\u110b\u87ae\u3126\u1754\u4357\ucdbb"))));
    }

    public boolean has(String string) {
        return ((Map)yy.h(this, 2034827013)).containsKey(string);
    }

    public jhSC CVAs(String string) throws Bkpl {
        Object object = this.gUxV(string);
        if (object == null) {
            this.yJLL(string, 1);
        } else if (object instanceof BigInteger) {
            this.yJLL(string, jhSC.Ou((BigInteger)object, (BigInteger)yy.p(-1189871866)));
        } else if (object instanceof BigDecimal) {
            this.yJLL(string, jhSC.Ou((BigDecimal)object, (BigDecimal)yy.p(1465712396)));
        } else if (object instanceof Integer) {
            this.yJLL(string, (int)(jhSC.Ou((Integer)object) + true));
        } else if (object instanceof Long) {
            this.ksfs(string, (long)(jhSC.Ou((Long)object) + 1));
        } else if (object instanceof Double) {
            this.ksfs(string, (double)(jhSC.Ou((Double)object) + 1.0));
        } else if (object instanceof Float) {
            this.ksfs(string, (double)(jhSC.Ou((Float)object) + 1.0f));
        } else {
            throw new Bkpl((String)jhSC.Ou(jhSC.Ou(jhSC.Ou(new StringBuilder(BkvY$LhxG.I("\u8d79\u8b4e\u4d8b\ub183\u7077\ue25e\u6b3f\ue3c2\uc754\uf77f\ue1a9\u298a\ua36b\uda12\u94c2\ucc7a\ud334\ua88c\u5d70\uc3e9\uc171")), jhSC.quote(string)), BkvY$LhxG.I("\u8d71\u8b0e"))));
        }
        return this;
    }

    public boolean qAsQ(String string) {
        return (boolean)jhSC.Ou(yy.p(-1977613833), this.gUxV(string));
    }

    public Iterator<String> keys() {
        return this.keySet().iterator();
    }

    public Set<String> keySet() {
        return ((Map)yy.h(this, 2034827013)).keySet();
    }

    public int length() {
        return ((Map)yy.h(this, 2034827013)).size();
    }

    public vHqM VvmI() {
        vHqM vHqM2 = new vHqM();
        Iterator<String> iterator = this.keys();
        while (iterator.hasNext()) {
            jhSC.Ou(vHqM2, iterator.next());
        }
        if (jhSC.Ou(vHqM2) == false) {
            return null;
        }
        return vHqM2;
    }

    public static String mXJp(Number number) throws Bkpl {
        if (number == null) {
            throw new Bkpl(BkvY$LhxG.I("\ubf65\u6332\uc9e9\u1869\u7ca6\u8d42\u8309\u69c1\u479f\u4d7f\ude01\u8c62"));
        }
        jhSC.Fomb(number);
        Object object = jhSC.Ou(number);
        if (jhSC.Ou(object, 46) > 0) {
            if (jhSC.Ou(object, 101) < 0) {
                if (jhSC.Ou(object, 69) < 0) {
                    do {
                        if (jhSC.Ou(object, BkvY$LhxG.I("\ubf1b")) == false) break;
                        object = jhSC.Ou(object, false, jhSC.Ou(object) - true);
                    } while (true);
                    if (jhSC.Ou(object, BkvY$LhxG.I("\ubf05")) != false) {
                        object = jhSC.Ou(object, false, jhSC.Ou(object) - true);
                    }
                }
            }
        }
        return object;
    }

    public Object gUxV(String string) {
        if (string == null) {
            return null;
        }
        return ((Map)yy.h(this, 2034827013)).get(string);
    }

    public <E extends Enum<E>> E mXJp(Class<E> class_, String string) {
        return this.mXJp(class_, string, null);
    }

    public <E extends Enum<E>> E mXJp(Class<E> class_, String string, E e) {
        try {
            Object object = this.gUxV(string);
            if (jhSC.Ou(yy.p(-1977613833), object) != false) {
                return e;
            }
            if (jhSC.Ou(class_, jhSC.Ou(object)) != false) {
                Enum enum_ = (Enum)object;
                return (E)enum_;
            }
            return (E)jhSC.Ou(class_, jhSC.Ou(object));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return e;
        }
        catch (NullPointerException nullPointerException) {
            return e;
        }
    }

    public boolean yIkA(String string) {
        return this.mXJp(string, false);
    }

    public boolean mXJp(String string, boolean bl) {
        try {
            return this.getBoolean(string);
        }
        catch (Exception exception) {
            return bl;
        }
    }

    public double qArm(String string) {
        return this.mXJp(string, Double.NaN);
    }

    public BigInteger mXJp(String string, BigInteger bigInteger) {
        try {
            return this.halY(string);
        }
        catch (Exception exception) {
            return bigInteger;
        }
    }

    public BigDecimal mXJp(String string, BigDecimal bigDecimal) {
        try {
            return this.getBigDecimal(string);
        }
        catch (Exception exception) {
            return bigDecimal;
        }
    }

    public double mXJp(String string, double d) {
        try {
            return this.getDouble(string);
        }
        catch (Exception exception) {
            return d;
        }
    }

    public int Fomb(String string) {
        return this.ksfs(string, 0);
    }

    public int ksfs(String string, int n) {
        try {
            return this.getInt(string);
        }
        catch (Exception exception) {
            return n;
        }
    }

    public vHqM Ralc(String string) {
        Object object = this.gUxV(string);
        if (object instanceof vHqM) {
            return (vHqM)object;
        }
        return null;
    }

    public jhSC SnAm(String string) {
        Object object = this.gUxV(string);
        if (object instanceof jhSC) {
            return (jhSC)object;
        }
        return null;
    }

    public long SBla(String string) {
        return this.mXJp(string, 0);
    }

    public long mXJp(String string, long l) {
        try {
            return this.getLong(string);
        }
        catch (Exception exception) {
            return l;
        }
    }

    public String gois(String string) {
        return this.mXJp(string, "");
    }

    public String mXJp(String string, String string2) {
        Object object = this.gUxV(string);
        if (jhSC.Ou(yy.p(-1977613833), object) != false) {
            return string2;
        }
        return jhSC.Ou(object);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void qArm(Object var1_1) {
        var2_2 = jhSC.Ou(var1_1);
        var3_3 = jhSC.Ou(var2_2) != null;
        var4_4 = var3_3 ? (Method[])jhSC.Ou(var2_2) : (Method[])jhSC.Ou(var2_2);
        var5_5 = 0;
        while (var5_5 < var4_4.length) {
            block13 : {
                try {
                    block15 : {
                        block14 : {
                            var6_6 = var4_4[var5_5];
                            if (jhSC.Ou(jhSC.Ou(var6_6)) == false) break block13;
                            var7_8 = jhSC.Ou(var6_6);
                            var8_9 = "";
                            if (jhSC.Ou(var7_8, KDGY$JAHk.Y("\u70b2\u5560\u1667")) == false) break block14;
                            if (jhSC.Ou(KDGY$JAHk.Y("\u70b2\u5560\u1667\ue75c\u24ff\u1c77\u6bfa\u3142"), var7_8) != false) ** GOTO lbl-1000
                            if (jhSC.Ou(KDGY$JAHk.Y("\u70b2\u5560\u1667\ue75b\u24f6\u1c75\u6be5\u3150\ue953\uca4c\uff3e\u2898\u8848\u61ab\u270a\uc106\u2d59"), var7_8) != false) lbl-1000: // 2 sources:
                            {
                                var8_9 = "";
                            } else {
                                var8_9 = jhSC.Ou(var7_8, 3);
                            }
                            break block15;
                        }
                        if (jhSC.Ou(var7_8, KDGY$JAHk.Y("\u70bc\u5576")) != false) {
                            var8_9 = jhSC.Ou(var7_8, 2);
                        }
                    }
                    if (jhSC.Ou(var8_9) > 0) {
                        if (jhSC.Ou(jhSC.Ou(var8_9, false)) != false) {
                            if (((Class[])jhSC.Ou(var6_6)).length == 0) {
                                if (jhSC.Ou(var8_9) == true) {
                                    var8_9 = jhSC.Ou(var8_9);
                                } else if (jhSC.Ou(jhSC.Ou(var8_9, true)) == false) {
                                    var8_9 = jhSC.Ou(jhSC.Ou(jhSC.Ou(new StringBuilder(), jhSC.Ou(jhSC.Ou(var8_9, false, true))), jhSC.Ou(var8_9, true)));
                                }
                                if ((var9_10 = jhSC.Ou(var6_6, var1_1, null)) != null) {
                                    ((Map)yy.h(this, 2034827013)).put(var8_9, jhSC.wrap(var9_10));
                                }
                            }
                        }
                    }
                }
                catch (Exception var6_7) {
                    // empty catch block
                }
            }
            ++var5_5;
        }
    }

    public jhSC ksfs(String string, boolean bl) throws Bkpl {
        this.yJLL(string, bl ? (Boolean)yy.p(-203750976) : (Boolean)yy.p(1132200383));
        return this;
    }

    public jhSC mXJp(String string, Collection<Object> collection) throws Bkpl {
        this.yJLL(string, new vHqM(collection));
        return this;
    }

    public jhSC ksfs(String string, double d) throws Bkpl {
        this.yJLL(string, new Double(d));
        return this;
    }

    public jhSC yJLL(String string, int n) throws Bkpl {
        this.yJLL(string, new Integer(n));
        return this;
    }

    public jhSC ksfs(String string, long l) throws Bkpl {
        this.yJLL(string, new Long(l));
        return this;
    }

    public jhSC mXJp(String string, Map<String, Object> map) throws Bkpl {
        this.yJLL(string, new jhSC(map));
        return this;
    }

    public jhSC yJLL(String string, Object object) throws Bkpl {
        if (string == null) {
            throw new NullPointerException(KDGY$JAHk.Y("\u7183\u382d\uef88\u1bf8\uefbd\u8e77\ufcdf\ud574\u22c6"));
        }
        if (object != null) {
            jhSC.Fomb(object);
            ((Map)yy.h(this, 2034827013)).put(string, object);
        } else {
            this.JjvV(string);
        }
        return this;
    }

    public jhSC SnBs(String string, Object object) throws Bkpl {
        if (string != null && object != null) {
            if (this.gUxV(string) != null) {
                throw new Bkpl((String)jhSC.Ou(jhSC.Ou(jhSC.Ou(new StringBuilder(BkvY$LhxG.I("\u2d58\u893e\ub05a\u6aa3\ub2ff\u438f\u99e2\uc0d8\u02ff\ucb61\u0a5d\u2aca\uad03\ud317\ue43a")), string), BkvY$LhxG.I("\u2d3e"))));
            }
            this.yJLL(string, object);
        }
        return this;
    }

    public jhSC qdWJ(String string, Object object) throws Bkpl {
        if (string != null && object != null) {
            this.yJLL(string, object);
        }
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String quote(String string) {
        StringWriter stringWriter = new StringWriter();
        Object object = jhSC.Ou(stringWriter);
        synchronized (object) {
            try {
                return jhSC.Ou(jhSC.mXJp(string, stringWriter));
            }
            catch (IOException iOException) {
                return "";
            }
        }
    }

    public static Writer mXJp(String string, Writer writer) throws IOException {
        block16 : {
            block15 : {
                if (string == null) break block15;
                if (jhSC.Ou(string) != false) break block16;
            }
            jhSC.Ou(writer, KDGY$JAHk.Y("\ua4ee\uf8bc"));
            return writer;
        }
        Object object = 0;
        Object object2 = jhSC.Ou(string);
        jhSC.Ou(writer, 34);
        block9 : for (int i = 0; i < object2; ++i) {
            int n = object;
            Object object3 = jhSC.Ou(string, i);
            object = object3;
            switch (object3) {
                case 34: 
                case 92: {
                    jhSC.Ou(writer, 92);
                    jhSC.Ou(writer, object);
                    continue block9;
                }
                case 47: {
                    if (n == 60) {
                        jhSC.Ou(writer, 92);
                    }
                    jhSC.Ou(writer, object);
                    continue block9;
                }
                case 8: {
                    jhSC.Ou(writer, KDGY$JAHk.Y("\ua490\uf8fc"));
                    continue block9;
                }
                case 9: {
                    jhSC.Ou(writer, KDGY$JAHk.Y("\ua490\uf8ea"));
                    continue block9;
                }
                case 10: {
                    jhSC.Ou(writer, KDGY$JAHk.Y("\ua490\uf8f0"));
                    continue block9;
                }
                case 12: {
                    jhSC.Ou(writer, KDGY$JAHk.Y("\ua490\uf8f8"));
                    continue block9;
                }
                case 13: {
                    jhSC.Ou(writer, KDGY$JAHk.Y("\ua490\uf8ec"));
                    continue block9;
                }
                default: {
                    if (object < 32 || object >= 128 && object < 160 || object >= 8192 && object < 8448) {
                        jhSC.Ou(writer, KDGY$JAHk.Y("\ua490\uf8eb"));
                        Object object4 = jhSC.Ou(object);
                        jhSC.Ou(writer, KDGY$JAHk.Y("\ua4fc\uf8ae\ue049\u5c1c"), false, 4 - jhSC.Ou(object4));
                        jhSC.Ou(writer, object4);
                        continue block9;
                    }
                    jhSC.Ou(writer, object);
                }
            }
        }
        jhSC.Ou(writer, 34);
        return writer;
    }

    public Object JjvV(String string) {
        return ((Map)yy.h(this, 2034827013)).remove(string);
    }

    public boolean gUxV(Object object) {
        if (!(object instanceof jhSC)) {
            return false;
        }
        try {
            Set<String> set = this.keySet();
            if (!set.equals(((jhSC)object).keySet())) {
                return false;
            }
            for (String string : set) {
                Object object2 = this.get(string);
                Object object3 = ((jhSC)object).get(string);
                if (object2 instanceof jhSC) {
                    if (((jhSC)object2).gUxV(object3)) continue;
                    return false;
                }
                if (object2 instanceof vHqM) {
                    if (jhSC.Ou((vHqM)object2, object3) != false) continue;
                    return false;
                }
                if (jhSC.Ou(object2, object3) != false) continue;
                return false;
            }
            return true;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object stringToValue(String string) {
        if (jhSC.Ou(string, "") != false) {
            return string;
        }
        if (jhSC.Ou(string, BkvY$LhxG.I("\ucbbe\ub996\ue293\u0701")) != false) {
            return (Boolean)yy.p(-203750976);
        }
        if (jhSC.Ou(string, BkvY$LhxG.I("\ucbac\ub985\ue28a\u0717\u5a1f")) != false) {
            return (Boolean)yy.p(1132200383);
        }
        if (jhSC.Ou(string, BkvY$LhxG.I("\ucba4\ub991\ue28a\u0708")) != false) {
            return yy.p(-1977613833);
        }
        Object object = jhSC.Ou(string, false);
        if (object < 48 || object > 57) {
            if (object != 45) return string;
        }
        try {
            if (jhSC.Ou(string, 46) < 0) {
                if (jhSC.Ou(string, 101) < 0) {
                    if (jhSC.Ou(string, 69) < 0) {
                        Long l = new Long(string);
                        if (jhSC.Ou(string, jhSC.Ou(l)) == false) return string;
                        if (jhSC.Ou(l) != (Object)jhSC.Ou(l)) return l;
                        return jhSC.Ou(jhSC.Ou(l));
                    }
                }
            }
            Object object2 = jhSC.Ou(string);
            if (jhSC.Ou(object2) != false) return string;
            if (jhSC.Ou(object2) != false) return string;
            return object2;
        }
        catch (Exception exception) {
            // empty catch block
        }
        return string;
    }

    public static void Fomb(Object object) throws Bkpl {
        block6 : {
            block9 : {
                block7 : {
                    block8 : {
                        if (object == null) break block6;
                        if (!(object instanceof Double)) break block7;
                        if (jhSC.Ou((Double)object) != false) break block8;
                        if (jhSC.Ou((Double)object) == false) break block6;
                    }
                    throw new Bkpl(NVIs$JbpD.H("\u3b7b\ud108\ub90f\uda44\u9ba3\ucbe2\u5312\u26e0\uad75\uefbf\u7b83\uceb3\u56d2\u9d2d\ue668\u9adc\u97dd\u036e\u54b3\uc9fe\ud63d\ue344\ue0d3\ucfa2\u9e92\u7f16\u79c7\u91fa\u68c4\u915e\u4bf3\u384a\ud05d\uebbe\u1afa\uf9ba\ua401\u9c08\u450c"));
                }
                if (!(object instanceof Float)) break block6;
                if (jhSC.Ou((Float)object) != false) break block9;
                if (jhSC.Ou((Float)object) == false) break block6;
            }
            throw new Bkpl(NVIs$JbpD.H("\u3b7b\ud108\ub90f\uda44\u9ba3\ucbe2\u5312\u26e0\uad75\uefbf\u7b83\uceb3\u56d2\u9d2d\ue668\u9adc\u97dd\u036e\u54b3\uc9fe\ud63d\ue344\ue0d3\ucfa2\u9e92\u7f16\u79c7\u91fa\u68c4\u915e\u4bf3\u384a\ud05d\uebbe\u1afa\uf9ba\ua401\u9c08\u450c"));
        }
    }

    public vHqM yJLL(vHqM vHqM2) throws Bkpl {
        block4 : {
            block3 : {
                if (vHqM2 == null) break block3;
                if (jhSC.Ou(vHqM2) != false) break block4;
            }
            return null;
        }
        vHqM vHqM3 = new vHqM();
        int n = 0;
        do {
            if (n >= jhSC.Ou(vHqM2)) break;
            jhSC.Ou(vHqM3, this.gUxV((String)jhSC.Ou(vHqM2, n)));
            ++n;
        } while (true);
        return vHqM3;
    }

    public String toString() {
        try {
            return this.toString(0);
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String toString(int n) throws Bkpl {
        StringWriter stringWriter = new StringWriter();
        Object object = jhSC.Ou(stringWriter);
        synchronized (object) {
            return jhSC.Ou(this.mXJp(stringWriter, n, 0));
        }
    }

    public static String valueToString(Object object) throws Bkpl {
        block14 : {
            block13 : {
                if (object == null) break block13;
                if (jhSC.Ou(object, null) == false) break block14;
            }
            return NVIs$JbpD.H("\ub850\u217f\u982b\u0775");
        }
        if (object instanceof tTQG) {
            String string;
            try {
                string = ((tTQG)object).toJSONString();
            }
            catch (Exception exception) {
                throw new Bkpl(exception);
            }
            if (string instanceof String) {
                return string;
            }
            throw new Bkpl((String)jhSC.Ou(jhSC.Ou(new StringBuilder(NVIs$JbpD.H("\ub87c\u216b\u9823\u0739\u7974\u9cc1\ud991\u563b\u6cb7\ud674\u28d6\u035d\u505a\u979a\u5c4d\ufa7c\u2584\u7406\u50af\u6a3a\ua6c4\u9e24\u59ed\u5455\u9087\u31c2\uaa13\u18ab\ue29b")), string)));
        }
        if (object instanceof Number) {
            return jhSC.mXJp((Number)object);
        }
        if (object instanceof Boolean || object instanceof jhSC || object instanceof vHqM) {
            return jhSC.Ou(object);
        }
        if (object instanceof Map) {
            Map map = (Map)object;
            return new jhSC(map).toString();
        }
        if (object instanceof Collection) {
            Collection collection = (Collection)object;
            return jhSC.Ou(new vHqM(collection));
        }
        if (jhSC.Ou(jhSC.Ou(object)) != false) {
            return jhSC.Ou(new vHqM(object));
        }
        return jhSC.quote((String)jhSC.Ou(object));
    }

    public static Object wrap(Object object) {
        try {
            block15 : {
                block14 : {
                    block13 : {
                        block12 : {
                            if (object == null) {
                                return yy.p(-1977613833);
                            }
                            if (object instanceof jhSC || object instanceof vHqM) break block12;
                            if (jhSC.Ou(yy.p(-1977613833), object) == false && !(object instanceof tTQG) && !(object instanceof Byte) && !(object instanceof Character) && !(object instanceof Short) && !(object instanceof Integer) && !(object instanceof Long) && !(object instanceof Boolean) && !(object instanceof Float) && !(object instanceof Double) && !(object instanceof String) && !(object instanceof BigInteger) && !(object instanceof BigDecimal)) break block13;
                        }
                        return object;
                    }
                    if (object instanceof Collection) {
                        Collection collection = (Collection)object;
                        return new vHqM(collection);
                    }
                    if (jhSC.Ou(jhSC.Ou(object)) != false) {
                        return new vHqM(object);
                    }
                    if (object instanceof Map) {
                        Map map = (Map)object;
                        return new jhSC(map);
                    }
                    Object object2 = jhSC.Ou(jhSC.Ou(object));
                    Object object3 = object2 != null ? jhSC.Ou(object2) : "";
                    if (jhSC.Ou(object3, NVIs$JbpD.H("\u4094\u52ae\u65af\u41f6\ua8f1")) != false) break block14;
                    if (jhSC.Ou(object3, NVIs$JbpD.H("\u4094\u52ae\u65af\u41f6\ua8a7\ue1dc")) != false) break block14;
                    if (jhSC.Ou(jhSC.Ou(object)) != null) break block15;
                }
                return jhSC.Ou(object);
            }
            return new jhSC(object);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public Writer mXJp(Writer writer) throws Bkpl {
        return this.mXJp(writer, 0, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static final Writer mXJp(Writer writer, Object object, int n, int n2) throws Bkpl, IOException {
        block13 : {
            block12 : {
                if (object == null) break block12;
                if (jhSC.Ou(object, null) == false) break block13;
            }
            jhSC.Ou(writer, BkvY$LhxG.I("\ubf45\u6332\uc9e9\u1869"));
            return writer;
        }
        if (object instanceof jhSC) {
            ((jhSC)object).mXJp(writer, n, n2);
            return writer;
        }
        if (object instanceof vHqM) {
            jhSC.Ou((vHqM)object, writer, n, n2);
            return writer;
        }
        if (object instanceof Map) {
            Map map = (Map)object;
            new jhSC(map).mXJp(writer, n, n2);
            return writer;
        }
        if (object instanceof Collection) {
            Collection collection = (Collection)object;
            jhSC.Ou(new vHqM(collection), writer, n, n2);
            return writer;
        }
        if (jhSC.Ou(jhSC.Ou(object)) != false) {
            jhSC.Ou(new vHqM(object), writer, n, n2);
            return writer;
        }
        if (object instanceof Number) {
            jhSC.Ou(writer, jhSC.mXJp((Number)object));
            return writer;
        }
        if (object instanceof Boolean) {
            jhSC.Ou(writer, jhSC.Ou(object));
            return writer;
        }
        if (object instanceof tTQG) {
            String string;
            try {
                string = ((tTQG)object).toJSONString();
            }
            catch (Exception exception) {
                throw new Bkpl(exception);
            }
            jhSC.Ou(writer, string != null ? jhSC.Ou(string) : jhSC.quote((String)jhSC.Ou(object)));
            return writer;
        }
        jhSC.mXJp((String)jhSC.Ou(object), writer);
        return writer;
    }

    static final void mXJp(Writer writer, int n) throws IOException {
        for (int i = 0; i < n; ++i) {
            jhSC.Ou(writer, 32);
        }
    }

    Writer mXJp(Writer writer, int n, int n2) throws Bkpl {
        try {
            boolean bl = false;
            int n3 = this.length();
            Iterator<String> iterator = this.keys();
            jhSC.Ou(writer, 123);
            if (n3 == 1) {
                String string = iterator.next();
                jhSC.Ou(writer, jhSC.quote((String)jhSC.Ou(string)));
                jhSC.Ou(writer, 58);
                if (n > 0) {
                    jhSC.Ou(writer, 32);
                }
                jhSC.mXJp(writer, ((Map)yy.h(this, 2034827013)).get(string), n, n2);
            } else if (n3 != 0) {
                int n4 = n2 + n;
                while (iterator.hasNext()) {
                    String string = iterator.next();
                    if (bl) {
                        jhSC.Ou(writer, 44);
                    }
                    if (n > 0) {
                        jhSC.Ou(writer, 10);
                    }
                    jhSC.mXJp(writer, n4);
                    jhSC.Ou(writer, jhSC.quote((String)jhSC.Ou(string)));
                    jhSC.Ou(writer, 58);
                    if (n > 0) {
                        jhSC.Ou(writer, 32);
                    }
                    jhSC.mXJp(writer, ((Map)yy.h(this, 2034827013)).get(string), n, n4);
                    bl = true;
                }
                if (n > 0) {
                    jhSC.Ou(writer, 10);
                }
                jhSC.mXJp(writer, n2);
            }
            jhSC.Ou(writer, 125);
            return writer;
        }
        catch (IOException iOException) {
            throw new Bkpl(iOException);
        }
    }

    static {
        yy.K(-1977613833, new jhSC$mXJp(null));
    }

    private static Object Ou(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


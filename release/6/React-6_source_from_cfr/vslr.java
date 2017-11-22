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

public class vslr {
    private final Map<String, Object> map = new HashMap<String, Object>();
    public static final Object woWM;

    public vslr() {
    }

    public vslr(vslr vslr2, String[] arrstring) {
        this();
        for (int i = 0; i < arrstring.length; ++i) {
            try {
                this.OXeK(arrstring[i], vslr2.kQcX(arrstring[i]));
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public vslr(FouE fouE) throws TOKE {
        this();
        if (vslr.nh(fouE) != 123) {
            throw vslr.nh(fouE, YEBy$TyVf.W("\uf0b8\u8f1a\ue19c\u4710\uebd0\u8f22\u6472\u06d5\u31c5\u6a3b\u1895\u9f5d\udbca\u0bf2\ud58d\ueee9\u66aa\ue061\udd08\u3b36\u241f\u967f\u9412\u7de5\uca5a\u759e\ua523\u2f1e\uf35f\u9031\uf55f\ua0db\u7e84\u96aa\ufed1\u5f8a\ubef8"));
        }
        block8 : do {
            Object object = vslr.nh(fouE);
            switch (object) {
                case 0: {
                    throw vslr.nh(fouE, YEBy$TyVf.W("\uf0b8\u8f1a\ue19c\u4710\uebd0\u8f22\u6472\u06d5\u31c5\u6a3b\u1895\u9f5d\udbca\u0bf2\ud58d\ueee9\u66aa\ue061\udd08\u3b36\u241f\u967f\u9412\u7de2\uca51\u759d\ua56a\u2f07\uf316\u9032\uf55e\ua08f\u7ecb\u96f7\ufed1"));
                }
                case 125: {
                    return;
                }
            }
            vslr.nh(fouE);
            Object object2 = vslr.nh(vslr.nh(fouE));
            object = vslr.nh(fouE);
            if (object != 58) {
                throw vslr.nh(fouE, YEBy$TyVf.W("\uf0bc\u8f42\ue1a6\u4726\uebfc\u8f18\u6458\u06d3\u318f\u6a3f\u18d6\u9f0e\udbd0\u0ba1\ud5c8\ueef0\u66b8\ue035\udd00\u3b31\u244c\u966a\u9412\u7dec\uca5a\u7580"));
            }
            this.OXeK((String)object2, vslr.nh(fouE));
            switch (vslr.nh(fouE)) {
                case 44: 
                case 59: {
                    if (vslr.nh(fouE) == 125) {
                        return;
                    }
                    vslr.nh(fouE);
                    continue block8;
                }
                case 125: {
                    return;
                }
            }
            break;
        } while (true);
        throw vslr.nh(fouE, YEBy$TyVf.W("\uf0bc\u8f42\ue1a6\u4726\uebfc\u8f18\u6458\u06d3\u318f\u6a3f\u18d6\u9f0e\udbc6\u0ba1\ud5c8\ueefe\u66ac\ue061\udd42\u3b3e\u244b"));
    }

    public vslr(Map<String, Object> map) {
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Object object = entry.getValue();
                if (object == null) continue;
                ((Map)cv.b(this, -1915815166)).put(entry.getKey(), vslr.wrap(object));
            }
        }
    }

    public vslr(Object object) {
        this();
        this.kQcX(object);
    }

    public vslr(Object object, String[] arrstring) {
        this();
        Object object2 = vslr.nh(object);
        for (int i = 0; i < arrstring.length; ++i) {
            String string = arrstring[i];
            try {
                this.YoSa(string, vslr.nh(vslr.nh(object2, string), object));
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public vslr(String string) throws TOKE {
        this(new FouE(string));
    }

    public vslr(String string, Locale locale) throws TOKE {
        this();
        Object object = vslr.nh(string, locale, vslr.nh(vslr.nh()));
        Object object2 = vslr.nh(object);
        while (object2.hasMoreElements()) {
            Object e = object2.nextElement();
            if (e == null) continue;
            String[] arrstring = (String[])vslr.nh((String)e, rgig$AWxc.r("\u06ac\ude08"));
            int n = arrstring.length - 1;
            vslr vslr2 = this;
            for (int i = 0; i < n; ++i) {
                String string2 = arrstring[i];
                vslr vslr3 = vslr2.PuYf(string2);
                if (vslr3 == null) {
                    vslr3 = new vslr();
                    vslr2.IWSm(string2, vslr3);
                }
                vslr2 = vslr3;
            }
            vslr2.IWSm(arrstring[n], vslr.nh(object, (String)e));
        }
    }

    public vslr ssNb(String string, Object object) throws TOKE {
        vslr.rMgK(object);
        Object object2 = this.kQcX(string);
        if (object2 == null) {
            this.IWSm(string, object instanceof HdyI ? vslr.nh(new HdyI(), object) : object);
        } else if (object2 instanceof HdyI) {
            vslr.nh((HdyI)object2, object);
        } else {
            this.IWSm(string, vslr.nh(vslr.nh(new HdyI(), object2), object));
        }
        return this;
    }

    public vslr DYFV(String string, Object object) throws TOKE {
        vslr.rMgK(object);
        Object object2 = this.kQcX(string);
        if (object2 == null) {
            this.IWSm(string, vslr.nh(new HdyI(), object));
        } else if (object2 instanceof HdyI) {
            this.IWSm(string, vslr.nh((HdyI)object2, object));
        } else {
            throw new TOKE((String)vslr.nh(vslr.nh(vslr.nh(new StringBuilder(YEBy$TyVf.W("\ucb8f\u383a\u2e9f\u508e\u136e\u3bec\u3ccc\u1eba\u89f67\u4d24")), string), YEBy$TyVf.W("\ucb98\u3849\u2eb9\u50b3\u1301\u3be0\u3cc9\u1eab\u89b5\"\u4d5f\u0894\ue966\uf25a\u1a5c\u6914\ufc78\u5d70\u5d5e\uf719\u4afd"))));
        }
        return this;
    }

    public static String rMgK(double d) {
        block9 : {
            block8 : {
                if (vslr.nh(d) != false) break block8;
                if (vslr.nh(d) == false) break block9;
            }
            return rgig$AWxc.r("\uf690\ucc40\u78fb\uf31e");
        }
        Object object = vslr.nh(d);
        if (vslr.nh(object, 46) > 0) {
            if (vslr.nh(object, 101) < 0) {
                if (vslr.nh(object, 69) < 0) {
                    do {
                        if (vslr.nh(object, rgig$AWxc.r("\uf6ce")) == false) break;
                        object = vslr.nh(object, false, vslr.nh(object) - true);
                    } while (true);
                    if (vslr.nh(object, rgig$AWxc.r("\uf6d0")) != false) {
                        object = vslr.nh(object, false, vslr.nh(object) - true);
                    }
                }
            }
        }
        return object;
    }

    public Object get(String string) throws TOKE {
        if (string == null) {
            throw new TOKE(rgig$AWxc.r("\ucfbd\u92cc\ub757\ub5f9\u4ed7\ub765\u8c56\u7ad9\u7954"));
        }
        Object object = this.kQcX(string);
        if (object == null) {
            throw new TOKE((String)vslr.nh(vslr.nh(vslr.nh(new StringBuilder(rgig$AWxc.r("\ucfb9\u92ea\ub774\ub5db\u4eb8\ub76c\u8c59\u7ac5\u7919\u5c38\ud1ff")), vslr.quote(string)), rgig$AWxc.r("\ucfae\u9299\ub755\ub5fa\u4e83\ub72e\u8c55\u7acf\u790f\u5c22\ud1c0\ucc00"))));
        }
        return object;
    }

    public <E extends Enum<E>> E getEnum(Class<E> class_, String string) throws TOKE {
        E e = this.ssNb(class_, string);
        if (e == null) {
            throw new TOKE((String)vslr.nh(vslr.nh(vslr.nh(vslr.nh(vslr.nh(new StringBuilder(YEBy$TyVf.W("\u6776\u5453\u3544\ud75b\u29cd\u4b7f\u7b69\u936a\ue77f\u092c\u36b8")), vslr.quote(string)), YEBy$TyVf.W("\u6761\u5420\u3562\ud766\u29a2\u4b73\u7b6c\u937b\ue73c\u0939\u368d\ue5a9\udaa1\u5cfb\u4d22\u4499\uc308\u81c7\uc85d\u2ef2\u06bdP\u1c3a\udf4e\ud599")), vslr.quote((String)vslr.nh(class_))), YEBy$TyVf.W("\u6712"))));
        }
        return e;
    }

    public boolean getBoolean(String string) throws TOKE {
        block7 : {
            block6 : {
                Object object;
                block5 : {
                    block4 : {
                        object = this.get(string);
                        if (vslr.nh(object, (Boolean)cv.e(-1234961614)) != false) break block4;
                        if (!(object instanceof String)) break block5;
                        if (vslr.nh((String)object, KUXS$dwji.S("\u4376\ue00a\u6a25\u0fb6\u7e5e")) == false) break block5;
                    }
                    return false;
                }
                if (vslr.nh(object, (Boolean)cv.e(-811926723)) != false) break block6;
                if (!(object instanceof String)) break block7;
                if (vslr.nh((String)object, KUXS$dwji.S("\u4364\ue019\u6a3c\u0fa0")) == false) break block7;
            }
            return true;
        }
        throw new TOKE((String)vslr.nh(vslr.nh(vslr.nh(new StringBuilder(KUXS$dwji.S("\u435a\ue038\u6a06\u0f8b\u7e74\ud234\u1491\u1db9\u0888\ud2a3\uf467")), vslr.quote(string)), KUXS$dwji.S("\u434d\ue04b\u6a20\u0fb6\u7e1b\ud238\u1494\u1da8\u08cb\ud2b6\uf41c\u7ca9\u4c2d\u4f96\u7c24\u3711\u47a5\ue650\uf9db"))));
    }

    public BigInteger TyVf(String string) throws TOKE {
        Object object = this.get(string);
        try {
            return new BigInteger((String)vslr.nh(object));
        }
        catch (Exception exception) {
            throw new TOKE((String)vslr.nh(vslr.nh(vslr.nh(new StringBuilder(YEBy$TyVf.W("\ud236\u139f\u9feb\uf202\u7aee\ua91a\uc6de\u4d1d\u6a55\ua39c\u4857")), vslr.quote(string)), YEBy$TyVf.W("\ud221\u13ec\u9fc7\uf223\u7ad4\ua914\uc6d0\u4d58\u6a58\ua387\u4878\ub793\u8fbc\u1b15\uc636\u10aa\uded2\ua7c3\u5ea7\ub656\uaa8b\u9090\uad2a\uc576\ub500\ud846\ua5cb\u4826\u094c\u4228\u07df\udd52{\u0cc9\uec38\u480e\u2a5c\u326a\u6923"))));
        }
    }

    public BigDecimal getBigDecimal(String string) throws TOKE {
        Object object = this.get(string);
        try {
            return new BigDecimal((String)vslr.nh(object));
        }
        catch (Exception exception) {
            throw new TOKE((String)vslr.nh(vslr.nh(vslr.nh(new StringBuilder(YEBy$TyVf.W("\u0d23\u77cc\ud46f\u7efc\u3890\uff35\uf9a9\u8c5a\ubfca\u474e\u0429")), vslr.quote(string)), YEBy$TyVf.W("\u0d34\u77bf\ud443\u7edd\u38aa\uff3b\uf9a7\u8c1f\ubfc7\u4755\u0406\uee42\u443b\u6ca3\u1857\ud26d\u2aa6\u6e7d\u4ae5\u6dea\ue4f2\u3d26\ue5cf\ua9a0\uc4ef\uce71\u9064\ud093\u6691\ucc67\uc4aa\u7c4c\uc446\u46d8\ufe0c\u241a\u3e74\u5970\u86f7"))));
        }
    }

    public double getDouble(String string) throws TOKE {
        Object object = this.get(string);
        try {
            if (object instanceof Number) {
                return (double)vslr.nh((Number)object);
            }
            return (double)vslr.nh((String)object);
        }
        catch (Exception exception) {
            throw new TOKE((String)vslr.nh(vslr.nh(vslr.nh(new StringBuilder(KUXS$dwji.S("\u3cc0\uae91\udaed\u85c7\u9a83\ue758\u17b5\u98c1\uca7a\uea30\u6ffc")), vslr.quote(string)), KUXS$dwji.S("\u3cd7\uaee2\udacb\u85fa\u9aec\ue754\u17b0\u98d0\uca39\uea25\u6f87\u4bea\uc735\u26ba\uf837\u41cf\u80ed\u93fa"))));
        }
    }

    public int getInt(String string) throws TOKE {
        Object object = this.get(string);
        try {
            if (object instanceof Number) {
                return (int)vslr.nh((Number)object);
            }
            return (int)vslr.nh((String)object);
        }
        catch (Exception exception) {
            throw new TOKE((String)vslr.nh(vslr.nh(vslr.nh(new StringBuilder(KUXS$dwji.S("\ufdc4\u1029\ufbb6\u85d4\u92f9\u7ef7\ub083\ua0c6\uc5e7\uee4b\ufedc")), vslr.quote(string)), KUXS$dwji.S("\ufdd3\u105a\ufb90\u85e9\u9296\u7efb\ub086\ua0d7\uc5a4\uee5e\ufee9\u53ee\uc4e5\u8b32\u1e91\uc072"))));
        }
    }

    public HdyI LGKl(String string) throws TOKE {
        Object object = this.get(string);
        if (object instanceof HdyI) {
            return (HdyI)object;
        }
        throw new TOKE((String)vslr.nh(vslr.nh(vslr.nh(new StringBuilder(YEBy$TyVf.W("\u3254\u92e7\u69cb\u9c9d\uaeec\ua8f0\uc2df\u4976\u81f0\uda06\ue770")), vslr.quote(string)), YEBy$TyVf.W("\u3243\u9294\u69ed\u9ca0\uae83\ua8fc\uc2da\u4967\u81b3\uda13\ue70b\u3fb8\u1345\u5124\u440b\ue631\u91b9\ufb03\u62e6\u2b36\uf2c6"))));
    }

    public vslr ykmX(String string) throws TOKE {
        Object object = this.get(string);
        if (object instanceof vslr) {
            return (vslr)object;
        }
        throw new TOKE((String)vslr.nh(vslr.nh(vslr.nh(new StringBuilder(YEBy$TyVf.W("\uf338\u9b4c\ufbad\u8f6f\u9bb9\u8ff8\u04c6\uf84b\uc247\uc769\u87bc")), vslr.quote(string)), YEBy$TyVf.W("\uf32f\u9b3f\ufb8b\u8f52\u9bd6\u8ff4\u04c3\uf85a\uc204\uc77c\u87c7\u9b93\u869f\ufea7\ua097\ud28b\u9a55\u834b\u996a\u47ea\u9581\u5c47"))));
    }

    public long getLong(String string) throws TOKE {
        Object object = this.get(string);
        try {
            if (object instanceof Number) {
                return (long)vslr.nh((Number)object);
            }
            return (long)vslr.nh((String)object);
        }
        catch (Exception exception) {
            throw new TOKE((String)vslr.nh(vslr.nh(vslr.nh(new StringBuilder(YEBy$TyVf.W("\uee0b\u2739\ua7dd\u0dfa\ucf1a\u79aa\uecbc\u4d4e\ub9cf\ue894\u1eb3")), vslr.quote(string)), YEBy$TyVf.W("\uee1c\u274a\ua7fb\u0dc7\ucf75\u79a6\uecb9\u4d5f\ub98c\ue881\u1ec8\u2ff8\ufc01\u01bd\u3aa8\ueb8e"))));
        }
    }

    public static String[] IWSm(vslr vslr2) {
        int n = vslr2.length();
        if (n == 0) {
            return null;
        }
        Iterator<String> iterator = vslr2.keys();
        String[] arrstring = new String[n];
        int n2 = 0;
        while (iterator.hasNext()) {
            arrstring[n2] = iterator.next();
            ++n2;
        }
        return arrstring;
    }

    public static String[] hHYn(Object object) {
        if (object == null) {
            return null;
        }
        Object object2 = vslr.nh(object);
        Field[] arrfield = (Field[])vslr.nh(object2);
        int n = arrfield.length;
        if (n == 0) {
            return null;
        }
        String[] arrstring = new String[n];
        for (int i = 0; i < n; ++i) {
            arrstring[i] = vslr.nh(arrfield[i]);
        }
        return arrstring;
    }

    public String getString(String string) throws TOKE {
        Object object = this.get(string);
        if (object instanceof String) {
            return (String)object;
        }
        throw new TOKE((String)vslr.nh(vslr.nh(vslr.nh(new StringBuilder(rgig$AWxc.r("\ua87b\u73f6\ua42d\ubc81\uf551\ub23d\u8bef\uf831\u3cfe\u011b\u929f")), vslr.quote(string)), rgig$AWxc.r("\ua86c\u7385\ua40c\ubca0\uf56a\ub27f\u8be4\uf874\u3cee\u011b\u92b6\u6a00\ud494\ubfe1\u4ffa"))));
    }

    public boolean has(String string) {
        return ((Map)cv.b(this, -1915815166)).containsKey(string);
    }

    public vslr rwyd(String string) throws TOKE {
        Object object = this.kQcX(string);
        if (object == null) {
            this.IWSm(string, 1);
        } else if (object instanceof BigInteger) {
            this.IWSm(string, vslr.nh((BigInteger)object, (BigInteger)cv.e(1862334709)));
        } else if (object instanceof BigDecimal) {
            this.IWSm(string, vslr.nh((BigDecimal)object, (BigDecimal)cv.e(535296247)));
        } else if (object instanceof Integer) {
            this.IWSm(string, (int)(vslr.nh((Integer)object) + true));
        } else if (object instanceof Long) {
            this.DYFV(string, (long)(vslr.nh((Long)object) + 1));
        } else if (object instanceof Double) {
            this.DYFV(string, (double)(vslr.nh((Double)object) + 1.0));
        } else if (object instanceof Float) {
            this.DYFV(string, (double)(vslr.nh((Float)object) + 1.0f));
        } else {
            throw new TOKE((String)vslr.nh(vslr.nh(vslr.nh(new StringBuilder(YEBy$TyVf.W("\ub27c\ue58c\ufe46\u1dbc\uac44\u4020\u4b66\uac09\u5e75\ua4e9\u6c8e\ua414\u037c\u63d4\u6673\uac6e\uc9df\ud620\uee21\u13f8\uc887")), vslr.quote(string)), YEBy$TyVf.W("\ub274\ue5cc"))));
        }
        return this;
    }

    public boolean hHYn(String string) {
        return (boolean)vslr.nh(cv.e(-335152310), this.kQcX(string));
    }

    public Iterator<String> keys() {
        return this.keySet().iterator();
    }

    public Set<String> keySet() {
        return ((Map)cv.b(this, -1915815166)).keySet();
    }

    public int length() {
        return ((Map)cv.b(this, -1915815166)).size();
    }

    public HdyI SLHs() {
        HdyI hdyI = new HdyI();
        Iterator<String> iterator = this.keys();
        while (iterator.hasNext()) {
            vslr.nh(hdyI, iterator.next());
        }
        if (vslr.nh(hdyI) == false) {
            return null;
        }
        return hdyI;
    }

    public static String ssNb(Number number) throws TOKE {
        if (number == null) {
            throw new TOKE(rgig$AWxc.r("\ub435\ub5ea\u189c\u871f\u3e5a\u6b4f\u5960\ua209\u5801\uc90d\ueba5\uef4a"));
        }
        vslr.rMgK(number);
        Object object = vslr.nh(number);
        if (vslr.nh(object, 46) > 0) {
            if (vslr.nh(object, 101) < 0) {
                if (vslr.nh(object, 69) < 0) {
                    do {
                        if (vslr.nh(object, rgig$AWxc.r("\ub44b")) == false) break;
                        object = vslr.nh(object, false, vslr.nh(object) - true);
                    } while (true);
                    if (vslr.nh(object, rgig$AWxc.r("\ub455")) != false) {
                        object = vslr.nh(object, false, vslr.nh(object) - true);
                    }
                }
            }
        }
        return object;
    }

    public Object kQcX(String string) {
        if (string == null) {
            return null;
        }
        return ((Map)cv.b(this, -1915815166)).get(string);
    }

    public <E extends Enum<E>> E ssNb(Class<E> class_, String string) {
        return this.ssNb(class_, string, null);
    }

    public <E extends Enum<E>> E ssNb(Class<E> class_, String string, E e) {
        try {
            Object object = this.kQcX(string);
            if (vslr.nh(cv.e(-335152310), object) != false) {
                return e;
            }
            if (vslr.nh(class_, vslr.nh(object)) != false) {
                Enum enum_ = (Enum)object;
                return (E)enum_;
            }
            return (E)vslr.nh(class_, vslr.nh(object));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return e;
        }
        catch (NullPointerException nullPointerException) {
            return e;
        }
    }

    public boolean rMgK(String string) {
        return this.ssNb(string, false);
    }

    public boolean ssNb(String string, boolean bl) {
        try {
            return this.getBoolean(string);
        }
        catch (Exception exception) {
            return bl;
        }
    }

    public double cIji(String string) {
        return this.ssNb(string, Double.NaN);
    }

    public BigInteger ssNb(String string, BigInteger bigInteger) {
        try {
            return this.TyVf(string);
        }
        catch (Exception exception) {
            return bigInteger;
        }
    }

    public BigDecimal ssNb(String string, BigDecimal bigDecimal) {
        try {
            return this.getBigDecimal(string);
        }
        catch (Exception exception) {
            return bigDecimal;
        }
    }

    public double ssNb(String string, double d) {
        try {
            return this.getDouble(string);
        }
        catch (Exception exception) {
            return d;
        }
    }

    public int Cnru(String string) {
        return this.DYFV(string, 0);
    }

    public int DYFV(String string, int n) {
        try {
            return this.getInt(string);
        }
        catch (Exception exception) {
            return n;
        }
    }

    public HdyI LWjo(String string) {
        Object object = this.kQcX(string);
        if (object instanceof HdyI) {
            return (HdyI)object;
        }
        return null;
    }

    public vslr PuYf(String string) {
        Object object = this.kQcX(string);
        if (object instanceof vslr) {
            return (vslr)object;
        }
        return null;
    }

    public long TNbD(String string) {
        return this.ssNb(string, 0);
    }

    public long ssNb(String string, long l) {
        try {
            return this.getLong(string);
        }
        catch (Exception exception) {
            return l;
        }
    }

    public String LGKN(String string) {
        return this.ssNb(string, "");
    }

    public String ssNb(String string, String string2) {
        Object object = this.kQcX(string);
        if (vslr.nh(cv.e(-335152310), object) != false) {
            return string2;
        }
        return vslr.nh(object);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void kQcX(Object var1_1) {
        var2_2 = vslr.nh(var1_1);
        var3_3 = vslr.nh(var2_2) != null;
        var4_4 = var3_3 ? (Method[])vslr.nh(var2_2) : (Method[])vslr.nh(var2_2);
        var5_5 = 0;
        while (var5_5 < var4_4.length) {
            block13 : {
                try {
                    block15 : {
                        block14 : {
                            var6_6 = var4_4[var5_5];
                            if (vslr.nh(vslr.nh(var6_6)) == false) break block13;
                            var7_8 = vslr.nh(var6_6);
                            var8_9 = "";
                            if (vslr.nh(var7_8, KUXS$dwji.S("\ud80e\ubc3c\u600b")) == false) break block14;
                            if (vslr.nh(KUXS$dwji.S("\ud80e\ubc3c\u600b\u6661\u1f79\uae3a\u2b8a\u0632"), var7_8) != false) ** GOTO lbl-1000
                            if (vslr.nh(KUXS$dwji.S("\ud80e\ubc3c\u600b\u6666\u1f70\uae38\u2b95\u0620\ueff1\u6062\ue64a\uf305\u8975\u2b3e\ub2e2\ueabe\ud00f"), var7_8) != false) lbl-1000: // 2 sources:
                            {
                                var8_9 = "";
                            } else {
                                var8_9 = vslr.nh(var7_8, 3);
                            }
                            break block15;
                        }
                        if (vslr.nh(var7_8, KUXS$dwji.S("\ud800\ubc2a")) != false) {
                            var8_9 = vslr.nh(var7_8, 2);
                        }
                    }
                    if (vslr.nh(var8_9) > 0) {
                        if (vslr.nh(vslr.nh(var8_9, false)) != false) {
                            if (((Class[])vslr.nh(var6_6)).length == 0) {
                                if (vslr.nh(var8_9) == true) {
                                    var8_9 = vslr.nh(var8_9);
                                } else if (vslr.nh(vslr.nh(var8_9, true)) == false) {
                                    var8_9 = vslr.nh(vslr.nh(vslr.nh(new StringBuilder(), vslr.nh(vslr.nh(var8_9, false, true))), vslr.nh(var8_9, true)));
                                }
                                if ((var9_10 = vslr.nh(var6_6, var1_1, null)) != null) {
                                    ((Map)cv.b(this, -1915815166)).put(var8_9, vslr.wrap(var9_10));
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

    public vslr DYFV(String string, boolean bl) throws TOKE {
        this.IWSm(string, bl ? (Boolean)cv.e(-811926723) : (Boolean)cv.e(-1234961614));
        return this;
    }

    public vslr ssNb(String string, Collection<Object> collection) throws TOKE {
        this.IWSm(string, new HdyI(collection));
        return this;
    }

    public vslr DYFV(String string, double d) throws TOKE {
        this.IWSm(string, new Double(d));
        return this;
    }

    public vslr IWSm(String string, int n) throws TOKE {
        this.IWSm(string, new Integer(n));
        return this;
    }

    public vslr DYFV(String string, long l) throws TOKE {
        this.IWSm(string, new Long(l));
        return this;
    }

    public vslr ssNb(String string, Map<String, Object> map) throws TOKE {
        this.IWSm(string, new vslr(map));
        return this;
    }

    public vslr IWSm(String string, Object object) throws TOKE {
        if (string == null) {
            throw new NullPointerException(YEBy$TyVf.W("\udc79\u010f\uee68\u4a46\ufd20\u018a\u7f8c\ue6fb\u671b"));
        }
        if (object != null) {
            vslr.rMgK(object);
            ((Map)cv.b(this, -1915815166)).put(string, object);
        } else {
            this.NUdB(string);
        }
        return this;
    }

    public vslr OXeK(String string, Object object) throws TOKE {
        if (string != null && object != null) {
            if (this.kQcX(string) != null) {
                throw new TOKE((String)vslr.nh(vslr.nh(vslr.nh(new StringBuilder(KUXS$dwji.S("\u436f\uf2a1\ud68d\udc2e\u1480\u9d19\u3071\u7abe\u0b1f\u1bd8\u1950\uf5eb\u1b01\u5390\uaede")), string), KUXS$dwji.S("\u4309"))));
            }
            this.IWSm(string, object);
        }
        return this;
    }

    public vslr YoSa(String string, Object object) throws TOKE {
        if (string != null && object != null) {
            this.IWSm(string, object);
        }
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String quote(String string) {
        StringWriter stringWriter = new StringWriter();
        Object object = vslr.nh(stringWriter);
        synchronized (object) {
            try {
                return vslr.nh(vslr.ssNb(string, stringWriter));
            }
            catch (IOException iOException) {
                return "";
            }
        }
    }

    public static Writer ssNb(String string, Writer writer) throws IOException {
        block16 : {
            block15 : {
                if (string == null) break block15;
                if (vslr.nh(string) != false) break block16;
            }
            vslr.nh(writer, KUXS$dwji.S("\u2cfc\u123e"));
            return writer;
        }
        Object object = 0;
        Object object2 = vslr.nh(string);
        vslr.nh(writer, 34);
        block9 : for (int i = 0; i < object2; ++i) {
            int n = object;
            Object object3 = vslr.nh(string, i);
            object = object3;
            switch (object3) {
                case 34: 
                case 92: {
                    vslr.nh(writer, 92);
                    vslr.nh(writer, object);
                    continue block9;
                }
                case 47: {
                    if (n == 60) {
                        vslr.nh(writer, 92);
                    }
                    vslr.nh(writer, object);
                    continue block9;
                }
                case 8: {
                    vslr.nh(writer, KUXS$dwji.S("\u2c82\u127e"));
                    continue block9;
                }
                case 9: {
                    vslr.nh(writer, KUXS$dwji.S("\u2c82\u1268"));
                    continue block9;
                }
                case 10: {
                    vslr.nh(writer, KUXS$dwji.S("\u2c82\u1272"));
                    continue block9;
                }
                case 12: {
                    vslr.nh(writer, KUXS$dwji.S("\u2c82\u127a"));
                    continue block9;
                }
                case 13: {
                    vslr.nh(writer, KUXS$dwji.S("\u2c82\u126e"));
                    continue block9;
                }
                default: {
                    if (object < 32 || object >= 128 && object < 160 || object >= 8192 && object < 8448) {
                        vslr.nh(writer, KUXS$dwji.S("\u2c82\u1269"));
                        Object object4 = vslr.nh(object);
                        vslr.nh(writer, KUXS$dwji.S("\u2cee\u122c\ucebc\ua7b3"), false, 4 - vslr.nh(object4));
                        vslr.nh(writer, object4);
                        continue block9;
                    }
                    vslr.nh(writer, object);
                }
            }
        }
        vslr.nh(writer, 34);
        return writer;
    }

    public Object NUdB(String string) {
        return ((Map)cv.b(this, -1915815166)).remove(string);
    }

    public boolean rwyd(Object object) {
        if (!(object instanceof vslr)) {
            return false;
        }
        try {
            Set<String> set = this.keySet();
            if (!set.equals(((vslr)object).keySet())) {
                return false;
            }
            for (String string : set) {
                Object object2 = this.get(string);
                Object object3 = ((vslr)object).get(string);
                if (object2 instanceof vslr) {
                    if (((vslr)object2).rwyd(object3)) continue;
                    return false;
                }
                if (object2 instanceof HdyI) {
                    if (vslr.nh((HdyI)object2, object3) != false) continue;
                    return false;
                }
                if (vslr.nh(object2, object3) != false) continue;
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
        if (vslr.nh(string, "") != false) {
            return string;
        }
        if (vslr.nh(string, KUXS$dwji.S("\u8e64\ub6c7\uf730\u9c22")) != false) {
            return (Boolean)cv.e(-811926723);
        }
        if (vslr.nh(string, KUXS$dwji.S("\u8e76\ub6d4\uf729\u9c34\u7c8c")) != false) {
            return (Boolean)cv.e(-1234961614);
        }
        if (vslr.nh(string, KUXS$dwji.S("\u8e7e\ub6c0\uf729\u9c2b")) != false) {
            return cv.e(-335152310);
        }
        Object object = vslr.nh(string, false);
        if (object < 48 || object > 57) {
            if (object != 45) return string;
        }
        try {
            if (vslr.nh(string, 46) < 0) {
                if (vslr.nh(string, 101) < 0) {
                    if (vslr.nh(string, 69) < 0) {
                        Long l = new Long(string);
                        if (vslr.nh(string, vslr.nh(l)) == false) return string;
                        if (vslr.nh(l) != (Object)vslr.nh(l)) return l;
                        return vslr.nh(vslr.nh(l));
                    }
                }
            }
            Object object2 = vslr.nh(string);
            if (vslr.nh(object2) != false) return string;
            if (vslr.nh(object2) != false) return string;
            return object2;
        }
        catch (Exception exception) {
            // empty catch block
        }
        return string;
    }

    public static void rMgK(Object object) throws TOKE {
        block6 : {
            block9 : {
                block7 : {
                    block8 : {
                        if (object == null) break block6;
                        if (!(object instanceof Double)) break block7;
                        if (vslr.nh((Double)object) != false) break block8;
                        if (vslr.nh((Double)object) == false) break block6;
                    }
                    throw new TOKE(KUXS$dwji.S("\ua427\u9d18\u6f88\u7ec8\u2eb6\ue1a9\u6333\ud448\u9931\uc4f9\ue540\u5bcf\u6eca\u22f8\u7ce9\ude94\u19e9\u19c5\u524a\u2b42\u8846\uab8a\u353a\ua295\u250f\ueb26\uc1b6\u9918\u7b37\u7655\u8f0c\u0a54\udd35\u3445\ucdb4\u8be0\u01b1\u957a\u9596"));
                }
                if (!(object instanceof Float)) break block6;
                if (vslr.nh((Float)object) != false) break block9;
                if (vslr.nh((Float)object) == false) break block6;
            }
            throw new TOKE(KUXS$dwji.S("\ua427\u9d18\u6f88\u7ec8\u2eb6\ue1a9\u6333\ud448\u9931\uc4f9\ue540\u5bcf\u6eca\u22f8\u7ce9\ude94\u19e9\u19c5\u524a\u2b42\u8846\uab8a\u353a\ua295\u250f\ueb26\uc1b6\u9918\u7b37\u7655\u8f0c\u0a54\udd35\u3445\ucdb4\u8be0\u01b1\u957a\u9596"));
        }
    }

    public HdyI IWSm(HdyI hdyI) throws TOKE {
        block4 : {
            block3 : {
                if (hdyI == null) break block3;
                if (vslr.nh(hdyI) != false) break block4;
            }
            return null;
        }
        HdyI hdyI2 = new HdyI();
        int n = 0;
        do {
            if (n >= vslr.nh(hdyI)) break;
            vslr.nh(hdyI2, this.kQcX((String)vslr.nh(hdyI, n)));
            ++n;
        } while (true);
        return hdyI2;
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
    public String toString(int n) throws TOKE {
        StringWriter stringWriter = new StringWriter();
        Object object = vslr.nh(stringWriter);
        synchronized (object) {
            return vslr.nh(this.ssNb(stringWriter, n, 0));
        }
    }

    public static String valueToString(Object object) throws TOKE {
        block14 : {
            block13 : {
                if (object == null) break block13;
                if (vslr.nh(object, null) == false) break block14;
            }
            return KUXS$dwji.S("\u0315\ud91e\u9b4b\uc9ec");
        }
        if (object instanceof HTYB) {
            String string;
            try {
                string = ((HTYB)object).toJSONString();
            }
            catch (Exception exception) {
                throw new TOKE(exception);
            }
            if (string instanceof String) {
                return string;
            }
            throw new TOKE((String)vslr.nh(vslr.nh(new StringBuilder(KUXS$dwji.S("\u0339\ud90a\u9b43\uc9a0\u078d\ua18d\u9df7\uc2e7\u8c4a\u4102\u4947\ud9a1\u0c20\u8710\u0c33\uc318\uf259\u9ace\u2c0d\u2e31\u5213\u1bd9\ubfcc\u247b\u3a8a\ub00e\u35b0\ubd64\u3bcf")), string)));
        }
        if (object instanceof Number) {
            return vslr.ssNb((Number)object);
        }
        if (object instanceof Boolean || object instanceof vslr || object instanceof HdyI) {
            return vslr.nh(object);
        }
        if (object instanceof Map) {
            Map map = (Map)object;
            return new vslr(map).toString();
        }
        if (object instanceof Collection) {
            Collection collection = (Collection)object;
            return vslr.nh(new HdyI(collection));
        }
        if (vslr.nh(vslr.nh(object)) != false) {
            return vslr.nh(new HdyI(object));
        }
        return vslr.quote((String)vslr.nh(object));
    }

    public static Object wrap(Object object) {
        try {
            block15 : {
                block14 : {
                    block13 : {
                        block12 : {
                            if (object == null) {
                                return cv.e(-335152310);
                            }
                            if (object instanceof vslr || object instanceof HdyI) break block12;
                            if (vslr.nh(cv.e(-335152310), object) == false && !(object instanceof HTYB) && !(object instanceof Byte) && !(object instanceof Character) && !(object instanceof Short) && !(object instanceof Integer) && !(object instanceof Long) && !(object instanceof Boolean) && !(object instanceof Float) && !(object instanceof Double) && !(object instanceof String) && !(object instanceof BigInteger) && !(object instanceof BigDecimal)) break block13;
                        }
                        return object;
                    }
                    if (object instanceof Collection) {
                        Collection collection = (Collection)object;
                        return new HdyI(collection);
                    }
                    if (vslr.nh(vslr.nh(object)) != false) {
                        return new HdyI(object);
                    }
                    if (object instanceof Map) {
                        Map map = (Map)object;
                        return new vslr(map);
                    }
                    Object object2 = vslr.nh(vslr.nh(object));
                    Object object3 = object2 != null ? vslr.nh(object2) : "";
                    if (vslr.nh(object3, KUXS$dwji.S("\uf30b\u5a15\u1965\u81f2\u6e21")) != false) break block14;
                    if (vslr.nh(object3, KUXS$dwji.S("\uf30b\u5a15\u1965\u81f2\u6e77\uf941")) != false) break block14;
                    if (vslr.nh(vslr.nh(object)) != null) break block15;
                }
                return vslr.nh(object);
            }
            return new vslr(object);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public Writer ssNb(Writer writer) throws TOKE {
        return this.ssNb(writer, 0, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static final Writer ssNb(Writer writer, Object object, int n, int n2) throws TOKE, IOException {
        block13 : {
            block12 : {
                if (object == null) break block12;
                if (vslr.nh(object, null) == false) break block13;
            }
            vslr.nh(writer, rgig$AWxc.r("\ub415\ub5ea\u189c\u871f"));
            return writer;
        }
        if (object instanceof vslr) {
            ((vslr)object).ssNb(writer, n, n2);
            return writer;
        }
        if (object instanceof HdyI) {
            vslr.nh((HdyI)object, writer, n, n2);
            return writer;
        }
        if (object instanceof Map) {
            Map map = (Map)object;
            new vslr(map).ssNb(writer, n, n2);
            return writer;
        }
        if (object instanceof Collection) {
            Collection collection = (Collection)object;
            vslr.nh(new HdyI(collection), writer, n, n2);
            return writer;
        }
        if (vslr.nh(vslr.nh(object)) != false) {
            vslr.nh(new HdyI(object), writer, n, n2);
            return writer;
        }
        if (object instanceof Number) {
            vslr.nh(writer, vslr.ssNb((Number)object));
            return writer;
        }
        if (object instanceof Boolean) {
            vslr.nh(writer, vslr.nh(object));
            return writer;
        }
        if (object instanceof HTYB) {
            String string;
            try {
                string = ((HTYB)object).toJSONString();
            }
            catch (Exception exception) {
                throw new TOKE(exception);
            }
            vslr.nh(writer, string != null ? vslr.nh(string) : vslr.quote((String)vslr.nh(object)));
            return writer;
        }
        vslr.ssNb((String)vslr.nh(object), writer);
        return writer;
    }

    static final void ssNb(Writer writer, int n) throws IOException {
        for (int i = 0; i < n; ++i) {
            vslr.nh(writer, 32);
        }
    }

    Writer ssNb(Writer writer, int n, int n2) throws TOKE {
        try {
            boolean bl = false;
            int n3 = this.length();
            Iterator<String> iterator = this.keys();
            vslr.nh(writer, 123);
            if (n3 == 1) {
                String string = iterator.next();
                vslr.nh(writer, vslr.quote((String)vslr.nh(string)));
                vslr.nh(writer, 58);
                if (n > 0) {
                    vslr.nh(writer, 32);
                }
                vslr.ssNb(writer, ((Map)cv.b(this, -1915815166)).get(string), n, n2);
            } else if (n3 != 0) {
                int n4 = n2 + n;
                while (iterator.hasNext()) {
                    String string = iterator.next();
                    if (bl) {
                        vslr.nh(writer, 44);
                    }
                    if (n > 0) {
                        vslr.nh(writer, 10);
                    }
                    vslr.ssNb(writer, n4);
                    vslr.nh(writer, vslr.quote((String)vslr.nh(string)));
                    vslr.nh(writer, 58);
                    if (n > 0) {
                        vslr.nh(writer, 32);
                    }
                    vslr.ssNb(writer, ((Map)cv.b(this, -1915815166)).get(string), n, n4);
                    bl = true;
                }
                if (n > 0) {
                    vslr.nh(writer, 10);
                }
                vslr.ssNb(writer, n2);
            }
            vslr.nh(writer, 125);
            return writer;
        }
        catch (IOException iOException) {
            throw new TOKE(iOException);
        }
    }

    static {
        cv.V(-335152310, new vslr$ssNb(null));
    }

    private static Object nh(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


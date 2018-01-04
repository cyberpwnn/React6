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

public class vbpi {
    private final Map<String, Object> map = new HashMap<String, Object>();
    public static final Object ejua;

    static {
        o.w(671498640, new vbpi$yJLS(null));
    }

    public vbpi() {
    }

    public vbpi(vbpi vbpi2, String[] arrstring) {
        this();
        int n = 0;
        while (n < arrstring.length) {
            try {
                this.VwLY(arrstring[n], vbpi2.Dqxl(arrstring[n]));
            }
            catch (Exception exception) {
                // empty catch block
            }
            ++n;
        }
    }

    public vbpi(IqTB iqTB) throws gggG {
        this();
        if (vbpi.UH(iqTB) != 123) {
            throw vbpi.UH(iqTB, mrFx$WjFM.d("\u5c4f\u56bf\uca6c\u1962\ufcca\u1e0d\u4980\u86f3\uec82\ue01a\u4929\u24d4\u5f74\u515a\u7af1\u89db\u146b\ud32c\u83a3\u9e7c\ud78c\u6b43\uc3b8\uf4e8\ub7d9\u8be2\u1278\u7be0\ua730\u212f\u2734\uc4c2\u8a27\u6526\uf000\u7f83\u2a3c"));
        }
        block8 : do {
            Object object = vbpi.UH(iqTB);
            switch (object) {
                case 0: {
                    throw vbpi.UH(iqTB, mrFx$WjFM.d("\u5c4f\u56bf\uca6c\u1962\ufcca\u1e0d\u4980\u86f3\uec82\ue01a\u4929\u24d4\u5f74\u515a\u7af1\u89db\u146b\ud32c\u83a3\u9e7c\ud78c\u6b43\uc3b8\uf4ef\ub7d2\u8be1\u1231\u7bf9\ua779\u212c\u2735\uc496\u8a68\u657b\uf000"));
                }
                case 125: {
                    return;
                }
            }
            vbpi.UH(iqTB);
            Object object2 = vbpi.UH(vbpi.UH(iqTB));
            object = vbpi.UH(iqTB);
            if (object != 58) {
                throw vbpi.UH(iqTB, mrFx$WjFM.d("\u5c4b\u56e7\uca56\u1954\ufce6\u1e37\u49aa\u86f5\uecc8\ue01e\u496a\u2487\u5f6e\u5109\u7ab4\u89c2\u1479\ud378\u83ab\u9e7b\ud7df\u6b56\uc3b8\uf4e1\ub7d9\u8bfc"));
            }
            this.VwLY((String)object2, vbpi.UH(iqTB));
            switch (vbpi.UH(iqTB)) {
                case 44: 
                case 59: {
                    if (vbpi.UH(iqTB) == 125) {
                        return;
                    }
                    vbpi.UH(iqTB);
                    continue block8;
                }
                case 125: {
                    return;
                }
            }
            break;
        } while (true);
        throw vbpi.UH(iqTB, mrFx$WjFM.d("\u5c4b\u56e7\uca56\u1954\ufce6\u1e37\u49aa\u86f5\uecc8\ue01e\u496a\u2487\u5f78\u5109\u7ab4\u89cc\u146d\ud32c\u83e9\u9e74\ud7d8"));
    }

    public vbpi(Map<String, Object> map) {
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Object object = entry.getValue();
                if (object == null) continue;
                ((Map)o.a(this, -1299759013)).put(entry.getKey(), vbpi.wrap(object));
            }
        }
    }

    public vbpi(Object object) {
        this();
        this.uVol(object);
    }

    public vbpi(Object object, String[] arrstring) {
        this();
        Object object2 = vbpi.UH(object);
        int n = 0;
        while (n < arrstring.length) {
            String string = arrstring[n];
            try {
                this.TEqA(string, vbpi.UH(vbpi.UH(object2, string), object));
            }
            catch (Exception exception) {
                // empty catch block
            }
            ++n;
        }
    }

    public vbpi(String string) throws gggG {
        this(new IqTB(string));
    }

    public vbpi(String string, Locale locale) throws gggG {
        this();
        Object object = vbpi.UH(string, locale, vbpi.UH(vbpi.UH()));
        Object object2 = vbpi.UH(object);
        while (object2.hasMoreElements()) {
            Object e = object2.nextElement();
            if (e == null) continue;
            String[] arrstring = (String[])vbpi.UH((String)e, mrFx$WjFM.d("\u5c52\u56b1"));
            int n = arrstring.length - 1;
            vbpi vbpi2 = this;
            int n2 = 0;
            while (n2 < n) {
                String string2 = arrstring[n2];
                vbpi vbpi3 = vbpi2.Ywen(string2);
                if (vbpi3 == null) {
                    vbpi3 = new vbpi();
                    vbpi2.biLo(string2, vbpi3);
                }
                vbpi2 = vbpi3;
                ++n2;
            }
            vbpi2.biLo(arrstring[n], vbpi.UH(object, (String)e));
        }
    }

    public vbpi yJLS(String string, Object object) throws gggG {
        vbpi.dfaE(object);
        Object object2 = this.Dqxl(string);
        if (object2 == null) {
            this.biLo(string, object instanceof JRRx ? vbpi.UH(new JRRx(), object) : object);
        } else if (object2 instanceof JRRx) {
            vbpi.UH((JRRx)object2, object);
        } else {
            this.biLo(string, vbpi.UH(vbpi.UH(new JRRx(), object2), object));
        }
        return this;
    }

    public vbpi UtIU(String string, Object object) throws gggG {
        vbpi.dfaE(object);
        Object object2 = this.Dqxl(string);
        if (object2 == null) {
            this.biLo(string, vbpi.UH(new JRRx(), object));
        } else if (object2 instanceof JRRx) {
            this.biLo(string, vbpi.UH((JRRx)object2, object));
        } else {
            throw new gggG((String)vbpi.UH(vbpi.UH(vbpi.UH(new StringBuilder(mrFx$WjFM.d("\u2e81\ufff0\ud6fa\uc08d\ub0b8\ua5df\uc139\u921b\u61d2\u99fa\u5a44")), string), mrFx$WjFM.d("\u2e96\uff83\ud6dc\uc0b0\ub0d7\ua5d3\uc13c\u920a\u6191\u99ef\u5a3f\uf49d\u8bb7\u7983\ua025\u4ae3\u3706\ucf86\uf593\ub229\uc803"))));
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String bhkI(double d) {
        if (vbpi.UH(d) != false) return FMkR$WjFM.a("\u6f49\u0e0d\ub053\u863e");
        if (vbpi.UH(d) != false) {
            return FMkR$WjFM.a("\u6f49\u0e0d\ub053\u863e");
        }
        Object object = vbpi.UH(d);
        if (vbpi.UH(object, 46) <= 0) return object;
        if (vbpi.UH(object, 101) >= 0) return object;
        if (vbpi.UH(object, 69) >= 0) return object;
        while (vbpi.UH(object, FMkR$WjFM.a("\u6f17")) != false) {
            object = vbpi.UH(object, false, vbpi.UH(object) - true);
        }
        if (vbpi.UH(object, FMkR$WjFM.a("\u6f09")) == false) return object;
        return vbpi.UH(object, false, vbpi.UH(object) - true);
    }

    public Object get(String string) throws gggG {
        if (string == null) {
            throw new gggG(FMkR$WjFM.a("\u92c6\ubc45\ubf05\ucfa4\uffde\u6dab\u2507\u54bb\u3d4d"));
        }
        Object object = this.Dqxl(string);
        if (object == null) {
            throw new gggG((String)vbpi.UH(vbpi.UH(vbpi.UH(new StringBuilder(FMkR$WjFM.a("\u92c2\ubc63\ubf26\ucf86\uffb1\u6da2\u2508\u54a7\u3d00\uc4b8\u2d26")), vbpi.quote(string)), FMkR$WjFM.a("\u92d5\ubc10\ubf07\ucfa7\uff8a\u6de0\u2504\u54ad\u3d16\uc4a2\u2d19\ua750"))));
        }
        return object;
    }

    public <E extends Enum<E>> E getEnum(Class<E> class_, String string) throws gggG {
        E e = this.yJLS(class_, string);
        if (e == null) {
            throw new gggG((String)vbpi.UH(vbpi.UH(vbpi.UH(vbpi.UH(vbpi.UH(new StringBuilder(nJPf$sILv.G("\u064d\ue236\u02fe\uf6ce\u1bd1\u4080\u0551\u57d9\uc9f9\u3b7b\ua3bd")), vbpi.quote(string)), nJPf$sILv.G("\u065a\ue245\u02d8\uf6f3\u1bbe\u408c\u0554\u57c8\uc9ba\u3b6e\ua388\u5f32\uc102\u1c09\ucb39\u2289\u0413\u7524\ue31e\u442b\ue6e4\u03e1\u7f00\uecab\u0bf1")), vbpi.quote((String)vbpi.UH(class_))), nJPf$sILv.G("\u0629"))));
        }
        return e;
    }

    public boolean getBoolean(String string) throws gggG {
        block7 : {
            block6 : {
                Object object;
                block5 : {
                    block4 : {
                        object = this.get(string);
                        if (vbpi.UH(object, (Boolean)o.k(-1311620710)) != false) break block4;
                        if (!(object instanceof String)) break block5;
                        if (vbpi.UH((String)object, FMkR$WjFM.a("\uc3cb\u6ce2\u1cbd\u28ce\u47d0")) == false) break block5;
                    }
                    return false;
                }
                if (vbpi.UH(object, (Boolean)o.k(-316456551)) != false) break block6;
                if (!(object instanceof String)) break block7;
                if (vbpi.UH((String)object, FMkR$WjFM.a("\uc3d9\u6cf1\u1ca4\u28d8")) == false) break block7;
            }
            return true;
        }
        throw new gggG((String)vbpi.UH(vbpi.UH(vbpi.UH(new StringBuilder(FMkR$WjFM.a("\uc3e7\u6cd0\u1c9e\u28f3\u47fa\uadc3\u9489\u3644\u983e\u782c\u0201")), vbpi.quote(string)), FMkR$WjFM.a("\uc3f0\u6ca3\u1cb8\u28ce\u4795\uadcf\u948c\u3655\u987d\u7839\u027a\u84a7\uaba8\ua7cf\u3c23\u4d70\u607d\u9699\u297d"))));
    }

    public BigInteger WOYg(String string) throws gggG {
        Object object = this.get(string);
        try {
            return new BigInteger((String)vbpi.UH(object));
        }
        catch (Exception exception) {
            throw new gggG((String)vbpi.UH(vbpi.UH(vbpi.UH(new StringBuilder(FMkR$WjFM.a("\u3b84\ub69c\ua306\ub964\u677b\ua7d6\u03d8\u0143\u4473\u1ac6\u9edf")), vbpi.quote(string)), FMkR$WjFM.a("\u3b93\ub6ef\ua32a\ub945\u6741\ua7d8\u03d6\u0106\u447e\u1add\u9ef0\u78c5\uf167\u2f40\u19da\u8492\u8b85\ufbe0\u7849\u153f\uf949\ub8c6\u483f\u0d74\uf828\u3ab6\u77b2\u8d0a\u91ac\ub227\u4021\u09da\u8cc2\u5a1e\u9086\u926c\u8c00\ued28\u6494"))));
        }
    }

    public BigDecimal getBigDecimal(String string) throws gggG {
        Object object = this.get(string);
        try {
            return new BigDecimal((String)vbpi.UH(object));
        }
        catch (Exception exception) {
            throw new gggG((String)vbpi.UH(vbpi.UH(vbpi.UH(new StringBuilder(FMkR$WjFM.a("\uf3b9\u950a\u30d7\u07ff\uea34\ub89b\ue3aa\uf910\u3e40\u3626\u210c")), vbpi.quote(string)), FMkR$WjFM.a("\uf3ae\u9579\u30fb\u07de\uea0e\ub895\ue3a4\uf955\u3e4d\u363d\u2123\ue9c1\u4437\ua506\u94d9\u0795\u767d\u3a73\u9e70\ue37c\u7a42\u406f\u9c9b\u51c4\u244b\u5f8e\u62c8\uf6ca\ue23f\u6f28\uddb8\u5ed9\ud0df\ua154\u307d\u5b2d\udf92\ueeef\u4953"))));
        }
    }

    public double getDouble(String string) throws gggG {
        Object object = this.get(string);
        try {
            if (object instanceof Number) {
                return (double)vbpi.UH((Number)object);
            }
            return (double)vbpi.UH((String)object);
        }
        catch (Exception exception) {
            throw new gggG((String)vbpi.UH(vbpi.UH(vbpi.UH(new StringBuilder(FMkR$WjFM.a("\u6ada\u8d94\u25ba\uffd6\u8cb3\u28b9\u276e\u44d8\u4c8b\u292a\u6ec0")), vbpi.quote(string)), FMkR$WjFM.a("\u6acd\u8de7\u259c\uffeb\u8cdc\u28b5\u276b\u44c9\u4cc8\u293f\u6ebb\u012d\u488f\u2804\u35d0\u5756\udea7\u4702"))));
        }
    }

    public int getInt(String string) throws gggG {
        Object object = this.get(string);
        try {
            if (object instanceof Number) {
                return (int)vbpi.UH((Number)object);
            }
            return (int)vbpi.UH((String)object);
        }
        catch (Exception exception) {
            throw new gggG((String)vbpi.UH(vbpi.UH(vbpi.UH(new StringBuilder(nJPf$sILv.G("\uda6e\ua181\ueeae\ub0f3\u241d\u4d5d\u3df9\ufe2c\u0e56\uef17\uf762")), vbpi.quote(string)), nJPf$sILv.G("\uda79\ua1f2\uee88\ub0ce\u2472\u4d51\u3dfc\ufe3d\u0e15\uef02\uf757\u5e77\u6dee\u39d0\u812e\u5623"))));
        }
    }

    public JRRx IEpg(String string) throws gggG {
        Object object = this.get(string);
        if (object instanceof JRRx) {
            return (JRRx)object;
        }
        throw new gggG((String)vbpi.UH(vbpi.UH(vbpi.UH(new StringBuilder(nJPf$sILv.G("\udccd\uf37c\uc550\u5f1e\u5b63\u98be\udefd\u8684\ubd59\uefd8\ue7c9")), vbpi.quote(string)), nJPf$sILv.G("\udcda\uf30f\uc576\u5f23\u5b0c\u98b2\udef8\u8695\ubd1a\uefcd\ue7b2\u7bae\uc792\u1357\u96b1\uab0d\u1561\u00e7\u5e71\uda0c\u827b"))));
    }

    public vbpi PKGC(String string) throws gggG {
        Object object = this.get(string);
        if (object instanceof vbpi) {
            return (vbpi)object;
        }
        throw new gggG((String)vbpi.UH(vbpi.UH(vbpi.UH(new StringBuilder(mrFx$WjFM.d("\u8913\u3095\u6aa0\u65d4\u77ca\udfb6\u09e4\u7cd2\ud634\u7257\ub965")), vbpi.quote(string)), mrFx$WjFM.d("\u8904\u30e6\u6a86\u65e9\u77a5\udfba\u09e1\u7cc3\ud677\u7242\ub91e\ueb6b\u12f8\u1186\u68bc\uf21c\u1b83\u310a\u7344\u6e3b\ubeab\u78c0"))));
    }

    public long getLong(String string) throws gggG {
        Object object = this.get(string);
        try {
            if (object instanceof Number) {
                return (long)vbpi.UH((Number)object);
            }
            return (long)vbpi.UH((String)object);
        }
        catch (Exception exception) {
            throw new gggG((String)vbpi.UH(vbpi.UH(vbpi.UH(new StringBuilder(FMkR$WjFM.a("\u74fb\u07a8\uc565\ufd7e\u585a\u6447\ubc25\u1f36\u7aa7\u5f17\udc93")), vbpi.quote(string)), FMkR$WjFM.a("\u74ec\u07db\uc543\ufd43\u5835\u644b\ubc20\u1f27\u7ae4\u5f02\udce8\ub2d2\u3745\u32ed\u5ef3\ubf5f"))));
        }
    }

    public static String[] biLo(vbpi vbpi2) {
        int n = vbpi2.length();
        if (n == 0) {
            return null;
        }
        Iterator<String> iterator = vbpi2.keys();
        String[] arrstring = new String[n];
        int n2 = 0;
        while (iterator.hasNext()) {
            arrstring[n2] = iterator.next();
            ++n2;
        }
        return arrstring;
    }

    public static String[] IFQY(Object object) {
        if (object == null) {
            return null;
        }
        Object object2 = vbpi.UH(object);
        Field[] arrfield = (Field[])vbpi.UH(object2);
        int n = arrfield.length;
        if (n == 0) {
            return null;
        }
        String[] arrstring = new String[n];
        int n2 = 0;
        while (n2 < n) {
            arrstring[n2] = vbpi.UH(arrfield[n2]);
            ++n2;
        }
        return arrstring;
    }

    public String getString(String string) throws gggG {
        Object object = this.get(string);
        if (object instanceof String) {
            return (String)object;
        }
        throw new gggG((String)vbpi.UH(vbpi.UH(vbpi.UH(new StringBuilder(FMkR$WjFM.a("\u9ab8\ude3e\uea93\u4589\ucfca\ud0aa\u0ca0\u5369\u5a7d\u1869\ude61")), vbpi.quote(string)), FMkR$WjFM.a("\u9aaf\ude4d\ueab2\u45a8\ucff1\ud0e8\u0cab\u532c\u5a6d\u1869\ude48\u8560\ub1ef\u709e\u7f47"))));
    }

    public boolean has(String string) {
        return ((Map)o.a(this, -1299759013)).containsKey(string);
    }

    public vbpi bhlC(String string) throws gggG {
        Object object = this.Dqxl(string);
        if (object == null) {
            this.VwLY(string, 1);
        } else if (object instanceof BigInteger) {
            this.biLo(string, vbpi.UH((BigInteger)object, (BigInteger)o.k(-1855897500)));
        } else if (object instanceof BigDecimal) {
            this.biLo(string, vbpi.UH((BigDecimal)object, (BigDecimal)o.k(1953251410)));
        } else if (object instanceof Integer) {
            this.VwLY(string, (int)(vbpi.UH((Integer)object) + true));
        } else if (object instanceof Long) {
            this.UtIU(string, (long)(vbpi.UH((Long)object) + 1));
        } else if (object instanceof Double) {
            this.UtIU(string, (double)(vbpi.UH((Double)object) + 1.0));
        } else if (object instanceof Float) {
            this.UtIU(string, (double)(vbpi.UH((Float)object) + 1.0f));
        } else {
            throw new gggG((String)vbpi.UH(vbpi.UH(vbpi.UH(new StringBuilder(mrFx$WjFM.d("\u9f71\u9f35\ucec5\u46ea\u5c1a\u0811\ub229\u4dfe\u8334\uee14\u85e7\u6bf8\ub601\u3f27\u67d3\ubc54\uf856\u4018\u8caa\u73ed\ua557")), vbpi.quote(string)), mrFx$WjFM.d("\u9f79\u9f75"))));
        }
        return this;
    }

    public boolean DaUw(String string) {
        return (boolean)vbpi.UH(o.k(671498640), this.Dqxl(string));
    }

    public Iterator<String> keys() {
        return this.keySet().iterator();
    }

    public Set<String> keySet() {
        return ((Map)o.a(this, -1299759013)).keySet();
    }

    public int length() {
        return ((Map)o.a(this, -1299759013)).size();
    }

    public JRRx gxmV() {
        JRRx jRRx = new JRRx();
        Iterator<String> iterator = this.keys();
        while (iterator.hasNext()) {
            vbpi.UH(jRRx, iterator.next());
        }
        if (vbpi.UH(jRRx) == false) {
            return null;
        }
        return jRRx;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String yJLS(Number number) throws gggG {
        if (number == null) {
            throw new gggG(mrFx$WjFM.d("\u70bf\u44b6\ucc94\u7ccd\u1f99\u491c\u8722\uf26e\u036b\uf05f\u7fce\uf1f7"));
        }
        vbpi.dfaE(number);
        Object object = vbpi.UH(number);
        if (vbpi.UH(object, 46) <= 0) return object;
        if (vbpi.UH(object, 101) >= 0) return object;
        if (vbpi.UH(object, 69) >= 0) return object;
        while (vbpi.UH(object, mrFx$WjFM.d("\u70c1")) != false) {
            object = vbpi.UH(object, false, vbpi.UH(object) - true);
        }
        if (vbpi.UH(object, mrFx$WjFM.d("\u70df")) == false) return object;
        return vbpi.UH(object, false, vbpi.UH(object) - true);
    }

    public Object Dqxl(String string) {
        if (string == null) {
            return null;
        }
        return ((Map)o.a(this, -1299759013)).get(string);
    }

    public <E extends Enum<E>> E yJLS(Class<E> class_, String string) {
        return this.yJLS(class_, string, null);
    }

    public <E extends Enum<E>> E yJLS(Class<E> class_, String string, E e) {
        try {
            Object object = this.Dqxl(string);
            if (vbpi.UH(o.k(671498640), object) != false) {
                return e;
            }
            if (vbpi.UH(class_, vbpi.UH(object)) != false) {
                Enum enum_ = (Enum)object;
                return (E)enum_;
            }
            return (E)vbpi.UH(class_, vbpi.UH(object));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return e;
        }
        catch (NullPointerException nullPointerException) {
            return e;
        }
    }

    public boolean MSAa(String string) {
        return this.yJLS(string, false);
    }

    public boolean yJLS(String string, boolean bl) {
        try {
            return this.getBoolean(string);
        }
        catch (Exception exception) {
            return bl;
        }
    }

    public double JIWX(String string) {
        return this.yJLS(string, Double.NaN);
    }

    public BigInteger yJLS(String string, BigInteger bigInteger) {
        try {
            return this.WOYg(string);
        }
        catch (Exception exception) {
            return bigInteger;
        }
    }

    public BigDecimal yJLS(String string, BigDecimal bigDecimal) {
        try {
            return this.getBigDecimal(string);
        }
        catch (Exception exception) {
            return bigDecimal;
        }
    }

    public double yJLS(String string, double d) {
        try {
            return this.getDouble(string);
        }
        catch (Exception exception) {
            return d;
        }
    }

    public int jxvf(String string) {
        return this.biLo(string, 0);
    }

    public int biLo(String string, int n) {
        try {
            return this.getInt(string);
        }
        catch (Exception exception) {
            return n;
        }
    }

    public JRRx GkCK(String string) {
        Object object = this.Dqxl(string);
        if (object instanceof JRRx) {
            return (JRRx)object;
        }
        return null;
    }

    public vbpi Ywen(String string) {
        Object object = this.Dqxl(string);
        if (object instanceof vbpi) {
            return (vbpi)object;
        }
        return null;
    }

    public long UAGQ(String string) {
        return this.yJLS(string, 0);
    }

    public long yJLS(String string, long l) {
        try {
            return this.getLong(string);
        }
        catch (Exception exception) {
            return l;
        }
    }

    public String XRaB(String string) {
        return this.UtIU(string, "");
    }

    public String UtIU(String string, String string2) {
        Object object = this.Dqxl(string);
        if (vbpi.UH(o.k(671498640), object) != false) {
            return string2;
        }
        return vbpi.UH(object);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void uVol(Object var1_1) {
        var2_2 = vbpi.UH(var1_1);
        var3_3 = vbpi.UH(var2_2) != null;
        var4_4 = var3_3 ? (Method[])vbpi.UH(var2_2) : (Method[])vbpi.UH(var2_2);
        var5_5 = 0;
        while (var5_5 < var4_4.length) {
            block13 : {
                try {
                    block15 : {
                        block14 : {
                            var6_6 = var4_4[var5_5];
                            if (vbpi.UH(vbpi.UH(var6_6)) == false) break block13;
                            var7_8 = vbpi.UH(var6_6);
                            var8_9 = "";
                            if (vbpi.UH(var7_8, nJPf$sILv.G("\u2fec\ubd6a\u4300")) == false) break block14;
                            if (vbpi.UH(nJPf$sILv.G("\u2fec\ubd6a\u4300\ued99\uf121\u5e14\u90f6\ub920"), var7_8) != false) ** GOTO lbl-1000
                            if (vbpi.UH(nJPf$sILv.G("\u2fec\ubd6a\u4300\ued9e\uf128\u5e16\u90e9\ub932\ud4c9\u7b3d\ua567\u9cd7\u3104\u5c01\u08f0\u6b51\udbfe"), var7_8) != false) lbl-1000: // 2 sources:
                            {
                                var8_9 = "";
                            } else {
                                var8_9 = vbpi.UH(var7_8, 3);
                            }
                            break block15;
                        }
                        if (vbpi.UH(var7_8, nJPf$sILv.G("\u2fe2\ubd7c")) != false) {
                            var8_9 = vbpi.UH(var7_8, 2);
                        }
                    }
                    if (vbpi.UH(var8_9) > 0) {
                        if (vbpi.UH(vbpi.UH(var8_9, false)) != false) {
                            if (((Class[])vbpi.UH(var6_6)).length == 0) {
                                if (vbpi.UH(var8_9) == true) {
                                    var8_9 = vbpi.UH(var8_9);
                                } else if (vbpi.UH(vbpi.UH(var8_9, true)) == false) {
                                    var8_9 = vbpi.UH(vbpi.UH(new StringBuilder((String)vbpi.UH(vbpi.UH(vbpi.UH(var8_9, false, true)))), vbpi.UH(var8_9, true)));
                                }
                                if ((var9_10 = vbpi.UH(var6_6, var1_1, null)) != null) {
                                    ((Map)o.a(this, -1299759013)).put(var8_9, vbpi.wrap(var9_10));
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

    public vbpi UtIU(String string, boolean bl) throws gggG {
        this.biLo(string, bl ? (Boolean)o.k(-316456551) : (Boolean)o.k(-1311620710));
        return this;
    }

    public vbpi yJLS(String string, Collection<Object> collection) throws gggG {
        this.biLo(string, new JRRx(collection));
        return this;
    }

    public vbpi UtIU(String string, double d) throws gggG {
        this.biLo(string, new Double(d));
        return this;
    }

    public vbpi VwLY(String string, int n) throws gggG {
        this.biLo(string, new Integer(n));
        return this;
    }

    public vbpi UtIU(String string, long l) throws gggG {
        this.biLo(string, new Long(l));
        return this;
    }

    public vbpi yJLS(String string, Map<String, Object> map) throws gggG {
        this.biLo(string, new vbpi(map));
        return this;
    }

    public vbpi biLo(String string, Object object) throws gggG {
        if (string == null) {
            throw new NullPointerException(nJPf$sILv.G("\u48ef\u7d40\u1d76\u5660\u63c2\u13b7\u1190\u9d82\u57bd"));
        }
        if (object != null) {
            vbpi.dfaE(object);
            ((Map)o.a(this, -1299759013)).put(string, object);
        } else {
            this.hanW(string);
        }
        return this;
    }

    public vbpi VwLY(String string, Object object) throws gggG {
        if (string != null && object != null) {
            if (this.Dqxl(string) != null) {
                throw new gggG((String)vbpi.UH(vbpi.UH(vbpi.UH(new StringBuilder(mrFx$WjFM.d("\u4d0e\u05be\u4efb\u511a\u990b\u58d8\udfe6\u800c\ud091\u836b\u46a2\u04b1\ud329\udf00\u99c6")), string), mrFx$WjFM.d("\u4d68"))));
            }
            this.biLo(string, object);
        }
        return this;
    }

    public vbpi TEqA(String string, Object object) throws gggG {
        if (string != null && object != null) {
            this.biLo(string, object);
        }
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String quote(String string) {
        StringWriter stringWriter = new StringWriter();
        Object object = vbpi.UH(stringWriter);
        synchronized (object) {
            try {
                return vbpi.UH(vbpi.yJLS(string, stringWriter));
            }
            catch (IOException iOException) {
                return "";
            }
        }
    }

    public static Writer yJLS(String string, Writer writer) throws IOException {
        block16 : {
            block15 : {
                if (string == null) break block15;
                if (vbpi.UH(string) != false) break block16;
            }
            vbpi.UH(writer, nJPf$sILv.G("\u4be9\u2276"));
            return writer;
        }
        Object object = 0;
        Object object2 = vbpi.UH(string);
        vbpi.UH(writer, 34);
        int n = 0;
        while (n < object2) {
            int n2 = object;
            Object object3 = vbpi.UH(string, n);
            object = object3;
            switch (object3) {
                case 34: 
                case 92: {
                    vbpi.UH(writer, 92);
                    vbpi.UH(writer, object);
                    break;
                }
                case 47: {
                    if (n2 == 60) {
                        vbpi.UH(writer, 92);
                    }
                    vbpi.UH(writer, object);
                    break;
                }
                case 8: {
                    vbpi.UH(writer, nJPf$sILv.G("\u4b97\u2236"));
                    break;
                }
                case 9: {
                    vbpi.UH(writer, nJPf$sILv.G("\u4b97\u2220"));
                    break;
                }
                case 10: {
                    vbpi.UH(writer, nJPf$sILv.G("\u4b97\u223a"));
                    break;
                }
                case 12: {
                    vbpi.UH(writer, nJPf$sILv.G("\u4b97\u2232"));
                    break;
                }
                case 13: {
                    vbpi.UH(writer, nJPf$sILv.G("\u4b97\u2226"));
                    break;
                }
                default: {
                    if (object < 32 || object >= 128 && object < 160 || object >= 8192 && object < 8448) {
                        vbpi.UH(writer, nJPf$sILv.G("\u4b97\u2221"));
                        Object object4 = vbpi.UH(object);
                        vbpi.UH(writer, nJPf$sILv.G("\u4bfb\u2264\uefb1\u101f"), false, 4 - vbpi.UH(object4));
                        vbpi.UH(writer, object4);
                        break;
                    }
                    vbpi.UH(writer, object);
                }
            }
            ++n;
        }
        vbpi.UH(writer, 34);
        return writer;
    }

    public Object hanW(String string) {
        return ((Map)o.a(this, -1299759013)).remove(string);
    }

    public boolean xykf(Object object) {
        if (!(object instanceof vbpi)) {
            return false;
        }
        try {
            Set<String> set = this.keySet();
            if (!set.equals(((vbpi)object).keySet())) {
            }
            for (String string : set) {
                Object object2 = this.get(string);
                Object object3 = ((vbpi)object).get(string);
                if (object2 instanceof vbpi) {
                    if (((vbpi)object2).xykf(object3)) continue;
                }
                if (object2 instanceof JRRx) {
                    if (vbpi.UH((JRRx)object2, object3) != false) continue;
                }
                if (vbpi.UH(object2, object3) != false) continue;
            }
            return true;
        }
        finally {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object stringToValue(String string) {
        if (vbpi.UH(string, "") != false) {
            return string;
        }
        if (vbpi.UH(string, mrFx$WjFM.d("\u5077\u080e\u8cdf\u5b93")) != false) {
            return (Boolean)o.k(-316456551);
        }
        if (vbpi.UH(string, mrFx$WjFM.d("\u5065\u081d\u8cc6\u5b85\u477c")) != false) {
            return (Boolean)o.k(-1311620710);
        }
        if (vbpi.UH(string, mrFx$WjFM.d("\u506d\u0809\u8cc6\u5b9a")) != false) {
            return o.k(671498640);
        }
        Object object = vbpi.UH(string, false);
        if (object < 48 || object > 57) {
            if (object != 45) return string;
        }
        try {
            if (vbpi.UH(string, 46) < 0) {
                if (vbpi.UH(string, 101) < 0) {
                    if (vbpi.UH(string, 69) < 0) {
                        Long l = new Long(string);
                        if (vbpi.UH(string, vbpi.UH(l)) == false) return string;
                        if (vbpi.UH(l) != (Object)vbpi.UH(l)) return l;
                        return vbpi.UH(vbpi.UH(l));
                    }
                }
            }
            Object object2 = vbpi.UH(string);
            if (vbpi.UH(object2) != false) return string;
            if (vbpi.UH(object2) != false) return string;
            return object2;
        }
        catch (Exception exception) {
            // empty catch block
        }
        return string;
    }

    public static void dfaE(Object object) throws gggG {
        block6 : {
            block9 : {
                block7 : {
                    block8 : {
                        if (object == null) break block6;
                        if (!(object instanceof Double)) break block7;
                        if (vbpi.UH((Double)object) != false) break block8;
                        if (vbpi.UH((Double)object) == false) break block6;
                    }
                    throw new gggG(nJPf$sILv.G("\u806c\u73cd\u478b\u308e\u0c88\u76ac\u689a\ud808\u95b2\u922f\u6144s\ub5d9\ue979\u5712\ue9c3\ub3a9\u8961\u436e\ua701\u4e87\u452a\u6a2e\uf95f\udb75\u2c71\u9bb1\u1f78\ua521\u796c\ue61a\ua7c6\uc622\ud91e\u4ee7\ucbd7\ucebc\u637e\u4a84"));
                }
                if (!(object instanceof Float)) break block6;
                if (vbpi.UH((Float)object) != false) break block9;
                if (vbpi.UH((Float)object) == false) break block6;
            }
            throw new gggG(nJPf$sILv.G("\u806c\u73cd\u478b\u308e\u0c88\u76ac\u689a\ud808\u95b2\u922f\u6144s\ub5d9\ue979\u5712\ue9c3\ub3a9\u8961\u436e\ua701\u4e87\u452a\u6a2e\uf95f\udb75\u2c71\u9bb1\u1f78\ua521\u796c\ue61a\ua7c6\uc622\ud91e\u4ee7\ucbd7\ucebc\u637e\u4a84"));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public JRRx biLo(JRRx jRRx) throws gggG {
        block4 : {
            block3 : {
                if (jRRx == null) break block3;
                if (vbpi.UH(jRRx) != false) break block4;
            }
            return null;
        }
        JRRx jRRx2 = new JRRx();
        int n = 0;
        while (n < vbpi.UH(jRRx)) {
            vbpi.UH(jRRx2, this.Dqxl((String)vbpi.UH(jRRx, n)));
            ++n;
        }
        return jRRx2;
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
    public String toString(int n) throws gggG {
        StringWriter stringWriter = new StringWriter();
        Object object = vbpi.UH(stringWriter);
        synchronized (object) {
            return vbpi.UH(this.yJLS(stringWriter, n, 0));
        }
    }

    public static String valueToString(Object object) throws gggG {
        block14 : {
            block13 : {
                if (object == null) break block13;
                if (vbpi.UH(object, null) == false) break block14;
            }
            return mrFx$WjFM.d("\u9677\u9cbe\u8234\u6308");
        }
        if (object instanceof ntkf) {
            String string;
            try {
                string = ((ntkf)object).toJSONString();
            }
            catch (Exception exception) {
                throw new gggG(exception);
            }
            if (string instanceof String) {
                return string;
            }
            throw new gggG((String)vbpi.UH(vbpi.UH(new StringBuilder(mrFx$WjFM.d("\u965b\u9caa\u823c\u6344\ude7d\u5429\u7e23\u9f22\u0dda\u7b73\ua4fa\u23b5\ue57d\ucd2c\ubc1b\uf04d\u8ec7\u1f31\uec2d\u5a01\u06b9\ua8b1\ue080\u5757\u03fe\ua2a6\uadfb\uba5c\u7286")), string)));
        }
        if (object instanceof Number) {
            return vbpi.yJLS((Number)object);
        }
        if (object instanceof Boolean || object instanceof vbpi || object instanceof JRRx) {
            return vbpi.UH(object);
        }
        if (object instanceof Map) {
            Map map = (Map)object;
            return new vbpi(map).toString();
        }
        if (object instanceof Collection) {
            Collection collection = (Collection)object;
            return vbpi.UH(new JRRx(collection));
        }
        if (vbpi.UH(vbpi.UH(object)) != false) {
            return vbpi.UH(new JRRx(object));
        }
        return vbpi.quote((String)vbpi.UH(object));
    }

    public static Object wrap(Object object) {
        try {
            block15 : {
                block14 : {
                    block13 : {
                        block12 : {
                            if (object == null) {
                                return o.k(671498640);
                            }
                            if (object instanceof vbpi || object instanceof JRRx) break block12;
                            if (vbpi.UH(o.k(671498640), object) == false && !(object instanceof ntkf) && !(object instanceof Byte) && !(object instanceof Character) && !(object instanceof Short) && !(object instanceof Integer) && !(object instanceof Long) && !(object instanceof Boolean) && !(object instanceof Float) && !(object instanceof Double) && !(object instanceof String) && !(object instanceof BigInteger) && !(object instanceof BigDecimal)) break block13;
                        }
                        return object;
                    }
                    if (object instanceof Collection) {
                        Collection collection = (Collection)object;
                        return new JRRx(collection);
                    }
                    if (vbpi.UH(vbpi.UH(object)) != false) {
                        return new JRRx(object);
                    }
                    if (object instanceof Map) {
                        Map map = (Map)object;
                        return new vbpi(map);
                    }
                    Object object2 = vbpi.UH(vbpi.UH(object));
                    Object object3 = object2 != null ? vbpi.UH(object2) : "";
                    if (vbpi.UH(object3, FMkR$WjFM.a("\ue1c3\u780f\u29fc\u49ad\u2647")) != false) break block14;
                    if (vbpi.UH(object3, FMkR$WjFM.a("\ue1c3\u780f\u29fc\u49ad\u2611\ua848")) != false) break block14;
                    if (vbpi.UH(vbpi.UH(object)) != null) break block15;
                }
                return vbpi.UH(object);
            }
            return new vbpi(object);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public Writer yJLS(Writer writer) throws gggG {
        return this.yJLS(writer, 0, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static final Writer yJLS(Writer writer, Object object, int n, int n2) throws gggG, IOException {
        block13 : {
            block12 : {
                if (object == null) break block12;
                if (vbpi.UH(object, null) == false) break block13;
            }
            vbpi.UH(writer, mrFx$WjFM.d("\u709f\u44b6\ucc94\u7ccd"));
            return writer;
        }
        if (object instanceof vbpi) {
            ((vbpi)object).yJLS(writer, n, n2);
            return writer;
        }
        if (object instanceof JRRx) {
            vbpi.UH((JRRx)object, writer, n, n2);
            return writer;
        }
        if (object instanceof Map) {
            Map map = (Map)object;
            new vbpi(map).yJLS(writer, n, n2);
            return writer;
        }
        if (object instanceof Collection) {
            Collection collection = (Collection)object;
            vbpi.UH(new JRRx(collection), writer, n, n2);
            return writer;
        }
        if (vbpi.UH(vbpi.UH(object)) != false) {
            vbpi.UH(new JRRx(object), writer, n, n2);
            return writer;
        }
        if (object instanceof Number) {
            vbpi.UH(writer, vbpi.yJLS((Number)object));
            return writer;
        }
        if (object instanceof Boolean) {
            vbpi.UH(writer, vbpi.UH(object));
            return writer;
        }
        if (object instanceof ntkf) {
            String string;
            try {
                string = ((ntkf)object).toJSONString();
            }
            catch (Exception exception) {
                throw new gggG(exception);
            }
            vbpi.UH(writer, string != null ? vbpi.UH(string) : vbpi.quote((String)vbpi.UH(object)));
            return writer;
        }
        vbpi.yJLS((String)vbpi.UH(object), writer);
        return writer;
    }

    static final void yJLS(Writer writer, int n) throws IOException {
        int n2 = 0;
        while (n2 < n) {
            vbpi.UH(writer, 32);
            ++n2;
        }
    }

    Writer yJLS(Writer writer, int n, int n2) throws gggG {
        try {
            boolean bl = false;
            int n3 = this.length();
            Iterator<String> iterator = this.keys();
            vbpi.UH(writer, 123);
            if (n3 == 1) {
                String string = iterator.next();
                vbpi.UH(writer, vbpi.quote((String)vbpi.UH(string)));
                vbpi.UH(writer, 58);
                if (n > 0) {
                    vbpi.UH(writer, 32);
                }
                vbpi.yJLS(writer, ((Map)o.a(this, -1299759013)).get(string), n, n2);
            } else if (n3 != 0) {
                int n4 = n2 + n;
                while (iterator.hasNext()) {
                    String string = iterator.next();
                    if (bl) {
                        vbpi.UH(writer, 44);
                    }
                    if (n > 0) {
                        vbpi.UH(writer, 10);
                    }
                    vbpi.yJLS(writer, n4);
                    vbpi.UH(writer, vbpi.quote((String)vbpi.UH(string)));
                    vbpi.UH(writer, 58);
                    if (n > 0) {
                        vbpi.UH(writer, 32);
                    }
                    vbpi.yJLS(writer, ((Map)o.a(this, -1299759013)).get(string), n, n4);
                    bl = true;
                }
                if (n > 0) {
                    vbpi.UH(writer, 10);
                }
                vbpi.yJLS(writer, n2);
            }
            vbpi.UH(writer, 125);
            return writer;
        }
        catch (IOException iOException) {
            throw new gggG(iOException);
        }
    }

    private static Object UH(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


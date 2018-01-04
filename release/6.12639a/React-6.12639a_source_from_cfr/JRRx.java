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
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class JRRx
implements Iterable<Object> {
    private final ArrayList<Object> urUC = new ArrayList();

    public JRRx() {
    }

    public JRRx(IqTB iqTB) throws gggG {
        this();
        if (JRRx.ox(iqTB) != 91) {
            throw JRRx.ox(iqTB, nJPf$sILv.G("\ud053\ubeb6\u9f62\uaa77\uec56\u183c\u15d3\u360b\u73c3\u0325\udbfd\ua0d1\u8b10\u7a72\u8025\u5724\ue5e7\u79d0\u56ec\ufa9b\u9b12\uda91\ub30d\u6c11\ue61b\ud4b6\u502c\ub99f\u82b4\u1e13Q\u3461\u1c0b\ucb60\u5751\u90a6"));
        }
        if (JRRx.ox(iqTB) != 93) {
            JRRx.ox(iqTB);
            block4 : do {
                if (JRRx.ox(iqTB) == 44) {
                    JRRx.ox(iqTB);
                    JRRx.ox((ArrayList)o.a(this, 424231313), o.k(671498640));
                } else {
                    JRRx.ox(iqTB);
                    JRRx.ox((ArrayList)o.a(this, 424231313), JRRx.ox(iqTB));
                }
                switch (JRRx.ox(iqTB)) {
                    case 44: {
                        if (JRRx.ox(iqTB) == 93) {
                            return;
                        }
                        JRRx.ox(iqTB);
                        continue block4;
                    }
                    case 93: {
                        return;
                    }
                }
                break;
            } while (true);
            throw JRRx.ox(iqTB, nJPf$sILv.G("\ud057\ubeee\u9f58\uaa41\uec7a\u1806\u15f7\u361d\u7391\u0325\udba4\ua0d6\u8b48\u7a30\u807d\u573f\ue5b5\u799d\u56be\ufab5\u9b41"));
        }
    }

    public JRRx(String string) throws gggG {
        this(new IqTB(string));
    }

    public JRRx(Collection<Object> collection) {
        if (collection != null) {
            Iterator<Object> iterator = collection.iterator();
            while (iterator.hasNext()) {
                JRRx.ox((ArrayList)o.a(this, 424231313), JRRx.ox(iterator.next()));
            }
        }
    }

    public JRRx(Object object) throws gggG {
        this();
        if (JRRx.ox(JRRx.ox(object)) != false) {
            Object object2 = JRRx.ox(object);
            int n = 0;
            while (n < object2) {
                this.wKtV(JRRx.ox(JRRx.ox(object, n)));
                ++n;
            }
            return;
        }
        throw new gggG(FMkR$WjFM.a("\u6c5c\u1560\u6ce2\ua10a\ua1cc\u9c96\uc1c1\u5f13\u10e5\uc5ae\u21d9\ucb64\u7765\ub538\ua1b6\ua402\uaac9\uf719\ud502\u3fd1\uc8e5\u3a36\u80f3\ucd28\u3315\ua045\uf381\u1c8a\u9cc2\u64a2\u6d52\uf823\u8f2b\u19bc\u8168\u629a\ub644\uae8d\u0f47\u9e4c\ub6a6\ufa63\u8b5e\ue1f9\u39d2\uc006\u213b\uaabd\u7a8f\ud6d0\u8763\u374c\u0616\uc5da\uf060\uabf9\uce09\u96e6\u459c\u56d6\u44b9\u2a5f\udd5a\u6426\uee04\u4225"));
    }

    @Override
    public Iterator<Object> iterator() {
        return JRRx.ox((ArrayList)o.a(this, 424231313));
    }

    public Object get(int n) throws gggG {
        Object object = this.STSP(n);
        if (object == null) {
            throw new gggG((String)JRRx.ox(JRRx.ox(JRRx.ox(new StringBuilder(FMkR$WjFM.a("\u3ae3\uc040\ua653\uedb6\ue390\udd3e\uaeb1\u332a\u2e3c\ueca1")), n), FMkR$WjFM.a("\u3af4\uc033\ua672\ued97\ue3a5\udd6c\uaea5\u3324\u2e30\uec94\u273b\u6ebb"))));
        }
        return object;
    }

    public boolean getBoolean(int n) throws gggG {
        block7 : {
            block6 : {
                Object object;
                block5 : {
                    block4 : {
                        object = this.get(n);
                        if (JRRx.ox(object, (Boolean)o.k(-1311620710)) != false) break block4;
                        if (!(object instanceof String)) break block5;
                        if (JRRx.ox((String)object, mrFx$WjFM.d("Z\ue1e1\u7820\uddb7\u9287")) == false) break block5;
                    }
                    return false;
                }
                if (JRRx.ox(object, (Boolean)o.k(-316456551)) != false) break block6;
                if (!(object instanceof String)) break block7;
                if (JRRx.ox((String)object, mrFx$WjFM.d("H\ue1f2\u7839\udda1")) == false) break block7;
            }
            return true;
        }
        throw new gggG((String)JRRx.ox(JRRx.ox(JRRx.ox(new StringBuilder(mrFx$WjFM.d("v\ue1d3\u7803\udd8a\u92a3\u8a90\ud623\u36c1\ub714\u757c")), n), mrFx$WjFM.d("a\ue1a0\u7825\uddb7\u92c2\u8a8c\ud63e\u36d4\ub74d\u7546\u93b1\u0f34\u55ee\ua046\uef25\u8792\u0fe8\ud6d5\u946a"))));
    }

    public double getDouble(int n) throws gggG {
        Object object = this.get(n);
        try {
            if (object instanceof Number) {
                return (double)JRRx.ox((Number)object);
            }
            return (double)JRRx.ox((String)object);
        }
        catch (Exception exception) {
            throw new gggG((String)JRRx.ox(JRRx.ox(JRRx.ox(new StringBuilder(mrFx$WjFM.d("\u6a5c\ud8e0\ue7d3\u8026\ue760\udadd\uecf5\ubf86\ua8f6\u288f")), n), mrFx$WjFM.d("\u6a4b\ud893\ue7f5\u801b\ue701\udac1\uece8\ubf93\ua8af\u28b5\u3ca7\udc2e\udfd2\u5248\u0f93\uca65\ufed0\uac64"))));
        }
    }

    public <E extends Enum<E>> E yJLS(Class<E> class_, int n) throws gggG {
        E e = this.UtIU(class_, n);
        if (e == null) {
            throw new gggG((String)JRRx.ox(JRRx.ox(JRRx.ox(JRRx.ox(JRRx.ox(new StringBuilder(FMkR$WjFM.a("\ub412\u49ac\u3849\u3536\u31e8\u22c6\u1c6b\u9829\u355a\u1df4\u92c2")), JRRx.ox(JRRx.ox(n))), FMkR$WjFM.a("\ub405\u49df\u386f\u350b\u3187\u22ca\u1c6e\u9838\u3519\u1de1\u92f7\uccd0\ucc2b\u3fe6\u3e29\u4fda\uee39\ub6fc\u819d\uc693\uf1c2\u66c2\ufd71\u5f10\u1dc6")), JRRx.ox(JRRx.ox(class_))), FMkR$WjFM.a("\ub476"))));
        }
        return e;
    }

    public BigDecimal getBigDecimal(int n) throws gggG {
        Object object = this.get(n);
        try {
            return new BigDecimal((String)JRRx.ox(object));
        }
        catch (Exception exception) {
            throw new gggG((String)JRRx.ox(JRRx.ox(JRRx.ox(new StringBuilder(mrFx$WjFM.d("\u6f24\ue3dc\ub7d5\u3333\ubaa1\ucac7\uad96\u32d8\u5b69\u1939")), n), mrFx$WjFM.d("\u6f33\ue3af\ub7f9\u3312\uba95\ucad9\uad80\u3299\u5b7e\u190d\u61dd\u77ff\u2520\ub3e0\u03d7\u8418\u7f25\u4715\u275d\ua079\u0a96\u8bac\uf8f0\ue13b\u5888\u3774\ub1d0\u9b47\ue29d\uc089\ub987\u5b0d\uc22f\u6e49"))));
        }
    }

    public BigInteger XRaB(int n) throws gggG {
        Object object = this.get(n);
        try {
            return new BigInteger((String)JRRx.ox(object));
        }
        catch (Exception exception) {
            throw new gggG((String)JRRx.ox(JRRx.ox(JRRx.ox(new StringBuilder(mrFx$WjFM.d("\u0688\u9b71\u8deb\u38ad\ub047\u7f57\uaf81\ue8a8\ufcec\u754d")), n), mrFx$WjFM.d("\u069f\u9b02\u8dc7\u388c\ub073\u7f49\uaf97\ue8e9\ufcfb\u7579\ub09b\uf8f2\uf85f\u819e\u1a60\u9c8b\u50b3\u513d\u6be1\ua442\ue4f7\u5a06\ua60b\ubc7e\u5fbd\u682b\u4b69\u5f6c\u3669\u2298\udc25\u8bc7\u7398\u8189"))));
        }
    }

    public int getInt(int n) throws gggG {
        Object object = this.get(n);
        try {
            if (object instanceof Number) {
                return (int)JRRx.ox((Number)object);
            }
            return (int)JRRx.ox((String)object);
        }
        catch (Exception exception) {
            throw new gggG((String)JRRx.ox(JRRx.ox(JRRx.ox(new StringBuilder(nJPf$sILv.G("\ubff1\u583e\u4907\ud935\u2579\u25e6\ue89d\ua64c\u9383\ub84c")), n), nJPf$sILv.G("\ubfe6\u584d\u4921\ud908\u2518\u25fa\ue880\ua659\u93da\ub876\u687e\u347c\ua694\ud275\uaeaf\u124a\u8dce\uc863"))));
        }
    }

    public JRRx hanW(int n) throws gggG {
        Object object = this.get(n);
        if (object instanceof JRRx) {
            return (JRRx)object;
        }
        throw new gggG((String)JRRx.ox(JRRx.ox(JRRx.ox(new StringBuilder(mrFx$WjFM.d("\u1966\u4559\u1d44\u78fa\u364b\u8d8c\ubd76\u1676\u861b\u4d09")), n), mrFx$WjFM.d("\u1971\u452a\u1d62\u78c7\u362a\u8d90\ubd6b\u1663\u8642\u4d33\u216f\uc726\u703d\ucc4a\u04eb\u36cd\u4006\u5cf4\u8823\u1976\u727b"))));
    }

    public vbpi erXb(int n) throws gggG {
        Object object = this.get(n);
        if (object instanceof vbpi) {
            return (vbpi)object;
        }
        throw new gggG((String)JRRx.ox(JRRx.ox(JRRx.ox(new StringBuilder(nJPf$sILv.G("\u79c2\u3fa7\ud597\u3a7c\u6b3e\u39d9\u5361\u0485\u9184\ubbe5")), n), nJPf$sILv.G("\u79d5\u3fd4\ud5b1\u3a41\u6b5f\u39c5\u537c\u0490\u91dd\ubbdf\u0ea3\u9cf4\u439d\u37b1\uc473\ua448\ude1e\u9c33\u8f96\uc7a9\u2746\u2b2a"))));
    }

    public long getLong(int n) throws gggG {
        Object object = this.get(n);
        try {
            if (object instanceof Number) {
                return (long)JRRx.ox((Number)object);
            }
            return (long)JRRx.ox((String)object);
        }
        catch (Exception exception) {
            throw new gggG((String)JRRx.ox(JRRx.ox(JRRx.ox(new StringBuilder(mrFx$WjFM.d("\u0ee1\ufb4e\u51ba\u799b\u106b\ud740\u56b1\uce9e\u8269\u7459")), n), mrFx$WjFM.d("\u0ef6\ufb3d\u519c\u79a6\u100a\ud75c\u56ac\uce8b\u8230\u7463\ufc0d\u33b3\ud072\u5b28\u98ba\uc8ce\ue06a\u4c3f"))));
        }
    }

    public String getString(int n) throws gggG {
        Object object = this.get(n);
        if (object instanceof String) {
            return (String)object;
        }
        throw new gggG((String)JRRx.ox(JRRx.ox(JRRx.ox(new StringBuilder(mrFx$WjFM.d("\uf195\u1dfb\u7aaf\ubec7\uc7e0\ua863\u0d6e\u160b\u4900\ufef6")), n), mrFx$WjFM.d("\uf182\u1d88\u7a8e\ubee6\uc7d5\ua831\u0d7d\u164a\u490a\ufed9\ue8c9\u737b\u7d35\u9848\u50e9"))));
    }

    public boolean isNull(int n) {
        return (boolean)JRRx.ox(o.k(671498640), this.STSP(n));
    }

    public String ooQj(String string) throws gggG {
        int n = this.length();
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < n) {
            if (n2 > 0) {
                JRRx.ox(stringBuilder, string);
            }
            JRRx.ox(stringBuilder, JRRx.ox(JRRx.ox((ArrayList)o.a(this, 424231313), n2)));
            ++n2;
        }
        return JRRx.ox(stringBuilder);
    }

    public int length() {
        return (int)JRRx.ox((ArrayList)o.a(this, 424231313));
    }

    public Object STSP(int n) {
        if (n < 0 || n >= this.length()) {
            return null;
        }
        return JRRx.ox((ArrayList)o.a(this, 424231313), n);
    }

    public boolean OPWR(int n) {
        return this.UtIU(n, false);
    }

    public boolean UtIU(int n, boolean bl) {
        try {
            return this.getBoolean(n);
        }
        catch (Exception exception) {
            return bl;
        }
    }

    public double ivSs(int n) {
        return this.yJLS(n, Double.NaN);
    }

    public double yJLS(int n, double d) {
        try {
            return this.getDouble(n);
        }
        catch (Exception exception) {
            return d;
        }
    }

    public int YoVV(int n) {
        return this.ktHX(n, 0);
    }

    public int ktHX(int n, int n2) {
        try {
            return this.getInt(n);
        }
        catch (Exception exception) {
            return n2;
        }
    }

    public <E extends Enum<E>> E UtIU(Class<E> class_, int n) {
        return this.yJLS(class_, n, null);
    }

    public <E extends Enum<E>> E yJLS(Class<E> class_, int n, E e) {
        try {
            Object object = this.STSP(n);
            if (JRRx.ox(o.k(671498640), object) != false) {
                return e;
            }
            if (JRRx.ox(class_, JRRx.ox(object)) != false) {
                Enum enum_ = (Enum)object;
                return (E)enum_;
            }
            return (E)JRRx.ox(class_, JRRx.ox(object));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return e;
        }
        catch (NullPointerException nullPointerException) {
            return e;
        }
    }

    public BigInteger yJLS(int n, BigInteger bigInteger) {
        try {
            return this.XRaB(n);
        }
        catch (Exception exception) {
            return bigInteger;
        }
    }

    public BigDecimal yJLS(int n, BigDecimal bigDecimal) {
        try {
            return this.getBigDecimal(n);
        }
        catch (Exception exception) {
            return bigDecimal;
        }
    }

    public JRRx jxuv(int n) {
        Object object = this.STSP(n);
        if (object instanceof JRRx) {
            return (JRRx)object;
        }
        return null;
    }

    public vbpi jNbl(int n) {
        Object object = this.STSP(n);
        if (object instanceof vbpi) {
            return (vbpi)object;
        }
        return null;
    }

    public long xynF(int n) {
        return this.yJLS(n, 0);
    }

    public long yJLS(int n, long l) {
        try {
            return this.getLong(n);
        }
        catch (Exception exception) {
            return l;
        }
    }

    public String aLXV(int n) {
        return this.yJLS(n, "");
    }

    public String yJLS(int n, String string) {
        Object object = this.STSP(n);
        if (JRRx.ox(o.k(671498640), object) != false) {
            return string;
        }
        return JRRx.ox(object);
    }

    public JRRx Mkpo(boolean bl) {
        this.wKtV(bl ? (Boolean)o.k(-316456551) : (Boolean)o.k(-1311620710));
        return this;
    }

    public JRRx yJLS(Collection<Object> collection) {
        this.wKtV(new JRRx(collection));
        return this;
    }

    public JRRx sQJh(double d) throws gggG {
        Double d2 = new Double(d);
        JRRx.ox(d2);
        this.wKtV(d2);
        return this;
    }

    public JRRx Surr(int n) {
        this.wKtV(new Integer(n));
        return this;
    }

    public JRRx bhkI(long l) {
        this.wKtV(new Long(l));
        return this;
    }

    public JRRx yJLS(Map<String, Object> map) {
        this.wKtV(new vbpi(map));
        return this;
    }

    public JRRx wKtV(Object object) {
        JRRx.ox((ArrayList)o.a(this, 424231313), object);
        return this;
    }

    public JRRx biLo(int n, boolean bl) throws gggG {
        this.yJLS(n, bl ? (Boolean)o.k(-316456551) : (Boolean)o.k(-1311620710));
        return this;
    }

    public JRRx yJLS(int n, Collection<Object> collection) throws gggG {
        this.yJLS(n, new JRRx(collection));
        return this;
    }

    public JRRx UtIU(int n, double d) throws gggG {
        this.yJLS(n, new Double(d));
        return this;
    }

    public JRRx HeSD(int n, int n2) throws gggG {
        this.yJLS(n, new Integer(n2));
        return this;
    }

    public JRRx UtIU(int n, long l) throws gggG {
        this.yJLS(n, new Long(l));
        return this;
    }

    public JRRx yJLS(int n, Map<String, Object> map) throws gggG {
        this.yJLS(n, new vbpi(map));
        return this;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public JRRx yJLS(int var1_1, Object var2_2) throws gggG {
        JRRx.ox(var2_2);
        if (var1_1 < 0) {
            throw new gggG((String)JRRx.ox(JRRx.ox(JRRx.ox(new StringBuilder(nJPf$sILv.G("\ua516\u87db\u0d12\ub5f0\u3aef\u72b4\ufc74\ube33\u67f3\u2974")), var1_1), nJPf$sILv.G("\ua501\u87a8\u0d33\ub5d1\u3ada\u72e6\ufc60\ube3d\u67ff\u2941\u242c\ua3be"))));
        }
        if (var1_1 >= this.length()) ** GOTO lbl18
        JRRx.ox((ArrayList)o.a(this, 424231313), var1_1, var2_2);
        return this;
lbl-1000: // 1 sources:
        {
            this.wKtV(o.k(671498640));
lbl18: // 2 sources:
            ** while (var1_1 != this.length())
        }
lbl19: // 1 sources:
        this.wKtV(var2_2);
        return this;
    }

    public Object remove(int n) {
        if (n >= 0 && n < this.length()) {
            return JRRx.ox((ArrayList)o.a(this, 424231313), n);
        }
        return null;
    }

    public boolean xykf(Object object) {
        if (!(object instanceof JRRx)) {
            return false;
        }
        int n = this.length();
        if (n != ((JRRx)object).length()) {
            return false;
        }
        int n2 = 0;
        while (n2 < n) {
            Object object2 = this.get(n2);
            Object object3 = ((JRRx)object).get(n2);
            if (object2 instanceof vbpi) {
                if (JRRx.ox((vbpi)object2, object3) == false) {
                    return false;
                }
            } else if (object2 instanceof JRRx) {
                if (!((JRRx)object2).xykf(object3)) {
                    return false;
                }
            } else if (JRRx.ox(object2, object3) == false) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    public vbpi yJLS(JRRx jRRx) throws gggG {
        if (jRRx == null || jRRx.length() == 0 || this.length() == 0) {
            return null;
        }
        vbpi vbpi2 = new vbpi();
        int n = 0;
        while (n < jRRx.length()) {
            JRRx.ox(vbpi2, jRRx.getString(n), this.STSP(n));
            ++n;
        }
        return vbpi2;
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
        Object object = JRRx.ox(stringWriter);
        synchronized (object) {
            return JRRx.ox(this.yJLS(stringWriter, n, 0));
        }
    }

    public Writer yJLS(Writer writer) throws gggG {
        return this.yJLS(writer, 0, 0);
    }

    Writer yJLS(Writer writer, int n, int n2) throws gggG {
        try {
            boolean bl = false;
            int n3 = this.length();
            JRRx.ox(writer, 91);
            if (n3 == 1) {
                JRRx.ox(writer, JRRx.ox((ArrayList)o.a(this, 424231313), false), n, n2);
            } else if (n3 != 0) {
                int n4 = n2 + n;
                int n5 = 0;
                while (n5 < n3) {
                    if (bl) {
                        JRRx.ox(writer, 44);
                    }
                    if (n > 0) {
                        JRRx.ox(writer, 10);
                    }
                    JRRx.ox(writer, n4);
                    JRRx.ox(writer, JRRx.ox((ArrayList)o.a(this, 424231313), n5), n, n4);
                    bl = true;
                    ++n5;
                }
                if (n > 0) {
                    JRRx.ox(writer, 10);
                }
                JRRx.ox(writer, n2);
            }
            JRRx.ox(writer, 93);
            return writer;
        }
        catch (IOException iOException) {
            throw new gggG(iOException);
        }
    }

    private static Object ox(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


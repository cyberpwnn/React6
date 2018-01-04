/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.configuration.file.FileConfiguration
 *  org.bukkit.configuration.file.YamlConfiguration
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Mtpq {
    private TNku<String, NVRU<?>> WIFU = new TNku();

    public feCR<String> NohV() {
        return Mtpq.RR((TNku)o.a(this, 681004187));
    }

    public void TEqA(vbpi vbpi2) {
        Iterator iterator = Mtpq.RR(vbpi2).iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            this.KTiK(string, Mtpq.RR(vbpi2, string));
        }
    }

    public vbpi oDqt() {
        vbpi vbpi2 = new vbpi();
        Object object = Mtpq.RR(this.NohV());
        while (object.hasNext()) {
            String string = (String)object.next();
            Mtpq.RR(vbpi2, string, this.get(string));
        }
        return vbpi2;
    }

    public FileConfiguration Pums() {
        YamlConfiguration yamlConfiguration = new YamlConfiguration();
        Object object = Mtpq.RR(this.NohV());
        while (object.hasNext()) {
            String string = (String)object.next();
            Mtpq.RR(yamlConfiguration, string, this.get(string));
        }
        return yamlConfiguration;
    }

    public void yJLS(FileConfiguration fileConfiguration) {
        Iterator iterator = Mtpq.RR(fileConfiguration, true).iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            jOQr jOQr2 = null;
            if (Mtpq.RR(fileConfiguration, string) != false) {
                jOQr2 = new ktXW((Boolean)Mtpq.RR(Mtpq.RR(fileConfiguration, string)));
            } else if (Mtpq.RR(fileConfiguration, string) != false) {
                jOQr2 = new MAmw((Double)Mtpq.RR(Mtpq.RR(fileConfiguration, string)));
            } else if (Mtpq.RR(fileConfiguration, string) != false) {
                jOQr2 = new ghLV((Integer)Mtpq.RR(Mtpq.RR(fileConfiguration, string)));
            } else if (Mtpq.RR(fileConfiguration, string) != false) {
                jOQr2 = new VMIf((String)Mtpq.RR(fileConfiguration, string));
            } else if (Mtpq.RR(fileConfiguration, string) != false) {
                jOQr2 = new FhMR((List<String>)Mtpq.RR(fileConfiguration, string));
            } else if (Mtpq.RR(fileConfiguration, string) != false) {
                jOQr2 = new SmsU((Long)Mtpq.RR(Mtpq.RR(fileConfiguration, string)));
            }
            if (jOQr2 == null) continue;
            Mtpq.RR((TNku)o.a(this, 681004187), string, jOQr2);
        }
    }

    public boolean contains(String string) {
        return (boolean)Mtpq.RR((TNku)o.a(this, 681004187), string);
    }

    public WaLc equl(String string) {
        return ((NVRU)Mtpq.RR((TNku)o.a(this, 681004187), string)).wMJq();
    }

    public int getInt(String string) {
        return (int)Mtpq.RR((Integer)((NVRU)Mtpq.RR((TNku)o.a(this, 681004187), string)).get());
    }

    public Object get(String string) {
        return ((NVRU)Mtpq.RR((TNku)o.a(this, 681004187), string)).get();
    }

    public long getLong(String string) {
        if (((NVRU)Mtpq.RR((TNku)o.a(this, 681004187), string)).get() instanceof Integer) {
            return (long)Mtpq.RR((Integer)((NVRU)Mtpq.RR((TNku)o.a(this, 681004187), string)).get());
        }
        return (long)Mtpq.RR((Long)((NVRU)Mtpq.RR((TNku)o.a(this, 681004187), string)).get());
    }

    public String getString(String string) {
        return Mtpq.RR(((NVRU)Mtpq.RR((TNku)o.a(this, 681004187), string)).get());
    }

    public double getDouble(String string) {
        return (double)Mtpq.RR((Double)((NVRU)Mtpq.RR((TNku)o.a(this, 681004187), string)).get());
    }

    public boolean getBoolean(String string) {
        return (boolean)Mtpq.RR((Boolean)((NVRU)Mtpq.RR((TNku)o.a(this, 681004187), string)).get());
    }

    public List<String> getStringList(String string) {
        return (List)((NVRU)Mtpq.RR((TNku)o.a(this, 681004187), string)).get();
    }

    public void KTiK(String string, Object object) {
        if (object instanceof Integer) {
            this.TEqA(string, (int)Mtpq.RR((Integer)object));
            return;
        }
        if (object instanceof Boolean) {
            this.biLo(string, (boolean)Mtpq.RR((Boolean)object));
            return;
        }
        if (object instanceof Double) {
            this.biLo(string, (double)Mtpq.RR((Double)object));
            return;
        }
        if (object instanceof String) {
            this.set(string, (String)object);
            return;
        }
        if (object instanceof Long) {
            this.biLo(string, (long)Mtpq.RR((Long)object));
            return;
        }
        if (object instanceof List) {
            this.yJLS(string, (List)object);
            return;
        }
        Mtpq.RR(Mtpq.RR(Mtpq.RR(new StringBuilder(nJPf$sILv.G("\u1e92\u86a9\u06e6\u1b7b\u3fe1\u3fe8\uce29\udcea\ud551\ua759\ud183\uff9c\u52a1\u3c86\ud468\ucbf7\u4abb\ub5b5\u61c2\u62b9\u5f4d\u8a75\ue93c\ud39a\u687c\ub55c\u1955\u9e41")), Mtpq.RR(Mtpq.RR(object)))));
    }

    public void TEqA(String string, int n) {
        Mtpq.RR((TNku)o.a(this, 681004187), string, new ghLV((Integer)Mtpq.RR(n)));
    }

    public void biLo(String string, boolean bl) {
        Mtpq.RR((TNku)o.a(this, 681004187), string, new ktXW((Boolean)Mtpq.RR(bl)));
    }

    public void biLo(String string, double d) {
        Mtpq.RR((TNku)o.a(this, 681004187), string, new MAmw((Double)Mtpq.RR(d)));
    }

    public void biLo(String string, long l) {
        Mtpq.RR((TNku)o.a(this, 681004187), string, new SmsU((Long)Mtpq.RR(l)));
    }

    public void set(String string, String string2) {
        Mtpq.RR((TNku)o.a(this, 681004187), string, new VMIf(string2));
    }

    public void yJLS(String string, List<String> list) {
        Mtpq.RR((TNku)o.a(this, 681004187), string, new FhMR(list));
    }

    private static Object RR(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


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

public class QFEs {
    private ktOu<String, YEMO<?>> neAA = new ktOu();

    public wfPa<String> FhLM() {
        return QFEs.Xz((ktOu)cv.b(this, 940306962));
    }

    public void YoSa(vslr vslr2) {
        Iterator iterator = QFEs.Xz(vslr2).iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            this.jhSt(string, QFEs.Xz(vslr2, string));
        }
    }

    public vslr psDx() {
        vslr vslr2 = new vslr();
        Object object = QFEs.Xz(this.FhLM());
        while (object.hasNext()) {
            String string = (String)object.next();
            QFEs.Xz(vslr2, string, this.get(string));
        }
        return vslr2;
    }

    public FileConfiguration DbEj() {
        YamlConfiguration yamlConfiguration = new YamlConfiguration();
        Object object = QFEs.Xz(this.FhLM());
        while (object.hasNext()) {
            String string = (String)object.next();
            QFEs.Xz(yamlConfiguration, string, this.get(string));
        }
        return yamlConfiguration;
    }

    public void ssNb(FileConfiguration fileConfiguration) {
        Iterator iterator = QFEs.Xz(fileConfiguration, true).iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            vbnM vbnM2 = null;
            if (QFEs.Xz(fileConfiguration, string) != false) {
                vbnM2 = new JbqW((Boolean)QFEs.Xz(QFEs.Xz(fileConfiguration, string)));
            } else if (QFEs.Xz(fileConfiguration, string) != false) {
                vbnM2 = new YUkF((Double)QFEs.Xz(QFEs.Xz(fileConfiguration, string)));
            } else if (QFEs.Xz(fileConfiguration, string) != false) {
                vbnM2 = new fvCa((Integer)QFEs.Xz(QFEs.Xz(fileConfiguration, string)));
            } else if (QFEs.Xz(fileConfiguration, string) != false) {
                vbnM2 = new esCa((String)QFEs.Xz(fileConfiguration, string));
            } else if (QFEs.Xz(fileConfiguration, string) != false) {
                vbnM2 = new VCsR((List<String>)QFEs.Xz(fileConfiguration, string));
            } else if (QFEs.Xz(fileConfiguration, string) != false) {
                vbnM2 = new Rayq((Long)QFEs.Xz(QFEs.Xz(fileConfiguration, string)));
            }
            if (vbnM2 == null) continue;
            QFEs.Xz((ktOu)cv.b(this, 940306962), string, vbnM2);
        }
    }

    public boolean contains(String string) {
        return (boolean)QFEs.Xz((ktOu)cv.b(this, 940306962), string);
    }

    public GHiL avmQ(String string) {
        return ((YEMO)QFEs.Xz((ktOu)cv.b(this, 940306962), string)).AWxc();
    }

    public int getInt(String string) {
        return (int)QFEs.Xz((Integer)((YEMO)QFEs.Xz((ktOu)cv.b(this, 940306962), string)).get());
    }

    public Object get(String string) {
        return ((YEMO)QFEs.Xz((ktOu)cv.b(this, 940306962), string)).get();
    }

    public long getLong(String string) {
        if (((YEMO)QFEs.Xz((ktOu)cv.b(this, 940306962), string)).get() instanceof Integer) {
            return (long)QFEs.Xz((Integer)((YEMO)QFEs.Xz((ktOu)cv.b(this, 940306962), string)).get());
        }
        return (long)QFEs.Xz((Long)((YEMO)QFEs.Xz((ktOu)cv.b(this, 940306962), string)).get());
    }

    public String getString(String string) {
        return QFEs.Xz(((YEMO)QFEs.Xz((ktOu)cv.b(this, 940306962), string)).get());
    }

    public double getDouble(String string) {
        return (double)QFEs.Xz((Double)((YEMO)QFEs.Xz((ktOu)cv.b(this, 940306962), string)).get());
    }

    public boolean getBoolean(String string) {
        return (boolean)QFEs.Xz((Boolean)((YEMO)QFEs.Xz((ktOu)cv.b(this, 940306962), string)).get());
    }

    public List<String> getStringList(String string) {
        return (List)((YEMO)QFEs.Xz((ktOu)cv.b(this, 940306962), string)).get();
    }

    public void jhSt(String string, Object object) {
        if (object instanceof Integer) {
            this.OXeK(string, (int)QFEs.Xz((Integer)object));
            return;
        }
        if (object instanceof Boolean) {
            this.IWSm(string, (boolean)QFEs.Xz((Boolean)object));
            return;
        }
        if (object instanceof Double) {
            this.IWSm(string, (double)QFEs.Xz((Double)object));
            return;
        }
        if (object instanceof String) {
            this.set(string, (String)object);
            return;
        }
        if (object instanceof Long) {
            this.IWSm(string, (long)QFEs.Xz((Long)object));
            return;
        }
        if (object instanceof List) {
            this.ssNb(string, (List)object);
            return;
        }
        QFEs.Xz(QFEs.Xz(QFEs.Xz(new StringBuilder(YEBy$TyVf.W("\u4927\u7a73\u2ee9\u3d3d\u3c21\u7e9f\u816a\u6923\u0ba9\uf009\uecbe\u0de8\uaed4\ub60d\u008c\ubd75\u9cef\u7e1f\ud6a8\u7049\ue8c8\u3ff8\u18ae\ua60e\u1627\u7d7e\u9587\u0f23")), QFEs.Xz(QFEs.Xz(object)))));
    }

    public void OXeK(String string, int n) {
        QFEs.Xz((ktOu)cv.b(this, 940306962), string, new fvCa((Integer)QFEs.Xz(n)));
    }

    public void IWSm(String string, boolean bl) {
        QFEs.Xz((ktOu)cv.b(this, 940306962), string, new JbqW((Boolean)QFEs.Xz(bl)));
    }

    public void IWSm(String string, double d) {
        QFEs.Xz((ktOu)cv.b(this, 940306962), string, new YUkF((Double)QFEs.Xz(d)));
    }

    public void IWSm(String string, long l) {
        QFEs.Xz((ktOu)cv.b(this, 940306962), string, new Rayq((Long)QFEs.Xz(l)));
    }

    public void set(String string, String string2) {
        QFEs.Xz((ktOu)cv.b(this, 940306962), string, new esCa(string2));
    }

    public void ssNb(String string, List<String> list) {
        QFEs.Xz((ktOu)cv.b(this, 940306962), string, new VCsR(list));
    }

    private static Object Xz(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


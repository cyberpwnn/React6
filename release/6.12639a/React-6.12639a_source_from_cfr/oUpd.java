/*
 * Decompiled with CFR 0_123.
 */
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

@BtuM(value=-8)
public class oUpd {
    public static void ytpa() {
        Object object = oUpd.CM((feCR)oUpd.CM((TNku)o.k(278287122), oUpd.CM(-7)));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            try {
                oUpd.CM(oUpd.CM(class_, new Class[0]), new Object[0]);
            }
            catch (InstantiationException instantiationException) {
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (InvocationTargetException invocationTargetException) {
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (SecurityException securityException) {
                // empty catch block
            }
        }
    }

    public static void UtIU(Runnable runnable) {
        new oUpd$1(runnable);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static byte[] yJLS(File var0, String var1_1) throws IOException {
        var2_2 = var1_1;
        var3_3 = var0;
        var4_4 = new ZipFile(var3_3);
        var5_5 = oUpd.CM(var4_4);
        while (var5_5.hasMoreElements()) {
            var6_6 = (ZipEntry)var5_5.nextElement();
            if (oUpd.CM(oUpd.CM(var6_6), var2_2) == false) continue;
            var7_7 = new byte[8192];
            var8_8 = oUpd.CM(var4_4, var6_6);
            var9_9 = new ByteArrayOutputStream();
            var10_10 = false;
            ** GOTO lbl28
        }
        oUpd.CM(var4_4);
        return null;
lbl-1000: // 1 sources:
        {
            oUpd.CM(var9_9, var7_7, false, var10_10);
lbl28: // 2 sources:
            v0 = oUpd.CM(var8_8, var7_7);
            var10_10 = v0;
            ** while (v0 != -1)
        }
lbl33: // 1 sources:
        oUpd.CM(var8_8);
        return (byte[])oUpd.CM(var9_9);
    }

    public static TNku<String, ByteBuffer> UtIU(File file) throws IOException, NoSuchAlgorithmException {
        TNku<String, ByteBuffer> tNku;
        File file2;
        block8 : {
            block7 : {
                file2 = file;
                tNku = new TNku<String, ByteBuffer>();
                if (oUpd.CM(file2) == false) break block7;
                if (oUpd.CM(oUpd.CM(file2), nJPf$sILv.G("\u32dc\u7c23\u3073\uc1ee")) != false) break block8;
            }
            return tNku;
        }
        File file3 = file2;
        FileInputStream fileInputStream = new FileInputStream(file3);
        ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
        Object object = oUpd.CM(nJPf$sILv.G("\u32a1\u7c01\u3053\uc1b1\ue14b\uebcb\u427c"));
        Object object2 = oUpd.CM(zipInputStream);
        while (object2 != null) {
            if (oUpd.CM(object2) == false) {
                if (oUpd.CM(oUpd.CM(object2), nJPf$sILv.G("\u32dc\u7c2a\u307e\uc1fd\ue10a\ueb8d")) != false) {
                    if (oUpd.CM(oUpd.CM(object2), nJPf$sILv.G("\u32d6")) == false) {
                        Object object3 = oUpd.CM(oUpd.CM(oUpd.CM(object2), nJPf$sILv.G("\u32dd"), nJPf$sILv.G("\u32dc")), nJPf$sILv.G("\u32dc\u7c2a\u307e\uc1fd\ue10a\ueb8d"), "");
                        byte[] arrby = oUpd.yJLS(file2, (String)oUpd.CM(object2));
                        byte[] arrby2 = (byte[])oUpd.CM(object, arrby);
                        oUpd.CM(tNku, object3, oUpd.CM(arrby2));
                    }
                }
            }
            object2 = oUpd.CM(zipInputStream);
        }
        oUpd.CM(zipInputStream);
        return tNku;
    }

    static /* synthetic */ byte[] UtIU(File file, String string) throws IOException {
        return oUpd.yJLS(file, string);
    }

    private static Object CM(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


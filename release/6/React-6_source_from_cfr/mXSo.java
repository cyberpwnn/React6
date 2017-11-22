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

@IWbc(value=-8)
public class mXSo {
    public static void FyLC() {
        Object object = mXSo.hg((wfPa)mXSo.hg((ktOu)cv.e(-1326510031), mXSo.hg(-7)));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            try {
                mXSo.hg(mXSo.hg(class_, new Class[0]), new Object[0]);
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
            catch (SecurityException securityException) {}
        }
    }

    public static void DYFV(Runnable runnable) {
        new mXSo$1(runnable);
    }

    private static byte[] ssNb(File file, String string) throws IOException {
        String string2 = string;
        File file2 = file;
        ZipFile zipFile = new ZipFile(file2);
        Object object = mXSo.hg(zipFile);
        while (object.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry)object.nextElement();
            if (mXSo.hg(mXSo.hg(zipEntry), string2) == false) continue;
            byte[] arrby = new byte[8192];
            Object object2 = mXSo.hg(zipFile, zipEntry);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Object object3 = false;
            do {
                Object object4 = mXSo.hg(object2, arrby);
                object3 = object4;
                if (object4 == -1) break;
                mXSo.hg(byteArrayOutputStream, arrby, false, object3);
            } while (true);
            mXSo.hg(object2);
            return (byte[])mXSo.hg(byteArrayOutputStream);
        }
        mXSo.hg(zipFile);
        return null;
    }

    public static ktOu<String, ByteBuffer> DYFV(File file) throws IOException, NoSuchAlgorithmException {
        ktOu<String, ByteBuffer> ktOu2;
        File file2;
        block8 : {
            block7 : {
                file2 = file;
                ktOu2 = new ktOu<String, ByteBuffer>();
                if (mXSo.hg(file2) == false) break block7;
                if (mXSo.hg(mXSo.hg(file2), KUXS$dwji.S("\u6d1b\ua254\u5d24\u849f")) != false) break block8;
            }
            return ktOu2;
        }
        File file3 = file2;
        FileInputStream fileInputStream = new FileInputStream(file3);
        ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
        Object object = mXSo.hg(KUXS$dwji.S("\u6d66\ua276\u5d04\u84c0\u4d05\u1d8d\uc13d"));
        Object object2 = mXSo.hg(zipInputStream);
        while (object2 != null) {
            if (mXSo.hg(object2) == false) {
                if (mXSo.hg(mXSo.hg(object2), KUXS$dwji.S("\u6d1b\ua25d\u5d29\u848c\u4d44\u1dcb")) != false) {
                    if (mXSo.hg(mXSo.hg(object2), KUXS$dwji.S("\u6d11")) == false) {
                        Object object3 = mXSo.hg(mXSo.hg(mXSo.hg(object2), KUXS$dwji.S("\u6d1a"), KUXS$dwji.S("\u6d1b")), KUXS$dwji.S("\u6d1b\ua25d\u5d29\u848c\u4d44\u1dcb"), "");
                        byte[] arrby = mXSo.ssNb(file2, (String)mXSo.hg(object2));
                        byte[] arrby2 = (byte[])mXSo.hg(object, arrby);
                        mXSo.hg(ktOu2, object3, mXSo.hg(arrby2));
                    }
                }
            }
            object2 = mXSo.hg(zipInputStream);
        }
        mXSo.hg(zipInputStream);
        return ktOu2;
    }

    static /* synthetic */ byte[] DYFV(File file, String string) throws IOException {
        return mXSo.ssNb(file, string);
    }

    private static Object hg(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


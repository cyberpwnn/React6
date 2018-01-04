/*
 * Decompiled with CFR 0_123.
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import javax.crypto.Cipher;

public class sQUP {
    public feCR<yBDo<?, ?>> gOWc = new feCR();

    public InputStream yJLS(InputStream inputStream) throws IOException {
        InputStream inputStream2 = inputStream;
        Object object = sQUP.om((feCR)o.a(this, 447823495));
        while (object.hasNext()) {
            yBDo yBDo2 = (yBDo)object.next();
            inputStream2 = yBDo2.yJLS(inputStream2);
        }
        return inputStream2;
    }

    public OutputStream yJLS(OutputStream outputStream) throws IOException {
        OutputStream outputStream2 = outputStream;
        Object object = sQUP.om((feCR)o.a(this, 447823495));
        while (object.hasNext()) {
            yBDo yBDo2 = (yBDo)object.next();
            outputStream2 = yBDo2.yJLS(outputStream2);
        }
        return outputStream2;
    }

    public void yJLS(yBDo<?, ?> yBDo2) {
        sQUP.om((feCR)o.a(this, 447823495), yBDo2);
    }

    public void jxvf(int n) {
        this.yJLS(new IqPU(n));
    }

    public void hkMN() {
        this.yJLS(new IqPU());
    }

    public void biLo(Cipher cipher) {
        this.yJLS(new JcRF(cipher));
    }

    public void GkCK(int n) {
        this.yJLS(new vtQM(n));
    }

    public void hIJO() {
        this.yJLS(new vtQM());
    }

    private static Object om(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


/*
 * Decompiled with CFR 0_123.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

class MSHX$2
extends CxNA {
    final /* synthetic */ MSHX RsxR;

    MSHX$2(MSHX mSHX) {
        this.RsxR = mSHX;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        try {
            Object object;
            if (MSHX$2.ix((File)o.a((MSHX)o.a(this, 1921669534), -1365223011)) != false) {
                object = "";
                BufferedReader bufferedReader = new BufferedReader(new FileReader((File)o.a((MSHX)o.a(this, 1921669534), -1365223011)));
                Object object2 = "";
                do {
                    if ((object2 = MSHX$2.ix(bufferedReader)) == null) {
                        MSHX$2.ix(bufferedReader);
                        vbpi vbpi2 = new vbpi((String)object);
                        MSHX$2.ix((MSHX)o.a(this, 1921669534), MSHX$2.ix(vbpi2, nJPf$sILv.G("\u1c5c\uc28f3\u9638\ua733\u6b4d\u19cf")));
                        break;
                    }
                    object = MSHX$2.ix(MSHX$2.ix(new StringBuilder((String)MSHX$2.ix(object)), object2));
                } while (true);
            }
            object = new BuLd(new MSHX$2$1(this), new URL(nJPf$sILv.G("\u1c42\uc29e5\u963b\ua729\u6b18\u198e\uf8aa\u9a26\u2979\u6f20\uf3e9\u0090\u332a\u3710\u2c61\u38d7\u1f7a\uffa5\ue745\u9e45\u7f75\ubdeb\u64a7\u8edc\u42f9\uec5d\uce4c\ubd85\ucdb5\ube87\u8c06\u7cce\u1d1d\u82db\ufdd9\u3940\u55b0\ud67e\u3c80\ua5ab\u2d24\u9853\u4958\u0b36\u1cee\u7c1e\u684a\u6c73\u9488\uf6aa\u2748\u131d\uaeb7\u58ad\u4907\uf7c9\ua8f8\ua4b3\u8b6f\u52ed\u16b0\u846a\u35d9\u130e\ubfb7\u0823\udef5\ud13e\u7f4e\ueeae\u635a\u8d7f\u09fa\uf97b\u2353\uc4f5\u2e45\ubcb5\ubf47\u6a3b")), (File)o.a((MSHX)o.a(this, 1921669534), -1365223011), 8192);
            MSHX$2.ix(object);
            return;
        }
        catch (MalformedURLException malformedURLException) {
            MalformedURLException malformedURLException2 = malformedURLException;
            MSHX$2.ix(malformedURLException);
            return;
        }
        catch (FileNotFoundException fileNotFoundException) {
            FileNotFoundException fileNotFoundException2 = fileNotFoundException;
            MSHX$2.ix(fileNotFoundException);
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            MSHX$2.ix(iOException);
            return;
        }
    }

    static /* synthetic */ MSHX yJLS(MSHX$2 mSHX$2) {
        return (MSHX)o.a(mSHX$2, 1921669534);
    }

    private static Object ix(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


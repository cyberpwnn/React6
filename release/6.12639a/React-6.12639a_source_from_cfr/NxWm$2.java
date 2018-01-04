/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.Set;

class NxWm$2
implements Runnable {
    final /* synthetic */ NxWm igKq;

    NxWm$2(NxWm nxWm) {
        this.igKq = nxWm;
    }

    @Override
    public void run() {
        Object object = NxWm$2.qj(new feCR(NxWm$2.qj().keySet()));
        while (object.hasNext()) {
            Thread thread;
            thread = (Thread)object.next();
            if (NxWm$2.qj(NxWm$2.qj(thread), nJPf$sILv.G("\u9d5a\ua924\u8ef1\ud91c\u5739\uf4f1")) == false) continue;
            try {
                NxWm$2.qj(thread);
                NxWm$2.qj(thread, 5);
                if (thread instanceof fSgy) {
                    o.v((fSgy)thread, 1859865738, false);
                }
            }
            catch (InterruptedException interruptedException) {
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            if (NxWm$2.qj(thread) != false) {
                try {
                    NxWm$2.qj(thread);
                    NxWm$2.qj(thread, 50);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
            }
            if (NxWm$2.qj(thread) != false) {
                try {
                    NxWm$2.qj(thread);
                    NxWm$2.qj(thread, 200);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
            }
            if (NxWm$2.qj(thread) != false) {
                try {
                    NxWm$2.qj(thread);
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            if (NxWm$2.qj(thread) != false) {
                try {
                    NxWm$2.qj(500);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
            }
            if (NxWm$2.qj(thread) != false) {
                NxWm$2.qj(NxWm$2.qj(NxWm$2.qj(new StringBuilder(nJPf$sILv.G("\u9d4f\ua930\u8eea\ud917\u5739\uf4b5\uf10d\u1bb3\ubcae\ube95\u48be\uedce\ue203\ua1e3\u481e\u2b1c\u09bd\ueeaa\u5b25\ubc67\u207d\u12af\ucc05\u6aa0\uae6b\u4d04")), NxWm$2.qj(thread))));
                continue;
            }
            NxWm$2.qj(NxWm$2.qj(NxWm$2.qj(new StringBuilder(nJPf$sILv.G("\u9d5a\ua939\u8ef6\ud90f\u577c\uf4b5\uf142\u1bb0\ubcaf\ube95\u48ae\uedc3\ue202\ua1f2\u480d\u2b17\u09fe\ueeaa")), NxWm$2.qj(thread))));
        }
    }

    private static Object qj(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


/*
 * Decompiled with CFR 0_123.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.zip.ZipInputStream;

public class YfkF
extends upkX {
    private PBUD<Class<?>> kIjU;
    private aKuV<Object, Method> hbdS;
    private PBUD<qloI> EnBq;
    public static aKuV<Integer, PBUD<Class<?>>> dpKS;
    private static final PBUD<Class<?>> Bcwu;
    private static Field Rseh;
    private static Field yRrW;
    private static final PBUD<Method> nuWK;
    public static long HLUy;

    static {
        yy.K(206825719, new PBUD());
        yy.K(-2036602632, null);
        yy.K(95086797, null);
        yy.K(-1523062586, new PBUD());
        yy.K(952494283, -1);
    }

    public YfkF() {
        try {
            yy.K(2038819903, new aKuV());
            this.EnBq = new PBUD();
            this.kIjU = new PBUD();
            this.AqhT();
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            YfkF.LY(iOException);
            return;
        }
        catch (SecurityException securityException) {
            SecurityException securityException2 = securityException;
            YfkF.LY(securityException);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
            YfkF.LY(illegalArgumentException);
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            ClassNotFoundException classNotFoundException2 = classNotFoundException;
            YfkF.LY(classNotFoundException);
            return;
        }
    }

    @Override
    public void xrET() {
    }

    @Override
    public long oUhC() {
        if ((Field)yy.p(-2036602632) == null) {
            return 100000;
        }
        if ((Long)yy.p(952494283) < 0) {
            try {
                yy.K(952494283, (long)YfkF.LY((Long)YfkF.LY((Field)yy.p(-2036602632), null)));
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                YfkF.LY(exception);
                yy.K(952494283, 100000);
            }
        }
        return (Long)yy.p(952494283);
    }

    public static void FpWB() {
        yy.K(952494283, -1);
    }

    public static void Vvsp() {
        Object object = YfkF.LY(YfkF.LY(YfkF.LY()));
        YfkF.LY(YfkF.LY(YfkF.LY()));
        YfkF.LY(object);
    }

    @Override
    public int getThreadCount() {
        if ((Field)yy.p(95086797) == null) {
            return 2;
        }
        try {
            return (int)YfkF.LY((Integer)YfkF.LY((Field)yy.p(95086797), null));
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            YfkF.LY(exception);
            return 2;
        }
    }

    @Override
    public void mXJp(YpAW ypAW) {
        try {
            this.leqD();
            return;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            NoSuchMethodException noSuchMethodException2 = noSuchMethodException;
            YfkF.LY(noSuchMethodException);
            return;
        }
        catch (SecurityException securityException) {
            SecurityException securityException2 = securityException;
            YfkF.LY(securityException);
            return;
        }
        catch (InstantiationException instantiationException) {
            InstantiationException instantiationException2 = instantiationException;
            YfkF.LY(instantiationException);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            IllegalAccessException illegalAccessException2 = illegalAccessException;
            YfkF.LY(illegalAccessException);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
            YfkF.LY(illegalArgumentException);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            InvocationTargetException invocationTargetException2 = invocationTargetException;
            YfkF.LY(invocationTargetException);
            return;
        }
    }

    @Override
    public void PJoH() {
        try {
            this.JAMu();
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            IllegalAccessException illegalAccessException2 = illegalAccessException;
            YfkF.LY(illegalAccessException);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
            YfkF.LY(illegalArgumentException);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            InvocationTargetException invocationTargetException2 = invocationTargetException;
            YfkF.LY(invocationTargetException);
            return;
        }
    }

    @Override
    public void rpTB() {
    }

    @Override
    public void OHMP() {
    }

    private void JAMu() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object object = YfkF.LY((PBUD)yy.h(this, 323217600));
        while (object.hasNext()) {
            qloI qloI2 = (qloI)object.next();
            YfkF.LY(qloI2);
        }
        YfkF.LY((PBUD)yy.h(this, 323217600));
        object = YfkF.LY(YfkF.LY((aKuV)yy.h(this, -1502411250)));
        while (object.hasNext()) {
            Object e = object.next();
            YfkF.LY((Method)YfkF.LY((aKuV)yy.h(this, -1502411250), e), e, new Object[0]);
        }
    }

    private void leqD() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        yy.E(this, -1502411250, new aKuV());
        Object object = YfkF.LY((PBUD)yy.h(this, 1301677588));
        while (object.hasNext()) {
            Object object2;
            Object object3;
            Class class_ = (Class)object.next();
            Field field = null;
            Object object4 = null;
            Object object5 = null;
            PBUD pBUD = new PBUD();
            Object object6 = (Field[])YfkF.LY(class_);
            int qloI2 = object6.length;
            int n = 0;
            while (n < qloI2) {
                object2 = object6[n];
                object3 = YfkF.LY(object2);
                if (YfkF.LY(object2, STXE.class) != false) {
                    if (YfkF.LY(object3) != false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c62\uca55\u36ec\ua07f\u4ce0\ub496\ufcab\u1f40\u9943")), YfkF.LY(YfkF.LY(object2))), BkvY$LhxG.I("\u45a1")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a1\ufc84\u4a11\uff55\u8099\u0f00\u1a65\u3c0b\uca59\u36fa\ua02b\u4ce7\ub491\ufca6\u1f44\u990f"))));
                    } else if (YfkF.LY(object3) == false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c62\uca55\u36ec\ua07f\u4ce0\ub496\ufcab\u1f40\u9943")), YfkF.LY(YfkF.LY(object2))), BkvY$LhxG.I("\u45a1")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a1\ufc8a\u4a05\uff48\u8083\u0f4f\u1a73\u3c4e\uca1b\u36ec\ua07f\u4ce0\ub48c\ufca1\u1f46"))));
                    } else if (YfkF.LY(object3) == false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c62\uca55\u36ec\ua07f\u4ce0\ub496\ufcab\u1f40\u9943")), YfkF.LY(YfkF.LY(object2))), BkvY$LhxG.I("\u45a1")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a1\ufc8a\u4a05\uff48\u8083\u0f4f\u1a73\u3c4e\uca1b\u36ef\ua07e\u4ce3\ub494\ufca1\u1f46"))));
                    } else if (YfkF.LY(YfkF.LY(object2), class_) == false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c62\uca55\u36ec\ua07f\u4ce0\ub496\ufcab\u1f40\u9943")), YfkF.LY(YfkF.LY(object2))), BkvY$LhxG.I("\u45a1")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a1\ufc8e\u4a03\uff1b\u8099\u0f00\u1a65\u3c0b\uca5a\u36ec\ua078\u4ce8\ub49f\ufca6\u1f44\u9901\u0dce\u901e\u2d54\u8042\u8f15\ud4a3\uc7b3\u5683")), YfkF.LY(class_))));
                    } else {
                        field = object2;
                        break;
                    }
                }
                ++n;
            }
            object6 = (Field[])YfkF.LY(class_);
            qloI2 = object6.length;
            n = 0;
            while (n < qloI2) {
                object2 = object6[n];
                object3 = YfkF.LY(object2);
                if (YfkF.LY(object2, hruy.class) != false) {
                    if (YfkF.LY(object3) != false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c68\uca54\u36f1\ua07f\u4cf3\ub497\ufca4\u1f05")), YfkF.LY(YfkF.LY(object2))), BkvY$LhxG.I("\u45a1")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a1\ufc84\u4a11\uff55\u8099\u0f00\u1a65\u3c0b\uca59\u36fa\ua02b\u4ce7\ub491\ufca6\u1f44\u990f"))));
                    } else if (YfkF.LY(object3) != false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c68\uca54\u36f1\ua07f\u4cf3\ub497\ufca4\u1f05")), YfkF.LY(YfkF.LY(object2))), BkvY$LhxG.I("\u45a1")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a1\ufc84\u4a11\uff55\u8099\u0f00\u1a65\u3c0b\uca59\u36fa\ua02b\u4cf2\ub48c\ufca9\u1f51\u990a\u0dc1"))));
                    } else if (YfkF.LY(object3) == false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c68\uca54\u36f1\ua07f\u4cf3\ub497\ufca4\u1f05")), YfkF.LY(YfkF.LY(object2))), BkvY$LhxG.I("\u45a1")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a1\ufc8a\u4a05\uff48\u8083\u0f4f\u1a73\u3c4e\uca1b\u36ef\ua07e\u4ce3\ub494\ufca1\u1f46"))));
                    } else if (YfkF.LY(Wyua.class, YfkF.LY(object2)) == false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c68\uca54\u36f1\ua07f\u4cf3\ub497\ufca4\u1f05")), YfkF.LY(YfkF.LY(object2))), BkvY$LhxG.I("\u45a1")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a1\ufc8a\u4a05\uff48\u8083\u0f4f\u1a73\u3c4e\uca1b\u36fe\ua02b\u4ce2\ub497\ufca6\u1f51\u9911\u0dcd\u9017\u2d18\u8041\u8f15\ud4ec\uc7f6\u56c6\u4997\ub7f5\u3843\u0889\ud3bf\u4e89\u929e\uca47\u74a4\u2df6\u6fc5\ub11f\udbbc\ubf95\u36b3\u27aa\ua0c5\ua2ef\u1860\ub2c0\uc390\u5243\u8bf2\udd5a\u45c3\uc5b0\u3feb\u6296\u0c4e\u9ff9\u0e89\u9f59"))));
                    } else {
                        YfkF.LY(pBUD, object2);
                    }
                }
                ++n;
            }
            object6 = (Method[])YfkF.LY(class_);
            qloI2 = object6.length;
            n = 0;
            while (n < qloI2) {
                object2 = object6[n];
                object3 = YfkF.LY(object2);
                if (YfkF.LY(object2, AqhT.class) != false) {
                    if (YfkF.LY(object3) != false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c6e\uca55\u36fe\ua069\u4ced\ub49d\ufce8")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a9\ufcce\u4a50\uff58\u8096\u0f01\u1a7f\u3c44\uca4f\u36bf\ua069\u4ce4\ub4d8\ufcae\u1f4c\u990d\u0dc3\u9017"))));
                    } else if (YfkF.LY(object3) != false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c6e\uca55\u36fe\ua069\u4ced\ub49d\ufce8")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a9\ufcce\u4a50\uff58\u8096\u0f01\u1a7f\u3c44\uca4f\u36bf\ua069\u4ce4\ub4d8\ufcbb\u1f51\u9902\u0dd6\u9012\u2d17"))));
                    } else if (YfkF.LY(object3) == false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c6e\uca55\u36fe\ua069\u4ced\ub49d\ufce8")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a9\ufcce\u4a50\uff56\u8082\u0f1c\u1a65\u3c0b\uca59\u36fa\ua02b\u4cf1\ub48d\ufcaa\u1f49\u990a\u0dc1"))));
                    } else if (YfkF.LY(YfkF.LY(object2), (Class)yy.p(-1566374373)) == false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c6e\uca55\u36fe\ua069\u4ced\ub49d\ufce8")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a9\ufcce\u4a50\uff56\u8082\u0f1c\u1a65\u3c0b\uca49\u36fa\ua07f\u4cf4\ub48a\ufca6\u1f05\u9915\u0dcd\u9012\u2d10"))));
                    } else if (YfkF.LY(object2) != false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c6e\uca55\u36fe\ua069\u4ced\ub49d\ufce8")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a9\ufcce\u4a50\uff58\u8096\u0f01\u1a7f\u3c44\uca4f\u36bf\ua063\u4ce0\ub48e\ufcad\u1f05\u9902\u0dcc\u9002\u2d54\u8054\u8f06\ud4be\uc7bf\u56ce\u498a\ub7f5\u3843\u0895\ud3a8"))));
                    } else {
                        object4 = object2;
                    }
                }
                ++n;
            }
            object6 = (Method[])YfkF.LY(class_);
            qloI2 = object6.length;
            n = 0;
            while (n < qloI2) {
                object2 = object6[n];
                object3 = YfkF.LY(object2);
                if (YfkF.LY(object2, rpSI.class) != false) {
                    if (YfkF.LY(object3) != false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c6f\uca52\u36ec\ua06a\u4ce3\ub494\ufcad\u1f05")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a9\ufcce\u4a50\uff58\u8096\u0f01\u1a7f\u3c44\uca4f\u36bf\ua069\u4ce4\ub4d8\ufcae\u1f4c\u990d\u0dc3\u9017"))));
                    } else if (YfkF.LY(object3) != false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c6f\uca52\u36ec\ua06a\u4ce3\ub494\ufcad\u1f05")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a9\ufcce\u4a50\uff58\u8096\u0f01\u1a7f\u3c44\uca4f\u36bf\ua069\u4ce4\ub4d8\ufcbb\u1f51\u9902\u0dd6\u9012\u2d17"))));
                    } else if (YfkF.LY(object3) == false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c6f\uca52\u36ec\ua06a\u4ce3\ub494\ufcad\u1f05")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a9\ufcce\u4a50\uff56\u8082\u0f1c\u1a65\u3c0b\uca59\u36fa\ua02b\u4cf1\ub48d\ufcaa\u1f49\u990a\u0dc1"))));
                    } else if (YfkF.LY(YfkF.LY(object2), (Class)yy.p(-1566374373)) == false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c6f\uca52\u36ec\ua06a\u4ce3\ub494\ufcad\u1f05")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a9\ufcce\u4a50\uff56\u8082\u0f1c\u1a65\u3c0b\uca49\u36fa\ua07f\u4cf4\ub48a\ufca6\u1f05\u9915\u0dcd\u9012\u2d10"))));
                    } else if (YfkF.LY(object2) != false) {
                        YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c7\ufc8e\u4a15\uff57\u8093\u0f4f\u1a51\u3c6f\uca52\u36ec\ua06a\u4ce3\ub494\ufcad\u1f05")), YfkF.LY(object2)), BkvY$LhxG.I("\u45a9\ufcce\u4a50\uff58\u8096\u0f01\u1a7f\u3c44\uca4f\u36bf\ua063\u4ce0\ub48e\ufcad\u1f05\u9902\u0dcc\u9002\u2d54\u8054\u8f06\ud4be\uc7bf\u56ce\u498a\ub7f5\u3843\u0895\ud3a8"))));
                    } else {
                        object5 = object2;
                    }
                }
                ++n;
            }
            object2 = YfkF.LY(class_, new Class[0]);
            if (object2 == null) {
                YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder((String)YfkF.LY(YfkF.LY(class_))), BkvY$LhxG.I("\u45a1\ufc8a\u4a05\uff48\u8083\u0f4f\u1a72\u3c44\uca55\u36eb\ua06a\u4ce8\ub496\ufce8\u1f44\u9943\u0dc1\u9014\u2d1a\u8057\u8f13\ud4be\uc7ab\u56c0\u499b\ub7ee\u3854\u08c7\ud3ac\u4e93\u92ca\uca5c\u74be\u2df1\u6fd6\ub15a\udbf3\ubf98\u36a5\u27e4\ua0c1\ua2fc\u187d\ub2cd\uc3d3\u5265\u8be9\udd51\u45c5\uc5b1"))));
                continue;
            }
            Object object7 = YfkF.LY(object2, new Object[0]);
            if (field != null) {
                YfkF.LY(field, object7, object7);
                YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c1\ufcae\u4a1e\uff48\u8083\u0f0e\u1a7f\u3c48\uca5e\u36bf")), YfkF.LY(YfkF.LY(object7)))));
            }
            object6 = YfkF.LY(pBUD);
            while (object6.hasNext()) {
                Field field2 = (Field)object6.next();
                Object object8 = YfkF.LY(YfkF.LY(field2), new Class[0]);
                if (object8 == null) {
                    YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c2\ufc88\u4a1e\uff4f\u8085\u0f00\u1a7d\u3c47\uca5e\u36ed\ua02b")), YfkF.LY(YfkF.LY(field2))), BkvY$LhxG.I("\u45a1\ufc8a\u4a05\uff48\u8083\u0f4f\u1a72\u3c44\uca55\u36eb\ua06a\u4ce8\ub496\ufce8\u1f44\u9943\u0dc1\u9014\u2d1a\u8057\u8f13\ud4be\uc7ab\u56c0\u499b\ub7ee\u3854\u08c7\ud3ac\u4e93\u92ca\uca5c\u74be\u2df1\u6fd6\ub15a\udbf3\ubf98\u36a5\u27e4\ua0c1\ua2fc\u187d\ub2cd\uc3d3\u5265\u8be9\udd51\u45c5\uc5b1"))));
                    continue;
                }
                Object object9 = YfkF.LY(object8, new Object[0]);
                YfkF.LY(field2, object7, object9);
                YfkF.LY((PBUD)yy.h(this, 323217600), (qloI)object9);
                YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c1\ufca4\u4a1f\uff55\u8083\u0f1d\u1a7e\u3c47\uca1b")), YfkF.LY(YfkF.LY(object9)))));
            }
            if (object4 != null) {
                YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u45c1\ufca2\u4a1e\uff5a\u8095\u0f03\u1a74\u3c0b")), YfkF.LY(object4)), BkvY$LhxG.I("\u45a9\ufcce"))));
                object6 = YfkF.LY((PBUD)yy.h(this, 323217600));
                while (object6.hasNext()) {
                    qloI qloI3 = (qloI)object6.next();
                    YfkF.LY(qloI3);
                }
                YfkF.LY(object4, object7, new Object[0]);
            }
            YfkF.LY((aKuV)yy.h(this, -1502411250), object7, object5);
        }
        object = YfkF.LY((PBUD)yy.p(-1523062586));
        while (object.hasNext()) {
            Method method = (Method)object.next();
            YfkF.LY(method, null, new Object[]{this});
        }
    }

    @Override
    public void upkX() throws IOException, ClassNotFoundException {
        Object object = YfkF.LY(this);
        FileInputStream fileInputStream = new FileInputStream((File)object);
        ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
        Object object2 = YfkF.LY(zipInputStream);
        while (object2 != null) {
            if (YfkF.LY(object2) == false) {
                if (YfkF.LY(YfkF.LY(object2), NVIs$JbpD.H("\ue543\u6ea3\ufc13\uf310\uc1a1\ua906")) != false) {
                    if (YfkF.LY(YfkF.LY(object2), NVIs$JbpD.H("\ue549")) == false) {
                        Object object3 = YfkF.LY(YfkF.LY(YfkF.LY(object2), NVIs$JbpD.H("\ue542"), NVIs$JbpD.H("\ue543")), NVIs$JbpD.H("\ue543\u6ea3\ufc13\uf310\uc1a1\ua906"), "");
                        Object object4 = YfkF.LY(object3);
                        YfkF.LY((PBUD)yy.p(206825719), object4);
                    }
                }
            }
            object2 = YfkF.LY(zipInputStream);
        }
        YfkF.LY(zipInputStream);
        try {
            this.qloI();
            this.rpSI();
        }
        catch (Exception exception) {
            object2 = exception;
            YfkF.LY(exception);
        }
        this.hruy();
    }

    private void hruy() {
        Object object = YfkF.LY((PBUD)yy.p(206825719));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            if (YfkF.LY(class_, WhyT.class) == false) continue;
            YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(NVIs$JbpD.H("\u92eb\u53d4\uad11\u3b8d\u2de8\uc567\u655f\u3828\u243f\uea9d\udf6f\u5b21\u303e\uc9ce\u1f13")), YfkF.LY(class_))));
            Field[] arrfield = (Field[])YfkF.LY(class_);
            int n = arrfield.length;
            int n2 = 0;
            while (n2 < n) {
                Field field = arrfield[n2];
                if (YfkF.LY(field, IqSO.class) != false) {
                    YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(NVIs$JbpD.H("\u92eb\u53d4\uad11\u3b8d\u2de8\uc56d\u655b\u3835\u2433\ueabb\udf6e\u5b31\u3034\uc9c8\u1f47\u66e4\uc16f\u944e")), YfkF.LY(field))));
                    yy.K(-2036602632, field);
                }
                if (YfkF.LY(field, fuej.class) != false) {
                    YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(NVIs$JbpD.H("\u92eb\u53d4\uad11\u3b8d\u2de8\uc560\u6555\u382e\u2432\uea9b\udf26")), YfkF.LY(field))));
                    yy.K(95086797, field);
                }
                ++n2;
            }
        }
    }

    private void qloI() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object object = YfkF.LY((PBUD)yy.p(206825719));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            if (YfkF.LY(class_, BIyH.class) == false) continue;
            YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\ub1bb\ua689\u0db5\u9606\u38d2\u133e\u5073\u34d7\ue6e7\udcc5\ufe31\u2fd3\u1194\u7e6b\u4e13\uffa0\uff9e\u3f6b\u5149\uf02f\ufdbc\ue36f")), YfkF.LY(class_))));
            Method[] arrmethod = (Method[])YfkF.LY(class_);
            int n = arrmethod.length;
            int n2 = 0;
            while (n2 < n) {
                Method method = arrmethod[n2];
                if (YfkF.LY(method, cBHm.class) != false) {
                    YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\ub1bb\ua69f\u0dad\u961f\u38f6\u1325\u507f\u34da\ue6d0\udc8a")), YfkF.LY(method))));
                    YfkF.LY(method, null, new Object[]{this});
                }
                ++n2;
            }
        }
    }

    private void rpSI() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object object = YfkF.LY((PBUD)yy.p(206825719));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            if (YfkF.LY(class_, BIyH.class) == false) continue;
            YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u1d6f\u9552\u374e\ufd35\u9bbf\ud5ea\u681e\u441d\ube07\u7f64\ud499\u523a\uf0df\uf30a\uaa3c\ubda7\u1efb\ue8e8\u07d6\u6631\u5f48\ufe05")), YfkF.LY(class_))));
            Method[] arrmethod = (Method[])YfkF.LY(class_);
            int n = arrmethod.length;
            int n2 = 0;
            while (n2 < n) {
                Method method = arrmethod[n2];
                if (YfkF.LY(method, qmRN.class) != false) {
                    YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(BkvY$LhxG.I("\u1d6f\u9552\u374e\ufd35\u9bbf\ud5ea\u681e\u441d\ube10\u7f79\ud496\u523f\uf0dd\uf308\uaa3b\ubdf5")), YfkF.LY(method))));
                    YfkF.LY((PBUD)yy.p(-1523062586), method);
                }
                ++n2;
            }
        }
    }

    private void AqhT() throws IOException, ClassNotFoundException {
        Object object = YfkF.LY((PBUD)yy.p(206825719));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            if (YfkF.LY(class_, aCmQ.class) != false) {
                YfkF.LY((PBUD)yy.h(this, 1301677588), class_);
                YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(KDGY$JAHk.Y("\u5724\u0e5b\ua237\u377f\u8ea2\u4d57\u1320\u9c02")), YfkF.LY(class_))));
            }
            if (YfkF.LY(class_, tLIK.class) == false) continue;
            int n = ((tLIK)YfkF.LY(class_, tLIK.class)).value();
            if (YfkF.LY((aKuV)yy.p(2038819903), YfkF.LY(n)) == false) {
                YfkF.LY((aKuV)yy.p(2038819903), YfkF.LY(n), new PBUD());
            }
            YfkF.LY((PBUD)YfkF.LY((aKuV)yy.p(2038819903), YfkF.LY(n)), class_);
            YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(YfkF.LY(new StringBuilder(KDGY$JAHk.Y("\u5724\u0e4a\ua235\u3769\u8ead\u4d51\u133c\u9c0a")), n), KDGY$JAHk.Y("\u574d\u0e2b")), YfkF.LY(class_))));
        }
    }

    @Override
    public void AWsr() {
        if (YfkF.LY() == false) {
            return;
        }
        Object object = YfkF.LY((PBUD)yy.h(this, 323217600));
        while (object.hasNext()) {
            Wyua wyua = (Wyua)object.next();
            wyua.tick();
        }
        YfkF.LY(this.rotp());
    }

    private static Object LY(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


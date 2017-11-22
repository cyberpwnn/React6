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

public class gotS
extends dVMt {
    private wfPa<Class<?>> DYeK;
    private ktOu<Object, Method> vJQh;
    private wfPa<jqQR> fvWt;
    public static ktOu<Integer, wfPa<Class<?>>> JIsq;
    private static final wfPa<Class<?>> RkaJ;
    private static Field HLbB;
    private static Field HUSJ;
    private static final wfPa<Method> afjo;
    public static long CWDh;

    static {
        cv.V(259781609, new wfPa());
        cv.V(790229992, null);
        cv.V(1138029547, null);
        cv.V(1677390826, new wfPa());
        cv.V(-279514155, -1);
    }

    public gotS() {
        try {
            cv.V(-1326510031, new ktOu());
            this.fvWt = new wfPa();
            this.DYeK = new wfPa();
            this.Pdcq();
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            gotS.GG(iOException);
            return;
        }
        catch (SecurityException securityException) {
            SecurityException securityException2 = securityException;
            gotS.GG(securityException);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
            gotS.GG(illegalArgumentException);
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            ClassNotFoundException classNotFoundException2 = classNotFoundException;
            gotS.GG(classNotFoundException);
            return;
        }
    }

    @Override
    public void aLcY() {
    }

    @Override
    public long rowT() {
        if ((Field)cv.e(790229992) == null) {
            return 100000;
        }
        if ((Long)cv.e(-279514155) < 0) {
            try {
                cv.V(-279514155, (long)gotS.GG((Long)gotS.GG((Field)cv.e(790229992), null)));
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                gotS.GG(exception);
                cv.V(-279514155, 100000);
            }
        }
        return (Long)cv.e(-279514155);
    }

    public static void YoaF() {
        cv.V(-279514155, -1);
    }

    public static void kkcI() {
        Object object = gotS.GG(gotS.GG(gotS.GG()));
        gotS.GG(gotS.GG(gotS.GG()));
        gotS.GG(object);
    }

    @Override
    public int getThreadCount() {
        if ((Field)cv.e(1138029547) == null) {
            return 2;
        }
        try {
            return (int)gotS.GG((Integer)gotS.GG((Field)cv.e(1138029547), null));
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            gotS.GG(exception);
            return 2;
        }
    }

    @Override
    public void ssNb(vswA vswA2) {
        try {
            this.Whxy();
            return;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            NoSuchMethodException noSuchMethodException2 = noSuchMethodException;
            gotS.GG(noSuchMethodException);
            return;
        }
        catch (SecurityException securityException) {
            SecurityException securityException2 = securityException;
            gotS.GG(securityException);
            return;
        }
        catch (InstantiationException instantiationException) {
            InstantiationException instantiationException2 = instantiationException;
            gotS.GG(instantiationException);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            IllegalAccessException illegalAccessException2 = illegalAccessException;
            gotS.GG(illegalAccessException);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
            gotS.GG(illegalArgumentException);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            InvocationTargetException invocationTargetException2 = invocationTargetException;
            gotS.GG(invocationTargetException);
            return;
        }
    }

    @Override
    public void KMEw() {
        try {
            this.jqQR();
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            IllegalAccessException illegalAccessException2 = illegalAccessException;
            gotS.GG(illegalAccessException);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
            gotS.GG(illegalArgumentException);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            InvocationTargetException invocationTargetException2 = invocationTargetException;
            gotS.GG(invocationTargetException);
            return;
        }
    }

    @Override
    public void dVMt() {
    }

    @Override
    public void fKRe() {
    }

    private void jqQR() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object object = gotS.GG((wfPa)cv.b(this, -1589578800));
        while (object.hasNext()) {
            jqQR jqQR2 = (jqQR)object.next();
            gotS.GG(jqQR2);
        }
        gotS.GG((wfPa)cv.b(this, -1589578800));
        object = gotS.GG(gotS.GG((ktOu)cv.b(this, -408489006)));
        while (object.hasNext()) {
            Object e = object.next();
            gotS.GG((Method)gotS.GG((ktOu)cv.b(this, -408489006), e), e, new Object[0]);
        }
    }

    private void Whxy() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        cv.e(this, -408489006, new ktOu());
        Object object = gotS.GG((wfPa)cv.b(this, 1886712797));
        while (object.hasNext()) {
            Object object2;
            Object object3;
            Class class_ = (Class)object.next();
            Field field = null;
            Object object4 = null;
            Object object5 = null;
            wfPa wfPa2 = new wfPa();
            Object object6 = (Field[])gotS.GG(class_);
            int jqQR2 = object6.length;
            int n = 0;
            while (n < jqQR2) {
                object2 = object6[n];
                object3 = gotS.GG(object2);
                if (gotS.GG(object2, IXBO.class) != false) {
                    if (gotS.GG(object3) != false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43e2\ube28\uf6ff\u8c17\ue296\u8ecd\uf9fd\u515c\u44be")), gotS.GG(gotS.GG(object2))), YEBy$TyVf.W("\uc204")), gotS.GG(object2)), YEBy$TyVf.W("\uc204\ufd0e\u553e\ucb12\uc0de\u0599\ue1b8\u438b\ube24\uf6e9\u8c43\ue291\u8eca\uf9f0\u5158\u44f2"))));
                    } else if (gotS.GG(object3) == false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43e2\ube28\uf6ff\u8c17\ue296\u8ecd\uf9fd\u515c\u44be")), gotS.GG(gotS.GG(object2))), YEBy$TyVf.W("\uc204")), gotS.GG(object2)), YEBy$TyVf.W("\uc204\ufd00\u552a\ucb0f\uc0c4\u05d6\ue1ae\u43ce\ube66\uf6ff\u8c17\ue296\u8ed7\uf9f7\u515a"))));
                    } else if (gotS.GG(object3) == false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43e2\ube28\uf6ff\u8c17\ue296\u8ecd\uf9fd\u515c\u44be")), gotS.GG(gotS.GG(object2))), YEBy$TyVf.W("\uc204")), gotS.GG(object2)), YEBy$TyVf.W("\uc204\ufd00\u552a\ucb0f\uc0c4\u05d6\ue1ae\u43ce\ube66\uf6fc\u8c16\ue295\u8ecf\uf9f7\u515a"))));
                    } else if (gotS.GG(gotS.GG(object2), class_) == false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43e2\ube28\uf6ff\u8c17\ue296\u8ecd\uf9fd\u515c\u44be")), gotS.GG(gotS.GG(object2))), YEBy$TyVf.W("\uc204")), gotS.GG(object2)), YEBy$TyVf.W("\uc204\ufd04\u552c\ucb5c\uc0de\u0599\ue1b8\u438b\ube27\uf6ff\u8c10\ue29e\u8ec4\uf9f0\u5158\u44fc\u4e77\u0083\u6e50\u808e\u708d\u8f57\uacec\u2556")), gotS.GG(class_))));
                    } else {
                        field = object2;
                        break;
                    }
                }
                ++n;
            }
            object6 = (Field[])gotS.GG(class_);
            jqQR2 = object6.length;
            n = 0;
            while (n < jqQR2) {
                object2 = object6[n];
                object3 = gotS.GG(object2);
                if (gotS.GG(object2, fKRe.class) != false) {
                    if (gotS.GG(object3) != false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43e8\ube29\uf6e2\u8c17\ue285\u8ecc\uf9f2\u5119")), gotS.GG(gotS.GG(object2))), YEBy$TyVf.W("\uc204")), gotS.GG(object2)), YEBy$TyVf.W("\uc204\ufd0e\u553e\ucb12\uc0de\u0599\ue1b8\u438b\ube24\uf6e9\u8c43\ue291\u8eca\uf9f0\u5158\u44f2"))));
                    } else if (gotS.GG(object3) != false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43e8\ube29\uf6e2\u8c17\ue285\u8ecc\uf9f2\u5119")), gotS.GG(gotS.GG(object2))), YEBy$TyVf.W("\uc204")), gotS.GG(object2)), YEBy$TyVf.W("\uc204\ufd0e\u553e\ucb12\uc0de\u0599\ue1b8\u438b\ube24\uf6e9\u8c43\ue284\u8ed7\uf9ff\u514d\u44f7\u4e78"))));
                    } else if (gotS.GG(object3) == false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43e8\ube29\uf6e2\u8c17\ue285\u8ecc\uf9f2\u5119")), gotS.GG(gotS.GG(object2))), YEBy$TyVf.W("\uc204")), gotS.GG(object2)), YEBy$TyVf.W("\uc204\ufd00\u552a\ucb0f\uc0c4\u05d6\ue1ae\u43ce\ube66\uf6fc\u8c16\ue295\u8ecf\uf9f7\u515a"))));
                    } else if (gotS.GG(ndLE.class, gotS.GG(object2)) == false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43e8\ube29\uf6e2\u8c17\ue285\u8ecc\uf9f2\u5119")), gotS.GG(gotS.GG(object2))), YEBy$TyVf.W("\uc204")), gotS.GG(object2)), YEBy$TyVf.W("\uc204\ufd00\u552a\ucb0f\uc0c4\u05d6\ue1ae\u43ce\ube66\uf6ed\u8c43\ue294\u8ecc\uf9f0\u514d\u44ec\u4e74\u008a\u6e1c\u808d\u708d\u8f18\uaca9\u2513\uf78d\ufe92\u4506\u0d80\u33ea\u2462\u56b6\u2088\ub3ea\u6921\u39f4\u811b\uf19b\u6265\u4847\uce32\u8aa8\u4eb3\u3b56\u8d89\uc80f\u1c45\ufbc5\ua66c\ue6b7\u691c\uc582\uc04f\ua692\u112f\u046e\u2d0d"))));
                    } else {
                        gotS.GG(wfPa2, object2);
                    }
                }
                ++n;
            }
            object6 = (Method[])gotS.GG(class_);
            jqQR2 = object6.length;
            n = 0;
            while (n < jqQR2) {
                object2 = object6[n];
                object3 = gotS.GG(object2);
                if (gotS.GG(object2, wLbX.class) != false) {
                    if (gotS.GG(object3) != false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43ee\ube28\uf6ed\u8c01\ue29b\u8ec6\uf9be")), gotS.GG(object2)), YEBy$TyVf.W("\uc20c\ufd44\u557f\ucb1f\uc0d1\u0598\ue1a2\u43c4\ube32\uf6ac\u8c01\ue292\u8e83\uf9f8\u5150\u44f0\u4e7a\u008a"))));
                    } else if (gotS.GG(object3) != false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43ee\ube28\uf6ed\u8c01\ue29b\u8ec6\uf9be")), gotS.GG(object2)), YEBy$TyVf.W("\uc20c\ufd44\u557f\ucb1f\uc0d1\u0598\ue1a2\u43c4\ube32\uf6ac\u8c01\ue292\u8e83\uf9ed\u514d\u44ff\u4e6f\u008f\u6e13"))));
                    } else if (gotS.GG(object3) == false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43ee\ube28\uf6ed\u8c01\ue29b\u8ec6\uf9be")), gotS.GG(object2)), YEBy$TyVf.W("\uc20c\ufd44\u557f\ucb11\uc0c5\u0585\ue1b8\u438b\ube24\uf6e9\u8c43\ue287\u8ed6\uf9fc\u5155\u44f7\u4e78"))));
                    } else if (gotS.GG(gotS.GG(object2), (Class)cv.e(-1302007270)) == false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43ee\ube28\uf6ed\u8c01\ue29b\u8ec6\uf9be")), gotS.GG(object2)), YEBy$TyVf.W("\uc20c\ufd44\u557f\ucb11\uc0c5\u0585\ue1b8\u438b\ube34\uf6e9\u8c17\ue282\u8ed1\uf9f0\u5119\u44e8\u4e74\u008f\u6e14"))));
                    } else if (gotS.GG(object2) != false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43ee\ube28\uf6ed\u8c01\ue29b\u8ec6\uf9be")), gotS.GG(object2)), YEBy$TyVf.W("\uc20c\ufd44\u557f\ucb1f\uc0d1\u0598\ue1a2\u43c4\ube32\uf6ac\u8c0b\ue296\u8ed5\uf9fb\u5119\u44ff\u4e75\u009f\u6e50\u8098\u709e\u8f4a\uace0\u251b\uf790\ufe92\u4506\u0d9c\u33fd"))));
                    } else {
                        object4 = object2;
                    }
                }
                ++n;
            }
            object6 = (Method[])gotS.GG(class_);
            jqQR2 = object6.length;
            n = 0;
            while (n < jqQR2) {
                object2 = object6[n];
                object3 = gotS.GG(object2);
                if (gotS.GG(object2, Whxy.class) != false) {
                    if (gotS.GG(object3) != false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43ef\ube2f\uf6ff\u8c02\ue295\u8ecf\uf9fb\u5119")), gotS.GG(object2)), YEBy$TyVf.W("\uc20c\ufd44\u557f\ucb1f\uc0d1\u0598\ue1a2\u43c4\ube32\uf6ac\u8c01\ue292\u8e83\uf9f8\u5150\u44f0\u4e7a\u008a"))));
                    } else if (gotS.GG(object3) != false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43ef\ube2f\uf6ff\u8c02\ue295\u8ecf\uf9fb\u5119")), gotS.GG(object2)), YEBy$TyVf.W("\uc20c\ufd44\u557f\ucb1f\uc0d1\u0598\ue1a2\u43c4\ube32\uf6ac\u8c01\ue292\u8e83\uf9ed\u514d\u44ff\u4e6f\u008f\u6e13"))));
                    } else if (gotS.GG(object3) == false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43ef\ube2f\uf6ff\u8c02\ue295\u8ecf\uf9fb\u5119")), gotS.GG(object2)), YEBy$TyVf.W("\uc20c\ufd44\u557f\ucb11\uc0c5\u0585\ue1b8\u438b\ube24\uf6e9\u8c43\ue287\u8ed6\uf9fc\u5155\u44f7\u4e78"))));
                    } else if (gotS.GG(gotS.GG(object2), (Class)cv.e(-1302007270)) == false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43ef\ube2f\uf6ff\u8c02\ue295\u8ecf\uf9fb\u5119")), gotS.GG(object2)), YEBy$TyVf.W("\uc20c\ufd44\u557f\ucb11\uc0c5\u0585\ue1b8\u438b\ube34\uf6e9\u8c17\ue282\u8ed1\uf9f0\u5119\u44e8\u4e74\u008f\u6e14"))));
                    } else if (gotS.GG(object2) != false) {
                        gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc262\ufd04\u553a\ucb10\uc0d4\u05d6\ue18c\u43ef\ube2f\uf6ff\u8c02\ue295\u8ecf\uf9fb\u5119")), gotS.GG(object2)), YEBy$TyVf.W("\uc20c\ufd44\u557f\ucb1f\uc0d1\u0598\ue1a2\u43c4\ube32\uf6ac\u8c0b\ue296\u8ed5\uf9fb\u5119\u44ff\u4e75\u009f\u6e50\u8098\u709e\u8f4a\uace0\u251b\uf790\ufe92\u4506\u0d9c\u33fd"))));
                    } else {
                        object5 = object2;
                    }
                }
                ++n;
            }
            object2 = gotS.GG(class_, new Class[0]);
            if (object2 == null) {
                gotS.GG(gotS.GG(gotS.GG(new StringBuilder((String)gotS.GG(gotS.GG(class_))), YEBy$TyVf.W("\uc204\ufd00\u552a\ucb0f\uc0c4\u05d6\ue1af\u43c4\ube28\uf6f8\u8c02\ue29e\u8ecd\uf9be\u5158\u44be\u4e78\u0089\u6e1e\u809b\u708b\u8f4a\uacf4\u2515\uf781\ufe89\u4511\u0dce\u33f9\u2478\u56e2\u2093\ub3f0\u6926\u39e7\u815e\uf1d4\u6268\u4851\uce7c\u8aac\u4ea0\u3b4b\u8d84\uc84c\u1c63\ufbde\ua667\ue6b1\u691d"))));
                continue;
            }
            Object object7 = gotS.GG(object2, new Object[0]);
            if (field != null) {
                gotS.GG(field, object7, object7);
                gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc264\ufd24\u5531\ucb0f\uc0c4\u0597\ue1a2\u43c8\ube23\uf6ac")), gotS.GG(gotS.GG(object7)))));
            }
            object6 = gotS.GG(wfPa2);
            while (object6.hasNext()) {
                Field field2 = (Field)object6.next();
                Object object8 = gotS.GG(gotS.GG(field2), new Class[0]);
                if (object8 == null) {
                    gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc267\ufd02\u5531\ucb08\uc0c2\u0599\ue1a0\u43c7\ube23\uf6fe\u8c43")), gotS.GG(gotS.GG(field2))), YEBy$TyVf.W("\uc204\ufd00\u552a\ucb0f\uc0c4\u05d6\ue1af\u43c4\ube28\uf6f8\u8c02\ue29e\u8ecd\uf9be\u5158\u44be\u4e78\u0089\u6e1e\u809b\u708b\u8f4a\uacf4\u2515\uf781\ufe89\u4511\u0dce\u33f9\u2478\u56e2\u2093\ub3f0\u6926\u39e7\u815e\uf1d4\u6268\u4851\uce7c\u8aac\u4ea0\u3b4b\u8d84\uc84c\u1c63\ufbde\ua667\ue6b1\u691d"))));
                    continue;
                }
                Object object9 = gotS.GG(object8, new Object[0]);
                gotS.GG(field2, object7, object9);
                gotS.GG((wfPa)cv.b(this, -1589578800), (jqQR)object9);
                gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc264\ufd2e\u5530\ucb12\uc0c4\u0584\ue1a3\u43c7\ube66")), gotS.GG(gotS.GG(object9)))));
            }
            if (object4 != null) {
                gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\uc264\ufd28\u5531\ucb1d\uc0d2\u059a\ue1a9\u438b")), gotS.GG(object4)), YEBy$TyVf.W("\uc20c\ufd44"))));
                object6 = gotS.GG((wfPa)cv.b(this, -1589578800));
                while (object6.hasNext()) {
                    jqQR jqQR3 = (jqQR)object6.next();
                    gotS.GG(jqQR3);
                }
                gotS.GG(object4, object7, new Object[0]);
            }
            gotS.GG((ktOu)cv.b(this, -408489006), object7, object5);
        }
        object = gotS.GG((wfPa)cv.e(1677390826));
        while (object.hasNext()) {
            Method method = (Method)object.next();
            gotS.GG(method, null, new Object[]{this});
        }
    }

    @Override
    public void wLbX() throws IOException, ClassNotFoundException {
        Object object = gotS.GG(this);
        FileInputStream fileInputStream = new FileInputStream((File)object);
        ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
        Object object2 = gotS.GG(zipInputStream);
        while (object2 != null) {
            if (gotS.GG(object2) == false) {
                if (gotS.GG(gotS.GG(object2), YEBy$TyVf.W("\ufd6f\u88b1\u66e8\u4d51\ua941\u07ac")) != false) {
                    if (gotS.GG(gotS.GG(object2), YEBy$TyVf.W("\ufd65")) == false) {
                        Object object3 = gotS.GG(gotS.GG(gotS.GG(object2), YEBy$TyVf.W("\ufd6e"), YEBy$TyVf.W("\ufd6f")), YEBy$TyVf.W("\ufd6f\u88b1\u66e8\u4d51\ua941\u07ac"), "");
                        Object object4 = gotS.GG(object3);
                        gotS.GG((wfPa)cv.e(259781609), object4);
                    }
                }
            }
            object2 = gotS.GG(zipInputStream);
        }
        gotS.GG(zipInputStream);
        try {
            this.IXBO();
            this.roui();
        }
        catch (Exception exception) {
            object2 = exception;
            gotS.GG(exception);
        }
        this.ndLE();
    }

    private void ndLE() {
        Object object = gotS.GG((wfPa)cv.e(259781609));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            if (gotS.GG(class_, pXtD.class) == false) continue;
            gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\ua541\uf271\u564c\ufc5f\u0e4f\ucc8b\u2a8d\uad9c\ua56d\u0508\ua564\ub442\ucc97\ub2c9\ue9cb")), gotS.GG(class_))));
            Field[] arrfield = (Field[])gotS.GG(class_);
            int n = arrfield.length;
            int n2 = 0;
            while (n2 < n) {
                Field field = arrfield[n2];
                if (gotS.GG(field, ktXk.class) != false) {
                    gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\ua541\uf271\u564c\ufc5f\u0e4f\ucc81\u2a89\uad81\ua561\u052e\ua565\ub452\ucc9d\ub2cf\ue99f\u401e\u5afc\u19c6")), gotS.GG(field))));
                    cv.V(790229992, field);
                }
                if (gotS.GG(field, JkiO.class) != false) {
                    gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\ua541\uf271\u564c\ufc5f\u0e4f\ucc8c\u2a87\uad9a\ua560\u050e\ua52d")), gotS.GG(field))));
                    cv.V(1138029547, field);
                }
                ++n2;
            }
        }
    }

    private void IXBO() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object object = gotS.GG((wfPa)cv.e(259781609));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            if (gotS.GG(class_, QNWg.class) == false) continue;
            gotS.GG(gotS.GG(gotS.GG(new StringBuilder(rgig$AWxc.r("\u6a77\ucd0f\uec44\u8782\u8bb5\u5449\u5a65\uc5a3\uf2a2\u97e1\ue4f4\ufda0\ubf78\u219e\u718c\u7bd0\u55f0\uac84\ub601\uf02e\uae35\u493f")), gotS.GG(class_))));
            Method[] arrmethod = (Method[])gotS.GG(class_);
            int n = arrmethod.length;
            int n2 = 0;
            while (n2 < n) {
                Method method = arrmethod[n2];
                if (gotS.GG(method, nRmP.class) != false) {
                    gotS.GG(gotS.GG(gotS.GG(new StringBuilder(rgig$AWxc.r("\u6a77\ucd19\uec5c\u879b\u8b91\u5452\u5a69\uc5ae\uf295\u97ae")), gotS.GG(method))));
                    gotS.GG(method, null, new Object[]{this});
                }
                ++n2;
            }
        }
    }

    private void roui() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object object = gotS.GG((wfPa)cv.e(259781609));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            if (gotS.GG(class_, QNWg.class) == false) continue;
            gotS.GG(gotS.GG(gotS.GG(new StringBuilder(KUXS$dwji.S("\u291a\u399c\u6c46\uaed3\u165f\ufc8c\u994d\ub15f\uf54a\u7172\u66fd\u7842\u6ac2\u1216\u6036\ub4df\u43cd\u8fad\ub586\uf2c2\ubb89\u3ddc")), gotS.GG(class_))));
            Method[] arrmethod = (Method[])gotS.GG(class_);
            int n = arrmethod.length;
            int n2 = 0;
            while (n2 < n) {
                Method method = arrmethod[n2];
                if (gotS.GG(method, sHhL.class) != false) {
                    gotS.GG(gotS.GG(gotS.GG(new StringBuilder(KUXS$dwji.S("\u291a\u399c\u6c46\uaed3\u165f\ufc8c\u994d\ub15f\uf55d\u716f\u66f2\u7847\u6ac0\u1214\u6031\ub48d")), gotS.GG(method))));
                    gotS.GG((wfPa)cv.e(1677390826), method);
                }
                ++n2;
            }
        }
    }

    private void Pdcq() throws IOException, ClassNotFoundException {
        Object object = gotS.GG((wfPa)cv.e(259781609));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            if (gotS.GG(class_, roui.class) != false) {
                gotS.GG((wfPa)cv.b(this, 1886712797), class_);
                gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\u1e99\ue0ce\ua434\uebd8\ue095\u63c1\u24a1\ua7b1")), gotS.GG(class_))));
            }
            if (gotS.GG(class_, IWbc.class) == false) continue;
            int n = ((IWbc)gotS.GG(class_, IWbc.class)).value();
            if (gotS.GG((ktOu)cv.e(-1326510031), gotS.GG(n)) == false) {
                gotS.GG((ktOu)cv.e(-1326510031), gotS.GG(n), new wfPa());
            }
            gotS.GG((wfPa)gotS.GG((ktOu)cv.e(-1326510031), gotS.GG(n)), class_);
            gotS.GG(gotS.GG(gotS.GG(gotS.GG(gotS.GG(new StringBuilder(YEBy$TyVf.W("\u1e99\ue0df\ua436\uebce\ue09a\u63c7\u24bd\ua7b9")), n), YEBy$TyVf.W("\u1ef0\ue0be")), gotS.GG(class_))));
        }
    }

    @Override
    public void FFBA() {
        if (gotS.GG() == false) {
            return;
        }
        Object object = gotS.GG((wfPa)cv.b(this, -1589578800));
        while (object.hasNext()) {
            ndLE ndLE2 = (ndLE)object.next();
            ndLE2.tick();
        }
        gotS.GG(this.IWbc());
    }

    private static Object GG(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


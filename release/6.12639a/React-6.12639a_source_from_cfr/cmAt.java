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

public class cmAt
extends NxWm {
    private feCR<Class<?>> ecON;
    private TNku<Object, Method> cBtr;
    private feCR<ggmf> EMAp;
    public static TNku<Integer, feCR<Class<?>>> XSwM;
    private static final feCR<Class<?>> PTqJ;
    private static Field qwQw;
    private static Field OALr;
    private static final feCR<Method> qwQs;
    public static long iLud;

    static {
        o.w(-680241311, new feCR());
        o.w(1882347360, null);
        o.w(-1238804641, null);
        o.w(-1251322018, new feCR());
        o.w(979720029, -1);
    }

    public cmAt() {
        try {
            o.w(278287122, new TNku());
            this.EMAp = new feCR();
            this.ecON = new feCR();
            this.cAqI();
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            cmAt.jL(iOException);
            return;
        }
        catch (SecurityException securityException) {
            SecurityException securityException2 = securityException;
            cmAt.jL(securityException);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
            cmAt.jL(illegalArgumentException);
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            ClassNotFoundException classNotFoundException2 = classNotFoundException;
            cmAt.jL(classNotFoundException);
            return;
        }
    }

    @Override
    public void NpJL() {
    }

    @Override
    public long psKX() {
        if ((Field)o.k(1882347360) == null) {
            return 100000;
        }
        if ((Long)o.k(979720029) < 0) {
            try {
                o.w(979720029, (long)cmAt.jL((Long)cmAt.jL((Field)o.k(1882347360), null)));
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                cmAt.jL(exception);
                o.w(979720029, 100000);
            }
        }
        return (Long)o.k(979720029);
    }

    public static void LOpQ() {
        o.w(979720029, -1);
    }

    public static void NNFi() {
        cmAt.biLo(new cmAt$1());
    }

    public static void biLo(Runnable runnable) {
        Object object = cmAt.jL(cmAt.jL(cmAt.jL()));
        cmAt.jL(cmAt.jL(cmAt.jL()));
        cmAt.jL(object);
    }

    @Override
    public int getThreadCount() {
        if ((Field)o.k(-1238804641) == null) {
            return 2;
        }
        try {
            return (int)cmAt.jL((Integer)cmAt.jL((Field)o.k(-1238804641), null));
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            cmAt.jL(exception);
            return 2;
        }
    }

    @Override
    public void yJLS(eHVp eHVp2) {
        try {
            this.ydSR();
            return;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            NoSuchMethodException noSuchMethodException2 = noSuchMethodException;
            cmAt.jL(noSuchMethodException);
            return;
        }
        catch (SecurityException securityException) {
            SecurityException securityException2 = securityException;
            cmAt.jL(securityException);
            return;
        }
        catch (InstantiationException instantiationException) {
            InstantiationException instantiationException2 = instantiationException;
            cmAt.jL(instantiationException);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            IllegalAccessException illegalAccessException2 = illegalAccessException;
            cmAt.jL(illegalAccessException);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
            cmAt.jL(illegalArgumentException);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            InvocationTargetException invocationTargetException2 = invocationTargetException;
            cmAt.jL(invocationTargetException);
            return;
        }
    }

    @Override
    public void SKsf() {
        try {
            this.JIjX();
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            IllegalAccessException illegalAccessException2 = illegalAccessException;
            cmAt.jL(illegalAccessException);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
            cmAt.jL(illegalArgumentException);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            InvocationTargetException invocationTargetException2 = invocationTargetException;
            cmAt.jL(invocationTargetException);
            return;
        }
    }

    @Override
    public void dgVt() {
    }

    @Override
    public void Kwaa() {
    }

    private void JIjX() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object object = cmAt.jL((feCR)o.a(this, 247945064));
        while (object.hasNext()) {
            ggmf ggmf2 = (ggmf)object.next();
            cmAt.jL(ggmf2);
        }
        cmAt.jL((feCR)o.a(this, 247945064));
        object = cmAt.jL(cmAt.jL((TNku)o.a(this, 1747539814)));
        while (object.hasNext()) {
            Object e = object.next();
            cmAt.jL((Method)cmAt.jL((TNku)o.a(this, 1747539814), e), e, new Object[0]);
        }
    }

    private void ydSR() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        o.v(this, 1747539814, new TNku());
        Object object = cmAt.jL((feCR)o.a(this, 2129549157));
        while (object.hasNext()) {
            Object object2;
            Object object3;
            Class class_ = (Class)object.next();
            Field field = null;
            Object object4 = null;
            Object object5 = null;
            feCR feCR2 = new feCR();
            Object object6 = (Field[])cmAt.jL(class_);
            int ggmf2 = object6.length;
            int n = 0;
            while (n < ggmf2) {
                object2 = object6[n];
                object3 = cmAt.jL(object2);
                if (cmAt.jL(object2, Qgnj.class) != false) {
                    if (cmAt.jL(object3) != false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51a5\u5408\ub1f5\u400e\ued57\u8603\u11cf\u3034\ud32c")), cmAt.jL(cmAt.jL(object2))), mrFx$WjFM.d("\u31fa")), cmAt.jL(object2)), mrFx$WjFM.d("\u31fa\ud3e5\u311e\u070f\u6329\ufb13\ud662\u51cc\u5404\ub1e3\u405a\ued50\u8604\u11c2\u3030\ud360"))));
                    } else if (cmAt.jL(object3) == false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51a5\u5408\ub1f5\u400e\ued57\u8603\u11cf\u3034\ud32c")), cmAt.jL(cmAt.jL(object2))), mrFx$WjFM.d("\u31fa")), cmAt.jL(object2)), mrFx$WjFM.d("\u31fa\ud3eb\u310a\u0712\u6333\ufb5c\ud674\u5189\u5446\ub1f5\u400e\ued57\u8619\u11c5\u3032"))));
                    } else if (cmAt.jL(object3) == false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51a5\u5408\ub1f5\u400e\ued57\u8603\u11cf\u3034\ud32c")), cmAt.jL(cmAt.jL(object2))), mrFx$WjFM.d("\u31fa")), cmAt.jL(object2)), mrFx$WjFM.d("\u31fa\ud3eb\u310a\u0712\u6333\ufb5c\ud674\u5189\u5446\ub1f6\u400f\ued54\u8601\u11c5\u3032"))));
                    } else if (cmAt.jL(cmAt.jL(object2), class_) == false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51a5\u5408\ub1f5\u400e\ued57\u8603\u11cf\u3034\ud32c")), cmAt.jL(cmAt.jL(object2))), mrFx$WjFM.d("\u31fa")), cmAt.jL(object2)), mrFx$WjFM.d("\u31fa\ud3ef\u310c\u0741\u6329\ufb13\ud662\u51cc\u5407\ub1f5\u4009\ued5f\u860a\u11c2\u3030\ud36e\ub5df\ud668\uaad1\udf54\ub87d\u6cfb\uf776\u7465")), cmAt.jL(class_))));
                    } else {
                        field = object2;
                        break;
                    }
                }
                ++n;
            }
            object6 = (Field[])cmAt.jL(class_);
            ggmf2 = object6.length;
            n = 0;
            while (n < ggmf2) {
                object2 = object6[n];
                object3 = cmAt.jL(object2);
                if (cmAt.jL(object2, VLkD.class) != false) {
                    if (cmAt.jL(object3) != false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51af\u5409\ub1e8\u400e\ued44\u8602\u11c0\u3071")), cmAt.jL(cmAt.jL(object2))), mrFx$WjFM.d("\u31fa")), cmAt.jL(object2)), mrFx$WjFM.d("\u31fa\ud3e5\u311e\u070f\u6329\ufb13\ud662\u51cc\u5404\ub1e3\u405a\ued50\u8604\u11c2\u3030\ud360"))));
                    } else if (cmAt.jL(object3) != false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51af\u5409\ub1e8\u400e\ued44\u8602\u11c0\u3071")), cmAt.jL(cmAt.jL(object2))), mrFx$WjFM.d("\u31fa")), cmAt.jL(object2)), mrFx$WjFM.d("\u31fa\ud3e5\u311e\u070f\u6329\ufb13\ud662\u51cc\u5404\ub1e3\u405a\ued45\u8619\u11cd\u3025\ud365\ub5d0"))));
                    } else if (cmAt.jL(object3) == false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51af\u5409\ub1e8\u400e\ued44\u8602\u11c0\u3071")), cmAt.jL(cmAt.jL(object2))), mrFx$WjFM.d("\u31fa")), cmAt.jL(object2)), mrFx$WjFM.d("\u31fa\ud3eb\u310a\u0712\u6333\ufb5c\ud674\u5189\u5446\ub1f6\u400f\ued54\u8601\u11c5\u3032"))));
                    } else if (cmAt.jL(yAmM.class, cmAt.jL(object2)) == false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51af\u5409\ub1e8\u400e\ued44\u8602\u11c0\u3071")), cmAt.jL(cmAt.jL(object2))), mrFx$WjFM.d("\u31fa")), cmAt.jL(object2)), mrFx$WjFM.d("\u31fa\ud3eb\u310a\u0712\u6333\ufb5c\ud674\u5189\u5446\ub1e7\u405a\ued55\u8602\u11c2\u3025\ud37e\ub5dc\ud661\uaa9d\udf57\ub87d\u6cb4\uf733\u7420\u0b5c\u9b34\u5be6\uda23\uea3a\u13eb\u3a0d\u3f86\u0b8c\ufd26\u8834\ue254\ub339\u84af\u1e41\ufb70\u5de0\uefd5\ua418\uc4dd\u39de\u4f44\uab3d\u7d53\u09c3\u2565\u59f3\uad9e\u07c5\udc23\ue480\u4ea7"))));
                    } else {
                        cmAt.jL(feCR2, object2);
                    }
                }
                ++n;
            }
            object6 = (Method[])cmAt.jL(class_);
            ggmf2 = object6.length;
            n = 0;
            while (n < ggmf2) {
                object2 = object6[n];
                object3 = cmAt.jL(object2);
                if (cmAt.jL(object2, XcrK.class) != false) {
                    if (cmAt.jL(object3) != false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51a9\u5408\ub1e7\u4018\ued5a\u8608\u118c")), cmAt.jL(object2)), mrFx$WjFM.d("\u31f2\ud3af\u315f\u0702\u6326\ufb12\ud678\u5183\u5412\ub1a6\u4018\ued53\u864d\u11ca\u3038\ud362\ub5d2\ud661"))));
                    } else if (cmAt.jL(object3) != false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51a9\u5408\ub1e7\u4018\ued5a\u8608\u118c")), cmAt.jL(object2)), mrFx$WjFM.d("\u31f2\ud3af\u315f\u0702\u6326\ufb12\ud678\u5183\u5412\ub1a6\u4018\ued53\u864d\u11df\u3025\ud36d\ub5c7\ud664\uaa92"))));
                    } else if (cmAt.jL(object3) == false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51a9\u5408\ub1e7\u4018\ued5a\u8608\u118c")), cmAt.jL(object2)), mrFx$WjFM.d("\u31f2\ud3af\u315f\u070c\u6332\ufb0f\ud662\u51cc\u5404\ub1e3\u405a\ued46\u8618\u11ce\u303d\ud365\ub5d0"))));
                    } else if (cmAt.jL(cmAt.jL(object2), (Class)o.k(-975874225)) == false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51a9\u5408\ub1e7\u4018\ued5a\u8608\u118c")), cmAt.jL(object2)), mrFx$WjFM.d("\u31f2\ud3af\u315f\u070c\u6332\ufb0f\ud662\u51cc\u5414\ub1e3\u400e\ued43\u861f\u11c2\u3071\ud37a\ub5dc\ud664\uaa95"))));
                    } else if (cmAt.jL(object2) != false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51a9\u5408\ub1e7\u4018\ued5a\u8608\u118c")), cmAt.jL(object2)), mrFx$WjFM.d("\u31f2\ud3af\u315f\u0702\u6326\ufb12\ud678\u5183\u5412\ub1a6\u4012\ued57\u861b\u11c9\u3071\ud36d\ub5dd\ud674\uaad1\udf42\ub86e\u6ce6\uf77a\u7428\u0b41\u9b34\u5be6\uda3f\uea2d"))));
                    } else {
                        object4 = object2;
                    }
                }
                ++n;
            }
            object6 = (Method[])cmAt.jL(class_);
            ggmf2 = object6.length;
            n = 0;
            while (n < ggmf2) {
                object2 = object6[n];
                object3 = cmAt.jL(object2);
                if (cmAt.jL(object2, paft.class) != false) {
                    if (cmAt.jL(object3) != false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51a8\u540f\ub1f5\u401b\ued54\u8601\u11c9\u3071")), cmAt.jL(object2)), mrFx$WjFM.d("\u31f2\ud3af\u315f\u0702\u6326\ufb12\ud678\u5183\u5412\ub1a6\u4018\ued53\u864d\u11ca\u3038\ud362\ub5d2\ud661"))));
                    } else if (cmAt.jL(object3) != false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51a8\u540f\ub1f5\u401b\ued54\u8601\u11c9\u3071")), cmAt.jL(object2)), mrFx$WjFM.d("\u31f2\ud3af\u315f\u0702\u6326\ufb12\ud678\u5183\u5412\ub1a6\u4018\ued53\u864d\u11df\u3025\ud36d\ub5c7\ud664\uaa92"))));
                    } else if (cmAt.jL(object3) == false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51a8\u540f\ub1f5\u401b\ued54\u8601\u11c9\u3071")), cmAt.jL(object2)), mrFx$WjFM.d("\u31f2\ud3af\u315f\u070c\u6332\ufb0f\ud662\u51cc\u5404\ub1e3\u405a\ued46\u8618\u11ce\u303d\ud365\ub5d0"))));
                    } else if (cmAt.jL(cmAt.jL(object2), (Class)o.k(-975874225)) == false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51a8\u540f\ub1f5\u401b\ued54\u8601\u11c9\u3071")), cmAt.jL(object2)), mrFx$WjFM.d("\u31f2\ud3af\u315f\u070c\u6332\ufb0f\ud662\u51cc\u5414\ub1e3\u400e\ued43\u861f\u11c2\u3071\ud37a\ub5dc\ud664\uaa95"))));
                    } else if (cmAt.jL(object2) != false) {
                        cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319c\ud3ef\u311a\u070d\u6323\ufb5c\ud656\u51a8\u540f\ub1f5\u401b\ued54\u8601\u11c9\u3071")), cmAt.jL(object2)), mrFx$WjFM.d("\u31f2\ud3af\u315f\u0702\u6326\ufb12\ud678\u5183\u5412\ub1a6\u4012\ued57\u861b\u11c9\u3071\ud36d\ub5dd\ud674\uaad1\udf42\ub86e\u6ce6\uf77a\u7428\u0b41\u9b34\u5be6\uda3f\uea2d"))));
                    } else {
                        object5 = object2;
                    }
                }
                ++n;
            }
            object2 = cmAt.jL(class_, new Class[0]);
            if (object2 == null) {
                cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder((String)cmAt.jL(cmAt.jL(class_))), mrFx$WjFM.d("\u31fa\ud3eb\u310a\u0712\u6333\ufb5c\ud675\u5183\u5408\ub1f2\u401b\ued5f\u8603\u118c\u3030\ud32c\ub5d0\ud662\uaa9f\udf41\ub87b\u6ce6\uf76e\u7426\u0b50\u9b2f\u5bf1\uda6d\uea29\u13f1\u3a59\u3f9d\u0b96\ufd21\u8827\ue211\ub376\u84a2\u1e57\ufb3e\u5de4\uefc6\ua405\uc4d0\u399d\u4f62\uab26\u7d58\u09c5\u2564"))));
                continue;
            }
            Object object7 = cmAt.jL(object2, new Object[0]);
            if (field != null) {
                cmAt.jL(field, object7, object7);
                cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319a\ud3cf\u3111\u0712\u6333\ufb1d\ud678\u518f\u5403\ub1a6")), cmAt.jL(cmAt.jL(object7)))));
            }
            object6 = cmAt.jL(feCR2);
            while (object6.hasNext()) {
                Field field2 = (Field)object6.next();
                Object object8 = cmAt.jL(cmAt.jL(field2), new Class[0]);
                if (object8 == null) {
                    cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u3199\ud3e9\u3111\u0715\u6335\ufb13\ud67a\u5180\u5403\ub1f4\u405a")), cmAt.jL(cmAt.jL(field2))), mrFx$WjFM.d("\u31fa\ud3eb\u310a\u0712\u6333\ufb5c\ud675\u5183\u5408\ub1f2\u401b\ued5f\u8603\u118c\u3030\ud32c\ub5d0\ud662\uaa9f\udf41\ub87b\u6ce6\uf76e\u7426\u0b50\u9b2f\u5bf1\uda6d\uea29\u13f1\u3a59\u3f9d\u0b96\ufd21\u8827\ue211\ub376\u84a2\u1e57\ufb3e\u5de4\uefc6\ua405\uc4d0\u399d\u4f62\uab26\u7d58\u09c5\u2564"))));
                    continue;
                }
                Object object9 = cmAt.jL(object8, new Object[0]);
                cmAt.jL(field2, object7, object9);
                cmAt.jL((feCR)o.a(this, 247945064), (ggmf)object9);
                cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319a\ud3c5\u3110\u070f\u6333\ufb0e\ud679\u5180\u5446")), cmAt.jL(cmAt.jL(object9)))));
            }
            if (object4 != null) {
                cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u319a\ud3c3\u3111\u0700\u6325\ufb10\ud673\u51cc")), cmAt.jL(object4)), mrFx$WjFM.d("\u31f2\ud3af"))));
                object6 = cmAt.jL((feCR)o.a(this, 247945064));
                while (object6.hasNext()) {
                    ggmf ggmf3 = (ggmf)object6.next();
                    cmAt.jL(ggmf3);
                }
                cmAt.jL(object4, object7, new Object[0]);
            }
            cmAt.jL((TNku)o.a(this, 1747539814), object7, object5);
        }
        object = cmAt.jL((feCR)o.k(-1251322018));
        while (object.hasNext()) {
            Method method = (Method)object.next();
            cmAt.jL(method, null, new Object[]{this});
        }
    }

    @Override
    public void oVTn() throws IOException, ClassNotFoundException {
        Object object = cmAt.jL(this);
        FileInputStream fileInputStream = new FileInputStream((File)object);
        ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
        Object object2 = cmAt.jL(zipInputStream);
        while (object2 != null) {
            if (cmAt.jL(object2) == false) {
                if (cmAt.jL(cmAt.jL(object2), mrFx$WjFM.d("\u5626\ud838\ue46d\uc29f\ua1c4\u9819")) != false) {
                    if (cmAt.jL(cmAt.jL(object2), mrFx$WjFM.d("\u562c")) == false) {
                        try {
                            Object object3 = cmAt.jL(cmAt.jL(cmAt.jL(object2), mrFx$WjFM.d("\u5627"), mrFx$WjFM.d("\u5626")), mrFx$WjFM.d("\u5626\ud838\ue46d\uc29f\ua1c4\u9819"), "");
                            Object object4 = cmAt.jL(object3);
                            cmAt.jL((feCR)o.k(-680241311), object4);
                        }
                        catch (Throwable throwable) {
                            // empty catch block
                        }
                    }
                }
            }
            object2 = cmAt.jL(zipInputStream);
        }
        cmAt.jL(zipInputStream);
        try {
            this.hjqu();
            this.gFNH();
        }
        catch (Exception exception) {
            object2 = exception;
            cmAt.jL(exception);
        }
        this.PeOP();
    }

    private void PeOP() {
        Object object = cmAt.jL((feCR)o.k(-680241311));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            if (cmAt.jL(class_, bOmc.class) == false) continue;
            cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(nJPf$sILv.G("\u56f3\uc28c\udacc\u8bce\ucf50\ubc53\u7a94\u3e13\u7951\u87e4\u1682\u83da\ud8d6\uf175\u43a0")), cmAt.jL(class_))));
            Field[] arrfield = (Field[])cmAt.jL(class_);
            int n = arrfield.length;
            int n2 = 0;
            while (n2 < n) {
                Field field = arrfield[n2];
                if (cmAt.jL(field, PJyi.class) != false) {
                    cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(nJPf$sILv.G("\u56f3\uc28c\udacc\u8bce\ucf50\ubc59\u7a90\u3e0e\u795d\u87c2\u1683\u83ca\ud8dc\uf173\u43f4\u75d7\u347e\u6e99")), cmAt.jL(field))));
                    o.w(1882347360, field);
                }
                if (cmAt.jL(field, wnlo.class) != false) {
                    cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(nJPf$sILv.G("\u56f3\uc28c\udacc\u8bce\ucf50\ubc54\u7a9e\u3e15\u795c\u87e2\u16cb")), cmAt.jL(field))));
                    o.w(-1238804641, field);
                }
                ++n2;
            }
        }
    }

    private void hjqu() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object object = cmAt.jL((feCR)o.k(-680241311));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            if (cmAt.jL(class_, YEUY.class) == false) continue;
            cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u9eef\u9335\u4a89\ue0d9\u3069\udf7f\u996a\uda62\u91d7\ub872\u3fc2\u3c68\u61a8\u7bef\u3ce1\u9b60\ucc40\u7bc5\u913b\u5384\u92ee\u38c5")), cmAt.jL(class_))));
            Method[] arrmethod = (Method[])cmAt.jL(class_);
            int n = arrmethod.length;
            int n2 = 0;
            while (n2 < n) {
                Method method = arrmethod[n2];
                if (cmAt.jL(method, WaRF.class) != false) {
                    cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u9eef\u9323\u4a91\ue0c0\u304d\udf64\u9966\uda6f\u91e0\ub83d")), cmAt.jL(method))));
                    cmAt.jL(method, null, new Object[]{this});
                }
                ++n2;
            }
        }
    }

    private void gFNH() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object object = cmAt.jL((feCR)o.k(-680241311));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            if (cmAt.jL(class_, YEUY.class) == false) continue;
            cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u03c4\u7314\u06da\u0c92\u8579\ud3e7\u7dc0\u9cd7\ue517\u60ccY\u3305\u21ad\u2613\ua771\u8a60\ud6cc\u94e0\u3265\u8f7b\ubaed\ub431")), cmAt.jL(class_))));
            Method[] arrmethod = (Method[])cmAt.jL(class_);
            int n = arrmethod.length;
            int n2 = 0;
            while (n2 < n) {
                Method method = arrmethod[n2];
                if (cmAt.jL(method, LOqF.class) != false) {
                    cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(mrFx$WjFM.d("\u03c4\u7314\u06da\u0c92\u8579\ud3e7\u7dc0\u9cd7\ue500\u60d1V\u3300\u21af\u2611\ua776\u8a32")), cmAt.jL(method))));
                    cmAt.jL((feCR)o.k(-1251322018), method);
                }
                ++n2;
            }
        }
    }

    private void cAqI() throws IOException, ClassNotFoundException {
        Object object = cmAt.jL((feCR)o.k(-680241311));
        while (object.hasNext()) {
            Class class_ = (Class)object.next();
            if (cmAt.jL(class_, jiGL.class) != false) {
                cmAt.jL((feCR)o.a(this, 2129549157), class_);
                cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(nJPf$sILv.G("\ucfa1\u2113\u1b93\ue01d\ude4b\ude01\u2151\uce2b")), cmAt.jL(class_))));
            }
            if (cmAt.jL(class_, BtuM.class) == false) continue;
            int n = ((BtuM)cmAt.jL(class_, BtuM.class)).value();
            if (cmAt.jL((TNku)o.k(278287122), cmAt.jL(n)) == false) {
                cmAt.jL((TNku)o.k(278287122), cmAt.jL(n), new feCR());
            }
            cmAt.jL((feCR)cmAt.jL((TNku)o.k(278287122), cmAt.jL(n)), class_);
            cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(cmAt.jL(new StringBuilder(nJPf$sILv.G("\ucfa1\u2102\u1b91\ue00b\ude44\ude07\u214d\uce23")), n), nJPf$sILv.G("\ucfc8\u2163")), cmAt.jL(class_))));
        }
    }

    @Override
    public void owir() {
        if (cmAt.jL() == false) {
            return;
        }
        Object object = cmAt.jL((feCR)o.a(this, 247945064));
        while (object.hasNext()) {
            yAmM yAmM2 = (yAmM)object.next();
            yAmM2.tick();
        }
        cmAt.jL(this.owvU());
    }

    private static Object jL(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


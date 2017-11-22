/*
 * Decompiled with CFR 0_123.
 */
import java.io.File;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class FEfL {
    private static /* synthetic */ int[] JBEs;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void ssNb(BAjC var1_1, File var2_2) throws Exception {
        var3_3 = new QFEs();
        var4_4 = FEfL.oG(var1_1);
        var5_5 = null;
        if (FEfL.oG(var2_2) == false) {
            var3_3 = this.ssNb(var1_1);
            FEfL.oG(new kkcI(), var3_3, var2_2);
        }
        var3_3 = FEfL.oG(new YoaF(), var2_2);
        var9_6 = (Field[])FEfL.oG(var4_4);
        var8_7 = var9_6.length;
        var7_8 = 0;
        while (var7_8 < var8_7) {
            var6_9 = var9_6[var7_8];
            if (FEfL.oG(FEfL.oG(var6_9)) != false) ** GOTO lbl43
            if (FEfL.oG(FEfL.oG(var6_9)) != false) ** GOTO lbl43
            if (FEfL.oG(FEfL.oG(var6_9)) == false) ** GOTO lbl43
            if (FEfL.oG(var6_9, DYRf.class) == false) {
lbl43: // 4 sources:
                if (FEfL.oG(var6_9, DYRf.class) != false) {
                    FEfL.oG(FEfL.oG(FEfL.oG(FEfL.oG(new StringBuilder(rgig$AWxc.r("\u52bb\ud418\u5177\u8c2e\u8d0b\u1be6\u7cfb")), FEfL.oG(var6_9)), rgig$AWxc.r("\u52dd\ud418\u5161\u8c62\u8d0a\u1bb5\u7caf\u8224\u24fb\uc9b4\u98fd\u3f34\u900a\ub01c\ud2cf\u3068\u9a61\ua4ef\u90c1\u5bdc\u0fcb\u746b\u633c\uc97d\uab51\u1a22\ucef2\u722f\u8ff6\u6837\ua076\uae46\u11e7\u6572\ua315\u4a5d"))));
                }
            } else {
                var10_10 = (DYRf)FEfL.oG(var6_9, DYRf.class);
                var11_11 = FEfL.oG(var3_3, var10_10.value());
                switch (FEfL.lDTo()[FEfL.oG(FEfL.oG(var3_3, var10_10.value()))]) {
                    case 2: {
                        FEfL.oG(var6_9, var1_1, (Boolean)var11_11);
                        break;
                    }
                    case 5: {
                        FEfL.oG(var6_9, var1_1, (Double)var11_11);
                        break;
                    }
                    case 1: {
                        FEfL.oG(var6_9, var1_1, (Integer)var11_11);
                        break;
                    }
                    case 6: {
                        FEfL.oG(var6_9, var1_1, (Long)var11_11);
                        break;
                    }
                    case 3: {
                        FEfL.oG(var6_9, var1_1, (String)var11_11);
                        break;
                    }
                    case 4: {
                        FEfL.oG(var6_9, var1_1, (List)var11_11);
                    }
                }
            }
            ++var7_8;
        }
        var9_6 = (Field[])FEfL.oG(var4_4);
        var8_7 = var9_6.length;
        var7_8 = 0;
        while (var7_8 < var8_7) {
            var6_9 = var9_6[var7_8];
            if (FEfL.oG(FEfL.oG(var6_9)) != false) {
                if (FEfL.oG(FEfL.oG(var6_9)) == false) {
                    if (FEfL.oG(FEfL.oG(var6_9)) != false) {
                        if (FEfL.oG(var6_9, aLcY.class) != false) {
                            var10_10 = FEfL.oG(var6_9, null);
                            if (var10_10 instanceof ktOu) {
                                var5_5 = (ktOu)var10_10;
                                break;
                            }
                        }
                    }
                }
            }
            ++var7_8;
        }
        if (var5_5 == null) return;
        var9_6 = (Field[])FEfL.oG(var4_4);
        var8_7 = var9_6.length;
        var7_8 = 0;
        while (var7_8 < var8_7) {
            var6_9 = var9_6[var7_8];
            if (FEfL.oG(FEfL.oG(var6_9)) == false) {
                if (FEfL.oG(FEfL.oG(var6_9)) == false) {
                    if (FEfL.oG(FEfL.oG(var6_9)) != false) {
                        if (FEfL.oG(var6_9, FyLC.class) != false) {
                            var10_10 = (FyLC)FEfL.oG(var6_9, FyLC.class);
                            var11_12 = var10_10.value();
                            var12_13 = (String)FEfL.oG(var5_5, FEfL.oG(var11_12));
                            if (var12_13 == null) {
                                FEfL.oG(FEfL.oG(FEfL.oG(FEfL.oG(FEfL.oG(FEfL.oG(FEfL.oG(FEfL.oG(new StringBuilder(rgig$AWxc.r("\u52be\ud410\u517c\u8c2c\u8d00\u1ba8\u7cfb\u822a\u24f7\uc9a8\u98b9\u3f67\u9015\ub018\ud2c2\u3021\u9a64\ua4ac\u9093\u5b9a")), var11_12), rgig$AWxc.r("\u52dd\ud459")), FEfL.oG(FEfL.oG(var6_9))), rgig$AWxc.r("\u52c7")), FEfL.oG(var6_9)), rgig$AWxc.r("\u52d4"))));
                            } else {
                                var13_14 = FEfL.oG(var3_3, var12_13);
                                switch (FEfL.lDTo()[FEfL.oG(FEfL.oG(var3_3, var12_13))]) {
                                    case 2: {
                                        FEfL.oG(var6_9, var1_1, (Boolean)var13_14);
                                        break;
                                    }
                                    case 5: {
                                        FEfL.oG(var6_9, var1_1, (Double)var13_14);
                                        break;
                                    }
                                    case 1: {
                                        FEfL.oG(var6_9, var1_1, (Integer)var13_14);
                                        break;
                                    }
                                    case 6: {
                                        FEfL.oG(var6_9, var1_1, (Long)var13_14);
                                        break;
                                    }
                                    case 3: {
                                        FEfL.oG(var6_9, var1_1, (String)var13_14);
                                        break;
                                    }
                                    case 4: {
                                        FEfL.oG(var6_9, var1_1, (List)var13_14);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ++var7_8;
        }
    }

    public QFEs ssNb(BAjC bAjC) throws ReflectiveOperationException {
        Field field;
        Object object;
        Object object2;
        QFEs qFEs = new QFEs();
        Object object3 = FEfL.oG(bAjC);
        ktOu ktOu2 = null;
        Field[] arrfield = (Field[])FEfL.oG(object3);
        int n = arrfield.length;
        int n2 = 0;
        while (n2 < n) {
            field = arrfield[n2];
            if (FEfL.oG(FEfL.oG(field)) == false) {
                if (FEfL.oG(FEfL.oG(field)) == false) {
                    if (FEfL.oG(FEfL.oG(field)) != false) {
                        if (FEfL.oG(field, DYRf.class) != false) {
                            object = (DYRf)FEfL.oG(field, DYRf.class);
                            String string = object.value();
                            object2 = FEfL.oG(field, bAjC);
                            if (object2 instanceof Integer) {
                                FEfL.oG(qFEs, string, FEfL.oG((Integer)object2));
                            } else if (object2 instanceof String) {
                                FEfL.oG(qFEs, string, (String)object2);
                            } else if (object2 instanceof Double) {
                                FEfL.oG(qFEs, string, FEfL.oG((Double)object2));
                            } else if (object2 instanceof Boolean) {
                                FEfL.oG(qFEs, string, FEfL.oG((Boolean)object2));
                            } else if (object2 instanceof Long) {
                                FEfL.oG(qFEs, string, FEfL.oG((Long)object2));
                            } else if (object2 instanceof List) {
                                FEfL.oG(qFEs, string, (List)object2);
                            } else {
                                throw new ReflectiveOperationException((String)FEfL.oG(FEfL.oG(new StringBuilder(YEBy$TyVf.W("\ue146\u92ff\ue89a\u3504\u4cd5\u91ed\u8508\ud3b6\u1886\u35df\ue18f\uf237\u9fd0\ue56c")), FEfL.oG(object2))));
                            }
                        }
                    }
                }
            }
            ++n2;
        }
        arrfield = (Field[])FEfL.oG(object3);
        n = arrfield.length;
        n2 = 0;
        while (n2 < n) {
            field = arrfield[n2];
            if (FEfL.oG(FEfL.oG(field)) != false) {
                if (FEfL.oG(FEfL.oG(field)) == false) {
                    if (FEfL.oG(FEfL.oG(field)) != false) {
                        if (FEfL.oG(field, aLcY.class) != false) {
                            object = FEfL.oG(field, null);
                            if (object instanceof ktOu) {
                                ktOu2 = (ktOu)object;
                                break;
                            }
                        }
                    }
                }
            }
            ++n2;
        }
        if (ktOu2 != null) {
            arrfield = (Field[])FEfL.oG(object3);
            n = arrfield.length;
            n2 = 0;
            while (n2 < n) {
                field = arrfield[n2];
                if (FEfL.oG(FEfL.oG(field)) == false) {
                    if (FEfL.oG(FEfL.oG(field)) == false) {
                        if (FEfL.oG(FEfL.oG(field)) != false) {
                            if (FEfL.oG(field, FyLC.class) != false) {
                                object = (FyLC)FEfL.oG(field, FyLC.class);
                                int n3 = object.value();
                                object2 = (String)FEfL.oG(ktOu2, FEfL.oG(n3));
                                if (object2 == null) {
                                    FEfL.oG(FEfL.oG(FEfL.oG(FEfL.oG(FEfL.oG(FEfL.oG(FEfL.oG(FEfL.oG(new StringBuilder(YEBy$TyVf.W("\ue150\u92f0\ue89f\u3504\u4cd5\u91ee\u8546\ud3f0\u18bb\u35e8\ue1bb\uf252\u9f81\ue529\u1b17\u739a\u7a70\ub1cd\ua135\u04e8")), n3), YEBy$TyVf.W("\ue133\u92b9")), FEfL.oG(FEfL.oG(field))), YEBy$TyVf.W("\ue129")), FEfL.oG(field)), YEBy$TyVf.W("\ue13a"))));
                                } else {
                                    Object object4 = FEfL.oG(field, bAjC);
                                    if (object4 instanceof Integer) {
                                        FEfL.oG(qFEs, object2, FEfL.oG((Integer)object4));
                                    } else if (object4 instanceof String) {
                                        FEfL.oG(qFEs, object2, (String)object4);
                                    } else if (object4 instanceof Double) {
                                        FEfL.oG(qFEs, object2, FEfL.oG((Double)object4));
                                    } else if (object4 instanceof Boolean) {
                                        FEfL.oG(qFEs, object2, FEfL.oG((Boolean)object4));
                                    } else if (object4 instanceof Long) {
                                        FEfL.oG(qFEs, object2, FEfL.oG((Long)object4));
                                    } else if (object4 instanceof List) {
                                        FEfL.oG(qFEs, object2, (List)object4);
                                    } else {
                                        throw new ReflectiveOperationException((String)FEfL.oG(FEfL.oG(new StringBuilder(YEBy$TyVf.W("\ue146\u92ff\ue89a\u3504\u4cd5\u91ed\u8508\ud3b6\u1886\u35df\ue18f\uf237\u9fd0\ue56c")), FEfL.oG(object4))));
                                    }
                                }
                            }
                        }
                    }
                }
                ++n2;
            }
        }
        return qFEs;
    }

    static /* synthetic */ int[] lDTo() {
        int[] arrn;
        int[] arrn2 = (int[])cv.e(908259856);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((GHiL[])FEfL.oG()).length];
        try {
            arrn[FEfL.oG((GHiL)cv.e((int)-1670712793))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[FEfL.oG((GHiL)cv.e((int)23917094))] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[FEfL.oG((GHiL)cv.e((int)2053829153))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[FEfL.oG((GHiL)cv.e((int)-694685152))] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[FEfL.oG((GHiL)cv.e((int)28504611))] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[FEfL.oG((GHiL)cv.e((int)1236529698))] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        cv.V(908259856, arrn3);
        return arrn3;
    }

    private static Object oG(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


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

public class EShD {
    private static /* synthetic */ int[] sdIU;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void yJLS(hHjO var1_1, File var2_2) throws Exception {
        var3_3 = new Mtpq();
        var4_4 = EShD.lu(var1_1);
        var5_5 = null;
        if (EShD.lu(var2_2) == false) {
            var3_3 = this.yJLS(var1_1);
            EShD.lu(new klJY(), var3_3, var2_2);
        }
        var3_3 = EShD.lu(new owua(), var2_2);
        var9_6 = (Field[])EShD.lu(var4_4);
        var8_7 = var9_6.length;
        var7_8 = 0;
        while (var7_8 < var8_7) {
            var6_9 = var9_6[var7_8];
            if (EShD.lu(EShD.lu(var6_9)) != false) ** GOTO lbl43
            if (EShD.lu(EShD.lu(var6_9)) != false) ** GOTO lbl43
            if (EShD.lu(EShD.lu(var6_9)) == false) ** GOTO lbl43
            if (EShD.lu(var6_9, mWxx.class) == false) {
lbl43: // 4 sources:
                if (EShD.lu(var6_9, mWxx.class) != false) {
                    EShD.lu(EShD.lu(EShD.lu(EShD.lu(new StringBuilder(FMkR$WjFM.a("\ucbdc\u792f\u043a\u7374\u542a\uc272\ue496")), EShD.lu(var6_9)), FMkR$WjFM.a("\ucbba\u792f\u042c\u7338\u542b\uc221\ue4c2\u6df4\uddbd\u5d91\u0ad1\uf903\u4e61\uf9ce\u799d\u17ec\u50ea\u3300\ubd17\u6f71\u19bc\uacc2\u3315\ud8ae\u687a\ufda6\u5d24\u1357\u820a\u8921\u8009\u684d\uf49c\u3e9b\u52fe\u9fd6"))));
                }
            } else {
                var10_10 = (mWxx)EShD.lu(var6_9, mWxx.class);
                var11_11 = EShD.lu(var3_3, var10_10.value());
                switch (EShD.Fpab()[EShD.lu(EShD.lu(var3_3, var10_10.value()))]) {
                    case 2: {
                        EShD.lu(var6_9, var1_1, (Boolean)var11_11);
                        break;
                    }
                    case 5: {
                        EShD.lu(var6_9, var1_1, (Double)var11_11);
                        break;
                    }
                    case 1: {
                        EShD.lu(var6_9, var1_1, (Integer)var11_11);
                        break;
                    }
                    case 6: {
                        EShD.lu(var6_9, var1_1, (Long)var11_11);
                        break;
                    }
                    case 3: {
                        EShD.lu(var6_9, var1_1, (String)var11_11);
                        break;
                    }
                    case 4: {
                        EShD.lu(var6_9, var1_1, (List)var11_11);
                    }
                }
            }
            ++var7_8;
        }
        var9_6 = (Field[])EShD.lu(var4_4);
        var8_7 = var9_6.length;
        var7_8 = 0;
        while (var7_8 < var8_7) {
            var6_9 = var9_6[var7_8];
            if (EShD.lu(EShD.lu(var6_9)) != false) {
                if (EShD.lu(EShD.lu(var6_9)) == false) {
                    if (EShD.lu(EShD.lu(var6_9)) != false) {
                        if (EShD.lu(var6_9, SvcY.class) != false) {
                            var10_10 = EShD.lu(var6_9, null);
                            if (var10_10 instanceof TNku) {
                                var5_5 = (TNku)var10_10;
                                break;
                            }
                        }
                    }
                }
            }
            ++var7_8;
        }
        if (var5_5 == null) return;
        var9_6 = (Field[])EShD.lu(var4_4);
        var8_7 = var9_6.length;
        var7_8 = 0;
        while (var7_8 < var8_7) {
            var6_9 = var9_6[var7_8];
            if (EShD.lu(EShD.lu(var6_9)) == false) {
                if (EShD.lu(EShD.lu(var6_9)) == false) {
                    if (EShD.lu(EShD.lu(var6_9)) != false) {
                        if (EShD.lu(var6_9, skNB.class) != false) {
                            var10_10 = (skNB)EShD.lu(var6_9, skNB.class);
                            var11_12 = var10_10.value();
                            var12_13 = (String)EShD.lu(var5_5, EShD.lu(var11_12));
                            if (var12_13 == null) {
                                EShD.lu(EShD.lu(EShD.lu(EShD.lu(EShD.lu(EShD.lu(EShD.lu(EShD.lu(new StringBuilder(FMkR$WjFM.a("\ucbd9\u7927\u0431\u7376\u5421\uc23c\ue496\u6dfa\uddb1\u5d8d\u0a95\uf950\u4e7e\uf9ca\u7990\u17a5\u50ef\u3343\ubd45\u6f37")), var11_12), FMkR$WjFM.a("\ucbba\u796e")), EShD.lu(EShD.lu(var6_9))), FMkR$WjFM.a("\ucba0")), EShD.lu(var6_9)), FMkR$WjFM.a("\ucbb3"))));
                            } else {
                                var13_14 = EShD.lu(var3_3, var12_13);
                                switch (EShD.Fpab()[EShD.lu(EShD.lu(var3_3, var12_13))]) {
                                    case 2: {
                                        EShD.lu(var6_9, var1_1, (Boolean)var13_14);
                                        break;
                                    }
                                    case 5: {
                                        EShD.lu(var6_9, var1_1, (Double)var13_14);
                                        break;
                                    }
                                    case 1: {
                                        EShD.lu(var6_9, var1_1, (Integer)var13_14);
                                        break;
                                    }
                                    case 6: {
                                        EShD.lu(var6_9, var1_1, (Long)var13_14);
                                        break;
                                    }
                                    case 3: {
                                        EShD.lu(var6_9, var1_1, (String)var13_14);
                                        break;
                                    }
                                    case 4: {
                                        EShD.lu(var6_9, var1_1, (List)var13_14);
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

    public Mtpq yJLS(hHjO hHjO2) throws ReflectiveOperationException {
        Field field;
        Object object;
        Object object2;
        Mtpq mtpq = new Mtpq();
        Object object3 = EShD.lu(hHjO2);
        TNku tNku = null;
        Field[] arrfield = (Field[])EShD.lu(object3);
        int n = arrfield.length;
        int n2 = 0;
        while (n2 < n) {
            field = arrfield[n2];
            if (EShD.lu(EShD.lu(field)) == false) {
                if (EShD.lu(EShD.lu(field)) == false) {
                    if (EShD.lu(EShD.lu(field)) != false) {
                        if (EShD.lu(field, mWxx.class) != false) {
                            object = (mWxx)EShD.lu(field, mWxx.class);
                            String string = object.value();
                            object2 = EShD.lu(field, hHjO2);
                            if (object2 instanceof Integer) {
                                EShD.lu(mtpq, string, EShD.lu((Integer)object2));
                            } else if (object2 instanceof String) {
                                EShD.lu(mtpq, string, (String)object2);
                            } else if (object2 instanceof Double) {
                                EShD.lu(mtpq, string, EShD.lu((Double)object2));
                            } else if (object2 instanceof Boolean) {
                                EShD.lu(mtpq, string, EShD.lu((Boolean)object2));
                            } else if (object2 instanceof Long) {
                                EShD.lu(mtpq, string, EShD.lu((Long)object2));
                            } else if (object2 instanceof List) {
                                EShD.lu(mtpq, string, (List)object2);
                            } else {
                                throw new ReflectiveOperationException((String)EShD.lu(EShD.lu(new StringBuilder(mrFx$WjFM.d("\uf8de\u51d9\ub814\ue5c2\ueeaa\u89f6\udacd\ud84d\u82ca\u086a\u545b\uc4a4\u4500\ue8e0")), EShD.lu(object2))));
                            }
                        }
                    }
                }
            }
            ++n2;
        }
        arrfield = (Field[])EShD.lu(object3);
        n = arrfield.length;
        n2 = 0;
        while (n2 < n) {
            field = arrfield[n2];
            if (EShD.lu(EShD.lu(field)) != false) {
                if (EShD.lu(EShD.lu(field)) == false) {
                    if (EShD.lu(EShD.lu(field)) != false) {
                        if (EShD.lu(field, SvcY.class) != false) {
                            object = EShD.lu(field, null);
                            if (object instanceof TNku) {
                                tNku = (TNku)object;
                                break;
                            }
                        }
                    }
                }
            }
            ++n2;
        }
        if (tNku != null) {
            arrfield = (Field[])EShD.lu(object3);
            n = arrfield.length;
            n2 = 0;
            while (n2 < n) {
                field = arrfield[n2];
                if (EShD.lu(EShD.lu(field)) == false) {
                    if (EShD.lu(EShD.lu(field)) == false) {
                        if (EShD.lu(EShD.lu(field)) != false) {
                            if (EShD.lu(field, skNB.class) != false) {
                                object = (skNB)EShD.lu(field, skNB.class);
                                int n3 = object.value();
                                object2 = (String)EShD.lu(tNku, EShD.lu(n3));
                                if (object2 == null) {
                                    EShD.lu(EShD.lu(EShD.lu(EShD.lu(EShD.lu(EShD.lu(EShD.lu(EShD.lu(new StringBuilder(mrFx$WjFM.d("\uf8c8\u51d6\ub811\ue5c2\ueeaa\u89f5\uda83\ud80b\u82f7\u085d\u546f\uc4c1\u4551\ue8a5\u7309\uade8\u3266\udda5\ucb73\u4945")), n3), mrFx$WjFM.d("\uf8ab\u519f")), EShD.lu(EShD.lu(field))), mrFx$WjFM.d("\uf8b1")), EShD.lu(field)), mrFx$WjFM.d("\uf8a2"))));
                                } else {
                                    Object object4 = EShD.lu(field, hHjO2);
                                    if (object4 instanceof Integer) {
                                        EShD.lu(mtpq, object2, EShD.lu((Integer)object4));
                                    } else if (object4 instanceof String) {
                                        EShD.lu(mtpq, object2, (String)object4);
                                    } else if (object4 instanceof Double) {
                                        EShD.lu(mtpq, object2, EShD.lu((Double)object4));
                                    } else if (object4 instanceof Boolean) {
                                        EShD.lu(mtpq, object2, EShD.lu((Boolean)object4));
                                    } else if (object4 instanceof Long) {
                                        EShD.lu(mtpq, object2, EShD.lu((Long)object4));
                                    } else if (object4 instanceof List) {
                                        EShD.lu(mtpq, object2, (List)object4);
                                    } else {
                                        throw new ReflectiveOperationException((String)EShD.lu(EShD.lu(new StringBuilder(mrFx$WjFM.d("\uf8de\u51d9\ub814\ue5c2\ueeaa\u89f6\udacd\ud84d\u82ca\u086a\u545b\uc4a4\u4500\ue8e0")), EShD.lu(object4))));
                                    }
                                }
                            }
                        }
                    }
                }
                ++n2;
            }
        }
        return mtpq;
    }

    static /* synthetic */ int[] Fpab() {
        int[] arrn;
        int[] arrn2 = (int[])o.k(-611431267);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((WaLc[])EShD.lu()).length];
        try {
            arrn[EShD.lu((WaLc)o.k((int)465915054))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[EShD.lu((WaLc)o.k((int)-1049080659))] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[EShD.lu((WaLc)o.k((int)-1498592084))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[EShD.lu((WaLc)o.k((int)-1643098965))] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[EShD.lu((WaLc)o.k((int)330058938))] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[EShD.lu((WaLc)o.k((int)233655481))] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        o.w(-611431267, arrn3);
        return arrn3;
    }

    private static Object lu(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


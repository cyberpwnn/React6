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

public class fvCQ {
    private static /* synthetic */ int[] DsQc;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void mXJp(WrGR var1_1, File var2_2) throws Exception {
        var3_3 = new JbpD();
        var4_4 = fvCQ.xf(var1_1);
        var5_5 = null;
        if (fvCQ.xf(var2_2) == false) {
            var3_3 = this.mXJp(var1_1);
            fvCQ.xf(new JAMu(), var3_3, var2_2);
        }
        var3_3 = fvCQ.xf(new OHMP(), var2_2);
        var9_6 = (Field[])fvCQ.xf(var4_4);
        var8_7 = var9_6.length;
        var7_8 = 0;
        while (var7_8 < var8_7) {
            var6_9 = var9_6[var7_8];
            if (fvCQ.xf(fvCQ.xf(var6_9)) != false) ** GOTO lbl43
            if (fvCQ.xf(fvCQ.xf(var6_9)) != false) ** GOTO lbl43
            if (fvCQ.xf(fvCQ.xf(var6_9)) == false) ** GOTO lbl43
            if (fvCQ.xf(var6_9, FpWB.class) == false) {
lbl43: // 4 sources:
                if (fvCQ.xf(var6_9, FpWB.class) != false) {
                    fvCQ.xf(fvCQ.xf(fvCQ.xf(fvCQ.xf(new StringBuilder(KDGY$JAHk.Y("\u550d\ua1b5\u935b\u04a4\ud426\u42a8\ufe24")), fvCQ.xf(var6_9)), KDGY$JAHk.Y("\u556b\ua1b5\u934d\u04e8\ud427\u42fb\ufe70\uec80\u191e\u51b2\u4bcb\u80ea\udb97\u13a6\uacf2\u66eb\u180d\ub2b4\u44c6\u2248\u0fa2\u3545\u80cb\u0d4a\uf11a\u3add\ubd1e\ua50d\ucfd3\uddfe\u043a\u7953\uc5dc\uc6e8\u40d4\ue916"))));
                }
            } else {
                var10_10 = (FpWB)fvCQ.xf(var6_9, FpWB.class);
                var11_11 = fvCQ.xf(var3_3, var10_10.value());
                switch (fvCQ.FNTl()[fvCQ.xf(fvCQ.xf(var3_3, var10_10.value()))]) {
                    case 2: {
                        fvCQ.xf(var6_9, var1_1, (Boolean)var11_11);
                        break;
                    }
                    case 5: {
                        fvCQ.xf(var6_9, var1_1, (Double)var11_11);
                        break;
                    }
                    case 1: {
                        fvCQ.xf(var6_9, var1_1, (Integer)var11_11);
                        break;
                    }
                    case 6: {
                        fvCQ.xf(var6_9, var1_1, (Long)var11_11);
                        break;
                    }
                    case 3: {
                        fvCQ.xf(var6_9, var1_1, (String)var11_11);
                        break;
                    }
                    case 4: {
                        fvCQ.xf(var6_9, var1_1, (List)var11_11);
                    }
                }
            }
            ++var7_8;
        }
        var9_6 = (Field[])fvCQ.xf(var4_4);
        var8_7 = var9_6.length;
        var7_8 = 0;
        while (var7_8 < var8_7) {
            var6_9 = var9_6[var7_8];
            if (fvCQ.xf(fvCQ.xf(var6_9)) != false) {
                if (fvCQ.xf(fvCQ.xf(var6_9)) == false) {
                    if (fvCQ.xf(fvCQ.xf(var6_9)) != false) {
                        if (fvCQ.xf(var6_9, PJoH.class) != false) {
                            var10_10 = fvCQ.xf(var6_9, null);
                            if (var10_10 instanceof aKuV) {
                                var5_5 = (aKuV)var10_10;
                                break;
                            }
                        }
                    }
                }
            }
            ++var7_8;
        }
        if (var5_5 == null) return;
        var9_6 = (Field[])fvCQ.xf(var4_4);
        var8_7 = var9_6.length;
        var7_8 = 0;
        while (var7_8 < var8_7) {
            var6_9 = var9_6[var7_8];
            if (fvCQ.xf(fvCQ.xf(var6_9)) == false) {
                if (fvCQ.xf(fvCQ.xf(var6_9)) == false) {
                    if (fvCQ.xf(fvCQ.xf(var6_9)) != false) {
                        if (fvCQ.xf(var6_9, Vvsp.class) != false) {
                            var10_10 = (Vvsp)fvCQ.xf(var6_9, Vvsp.class);
                            var11_12 = var10_10.value();
                            var12_13 = (String)fvCQ.xf(var5_5, fvCQ.xf(var11_12));
                            if (var12_13 == null) {
                                fvCQ.xf(fvCQ.xf(fvCQ.xf(fvCQ.xf(fvCQ.xf(fvCQ.xf(fvCQ.xf(fvCQ.xf(new StringBuilder(KDGY$JAHk.Y("\u5508\ua1bd\u9350\u04a6\ud42d\u42e6\ufe24\uec8e\u1912\u51ae\u4b8f\u80b9\udb88\u13a2\uacff\u66a2\u1808\ub2f7\u4494\u220e")), var11_12), KDGY$JAHk.Y("\u556b\ua1f4")), fvCQ.xf(fvCQ.xf(var6_9))), KDGY$JAHk.Y("\u5571")), fvCQ.xf(var6_9)), KDGY$JAHk.Y("\u5562"))));
                            } else {
                                var13_14 = fvCQ.xf(var3_3, var12_13);
                                switch (fvCQ.FNTl()[fvCQ.xf(fvCQ.xf(var3_3, var12_13))]) {
                                    case 2: {
                                        fvCQ.xf(var6_9, var1_1, (Boolean)var13_14);
                                        break;
                                    }
                                    case 5: {
                                        fvCQ.xf(var6_9, var1_1, (Double)var13_14);
                                        break;
                                    }
                                    case 1: {
                                        fvCQ.xf(var6_9, var1_1, (Integer)var13_14);
                                        break;
                                    }
                                    case 6: {
                                        fvCQ.xf(var6_9, var1_1, (Long)var13_14);
                                        break;
                                    }
                                    case 3: {
                                        fvCQ.xf(var6_9, var1_1, (String)var13_14);
                                        break;
                                    }
                                    case 4: {
                                        fvCQ.xf(var6_9, var1_1, (List)var13_14);
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

    public JbpD mXJp(WrGR wrGR) throws ReflectiveOperationException {
        Field field;
        Object object;
        Object object2;
        JbpD jbpD = new JbpD();
        Object object3 = fvCQ.xf(wrGR);
        aKuV aKuV2 = null;
        Field[] arrfield = (Field[])fvCQ.xf(object3);
        int n = arrfield.length;
        int n2 = 0;
        while (n2 < n) {
            field = arrfield[n2];
            if (fvCQ.xf(fvCQ.xf(field)) == false) {
                if (fvCQ.xf(fvCQ.xf(field)) == false) {
                    if (fvCQ.xf(fvCQ.xf(field)) != false) {
                        if (fvCQ.xf(field, FpWB.class) != false) {
                            object = (FpWB)fvCQ.xf(field, FpWB.class);
                            String string = object.value();
                            object2 = fvCQ.xf(field, wrGR);
                            if (object2 instanceof Integer) {
                                fvCQ.xf(jbpD, string, fvCQ.xf((Integer)object2));
                            } else if (object2 instanceof String) {
                                fvCQ.xf(jbpD, string, (String)object2);
                            } else if (object2 instanceof Double) {
                                fvCQ.xf(jbpD, string, fvCQ.xf((Double)object2));
                            } else if (object2 instanceof Boolean) {
                                fvCQ.xf(jbpD, string, fvCQ.xf((Boolean)object2));
                            } else if (object2 instanceof Long) {
                                fvCQ.xf(jbpD, string, fvCQ.xf((Long)object2));
                            } else if (object2 instanceof List) {
                                fvCQ.xf(jbpD, string, (List)object2);
                            } else {
                                throw new ReflectiveOperationException((String)fvCQ.xf(fvCQ.xf(new StringBuilder(NVIs$JbpD.H("\u4f4d\u58da\ub01d\u8ebb\uab57\u4342\u5318\u0538\u4a29\u05f9\ud36a\uba11\uec25\ud8fd")), fvCQ.xf(object2))));
                            }
                        }
                    }
                }
            }
            ++n2;
        }
        arrfield = (Field[])fvCQ.xf(object3);
        n = arrfield.length;
        n2 = 0;
        while (n2 < n) {
            field = arrfield[n2];
            if (fvCQ.xf(fvCQ.xf(field)) != false) {
                if (fvCQ.xf(fvCQ.xf(field)) == false) {
                    if (fvCQ.xf(fvCQ.xf(field)) != false) {
                        if (fvCQ.xf(field, PJoH.class) != false) {
                            object = fvCQ.xf(field, null);
                            if (object instanceof aKuV) {
                                aKuV2 = (aKuV)object;
                                break;
                            }
                        }
                    }
                }
            }
            ++n2;
        }
        if (aKuV2 != null) {
            arrfield = (Field[])fvCQ.xf(object3);
            n = arrfield.length;
            n2 = 0;
            while (n2 < n) {
                field = arrfield[n2];
                if (fvCQ.xf(fvCQ.xf(field)) == false) {
                    if (fvCQ.xf(fvCQ.xf(field)) == false) {
                        if (fvCQ.xf(fvCQ.xf(field)) != false) {
                            if (fvCQ.xf(field, Vvsp.class) != false) {
                                object = (Vvsp)fvCQ.xf(field, Vvsp.class);
                                int n3 = object.value();
                                object2 = (String)fvCQ.xf(aKuV2, fvCQ.xf(n3));
                                if (object2 == null) {
                                    fvCQ.xf(fvCQ.xf(fvCQ.xf(fvCQ.xf(fvCQ.xf(fvCQ.xf(fvCQ.xf(fvCQ.xf(new StringBuilder(NVIs$JbpD.H("\u4f5b\u58d5\ub018\u8ebb\uab57\u4341\u5356\u057e\u4a14\u05ce\ud35e\uba74\uec74\ud8b8\u64e2\u8d11\u8851\u5116\u5116\u42ae")), n3), NVIs$JbpD.H("\u4f38\u589c")), fvCQ.xf(fvCQ.xf(field))), NVIs$JbpD.H("\u4f22")), fvCQ.xf(field)), NVIs$JbpD.H("\u4f31"))));
                                } else {
                                    Object object4 = fvCQ.xf(field, wrGR);
                                    if (object4 instanceof Integer) {
                                        fvCQ.xf(jbpD, object2, fvCQ.xf((Integer)object4));
                                    } else if (object4 instanceof String) {
                                        fvCQ.xf(jbpD, object2, (String)object4);
                                    } else if (object4 instanceof Double) {
                                        fvCQ.xf(jbpD, object2, fvCQ.xf((Double)object4));
                                    } else if (object4 instanceof Boolean) {
                                        fvCQ.xf(jbpD, object2, fvCQ.xf((Boolean)object4));
                                    } else if (object4 instanceof Long) {
                                        fvCQ.xf(jbpD, object2, fvCQ.xf((Long)object4));
                                    } else if (object4 instanceof List) {
                                        fvCQ.xf(jbpD, object2, (List)object4);
                                    } else {
                                        throw new ReflectiveOperationException((String)fvCQ.xf(fvCQ.xf(new StringBuilder(NVIs$JbpD.H("\u4f4d\u58da\ub01d\u8ebb\uab57\u4342\u5318\u0538\u4a29\u05f9\ud36a\uba11\uec25\ud8fd")), fvCQ.xf(object4))));
                                    }
                                }
                            }
                        }
                    }
                }
                ++n2;
            }
        }
        return jbpD;
    }

    static /* synthetic */ int[] FNTl() {
        int[] arrn;
        int[] arrn2 = (int[])yy.p(934668422);
        if (arrn2 != null) {
            return arrn2;
        }
        arrn = new int[((XSFr[])fvCQ.xf()).length];
        try {
            arrn[fvCQ.xf((XSFr)yy.p((int)1683024041))] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[fvCQ.xf((XSFr)yy.p((int)-68687694))] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[fvCQ.xf((XSFr)yy.p((int)1417537703))] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[fvCQ.xf((XSFr)yy.p((int)578742440))] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[fvCQ.xf((XSFr)yy.p((int)1029105853))] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[fvCQ.xf((XSFr)yy.p((int)-414062410))] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        int[] arrn3 = arrn;
        yy.K(934668422, arrn3);
        return arrn3;
    }

    private static Object xf(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


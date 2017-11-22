/*
 * Decompiled with CFR 0_123.
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

public class tLDs {
    /*
     * Enabled aggressive block sorting
     */
    private static Object ssNb(GkIA gkIA, boolean bl, HdyI hdyI) throws TOKE {
        String string = null;
        HdyI hdyI2 = null;
        vslr vslr2 = null;
        String string2 = null;
        do {
            Object object;
            block40 : {
                block38 : {
                    block35 : {
                        block39 : {
                            block36 : {
                                block37 : {
                                    if (tLDs.BA(gkIA) == false) {
                                        throw tLDs.BA(gkIA, KUXS$dwji.S("\ue4ef\uf7aa\u941d\uf119\u4299\uf232\u3c2e"));
                                    }
                                    object = tLDs.BA(gkIA);
                                    if (object != (Character)cv.e(-490538795)) break block35;
                                    object = tLDs.BA(gkIA);
                                    if (!(object instanceof Character)) break block36;
                                    if (object == (Character)cv.e(-588646185)) {
                                        object = tLDs.BA(gkIA);
                                        if (!(object instanceof String)) {
                                            throw new TOKE((String)tLDs.BA(tLDs.BA(tLDs.BA(new StringBuilder(KUXS$dwji.S("\ue4e8\uf7b3\u9409\uf15c\u42a2\uf20b\u3c07\u92a8\uf5a6\udc58\ud320\u4afa\u75af\u9a90\u6c3b\ua8e2\u62ce\u0e9a\u8297\uc779\u9145\u395b\u89ed\u47b6\ua06f\uc1a8\uf05b\ufe5f\uc605\ua7ad\uc668\u8517\uc4d2\uec93\u6278\ua5b3")), object), KUXS$dwji.S("\ue48a\uf7e5"))));
                                        }
                                        if (tLDs.BA(gkIA) != (Character)cv.e(-2091321130)) {
                                            throw tLDs.BA(gkIA, KUXS$dwji.S("\ue4e0\uf7a2\u940a\uf14a\u42a9\uf21e\u3c12\u92a9\uf5e2\udc19\ud363\u4af5\u75ac\u9a8c\u6c2d\ua8ab\u62d4\u0e9c\u82d0"));
                                        }
                                        return object;
                                    }
                                    if (object != (Character)cv.e(1168177361)) break block37;
                                    Object object2 = tLDs.BA(gkIA);
                                    if (object2 == 45) {
                                        if (tLDs.BA(gkIA) == 45) {
                                            tLDs.BA(gkIA, KUXS$dwji.S("\ue480\uf7e6\u9447"));
                                            continue;
                                        }
                                        tLDs.BA(gkIA);
                                        continue;
                                    }
                                    if (object2 == 91) {
                                        object = tLDs.BA(gkIA);
                                        if (tLDs.BA(object, KUXS$dwji.S("\ue4ee\uf78f\u9438\uf16d\u4280")) != false) {
                                            if (tLDs.BA(gkIA) == 91) {
                                                if (hdyI == null) continue;
                                                tLDs.BA(hdyI, tLDs.BA(gkIA));
                                                continue;
                                            }
                                        }
                                        throw tLDs.BA(gkIA, KUXS$dwji.S("\ue4e8\uf7b3\u9409\uf15c\u42a2\uf20b\u3c07\u92a8\uf5a6\udc1e\ud343\u4add\u7582\u9aab\u6c09\ua8d0\u6287"));
                                    }
                                    break block38;
                                }
                                if (object != (Character)cv.e(-1596458785)) {
                                    throw tLDs.BA(gkIA, KUXS$dwji.S("\ue4e0\uf7a2\u940a\uf14a\u42a9\uf21e\u3c12\u92a9\uf5e2\udc19\ud374\u4af8\u75a4"));
                                }
                                tLDs.BA(gkIA, KUXS$dwji.S("\ue492\uf7f5"));
                                continue;
                            }
                            if (!(object instanceof String)) {
                                throw tLDs.BA(gkIA, tLDs.BA(tLDs.BA(tLDs.BA(new StringBuilder(KUXS$dwji.S("\ue4ef\uf7aa\u941d\uf119\u42b5\uf21e\u3c05\u9282\uf5e7\udc54\ud365\u4ab9\u75e4")), object), KUXS$dwji.S("\ue48a\uf7e5"))));
                            }
                            string2 = (String)object;
                            hdyI2 = new HdyI();
                            vslr2 = new vslr();
                            if (!bl) break block39;
                            tLDs.BA(hdyI2, string2);
                            if (hdyI != null) {
                                tLDs.BA(hdyI, hdyI2);
                            }
                            break block40;
                        }
                        tLDs.BA(vslr2, KUXS$dwji.S("\ue4d9\uf7aa\u941e\uf177\u42a0\uf212\u3c07"), string2);
                        if (hdyI == null) break block40;
                        tLDs.BA(hdyI, vslr2);
                        break block40;
                    }
                    if (hdyI == null) continue;
                    tLDs.BA(hdyI, object instanceof String ? tLDs.BA((String)object) : object);
                    continue;
                }
                int n = 1;
                do {
                    if ((object = tLDs.BA(gkIA)) == null) {
                        throw tLDs.BA(gkIA, KUXS$dwji.S("\ue4e0\uf7a2\u940a\uf14a\u42a8\uf211\u3c05\u92ec\uf5a1\udc07\ud327\u4ab9\u75a2\u9a99\u6c3c\ua8ee\u62d2\u0edd\u8290\uc72b\u9105\u3911\u89a6"));
                    }
                    if (object == (Character)cv.e(-490538795)) {
                        ++n;
                        continue;
                    }
                    if (object != (Character)cv.e(-2091321130)) continue;
                    --n;
                } while (n > 0);
                continue;
            }
            object = null;
            do {
                String string3;
                block41 : {
                    block42 : {
                        if (object == null) {
                            object = tLDs.BA(gkIA);
                        }
                        if (object == null) {
                            throw tLDs.BA(gkIA, KUXS$dwji.S("\ue4e0\uf7a2\u940a\uf14a\u42a9\uf21e\u3c12\u92a9\uf5e2\udc19\ud374\u4af8\u75a4"));
                        }
                        if (!(object instanceof String)) break;
                        string3 = (String)object;
                        if (bl) break block41;
                        if (tLDs.BA(KUXS$dwji.S("\ue4d9\uf7aa\u941e\uf177\u42a0\uf212\u3c07"), string3) != false) break block42;
                        if (tLDs.BA(KUXS$dwji.S("\ue4ce\uf7a3\u9410\uf155\u42a5\uf231\u3c0d\u92a8\uf5e3"), string3) == false) break block41;
                    }
                    throw tLDs.BA(gkIA, KUXS$dwji.S("\ue4ff\uf7ae\u940a\uf15c\u42b3\uf209\u3c07\u92a8\uf5a6\udc58\ud374\u4aed\u75b1\u9a96\u6c2a\ua8fe\u62d4\u0e98\u8299"));
                }
                if ((object = tLDs.BA(gkIA)) == (Character)cv.e(1041299678)) {
                    object = tLDs.BA(gkIA);
                    if (!(object instanceof String)) {
                        throw tLDs.BA(gkIA, KUXS$dwji.S("\ue4e0\uf7a2\u940a\uf14a\u42a8\uf211\u3c05\u92ec\uf5f0\udc58\ud36c\u4aec\u75a6"));
                    }
                    tLDs.BA(vslr2, string3, tLDs.BA((String)object));
                    object = null;
                    continue;
                }
                tLDs.BA(vslr2, string3, "");
            } while (true);
            if (bl) {
                if (tLDs.BA(vslr2) > 0) {
                    tLDs.BA(hdyI2, vslr2);
                }
            }
            if (object == (Character)cv.e(-588646185)) {
                if (tLDs.BA(gkIA) != (Character)cv.e(-2091321130)) {
                    throw tLDs.BA(gkIA, KUXS$dwji.S("\ue4e0\uf7a2\u940a\uf14a\u42a9\uf21e\u3c12\u92a9\uf5e2\udc19\ud374\u4af8\u75a4"));
                }
                if (hdyI != null) continue;
                if (bl) {
                    return hdyI2;
                }
                return vslr2;
            }
            if (object != (Character)cv.e(-2091321130)) {
                throw tLDs.BA(gkIA, KUXS$dwji.S("\ue4e0\uf7a2\u940a\uf14a\u42a9\uf21e\u3c12\u92a9\uf5e2\udc19\ud374\u4af8\u75a4"));
            }
            string = (String)tLDs.ssNb(gkIA, bl, hdyI2);
            if (string == null) continue;
            if (tLDs.BA(string, string2) == false) {
                throw tLDs.BA(gkIA, tLDs.BA(tLDs.BA(tLDs.BA(tLDs.BA(tLDs.BA(new StringBuilder(KUXS$dwji.S("\ue4e0\uf7a2\u940a\uf154\u42a0\uf20b\u3c01\u92a4\uf5e3\udc5d\ud320\u4abe")), string2), KUXS$dwji.S("\ue48a\uf7eb\u9418\uf157\u42a5\uf25f\u3c45")), string), KUXS$dwji.S("\ue48a"))));
            }
            string2 = null;
            if (!bl) {
                if (tLDs.BA(hdyI2) > 0) {
                    tLDs.BA(vslr2, KUXS$dwji.S("\ue4ce\uf7a3\u9410\uf155\u42a5\uf231\u3c0d\u92a8\uf5e3\udc4a"), hdyI2);
                }
            }
            if (hdyI == null) break;
        } while (true);
        if (bl) {
            return hdyI2;
        }
        return vslr2;
    }

    public static HdyI WGJn(String string) throws TOKE {
        return tLDs.ssNb(new GkIA(string));
    }

    public static HdyI ssNb(GkIA gkIA) throws TOKE {
        return (HdyI)tLDs.ssNb(gkIA, true, null);
    }

    public static vslr DYFV(GkIA gkIA) throws TOKE {
        return (vslr)tLDs.ssNb(gkIA, false, null);
    }

    public static vslr vtFs(String string) throws TOKE {
        return tLDs.DYFV(new GkIA(string));
    }

    public static String DYFV(HdyI hdyI) throws TOKE {
        Object object;
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        Object object2 = tLDs.BA(hdyI, false);
        tLDs.BA(object2);
        object2 = tLDs.BA(object2);
        tLDs.BA(stringBuilder, 60);
        tLDs.BA(stringBuilder, object2);
        Object object3 = tLDs.BA(hdyI, true);
        if (object3 instanceof vslr) {
            n = 2;
            vslr vslr2 = (vslr)object3;
            Object object4 = tLDs.BA(vslr2);
            while (object4.hasNext()) {
                String string = (String)object4.next();
                tLDs.BA(string);
                Object object5 = tLDs.BA(vslr2, string);
                if (object5 == null) continue;
                tLDs.BA(stringBuilder, 32);
                tLDs.BA(stringBuilder, tLDs.BA(string));
                tLDs.BA(stringBuilder, 61);
                tLDs.BA(stringBuilder, 34);
                tLDs.BA(stringBuilder, tLDs.BA(object5));
                tLDs.BA(stringBuilder, 34);
            }
        } else {
            n = 1;
        }
        if (n >= (object = tLDs.BA(hdyI))) {
            tLDs.BA(stringBuilder, 47);
            tLDs.BA(stringBuilder, 62);
        } else {
            tLDs.BA(stringBuilder, 62);
            do {
                object3 = tLDs.BA(hdyI, n);
                ++n;
                if (object3 == null) continue;
                if (object3 instanceof String) {
                    tLDs.BA(stringBuilder, tLDs.BA(tLDs.BA(object3)));
                    continue;
                }
                if (object3 instanceof vslr) {
                    tLDs.BA(stringBuilder, tLDs.DYFV((vslr)object3));
                    continue;
                }
                if (object3 instanceof HdyI) {
                    tLDs.BA(stringBuilder, tLDs.DYFV((HdyI)object3));
                    continue;
                }
                tLDs.BA(stringBuilder, tLDs.BA(object3));
            } while (n < object);
            tLDs.BA(stringBuilder, 60);
            tLDs.BA(stringBuilder, 47);
            tLDs.BA(stringBuilder, object2);
            tLDs.BA(stringBuilder, 62);
        }
        return tLDs.BA(stringBuilder);
    }

    public static String DYFV(vslr vslr2) throws TOKE {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = tLDs.BA(vslr2, KUXS$dwji.S("\ucc02\uf589\uf16b\u93a0\u5a5a\udefa\u988e"));
        if (object == null) {
            return tLDs.BA(tLDs.BA(vslr2));
        }
        tLDs.BA(object);
        object = tLDs.BA(object);
        tLDs.BA(stringBuilder, 60);
        tLDs.BA(stringBuilder, object);
        Object object2 = tLDs.BA(vslr2);
        while (object2.hasNext()) {
            String string = (String)object2.next();
            if (tLDs.BA(KUXS$dwji.S("\ucc02\uf589\uf16b\u93a0\u5a5a\udefa\u988e"), string) != false) continue;
            if (tLDs.BA(KUXS$dwji.S("\ucc15\uf580\uf165\u9382\u5a5f\uded9\u9884\u4e1b\u680b\ub71c"), string) != false) continue;
            tLDs.BA(string);
            Object object3 = tLDs.BA(vslr2, string);
            if (object3 == null) continue;
            tLDs.BA(stringBuilder, 32);
            tLDs.BA(stringBuilder, tLDs.BA(string));
            tLDs.BA(stringBuilder, 61);
            tLDs.BA(stringBuilder, 34);
            tLDs.BA(stringBuilder, tLDs.BA(object3));
            tLDs.BA(stringBuilder, 34);
        }
        Object object4 = tLDs.BA(vslr2, KUXS$dwji.S("\ucc15\uf580\uf165\u9382\u5a5f\uded9\u9884\u4e1b\u680b\ub71c"));
        if (object4 == null) {
            tLDs.BA(stringBuilder, 47);
            tLDs.BA(stringBuilder, 62);
        } else {
            tLDs.BA(stringBuilder, 62);
            Object object5 = tLDs.BA(object4);
            for (int i = 0; i < object5; ++i) {
                Object object6 = tLDs.BA(object4, i);
                if (object6 == null) continue;
                if (object6 instanceof String) {
                    tLDs.BA(stringBuilder, tLDs.BA(tLDs.BA(object6)));
                    continue;
                }
                if (object6 instanceof vslr) {
                    tLDs.BA(stringBuilder, tLDs.DYFV((vslr)object6));
                    continue;
                }
                if (object6 instanceof HdyI) {
                    tLDs.BA(stringBuilder, tLDs.DYFV((HdyI)object6));
                    continue;
                }
                tLDs.BA(stringBuilder, tLDs.BA(object6));
            }
            tLDs.BA(stringBuilder, 60);
            tLDs.BA(stringBuilder, 47);
            tLDs.BA(stringBuilder, object);
            tLDs.BA(stringBuilder, 62);
        }
        return tLDs.BA(stringBuilder);
    }

    private static Object BA(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


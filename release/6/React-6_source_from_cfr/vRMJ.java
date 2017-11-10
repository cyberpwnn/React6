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

public class vRMJ {
    public void ksfs(WrGR wrGR, File file) throws Exception {
        Object object;
        Object object2;
        Field field;
        JbpD jbpD = new JbpD();
        Object object3 = vRMJ.qO(wrGR);
        aKuV aKuV2 = null;
        Field[] arrfield = (Field[])vRMJ.qO(object3);
        int n = arrfield.length;
        int n2 = 0;
        while (n2 < n) {
            field = arrfield[n2];
            if (vRMJ.qO(vRMJ.qO(field)) == false) {
                if (vRMJ.qO(vRMJ.qO(field)) == false) {
                    if (vRMJ.qO(vRMJ.qO(field)) != false) {
                        if (vRMJ.qO(field, FpWB.class) != false) {
                            object = (FpWB)vRMJ.qO(field, FpWB.class);
                            String string = object.value();
                            object2 = vRMJ.qO(field, wrGR);
                            if (object2 instanceof Integer) {
                                vRMJ.qO(jbpD, string, vRMJ.qO((Integer)object2));
                            } else if (object2 instanceof String) {
                                vRMJ.qO(jbpD, string, (String)object2);
                            } else if (object2 instanceof Double) {
                                vRMJ.qO(jbpD, string, vRMJ.qO((Double)object2));
                            } else if (object2 instanceof Boolean) {
                                vRMJ.qO(jbpD, string, vRMJ.qO((Boolean)object2));
                            } else if (object2 instanceof Long) {
                                vRMJ.qO(jbpD, string, vRMJ.qO((Long)object2));
                            } else if (object2 instanceof List) {
                                vRMJ.qO(jbpD, string, (List)object2);
                            } else {
                                throw new ReflectiveOperationException((String)vRMJ.qO(vRMJ.qO(new StringBuilder(KDGY$JAHk.Y("\u9c40\uf551\u5809\u7477\ud0da\u795e\u1747\u56bb\u4841\u2deb\u67f1\u5d0a\ud48f\ube38")), vRMJ.qO(object2))));
                            }
                        }
                    }
                }
            }
            ++n2;
        }
        arrfield = (Field[])vRMJ.qO(object3);
        n = arrfield.length;
        n2 = 0;
        while (n2 < n) {
            field = arrfield[n2];
            if (vRMJ.qO(vRMJ.qO(field)) != false) {
                if (vRMJ.qO(vRMJ.qO(field)) == false) {
                    if (vRMJ.qO(vRMJ.qO(field)) != false) {
                        if (vRMJ.qO(field, PJoH.class) != false) {
                            object = vRMJ.qO(field, null);
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
            arrfield = (Field[])vRMJ.qO(object3);
            n = arrfield.length;
            n2 = 0;
            while (n2 < n) {
                field = arrfield[n2];
                if (vRMJ.qO(vRMJ.qO(field)) == false) {
                    if (vRMJ.qO(vRMJ.qO(field)) == false) {
                        if (vRMJ.qO(vRMJ.qO(field)) != false) {
                            if (vRMJ.qO(field, Vvsp.class) != false) {
                                object = (Vvsp)vRMJ.qO(field, Vvsp.class);
                                int n3 = object.value();
                                object2 = (String)vRMJ.qO(aKuV2, vRMJ.qO(n3));
                                if (object2 == null) {
                                    vRMJ.qO(vRMJ.qO(vRMJ.qO(vRMJ.qO(vRMJ.qO(vRMJ.qO(vRMJ.qO(vRMJ.qO(new StringBuilder(KDGY$JAHk.Y("\u9c56\uf55e\u580c\u7477\ud0da\u795d\u1709\u56fd\u487c\u2ddc\u67c5\u5d6f\ud4de\ube7d\u3c11\uab1b\u40ab\uc63d\u1d91\u1b91")), n3), KDGY$JAHk.Y("\u9c35\uf517")), vRMJ.qO(vRMJ.qO(field))), KDGY$JAHk.Y("\u9c2f")), vRMJ.qO(field)), KDGY$JAHk.Y("\u9c3c"))));
                                } else {
                                    Object object4 = vRMJ.qO(field, wrGR);
                                    if (object4 instanceof Integer) {
                                        vRMJ.qO(jbpD, object2, vRMJ.qO((Integer)object4));
                                    } else if (object4 instanceof String) {
                                        vRMJ.qO(jbpD, object2, (String)object4);
                                    } else if (object4 instanceof Double) {
                                        vRMJ.qO(jbpD, object2, vRMJ.qO((Double)object4));
                                    } else if (object4 instanceof Boolean) {
                                        vRMJ.qO(jbpD, object2, vRMJ.qO((Boolean)object4));
                                    } else if (object4 instanceof Long) {
                                        vRMJ.qO(jbpD, object2, vRMJ.qO((Long)object4));
                                    } else if (object4 instanceof List) {
                                        vRMJ.qO(jbpD, object2, (List)object4);
                                    } else {
                                        throw new ReflectiveOperationException((String)vRMJ.qO(vRMJ.qO(new StringBuilder(KDGY$JAHk.Y("\u9c40\uf551\u5809\u7477\ud0da\u795e\u1747\u56bb\u4841\u2deb\u67f1\u5d0a\ud48f\ube38")), vRMJ.qO(object4))));
                                    }
                                }
                            }
                        }
                    }
                }
                ++n2;
            }
        }
        vRMJ.qO(new JAMu(), jbpD, file);
    }

    private static Object qO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


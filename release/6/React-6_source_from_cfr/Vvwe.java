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

public class Vvwe {
    public void DYFV(BAjC bAjC, File file) throws Exception {
        Object object;
        Object object2;
        Field field;
        QFEs qFEs = new QFEs();
        Object object3 = Vvwe.LT(bAjC);
        ktOu ktOu2 = null;
        Field[] arrfield = (Field[])Vvwe.LT(object3);
        int n = arrfield.length;
        int n2 = 0;
        while (n2 < n) {
            field = arrfield[n2];
            if (Vvwe.LT(Vvwe.LT(field)) == false) {
                if (Vvwe.LT(Vvwe.LT(field)) == false) {
                    if (Vvwe.LT(Vvwe.LT(field)) != false) {
                        if (Vvwe.LT(field, DYRf.class) != false) {
                            object = (DYRf)Vvwe.LT(field, DYRf.class);
                            String string = object.value();
                            object2 = Vvwe.LT(field, bAjC);
                            if (object2 instanceof Integer) {
                                Vvwe.LT(qFEs, string, Vvwe.LT((Integer)object2));
                            } else if (object2 instanceof String) {
                                Vvwe.LT(qFEs, string, (String)object2);
                            } else if (object2 instanceof Double) {
                                Vvwe.LT(qFEs, string, Vvwe.LT((Double)object2));
                            } else if (object2 instanceof Boolean) {
                                Vvwe.LT(qFEs, string, Vvwe.LT((Boolean)object2));
                            } else if (object2 instanceof Long) {
                                Vvwe.LT(qFEs, string, Vvwe.LT((Long)object2));
                            } else if (object2 instanceof List) {
                                Vvwe.LT(qFEs, string, (List)object2);
                            } else {
                                throw new ReflectiveOperationException((String)Vvwe.LT(Vvwe.LT(new StringBuilder(YEBy$TyVf.W("\u9799\u3a0b\u532d\u9d73\ue7e9\u55f8\u1eb6\u2a65\u3e51\udea2\u3c82\u77ab\ub76e\u5f01")), Vvwe.LT(object2))));
                            }
                        }
                    }
                }
            }
            ++n2;
        }
        arrfield = (Field[])Vvwe.LT(object3);
        n = arrfield.length;
        n2 = 0;
        while (n2 < n) {
            field = arrfield[n2];
            if (Vvwe.LT(Vvwe.LT(field)) != false) {
                if (Vvwe.LT(Vvwe.LT(field)) == false) {
                    if (Vvwe.LT(Vvwe.LT(field)) != false) {
                        if (Vvwe.LT(field, aLcY.class) != false) {
                            object = Vvwe.LT(field, null);
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
            arrfield = (Field[])Vvwe.LT(object3);
            n = arrfield.length;
            n2 = 0;
            while (n2 < n) {
                field = arrfield[n2];
                if (Vvwe.LT(Vvwe.LT(field)) == false) {
                    if (Vvwe.LT(Vvwe.LT(field)) == false) {
                        if (Vvwe.LT(Vvwe.LT(field)) != false) {
                            if (Vvwe.LT(field, FyLC.class) != false) {
                                object = (FyLC)Vvwe.LT(field, FyLC.class);
                                int n3 = object.value();
                                object2 = (String)Vvwe.LT(ktOu2, Vvwe.LT(n3));
                                if (object2 == null) {
                                    Vvwe.LT(Vvwe.LT(Vvwe.LT(Vvwe.LT(Vvwe.LT(Vvwe.LT(Vvwe.LT(Vvwe.LT(new StringBuilder(YEBy$TyVf.W("\u978f\u3a04\u5328\u9d73\ue7e9\u55fb\u1ef8\u2a23\u3e6c\ude95\u3cb6\u77ce\ub73f\u5f44\ucf78\u9cca\u98a6\u1eac\uf939\u4797")), n3), YEBy$TyVf.W("\u97ec\u3a4d")), Vvwe.LT(Vvwe.LT(field))), YEBy$TyVf.W("\u97f6")), Vvwe.LT(field)), YEBy$TyVf.W("\u97e5"))));
                                } else {
                                    Object object4 = Vvwe.LT(field, bAjC);
                                    if (object4 instanceof Integer) {
                                        Vvwe.LT(qFEs, object2, Vvwe.LT((Integer)object4));
                                    } else if (object4 instanceof String) {
                                        Vvwe.LT(qFEs, object2, (String)object4);
                                    } else if (object4 instanceof Double) {
                                        Vvwe.LT(qFEs, object2, Vvwe.LT((Double)object4));
                                    } else if (object4 instanceof Boolean) {
                                        Vvwe.LT(qFEs, object2, Vvwe.LT((Boolean)object4));
                                    } else if (object4 instanceof Long) {
                                        Vvwe.LT(qFEs, object2, Vvwe.LT((Long)object4));
                                    } else if (object4 instanceof List) {
                                        Vvwe.LT(qFEs, object2, (List)object4);
                                    } else {
                                        throw new ReflectiveOperationException((String)Vvwe.LT(Vvwe.LT(new StringBuilder(YEBy$TyVf.W("\u9799\u3a0b\u532d\u9d73\ue7e9\u55f8\u1eb6\u2a65\u3e51\udea2\u3c82\u77ab\ub76e\u5f01")), Vvwe.LT(object4))));
                                    }
                                }
                            }
                        }
                    }
                }
                ++n2;
            }
        }
        Vvwe.LT(new kkcI(), qFEs, file);
    }

    private static Object LT(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


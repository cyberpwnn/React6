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

public class ncmw {
    public void UtIU(hHjO hHjO2, File file) throws Exception {
        Object object;
        Object object2;
        Field field;
        Mtpq mtpq = new Mtpq();
        Object object3 = ncmw.eO(hHjO2);
        TNku tNku = null;
        Field[] arrfield = (Field[])ncmw.eO(object3);
        int n = arrfield.length;
        int n2 = 0;
        while (n2 < n) {
            field = arrfield[n2];
            if (ncmw.eO(ncmw.eO(field)) == false) {
                if (ncmw.eO(ncmw.eO(field)) == false) {
                    if (ncmw.eO(ncmw.eO(field)) != false) {
                        if (ncmw.eO(field, mWxx.class) != false) {
                            object = (mWxx)ncmw.eO(field, mWxx.class);
                            String string = object.value();
                            object2 = ncmw.eO(field, hHjO2);
                            if (object2 instanceof Integer) {
                                ncmw.eO(mtpq, string, ncmw.eO((Integer)object2));
                            } else if (object2 instanceof String) {
                                ncmw.eO(mtpq, string, (String)object2);
                            } else if (object2 instanceof Double) {
                                ncmw.eO(mtpq, string, ncmw.eO((Double)object2));
                            } else if (object2 instanceof Boolean) {
                                ncmw.eO(mtpq, string, ncmw.eO((Boolean)object2));
                            } else if (object2 instanceof Long) {
                                ncmw.eO(mtpq, string, ncmw.eO((Long)object2));
                            } else if (object2 instanceof List) {
                                ncmw.eO(mtpq, string, (List)object2);
                            } else {
                                throw new ReflectiveOperationException((String)ncmw.eO(ncmw.eO(new StringBuilder(FMkR$WjFM.a("\u636b\u35bc\u5aea\u5419\ubfb7\ue222\u5b08\u5514\ua0f1\udb44\uf6f8\ua57b\ua078\u8330")), ncmw.eO(object2))));
                            }
                        }
                    }
                }
            }
            ++n2;
        }
        arrfield = (Field[])ncmw.eO(object3);
        n = arrfield.length;
        n2 = 0;
        while (n2 < n) {
            field = arrfield[n2];
            if (ncmw.eO(ncmw.eO(field)) != false) {
                if (ncmw.eO(ncmw.eO(field)) == false) {
                    if (ncmw.eO(ncmw.eO(field)) != false) {
                        if (ncmw.eO(field, SvcY.class) != false) {
                            object = ncmw.eO(field, null);
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
            arrfield = (Field[])ncmw.eO(object3);
            n = arrfield.length;
            n2 = 0;
            while (n2 < n) {
                field = arrfield[n2];
                if (ncmw.eO(ncmw.eO(field)) == false) {
                    if (ncmw.eO(ncmw.eO(field)) == false) {
                        if (ncmw.eO(ncmw.eO(field)) != false) {
                            if (ncmw.eO(field, skNB.class) != false) {
                                object = (skNB)ncmw.eO(field, skNB.class);
                                int n3 = object.value();
                                object2 = (String)ncmw.eO(tNku, ncmw.eO(n3));
                                if (object2 == null) {
                                    ncmw.eO(ncmw.eO(ncmw.eO(ncmw.eO(ncmw.eO(ncmw.eO(ncmw.eO(ncmw.eO(new StringBuilder(FMkR$WjFM.a("\u637d\u35b3\u5aef\u5419\ubfb7\ue221\u5b46\u5552\ua0cc\udb73\uf6cc\ua51e\ua029\u8375\u81df\u9da8\u9b58\u7106\ub633\ue566")), n3), FMkR$WjFM.a("\u631e\u35fa")), ncmw.eO(ncmw.eO(field))), FMkR$WjFM.a("\u6304")), ncmw.eO(field)), FMkR$WjFM.a("\u6317"))));
                                } else {
                                    Object object4 = ncmw.eO(field, hHjO2);
                                    if (object4 instanceof Integer) {
                                        ncmw.eO(mtpq, object2, ncmw.eO((Integer)object4));
                                    } else if (object4 instanceof String) {
                                        ncmw.eO(mtpq, object2, (String)object4);
                                    } else if (object4 instanceof Double) {
                                        ncmw.eO(mtpq, object2, ncmw.eO((Double)object4));
                                    } else if (object4 instanceof Boolean) {
                                        ncmw.eO(mtpq, object2, ncmw.eO((Boolean)object4));
                                    } else if (object4 instanceof Long) {
                                        ncmw.eO(mtpq, object2, ncmw.eO((Long)object4));
                                    } else if (object4 instanceof List) {
                                        ncmw.eO(mtpq, object2, (List)object4);
                                    } else {
                                        throw new ReflectiveOperationException((String)ncmw.eO(ncmw.eO(new StringBuilder(FMkR$WjFM.a("\u636b\u35bc\u5aea\u5419\ubfb7\ue222\u5b08\u5514\ua0f1\udb44\uf6f8\ua57b\ua078\u8330")), ncmw.eO(object4))));
                                    }
                                }
                            }
                        }
                    }
                }
                ++n2;
            }
        }
        ncmw.eO(new klJY(), mtpq, file);
    }

    private static Object eO(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(o.Y(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


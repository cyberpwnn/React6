/*
 * Decompiled with CFR 0_123.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.EntityType
 */
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import org.bukkit.Chunk;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

public class yIpb
extends qloI {
    private hGxw<YoUO> cBQW;
    private hGxw<YoUO> Svgo;
    private aKuV<kITa, Integer> YfwP;

    @Override
    public void start() {
        yy.E(this, -2062881919, new hGxw());
        yy.E(this, 241560458, new hGxw());
        yy.E(this, 368765823, new aKuV());
        this.VTqA();
    }

    @Override
    public void stop() {
    }

    @Override
    public void tick() {
    }

    public void VTqA() {
        yIpb.Ae((aKuV)yy.h(this, 368765823));
        yIpb.Ae((hGxw)yy.h(this, -2062881919));
        yIpb.Ae((hGxw)yy.h(this, 241560458));
        Object object = yIpb.Ae((PBUD)yy.p(-1423643572));
        while (object.hasNext()) {
            Object object2;
            String string = (String)object.next();
            if (yIpb.Ae(string, NVIs$JbpD.H("\u28a8\udcec\ub097\u9687\ub5cb\ucc59\ub22c\u1a34")) != false) {
                object2 = yIpb.Ae(yIpb.Ae(string, NVIs$JbpD.H("\u28a8\udcec\ub097\u9687\ub5cb\ucc59\ub22c\u1a34"), ""));
                for (YoUO yoUO : (YoUO[])yIpb.Ae()) {
                    if (yIpb.Ae(yIpb.Ae(yoUO), object2) == false) continue;
                    if (yIpb.Ae((hGxw)yy.h(this, -2062881919), yoUO) != false) {
                        yIpb.Ae(yIpb.Ae(yIpb.Ae(yIpb.Ae(new StringBuilder(NVIs$JbpD.H("\u28ac\udccb\ub082\u968d\ub5d7\ucc49\ub228\u1a60\u3134\u9fb7\u18a0\u204c\u4538\ubec3\u057a\ufc3a\uacec\uf24d\u77b7\ucd78\u1fc5\u4d6d\ue927")), string), NVIs$JbpD.H("\u28c1"))));
                    }
                    yIpb.Ae((hGxw)yy.h(this, -2062881919), yoUO);
                }
                continue;
            }
            if (yIpb.Ae(string, NVIs$JbpD.H("\u28a8\udcfa\ub097\u9687\ub5db\ucc58\ub269")) != false) {
                object2 = yIpb.Ae(yIpb.Ae(string, NVIs$JbpD.H("\u28a8\udcfa\ub097\u9687\ub5db\ucc58\ub269"), ""));
                for (YoUO yoUO : (YoUO[])yIpb.Ae()) {
                    if (yIpb.Ae(yIpb.Ae(yoUO), object2) == false) continue;
                    if (yIpb.Ae((hGxw)yy.h(this, 241560458), yoUO) != false) {
                        yIpb.Ae(yIpb.Ae(yIpb.Ae(yIpb.Ae(new StringBuilder(NVIs$JbpD.H("\u28ac\udccb\ub082\u968d\ub5d7\ucc49\ub228\u1a60\u3134\u9fb7\u18b6\u204c\u4538\ubed3\u057b\ufc7f\uac8a\uf267\u77ba\ucd7e\u1f82\u4d65")), string), NVIs$JbpD.H("\u28c1"))));
                    }
                    if (yIpb.Ae((hGxw)yy.h(this, -2062881919), yoUO) != false) {
                        yIpb.Ae(yIpb.Ae(yIpb.Ae(yIpb.Ae(new StringBuilder(NVIs$JbpD.H("\u28ab\udcdf\ub09c\u968f\ub5d1\ucc5e\ub269\u1a70\u3134\u9ff1\u1897\u205b\u457e\ubed7\u0529\ufc0d\uac89\uf24d\u778e\ucd4a\u1fe7\u4d09\ue92f\ueb86\u4cd3\u30bc\u6253\u5515\u1e0f")), string), NVIs$JbpD.H("\u28c1"))));
                        continue;
                    }
                    yIpb.Ae((hGxw)yy.h(this, 241560458), yoUO);
                }
                continue;
            }
            if (yIpb.Ae(string, NVIs$JbpD.H("\u28a8\udcec\ub097\u9692\ub5ca\ucc58\ub220\u1a77\u3125\u9fb7")) != false) {
                if (yIpb.Ae(string, NVIs$JbpD.H("\u28d5")) != false) {
                    object2 = yIpb.Ae(yIpb.Ae(string, NVIs$JbpD.H("\u28a8\udcec\ub097\u9692\ub5ca\ucc58\ub220\u1a77\u3125\u9fb7"), ""));
                    Object object4 = yIpb.Ae(((String[])yIpb.Ae(object2, NVIs$JbpD.H("\u28d5")))[0]);
                    Object object5 = yIpb.Ae(((String[])yIpb.Ae(object2, NVIs$JbpD.H("\u28d5")))[1]);
                    try {
                        Object object6 = yIpb.Ae(yIpb.Ae(object5));
                        PBUD pBUD = new PBUD();
                        if (yIpb.Ae(object4, NVIs$JbpD.H("\u28c4")) != false) {
                            for (String string2 : (String[])yIpb.Ae(object4, NVIs$JbpD.H("\u28c4"))) {
                                yIpb.Ae(pBUD, yIpb.Ae(string2));
                            }
                        } else {
                            yIpb.Ae(pBUD, object4);
                        }
                        kITa kITa2 = new kITa();
                        Object object3 = yIpb.Ae(pBUD);
                        block6 : while (object3.hasNext()) {
                            String string3 = (String)object3.next();
                            Object object7 = yIpb.Ae((PBUD)yy.p(-1597838259));
                            while (object7.hasNext()) {
                                String string4 = (String)object7.next();
                                if (yIpb.Ae(yIpb.Ae(string4, NVIs$JbpD.H("\u28b7"), NVIs$JbpD.H("\u28c8")), string3) == false) continue;
                                for (EntityType entityType : (EntityType[])yIpb.Ae()) {
                                    if (yIpb.Ae(yIpb.Ae(entityType), string4) == false) continue;
                                    yIpb.Ae(yIpb.Ae(kITa2), entityType);
                                    continue block6;
                                }
                                yIpb.Ae(yIpb.Ae(yIpb.Ae(yIpb.Ae(yIpb.Ae(yIpb.Ae(new StringBuilder(NVIs$JbpD.H("\u28ab\udcd1\ub087\u968d\ub5da\ucc0a\ub227\u1a7b\u3125\u9fb7\u1894\u2040\u4530\ubed2\u0529\ufc3a\uaca2\uf27f\u77b2\ucd6d\u1fdb\u4d6d\ue960\ueb86\u4c9f\u30a9\u624d\u5545\u1e42\u4ad0\u7ae3")), string3), NVIs$JbpD.H("\u28c8\udc96")), string), NVIs$JbpD.H("\u28c1"))));
                            }
                        }
                        if (yIpb.Ae(yIpb.Ae(kITa2)) != false) {
                            yIpb.Ae(yIpb.Ae(yIpb.Ae(new StringBuilder(NVIs$JbpD.H("\u28ab\udcd1\ub087\u968d\ub5da\ucc0a\ub227\u1a7b\u3125\u9fb7\u1882\u2048\u452c\ubec5\u056c\ufc7f\uacad\uf265\u77a2\ucd39\u1fc7\u4d23\ue97b\ueb89\u4ccb\u30a4\u6214\u5541\u1e5e\u4a9a\u7aa6\ufa6c\u55a1\ud6d3\ufe9c\uf820\u3135")), string)));
                            continue;
                        }
                        yIpb.Ae((aKuV)yy.h(this, 368765823), kITa2, yIpb.Ae(object6));
                    }
                    catch (NumberFormatException numberFormatException) {
                        yIpb.Ae(yIpb.Ae(yIpb.Ae(new StringBuilder(NVIs$JbpD.H("\u28bd\udcd0\ub093\u9683\ub5d2\ucc4f\ub269\u1a60\u313e\u9fb7\u1882\u2048\u452c\ubec5\u056c\ufc7f\uaca5\uf265\u77af\ucd7c\u1fc5\u4d28\ue97d\uebc0\u4cde\u30a9\u6214")), string)));
                    }
                    continue;
                }
            }
            yIpb.Ae(yIpb.Ae(yIpb.Ae(new StringBuilder(NVIs$JbpD.H("\u28bd\udcd0\ub093\u9683\ub5d2\ucc4f\ub269\u1a60\u313e\u9fb7\u1882\u2048\u452c\ubec5\u056c\ufc65\uacec")), string)));
            yIpb.Ae(NVIs$JbpD.H("\u28a5\udccb\ub081\u9695\ub59e\ucc59\ub23d\u1a75\u3123\u9fe3\u18d2\u205e\u4537\ubec2\u0561\ufc7f\uac8c\uf259\u77be\ucd6a\u1fd6\u4d3f\ue966\ueb83\u4ccb\u30fd\u6208\u5574\u1e0b\u4aa8\u7aef\ufa5c\u55ad\ud69b\ufedd\uf87c\u312b\ub5ad\ua08d\u310c\ua798\ucbdd\u1458\u86bb\uc1d0\uf0fb\u3e86\ud2bd\uaaf9\u3240\u2817\u460d\u2715\ufaeb\u72e5"));
        }
        yIpb.Ae(yIpb.Ae(yIpb.Ae(yIpb.Ae(new StringBuilder(NVIs$JbpD.H("\u28aa\udccb\ub09b\u968d\ub5ca\ucc0a")), yIpb.Ae((hGxw)yy.h(this, -2062881919))), NVIs$JbpD.H("\u28c8\udcec\ub097\u9687\ub5cb\ucc59\ub228\u1a78\u3122"))));
        yIpb.Ae(yIpb.Ae(yIpb.Ae(yIpb.Ae(new StringBuilder(NVIs$JbpD.H("\u28aa\udccb\ub09b\u968d\ub5ca\ucc0a")), yIpb.Ae((hGxw)yy.h(this, 241560458))), NVIs$JbpD.H("\u28c8\udcfa\ub097\u9687\ub5db\ucc58\ub23a"))));
        yIpb.Ae(yIpb.Ae(yIpb.Ae(yIpb.Ae(new StringBuilder(NVIs$JbpD.H("\u28aa\udccb\ub09b\u968d\ub5ca\ucc0a")), yIpb.Ae((aKuV)yy.h(this, 368765823))), NVIs$JbpD.H("\u28c8\udcf8\ub09b\u968d\ub5ca\ucc4f\ub23b\u1a67"))));
    }

    public int halY(Chunk chunk) {
        int n;
        int n2 = 0;
        while ((n = this.ssMm(chunk)) > 0) {
            n2 += n;
        }
        return n2;
    }

    private int ssMm(Chunk chunk) {
        EntityType entityType;
        Object object;
        int n;
        PBUD pBUD;
        Object object2;
        int n2;
        Object object3;
        WWmD wWmD = new WWmD();
        WWmD wWmD2 = new WWmD();
        WWmD wWmD3 = new WWmD();
        aKuV aKuV2 = new aKuV();
        Object object4 = new hGxw();
        int n3 = 0;
        Object object5 = chunk.getEntities();
        Object object6 = object5.length;
        block0 : for (n2 = 0; n2 < object6; ++n2) {
            object2 = object5[n2];
            if (object2.isDead()) continue;
            object4 = yIpb.Ae(object2);
            object = yIpb.Ae(object4);
            while (object.hasNext()) {
                pBUD = (YoUO)((Object)object.next());
                if (yIpb.Ae((hGxw)yy.h(this, -2062881919), pBUD) != false) continue block0;
            }
            object = yIpb.Ae(object4);
            while (object.hasNext()) {
                pBUD = (YoUO)((Object)object.next());
                if (yIpb.Ae((hGxw)yy.h(this, 241560458), pBUD) == false) continue;
                yIpb.Ae(wWmD2, object2);
                yIpb.Ae(wWmD3, object2);
                continue block0;
            }
            yIpb.Ae(wWmD2, object2);
            yIpb.Ae(wWmD, object2);
        }
        object5 = yIpb.Ae(yIpb.Ae((aKuV)yy.h(this, 368765823)));
        while (object5.hasNext()) {
            kITa kITa2 = (kITa)object5.next();
            n2 = 0;
            object2 = yIpb.Ae(yIpb.Ae(kITa2));
            while (object2.hasNext()) {
                object = (EntityType)object2.next();
                n2 += yIpb.Ae(wWmD2, object);
            }
            if (n2 <= yIpb.Ae((Integer)yIpb.Ae((aKuV)yy.h(this, 368765823), kITa2))) continue;
            yIpb.Ae(aKuV2, kITa2, yIpb.Ae(n2 - yIpb.Ae((Integer)yIpb.Ae((aKuV)yy.h(this, 368765823), kITa2))));
        }
        if (yIpb.Ae(yIpb.Ae(aKuV2)) != false) {
            return 0;
        }
        object5 = (kITa)yIpb.Ae(yIpb.Ae(aKuV2));
        object6 = yIpb.Ae((Integer)yIpb.Ae(aKuV2, object5));
        n2 = 0;
        Object object7 = false;
        Object object8 = false;
        pBUD = yIpb.Ae(yIpb.Ae(object5));
        while (pBUD.hasNext()) {
            object3 = (EntityType)pBUD.next();
            n2 += yIpb.Ae(wWmD, object3);
        }
        Object object9 = n2 >= object6 ? object6 : (Object)n2;
        object7 = object9;
        object8 = object9 < object6 ? (Object)(object6 - object7) : 0;
        pBUD = new PBUD();
        object3 = new PBUD();
        Object object10 = yIpb.Ae(yIpb.Ae(object5));
        while (object10.hasNext()) {
            entityType = (EntityType)object10.next();
            yIpb.Ae(pBUD, yIpb.Ae(wWmD, entityType));
        }
        object10 = yIpb.Ae(yIpb.Ae(object5));
        while (object10.hasNext()) {
            entityType = (EntityType)object10.next();
            yIpb.Ae(object3, yIpb.Ae(wWmD3, entityType));
        }
        object8 = yIpb.Ae(object3) < object8 ? (Object)yIpb.Ae(object3) : object8;
        object7 = yIpb.Ae(pBUD) < object7 ? yIpb.Ae(pBUD) : object7;
        for (n = 0; n < object7; ++n) {
            yIpb.Ae((Entity)yIpb.Ae(pBUD));
            ++n3;
        }
        for (n = 0; n < object8; ++n) {
            yIpb.Ae((Entity)yIpb.Ae(object3));
            ++n3;
        }
        return n3;
    }

    private static Object Ae(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(yy.X(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


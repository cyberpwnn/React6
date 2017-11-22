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

public class cAai
extends jqQR {
    private QyFw<KwOT> KgBy;
    private QyFw<KwOT> YokS;
    private ktOu<KUKx, Integer> MJeY;

    @Override
    public void start() {
        cv.e(this, -1776880987, new QyFw());
        cv.e(this, 1692988068, new QyFw());
        cv.e(this, 1095299751, new ktOu());
        this.RPon();
    }

    @Override
    public void stop() {
    }

    @Override
    public void tick() {
    }

    public void RPon() {
        cAai.md((ktOu)cv.b(this, 1095299751));
        cAai.md((QyFw)cv.b(this, -1776880987));
        cAai.md((QyFw)cv.b(this, 1692988068));
        Object object = cAai.md((wfPa)cv.e(-680062633));
        while (object.hasNext()) {
            Object object2;
            String string = (String)object.next();
            if (cAai.md(string, KUXS$dwji.S("\ua711\u3c41\u4d08\ua345\uf5c6\ucc5b\ua1ff\u8d3d")) != false) {
                object2 = cAai.md(cAai.md(string, KUXS$dwji.S("\ua711\u3c41\u4d08\ua345\uf5c6\ucc5b\ua1ff\u8d3d"), ""));
                for (KwOT kwOT : (KwOT[])cAai.md()) {
                    if (cAai.md(cAai.md(kwOT), object2) == false) continue;
                    if (cAai.md((QyFw)cv.b(this, -1776880987), kwOT) != false) {
                        cAai.md(cAai.md(cAai.md(cAai.md(new StringBuilder(KUXS$dwji.S("\ua715\u3c66\u4d1d\ua34f\uf5da\ucc4b\ua1fb\u8d69\ub9aa\ue8d5\ud346\uf970\u2e57\u37a9\u06e0\ub2b1\ua53c\u5549\u89ce\u7eb8\u0541\u2371\u176b")), string), KUXS$dwji.S("\ua778"))));
                    }
                    cAai.md((QyFw)cv.b(this, -1776880987), kwOT);
                }
                continue;
            }
            if (cAai.md(string, KUXS$dwji.S("\ua711\u3c57\u4d08\ua345\uf5d6\ucc5a\ua1ba")) != false) {
                object2 = cAai.md(cAai.md(string, KUXS$dwji.S("\ua711\u3c57\u4d08\ua345\uf5d6\ucc5a\ua1ba"), ""));
                for (KwOT kwOT : (KwOT[])cAai.md()) {
                    if (cAai.md(cAai.md(kwOT), object2) == false) continue;
                    if (cAai.md((QyFw)cv.b(this, 1692988068), kwOT) != false) {
                        cAai.md(cAai.md(cAai.md(cAai.md(new StringBuilder(KUXS$dwji.S("\ua715\u3c66\u4d1d\ua34f\uf5da\ucc4b\ua1fb\u8d69\ub9aa\ue8d5\ud350\uf970\u2e57\u37b9\u06e1\ub2f4\ua55a\u5563\u89c3\u7ebe\u0506\u2379")), string), KUXS$dwji.S("\ua778"))));
                    }
                    if (cAai.md((QyFw)cv.b(this, -1776880987), kwOT) != false) {
                        cAai.md(cAai.md(cAai.md(cAai.md(new StringBuilder(KUXS$dwji.S("\ua712\u3c72\u4d03\ua34d\uf5dc\ucc5c\ua1ba\u8d79\ub9aa\ue893\ud371\uf967\u2e11\u37bd\u06b3\ub286\ua559\u5549\u89f7\u7e8a\u0563\u2315\u1763\u9a17\ud11f\ue691\u7d19\ub67a\u018d")), string), KUXS$dwji.S("\ua778"))));
                        continue;
                    }
                    cAai.md((QyFw)cv.b(this, 1692988068), kwOT);
                }
                continue;
            }
            if (cAai.md(string, KUXS$dwji.S("\ua711\u3c41\u4d08\ua350\uf5c7\ucc5a\ua1f3\u8d7e\ub9bb\ue8d5")) != false) {
                if (cAai.md(string, KUXS$dwji.S("\ua76c")) != false) {
                    object2 = cAai.md(cAai.md(string, KUXS$dwji.S("\ua711\u3c41\u4d08\ua350\uf5c7\ucc5a\ua1f3\u8d7e\ub9bb\ue8d5"), ""));
                    Object object4 = cAai.md(((String[])cAai.md(object2, KUXS$dwji.S("\ua76c")))[0]);
                    Object object5 = cAai.md(((String[])cAai.md(object2, KUXS$dwji.S("\ua76c")))[1]);
                    try {
                        Object object6 = cAai.md(cAai.md(object5));
                        wfPa wfPa2 = new wfPa();
                        if (cAai.md(object4, KUXS$dwji.S("\ua77d")) != false) {
                            for (String string2 : (String[])cAai.md(object4, KUXS$dwji.S("\ua77d"))) {
                                cAai.md(wfPa2, cAai.md(string2));
                            }
                        } else {
                            cAai.md(wfPa2, object4);
                        }
                        KUKx kUKx = new KUKx();
                        Object object3 = cAai.md(wfPa2);
                        block6 : while (object3.hasNext()) {
                            String string3 = (String)object3.next();
                            Object object7 = cAai.md((wfPa)cv.e(2070942058));
                            while (object7.hasNext()) {
                                String string4 = (String)object7.next();
                                if (cAai.md(cAai.md(string4, KUXS$dwji.S("\ua70e"), KUXS$dwji.S("\ua771")), string3) == false) continue;
                                for (EntityType entityType : (EntityType[])cAai.md()) {
                                    if (cAai.md(cAai.md(entityType), string4) == false) continue;
                                    cAai.md(cAai.md(kUKx), entityType);
                                    continue block6;
                                }
                                cAai.md(cAai.md(cAai.md(cAai.md(cAai.md(cAai.md(new StringBuilder(KUXS$dwji.S("\ua712\u3c7c\u4d18\ua34f\uf5d7\ucc08\ua1f4\u8d72\ub9bb\ue8d5\ud372\uf97c\u2e5f\u37b8\u06b3\ub2b1\ua572\u557b\u89cb\u7ead\u055f\u2371\u172c\u9a17\ud153\ue684\u7d07\ub62a\u01c0\u534c\uf754")), string3), KUXS$dwji.S("\ua771\u3c3b")), string), KUXS$dwji.S("\ua778"))));
                            }
                        }
                        if (cAai.md(cAai.md(kUKx)) != false) {
                            cAai.md(cAai.md(cAai.md(new StringBuilder(KUXS$dwji.S("\ua712\u3c7c\u4d18\ua34f\uf5d7\ucc08\ua1f4\u8d72\ub9bb\ue8d5\ud364\uf974\u2e43\u37af\u06f6\ub2f4\ua57d\u5561\u89db\u7ef9\u0543\u233f\u1737\u9a18\ud107\ue689\u7d5e\ub62e\u01dc\u5306\uf711\u49a8\uefba\u6087\u29e9\ue33e\ua0ca")), string)));
                            continue;
                        }
                        cAai.md((ktOu)cv.b(this, 1095299751), kUKx, cAai.md(object6));
                    }
                    catch (NumberFormatException numberFormatException) {
                        cAai.md(cAai.md(cAai.md(new StringBuilder(KUXS$dwji.S("\ua704\u3c7d\u4d0c\ua341\uf5df\ucc4d\ua1ba\u8d69\ub9a0\ue8d5\ud364\uf974\u2e43\u37af\u06f6\ub2f4\ua575\u5561\u89d6\u7ebc\u0541\u2334\u1731\u9a51\ud112\ue684\u7d5e")), string)));
                    }
                    continue;
                }
            }
            cAai.md(cAai.md(cAai.md(new StringBuilder(KUXS$dwji.S("\ua704\u3c7d\u4d0c\ua341\uf5df\ucc4d\ua1ba\u8d69\ub9a0\ue8d5\ud364\uf974\u2e43\u37af\u06f6\ub2ee\ua53c")), string)));
            cAai.md(KUXS$dwji.S("\ua71c\u3c66\u4d1e\ua357\uf593\ucc5b\ua1ee\u8d7c\ub9bd\ue881\ud334\uf962\u2e58\u37a8\u06fb\ub2f4\ua55c\u555d\u89c7\u7eaa\u0552\u2323\u172a\u9a12\ud107\ue6d0\u7d42\ub61b\u0189\u5334\uf758\u4998\uefb6\u60cf\u29a8\ue362\ua0d4\u93b7\u9eca\uce06\u113a\u9801\ua233\u1de4\uf1bc\u06ad\ud018\u8868\u849e\u39fb\uc257\u3683\u7494\ua965\u6f2c"));
        }
        cAai.md(cAai.md(cAai.md(cAai.md(new StringBuilder(KUXS$dwji.S("\ua713\u3c66\u4d04\ua34f\uf5c7\ucc08")), cAai.md((QyFw)cv.b(this, -1776880987))), KUXS$dwji.S("\ua771\u3c41\u4d08\ua345\uf5c6\ucc5b\ua1fb\u8d71\ub9bc"))));
        cAai.md(cAai.md(cAai.md(cAai.md(new StringBuilder(KUXS$dwji.S("\ua713\u3c66\u4d04\ua34f\uf5c7\ucc08")), cAai.md((QyFw)cv.b(this, 1692988068))), KUXS$dwji.S("\ua771\u3c57\u4d08\ua345\uf5d6\ucc5a\ua1e9"))));
        cAai.md(cAai.md(cAai.md(cAai.md(new StringBuilder(KUXS$dwji.S("\ua713\u3c66\u4d04\ua34f\uf5c7\ucc08")), cAai.md((ktOu)cv.b(this, 1095299751))), KUXS$dwji.S("\ua771\u3c55\u4d04\ua34f\uf5c7\ucc4d\ua1e8\u8d6e"))));
    }

    public int BkpW(Chunk chunk) {
        int n;
        int n2 = 0;
        while ((n = this.lCdp(chunk)) > 0) {
            n2 += n;
        }
        return n2;
    }

    private int lCdp(Chunk chunk) {
        EntityType entityType;
        Object object;
        int n;
        Object object2;
        int n2;
        Object object3;
        wfPa wfPa2;
        avmQ avmQ2 = new avmQ();
        avmQ avmQ3 = new avmQ();
        avmQ avmQ4 = new avmQ();
        ktOu ktOu2 = new ktOu();
        Object object4 = new QyFw();
        int n3 = 0;
        Object object5 = chunk.getEntities();
        Object object6 = object5.length;
        block0 : for (n2 = 0; n2 < object6; ++n2) {
            object2 = object5[n2];
            if (object2.isDead()) continue;
            object4 = cAai.md(object2);
            object = cAai.md(object4);
            while (object.hasNext()) {
                wfPa2 = (KwOT)((Object)object.next());
                if (cAai.md((QyFw)cv.b(this, -1776880987), wfPa2) != false) continue block0;
            }
            object = cAai.md(object4);
            while (object.hasNext()) {
                wfPa2 = (KwOT)((Object)object.next());
                if (cAai.md((QyFw)cv.b(this, 1692988068), wfPa2) == false) continue;
                cAai.md(avmQ3, object2);
                cAai.md(avmQ4, object2);
                continue block0;
            }
            cAai.md(avmQ3, object2);
            cAai.md(avmQ2, object2);
        }
        object5 = cAai.md(cAai.md((ktOu)cv.b(this, 1095299751)));
        while (object5.hasNext()) {
            KUKx kUKx = (KUKx)object5.next();
            n2 = 0;
            object2 = cAai.md(cAai.md(kUKx));
            while (object2.hasNext()) {
                object = (EntityType)object2.next();
                n2 += cAai.md(avmQ3, object);
            }
            if (n2 <= cAai.md((Integer)cAai.md((ktOu)cv.b(this, 1095299751), kUKx))) continue;
            cAai.md(ktOu2, kUKx, cAai.md(n2 - cAai.md((Integer)cAai.md((ktOu)cv.b(this, 1095299751), kUKx))));
        }
        if (cAai.md(cAai.md(ktOu2)) != false) {
            return 0;
        }
        object5 = (KUKx)cAai.md(cAai.md(ktOu2));
        object6 = cAai.md((Integer)cAai.md(ktOu2, object5));
        n2 = 0;
        Object object7 = false;
        Object object8 = false;
        wfPa2 = cAai.md(cAai.md(object5));
        while (wfPa2.hasNext()) {
            object3 = (EntityType)wfPa2.next();
            n2 += cAai.md(avmQ2, object3);
        }
        Object object9 = n2 >= object6 ? object6 : (Object)n2;
        object7 = object9;
        object8 = object9 < object6 ? (Object)(object6 - object7) : 0;
        wfPa2 = new wfPa();
        object3 = new wfPa();
        Object object10 = cAai.md(cAai.md(object5));
        while (object10.hasNext()) {
            entityType = (EntityType)object10.next();
            cAai.md(wfPa2, cAai.md(avmQ2, entityType));
        }
        object10 = cAai.md(cAai.md(object5));
        while (object10.hasNext()) {
            entityType = (EntityType)object10.next();
            cAai.md(object3, cAai.md(avmQ4, entityType));
        }
        object8 = cAai.md(object3) < object8 ? (Object)cAai.md(object3) : object8;
        object7 = cAai.md(wfPa2) < object7 ? cAai.md(wfPa2) : object7;
        for (n = 0; n < object7; ++n) {
            cAai.md((Entity)cAai.md(wfPa2));
            ++n3;
        }
        for (n = 0; n < object8; ++n) {
            cAai.md((Entity)cAai.md(object3));
            ++n3;
        }
        return n3;
    }

    private static Object md(Object object, Object object2, Object object3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)object).unreflect(cv.L(Integer.valueOf((String)object2, 32))).asType((MethodType)object3));
        }
        catch (ClassNotFoundException | IllegalAccessException reflectiveOperationException) {
            throw new BootstrapMethodError(reflectiveOperationException);
        }
    }
}


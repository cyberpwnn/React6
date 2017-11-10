/*
 * Decompiled with CFR 0_123.
 */
package gjq.ybl;

import java.math.BigInteger;

public class lt
extends Thread {
    private static volatile Object[] q;
    private final int L;
    private static final BigInteger[] T;

    lt(int n) {
        this.L = n;
    }

    static {
        T = new BigInteger[1];
    }

    public void run() {
        lt.a(this.L, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static final void a(int var0, Object var1_1) {
        switch (var0) {
            case 0: {
                var2_2 = new byte[256];
                var3_11 = new int[256];
                var4_21 = new int[256];
                var5_32 = new int[256];
                var6_41 = new int[256];
                v0 = new Object[8];
                v0[0] = var2_2;
                v0[1] = var3_11;
                v0[2] = var4_21;
                v0[3] = var5_32;
                v0[4] = var6_41;
                v0[5] = null;
                v0[6] = null;
                lt.q = v0;
                return;
            }
            case 1: {
                var2_3 = new int[256];
                var3_12 = 0;
                var4_22 = 1;
                do {
                    if (var3_12 >= 256) {
                        lt.a(2, var2_3);
                        return;
                    }
                    var2_3[var3_12] = var4_22;
                    var4_22 ^= var4_22 << 1 ^ (var4_22 >>> 7) * 283;
                    ++var3_12;
                } while (true);
            }
            case 2: {
                var2_4 = (byte[])lt.q[0];
                var2_4[0] = 99;
                var3_13 = (int[])var1_1;
                for (var4_23 = 0; var4_23 < 255; var5_33 ^= var5_33 >> 4 ^ var5_33 >> 5 ^ var5_33 >> 6 ^ var5_33 >> 7, ++var4_23) {
                    var5_33 = var3_13[255 - var4_23];
                    var5_33 |= var5_33 << 8;
                    var2_4[var3_13[var4_23]] = (byte)(var5_33 ^ 99);
                }
                var4_24 = (int[])lt.q[1];
                var5_34 = (int[])lt.q[2];
                var6_42 = (int[])lt.q[3];
                var7_48 = (int[])lt.q[4];
                var8_53 = 0;
                while (var8_53 < 256) {
                    var9_57 = var2_4[var8_53] & 255;
                    var10_62 = var9_57 << 1 ^ (var9_57 >>> 7) * 283;
                    var11_63 = (var9_57 ^ var10_62) << 24 ^ var9_57 << 16 ^ var9_57 << 8 ^ var10_62;
                    var4_24[var8_53] = var11_63 &= -1;
                    var5_34[var8_53] = var11_63 << 8 | var11_63 >>> -8;
                    var6_42[var8_53] = var11_63 << 16 | var11_63 >>> -16;
                    var7_48[var8_53] = var11_63 << 24 | var11_63 >>> -24;
                    ++var8_53;
                }
                return;
            }
            case 3: {
                var2_5 = "\ufd90\ub8d4\uadc8\ufcbf\u83b6\uf272\u2564\u5e6c\u8cbc\u3cdd\u119b\u3526\u1a2e\ubbe4\u1ff2\u3492\ub8fb\u8d77\ue148\u08fe\ud56a\uac91\ud022\u1ed2\u25fe\u6128\u6a20\u533b\uaf77\udaf2\u615e\ued90\u4839\udeb1\uef24\uf63b\u2fa2\u2214\u5da7\u82af\u520b\udbc2\u5199\u69fb\u0e06\ucb54\u33f4\ua2f7\u27d0\ud2df\udc7c\ucd00\u1d65\u23af\u0a7b\ucd10\u6514\u63be\uf932\u0671\u88b3\ua6f8\ua9db\ue31d\uc829\uffbe\u0e9c\ud48b\uaa7b\u4ac9\u7322\u85d3\uce5e\uc501\u11f9\u6829\u5ec7\u2c5d\ube96\u2f11\u90bd\uedcb\u5985\u75d0\ub82a\ue9d4\u0bc0\u444e\uad52\u24a2\u3121\ue7fc\u782e\ue529\u25b4\u1f21\u3137\u503d\u80ac\u29b9\u690d\u4c38\u7767\ube58\uc165\u0c81\ua5d3\u98ef\ud3b4\uabd8\ufe94\udf38\u8e55\u5429\u7f46\u4b60\u9ae9\u1213\ub6bd\ucffc\u9797\udab9\u4911\ue605\u512e\u306b\uaaea\u8488".toCharArray();
                var3_14 = new byte[var2_5.length * 2];
                for (var4_25 = 0; var4_25 < var2_5.length; ++var4_25) {
                    var3_14[var4_25 * 2] = (byte)(var2_5[var4_25] & 255);
                    var3_14[var4_25 * 2 + 1] = (byte)((var2_5[var4_25] & 65280) >> 8);
                }
                var2_5 = "\u06e5\ufb3b\ufe96\uaf1a\u2829\u912c\uf05b\u3b80\u2a67\ue982\u79b9\u756c\u4617\ua849\uaeb4\u8374\u2502\uaca2\u0f67\u2f58\uecbc\ua28c\uad5b\ub745\udd96\udaf0\ua118\uecb4\u7734\uc2d4\u570d\ub90e\u1b1f\ub35d\u2fa5\ud6a7\u9c44\u3d1b\u1eb8\u81f7\u541c\u8550\u4768\udff4\ue129\ud67f\u47e8\u968b\ubf33\ua715\ufe95\ua752\u53d4\u62f2\ue650\u0f60\u8ce3\u05e1\u0929\u10dc\ue46e\uf3b8\u3703\u125d\u7a3b\u9a60\u3c43\ub72a\u043d\uece1\ua20d\u100c\uc050\ua4ed\u5633\ue46f\u3e5a\ud063\u3f45\u1500\ud217\uf795\u3af2\u3470\u2fee\u0ec6\u9d73\uc1e0\u1332\u3531\u4731\u667a\u2f33\uba9f\udccc\uc749\u2657\u9c82\ufcd4\u7097\u2ed3\uf39b\u9b42\u95ba\uf17b\u17ad\u57e1\ue6b4\u125a\u2d41\u53b6\u3c7e\ue15d\u2760\u1202\ub19f\ufc68\ud50b\u0452\uddc4\u6c62\u09ef\u6cbd\uabc4\u06ff\uc32d\u0d54\ub6a7".toCharArray();
                var4_26 = new byte[var2_5.length * 2];
                for (var5_35 = 0; var5_35 < var2_5.length; ++var5_35) {
                    var4_26[var5_35 * 2] = (byte)(var2_5[var5_35] & 255);
                    var4_26[var5_35 * 2 + 1] = (byte)((var2_5[var5_35] & 65280) >> 8);
                }
                var5_36 = new byte[16];
                try {
                    var5_36[0] = var3_14[var4_26[195] & 255];
                    var5_36[1] = var3_14[var4_26[40] & 255];
                    var5_36[2] = var3_14[var4_26[51] & 255];
                    var5_36[3] = var3_14[var4_26[93] & 255];
                    var5_36[4] = var3_14[var4_26[207] & 255];
                    var5_36[5] = var3_14[var4_26[13] & 255];
                    var5_36[6] = var3_14[var4_26[199] & 255];
                    var5_36[7] = var3_14[var4_26[242] & 255];
                    ** GOTO lbl91
                }
                catch (Exception var6_43) {}
                ** GOTO lbl91
                finally {
                    var5_36[8] = var3_14[var4_26[82] & 255];
                    var5_36[9] = var3_14[var4_26[247] & 255];
                    var5_36[10] = var3_14[var4_26[167] & 255];
                    var5_36[11] = var3_14[var4_26[179] & 255];
                    var5_36[12] = var3_14[var4_26[211] & 255];
                    var5_36[13] = var3_14[var4_26[224] & 255];
                    var5_36[14] = var3_14[var4_26[141] & 255];
                    var5_36[15] = var3_14[var4_26[212] & 255];
                }
lbl91: // 2 sources:
                lt.a(5, var5_36);
                return;
            }
            case 4: {
                var2_6 = new int[]{-481817382, -1022004115, -1658058500, -2074355242};
                var3_15 = 0 ^ Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 1;
                var2_6[2] = var2_6[2] ^ (int)var3_15;
                lt.q[6] = var2_6;
                return;
            }
            case 5: {
                var2_7 = (byte[])var1_1;
                var3_16 = 4;
                var5_37 = var3_16 + 6;
                var6_44 = new int[(var5_37 + 1) * 4];
                var4_27 = 0;
                try {
                    for (var7_49 = 0; var7_49 < 16; var7_49 += 4, ++var4_27) {
                        var6_44[(var4_27 >> 2) * 4 + var4_27 & 3] = var2_7[var7_49] & 255 | (var2_7[var7_49 + 1] & 255) << 8 | (var2_7[var7_49 + 2] & 255) << 16 | var2_7[var7_49 + 3] << 24;
                    }
                }
                catch (Exception var8_54) {
                    // empty catch block
                }
                lt.q[5] = var6_44;
                lt.a(6, null);
                return;
            }
            case 6: {
                var2_8 = new int[30];
                var4_28 = 1;
                for (var3_17 = 0; var3_17 < 30; ++var3_17) {
                    var2_8[var3_17] = var4_28;
                    var4_28 = var4_28 << 1 ^ (var4_28 >>> 7) * 283;
                }
                var3_18 = (int[])lt.q[5];
                var4_29 = (byte[])lt.q[0];
                var5_38 = 44;
                var6_45 = 4;
                while (var6_45 < var5_38) {
                    var7_50 = var3_18[(var6_45 - 1 >> 2) * 4 + (var6_45 - 1 & 3)];
                    if (var6_45 % 4 == 0) {
                        var7_50 = lt.q(var4_29, lt.p(var7_50, 8)) ^ var2_8[var6_45 / 4 - 1];
                    }
                    var3_18[(var6_45 >> 2) * 4 + (var6_45 & 3)] = var3_18[(var6_45 - 4 >> 2) * 4 + (var6_45 - 4 & 3)] ^ var7_50;
                    ++var6_45;
                }
                return;
            }
            case 7: {
                var2_9 = lt.T;
                var3_19 = new BigInteger("10001", 16);
                var4_30 = new BigInteger("1g74ly4z0l14r", 36);
                var5_39 = new BigInteger("kd8l7i1pnw5m", 36);
                var6_46 = new BigInteger("vzmim1wmsj3d", 36);
                var7_51 = new BigInteger("1tka70ie92ze8", 36);
                var8_55 = 0;
                do {
                    if (var8_55 >= 4) {
                        v1 = (int[])lt.q[6];
                        v1[0] = v1[0] ^ var7_51.intValue();
                        return;
                    }
                    for (var9_59 = 0; var9_59 < 8; ++var9_59) {
                        var7_51 = var7_51.add(var5_39).xor(var6_46).modPow(var3_19, var4_30);
                    }
                    var9_58 = var2_9;
                    // MONITORENTER : var9_58
                    while (var2_9[0] == null) {
                        var2_9.wait(5000);
                    }
                    var5_39 = var5_39.xor(var2_9[0]);
                    var2_9[0] = null;
                    // MONITOREXIT : var9_58
                    ++var8_55;
                } while (true);
            }
            case 8: {
                var2_10 = lt.T;
                var3_20 = new BigInteger("10001", 16);
                var4_31 = new BigInteger("183jjaetc75tk", 36);
                var5_40 = new BigInteger("9kw1sk23687m", 36);
                var6_47 = new BigInteger("jl8hq6rakejr", 36);
                var7_52 = new BigInteger("6m2nh9y5ctqq", 36);
                for (var8_56 = 0; var8_56 < 4; ++var8_56) {
                    for (var9_61 = 0; var9_61 < 8; ++var9_61) {
                        var7_52 = var7_52.add(var5_40).xor(var6_47).modPow(var3_20, var4_31);
                    }
                    do {
                        Thread.yield();
                        var9_60 = var2_10;
                        // MONITORENTER : var9_60
                        if (var2_10[0] == null) break;
                        var2_10.notifyAll();
                        // MONITOREXIT : var9_60
                    } while (true);
                    var2_10[0] = var7_52;
                    var2_10.notifyAll();
                    // MONITOREXIT : var9_60
                }
                v2 = (int[])lt.q[6];
                v2[1] = v2[1] ^ var7_52.intValue();
                break;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final int p(int n, int n2) {
        int n3 = 0;
        int n4 = n;
        int n5 = n2;
        int n6 = n5 + n4 >> 24;
        n3 = 0;
        if (n3 == 0) {
            n3 = 3;
            return n >>> n2 | n << - n2;
        }
        Object var1_2 = null;
        n3 = 0;
        if (n3 != 0) return n5;
        ++n3;
        return n4 + n6;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final int q(byte[] arrby, int n) {
        int n2 = 0;
        int n3 = arrby[10] << 16;
        n2 = 0;
        if (n2 == 0) {
            n2 = 3;
            return arrby[n & 255] & 255 | (arrby[n >> 8 & 255] & 255) << 8 | (arrby[n >> 16 & 255] & 255) << 16 | arrby[n >> 24 & 255] << 24;
        }
        Object var3_4 = null;
        n2 = 0;
        if (n2 != 0) return n3;
        n2 = 2;
        return arrby[n & 127] >> 8;
    }

    private static final void x579() {
        lt.a(0, null);
        lt.i();
        lt lt2 = new lt(1);
        lt2.start();
        lt2.join();
        lt lt3 = new lt(3);
        lt3.start();
        lt lt4 = new lt(4);
        lt4.start();
        lt3.join();
        lt4.join();
        lt lt5 = new lt(7);
        lt lt6 = new lt(8);
        lt5.start();
        lt6.start();
        lt5.join();
        lt6.join();
    }

    /*
     * Exception decompiling
     */
    private static final void i() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.IllegalStateException: Backjump on non jumping statement [3] lbl27 : TryStatement: try { 2[TRYBLOCK]

        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:44)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:22)
        // org.benf.cfr.reader.util.graph.GraphVisitorDFS.process(GraphVisitorDFS.java:68)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner.removeUnreachableCode(Cleaner.java:54)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.RemoveDeterministicJumps.apply(RemoveDeterministicJumps.java:35)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static final String d(Object arrc) {
        boolean bl = false;
        int n = 0;
        if (q == null) {
            lt.x579();
        }
        StackTraceElement[] arrstackTraceElement = Thread.currentThread().getStackTrace();
        StringBuilder stringBuilder = new StringBuilder();
        String string = arrstackTraceElement[(Integer)q[7]].getClassName();
        stringBuilder = stringBuilder.append(string);
        string = arrstackTraceElement[(Integer)q[7]].getMethodName();
        int n2 = stringBuilder.append(string).toString().hashCode();
        int[] arrn = (int[])q[6];
        int n3 = n2 ^ arrn[0];
        int n4 = n2 ^ arrn[1];
        int n5 = n2 ^ arrn[2];
        int n6 = n2 ^ arrn[3];
        int[] arrn2 = (int[])q[5];
        int[] arrn3 = (int[])q[1];
        int[] arrn4 = (int[])q[2];
        int[] arrn5 = (int[])q[3];
        int[] arrn6 = (int[])q[4];
        byte[] arrby = (byte[])q[0];
        arrc = ((String)arrc).toCharArray();
        n = 0;
        if (n != 0) {
            return new String(arrc);
        }
        ++n;
        int n7 = arrc.length;
        int n8 = 0;
        while (n8 < n7) {
            if (n8 % 8 == 0) {
                int n9;
                int n10;
                int n11;
                int n12 = 0;
                n12 = 0;
                n12 = 0;
                n12 = 0;
                int n13 = n3 ^ arrn2[0];
                int n14 = n4 ^ arrn2[1];
                int n15 = n5 ^ arrn2[2];
                int n16 = n6 ^ arrn2[3];
                for (n12 = 4; n12 < 36; n12 += 4) {
                    n10 = arrn3[n13 & 255] ^ arrn4[n14 >> 8 & 255] ^ arrn5[n15 >> 16 & 255] ^ arrn6[n16 >>> 24] ^ arrn2[n12];
                    n11 = arrn3[n14 & 255] ^ arrn4[n15 >> 8 & 255] ^ arrn5[n16 >> 16 & 255] ^ arrn6[n13 >>> 24] ^ arrn2[n12 + 1];
                    n9 = arrn3[n15 & 255] ^ arrn4[n16 >> 8 & 255] ^ arrn5[n13 >> 16 & 255] ^ arrn6[n14 >>> 24] ^ arrn2[n12 + 2];
                    n16 = arrn3[n16 & 255] ^ arrn4[n13 >> 8 & 255] ^ arrn5[n14 >> 16 & 255] ^ arrn6[n15 >>> 24] ^ arrn2[n12 + 3];
                    n13 = arrn3[n10 & 255] ^ arrn4[n11 >> 8 & 255] ^ arrn5[n9 >> 16 & 255] ^ arrn6[n16 >>> 24] ^ arrn2[n12 += 4];
                    n14 = arrn3[n11 & 255] ^ arrn4[n9 >> 8 & 255] ^ arrn5[n16 >> 16 & 255] ^ arrn6[n10 >>> 24] ^ arrn2[n12 + 1];
                    n15 = arrn3[n9 & 255] ^ arrn4[n16 >> 8 & 255] ^ arrn5[n10 >> 16 & 255] ^ arrn6[n11 >>> 24] ^ arrn2[n12 + 2];
                    n16 = arrn3[n16 & 255] ^ arrn4[n10 >> 8 & 255] ^ arrn5[n11 >> 16 & 255] ^ arrn6[n9 >>> 24] ^ arrn2[n12 + 3];
                }
                n9 = arrn3[n13 & 255] ^ arrn4[n14 >> 8 & 255] ^ arrn5[n15 >> 16 & 255] ^ arrn6[n16 >>> 24] ^ arrn2[n12];
                n11 = arrn3[n14 & 255] ^ arrn4[n15 >> 8 & 255] ^ arrn5[n16 >> 16 & 255] ^ arrn6[n13 >>> 24] ^ arrn2[n12 + 1];
                n10 = arrn3[n15 & 255] ^ arrn4[n16 >> 8 & 255] ^ arrn5[n13 >> 16 & 255] ^ arrn6[n14 >>> 24] ^ arrn2[n12 + 2];
                n16 = arrn3[n16 & 255] ^ arrn4[n13 >> 8 & 255] ^ arrn5[n14 >> 16 & 255] ^ arrn6[n15 >>> 24] ^ arrn2[n12 + 3];
                n15 = n12 + 4;
                n3 = arrby[n9 & 255] & 255 ^ (arrby[n11 >> 8 & 255] & 255) << 8 ^ (arrby[n10 >> 16 & 255] & 255) << 16 ^ arrby[n16 >>> 24] << 24 ^ arrn2[n15 + 0];
                n4 = arrby[n11 & 255] & 255 ^ (arrby[n10 >> 8 & 255] & 255) << 8 ^ (arrby[n16 >> 16 & 255] & 255) << 16 ^ arrby[n9 >>> 24] << 24 ^ arrn2[n15 + 1];
                n5 = arrby[n10 & 255] & 255 ^ (arrby[n16 >> 8 & 255] & 255) << 8 ^ (arrby[n9 >> 16 & 255] & 255) << 16 ^ arrby[n11 >>> 24] << 24 ^ arrn2[n15 + 2];
                n6 = arrby[n16 & 255] & 255 ^ (arrby[n9 >> 8 & 255] & 255) << 8 ^ (arrby[n11 >> 16 & 255] & 255) << 16 ^ arrby[n10 >>> 24] << 24 ^ arrn2[n15 + 3];
            }
            if (!(bl = false)) {
                bl = true;
                switch (n8 % 8) {
                    case 0: {
                        arrc[n8] = (char)(n3 >> 16 ^ arrc[n8]);
                        break;
                    }
                    case 1: {
                        arrc[n8] = (char)(n3 ^ arrc[n8]);
                        break;
                    }
                    case 2: {
                        arrc[n8] = (char)(n4 >> 16 ^ arrc[n8]);
                        break;
                    }
                    case 3: {
                        arrc[n8] = (char)(n4 ^ arrc[n8]);
                        break;
                    }
                    case 4: {
                        arrc[n8] = (char)(n5 >> 16 ^ arrc[n8]);
                        break;
                    }
                    case 5: {
                        arrc[n8] = (char)(n5 ^ arrc[n8]);
                        break;
                    }
                    case 6: {
                        arrc[n8] = (char)(n6 >> 16 ^ arrc[n8]);
                        break;
                    }
                    case 7: {
                        arrc[n8] = (char)(n6 ^ arrc[n8]);
                    }
                }
            } else {
                Object var13_5 = null;
            }
            ++n8;
        }
        return new String(arrc);
    }
}


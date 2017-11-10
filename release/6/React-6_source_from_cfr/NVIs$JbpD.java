/*
 * Decompiled with CFR 0_123.
 */
import java.math.BigInteger;

public class NVIs$JbpD
extends Thread {
    private static volatile Object[] T;
    private final int q;
    private static final BigInteger[] X;

    NVIs$JbpD(int n) {
        this.q = n;
    }

    static {
        X = new BigInteger[1];
    }

    public void run() {
        NVIs$JbpD.H(this.q, null);
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
    private static final void H(int var0, Object var1_1) {
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
                NVIs$JbpD.T = v0;
                return;
            }
            case 1: {
                var2_3 = new int[256];
                var3_12 = 0;
                var4_22 = 1;
                do {
                    if (var3_12 >= 256) {
                        NVIs$JbpD.H(2, var2_3);
                        return;
                    }
                    var2_3[var3_12] = var4_22;
                    var4_22 ^= var4_22 << 1 ^ (var4_22 >>> 7) * 283;
                    ++var3_12;
                } while (true);
            }
            case 2: {
                var2_4 = (byte[])NVIs$JbpD.T[0];
                var2_4[0] = 99;
                var3_13 = (int[])var1_1;
                for (var4_23 = 0; var4_23 < 255; var5_33 ^= var5_33 >> 4 ^ var5_33 >> 5 ^ var5_33 >> 6 ^ var5_33 >> 7, ++var4_23) {
                    var5_33 = var3_13[255 - var4_23];
                    var5_33 |= var5_33 << 8;
                    var2_4[var3_13[var4_23]] = (byte)(var5_33 ^ 99);
                }
                var4_24 = (int[])NVIs$JbpD.T[1];
                var5_34 = (int[])NVIs$JbpD.T[2];
                var6_42 = (int[])NVIs$JbpD.T[3];
                var7_48 = (int[])NVIs$JbpD.T[4];
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
                var2_5 = "\u088b\u4dcf\u58d3\u09a4\u2a5e\ud65b\ubaf1\u3145\uf79b\udc99\uf02f\ua9a8\u387c\u5fdb\uf1f0\uf822\uf92b\u3617\udf20\u143f\u2ca4\ueb07\ua8e1\ue627\u861e\u44b1\uc3c8\u7712\u30e2\ub5db\u1a79\u0dd4\ua98d\u423f\ucd76\u1204\uc1a0\ueea4\u1c77\u39cf\u6c63\uc703\ua857\u2e6d\u76c5\u33a1\u9014\u876e\u23a9\u37c0\u48b6\u4107\u3baa\ufa92\u4042\uef11\ue784\u6217\ue5af\u38fc\u51c0\u7f03\u2e21\u7a60\uea2a\u2b86\u7cb8\ua3e3\u77e2\u0279\u3136\ueeaf\ufd83\u21ca\u23f4\u6858\u1ead\u5767\u2f81\u0304\uc5c0\u036b\uef92\u5dcb\u798a\u5610\uf6e7\u832f\u414d\u4a55\u5f9b\ufe7e\u0b86\u1f5b\u5078\u5b6c\u51cb\ucbd1\u8242\u9135\u4168\udd8e\u4d5f\u58da\u1907\u8630\ua442\ue23b\u3bf6\ue946\u1e25\uc742\u175e\u95fb\uac2e\u5ec5\u1529\ubf14\u6776\u9a78\uec61\u5427\u8bd4\ue232\u4402\uf08d\u658b\udede".toCharArray();
                var3_14 = new byte[var2_5.length * 2];
                for (var4_25 = 0; var4_25 < var2_5.length; ++var4_25) {
                    var3_14[var4_25 * 2] = (byte)(var2_5[var4_25] & 255);
                    var3_14[var4_25 * 2 + 1] = (byte)((var2_5[var4_25] & 65280) >> 8);
                }
                var2_5 = "\u5fa6\ucb37\u4b4f\uc726\ucc20\u39e4\u1341\u6ba5\u3f40\uc843\u448d\uf7ee\u5afc\uc75b\uee19\ucba8\u6971\u51cf\u0f4d\u2914\u9811\u698b\u06b9\u4125\u0bee\u86bf\u96f6\ub7ce\u7a82\u4d2d\ua5ca\u9adc\u9d72\u8736\uad3e\uacd3\u7dab\u175d\u2b6a\u9d7d\u56f6\uec5e\u455f\ue492\u26be\u357e\uef2a\u91ab\ua467\uda61\u063d\u947a\u595d\udbe7\uaacb\uc3e1\u7133\uadfe\uc990\ub4d7\u9106\u901a\u2c0f\u5847\u4a63\u3a1e\u1745\ua7db\u169b\u6309\u64e3\u4feb\ue608\u37cb\ua50f\u0912\u190c\u26af\u08a6\u135d\ubf2f\u1fcf\u478e\u55ba\uac51\u16e0\ue544\ub92c\ubb62\u69e0\u569c\ucb4e\ufe93\ub81a\u80a2\u8ebc\uc2fa\u8457\u196a\uae1a\u1a98\u687d\ude88\u4494\u7f10\ua899\u874a\u99ee\uba0d\uec05\ub5c4\udd01\uf2e2\udb43\u36fb\u92cb\u7786\uf04a\ue469\u6890\uc746\u986d\uc58d\uf7c6\uf465\ud17a\u66bf\u8ce5".toCharArray();
                var4_26 = new byte[var2_5.length * 2];
                for (var5_35 = 0; var5_35 < var2_5.length; ++var5_35) {
                    var4_26[var5_35 * 2] = (byte)(var2_5[var5_35] & 255);
                    var4_26[var5_35 * 2 + 1] = (byte)((var2_5[var5_35] & 65280) >> 8);
                }
                var5_36 = new byte[16];
                try {
                    var5_36[0] = var3_14[var4_26[185] & 255];
                    var5_36[1] = var3_14[var4_26[18] & 255];
                    var5_36[2] = var3_14[var4_26[227] & 255];
                    var5_36[3] = var3_14[var4_26[21] & 255];
                    var5_36[4] = var3_14[var4_26[236] & 255];
                    var5_36[5] = var3_14[var4_26[196] & 255];
                    var5_36[6] = var3_14[var4_26[54] & 255];
                    var5_36[7] = var3_14[var4_26[191] & 255];
                    ** GOTO lbl91
                }
                catch (Exception var6_43) {}
                ** GOTO lbl91
                finally {
                    var5_36[8] = var3_14[var4_26[20] & 255];
                    var5_36[9] = var3_14[var4_26[71] & 255];
                    var5_36[10] = var3_14[var4_26[255] & 255];
                    var5_36[11] = var3_14[var4_26[156] & 255];
                    var5_36[12] = var3_14[var4_26[87] & 255];
                    var5_36[13] = var3_14[var4_26[97] & 255];
                    var5_36[14] = var3_14[var4_26[224] & 255];
                    var5_36[15] = var3_14[var4_26[170] & 255];
                }
lbl91: // 2 sources:
                NVIs$JbpD.H(5, var5_36);
                return;
            }
            case 4: {
                var2_6 = new int[]{-485374046, -823798272, 553439697, -74908265};
                var3_15 = 0 ^ Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 1;
                var2_6[2] = var2_6[2] ^ (int)var3_15;
                NVIs$JbpD.T[6] = var2_6;
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
                NVIs$JbpD.T[5] = var6_44;
                NVIs$JbpD.H(6, null);
                return;
            }
            case 6: {
                var2_8 = new int[30];
                var4_28 = 1;
                for (var3_17 = 0; var3_17 < 30; ++var3_17) {
                    var2_8[var3_17] = var4_28;
                    var4_28 = var4_28 << 1 ^ (var4_28 >>> 7) * 283;
                }
                var3_18 = (int[])NVIs$JbpD.T[5];
                var4_29 = (byte[])NVIs$JbpD.T[0];
                var5_38 = 44;
                var6_45 = 4;
                while (var6_45 < var5_38) {
                    var7_50 = var3_18[(var6_45 - 1 >> 2) * 4 + (var6_45 - 1 & 3)];
                    if (var6_45 % 4 == 0) {
                        var7_50 = NVIs$JbpD.T(var4_29, NVIs$JbpD.V(var7_50, 8)) ^ var2_8[var6_45 / 4 - 1];
                    }
                    var3_18[(var6_45 >> 2) * 4 + (var6_45 & 3)] = var3_18[(var6_45 - 4 >> 2) * 4 + (var6_45 - 4 & 3)] ^ var7_50;
                    ++var6_45;
                }
                return;
            }
            case 7: {
                var2_9 = NVIs$JbpD.X;
                var3_19 = new BigInteger("10001", 16);
                var4_30 = new BigInteger("vzc08nrfsvp0", 36);
                var5_39 = new BigInteger("1edn3sqpe6r48", 36);
                var6_46 = new BigInteger("1f7or8sfsk9s0", 36);
                var7_51 = new BigInteger("wj2hh9jsy6v1", 36);
                var8_55 = 0;
                do {
                    if (var8_55 >= 4) {
                        v1 = (int[])NVIs$JbpD.T[6];
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
                var2_10 = NVIs$JbpD.X;
                var3_20 = new BigInteger("10001", 16);
                var4_31 = new BigInteger("1q3r4j4eg1xka", 36);
                var5_40 = new BigInteger("1mw5df1qepnak", 36);
                var6_47 = new BigInteger("1vfs9hjmlep4g", 36);
                var7_52 = new BigInteger("kd3gi3rajk42", 36);
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
                v2 = (int[])NVIs$JbpD.T[6];
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
    private static final int V(int n, int n2) {
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
    private static final int T(byte[] arrby, int n) {
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

    private static final void q7437() {
        NVIs$JbpD.H(0, null);
        NVIs$JbpD.Q();
        NVIs$JbpD nVIs$JbpD = new NVIs$JbpD(1);
        nVIs$JbpD.start();
        nVIs$JbpD.join();
        NVIs$JbpD nVIs$JbpD2 = new NVIs$JbpD(3);
        nVIs$JbpD2.start();
        NVIs$JbpD nVIs$JbpD3 = new NVIs$JbpD(4);
        nVIs$JbpD3.start();
        nVIs$JbpD2.join();
        nVIs$JbpD3.join();
        NVIs$JbpD nVIs$JbpD4 = new NVIs$JbpD(7);
        NVIs$JbpD nVIs$JbpD5 = new NVIs$JbpD(8);
        nVIs$JbpD4.start();
        nVIs$JbpD5.start();
        nVIs$JbpD4.join();
        nVIs$JbpD5.join();
    }

    /*
     * Exception decompiling
     */
    private static final void Q() {
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
    static final String H(Object arrc) {
        boolean bl = false;
        int n = 0;
        if (T == null) {
            NVIs$JbpD.q7437();
        }
        StackTraceElement[] arrstackTraceElement = Thread.currentThread().getStackTrace();
        StringBuilder stringBuilder = new StringBuilder();
        String string = arrstackTraceElement[(Integer)T[7]].getClassName();
        stringBuilder = stringBuilder.append(string);
        string = arrstackTraceElement[(Integer)T[7]].getMethodName();
        int n2 = stringBuilder.append(string).toString().hashCode();
        int[] arrn = (int[])T[6];
        int n3 = n2 ^ arrn[0];
        int n4 = n2 ^ arrn[1];
        int n5 = n2 ^ arrn[2];
        int n6 = n2 ^ arrn[3];
        int[] arrn2 = (int[])T[5];
        int[] arrn3 = (int[])T[1];
        int[] arrn4 = (int[])T[2];
        int[] arrn5 = (int[])T[3];
        int[] arrn6 = (int[])T[4];
        byte[] arrby = (byte[])T[0];
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


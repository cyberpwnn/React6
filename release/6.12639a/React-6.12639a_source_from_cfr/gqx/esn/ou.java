/*
 * Decompiled with CFR 0_123.
 */
package gqx.esn;

import java.math.BigInteger;

public class ou
extends Thread {
    private static volatile Object[] I;
    private final int w;
    private static final BigInteger[] V;

    ou(int n) {
        this.w = n;
    }

    static {
        V = new BigInteger[1];
    }

    public void run() {
        ou.v(this.w, null);
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
    private static final void v(int var0, Object var1_1) {
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
                ou.I = v0;
                return;
            }
            case 1: {
                var2_3 = new int[256];
                var3_12 = 0;
                var4_22 = 1;
                do {
                    if (var3_12 >= 256) {
                        ou.v(2, var2_3);
                        return;
                    }
                    var2_3[var3_12] = var4_22;
                    var4_22 ^= var4_22 << 1 ^ (var4_22 >>> 7) * 283;
                    ++var3_12;
                } while (true);
            }
            case 2: {
                var2_4 = (byte[])ou.I[0];
                var2_4[0] = 99;
                var3_13 = (int[])var1_1;
                for (var4_23 = 0; var4_23 < 255; var5_33 ^= var5_33 >> 4 ^ var5_33 >> 5 ^ var5_33 >> 6 ^ var5_33 >> 7, ++var4_23) {
                    var5_33 = var3_13[255 - var4_23];
                    var5_33 |= var5_33 << 8;
                    var2_4[var3_13[var4_23]] = (byte)(var5_33 ^ 99);
                }
                var4_24 = (int[])ou.I[1];
                var5_34 = (int[])ou.I[2];
                var6_42 = (int[])ou.I[3];
                var7_48 = (int[])ou.I[4];
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
                var2_5 = "\ude52\u9b16\u8e0a\udf7d\u344a\u3e77\u85d8\u209c\ud6e8\u6835\u2c3b\u06af\ueb67\u819b\u4b7b\u7be6\ubd7d\u5a3e\u62a5\u800f\u0288\u5558\u923b\u37e6\u6e4d\u3e23\udddc\u9f3e\u0fcb\ua402\u3b0a\ub978\u7599\ued38\u1e6d\ucc44\ud376\u93c7\u2a44\ua667\u64e1\u5aa1\u2e62\u72c0\u3327\u7c72\u7a99\ufcc2\u7c96\uaf9b\uf835\uf26c\ucf17\u121f\ucab9\uac18\u953c\u4cc5\u9771\u557f\ub132\ud82b\u8d93\u16e3\ufab2\u55b7\uab07\ub4ba\u9883\u71bb\u9b24\ucf6c\ub16c\uf435\u0d8d\u055b\u1885\u3d8f\u4f4b\u8622\ud641\u3305\u1a3f\u0506\u63e1\uaf29\uc209\u2b8f\u3c2a\uaab6\ub5e6\u4b31\u29da\u7260\u2b03\u38d1\uf17a\ued1f\u8567\u8fdd\uc245\u22b5\u1676\u0174\u467c\u61d0\udf44\ueba0\uef41\u32a6\ubb3e\ua908\ubc92\ud820\ue1d6\u4c43\u3c07\u6c02\uc355\u78cc\u87a8\uc3c4\u68f8\u4b6e\ua783\u1fe0\ub473\u5900".toCharArray();
                var3_14 = new byte[var2_5.length * 2];
                for (var4_25 = 0; var4_25 < var2_5.length; ++var4_25) {
                    var3_14[var4_25 * 2] = (byte)(var2_5[var4_25] & 255);
                    var3_14[var4_25 * 2 + 1] = (byte)((var2_5[var4_25] & 65280) >> 8);
                }
                var2_5 = "\u6605\u3c1b\ua3b0\u395d\uf8c4\uafdb\u0cf7\ub7b4\ue6d5\u067c\u53ee\u530a\uebf0\uac5d\ufb97\ud439\u3354\uff67\u7bab\u8927\uf969\u1b32\u8518\u537e\uaab8\u20cb\u9f3f\u6ca3\u746b\u0a8c\u30fb\u8fe7\u08a6\u0923\ub86d\u97ef\u1841\u0973\u6bb3\udf63\u6ac2\ua768\u8b17\u2f6d\u34ac\ufc74\u39d3\u1ade\u25e7\u9241\uaca1\uf47c\u1956\u4859\ub9c0\ufccb\u9849\u9e57\u8705\u4299\uff32\u208b\u0922\u56a3\ude59\ue1dd\u867a\u418f\u7456\u51cf\u5ec6\u6c73\uc57c\ud36f\ube82\u802b\u7a46\u882d\u0a46\u1728\ubae2\u91b0\u4521\u37e3\u478c\u23ca\ud986\u8713\uc54b\u624d\u73d2\u77a3\u914d\ufe8a\ue1cc\u8256\u07ab\u2617\ua8b8\u5ca0\u26d1\ucc4c\ue10b\u00cd\ued03\u13a8\u01b2\u9f96\u4055\u79d5\u5115\u8264\u7f03\u749d\u134d\u6d42\u8036\ubebc\u9b18\uc5e9\u9ba0\u49a2\u7b9e\u1cf2\u231d\ub2df\uc360\u42f7".toCharArray();
                var4_26 = new byte[var2_5.length * 2];
                for (var5_35 = 0; var5_35 < var2_5.length; ++var5_35) {
                    var4_26[var5_35 * 2] = (byte)(var2_5[var5_35] & 255);
                    var4_26[var5_35 * 2 + 1] = (byte)((var2_5[var5_35] & 65280) >> 8);
                }
                var5_36 = new byte[16];
                try {
                    var5_36[0] = var3_14[var4_26[226] & 255];
                    var5_36[1] = var3_14[var4_26[255] & 255];
                    var5_36[2] = var3_14[var4_26[234] & 255];
                    var5_36[3] = var3_14[var4_26[60] & 255];
                    var5_36[4] = var3_14[var4_26[165] & 255];
                    var5_36[5] = var3_14[var4_26[38] & 255];
                    var5_36[6] = var3_14[var4_26[254] & 255];
                    var5_36[7] = var3_14[var4_26[103] & 255];
                    ** GOTO lbl91
                }
                catch (Exception var6_43) {}
                ** GOTO lbl91
                finally {
                    var5_36[8] = var3_14[var4_26[143] & 255];
                    var5_36[9] = var3_14[var4_26[74] & 255];
                    var5_36[10] = var3_14[var4_26[50] & 255];
                    var5_36[11] = var3_14[var4_26[25] & 255];
                    var5_36[12] = var3_14[var4_26[190] & 255];
                    var5_36[13] = var3_14[var4_26[232] & 255];
                    var5_36[14] = var3_14[var4_26[18] & 255];
                    var5_36[15] = var3_14[var4_26[240] & 255];
                }
lbl91: // 2 sources:
                ou.v(5, var5_36);
                return;
            }
            case 4: {
                var2_6 = new int[]{-1891918443, 1330966997, -976536213, -1887130641};
                var3_15 = 0 ^ Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 1;
                var2_6[2] = var2_6[2] ^ (int)var3_15;
                ou.I[6] = var2_6;
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
                ou.I[5] = var6_44;
                ou.v(6, null);
                return;
            }
            case 6: {
                var2_8 = new int[30];
                var4_28 = 1;
                for (var3_17 = 0; var3_17 < 30; ++var3_17) {
                    var2_8[var3_17] = var4_28;
                    var4_28 = var4_28 << 1 ^ (var4_28 >>> 7) * 283;
                }
                var3_18 = (int[])ou.I[5];
                var4_29 = (byte[])ou.I[0];
                var5_38 = 44;
                var6_45 = 4;
                while (var6_45 < var5_38) {
                    var7_50 = var3_18[(var6_45 - 1 >> 2) * 4 + (var6_45 - 1 & 3)];
                    if (var6_45 % 4 == 0) {
                        var7_50 = ou.A(var4_29, ou.T(var7_50, 8)) ^ var2_8[var6_45 / 4 - 1];
                    }
                    var3_18[(var6_45 >> 2) * 4 + (var6_45 & 3)] = var3_18[(var6_45 - 4 >> 2) * 4 + (var6_45 - 4 & 3)] ^ var7_50;
                    ++var6_45;
                }
                return;
            }
            case 7: {
                var2_9 = ou.V;
                var3_19 = new BigInteger("10001", 16);
                var4_30 = new BigInteger("18wlpep0dn64", 36);
                var5_39 = new BigInteger("1ll6xoutkm34t", 36);
                var6_46 = new BigInteger("wb1bvearcwu5", 36);
                var7_51 = new BigInteger("qlfmwlr7jxx", 36);
                var8_55 = 0;
                do {
                    if (var8_55 >= 4) {
                        v1 = (int[])ou.I[6];
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
                var2_10 = ou.V;
                var3_20 = new BigInteger("10001", 16);
                var4_31 = new BigInteger("gjnfcwuvmj0p", 36);
                var5_40 = new BigInteger("e4hi0g7qbaim", 36);
                var6_47 = new BigInteger("1dgpqf9mv7yhw", 36);
                var7_52 = new BigInteger("objwp0rttatu", 36);
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
                v2 = (int[])ou.I[6];
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
    private static final int T(int n, int n2) {
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
    private static final int A(byte[] arrby, int n) {
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

    private static final void D8656() {
        ou.v(0, null);
        ou.n();
        ou ou2 = new ou(1);
        ou2.start();
        ou2.join();
        ou ou3 = new ou(3);
        ou3.start();
        ou ou4 = new ou(4);
        ou4.start();
        ou3.join();
        ou4.join();
        ou ou5 = new ou(7);
        ou ou6 = new ou(8);
        ou5.start();
        ou6.start();
        ou5.join();
        ou6.join();
    }

    /*
     * Exception decompiling
     */
    private static final void n() {
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
    static final String n(Object arrc) {
        boolean bl = false;
        int n = 0;
        if (I == null) {
            ou.D8656();
        }
        StackTraceElement[] arrstackTraceElement = Thread.currentThread().getStackTrace();
        StringBuilder stringBuilder = new StringBuilder();
        String string = arrstackTraceElement[(Integer)I[7]].getClassName();
        stringBuilder = stringBuilder.append(string);
        string = arrstackTraceElement[(Integer)I[7]].getMethodName();
        int n2 = stringBuilder.append(string).toString().hashCode();
        int[] arrn = (int[])I[6];
        int n3 = n2 ^ arrn[0];
        int n4 = n2 ^ arrn[1];
        int n5 = n2 ^ arrn[2];
        int n6 = n2 ^ arrn[3];
        int[] arrn2 = (int[])I[5];
        int[] arrn3 = (int[])I[1];
        int[] arrn4 = (int[])I[2];
        int[] arrn5 = (int[])I[3];
        int[] arrn6 = (int[])I[4];
        byte[] arrby = (byte[])I[0];
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


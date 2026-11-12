/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerJoinEvent
 *  org.bukkit.event.player.PlayerQuitEvent
 */
package Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii;

import Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public final class IlIlllIlilIl
implements Listener {
    static AtomicReferenceArray<MethodHandle> iIlIlllllill;
    private IliIlllilIi IliIlllilIi;
    public static int[] IilliliilIIi;
    public static int lIiiIiIlilli;
    public static boolean iliIiiliiiii;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String IlIlllIlilIl(String var0, int var1_1, int var2_2) {
        if (IlIlllIlilIl.iliIiiliiiii) {
        }
        var10_5 = new Object[7];
        var10_5[0] = Base64.getDecoder().decode(var0);
        var10_5[5] = IlIlllIlilIl.IilliliilIIi[78];
        if (true) ** GOTO lbl11
        while (true) {
            var9_4 + -327292973;
            {
                var10_5[5] = (Integer)var10_5[5] + 1;
lbl11:
                // 2 sources

                if ((Integer)var10_5[5] >= ((byte[])var10_5[0]).length) {
                    v0((byte[])var10_5[0], StandardCharsets.UTF_8);
                    return v0;
                }
                var8_3 = (1751085734 | -1621824747) - (1751085734 & -1621824747);
                v1 = var8_3;
                switch (v1 + -1621824747 - (v1 & -1621824747) * 2) {
                    default: {
                        break;
                    }
                    case 1207238381: 
                }
                ** try [egrp 2[TRYBLOCK] [1, 3 : 183->422)] { 
lbl23:
                // 1 sources

                v2 = (byte[])var10_5[0];
                v3 = (Integer)var10_5[5];
                var10_5[3] = (int)((Integer)var10_5[5]);
                var10_5[2] = var1_1;
                var10_5[3] = (Integer)var10_5[2] + ~((Integer)var10_5[3]).intValue() + 1;
                var10_5[2] = (int)v2[v3];
                var10_5[3] = var2_2;
                var10_5[2] = ((Integer)var10_5[2] | (Integer)var10_5[3]) & ~((Integer)var10_5[2] & (Integer)var10_5[3]);
                v2[v3] = (byte)(((Integer)var10_5[2] ^ (Integer)var10_5[3]) - 2 * (~((Integer)var10_5[2]).intValue() & (Integer)var10_5[3]));
                var9_4 = (730727003 | -327292973) - (730727003 & -327292973);
                continue;
            }
lbl35:
            // 1 sources

            catch (CloneNotSupportedException v4) {
                throw v4;
            }
lbl37:
            // 1 sources

            catch (ThreadDeath v5) {
                throw v5;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n;
        int n2 = n = (0x451EF43E | 0x24A216C3) - (0x451EF43E & 0x24A216C3);
        lIiiIiIlilli = n2 + 614602435 - (n2 & 0x24A216C3) * 2;
        if (1230617162 <= lIiiIiIlilli) {
            int n3 = n = (0x3D | 0x24A216C3) - (0x3D & 0x24A216C3);
            int cfr_ignored_0 = n3 + 614602435 - (n3 & 0x24A216C3) * 2;
        }
        IlIlllIlilIl.IiIlliIliiIl();
        IlIlllIlilIl.iliIiiliiiii("ecb2c6ef-afd4-40ca-91a3-fc2d2d965769", IlIlllIlilIl.class, (String)"kri5rk+Ji4aBgYp2Rlh7RUJDX0FhQJ5dRURHZmlXVGpSkU9ublBsbWpraHZmZ6ZafWNgfn5gY31FRGe7dkhrak1sT3ERDwwSyBQIFjkYGwUdHB8eAd0jHSUbGBkpFwsVLRM=", (String)"sahysUVGU0yMjIOCjIVBTkpDV0xXXFifRVlQQlBVQ1WQd1BGYXRqVX1jfw==", (String)"dEJOR0Uz", (int)IilliliilIIi[42], (String)"sranqWRM", (int)IilliliilIIi[43], (int)IilliliilIIi[44], (int)IilliliilIIi[45], (String)"bpOupkRYiU1dSVWMf0dTTEtyn2s=", (int)IilliliilIIi[46]);
    }

    /*
     * Exception decompiling
     */
    public static void IiIlliIliiIl() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [29[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle IIIllIIliIIl(String var0, String var1_1, String var2_2, int var3_3, String var4_4, int var5_5, int var6_6, int var7_7, String var8_8, int var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [37[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public static Class IilliliilIIi(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [35[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    public void onJoin(PlayerJoinEvent playerJoinEvent) {
        Object[] objectArray = new Object[40];
        int n = (0x7A331D06 | 0x124E2383) - (0x7A331D06 & 0x124E2383);
        int cfr_ignored_0 = n + 307110787;
        objectArray[39] = IilliliilIIi[14];
        objectArray[22] = IilliliilIIi[15];
        objectArray[6] = (int)((Integer)objectArray[39]);
        objectArray[39] = ((Integer)objectArray[6] ^ (Integer)objectArray[22]) + 2 * ((Integer)objectArray[6] & (Integer)objectArray[22]);
        objectArray[22] = IilliliilIIi[16];
        objectArray[6] = (int)((Integer)objectArray[39]);
        objectArray[39] = (Integer)objectArray[6] & ~((Integer)objectArray[22]).intValue() | ~((Integer)objectArray[6]).intValue() & (Integer)objectArray[22];
        Object[] objectArray2 = new Object[((Integer)objectArray[39]).intValue()];
        objectArray[34] = IilliliilIIi[17];
        objectArray[22] = IilliliilIIi[18];
        objectArray[6] = (int)((Integer)objectArray[34]);
        objectArray[34] = ((Integer)objectArray[6] | (Integer)objectArray[22]) & ~((Integer)objectArray[6] & (Integer)objectArray[22]);
        objectArray[22] = IilliliilIIi[19];
        objectArray[6] = (int)((Integer)objectArray[34]);
        objectArray[34] = ((Integer)objectArray[6] | (Integer)objectArray[22]) & ~((Integer)objectArray[6] & (Integer)objectArray[22]);
        objectArray2[((Integer)objectArray[34]).intValue()] = this;
        objectArray[29] = IilliliilIIi[20];
        objectArray[22] = IilliliilIIi[21];
        objectArray[6] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[6] ^ (Integer)objectArray[22]) + 2 * ((Integer)objectArray[6] & (Integer)objectArray[22]);
        objectArray[22] = IilliliilIIi[22];
        objectArray[6] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[6] | (Integer)objectArray[22]) & (~((Integer)objectArray[6]).intValue() | ~((Integer)objectArray[22]).intValue());
        objectArray2[((Integer)objectArray[29]).intValue()] = playerJoinEvent;
        IlIlllIlilIl.iliIiiliiiii("f4f13eb9-5aa0-4fd8-b336-8728d1525a1d", (long)1890391306218149008L, (Object[])objectArray2, (String)"kLpHUE2LjYCDg4R4RFp9Q0BBQV9jQphbR0ZJaGtVUmxQk3FQbFJqa2hpZnhkZaBcf2F+YHxiZXtHRmm1dEptbE9uMQ8TDQoUyhYGGDsaHQMfHgEAA98lGycZFhcrFQ0TLxE=", (String)"s6qMT0dEVUqOjo2MjodHSEhBSVJVXl6ZR1teTFJXRVOSdW54Y3ZsU39hcQ==", (String)"RXhpRjVX", (int)IilliliilIIi[23], (String)"trpM", (int)IilliliilIIi[24], (int)IilliliilIIi[25], (int)IilliliilIIi[26], (String)"bI9fb1JaQFyNSVFFWYBnVV5aR1dtgnpFT1NBklRCUE6VdHhxd3RiWg==", (int)IilliliilIIi[27]);
    }

    /*
     * Exception decompiling
     */
    public static String lIiiIiIlilli(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [59[DOLOOP]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1_1, MethodType var2_2) {
        if (IlIlllIlilIl.iliIiiliiiii) {
            var23_3 = (-2105904788 | -1861506747) - (-2105904788 & -1861506747);
        }
        var21_9 = new Object[18];
        try {
            var21_9[17] = MethodHandles.lookup();
            var16_4 = (1050974110 | -175797088) - (1050974110 & -175797088);
        }
        catch (CloneNotSupportedException v0) {
            throw v0;
        }
        catch (UnsupportedClassVersionError v1) {
            throw v1;
        }
lbl14:
        // 1 sources

        while (true) {
            continue;
            break;
        }
        var16_4 + -175797088;
        var21_9[8] = ((MethodHandles.Lookup)var21_9[17]).findStatic(IlIlllIlilIl.class, "IIIllIIliIIl", MethodType.fromMethodDescriptorString("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;I)Ljava/lang/invoke/MethodHandle;", var0.lookupClass().getClassLoader()));
        var21_9[14] = var2_2.parameterCount();
        var17_5 = (-390859323 | -65508917) - (-390859323 & -65508917);
        ** while (true)
        var17_5 + -65508917;
        var21_9[2] = IlIlllIlilIl.IilliliilIIi[47];
        var21_9[16] = (int)((Integer)var21_9[14]);
        var21_9[5] = (Integer)var21_9[16] + ~((Integer)var21_9[2]).intValue() + 1;
        var21_9[10] = var2_2.dropParameterTypes((Integer)var21_9[5], (Integer)var21_9[14]);
        var21_9[13] = MethodHandles.invoker((MethodType)var21_9[10]);
        v2 = new Class[IlIlllIlilIl.IilliliilIIi[48]];
        v2[IlIlllIlilIl.IilliliilIIi[49]] = MethodHandle.class;
        var21_9[7] = ((MethodType)var21_9[10]).appendParameterTypes(v2);
        var18_6 = (-848825736 | 488085393) - (-848825736 & 488085393);
        var18_6 + 488085393;
        var21_9[2] = IlIlllIlilIl.IilliliilIIi[50];
        var21_9[16] = (int)((Integer)var21_9[5]);
        var21_9[15] = new int[(Integer)var21_9[16] - ~((Integer)var21_9[2]).intValue() - 1];
        ((int[])var21_9[15])[IlIlllIlilIl.IilliliilIIi[51]] = (Integer)var21_9[5];
        var19_7 = (1961104898 | -2130481892) - (1961104898 & -2130481892);
        var19_7 + -2130481892;
        var21_9[1] = IlIlllIlilIl.IilliliilIIi[52];
        while (true) {
            var21_9[2] = IlIlllIlilIl.IilliliilIIi[53];
            var21_9[16] = (int)((Integer)var21_9[5]);
            if ((Integer)var21_9[1] >= 2 * ((Integer)var21_9[16] | (Integer)var21_9[2]) - ((Integer)var21_9[16] ^ (Integer)var21_9[2])) lbl-1000:
            // 2 sources

            {
                while (true) {
                    var21_9[3] = MethodHandles.permuteArguments((MethodHandle)var21_9[13], (MethodType)var21_9[7], (int[])var21_9[15]);
                    var21_9[12] = MethodHandles.collectArguments((MethodHandle)var21_9[3], (Integer)var21_9[5], (MethodHandle)var21_9[8]);
                    return new ConstantCallSite((MethodHandle)var21_9[12]);
                }
            }
            var20_8 = (670100637 | 535586461) - (670100637 & 535586461);
            v3 = var20_8;
            switch (v3 + 535586461 - (v3 & 535586461) * 2) {
                case -2079362318: {
                    ** continue;
                }
            }
            var21_9[2] = IlIlllIlilIl.IilliliilIIi[54];
            var21_9[16] = (int)((Integer)var21_9[1]);
            ((int[])var21_9[15])[((Integer)var21_9[1]).intValue()] = ((Integer)var21_9[16] & ~((Integer)var21_9[2]).intValue()) - (~((Integer)var21_9[16]).intValue() & (Integer)var21_9[2]);
            var21_9[1] = (Integer)var21_9[1] + 1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public IlIlllIlilIl(IliIlllilIi iliIlllilIi) {
        int n;
        int n2 = n = (0x38F1C60C | 0xF40EB66A) - (0x38F1C60C & 0xF40EB66A);
        if (61510713 >= n2 + -200362390 - (n2 & 0xF40EB66A) * 2) {
            int cfr_ignored_0 = 0x34 & 1;
        }
        Object[] objectArray = new Object[28];
        objectArray[9] = IilliliilIIi[0];
        objectArray[3] = IilliliilIIi[1];
        objectArray[16] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[16] | (Integer)objectArray[3]) + ((Integer)objectArray[16] & (Integer)objectArray[3]);
        objectArray[3] = IilliliilIIi[2];
        objectArray[16] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[16] | (Integer)objectArray[3]) & ~((Integer)objectArray[16] & (Integer)objectArray[3]);
        Object[] objectArray2 = new Object[((Integer)objectArray[9]).intValue()];
        objectArray[15] = IilliliilIIi[3];
        objectArray[3] = IilliliilIIi[4];
        objectArray[16] = (int)((Integer)objectArray[15]);
        objectArray[15] = (Integer)objectArray[16] & ~((Integer)objectArray[3]).intValue() | ~((Integer)objectArray[16]).intValue() & (Integer)objectArray[3];
        objectArray[3] = IilliliilIIi[5];
        objectArray[16] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[16] | (Integer)objectArray[3]) + ((Integer)objectArray[16] & (Integer)objectArray[3]);
        objectArray2[((Integer)objectArray[15]).intValue()] = this;
        objectArray[13] = IilliliilIIi[6];
        objectArray[3] = IilliliilIIi[7];
        objectArray[16] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[16] & ~((Integer)objectArray[3]).intValue()) - (~((Integer)objectArray[16]).intValue() & (Integer)objectArray[3]);
        objectArray[3] = IilliliilIIi[8];
        objectArray[16] = (int)((Integer)objectArray[13]);
        objectArray[13] = (Integer)objectArray[16] - ~((Integer)objectArray[3]).intValue() - 1;
        objectArray2[((Integer)objectArray[13]).intValue()] = iliIlllilIi;
        IlIlllIlilIl.iliIiiliiiii("b0f8dae9-4009-40e0-8f2c-bab0fdaab013", (long)-8511652278483721584L, (Object[])objectArray2, (String)"kUVGU0yMjIOCjIV7RV18QEFeQFxiRZlYRklIa2pSU29RrHBTbVVraGlmZ3tlYqFffn5/Y31lZHhGSWi2dU1sb04RMAwSCgsXyxkHGzodHAAeAQADAtgkGCYWFxQqEgwQLi4=", (String)"slWNTEZDVEmPgYyPj4BGS0leSFFUWV+aRlRfT1NQRFCTSm97YnFtUH5ucA==", (String)"R2VOWjZB", (int)IilliliilIIi[9], (String)"t0VN", (int)IilliliilIIi[10], (int)IilliliilIIi[11], (int)IilliliilIIi[12], (String)"bXBebFNdQV+MRlBGWIdmVl9FRlRshXtGTlxAkVVFUU2US3lydnNjWQ==", (int)IilliliilIIi[13]);
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    public void onQuit(PlayerQuitEvent playerQuitEvent) {
        int n;
        int n2 = n = (0x6CBE5683 | 0x216367D1) - (0x6CBE5683 & 0x216367D1);
        if (1240536563 >= n2 + 560162769 - (n2 & 0x216367D1) * 2) {
            int cfr_ignored_0 = 0x5A & 1;
        }
        Object[] objectArray = new Object[32];
        objectArray[4] = IilliliilIIi[28];
        objectArray[6] = IilliliilIIi[29];
        objectArray[23] = (int)((Integer)objectArray[4]);
        objectArray[4] = (Integer)objectArray[23] & ~((Integer)objectArray[6]).intValue() | ~((Integer)objectArray[23]).intValue() & (Integer)objectArray[6];
        objectArray[6] = IilliliilIIi[30];
        objectArray[23] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[23] ^ (Integer)objectArray[6]) + 2 * ((Integer)objectArray[23] & (Integer)objectArray[6]);
        Object[] objectArray2 = new Object[((Integer)objectArray[4]).intValue()];
        objectArray[10] = IilliliilIIi[31];
        objectArray[6] = IilliliilIIi[32];
        objectArray[23] = (int)((Integer)objectArray[10]);
        objectArray[10] = (Integer)objectArray[23] + ~((Integer)objectArray[6]).intValue() + 1;
        objectArray[6] = IilliliilIIi[33];
        objectArray[23] = (int)((Integer)objectArray[10]);
        objectArray[10] = (Integer)objectArray[23] + ~((Integer)objectArray[6]).intValue() + 1;
        objectArray2[((Integer)objectArray[10]).intValue()] = this;
        objectArray[26] = IilliliilIIi[34];
        objectArray[6] = IilliliilIIi[35];
        objectArray[23] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[23] ^ (Integer)objectArray[6]) + 2 * ((Integer)objectArray[23] & (Integer)objectArray[6]);
        objectArray[6] = IilliliilIIi[36];
        objectArray[23] = (int)((Integer)objectArray[26]);
        objectArray[26] = 2 * ((Integer)objectArray[23] | (Integer)objectArray[6]) - ((Integer)objectArray[23] ^ (Integer)objectArray[6]);
        objectArray2[((Integer)objectArray[26]).intValue()] = playerQuitEvent;
        IlIlllIlilIl.iliIiiliiiii("b7c5877e-4008-4abf-828a-5cb9e8a36959", (long)-3180006023951010488L, (Object[])objectArray2, (String)"k7u4UU6KioGAgot5R1t6QkNAXl5gQ59aREdGaWhUVW1Tkk5Rb1NtamtoaXlnZKddfGBhYX9jYnpER2a0d0tqbUxvTg4QDA0VyRcJGTgbGgIcHx4BAN4iGiQYGRYoFAoSLBA=", (String)"sKtzTkRFUkuNj4KNjYZASUtAVlNWX1mYRFpRTVFWQlKRdFF5YHdrUnxgfg==", (String)"V2pybUlU", (int)IilliliilIIi[37], (String)"tbuz", (int)IilliliilIIi[38], (int)IilliliilIIi[39], (int)IilliliilIIi[40], (String)"b46gblFbR12OSF5EWoFgVF1bWFZug31ETFJOk1dDV0+WdUdwdHVlWw==", (int)IilliliilIIi[41]);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class liiiIIllIl {
    public static String[][] IilliliilIIi;
    public static int iIlIlllllill;
    public static String[][] lIiiIiIlilli;
    static AtomicReferenceArray<MethodHandle> IIIllIIliIIl;
    public static int liiiIIllIl;
    public static int[] IlIlllIlilIl;
    public static int IliIlllilIi;
    public static int IiIlliIliiIl;
    public static boolean IIlllIlliIll;

    /*
     * Exception decompiling
     */
    public static Class iIlIlllllill(String var0) {
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
    static {
        int n;
        int n2 = n = (0xF2ADE41 | 0x5DAB6B08) - (0xF2ADE41 & 0x5DAB6B08);
        if (193909009 >= n2 + 1571515144 - (n2 & 0x5DAB6B08) * 2) {
            int n3 = n = (0x35 | 0x5DAB6B08) - (0x35 & 0x5DAB6B08);
            int cfr_ignored_0 = n3 + 1571515144 - (n3 & 0x5DAB6B08) * 2;
        }
        Object[] objectArray = new Object[32];
        Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.liiiIIllIl.IlIlllIlilIl();
        objectArray[16] = IlIlllIlilIl[12];
        objectArray[4] = IlIlllIlilIl[13];
        objectArray[0] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[0] | (Integer)objectArray[4]) + ((Integer)objectArray[0] & (Integer)objectArray[4]);
        objectArray[4] = IlIlllIlilIl[14];
        objectArray[0] = (int)((Integer)objectArray[16]);
        int n4 = (0x8F36EDBD | 0xBD72C95E) - (0x8F36EDBD & 0xBD72C95E);
        int cfr_ignored_1 = n4 + -1116550818;
        objectArray[16] = (Integer)objectArray[0] - ~((Integer)objectArray[4]).intValue() - 1;
        Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.liiiIIllIl.lIiiIiIlilli("c338e1f2-75a7-4369-9080-8979f41aefbe", (int)((Integer)objectArray[16]), (String)"dFVPa01MS0pJTUdG", (String)"UWlQS0oSFhMQEgVDRWFDQmRFel5dHltffFhXU1BxU1ITdQouLSwrDykoJ2QgASMiIQU/Pj08eTo8PTITEDQzFzE=", (int)IlIlllIlilIl[15], (int)IlIlllIlilIl[16], (String)"UWlQS0oSFhMQEgVDRWFDQmRFel5dHltffFhXU1BxU1ITdQouLSwrDykoJ2QgASMiIQU/Pj08eTo8PTITEDQzFzE=", (int)IlIlllIlilIl[17], (String)"VA==", (int)IlIlllIlilIl[18], (int)IlIlllIlilIl[19], (int)IlIlllIlilIl[20]);
        objectArray[8] = IlIlllIlilIl[21];
        objectArray[4] = IlIlllIlilIl[22];
        objectArray[0] = (int)((Integer)objectArray[8]);
        objectArray[8] = (Integer)objectArray[0] + ~((Integer)objectArray[4]).intValue() + 1;
        objectArray[4] = IlIlllIlilIl[23];
        objectArray[0] = (int)((Integer)objectArray[8]);
        objectArray[8] = (Integer)objectArray[0] & ~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[4];
        Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.liiiIIllIl.lIiiIiIlilli("8a8948bd-92e6-4434-a917-4c333429c447", (int)((Integer)objectArray[8]), (String)"dnJNTG9uTE1rTw==", (String)"Vm5XTE0VERQXFQJEQmZERWNCfVlaGVxYe19QVFd2VFUUcg0pKissCC4vIGMnBiQlJgI4OTo7fj07OjUUFzM0EDY=", (int)IlIlllIlilIl[24], (int)IlIlllIlilIl[25], (String)"Vm5XTE0VERQXFQJEQmZERWNCfVlaGVxYe19QVFd2VFUUcg0pKissCC4vIGMnBiQlJgI4OTo7fj07OjUUFzM0EDY=", (int)IlIlllIlilIl[26], (String)"Uw==", (int)IlIlllIlilIl[27], (int)IlIlllIlilIl[28], (int)IlIlllIlilIl[29]);
        objectArray[23] = IlIlllIlilIl[30];
        objectArray[4] = IlIlllIlilIl[31];
        objectArray[0] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[0] | (Integer)objectArray[4]) & ~((Integer)objectArray[0] & (Integer)objectArray[4]);
        objectArray[4] = IlIlllIlilIl[32];
        objectArray[0] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[0] + ~((Integer)objectArray[4]).intValue() + 1;
        Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.liiiIIllIl.lIiiIiIlilli("d95c2701-f6c5-4c43-b0b0-121b102a6406", (int)((Integer)objectArray[23]), (String)"UnZMbUtKTUlPa0Q=", (String)"V29WTUwUEBUWFANFQ2dFRGJDfFhbGF1Zel5RVVZ3VVQVcwwoKyotCS8uIWImByUkJwM5ODs6fzw6OzQVFjI1ETc=", (int)IlIlllIlilIl[33], (int)IlIlllIlilIl[34], (String)"V29WTUwUEBUWFANFQ2dFRGJDfFhbGF1Zel5RVVZ3VVQVcwwoKyotCS8uIWImByUkJwM5ODs6fzw6OzQVFjI1ETc=", (int)IlIlllIlilIl[35], (String)"Ug==", (int)IlIlllIlilIl[36], (int)IlIlllIlilIl[37], (int)IlIlllIlilIl[38]);
        Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.liiiIIllIl.lIiiIiIlilli("a45192f4-c0eb-4ca9-ad31-2541ff1a15ce", liiiIIllIl.class, (String)"c3FARHVP", (String)"U2tSSUgQFBESEAdBR2NBQGZHeFxfHFldflpVUVJzUVARdwgsLy4pDSsqJWYiAyEgIwc9PD8+ezg+PzAREjYxFTM=", (int)IlIlllIlilIl[39], (int)IlIlllIlilIl[40], (String)"cnsPTFZRTE8VFxwdHQRCWVtCUEdAX0UaXlhNXUlUXFARbi0hOic3ACYyKA==", (int)IlIlllIlilIl[41], (String)"N1JLQVVDCkhGSE4HaEZMX1wVGGY=", (int)IlIlllIlilIl[42], (int)IlIlllIlilIl[43], (int)IlIlllIlilIl[44]);
        int n5 = (0xACFEDF21 | 0xBEC5327F) - (0xACFEDF21 & 0xBEC5327F);
        int cfr_ignored_2 = n5 + -1094372737;
        objectArray[28] = IlIlllIlilIl[45];
        objectArray[4] = IlIlllIlilIl[46];
        objectArray[0] = (int)((Integer)objectArray[28]);
        objectArray[28] = ((Integer)objectArray[0] | (Integer)objectArray[4]) & ~((Integer)objectArray[0] & (Integer)objectArray[4]);
        objectArray[4] = IlIlllIlilIl[47];
        objectArray[0] = (int)((Integer)objectArray[28]);
        objectArray[28] = ((Integer)objectArray[0] | (Integer)objectArray[4]) - ((Integer)objectArray[0] & (Integer)objectArray[4]);
        Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.liiiIIllIl.lIiiIiIlilli("eff45ada-8268-469c-8bdf-ef2dd0de9eb0", (long)-753491991390800623L, (Object[])new Object[((Integer)objectArray[28]).intValue()], (String)"bmhM", (String)"UGhRSksTFxIREwRCRGBCQ2VEe19cH1pefVlWUlFwUlMSdAsvLC0qDigpJmUhACIjIAQ+Pzw9eDs9PDMSETUyFjA=", (int)IlIlllIlilIl[48], (int)IlIlllIlilIl[49], (String)"cXgMT1VST0wWFB8eHgdBWlhBU0RDXEYZXVtOXkpXX1MSbS4iOSQ0AyUxKw==", (int)IlIlllIlilIl[50], (String)"NFd5b0pAUEYLSUtFTwZhTUZIUUcLGHpdVUNbFFRYUFgTciApJSIyfA==", (int)IlIlllIlilIl[51], (int)IlIlllIlilIl[52], (int)IlIlllIlilIl[53]);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1_1, MethodType var2_2) {
        v0 = var24_3 = (376180489 | -2484457) - (376180489 & -2484457);
        Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.liiiIIllIl.IiIlliIliiIl = v0 + -2484457 - (v0 & -2484457) * 2;
        if (669565895 <= Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.liiiIIllIl.IiIlliIliiIl) {
            36 + 94;
        }
        var22_9 = new Object[19];
        try {
            var22_9[18] = MethodHandles.lookup();
            var16_4 = (2125314607 | 1255257561) - (2125314607 & 1255257561);
            var16_4 + 1255257561;
            var22_9[7] = ((MethodHandles.Lookup)var22_9[18]).findStatic(liiiIIllIl.class, "iliIiiliiiii", MethodType.fromMethodDescriptorString("(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;III)Ljava/lang/invoke/MethodHandle;", var0.lookupClass().getClassLoader()));
            var22_9[12] = var2_2.parameterCount();
            var17_5 = (-266322107 | -897247099) - (-266322107 & -897247099);
            var17_5 + -897247099;
            var22_9[0] = Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.liiiIIllIl.IlIlllIlilIl[54];
            var22_9[14] = (int)((Integer)var22_9[12]);
            var22_9[1] = ((Integer)var22_9[14] ^ (Integer)var22_9[0]) - 2 * (~((Integer)var22_9[14]).intValue() & (Integer)var22_9[0]);
            var22_9[10] = var2_2.dropParameterTypes((Integer)var22_9[1], (Integer)var22_9[12]);
            var22_9[13] = MethodHandles.invoker((MethodType)var22_9[10]);
            v1 = new Class[Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.liiiIIllIl.IlIlllIlilIl[55]];
            v1[Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.liiiIIllIl.IlIlllIlilIl[56]] = MethodHandle.class;
            var22_9[2] = ((MethodType)var22_9[10]).appendParameterTypes(v1);
            var22_9[0] = Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.liiiIIllIl.IlIlllIlilIl[57];
            var22_9[14] = (int)((Integer)var22_9[1]);
            var18_6 = (1391023575 | 1281839713) - (1391023575 & 1281839713);
            var18_6 + 1281839713;
        }
        catch (VerifyError v2) {
            throw v2;
        }
        catch (UnsupportedClassVersionError v3) {
            throw v3;
        }
        var22_9[16] = new int[2 * ((Integer)var22_9[14] | (Integer)var22_9[0]) - ((Integer)var22_9[14] ^ (Integer)var22_9[0])];
        ((int[])var22_9[16])[Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.liiiIIllIl.IlIlllIlilIl[58]] = (Integer)var22_9[1];
        var19_7 = (1752818941 | 1599506209) - (1752818941 & 1599506209);
        var19_7 + 1599506209;
        var22_9[4] = Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.liiiIIllIl.IlIlllIlilIl[59];
        if (true) ** GOTO lbl70
        block15: while (true) {
            v4 = var20_8;
            switch (v4 + 1743681821 - (v4 & 1743681821) * 2) {
                default: {
                    var22_9[0] = Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.liiiIIllIl.IlIlllIlilIl[60];
                    var22_9[14] = (int)((Integer)var22_9[1]);
                    if ((Integer)var22_9[4] >= ((Integer)var22_9[14] ^ (Integer)var22_9[0]) + 2 * ((Integer)var22_9[14] & (Integer)var22_9[0])) {
                        var22_9[8] = MethodHandles.permuteArguments((MethodHandle)var22_9[13], (MethodType)var22_9[2], (int[])var22_9[16]);
                        var22_9[9] = MethodHandles.collectArguments((MethodHandle)var22_9[8], (Integer)var22_9[1], (MethodHandle)var22_9[7]);
                        var21_10 = (1326727222 | 1173219142) - (1326727222 & 1173219142);
                        var21_10 + 1173219142;
                        return new ConstantCallSite((MethodHandle)var22_9[9]);
                    }
                }
                var20_8 = (961198317 | 1743681821) - (961198317 & 1743681821);
                continue block15;
                case 961198317: 
            }
            var22_9[0] = Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.liiiIIllIl.IlIlllIlilIl[61];
            var22_9[14] = (int)((Integer)var22_9[4]);
            ((int[])var22_9[16])[((Integer)var22_9[4]).intValue()] = 2 * ((Integer)var22_9[14] & ~((Integer)var22_9[0]).intValue()) - ((Integer)var22_9[14] ^ (Integer)var22_9[0]);
            var22_9[4] = (Integer)var22_9[4] + 1;
lbl70:
            // 2 sources

            var20_8 = (-1598959568 | 1743681821) - (-1598959568 & 1743681821);
        }
    }

    public liiiIIllIl() {
        Object[] objectArray = new Object[26];
        objectArray[19] = IlIlllIlilIl[0];
        objectArray[21] = IlIlllIlilIl[1];
        objectArray[3] = (int)((Integer)objectArray[19]);
        objectArray[19] = (Integer)objectArray[3] & ~((Integer)objectArray[21]).intValue() | ~((Integer)objectArray[3]).intValue() & (Integer)objectArray[21];
        objectArray[21] = IlIlllIlilIl[2];
        objectArray[3] = (int)((Integer)objectArray[19]);
        objectArray[19] = (Integer)objectArray[3] - ~((Integer)objectArray[21]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[19]).intValue()];
        objectArray[14] = IlIlllIlilIl[3];
        objectArray[21] = IlIlllIlilIl[4];
        objectArray[3] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[3] | (Integer)objectArray[21]) + ((Integer)objectArray[3] & (Integer)objectArray[21]);
        objectArray[21] = IlIlllIlilIl[5];
        objectArray[3] = (int)((Integer)objectArray[14]);
        objectArray[14] = (Integer)objectArray[3] & ~((Integer)objectArray[21]).intValue() | ~((Integer)objectArray[3]).intValue() & (Integer)objectArray[21];
        objectArray2[((Integer)objectArray[14]).intValue()] = this;
        Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.liiiIIllIl.lIiiIiIlilli("c002d490-4a41-4b6f-9b12-09492a845e04", (long)1776211026582519467L, (Object[])objectArray2, (String)"bGpO", (String)"UmpTSEkRFRATEQZARmJAQWdGeV1eHVhcf1tUUFNyUFEQdgktLi8oDCorJGcjAiAhIgY8PT4/ejk/PjEQEzcwFDI=", (int)IlIlllIlilIl[6], (int)IlIlllIlilIl[7], (String)"c3oOTVdQTU4UFh0cHAVDWFpDUUZBXkQbX1lMXEhVXVEQbywgOyY2ASczKQ==", (int)IlIlllIlilIl[8], (String)"NlV7bUhCUkQJS0lHTQRjT0RKU0UJGnhfV0FZFlZaUloRcCIrJyAwfg==", (int)IlIlllIlilIl[9], (int)IlIlllIlilIl[10], (int)IlIlllIlilIl[11]);
    }

    /*
     * Exception decompiling
     */
    public static String IilliliilIIi(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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
    public static void IlIlllIlilIl() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 26[UNCONDITIONALDOLOOP]
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
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String IIIllIIliIIl(String string, int n, int n2) {
        int n3;
        int n4 = n3 = (0x22C5B426 | 0xA1672D8C) - (0x22C5B426 & 0xA1672D8C);
        IiIlliIliiIl = n4 + -1587073652 - (n4 & 0xA1672D8C) * 2;
        if (860863049 < IiIlliIliiIl) {
            int cfr_ignored_1 = 41 + 62;
        }
        Object[] objectArray = new Object[6];
        objectArray[3] = Base64.getDecoder().decode(string);
        objectArray[1] = IlIlllIlilIl[85];
        boolean bl = true;
        block7: while (true) {
            int n5;
            if (!bl || (bl = false) || !true) {
                int n6 = n5;
                switch (n6 + 392029800 - (n6 & 0x175DE668) * 2) {
                    default: {
                        n5 = (0xCACBA2DE | 0x175DE668) - (0xCACBA2DE & 0x175DE668);
                        continue block7;
                    }
                    case -892624162: 
                }
                byte[] byArray = (byte[])objectArray[3];
                int n7 = (Integer)objectArray[1];
                objectArray[4] = n;
                objectArray[0] = (int)byArray[n7];
                objectArray[4] = (int)((Integer)objectArray[1]);
                objectArray[0] = n2;
                objectArray[4] = ((Integer)objectArray[0] | (Integer)objectArray[4]) + ((Integer)objectArray[0] & (Integer)objectArray[4]);
                objectArray[0] = ((Integer)objectArray[0] | (Integer)objectArray[4]) & ~((Integer)objectArray[0] & (Integer)objectArray[4]);
                byArray[n7] = (byte)(((Integer)objectArray[0] | (Integer)objectArray[4]) & ~((Integer)objectArray[0] & (Integer)objectArray[4]));
                objectArray[1] = (Integer)objectArray[1] + 1;
            }
            if ((Integer)objectArray[1] >= ((byte[])objectArray[3]).length) {
                return new String((byte[])objectArray[3], StandardCharsets.UTF_8);
            }
            n5 = (0x9848ADFC | 0x175DE668) - (0x9848ADFC & 0x175DE668);
        }
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle iliIiiliiiii(String var0, String var1_1, int var2_2, int var3_3, String var4_4, int var5_5, String var6_6, int var7_7, int var8_8, int var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK], 2[TRYBLOCK], 3[TRYBLOCK]], but top level block is 17[SWITCH]
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
}


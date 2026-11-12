/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.block.banner.Pattern
 *  org.bukkit.entity.Player
 */
package Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll;

import java.io.File;
import java.io.SyncFailedException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bukkit.Location;
import org.bukkit.block.banner.Pattern;
import org.bukkit.entity.Player;

public final class IilliliilIIi {
    private List<Location> liiiIIllIl;
    static AtomicReferenceArray<MethodHandle> IilliliilIIi;
    public static int[] lIiiIiIlilli;
    private File IliIlllilIi;
    public static int iliIiiliiiii;
    public static boolean IIIllIIliIIl;

    /*
     * Enabled aggressive block sorting
     */
    private void lIiiIiIlilli() {
        Object[] objectArray = new Object[31];
        int n = (0x4FB00E7F | 0x6F7B2F0F) - (0x4FB00E7F & 0x6F7B2F0F);
        int cfr_ignored_0 = n + 1870343951;
        objectArray[29] = lIiiIiIlilli[78];
        objectArray[2] = lIiiIiIlilli[79];
        objectArray[10] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[10] ^ (Integer)objectArray[2]) + 2 * ((Integer)objectArray[10] & (Integer)objectArray[2]);
        objectArray[2] = lIiiIiIlilli[80];
        objectArray[10] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[10] & ~((Integer)objectArray[2]).intValue()) - (~((Integer)objectArray[10]).intValue() & (Integer)objectArray[2]);
        Object[] objectArray2 = new Object[((Integer)objectArray[29]).intValue()];
        objectArray[20] = lIiiIiIlilli[81];
        objectArray[2] = lIiiIiIlilli[82];
        objectArray[10] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[10] | (Integer)objectArray[2]) & (~((Integer)objectArray[10]).intValue() | ~((Integer)objectArray[2]).intValue());
        objectArray[2] = lIiiIiIlilli[83];
        objectArray[10] = (int)((Integer)objectArray[20]);
        objectArray[20] = 2 * ((Integer)objectArray[10] & ~((Integer)objectArray[2]).intValue()) - ((Integer)objectArray[10] ^ (Integer)objectArray[2]);
        objectArray2[((Integer)objectArray[20]).intValue()] = this;
        Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.Ililllililil("d54168a1-a30d-4c98-9883-917aee4ca4b0", (long)5425974944959901109L, (Object[])objectArray2, (int)lIiiIiIlilli[84], (int)lIiiIiIlilli[85], (int)lIiiIiIlilli[86], (String)"SllHZzdm", (String)"5+XZ", (int)lIiiIiIlilli[87], (String)"veXm39yipJ+empHX0bXPzrLRsMrJhsfLqsTDx8alv757oaC6ubi3m7W0s3C2la+urZGrqqmoZYuqpKOnoaWknoKBoA==", (String)"3tWZ2uLj3NmfoZybl47O19XMyNHUydOEysLLu8u+vL57qLu3zrHBjrK8sA==", (String)"ob7OutvV3dOU1NDQyI+uyM/FxtKcjafIwsrAgcG9vbV8m7W8srO/iQ==", (int)lIiiIiIlilli[88]);
    }

    private List<Pattern> iIlIlllllill(String string) {
        Object[] objectArray = new Object[38];
        objectArray[14] = lIiiIiIlilli[53];
        objectArray[4] = lIiiIiIlilli[54];
        objectArray[6] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[6] | (Integer)objectArray[4]) + ((Integer)objectArray[6] & (Integer)objectArray[4]);
        objectArray[4] = lIiiIiIlilli[55];
        objectArray[6] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[6] & ~((Integer)objectArray[4]).intValue()) - (~((Integer)objectArray[6]).intValue() & (Integer)objectArray[4]);
        Object[] objectArray2 = new Object[((Integer)objectArray[14]).intValue()];
        objectArray[36] = lIiiIiIlilli[56];
        objectArray[4] = lIiiIiIlilli[57];
        objectArray[6] = (int)((Integer)objectArray[36]);
        objectArray[36] = (Integer)objectArray[6] & ~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[6]).intValue() & (Integer)objectArray[4];
        objectArray[4] = lIiiIiIlilli[58];
        objectArray[6] = (int)((Integer)objectArray[36]);
        objectArray[36] = ((Integer)objectArray[6] ^ (Integer)objectArray[4]) - 2 * (~((Integer)objectArray[6]).intValue() & (Integer)objectArray[4]);
        objectArray2[((Integer)objectArray[36]).intValue()] = this;
        objectArray[12] = lIiiIiIlilli[59];
        objectArray[4] = lIiiIiIlilli[60];
        objectArray[6] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[6] ^ (Integer)objectArray[4]) + 2 * ((Integer)objectArray[6] & (Integer)objectArray[4]);
        objectArray[4] = lIiiIiIlilli[61];
        objectArray[6] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[6] | (Integer)objectArray[4]) & (~((Integer)objectArray[6]).intValue() | ~((Integer)objectArray[4]).intValue());
        objectArray2[((Integer)objectArray[12]).intValue()] = string;
        return (List)((Object)Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.Ililllililil("143a2471-1f96-4928-8c1b-92df38c40517", (long)-4882037195885344417L, (Object[])objectArray2, (int)lIiiIiIlilli[62], (int)lIiiIiIlilli[63], (int)lIiiIiIlilli[64], (String)"d2o1cllh", (String)"6ePb", (int)lIiiIiIlilli[65], (String)"u+Po3d6kop2cnJPVz7PNzLDPrsjHiMXJqMLBxcSjvbx9n564t7a1mbOysXK0k62sq4+pqKemZ4mooqGln6OinIB/ng==", (String)"3NOb2ODl2tuhn5qZmZDQ1dPKxtPWx9GGyMTJuc3Aurx9prm1zK/DjLC6rg==", (String)"n8DQuN3T39GW0s7SypGwytHDyNCei6XKwMy+g7+7v7d+nbe+sLW9iw==", (int)lIiiIiIlilli[66]));
    }

    /*
     * Exception decompiling
     */
    public static void IlIillIiilIi() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [27[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String IIIilIIiiIIi(String string, int n, int n2) {
        if (IIIllIIliIIl) {
            int n3;
            int n4 = n3 = (0x1D | 0x122F4BF1) - (0x1D & 0x122F4BF1);
            int cfr_ignored_0 = n4 + 305089521 - (n4 & 0x122F4BF1) * 2;
        }
        Object[] objectArray = new Object[7];
        objectArray[5] = Base64.getDecoder().decode(string);
        int n5 = (0x54C442FC | 0xFE8EA459) - (0x54C442FC & 0xFE8EA459);
        int cfr_ignored_1 = n5 + -24206247;
        objectArray[3] = lIiiIiIlilli[125];
        while ((Integer)objectArray[3] < ((byte[])objectArray[5]).length) {
            byte[] byArray = (byte[])objectArray[5];
            int n6 = (Integer)objectArray[3];
            objectArray[0] = (int)((Integer)objectArray[3]);
            objectArray[2] = (int)byArray[n6];
            objectArray[0] = n2;
            objectArray[2] = (Integer)objectArray[2] - ~((Integer)objectArray[0]).intValue() - 1;
            objectArray[0] = n;
            objectArray[2] = ((Integer)objectArray[2] & ~((Integer)objectArray[0]).intValue()) - (~((Integer)objectArray[2]).intValue() & (Integer)objectArray[0]);
            byArray[n6] = (byte)(((Integer)objectArray[2] | (Integer)objectArray[0]) - ((Integer)objectArray[2] & (Integer)objectArray[0]));
            objectArray[3] = (Integer)objectArray[3] + 1;
        }
        try {
            return new String((byte[])objectArray[5], StandardCharsets.UTF_8);
        }
        catch (SyncFailedException syncFailedException) {
            throw syncFailedException;
        }
        catch (IllegalAccessError illegalAccessError) {
            throw illegalAccessError;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IilliliilIIi() {
        if (IIIllIIliIIl) {
            int cfr_ignored_0 = 0x44 & 1;
        }
        Object[] objectArray = new Object[36];
        objectArray[26] = lIiiIiIlilli[67];
        objectArray[6] = lIiiIiIlilli[68];
        objectArray[15] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[15] & ~((Integer)objectArray[6]).intValue()) - (~((Integer)objectArray[15]).intValue() & (Integer)objectArray[6]);
        objectArray[6] = lIiiIiIlilli[69];
        objectArray[15] = (int)((Integer)objectArray[26]);
        objectArray[26] = 2 * ((Integer)objectArray[15] & ~((Integer)objectArray[6]).intValue()) - ((Integer)objectArray[15] ^ (Integer)objectArray[6]);
        Object[] objectArray2 = new Object[((Integer)objectArray[26]).intValue()];
        objectArray[23] = lIiiIiIlilli[70];
        objectArray[6] = lIiiIiIlilli[71];
        objectArray[15] = (int)((Integer)objectArray[23]);
        objectArray[23] = 2 * ((Integer)objectArray[15] & ~((Integer)objectArray[6]).intValue()) - ((Integer)objectArray[15] ^ (Integer)objectArray[6]);
        objectArray[6] = lIiiIiIlilli[72];
        objectArray[15] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[15] & ~((Integer)objectArray[6]).intValue() | ~((Integer)objectArray[15]).intValue() & (Integer)objectArray[6];
        objectArray2[((Integer)objectArray[23]).intValue()] = this;
        Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.Ililllililil("f5a98b7e-63c2-4944-ad0e-3d9556be8e8d", (long)4813916572380317878L, (Object[])objectArray2, (int)lIiiIiIlilli[73], (int)lIiiIiIlilli[74], (int)lIiiIiIlilli[75], (String)"NTlwTnhP", (String)"6uLc", (int)lIiiIiIlilli[76], (String)"vOLn3N2loZybnZTU0LLOza/OrcnIicbIp8PCxMOivr1+np25uLe2mLSzsnOzkq6trI6qqainaIino6KkoKKhnX9+nQ==", (String)"29Kc2d/k2dqinpmYmpHP1NTLxdLVxtKHx8XKuM7Bub1+p7q0y67Eja+7rQ==", (String)"oMHPud7S4NCV083TyZCvy9LCx9GdiqbLv829gsC6wLZ9nLi/r7S+ig==", (int)lIiiIiIlilli[77]);
        int n = (0x68C0A47B | 0x2A1C37A5) - (0x68C0A47B & 0x2A1C37A5);
        int cfr_ignored_1 = n + 706492325;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        if (IIIllIIliIIl) {
            int n;
            int n2 = n = (0xC0CF9439 | 0x64D30E51) - (0xC0CF9439 & 0x64D30E51);
            iliIiiliiiii = n2 + 1691553361 - (n2 & 0x64D30E51) * 2;
        }
        int n = (0xA997244 | 0x6C661385) - (0xA997244 & 0x6C661385);
        int cfr_ignored_0 = n + 1818628997;
        Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.IlIillIiilIi();
        Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.Ililllililil("1d9e77c5-c476-4617-8c10-b91fe91bfd8b", IilliliilIIi.class, (int)lIiiIiIlilli[89], (int)lIiiIiIlilli[90], (int)lIiiIiIlilli[91], (String)"VnhxcTZY", (String)"3trX08DY", (int)lIiiIiIlilli[92], (String)"vuTl3tujo56dm5LW0rTQz7HQr8vKh8jKqcXExsWkwL98oJ+7urm4mra1tHG1lLCvrpCsq6qpZoqppaSmoqSjn4GAnw==", (String)"3dSa2+Hi29igoJuamI/N1tbNx9DTyNSFycPMusy/u798qby2zbDCj7G9rw==", (String)"or3e1uDUldfR08mQq9HL2Neej7E=", (int)lIiiIiIlilli[93]);
    }

    /*
     * Exception decompiling
     */
    public static Class Iilllilliill(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [12[CASE]], but top level block is 0[TRYBLOCK]
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite Ililllililil(MethodHandles.Lookup var0, String var1_1, MethodType var2_2) {
        if (Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.IIIllIIliIIl) {
        }
        var19_4 = new Object[16];
        var19_4[15] = MethodHandles.lookup();
        var16_3 = (750472961 | -341329106) - (750472961 & -341329106);
        var16_3 + -341329106;
        var19_4[10] = ((MethodHandles.Lookup)var19_4[15]).findStatic(IilliliilIIi.class, "Iiilliiliiil", MethodType.fromMethodDescriptorString("(IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/invoke/MethodHandle;", var0.lookupClass().getClassLoader()));
        var19_4[13] = var2_2.parameterCount();
        var19_4[14] = Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.lIiiIiIlilli[94];
        var19_4[8] = (int)((Integer)var19_4[13]);
        var19_4[11] = ((Integer)var19_4[8] ^ (Integer)var19_4[14]) - 2 * (~((Integer)var19_4[8]).intValue() & (Integer)var19_4[14]);
        var19_4[12] = var2_2.dropParameterTypes((Integer)var19_4[11], (Integer)var19_4[13]);
        var19_4[6] = MethodHandles.invoker((MethodType)var19_4[12]);
        v0 = new Class[Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.lIiiIiIlilli[95]];
        v0[Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.lIiiIiIlilli[96]] = MethodHandle.class;
        var19_4[2] = ((MethodType)var19_4[12]).appendParameterTypes(v0);
        var19_4[14] = Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.lIiiIiIlilli[97];
        var19_4[8] = (int)((Integer)var19_4[11]);
        var19_4[0] = new int[((Integer)var19_4[8] ^ (Integer)var19_4[14]) + 2 * ((Integer)var19_4[8] & (Integer)var19_4[14])];
        var17_5 = (-1347260788 | 1319967462) - (-1347260788 & 1319967462);
        block17: while (true) {
            v1 = var17_5;
            switch (v1 + 1319967462 - (v1 & 1319967462) * 2) {
                default: {
                    ((int[])var19_4[0])[Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.lIiiIiIlilli[98]] = (Integer)var19_4[11];
                    var17_5 = (1709878102 | 1319967462) - (1709878102 & 1319967462);
                    continue block17;
                }
                case 1709878102: 
            }
            break;
        }
        var19_4[7] = Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.lIiiIiIlilli[99];
        block18: while (true) {
            block22: {
                try {
                    var19_4[14] = Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.lIiiIiIlilli[100];
                    var19_4[8] = (int)((Integer)var19_4[11]);
                    if ((Integer)var19_4[7] < (Integer)var19_4[8] - ~((Integer)var19_4[14]).intValue() - 1) {
                        var18_6 = (-1671800125 | -571827643) - (-1671800125 & -571827643);
                    }
                    ** GOTO lbl-1000
                }
                catch (ThreadDeath v2) {
                    throw v2;
                }
                catch (InstantiationError v3) {
                    throw v3;
                }
lbl48:
                // 1 sources

                while (true) {
                    var18_6 = (24479648 | -571827643) - (24479648 & -571827643);
                    break block22;
                    break;
                }
lbl-1000:
                // 1 sources

                {
                    var19_4[9] = MethodHandles.permuteArguments((MethodHandle)var19_4[6], (MethodType)var19_4[2], (int[])var19_4[0]);
                    var19_4[5] = MethodHandles.collectArguments((MethodHandle)var19_4[9], (Integer)var19_4[11], (MethodHandle)var19_4[10]);
                    return new ConstantCallSite((MethodHandle)var19_4[5]);
                }
            }
            v4 = var18_6;
            switch (v4 + -571827643 - (v4 & -571827643) * 2) {
                default: {
                    continue block18;
                }
                case -1671800125: {
                    ** continue;
                }
                case 24479648: 
            }
            var19_4[14] = Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.lIiiIiIlilli[101];
            var19_4[8] = (int)((Integer)var19_4[7]);
            ((int[])var19_4[0])[((Integer)var19_4[7]).intValue()] = ((Integer)var19_4[8] & ~((Integer)var19_4[14]).intValue()) - (~((Integer)var19_4[8]).intValue() & (Integer)var19_4[14]);
            var19_4[7] = (Integer)var19_4[7] + 1;
        }
    }

    public IilliliilIIi(File file) {
        Object[] objectArray = new Object[28];
        objectArray[24] = lIiiIiIlilli[0];
        objectArray[17] = lIiiIiIlilli[1];
        objectArray[13] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[13] ^ (Integer)objectArray[17]) + 2 * ((Integer)objectArray[13] & (Integer)objectArray[17]);
        objectArray[17] = lIiiIiIlilli[2];
        objectArray[13] = (int)((Integer)objectArray[24]);
        objectArray[24] = 2 * ((Integer)objectArray[13] & ~((Integer)objectArray[17]).intValue()) - ((Integer)objectArray[13] ^ (Integer)objectArray[17]);
        Object[] objectArray2 = new Object[((Integer)objectArray[24]).intValue()];
        objectArray[21] = lIiiIiIlilli[3];
        objectArray[17] = lIiiIiIlilli[4];
        objectArray[13] = (int)((Integer)objectArray[21]);
        objectArray[21] = 2 * ((Integer)objectArray[13] | (Integer)objectArray[17]) - ((Integer)objectArray[13] ^ (Integer)objectArray[17]);
        objectArray[17] = lIiiIiIlilli[5];
        objectArray[13] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[13] ^ (Integer)objectArray[17]) + 2 * ((Integer)objectArray[13] & (Integer)objectArray[17]);
        objectArray2[((Integer)objectArray[21]).intValue()] = this;
        objectArray[7] = lIiiIiIlilli[6];
        objectArray[17] = lIiiIiIlilli[7];
        objectArray[13] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[13] | (Integer)objectArray[17]) - ((Integer)objectArray[13] & (Integer)objectArray[17]);
        objectArray[17] = lIiiIiIlilli[8];
        objectArray[13] = (int)((Integer)objectArray[7]);
        objectArray[7] = (Integer)objectArray[13] + ~((Integer)objectArray[17]).intValue() + 1;
        objectArray2[((Integer)objectArray[7]).intValue()] = file;
        Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.Ililllililil("2e5200aa-7949-43fa-82da-c419716cdf04", (long)-6699983695016264889L, (Object[])objectArray2, (int)lIiiIiIlilli[9], (int)lIiiIiIlilli[10], (int)lIiiIiIlilli[11], (String)"VWoyUjFw", (String)"5eff", (int)lIiiIiIlilli[12], (String)"v+fk2dqgnqGgoJfR06/R0KzLqszLjMnFpMbFwcCfwcCBm5q8u7q5lbe2tXawj7Gwr4utrKuqa4WkpqWho5+eoHx7mg==", (String)"4Nef3OTh1tedm56dnZTU2dfOwtfSy82KxMjNvcnEtsCBor2xyLO/kKy+qg==", (String)"m7zMvNnP482a1srWzpW0xs3HxNSah6nGvNC6h8O3w7uCobO6tLHBhw==", (int)lIiiIiIlilli[13]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IliIlllilIi(Location location, Player player) {
        if (IIIllIIliIIl) {
            throw null;
        }
        Object[] objectArray = new Object[47];
        int n = (0xD89FF9A7 | 0xD06706FD) - (0xD89FF9A7 & 0xD06706FD);
        int cfr_ignored_0 = n + -798554371;
        objectArray[12] = lIiiIiIlilli[14];
        objectArray[8] = lIiiIiIlilli[15];
        objectArray[11] = (int)((Integer)objectArray[12]);
        objectArray[12] = 2 * ((Integer)objectArray[11] & ~((Integer)objectArray[8]).intValue()) - ((Integer)objectArray[11] ^ (Integer)objectArray[8]);
        objectArray[8] = lIiiIiIlilli[16];
        objectArray[11] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[11] ^ (Integer)objectArray[8]) + 2 * ((Integer)objectArray[11] & (Integer)objectArray[8]);
        Object[] objectArray2 = new Object[((Integer)objectArray[12]).intValue()];
        objectArray[2] = lIiiIiIlilli[17];
        objectArray[8] = lIiiIiIlilli[18];
        objectArray[11] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[11] | (Integer)objectArray[8]) + ((Integer)objectArray[11] & (Integer)objectArray[8]);
        objectArray[8] = lIiiIiIlilli[19];
        objectArray[11] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[11] | (Integer)objectArray[8]) & (~((Integer)objectArray[11]).intValue() | ~((Integer)objectArray[8]).intValue());
        objectArray2[((Integer)objectArray[2]).intValue()] = this;
        objectArray[28] = lIiiIiIlilli[20];
        objectArray[8] = lIiiIiIlilli[21];
        objectArray[11] = (int)((Integer)objectArray[28]);
        objectArray[28] = 2 * ((Integer)objectArray[11] & ~((Integer)objectArray[8]).intValue()) - ((Integer)objectArray[11] ^ (Integer)objectArray[8]);
        objectArray[8] = lIiiIiIlilli[22];
        objectArray[11] = (int)((Integer)objectArray[28]);
        objectArray[28] = ((Integer)objectArray[11] ^ (Integer)objectArray[8]) - 2 * (~((Integer)objectArray[11]).intValue() & (Integer)objectArray[8]);
        objectArray2[((Integer)objectArray[28]).intValue()] = location;
        objectArray[45] = lIiiIiIlilli[23];
        objectArray[8] = lIiiIiIlilli[24];
        objectArray[11] = (int)((Integer)objectArray[45]);
        objectArray[45] = ((Integer)objectArray[11] | (Integer)objectArray[8]) & (~((Integer)objectArray[11]).intValue() | ~((Integer)objectArray[8]).intValue());
        objectArray[8] = lIiiIiIlilli[25];
        objectArray[11] = (int)((Integer)objectArray[45]);
        objectArray[45] = (Integer)objectArray[11] - ~((Integer)objectArray[8]).intValue() - 1;
        objectArray2[((Integer)objectArray[45]).intValue()] = player;
        Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.Ililllililil("27010eba-0ea9-4303-8e83-470227e1a452", (long)2888381144975267135L, (Object[])objectArray2, (int)lIiiIiIlilli[26], (int)lIiiIiIlilli[27], (int)lIiiIiIlilli[28], (String)"QzdlOE5G", (String)"5ubg", (int)lIiiIiIlilli[29], (String)"wObj2NmhnaCfoZjQ1K7S0avKqc3MjcrEo8fGwL+ewsGCmpm9vLu6lLi3tnevjrKxsIqurayrbISjp6agpJ6doXt6mQ==", (String)"39ag3ePg1daemp2cnpXT2NjPwdbRys6Lw8nOvMrFtcGCo76wx7LAkau/qQ==", (String)"nL3LvdrO5MyZ18nXzZSzx87Gw9WZhqrHu9G5hsS2xLqBoLS7s7DChg==", (int)lIiiIiIlilli[30]);
        int n2 = (0xEA2A7CF5 | 0x2C2110C6) - (0xEA2A7CF5 & 0x2C2110C6);
        int cfr_ignored_1 = n2 + 740364486;
    }

    /*
     * Exception decompiling
     */
    public static String IIillIiliIil(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [60[UNCONDITIONALDOLOOP]], but top level block is 2[TRYBLOCK]
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
    public static MethodHandle Iiilliiliiil(int var0, int var1_1, int var2_2, String var3_3, String var4_4, int var5_5, String var6_6, String var7_7, String var8_8, int var9_9) {
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

    public boolean liiiIIllIl(Location location, Player player) {
        Object[] objectArray = new Object[40];
        objectArray[18] = lIiiIiIlilli[31];
        objectArray[7] = lIiiIiIlilli[32];
        objectArray[11] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[11] | (Integer)objectArray[7]) & (~((Integer)objectArray[11]).intValue() | ~((Integer)objectArray[7]).intValue());
        objectArray[7] = lIiiIiIlilli[33];
        objectArray[11] = (int)((Integer)objectArray[18]);
        objectArray[18] = (Integer)objectArray[11] + ~((Integer)objectArray[7]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[18]).intValue()];
        objectArray[13] = lIiiIiIlilli[34];
        objectArray[7] = lIiiIiIlilli[35];
        objectArray[11] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[11] ^ (Integer)objectArray[7]) + 2 * ((Integer)objectArray[11] & (Integer)objectArray[7]);
        objectArray[7] = lIiiIiIlilli[36];
        objectArray[11] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[11] | (Integer)objectArray[7]) & ~((Integer)objectArray[11] & (Integer)objectArray[7]);
        objectArray2[((Integer)objectArray[13]).intValue()] = this;
        objectArray[4] = lIiiIiIlilli[37];
        objectArray[7] = lIiiIiIlilli[38];
        objectArray[11] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[11] & ~((Integer)objectArray[7]).intValue()) - (~((Integer)objectArray[11]).intValue() & (Integer)objectArray[7]);
        objectArray[7] = lIiiIiIlilli[39];
        objectArray[11] = (int)((Integer)objectArray[4]);
        objectArray[4] = (Integer)objectArray[11] & ~((Integer)objectArray[7]).intValue() | ~((Integer)objectArray[11]).intValue() & (Integer)objectArray[7];
        objectArray2[((Integer)objectArray[4]).intValue()] = location;
        objectArray[23] = lIiiIiIlilli[40];
        objectArray[7] = lIiiIiIlilli[41];
        objectArray[11] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[11] & ~((Integer)objectArray[7]).intValue()) - (~((Integer)objectArray[11]).intValue() & (Integer)objectArray[7]);
        objectArray[7] = lIiiIiIlilli[42];
        objectArray[11] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[11] | (Integer)objectArray[7]) & ~((Integer)objectArray[11] & (Integer)objectArray[7]);
        objectArray2[((Integer)objectArray[23]).intValue()] = player;
        return (boolean)Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.Ililllililil("a8f219de-39da-46ac-bde9-9c8c8d458f4b", (Object)Lusik21556.ilIllIiIll.liIlliiIll.IIllllIlll.iIlllIllll.IilliliilIIi.Ililllililil("3aa6849b-4405-4fd4-9951-6d652fc9c2cb", (long)3137375737655627256L, (Object[])objectArray2, (int)lIiiIiIlilli[43], (int)lIiiIiIlilli[44], (int)lIiiIiIlilli[45], (String)"WmZiSThV", (String)"4+nd", (int)lIiiIiIlilli[46], (String)"weni29ieoKOinpXT1bHT0q7NrM7NisvHpsjHw8Khw8J/nZy+vby7l7m4t3SykbOysY2vrq2saYemqKejpaGgon59nA==", (String)"4tmd3ubf2NWbnaCfm5LS29nQxNXQzc+IxsbPv8fCuMJ/pL+zyrW9kq7ArA==", (String)"nbrKvtfR4c+Y2MzUzJOyxMvJwtaYiavEvs68hcW5wbmAn7G4tq/DhQ==", (int)lIiiIiIlilli[47]), (int)lIiiIiIlilli[48], (int)lIiiIiIlilli[49], (int)lIiiIiIlilli[50], (String)"cHlxU0NQ", (String)"6t673eY=", (int)lIiiIiIlilli[51], (String)"wujh2tefn6Khn5bS1rDU063Mq8/Oi8zGpcnIwsGgxMOAnJu/vr28lrq5uHWxkLSzsoywr66taoalqaiipqCfo318mw==", (String)"4die3+Xe19ScnJ+enJPR2trRw9TPzNCJxcfQvsjDt8OApcCyybS+k63Bqw==", (String)"nsHa0uTQmdvN182Us8fOysPZmYqp", (int)lIiiIiIlilli[52]);
    }
}


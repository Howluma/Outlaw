/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.inventory.InventoryClickEvent
 *  org.bukkit.event.inventory.InventoryDragEvent
 */
package Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;

public final class Illillliilli
implements Listener {
    public static int[] iIlIlllllill;
    static AtomicReferenceArray<MethodHandle> liiiIIllIl;
    public static int IilliliilIIi;
    public static boolean lIiiIiIlilli;

    /*
     * Exception decompiling
     */
    public static Class IilliliilIIi(String var0) {
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String IlIlllIlilIl(String string, int n, int n2) {
        int n3;
        int n4 = n3 = (0x69B57943 | 0xD079EED8) - (0x69B57943 & 0xD079EED8);
        if (4589224 >= n4 + -797315368 - (n4 & 0xD079EED8) * 2) {
        }
        Object[] objectArray = new Object[6];
        int n5 = (0x45CCADD | 0xBBECFAE1) - (0x45CCADD & 0xBBECFAE1);
        int cfr_ignored_0 = n5 + -1142097183;
        objectArray[3] = Base64.getDecoder().decode(string);
        objectArray[4] = iIlIlllllill[71];
        while ((Integer)objectArray[4] < ((byte[])objectArray[3]).length) {
            byte[] byArray = (byte[])objectArray[3];
            int n6 = (Integer)objectArray[4];
            objectArray[5] = (int)((Integer)objectArray[4]);
            objectArray[2] = n;
            objectArray[5] = ((Integer)objectArray[2] | (Integer)objectArray[5]) + ((Integer)objectArray[2] & (Integer)objectArray[5]);
            objectArray[2] = (int)byArray[n6];
            objectArray[5] = n2;
            objectArray[2] = ((Integer)objectArray[2] | (Integer)objectArray[5]) + ((Integer)objectArray[2] & (Integer)objectArray[5]);
            byArray[n6] = (byte)(((Integer)objectArray[2] | (Integer)objectArray[5]) - ((Integer)objectArray[2] & (Integer)objectArray[5]));
            objectArray[4] = (Integer)objectArray[4] + 1;
        }
        return new String((byte[])objectArray[3], StandardCharsets.UTF_8);
    }

    /*
     * Exception decompiling
     */
    public static void IiIlliIliiIl() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 6[CASE]
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
        if (lIiiIiIlilli) {
            int cfr_ignored_0 = 0x19 & 1;
        }
        Illillliilli.IiIlliIliiIl();
        Illillliilli.iliIiiliiiii("c3b133e2-8ff8-4d29-b3f3-0ab91f3bd87c", Illillliilli.class, (String)"BAAFCTb+", (int)iIlIlllllill[36], (String)"AwpAARcQ+fZOTlFQTjXzDAzz9QYB7gIr5+kC8Prl6eUiF+Lk6+bwBd/z3Q==", (String)"N0YxRDBr", (int)iIlIlllllill[37], (String)"QCP8BBYCO/3/+f82Gff5BgU8LSc=", (int)iIlIlllllill[38], (String)"ZTFqbWlF", (int)iIlIlllllill[39], (String)"JBoT/PlRUVRTUTgU+PIR9fTz7fEL6izt5+blBAPn5gDkId384Pre3dzb2tTY1xTwz9PSzNDKyc3n5sUHyOLBwN++3cG7v764+ra6tNOysbWvrq2sq+3JraymqqmooqGlpJ4=");
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    public void onDrag(InventoryDragEvent inventoryDragEvent) {
        int n;
        int n2 = n = (0x3F9A730 | 0x52C489D) - (0x3F9A730 & 0x52C489D);
        IilliliilIIi = n2 + 86788253 - (n2 & 0x52C489D) * 2;
        if (746724999 < IilliliilIIi) {
            throw new SQLInvalidAuthorizationSpecException();
        }
        Object[] objectArray = new Object[28];
        objectArray[3] = iIlIlllllill[23];
        objectArray[8] = iIlIlllllill[24];
        objectArray[11] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[11] | (Integer)objectArray[8]) + ((Integer)objectArray[11] & (Integer)objectArray[8]);
        objectArray[8] = iIlIlllllill[25];
        objectArray[11] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[11] | (Integer)objectArray[8]) + ((Integer)objectArray[11] & (Integer)objectArray[8]);
        Object[] objectArray2 = new Object[((Integer)objectArray[3]).intValue()];
        objectArray[12] = iIlIlllllill[26];
        objectArray[8] = iIlIlllllill[27];
        objectArray[11] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[11] | (Integer)objectArray[8]) & (~((Integer)objectArray[11]).intValue() | ~((Integer)objectArray[8]).intValue());
        objectArray[8] = iIlIlllllill[28];
        objectArray[11] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[11] | (Integer)objectArray[8]) & ~((Integer)objectArray[11] & (Integer)objectArray[8]);
        objectArray2[((Integer)objectArray[12]).intValue()] = this;
        objectArray[17] = iIlIlllllill[29];
        objectArray[8] = iIlIlllllill[30];
        objectArray[11] = (int)((Integer)objectArray[17]);
        objectArray[17] = (Integer)objectArray[11] + ~((Integer)objectArray[8]).intValue() + 1;
        objectArray[8] = iIlIlllllill[31];
        objectArray[11] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[11] | (Integer)objectArray[8]) & (~((Integer)objectArray[11]).intValue() | ~((Integer)objectArray[8]).intValue());
        objectArray2[((Integer)objectArray[17]).intValue()] = inventoryDragEvent;
        Illillliilli.iliIiiliiiii("32a5b78f-6a9d-46a5-b2b7-d171bae6694f", (long)-3844433239658039982L, (Object[])objectArray2, (String)"FxsB", (int)iIlIlllllill[32], (String)"BAtBAhgR+vdPT1JRTzb0DQ309gcC7wMs6OoD8fvm6uYjGOPl7OfxBuD03g==", (String)"Z212R0Q0", (int)iIlIlllllill[33], (String)"QR4sIvsDFQE6/P74/jUU+O/79Ao6Kw/o8ALuJ+nr5esiAeXc6OH3Jw==", (int)iIlIlllllill[34], (String)"Y2ZDWXN5", (int)iIlIlllllill[35], (String)"JRsU/fpSUlVUUjkV+fMS9vX07vIM6y3u6OfmBQTo5wHlIt794fvf3t3c29XZ2BXx0NTTzdHLys7o58YIyePCweC/3sK8wL+5+7e7tdSzsrawr66trO7Krq2nq6qpo6KmpZ8=");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite iliIiiliiiii(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        if (lIiiIiIlilli) {
            int n;
            int n2 = n = (0x8E52E108 | 0x250E1824) - (0x8E52E108 & 0x250E1824);
            IilliliilIIi = n2 + 621680676 - (n2 & 0x250E1824) * 2;
        }
        Object[] objectArray = new Object[17];
        objectArray[14] = MethodHandles.lookup();
        objectArray[9] = ((MethodHandles.Lookup)objectArray[14]).findStatic(Illillliilli.class, "IIIllIIliIIl", MethodType.fromMethodDescriptorString("(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
        objectArray[10] = methodType.parameterCount();
        objectArray[11] = iIlIlllllill[40];
        objectArray[8] = (int)((Integer)objectArray[10]);
        int n = (0xC31F1F01 | 0x206AFD20) - (0xC31F1F01 & 0x206AFD20);
        int cfr_ignored_0 = n + 543882528;
        objectArray[12] = ((Integer)objectArray[8] & ~((Integer)objectArray[11]).intValue()) - (~((Integer)objectArray[8]).intValue() & (Integer)objectArray[11]);
        int n3 = (0x6A9A53C7 | 0xE30C3A5A) - (0x6A9A53C7 & 0xE30C3A5A);
        int cfr_ignored_1 = n3 + -485737894;
        objectArray[0] = methodType.dropParameterTypes((Integer)objectArray[12], (Integer)objectArray[10]);
        objectArray[4] = MethodHandles.invoker((MethodType)objectArray[0]);
        Class[] classArray = new Class[iIlIlllllill[41]];
        classArray[Illillliilli.iIlIlllllill[42]] = MethodHandle.class;
        objectArray[6] = ((MethodType)objectArray[0]).appendParameterTypes(classArray);
        objectArray[11] = iIlIlllllill[43];
        objectArray[8] = (int)((Integer)objectArray[12]);
        objectArray[5] = new int[((Integer)objectArray[8] ^ (Integer)objectArray[11]) + 2 * ((Integer)objectArray[8] & (Integer)objectArray[11])];
        int n4 = (0x4466B393 | 0xF368AEE) - (0x4466B393 & 0xF368AEE);
        block12: while (true) {
            int n5 = n4;
            switch (n5 + 255232750 - (n5 & 0xF368AEE) * 2) {
                default: {
                    ((int[])objectArray[5])[Illillliilli.iIlIlllllill[44]] = (Integer)objectArray[12];
                    n4 = (0xFD129F1C | 0xF368AEE) - (0xFD129F1C & 0xF368AEE);
                    continue block12;
                }
                case -49111268: 
            }
            break;
        }
        objectArray[16] = iIlIlllllill[45];
        while (true) {
            objectArray[11] = iIlIlllllill[46];
            objectArray[8] = (int)((Integer)objectArray[12]);
            if ((Integer)objectArray[16] >= ((Integer)objectArray[8] ^ (Integer)objectArray[11]) + 2 * ((Integer)objectArray[8] & (Integer)objectArray[11])) {
                objectArray[13] = MethodHandles.permuteArguments((MethodHandle)objectArray[4], (MethodType)objectArray[6], (int[])objectArray[5]);
                objectArray[1] = MethodHandles.collectArguments((MethodHandle)objectArray[13], (Integer)objectArray[12], (MethodHandle)objectArray[9]);
                return new ConstantCallSite((MethodHandle)objectArray[1]);
            }
            objectArray[11] = iIlIlllllill[47];
            objectArray[8] = (int)((Integer)objectArray[16]);
            ((int[])objectArray[5])[((Integer)objectArray[16]).intValue()] = ((Integer)objectArray[8] & ~((Integer)objectArray[11]).intValue()) - (~((Integer)objectArray[8]).intValue() & (Integer)objectArray[11]);
            objectArray[16] = (Integer)objectArray[16] + 1;
            int n6 = (0x8EB24769 | 0x9DD76C54) - (0x8EB24769 & 0x9DD76C54);
            int cfr_ignored_2 = n6 + -1646826412;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    public void onClick(InventoryClickEvent inventoryClickEvent) {
        if (lIiiIiIlilli) {
            int n;
            int n2 = n = (0x4FF0B063 | 0x8BEAA504) - (0x4FF0B063 & 0x8BEAA504);
            IilliliilIIi = n2 + -1947556604 - (n2 & 0x8BEAA504) * 2;
        }
        Object[] objectArray = new Object[28];
        objectArray[4] = iIlIlllllill[10];
        objectArray[26] = iIlIlllllill[11];
        objectArray[21] = (int)((Integer)objectArray[4]);
        objectArray[4] = 2 * ((Integer)objectArray[21] | (Integer)objectArray[26]) - ((Integer)objectArray[21] ^ (Integer)objectArray[26]);
        objectArray[26] = iIlIlllllill[12];
        objectArray[21] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[21] ^ (Integer)objectArray[26]) - 2 * (~((Integer)objectArray[21]).intValue() & (Integer)objectArray[26]);
        Object[] objectArray2 = new Object[((Integer)objectArray[4]).intValue()];
        objectArray[18] = iIlIlllllill[13];
        objectArray[26] = iIlIlllllill[14];
        objectArray[21] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[21] | (Integer)objectArray[26]) + ((Integer)objectArray[21] & (Integer)objectArray[26]);
        objectArray[26] = iIlIlllllill[15];
        objectArray[21] = (int)((Integer)objectArray[18]);
        objectArray[18] = 2 * ((Integer)objectArray[21] & ~((Integer)objectArray[26]).intValue()) - ((Integer)objectArray[21] ^ (Integer)objectArray[26]);
        objectArray2[((Integer)objectArray[18]).intValue()] = this;
        objectArray[2] = iIlIlllllill[16];
        objectArray[26] = iIlIlllllill[17];
        objectArray[21] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[21] | (Integer)objectArray[26]) - ((Integer)objectArray[21] & (Integer)objectArray[26]);
        objectArray[26] = iIlIlllllill[18];
        objectArray[21] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[21] & ~((Integer)objectArray[26]).intValue()) - (~((Integer)objectArray[21]).intValue() & (Integer)objectArray[26]);
        objectArray2[((Integer)objectArray[2]).intValue()] = inventoryClickEvent;
        Illillliilli.iliIiiliiiii("3b9471a4-67b5-46a8-9ad5-3739a0cbb4ef", (long)8662216563793146090L, (Object[])objectArray2, (String)"GBwC", (int)iIlIlllllill[19], (String)"BQxCAxkS+/hQUFNSUDf1Dg719wgD8AQt6esE8vzn6+ckGeTm7ejyB+H13w==", (String)"NTRLSXpa", (int)iIlIlllllill[20], (String)"Qh8tI/wEFgI7/f/5/zYV+fD89Qs7LBDp8QPvKOrs5uwjAubd6eL4KA==", (int)iIlIlllllill[21], (String)"Q1JodklV", (int)iIlIlllllill[22], (String)"JhwV/vtTU1ZVUzoW+vQT9/b17/MN7C7v6ejnBgXp6ALmI9/+4vzg397d3Nba2Rby0dXUztLMy8/p6McJyuTDwuHA38O9wcC6/Li8ttW0s7exsK+ure/Lr66orKuqpKOnpqA=");
    }

    /*
     * Exception decompiling
     */
    public static String lIiiIiIlilli(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 16[SWITCH]
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
    public Illillliilli() {
        int n;
        int n2 = n = (0x34EBD9B5 | 0xEE9EFEC0) - (0x34EBD9B5 & 0xEE9EFEC0);
        IilliliilIIi = n2 + -291569984 - (n2 & 0xEE9EFEC0) * 2;
        if (1536650168 <= IilliliilIIi) {
        }
        Object[] objectArray = new Object[26];
        objectArray[9] = iIlIlllllill[0];
        objectArray[0] = iIlIlllllill[1];
        objectArray[23] = (int)((Integer)objectArray[9]);
        objectArray[9] = (Integer)objectArray[23] + ~((Integer)objectArray[0]).intValue() + 1;
        objectArray[0] = iIlIlllllill[2];
        objectArray[23] = (int)((Integer)objectArray[9]);
        objectArray[9] = 2 * ((Integer)objectArray[23] | (Integer)objectArray[0]) - ((Integer)objectArray[23] ^ (Integer)objectArray[0]);
        Object[] objectArray2 = new Object[((Integer)objectArray[9]).intValue()];
        objectArray[6] = iIlIlllllill[3];
        objectArray[0] = iIlIlllllill[4];
        objectArray[23] = (int)((Integer)objectArray[6]);
        objectArray[6] = ((Integer)objectArray[23] & ~((Integer)objectArray[0]).intValue()) - (~((Integer)objectArray[23]).intValue() & (Integer)objectArray[0]);
        objectArray[0] = iIlIlllllill[5];
        objectArray[23] = (int)((Integer)objectArray[6]);
        objectArray[6] = 2 * ((Integer)objectArray[23] & ~((Integer)objectArray[0]).intValue()) - ((Integer)objectArray[23] ^ (Integer)objectArray[0]);
        objectArray2[((Integer)objectArray[6]).intValue()] = this;
        Illillliilli.iliIiiliiiii("a55d0297-90a3-469e-9e10-76c035fa44f2", (long)-7473066738880777970L, (Object[])objectArray2, (String)"GR0D", (int)iIlIlllllill[6], (String)"Bg1DBBoT/PlRUVRTUTj2Dw/2+AkE8QUu6uwF8/3o7OglGuXn7unzCOL24A==", (String)"SjRFVWVn", (int)iIlIlllllill[7], (String)"QyAuJP0FFwM8/gD6ADcW+vH99gw8LRHq8gTwKevt5+0kA+fe6uP5KQ==", (int)iIlIlllllill[8], (String)"TDcxUzF6", (int)iIlIlllllill[9], (String)"Jx0W//xUVFdWVDsX+/UU+Pf28PQO7S/w6unoBwbq6QPnJOD/4/3h4N/e3dfb2hfz0tbVz9PNzNDq6cgKy+XEw+LB4MS+wsG7/bm9t9a1tLiysbCvrvDMsK+prayrpaSop6E=");
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle IIIllIIliIIl(String var0, int var1_1, String var2_2, String var3_3, int var4_4, String var5_5, int var6_6, String var7_7, int var8_8, String var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [43[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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


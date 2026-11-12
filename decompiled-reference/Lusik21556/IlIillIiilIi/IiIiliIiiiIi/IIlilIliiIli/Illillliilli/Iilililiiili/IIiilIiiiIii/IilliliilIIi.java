/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 */
package Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii;

import Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.IliIlllilIi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public final class IilliliilIIi
implements CommandExecutor {
    public static int[] IilliliilIIi;
    static AtomicReferenceArray<MethodHandle> iIlIlllllill;
    private IliIlllilIi IliIlllilIi;
    public static int lIiiIiIlilli;
    public static boolean iliIiiliiiii;

    /*
     * Enabled aggressive block sorting
     */
    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] stringArray) {
        if (iliIiiliiiii) {
        }
        Object[] objectArray = new Object[35];
        objectArray[4] = IilliliilIIi[14];
        objectArray[20] = IilliliilIIi[15];
        objectArray[19] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[19] & ~((Integer)objectArray[20]).intValue()) - (~((Integer)objectArray[19]).intValue() & (Integer)objectArray[20]);
        objectArray[20] = IilliliilIIi[16];
        objectArray[19] = (int)((Integer)objectArray[4]);
        objectArray[4] = 2 * ((Integer)objectArray[19] | (Integer)objectArray[20]) - ((Integer)objectArray[19] ^ (Integer)objectArray[20]);
        Object[] objectArray2 = new Object[((Integer)objectArray[4]).intValue()];
        objectArray[28] = IilliliilIIi[17];
        objectArray[20] = IilliliilIIi[18];
        objectArray[19] = (int)((Integer)objectArray[28]);
        objectArray[28] = ((Integer)objectArray[19] | (Integer)objectArray[20]) & ~((Integer)objectArray[19] & (Integer)objectArray[20]);
        objectArray[20] = IilliliilIIi[19];
        objectArray[19] = (int)((Integer)objectArray[28]);
        objectArray[28] = ((Integer)objectArray[19] & ~((Integer)objectArray[20]).intValue()) - (~((Integer)objectArray[19]).intValue() & (Integer)objectArray[20]);
        objectArray2[((Integer)objectArray[28]).intValue()] = this;
        objectArray[18] = IilliliilIIi[20];
        objectArray[20] = IilliliilIIi[21];
        objectArray[19] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[19] ^ (Integer)objectArray[20]) - 2 * (~((Integer)objectArray[19]).intValue() & (Integer)objectArray[20]);
        objectArray[20] = IilliliilIIi[22];
        objectArray[19] = (int)((Integer)objectArray[18]);
        objectArray[18] = (Integer)objectArray[19] - ~((Integer)objectArray[20]).intValue() - 1;
        objectArray2[((Integer)objectArray[18]).intValue()] = commandSender;
        objectArray[3] = IilliliilIIi[23];
        objectArray[20] = IilliliilIIi[24];
        objectArray[19] = (int)((Integer)objectArray[3]);
        objectArray[3] = (Integer)objectArray[19] & ~((Integer)objectArray[20]).intValue() | ~((Integer)objectArray[19]).intValue() & (Integer)objectArray[20];
        objectArray[20] = IilliliilIIi[25];
        objectArray[19] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[19] | (Integer)objectArray[20]) - ((Integer)objectArray[19] & (Integer)objectArray[20]);
        objectArray2[((Integer)objectArray[3]).intValue()] = command;
        objectArray[21] = IilliliilIIi[26];
        objectArray[20] = IilliliilIIi[27];
        objectArray[19] = (int)((Integer)objectArray[21]);
        objectArray[21] = (Integer)objectArray[19] & ~((Integer)objectArray[20]).intValue() | ~((Integer)objectArray[19]).intValue() & (Integer)objectArray[20];
        objectArray[20] = IilliliilIIi[28];
        objectArray[19] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[19] & ~((Integer)objectArray[20]).intValue()) - (~((Integer)objectArray[19]).intValue() & (Integer)objectArray[20]);
        objectArray2[((Integer)objectArray[21]).intValue()] = string;
        objectArray[9] = IilliliilIIi[29];
        objectArray[20] = IilliliilIIi[30];
        objectArray[19] = (int)((Integer)objectArray[9]);
        objectArray[9] = 2 * ((Integer)objectArray[19] & ~((Integer)objectArray[20]).intValue()) - ((Integer)objectArray[19] ^ (Integer)objectArray[20]);
        objectArray[20] = IilliliilIIi[31];
        objectArray[19] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[19] | (Integer)objectArray[20]) - ((Integer)objectArray[19] & (Integer)objectArray[20]);
        objectArray2[((Integer)objectArray[9]).intValue()] = stringArray;
        return (boolean)Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IilliliilIIi.lIiiIiIlilli("f43eee5e-8b69-4a74-9819-9ccb94f14be3", (Object)Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IilliliilIIi.lIiiIiIlilli("2ce73baf-8970-4205-8944-9e23e93785c8", (long)3015097580441483990L, (Object[])objectArray2, (int)IilliliilIIi[32], (String)"czAxcnlr", (int)IilliliilIIi[33], (int)IilliliilIIi[34], (int)IilliliilIIi[35], (int)IilliliilIIi[36], (String)"m5KkZ19cbWKmppWUlq9vUFBpYUpNdnaxf3NGdHp/bXu6nUZQe05Eq1d5WQ==", (String)"eKJfaGWjpZibm6yAbIJla2iGeXh0mn2xn36RcHxylXR3dqlIhqqtQ09BoU9DQqVLR4u5V1RaUlNQXlFfXFKYtFdZKScrJS0sLyEh7cPCJSQoxjk4O9o9PPLeMT88Mjo0Nznp6As=", (String)"nqJk", (String)"VHd3h2pyWHSlYXltYaiPfWZif0+FupJ9Z0tpunxqeHa9nFBJT0x6sg=="), (int)IilliliilIIi[37], (String)"WDl0Y2VT", (int)IilliliilIIi[38], (int)IilliliilIIi[39], (int)IilliliilIIi[40], (int)IilliliilIIi[41], (String)"mJNbZlxdamOlp5qVla5oUVNofktOd3GwfHJJdXl+anq5nHlReE9DqlR4Vg==", (String)"e6OgaWaiopmYmqOBb4NiamuHZnl3m3qwnH+ecX9zknV0d5ZJhauqQkxArk5AQ6JKRIqmVldbVVJTX15eX1OftVRYViYoJCotLCAu7MDDIiUrxyY5ONs6PfHfPj4/Mz01NDjW6Qg=", (String)"o512ZF8=", (String)"V3iXcV1zoGJ0YmyrinpjYWJQmLmY");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String IIIllIIliIIl(String string, int n, int n2) {
        if (iliIiiliiiii) {
            throw new StackOverflowError();
        }
        Object[] objectArray = new Object[5];
        objectArray[4] = Base64.getDecoder().decode(string);
        objectArray[1] = IilliliilIIi[78];
        while (true) {
            if ((Integer)objectArray[1] >= ((byte[])objectArray[4]).length) {
                String string2;
                string2((byte[])objectArray[4], StandardCharsets.UTF_8);
                return string2;
            }
            try {
                byte[] byArray = (byte[])objectArray[4];
                int n3 = (Integer)objectArray[1];
                objectArray[0] = (int)((Integer)objectArray[1]);
                objectArray[2] = n;
                objectArray[0] = (Integer)objectArray[2] + ~((Integer)objectArray[0]).intValue() + 1;
                objectArray[2] = (int)byArray[n3];
                objectArray[0] = n2;
                objectArray[2] = ((Integer)objectArray[2] | (Integer)objectArray[0]) & ~((Integer)objectArray[2] & (Integer)objectArray[0]);
                byArray[n3] = (byte)(((Integer)objectArray[2] & ~((Integer)objectArray[0]).intValue()) - (~((Integer)objectArray[2]).intValue() & (Integer)objectArray[0]));
                objectArray[1] = (Integer)objectArray[1] + 1;
            }
            catch (InstantiationError instantiationError) {
                throw instantiationError;
            }
            catch (ThreadDeath threadDeath) {
                throw threadDeath;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public static String IilliliilIIi(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[CASE], 56[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    public static Class iIlIlllllill(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [12[CASE], 33[UNCONDITIONALDOLOOP]], but top level block is 1[TRYBLOCK]
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
    public static void IlIlllIlilIl() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [26[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    public IilliliilIIi(IliIlllilIi iliIlllilIi) {
        if (iliIiiliiiii) {
        }
        Object[] objectArray = new Object[28];
        objectArray[9] = IilliliilIIi[0];
        objectArray[20] = IilliliilIIi[1];
        objectArray[4] = (int)((Integer)objectArray[9]);
        objectArray[9] = 2 * ((Integer)objectArray[4] | (Integer)objectArray[20]) - ((Integer)objectArray[4] ^ (Integer)objectArray[20]);
        objectArray[20] = IilliliilIIi[2];
        objectArray[4] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[4] | (Integer)objectArray[20]) & (~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[20]).intValue());
        Object[] objectArray2 = new Object[((Integer)objectArray[9]).intValue()];
        objectArray[7] = IilliliilIIi[3];
        objectArray[20] = IilliliilIIi[4];
        objectArray[4] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[4] | (Integer)objectArray[20]) & ~((Integer)objectArray[4] & (Integer)objectArray[20]);
        objectArray[20] = IilliliilIIi[5];
        objectArray[4] = (int)((Integer)objectArray[7]);
        objectArray[7] = 2 * ((Integer)objectArray[4] | (Integer)objectArray[20]) - ((Integer)objectArray[4] ^ (Integer)objectArray[20]);
        objectArray2[((Integer)objectArray[7]).intValue()] = this;
        objectArray[18] = IilliliilIIi[6];
        objectArray[20] = IilliliilIIi[7];
        objectArray[4] = (int)((Integer)objectArray[18]);
        objectArray[18] = 2 * ((Integer)objectArray[4] & ~((Integer)objectArray[20]).intValue()) - ((Integer)objectArray[4] ^ (Integer)objectArray[20]);
        objectArray[20] = IilliliilIIi[8];
        objectArray[4] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[4] | (Integer)objectArray[20]) & ~((Integer)objectArray[4] & (Integer)objectArray[20]);
        objectArray2[((Integer)objectArray[18]).intValue()] = iliIlllilIi;
        Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IilliliilIIi.lIiiIiIlilli("907396eb-21d5-4c1c-9493-1310b92e914a", (long)1690310420799879210L, (Object[])objectArray2, (int)IilliliilIIi[9], (String)"UFhmR05D", (int)IilliliilIIi[10], (int)IilliliilIIi[11], (int)IilliliilIIi[12], (int)IilliliilIIi[13], (String)"mm2lZF5bbGGnqZSXl6huU1F2YElMcXeyfnxHd3t4bHi7okdTeklFqFZ2WA==", (String)"eV1ea2SkpJualK2DbYVkaGmZeHt1nXyynnGQc311lHd2SahLh62sQE5OoExCRaRIRpS4VFVdU1BRUVBcXVWZt1YmKCQqIiwvLi4g7sLFJCcp2Tg7Ot08P/PRMDw9NTs3Ngbo6wo=", (String)"n11l", (String)"VYh2hGt1WXekbnhuYK+Ofmd9fkyEvZN+ZkRouX1teXW8o1FKTkt7sQ==");
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle iliIiiliiiii(int var0, String var1_1, int var2_2, int var3_3, int var4_4, int var5_5, String var6_6, String var7_7, String var8_8, String var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK], 1[TRYBLOCK]], but top level block is 15[SWITCH]
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
        if (iliIiiliiiii) {
            throw new IllegalStateException();
        }
        int n = (0x3662E301 | 0x8807EBB6) - (0x3662E301 & 0x8807EBB6);
        int cfr_ignored_0 = n + -2012746826;
        Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IilliliilIIi.IlIlllIlilIl();
        Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IilliliilIIi.lIiiIiIlilli("226a2ebc-1762-42b9-8365-28fb5492c89d", IilliliilIIi.class, (int)IilliliilIIi[42], (String)"VWR2TTQ3", (int)IilliliilIIi[43], (int)IilliliilIIi[44], (int)IilliliilIIi[45], (int)IilliliilIIi[46], (String)"mZBamV1ea2SkpJualK1pVlJrf1RPdHC3fXFIenh9a324n3hueUxCrVV7Vw==", (String)"eqChlmeho56ZmaKOboBjbWqEZ2Z2mHu3nXyffn5wk3J1dJd2hKirRU1Dr0FBQKNNRYmnSVZYVFVSXF9RXlCeslVbV1kpJysqLSMv48HAIyIqxCcmOdg7OvDcPzE+MDwyNTvX1gk=", (String)"mp6PkXxk", (String)"VnuWjlxwoWV1YW2kh297VFOap3M=");
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite lIiiIiIlilli(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        if (iliIiiliiiii) {
        }
        Object[] objectArray = new Object[14];
        objectArray[4] = MethodHandles.lookup();
        objectArray[3] = ((MethodHandles.Lookup)objectArray[4]).findStatic(IilliliilIIi.class, "iliIiiliiiii", MethodType.fromMethodDescriptorString("(ILjava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
        objectArray[11] = methodType.parameterCount();
        objectArray[9] = IilliliilIIi[47];
        objectArray[10] = (int)((Integer)objectArray[11]);
        objectArray[1] = (Integer)objectArray[10] + ~((Integer)objectArray[9]).intValue() + 1;
        objectArray[12] = methodType.dropParameterTypes((Integer)objectArray[1], (Integer)objectArray[11]);
        objectArray[0] = MethodHandles.invoker((MethodType)objectArray[12]);
        Class[] classArray = new Class[IilliliilIIi[48]];
        classArray[Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IilliliilIIi.IilliliilIIi[49]] = MethodHandle.class;
        objectArray[13] = ((MethodType)objectArray[12]).appendParameterTypes(classArray);
        objectArray[9] = IilliliilIIi[50];
        objectArray[10] = (int)((Integer)objectArray[1]);
        objectArray[5] = new int[((Integer)objectArray[10] ^ (Integer)objectArray[9]) + 2 * ((Integer)objectArray[10] & (Integer)objectArray[9])];
        ((int[])objectArray[5])[Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.IilliliilIIi.IilliliilIIi[51]] = (Integer)objectArray[1];
        objectArray[6] = IilliliilIIi[52];
        while (true) {
            int n = (0x2CBBBD94 | 0x29B21641) - (0x2CBBBD94 & 0x29B21641);
            boolean bl = true;
            block11: while (true) {
                if (!bl || (bl = false) || !true) {
                    objectArray[9] = IilliliilIIi[54];
                    objectArray[10] = (int)((Integer)objectArray[6]);
                    ((int[])objectArray[5])[((Integer)objectArray[6]).intValue()] = ((Integer)objectArray[10] ^ (Integer)objectArray[9]) - 2 * (~((Integer)objectArray[10]).intValue() & (Integer)objectArray[9]);
                    n = (0x43DBA8F | 0x29B21641) - (0x43DBA8F & 0x29B21641);
                }
                int n2 = n;
                switch (n2 + 699536961 - (n2 & 0x29B21641) * 2) {
                    default: {
                        objectArray[9] = IilliliilIIi[53];
                        objectArray[10] = (int)((Integer)objectArray[1]);
                        if ((Integer)objectArray[6] < 2 * ((Integer)objectArray[10] | (Integer)objectArray[9]) - ((Integer)objectArray[10] ^ (Integer)objectArray[9])) continue block11;
                        objectArray[2] = MethodHandles.permuteArguments((MethodHandle)objectArray[0], (MethodType)objectArray[13], (int[])objectArray[5]);
                        objectArray[7] = MethodHandles.collectArguments((MethodHandle)objectArray[2], (Integer)objectArray[1], (MethodHandle)objectArray[3]);
                        return new ConstantCallSite((MethodHandle)objectArray[7]);
                    }
                    case 1840758291: {
                        continue block11;
                    }
                    case 71154319: 
                }
                break;
            }
            objectArray[6] = (Integer)objectArray[6] + 1;
        }
    }
}


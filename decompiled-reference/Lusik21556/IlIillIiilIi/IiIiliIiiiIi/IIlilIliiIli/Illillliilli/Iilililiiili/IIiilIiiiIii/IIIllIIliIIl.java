/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.command.TabCompleter
 */
package Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii;

import Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public final class IIIllIIliIIl
implements CommandExecutor,
TabCompleter {
    private IliIlllilIi IliIlllilIi;
    public static int[] IilliliilIIi;
    static AtomicReferenceArray<MethodHandle> iIlIlllllill;
    public static int lIiiIiIlilli;
    public static boolean iliIiiliiiii;

    /*
     * Exception decompiling
     */
    public static MethodHandle IlIlllIlilIl(int var0, int var1_1, String var2_2, String var3_3, int var4_4, String var5_5, String var6_6, String var7_7, String var8_8, int var9_9) {
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
            int n = (0x2834C954 | 0x9C516D17) - (0x2834C954 & 0x9C516D17);
        }
        IIIllIIliIIl.IIlllIlliIll();
        int n = (0x6A4A5860 | 0x610A2AE2) - (0x6A4A5860 & 0x610A2AE2);
        int cfr_ignored_0 = n + 1628056290;
        IIIllIIliIIl.IIIllIIliIIl("fd716c41-6876-4ff7-a0ff-96658735cf8b", IIIllIIliIIl.class, (int)IilliliilIIi[78], (int)IilliliilIIi[79], (String)"qqyhpZCm", (String)"MGJ4b1RX", (int)IilliliilIIi[80], (String)"Nm5BR1hB", (String)"irKvqK11dXB7fWKAnoKlobqWubi2mr13j66RsK6ylbSHhqmISKqtiX+DoYWDgqWBl125nZaamJmSjpGVjpJOtGdraW1rZ21sX2Nho0NCZWR6Vnl4e1p9fLROUVBub1VUSkZpaEY=", (String)"ZoumoLCiZ6mnpatijZ+tuqFoeYM=", (String)"q6Jqra+0rap4dn18eGGfuKK7saKltqR3r7WsvKyxvbFMr4yAm36SoYebiQ==", (int)IilliliilIIi[81]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public IIIllIIliIIl(IliIlllilIi iliIlllilIi) {
        int n;
        int n2 = n = (0x1255E16B | 0x9930DDB5) - (0x1255E16B & 0x9930DDB5);
        if (241084538 >= n2 + -1724850763 - (n2 & 0x9930DDB5) * 2) {
            int cfr_ignored_0 = 80 + 36;
        }
        Object[] objectArray = new Object[28];
        objectArray[24] = IilliliilIIi[0];
        objectArray[10] = IilliliilIIi[1];
        objectArray[12] = (int)((Integer)objectArray[24]);
        objectArray[24] = 2 * ((Integer)objectArray[12] & ~((Integer)objectArray[10]).intValue()) - ((Integer)objectArray[12] ^ (Integer)objectArray[10]);
        objectArray[10] = IilliliilIIi[2];
        objectArray[12] = (int)((Integer)objectArray[24]);
        objectArray[24] = 2 * ((Integer)objectArray[12] | (Integer)objectArray[10]) - ((Integer)objectArray[12] ^ (Integer)objectArray[10]);
        Object[] objectArray2 = new Object[((Integer)objectArray[24]).intValue()];
        objectArray[27] = IilliliilIIi[3];
        objectArray[10] = IilliliilIIi[4];
        objectArray[12] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[12] | (Integer)objectArray[10]) & (~((Integer)objectArray[12]).intValue() | ~((Integer)objectArray[10]).intValue());
        objectArray[10] = IilliliilIIi[5];
        objectArray[12] = (int)((Integer)objectArray[27]);
        objectArray[27] = (Integer)objectArray[12] & ~((Integer)objectArray[10]).intValue() | ~((Integer)objectArray[12]).intValue() & (Integer)objectArray[10];
        objectArray2[((Integer)objectArray[27]).intValue()] = this;
        objectArray[22] = IilliliilIIi[6];
        objectArray[10] = IilliliilIIi[7];
        objectArray[12] = (int)((Integer)objectArray[22]);
        objectArray[22] = (Integer)objectArray[12] - ~((Integer)objectArray[10]).intValue() - 1;
        objectArray[10] = IilliliilIIi[8];
        objectArray[12] = (int)((Integer)objectArray[22]);
        objectArray[22] = (Integer)objectArray[12] + ~((Integer)objectArray[10]).intValue() + 1;
        objectArray2[((Integer)objectArray[22]).intValue()] = iliIlllilIi;
        IIIllIIliIIl.IIIllIIliIIl("b0f458b7-54c5-4cb2-a957-081e8e02765f", (long)3011188717626016772L, (Object[])objectArray2, (int)IilliliilIIi[9], (int)IilliliilIIi[10], (String)"qqyk", (String)"cDY5RXBP", (int)IilliliilIIi[11], (String)"aFpGNURk", (String)"hKypoqdvb2p1d1x6mHyfm7SQs7KwlLdxiaiLqqisj66BgKOCQqSng3l9m399fJ97kVezl5CUkpOMiIuPiIxIrmFlY2dlYWdmWV1bnT08X150UHNydVR3dq5IS0poaU9OREBjYkA=", (String)"YIORh6acqJ5fnaOdo1p5pbKsqZ9ndJK1saezbKi0qLBHpniBeX6KVA==", (String)"pZxkp6mup6RycHd2cluZspy1q5yfsJ5xqa+mtqart6tGqYZ6lXiMm4GVgw==", (int)IilliliilIIi[12]);
    }

    /*
     * Exception decompiling
     */
    private static String IiIlliIliiIl(String var0, int var1_1, int var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[UNCONDITIONALDOLOOP]], but top level block is 2[TRYBLOCK]
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

    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] stringArray) {
        Object[] objectArray = new Object[46];
        objectArray[14] = IilliliilIIi[13];
        objectArray[30] = IilliliilIIi[14];
        objectArray[6] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[6] | (Integer)objectArray[30]) - ((Integer)objectArray[6] & (Integer)objectArray[30]);
        objectArray[30] = IilliliilIIi[15];
        objectArray[6] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[6] | (Integer)objectArray[30]) & (~((Integer)objectArray[6]).intValue() | ~((Integer)objectArray[30]).intValue());
        Object[] objectArray2 = new Object[((Integer)objectArray[14]).intValue()];
        objectArray[28] = IilliliilIIi[16];
        objectArray[30] = IilliliilIIi[17];
        objectArray[6] = (int)((Integer)objectArray[28]);
        objectArray[28] = 2 * ((Integer)objectArray[6] | (Integer)objectArray[30]) - ((Integer)objectArray[6] ^ (Integer)objectArray[30]);
        objectArray[30] = IilliliilIIi[18];
        objectArray[6] = (int)((Integer)objectArray[28]);
        objectArray[28] = 2 * ((Integer)objectArray[6] & ~((Integer)objectArray[30]).intValue()) - ((Integer)objectArray[6] ^ (Integer)objectArray[30]);
        objectArray2[((Integer)objectArray[28]).intValue()] = this;
        objectArray[19] = IilliliilIIi[19];
        objectArray[30] = IilliliilIIi[20];
        objectArray[6] = (int)((Integer)objectArray[19]);
        objectArray[19] = (Integer)objectArray[6] - ~((Integer)objectArray[30]).intValue() - 1;
        objectArray[30] = IilliliilIIi[21];
        objectArray[6] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[6] | (Integer)objectArray[30]) + ((Integer)objectArray[6] & (Integer)objectArray[30]);
        objectArray2[((Integer)objectArray[19]).intValue()] = commandSender;
        objectArray[34] = IilliliilIIi[22];
        objectArray[30] = IilliliilIIi[23];
        objectArray[6] = (int)((Integer)objectArray[34]);
        objectArray[34] = 2 * ((Integer)objectArray[6] & ~((Integer)objectArray[30]).intValue()) - ((Integer)objectArray[6] ^ (Integer)objectArray[30]);
        objectArray[30] = IilliliilIIi[24];
        objectArray[6] = (int)((Integer)objectArray[34]);
        objectArray[34] = ((Integer)objectArray[6] | (Integer)objectArray[30]) - ((Integer)objectArray[6] & (Integer)objectArray[30]);
        objectArray2[((Integer)objectArray[34]).intValue()] = command;
        objectArray[27] = IilliliilIIi[25];
        objectArray[30] = IilliliilIIi[26];
        objectArray[6] = (int)((Integer)objectArray[27]);
        objectArray[27] = (Integer)objectArray[6] & ~((Integer)objectArray[30]).intValue() | ~((Integer)objectArray[6]).intValue() & (Integer)objectArray[30];
        objectArray[30] = IilliliilIIi[27];
        objectArray[6] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[6] ^ (Integer)objectArray[30]) + 2 * ((Integer)objectArray[6] & (Integer)objectArray[30]);
        objectArray2[((Integer)objectArray[27]).intValue()] = string;
        objectArray[7] = IilliliilIIi[28];
        objectArray[30] = IilliliilIIi[29];
        objectArray[6] = (int)((Integer)objectArray[7]);
        objectArray[7] = 2 * ((Integer)objectArray[6] & ~((Integer)objectArray[30]).intValue()) - ((Integer)objectArray[6] ^ (Integer)objectArray[30]);
        objectArray[30] = IilliliilIIi[30];
        objectArray[6] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[6] | (Integer)objectArray[30]) & ~((Integer)objectArray[6] & (Integer)objectArray[30]);
        objectArray2[((Integer)objectArray[7]).intValue()] = stringArray;
        return (boolean)IIIllIIliIIl.IIIllIIliIIl("f83b34b6-2d91-4fb2-9c01-d939fe9126c7", (Object)IIIllIIliIIl.IIIllIIliIIl("bfa4704f-6c93-432e-9599-8dd4ceb52772", (long)6196971454739738452L, (Object[])objectArray2, (int)IilliliilIIi[31], (int)IilliliilIIi[32], (String)"q62l", (String)"UGFTbldt", (int)IilliliilIIi[33], (String)"bnBWczBJ", (String)"ha2qo6hwcGt2eF17mX2gnLWRtLOxlbhyiqmMq6mtkK+CgaSDQ6WohHp+nIB+faB8kli0mJGVk5SNiYyQiY1Jr2JmZGhmYmhnWl5cnj49YF91UXRzdlV4d69JTEtpalBPRUFkY0E=", (String)"YYSSiKedqZ9gnqSepFt6prOtqqBodZO2sqi0bam1qbFIp3mCen+LVQ==", (String)"pp1lqKqvqKVzcXh3c1yas522rJ2gsZ9yqrCnt6esuKxHqod7lnmNnIKWhA==", (int)IilliliilIIi[34]), (int)IilliliilIIi[35], (int)IilliliilIIi[36], (String)"rqiFp6o=", (String)"cWk3VDJo", (int)IilliliilIIi[37], (String)"dXBlNjRm", (String)"hq6rpKlxcWx3eV58mn6hnbaStbSylrlzi6qNrKqukbCDgqWERKaphXt/nYF/fqF9k1m1mZKWlJWOio2Rio5KsGNnZWlnY2loW19dnz8+YWB2UnV0d1Z5eLBKTUxqa1FQRkJlZEI=", (String)"YoeinKyeY6WjoadefamepK2fY3SX", (String)"p55mqauwqaZ0cnl4dF2btJ63rZ6hsqBzq7GouKitua1Iq4h8l3qOnYOXhQ==", (int)IilliliilIIi[38]);
    }

    /*
     * Exception decompiling
     */
    public static Class lIiiIiIlilli(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[CASE]], but top level block is 0[TRYBLOCK]
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ boolean lambda$onTabComplete$0(String[] stringArray, String string) {
        if (iliIiiliiiii) {
        }
        Object[] objectArray = new Object[28];
        objectArray[10] = IilliliilIIi[61];
        objectArray[11] = IilliliilIIi[62];
        objectArray[12] = (int)((Integer)objectArray[10]);
        objectArray[10] = (Integer)objectArray[12] & ~((Integer)objectArray[11]).intValue() | ~((Integer)objectArray[12]).intValue() & (Integer)objectArray[11];
        objectArray[11] = IilliliilIIi[63];
        objectArray[12] = (int)((Integer)objectArray[10]);
        objectArray[10] = 2 * ((Integer)objectArray[12] | (Integer)objectArray[11]) - ((Integer)objectArray[12] ^ (Integer)objectArray[11]);
        Object[] objectArray2 = new Object[((Integer)objectArray[10]).intValue()];
        objectArray[15] = IilliliilIIi[64];
        objectArray[11] = IilliliilIIi[65];
        objectArray[12] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[12] & ~((Integer)objectArray[11]).intValue()) - (~((Integer)objectArray[12]).intValue() & (Integer)objectArray[11]);
        objectArray[11] = IilliliilIIi[66];
        objectArray[12] = (int)((Integer)objectArray[15]);
        objectArray[15] = (Integer)objectArray[12] & ~((Integer)objectArray[11]).intValue() | ~((Integer)objectArray[12]).intValue() & (Integer)objectArray[11];
        objectArray2[((Integer)objectArray[15]).intValue()] = stringArray;
        objectArray[0] = IilliliilIIi[67];
        objectArray[11] = IilliliilIIi[68];
        objectArray[12] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[12] ^ (Integer)objectArray[11]) - 2 * (~((Integer)objectArray[12]).intValue() & (Integer)objectArray[11]);
        objectArray[11] = IilliliilIIi[69];
        objectArray[12] = (int)((Integer)objectArray[0]);
        objectArray[0] = (Integer)objectArray[12] + ~((Integer)objectArray[11]).intValue() + 1;
        objectArray2[((Integer)objectArray[0]).intValue()] = string;
        return (boolean)IIIllIIliIIl.IIIllIIliIIl("d198f34c-7b4f-45a7-aba9-21a033be444d", (Object)IIIllIIliIIl.IIIllIIliIIl("86e9e3a3-5e3b-4ef5-8637-cef359c42609", (long)4996443958500831650L, (Object[])objectArray2, (int)IilliliilIIi[70], (int)IilliliilIIi[71], (String)"rrCo", (String)"STRFTGJR", (int)IilliliilIIi[72], (String)"d0p6bEtQ", (String)"iLCtpqtzc255e2B+nICjn7iUt7a0mLt1jayPrqywk7KFhKeGRqirh32Bn4OBgKN/lVu3m5SYlpeQjI+TjJBMsmVpZ2tpZWtqXWFfoUFAY2J4VHd2eVh7erJMT05sbVNSSERnZkQ=", (String)"ZIeVi6qgrKJjoaehp159qbawraNreJa5tau3cKy4rLRLqnyFfYKOWA==", (String)"qaBoq62yq6h2dHt6dl+dtqC5r6CjtKJ1rbOquqqvu69KrYp+mXyQn4WZhw==", (int)IilliliilIIi[73]), (int)IilliliilIIi[74], (int)IilliliilIIi[75], (String)"sauIqq0=", (String)"UzNaYTBa", (int)IilliliilIIi[76], (String)"UVRjUkU2", (String)"ibGup6x0dG96fGF/nYGkoLmVuLe1mbx2jq2Qr62xlLOGhaiHR6msiH6CoISCgaSAlly4nJWZl5iRjZCUjZFNs2ZqaGxqZmxrXmJgokJBZGN5VXh3ell8e7NNUE9tblRTSUVoZ0U=", (String)"ZYqln6+hZqimpKphgKyhp7CiZnea", (String)"qqFprK6zrKl3dXx7d2Cet6G6sKGktaN2rrSru6uwvLBLrot/mn2RoIaaiA==", (int)IilliliilIIi[77]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public List<String> onTabComplete(CommandSender commandSender, Command command, String string, String[] stringArray) {
        int n;
        int n2 = n = (0x174C474F | 0x4B6401C4) - (0x174C474F & 0x4B6401C4);
        lIiiIiIlilli = n2 + 1264845252 - (n2 & 0x4B6401C4) * 2;
        if (1330316621 < lIiiIiIlilli) {
        }
        Object[] objectArray = new Object[35];
        int n3 = (0x9BF67250 | 0x11FC2EB1) - (0x9BF67250 & 0x11FC2EB1);
        int cfr_ignored_0 = n3 + 301739697;
        objectArray[25] = IilliliilIIi[39];
        objectArray[20] = IilliliilIIi[40];
        objectArray[4] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[4] | (Integer)objectArray[20]) & (~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[20]).intValue());
        objectArray[20] = IilliliilIIi[41];
        objectArray[4] = (int)((Integer)objectArray[25]);
        objectArray[25] = (Integer)objectArray[4] + ~((Integer)objectArray[20]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[25]).intValue()];
        objectArray[21] = IilliliilIIi[42];
        objectArray[20] = IilliliilIIi[43];
        objectArray[4] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[4] | (Integer)objectArray[20]) & (~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[20]).intValue());
        objectArray[20] = IilliliilIIi[44];
        objectArray[4] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[4] | (Integer)objectArray[20]) & ~((Integer)objectArray[4] & (Integer)objectArray[20]);
        objectArray2[((Integer)objectArray[21]).intValue()] = this;
        objectArray[2] = IilliliilIIi[45];
        objectArray[20] = IilliliilIIi[46];
        objectArray[4] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[4] | (Integer)objectArray[20]) + ((Integer)objectArray[4] & (Integer)objectArray[20]);
        objectArray[20] = IilliliilIIi[47];
        objectArray[4] = (int)((Integer)objectArray[2]);
        objectArray[2] = (Integer)objectArray[4] + ~((Integer)objectArray[20]).intValue() + 1;
        objectArray2[((Integer)objectArray[2]).intValue()] = commandSender;
        objectArray[27] = IilliliilIIi[48];
        objectArray[20] = IilliliilIIi[49];
        objectArray[4] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[4] | (Integer)objectArray[20]) & (~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[20]).intValue());
        objectArray[20] = IilliliilIIi[50];
        objectArray[4] = (int)((Integer)objectArray[27]);
        objectArray[27] = (Integer)objectArray[4] & ~((Integer)objectArray[20]).intValue() | ~((Integer)objectArray[4]).intValue() & (Integer)objectArray[20];
        objectArray2[((Integer)objectArray[27]).intValue()] = command;
        objectArray[32] = IilliliilIIi[51];
        objectArray[20] = IilliliilIIi[52];
        objectArray[4] = (int)((Integer)objectArray[32]);
        objectArray[32] = ((Integer)objectArray[4] | (Integer)objectArray[20]) & ~((Integer)objectArray[4] & (Integer)objectArray[20]);
        objectArray[20] = IilliliilIIi[53];
        objectArray[4] = (int)((Integer)objectArray[32]);
        objectArray[32] = (Integer)objectArray[4] & ~((Integer)objectArray[20]).intValue() | ~((Integer)objectArray[4]).intValue() & (Integer)objectArray[20];
        objectArray2[((Integer)objectArray[32]).intValue()] = string;
        objectArray[16] = IilliliilIIi[54];
        objectArray[20] = IilliliilIIi[55];
        objectArray[4] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[4] - ~((Integer)objectArray[20]).intValue() - 1;
        objectArray[20] = IilliliilIIi[56];
        objectArray[4] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[4] | (Integer)objectArray[20]) - ((Integer)objectArray[4] & (Integer)objectArray[20]);
        objectArray2[((Integer)objectArray[16]).intValue()] = stringArray;
        return (List)((Object)IIIllIIliIIl.IIIllIIliIIl("03444447-4c3d-46bc-b717-2aa3413cce37", (long)-2328990139569129716L, (Object[])objectArray2, (int)IilliliilIIi[57], (int)IilliliilIIi[58], (String)"ra+n", (String)"V3ZITGw0", (int)IilliliilIIi[59], (String)"SFhoR3hm", (String)"h6+spapycm14el99m3+inreTtrWzl7p0jKuOrauvkrGEg6aFRaeqhnyAnoKAf6J+lFq2mpOXlZaPi46Si49LsWRoZmpoZGppXGBeoEA/YmF3U3Z1eFd6ebFLTk1rbFJRR0NmZUM=", (String)"Y4aUiqmfq6FioKagpl18qLWvrKJqd5W4tKq2b6u3q7NKqXuEfIGNVw==", (String)"qJ9nqqyxqqd1c3p5dV6ctZ+4rp+is6F0rLKpuamuuq5JrIl9mHuPnoSYhg==", (int)IilliliilIIi[60]));
    }

    /*
     * Exception decompiling
     */
    public static String iliIiiliiiii(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [61[UNCONDITIONALDOLOOP]], but top level block is 1[TRYBLOCK]
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
    public static CallSite IIIllIIliIIl(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        int n;
        int n2 = n = (0x2B8EBCF4 | 0x788246DA) - (0x2B8EBCF4 & 0x788246DA);
        lIiiIiIlilli = n2 + 2021803738 - (n2 & 0x788246DA) * 2;
        if (1159322892 < lIiiIiIlilli) {
        }
        Object[] objectArray = new Object[16];
        objectArray[14] = MethodHandles.lookup();
        objectArray[4] = ((MethodHandles.Lookup)objectArray[14]).findStatic(IIIllIIliIIl.class, "IlIlllIlilIl", MethodType.fromMethodDescriptorString("(IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
        objectArray[15] = methodType.parameterCount();
        objectArray[9] = IilliliilIIi[82];
        objectArray[6] = (int)((Integer)objectArray[15]);
        objectArray[12] = ((Integer)objectArray[6] & ~((Integer)objectArray[9]).intValue()) - (~((Integer)objectArray[6]).intValue() & (Integer)objectArray[9]);
        int n3 = (0xDC75FD0F | 0x63F4D3EA) - (0xDC75FD0F & 0x63F4D3EA);
        int cfr_ignored_0 = n3 + 1676989418;
        objectArray[13] = methodType.dropParameterTypes((Integer)objectArray[12], (Integer)objectArray[15]);
        objectArray[1] = MethodHandles.invoker((MethodType)objectArray[13]);
        int n4 = (0xD82704C5 | 0xB514F8A) - (0xD82704C5 & 0xB514F8A);
        int cfr_ignored_1 = n4 + 189878154;
        Class[] classArray = new Class[IilliliilIIi[83]];
        classArray[IIIllIIliIIl.IilliliilIIi[84]] = MethodHandle.class;
        objectArray[5] = ((MethodType)objectArray[13]).appendParameterTypes(classArray);
        objectArray[9] = IilliliilIIi[85];
        objectArray[6] = (int)((Integer)objectArray[12]);
        objectArray[7] = new int[((Integer)objectArray[6] | (Integer)objectArray[9]) + ((Integer)objectArray[6] & (Integer)objectArray[9])];
        ((int[])objectArray[7])[IIIllIIliIIl.IilliliilIIi[86]] = (Integer)objectArray[12];
        objectArray[10] = IilliliilIIi[87];
        while (true) {
            objectArray[9] = IilliliilIIi[88];
            objectArray[6] = (int)((Integer)objectArray[12]);
            if ((Integer)objectArray[10] >= ((Integer)objectArray[6] | (Integer)objectArray[9]) + ((Integer)objectArray[6] & (Integer)objectArray[9])) {
                objectArray[3] = MethodHandles.permuteArguments((MethodHandle)objectArray[1], (MethodType)objectArray[5], (int[])objectArray[7]);
                objectArray[2] = MethodHandles.collectArguments((MethodHandle)objectArray[3], (Integer)objectArray[12], (MethodHandle)objectArray[4]);
                return new ConstantCallSite((MethodHandle)objectArray[2]);
            }
            try {
                objectArray[9] = IilliliilIIi[89];
                objectArray[6] = (int)((Integer)objectArray[10]);
                ((int[])objectArray[7])[((Integer)objectArray[10]).intValue()] = ((Integer)objectArray[6] ^ (Integer)objectArray[9]) - 2 * (~((Integer)objectArray[6]).intValue() & (Integer)objectArray[9]);
                objectArray[10] = (Integer)objectArray[10] + 1;
            }
            catch (VerifyError verifyError) {
                throw verifyError;
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                throw cloneNotSupportedException;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public static void IIlllIlliIll() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [30[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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


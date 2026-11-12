/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.kyori.adventure.text.minimessage.MiniMessage
 *  org.bukkit.Location
 *  org.bukkit.NamespacedKey
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.PlayerInventory
 *  org.bukkit.inventory.meta.ItemMeta
 */
package Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll;

import Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi;
import java.io.SyncFailedException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.ConcurrentModificationException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public final class liiiIIllIl {
    public static int[] iliIiiliiiii;
    private static MiniMessage IliIlllilIi;
    static AtomicReferenceArray<MethodHandle> lIiiIiIlilli;
    public static NamespacedKey iIlIlllllill;
    public static NamespacedKey liiiIIllIl;
    public static int IIIllIIliIIl;
    public static boolean IlIlllIlilIl;

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void Iiilliiliiil(Location location, ItemMeta itemMeta) {
        int n;
        int n2 = n = (0x52AB3FE1 | 0x4116E8A2) - (0x52AB3FE1 & 0x4116E8A2);
        if (121271034 >= n2 + 1092020386 - (n2 & 0x4116E8A2) * 2) {
            int cfr_ignored_0 = 0x33 & 1;
        }
        Object[] objectArray = new Object[30];
        int n3 = (0x26F03B6 | 0x8929F434) - (0x26F03B6 & 0x8929F434);
        int cfr_ignored_1 = n3 + -1993739212;
        objectArray[11] = iliIiiliiiii[216];
        objectArray[7] = iliIiiliiiii[217];
        objectArray[22] = (int)((Integer)objectArray[11]);
        objectArray[11] = 2 * ((Integer)objectArray[22] & ~((Integer)objectArray[7]).intValue()) - ((Integer)objectArray[22] ^ (Integer)objectArray[7]);
        objectArray[7] = iliIiiliiiii[218];
        objectArray[22] = (int)((Integer)objectArray[11]);
        objectArray[11] = (Integer)objectArray[22] + ~((Integer)objectArray[7]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[11]).intValue()];
        objectArray[13] = iliIiiliiiii[219];
        objectArray[7] = iliIiiliiiii[220];
        objectArray[22] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[22] & ~((Integer)objectArray[7]).intValue()) - (~((Integer)objectArray[22]).intValue() & (Integer)objectArray[7]);
        objectArray[7] = iliIiiliiiii[221];
        objectArray[22] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[22] ^ (Integer)objectArray[7]) - 2 * (~((Integer)objectArray[22]).intValue() & (Integer)objectArray[7]);
        objectArray2[((Integer)objectArray[13]).intValue()] = location;
        objectArray[14] = iliIiiliiiii[222];
        objectArray[7] = iliIiiliiiii[223];
        objectArray[22] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[22] ^ (Integer)objectArray[7]) - 2 * (~((Integer)objectArray[22]).intValue() & (Integer)objectArray[7]);
        objectArray[7] = iliIiiliiiii[224];
        objectArray[22] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[22] | (Integer)objectArray[7]) + ((Integer)objectArray[22] & (Integer)objectArray[7]);
        objectArray2[((Integer)objectArray[14]).intValue()] = itemMeta;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("ff8584fa-8f97-4e28-9325-8b0ff4971af0", (long)-7247079963881987446L, (Object[])objectArray2, (String)"WlZhalNP", (String)"kLq/sLV7ZWBjY2yIi4qio4eGpqCDglqZf1l5X1xddVNXUXFXlnJNbEhJSWhMSkVkQINhYERFelx4eXlYfH2wc3d2cVBTdWpMaA==", (int)iliIiiliiiii[225], (int)iliIiiliiiii[226], (String)"vrq0", (int)iliIiiliiiii[227], (int)iliIiiliiiii[228], (String)"s4p0t7+8rapmZmVkZm+vqKihmbKtplaZX1tWZFJfbVOSfVZoQ25Ek3dBcQ==", (int)iliIiiliiiii[229], (String)"dJeHl7KKoJRlqZGtqWCPnaaan691YnpdZ1NhklxiUFadfGhRb2xCmg==");
    }

    /*
     * Exception decompiling
     */
    public static Class IiiIlliiIl(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: CONTINUE without a while class org.benf.cfr.reader.bytecode.analysis.parse.statement.AssignmentSimple
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getTargetStartBlock(GotoStatement.java:102)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.statement.GotoStatement.getStructuredStatement(GotoStatement.java:116)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.getStructuredStatementPlaceHolder(Op03SimpleStatement.java:550)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:727)
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
    public static void liIlliiIll() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [70[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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

    public static void IlIlllIlilIl(PlayerInventory playerInventory) {
        Object[] objectArray = new Object[27];
        objectArray[18] = iliIiiliiiii[114];
        objectArray[7] = iliIiiliiiii[115];
        objectArray[20] = (int)((Integer)objectArray[18]);
        objectArray[18] = 2 * ((Integer)objectArray[20] | (Integer)objectArray[7]) - ((Integer)objectArray[20] ^ (Integer)objectArray[7]);
        objectArray[7] = iliIiiliiiii[116];
        objectArray[20] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[20] ^ (Integer)objectArray[7]) + 2 * ((Integer)objectArray[20] & (Integer)objectArray[7]);
        Object[] objectArray2 = new Object[((Integer)objectArray[18]).intValue()];
        objectArray[14] = iliIiiliiiii[117];
        objectArray[7] = iliIiiliiiii[118];
        objectArray[20] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[20] ^ (Integer)objectArray[7]) + 2 * ((Integer)objectArray[20] & (Integer)objectArray[7]);
        objectArray[7] = iliIiiliiiii[119];
        objectArray[20] = (int)((Integer)objectArray[14]);
        objectArray[14] = (Integer)objectArray[20] + ~((Integer)objectArray[7]).intValue() + 1;
        objectArray2[((Integer)objectArray[14]).intValue()] = playerInventory;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("7346a541-751e-494d-98e6-3e75418d8c64", (long)-900195626799703672L, (Object[])objectArray2, (String)"bGFZR2RK", (String)"iaWmq6xsbGtqbGWDgn1bWH55X1t6dVOSdlZwVFVKbEhOTmhMj2VEZ0FGQGNFfXxfebxYW31yc1dxdnBTdWqpaG5paEtKYmNHYQ==", (int)iliIiiliiiii[120], (int)iliIiiliiiii[121], (String)"p6Wt", (int)iliIiiliiiii[122], (int)iliIiiliiiii[123], (String)"qpVtrKarpKFvaWxvb5hWU1FeYElUUV+SVlRfb1tIdEiLYk9zWnlNmH5OeA==", (int)iliIiiliiiii[124], (String)"bYiejKudqZ9sppimoJd2Zl9lZlSMlXNWblxomVV1SU2EY3FKdntLkQ==");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void IIIilIIiiIIi(ItemMeta itemMeta) {
        if (IlIlllIlilIl) {
        }
        Object[] objectArray = new Object[26];
        objectArray[1] = iliIiiliiiii[230];
        objectArray[18] = iliIiiliiiii[231];
        objectArray[4] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[4] | (Integer)objectArray[18]) & ~((Integer)objectArray[4] & (Integer)objectArray[18]);
        objectArray[18] = iliIiiliiiii[232];
        objectArray[4] = (int)((Integer)objectArray[1]);
        objectArray[1] = 2 * ((Integer)objectArray[4] & ~((Integer)objectArray[18]).intValue()) - ((Integer)objectArray[4] ^ (Integer)objectArray[18]);
        Object[] objectArray2 = new Object[((Integer)objectArray[1]).intValue()];
        objectArray[0] = iliIiiliiiii[233];
        objectArray[18] = iliIiiliiiii[234];
        objectArray[4] = (int)((Integer)objectArray[0]);
        objectArray[0] = 2 * ((Integer)objectArray[4] & ~((Integer)objectArray[18]).intValue()) - ((Integer)objectArray[4] ^ (Integer)objectArray[18]);
        objectArray[18] = iliIiiliiiii[235];
        objectArray[4] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[4] ^ (Integer)objectArray[18]) - 2 * (~((Integer)objectArray[4]).intValue() & (Integer)objectArray[18]);
        objectArray2[((Integer)objectArray[0]).intValue()] = itemMeta;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("497d1250-b644-445f-a4d6-04814bc0a284", (long)4303011740692104226L, (Object[])objectArray2, (String)"dnQxTTd6", (String)"k7u4sbZ6emFgYmuJiIutooSHoaGAg6WYfFh+Xl9celJUUHZWlXNSbUtITmlPS0plQ4JmYUdERV17eH5Zf3y/cnR3dlFQdHVNaw==", (int)iliIiiliiiii[236], (int)iliIiiliiiii[237], (String)"vbuz", (int)iliIiiliiiii[238], (int)iliIiiliiiii[239], (String)"sItztry9sqtlZ2JlZW6gqaugnrOup6mYXFpRZVFeYlKRfFFpQG9bknRAdg==", (int)iliIiiliiiii[240], (String)"d5aAlrGLv5VmqJasqmGAnKWbmK52Y4VcZFJmk19jX1eefW9QbG1dmw==");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void Illlllllilll(ItemStack itemStack, int n, String string) {
        if (IlIlllIlilIl) {
        }
        Object[] objectArray = new Object[30];
        objectArray[17] = iliIiiliiiii[150];
        objectArray[19] = iliIiiliiiii[151];
        objectArray[4] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[4] | (Integer)objectArray[19]) + ((Integer)objectArray[4] & (Integer)objectArray[19]);
        objectArray[19] = iliIiiliiiii[152];
        objectArray[4] = (int)((Integer)objectArray[17]);
        objectArray[17] = (Integer)objectArray[4] - ~((Integer)objectArray[19]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[17]).intValue()];
        objectArray[12] = iliIiiliiiii[153];
        objectArray[19] = iliIiiliiiii[154];
        objectArray[4] = (int)((Integer)objectArray[12]);
        objectArray[12] = (Integer)objectArray[4] + ~((Integer)objectArray[19]).intValue() + 1;
        objectArray[19] = iliIiiliiiii[155];
        objectArray[4] = (int)((Integer)objectArray[12]);
        objectArray[12] = 2 * ((Integer)objectArray[4] | (Integer)objectArray[19]) - ((Integer)objectArray[4] ^ (Integer)objectArray[19]);
        objectArray2[((Integer)objectArray[12]).intValue()] = itemStack;
        objectArray[10] = iliIiiliiiii[156];
        objectArray[19] = iliIiiliiiii[157];
        objectArray[4] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[4] | (Integer)objectArray[19]) - ((Integer)objectArray[4] & (Integer)objectArray[19]);
        objectArray[19] = iliIiiliiiii[158];
        objectArray[4] = (int)((Integer)objectArray[10]);
        objectArray[10] = (Integer)objectArray[4] & ~((Integer)objectArray[19]).intValue() | ~((Integer)objectArray[4]).intValue() & (Integer)objectArray[19];
        objectArray2[((Integer)objectArray[10]).intValue()] = Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("1443b95d-ebfd-41d0-aaf2-fd1100e0d7a7", (int)n, (String)"QmVjd1gz", (String)"iqChrq9hY2ZpaWKGgYCkpX18WF55eFyfdVN3UVZXc1VNS29JjGhLakJDR2ZGQENierlfXn5/fFpyc3dWdne2dW1sb05Jb2xKYg==", (int)iliIiiliiiii[159], (int)iliIiiliiiii[160], (String)"oJSoopWClg==", (int)iliIiiliiiii[161], (int)iliIiiliiiii[162], (String)"rJSilmyvk6+nYYejrpyhnlQ=", (int)iliIiiliiiii[163], (String)"boxviaiQppJvo5+jo2qDp1JgXWJQjg==");
        objectArray[14] = iliIiiliiiii[164];
        objectArray[19] = iliIiiliiiii[165];
        objectArray[4] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[4] & ~((Integer)objectArray[19]).intValue()) - (~((Integer)objectArray[4]).intValue() & (Integer)objectArray[19]);
        objectArray[19] = iliIiiliiiii[166];
        objectArray[4] = (int)((Integer)objectArray[14]);
        objectArray[14] = 2 * ((Integer)objectArray[4] & ~((Integer)objectArray[19]).intValue()) - ((Integer)objectArray[4] ^ (Integer)objectArray[19]);
        objectArray2[((Integer)objectArray[14]).intValue()] = string;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("57ef6a21-590d-4942-a01d-cb39f2991029", (long)-5050432877540003722L, (Object[])objectArray2, (String)"bUtLUkNo", (String)"laGir6hgYGdmaGGHhoGnpIJ9W19+eV+eelJ0UFFWcFRSSmxIi2lIa01CRGdBQUBjRbhcX3l+f1t9cnRXcXa1dHJtbE9Obm9LbQ==", (int)iliIiiliiiii[167], (int)iliIiiliiiii[168], (String)"u6Gp", (int)iliIiiliiiii[169], (int)iliIiiliiiii[170], (String)"tpFpqKKnqK1jbWhra2Sqr61aZE1QXVOeWlBba19UaFSXZkt3XnVBlHJKfA==", (int)iliIiiliiiii[171], (String)"cYyaiK+RpZNgopyipGuKmqNhYlCImX9aYlhsnVFpVVGYZ3VOcndHnQ==");
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle IlIllllIll(String var0, String var1_1, int var2_2, int var3_3, String var4_4, int var5_5, int var6_6, String var7_7, int var8_8, String var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [39[DOLOOP]], but top level block is 0[TRYBLOCK]
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

    public static boolean lIiiIiIlilli(PlayerInventory playerInventory) {
        Object[] objectArray = new Object[30];
        objectArray[23] = iliIiiliiiii[73];
        objectArray[10] = iliIiiliiiii[74];
        objectArray[5] = (int)((Integer)objectArray[23]);
        objectArray[23] = 2 * ((Integer)objectArray[5] & ~((Integer)objectArray[10]).intValue()) - ((Integer)objectArray[5] ^ (Integer)objectArray[10]);
        objectArray[10] = iliIiiliiiii[75];
        objectArray[5] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[5] - ~((Integer)objectArray[10]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[23]).intValue()];
        objectArray[8] = iliIiiliiiii[76];
        objectArray[10] = iliIiiliiiii[77];
        objectArray[5] = (int)((Integer)objectArray[8]);
        objectArray[8] = (Integer)objectArray[5] - ~((Integer)objectArray[10]).intValue() - 1;
        objectArray[10] = iliIiiliiiii[78];
        objectArray[5] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[5] & ~((Integer)objectArray[10]).intValue()) - (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[10]);
        objectArray2[((Integer)objectArray[8]).intValue()] = playerInventory;
        return (boolean)Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("b3ded2f5-ad1e-4035-a031-1ddccb24d7f7", (Object)Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("6343e300-7778-4187-a3fe-44848e4d5dac", (long)-5034506587788867505L, (Object[])objectArray2, (String)"alpFV2tN", (String)"jamqp6BoaG9ukJl/fnlfXHp1U1d2cVeWckpsSElOaExKQmRAg2FAY0V6fF95eXhbfbBUV3F2d1N1amxPaW6tbGplZEdGZmdDZQ==", (int)iliIiiliiiii[79], (int)iliIiiliiiii[80], (String)"o6mh", (int)iliIiiliiiii[81], (int)iliIiiliiiii[82], (String)"rplhoKqvoKVrlZCTk5xSV1VSbEVYVVuWUkhDc0dMcEyPbkN/Vn1JnHpyRA==", (int)iliIiiliiiii[83], (String)"aYSSgKeZrZtoWmRaXJNyYltpaliAkXdSakB0hUlxTUmAb31Gen9PlQ=="), (String)"eWNOSFE2", (String)"jKarpKFvaWxvb5h8f35eX3t6UlR3dlaVc1VtS0hJaU9LTWVDgmZBYERFfVx4fnlYfL9VVHBxdlB0dW1MaGmsb2tqZURHYWZAZA==", (int)iliIiiliiiii[84], (int)iliIiiliiiii[85], (String)"pKCFoag=", (int)iliIiiliiiii[86], (int)iliIiiliiiii[87], (String)"r5Zgo6uooaZqapGQkptTVFRdbUZZUlqVU1dCcEZLcU+OYUJ8V3pIn3tNRQ==", (int)iliIiiliiiii[88], (String)"aI2knKqea6ebp1+WdWdYZGVVg5R3");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void IIillIiliIil(int n, String string, ItemMeta itemMeta) {
        if (IlIlllIlilIl) {
        }
        Object[] objectArray = new Object[32];
        int n2 = (0x56CD1159 | 0xBAE3B155) - (0x56CD1159 & 0xBAE3B155);
        int cfr_ignored_0 = n2 + -1159483051;
        objectArray[15] = iliIiiliiiii[183];
        objectArray[25] = iliIiiliiiii[184];
        objectArray[0] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[0] ^ (Integer)objectArray[25]) + 2 * ((Integer)objectArray[0] & (Integer)objectArray[25]);
        objectArray[25] = iliIiiliiiii[185];
        objectArray[0] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[0] | (Integer)objectArray[25]) + ((Integer)objectArray[0] & (Integer)objectArray[25]);
        Object[] objectArray2 = new Object[((Integer)objectArray[15]).intValue()];
        objectArray[8] = iliIiiliiiii[186];
        objectArray[25] = iliIiiliiiii[187];
        objectArray[0] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[0] ^ (Integer)objectArray[25]) + 2 * ((Integer)objectArray[0] & (Integer)objectArray[25]);
        objectArray[25] = iliIiiliiiii[188];
        objectArray[0] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[0] | (Integer)objectArray[25]) & ~((Integer)objectArray[0] & (Integer)objectArray[25]);
        objectArray2[((Integer)objectArray[8]).intValue()] = Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("688d2e4b-52e7-4af3-b2bc-dbd5c10f4654", (int)n, (String)"YmNBclVL", (String)"l7+8rapmZmVkZm+FhIehpoCDpV18f1mceFx6UlNQdlZQVHJKiW9OaU9MSmVDR0ZhR4ZiXXt4eVl/fHpVc3CzdnBzck1MaGlJbw==", (int)iliIiiliiiii[189], (int)iliIiiliiiii[190], (String)"vYu1oZCFkw==", (int)iliIiiliiiii[191], (int)iliIiiliiiii[192], (String)"sYu/lWmolqyqboqgq5uknak=", (int)iliIiiliiiii[193], (String)"c5Nyiq2Xo5FirJKgpm2GpK+foGFViQ==");
        objectArray[30] = iliIiiliiiii[194];
        objectArray[25] = iliIiiliiiii[195];
        objectArray[0] = (int)((Integer)objectArray[30]);
        objectArray[30] = ((Integer)objectArray[0] | (Integer)objectArray[25]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[25]).intValue());
        objectArray[25] = iliIiiliiiii[196];
        objectArray[0] = (int)((Integer)objectArray[30]);
        objectArray[30] = ((Integer)objectArray[0] | (Integer)objectArray[25]) - ((Integer)objectArray[0] & (Integer)objectArray[25]);
        objectArray2[((Integer)objectArray[30]).intValue()] = string;
        objectArray[16] = iliIiiliiiii[197];
        objectArray[25] = iliIiiliiiii[198];
        objectArray[0] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[0] - ~((Integer)objectArray[25]).intValue() - 1;
        objectArray[25] = iliIiiliiiii[199];
        objectArray[0] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[0] | (Integer)objectArray[25]) + ((Integer)objectArray[0] & (Integer)objectArray[25]);
        objectArray2[((Integer)objectArray[16]).intValue()] = itemMeta;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("266a32cb-3ff0-4b06-9e71-19c2eb537465", (long)8812241462601840734L, (Object[])objectArray2, (String)"cU5oRjhy", (String)"lry9sqtlZ2JlZW6KhYSgoYGApKJ9fFibeV97XVJTd1FRV3NViGxPbk5PS2pCREdmRoVjYnp7eF5+f3tacnOycXFwc1JNa2hObg==", (int)iliIiiliiiii[200], (int)iliIiiliiiii[201], (String)"uLy2", (int)iliIiiliiiii[202], (int)iliIiiliiiii[203], (String)"tYx2taGir6hgYGdmaGGtqq6nm7BTWFSbWV1UZlxRb1GUe1RqXXBGkXFHcw==", (int)iliIiiliiiii[204], (String)"cpGFlayUopZjr5Ovp26Nn6Ccna2LnHhfYVVjkFJsUlSbempTcXJAmA==");
        int n3 = (0x63606515 | 0xA338A900) - (0x63606515 & 0xA338A900);
        int cfr_ignored_1 = n3 + -1556567808;
    }

    public static void IilliliilIIi(PlayerInventory playerInventory, int n) {
        Object[] objectArray = new Object[30];
        objectArray[4] = iliIiiliiiii[54];
        objectArray[1] = iliIiiliiiii[55];
        objectArray[29] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[29] | (Integer)objectArray[1]) - ((Integer)objectArray[29] & (Integer)objectArray[1]);
        objectArray[1] = iliIiiliiiii[56];
        objectArray[29] = (int)((Integer)objectArray[4]);
        objectArray[4] = (Integer)objectArray[29] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[29]).intValue() & (Integer)objectArray[1];
        Object[] objectArray2 = new Object[((Integer)objectArray[4]).intValue()];
        objectArray[21] = iliIiiliiiii[57];
        objectArray[1] = iliIiiliiiii[58];
        objectArray[29] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[29] | (Integer)objectArray[1]) & (~((Integer)objectArray[29]).intValue() | ~((Integer)objectArray[1]).intValue());
        objectArray[1] = iliIiiliiiii[59];
        objectArray[29] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[29] | (Integer)objectArray[1]) & (~((Integer)objectArray[29]).intValue() | ~((Integer)objectArray[1]).intValue());
        objectArray2[((Integer)objectArray[21]).intValue()] = playerInventory;
        objectArray[25] = iliIiiliiiii[60];
        objectArray[1] = iliIiiliiiii[61];
        objectArray[29] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[29] | (Integer)objectArray[1]) + ((Integer)objectArray[29] & (Integer)objectArray[1]);
        objectArray[1] = iliIiiliiiii[62];
        objectArray[29] = (int)((Integer)objectArray[25]);
        objectArray[25] = 2 * ((Integer)objectArray[29] & ~((Integer)objectArray[1]).intValue()) - ((Integer)objectArray[29] ^ (Integer)objectArray[1]);
        objectArray2[((Integer)objectArray[25]).intValue()] = Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("e86c5ddd-356e-40f6-a323-7587a9ea664a", (int)n, (String)"VmE2Ukc4", (String)"g6uooaZqapGQkpt5eHtdUnR3UVFwc1WIbEhuTk9MakJEQGZGhWNCXXt4fll/e3pVc7JWUXd0dU1raG5Jb2yvYmRnZkFAZGU9Gw==", (int)iliIiiliiiii[63], (int)iliIiiliiiii[64], (String)"qZ+hrZyJnw==", (int)iliIiiliiiii[65], (int)iliIiiliiiii[66], (String)"pZ+rmWWkmlhemn5cV2dYaV0=", (int)iliIiiliiiii[67], (String)"Z4dmhqGbr2WWWGZcWpF6UFtrVG1ZhQ==");
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("c946b62e-15f2-41e7-a832-1778df360459", (long)-1008084573614245416L, (Object[])objectArray2, (String)"Q1duSWpG", (String)"gqippqdpa26RkZp+eXhcXXV0UFZxcFSXbUtvSU5Pa01FQ2dBhGBDYnp7f15+eHtacrFXVnZ3dFJqa29Obm+ubWVkZ0ZBZ2RCGg==", (int)iliIiiliiiii[68], (int)iliIiiliiiii[69], (String)"rKii", (int)iliIiiliiiii[70], (int)iliIiiliiiii[71], (String)"oZhioa2uo6SUlJOSlJ1RVlpTb0RfVFiXTUlAckBNc02Ab0B+UXxKnUVzRw==", (int)iliIiiliiiii[72], (String)"ZoWRgaCYrpqXW2dbW5JxY1RoaVmHkHRTdUF3hE5wTkiPbn5HfX5MlA==");
    }

    public static void IIIllIIliIIl(PlayerInventory playerInventory, UUID uUID) {
        Object[] objectArray = new Object[29];
        objectArray[2] = iliIiiliiiii[100];
        objectArray[19] = iliIiiliiiii[101];
        objectArray[26] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[26] ^ (Integer)objectArray[19]) - 2 * (~((Integer)objectArray[26]).intValue() & (Integer)objectArray[19]);
        objectArray[19] = iliIiiliiiii[102];
        objectArray[26] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[26] ^ (Integer)objectArray[19]) - 2 * (~((Integer)objectArray[26]).intValue() & (Integer)objectArray[19]);
        Object[] objectArray2 = new Object[((Integer)objectArray[2]).intValue()];
        objectArray[10] = iliIiiliiiii[103];
        objectArray[19] = iliIiiliiiii[104];
        objectArray[26] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[26] ^ (Integer)objectArray[19]) + 2 * ((Integer)objectArray[26] & (Integer)objectArray[19]);
        objectArray[19] = iliIiiliiiii[105];
        objectArray[26] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[26] | (Integer)objectArray[19]) + ((Integer)objectArray[26] & (Integer)objectArray[19]);
        objectArray2[((Integer)objectArray[10]).intValue()] = playerInventory;
        objectArray[1] = iliIiiliiiii[106];
        objectArray[19] = iliIiiliiiii[107];
        objectArray[26] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[26] | (Integer)objectArray[19]) - ((Integer)objectArray[26] & (Integer)objectArray[19]);
        objectArray[19] = iliIiiliiiii[108];
        objectArray[26] = (int)((Integer)objectArray[1]);
        objectArray[1] = (Integer)objectArray[26] & ~((Integer)objectArray[19]).intValue() | ~((Integer)objectArray[26]).intValue() & (Integer)objectArray[19];
        objectArray2[((Integer)objectArray[1]).intValue()] = uUID;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("b99611f8-24ed-427b-a4ad-4fd64f4772db", (long)1387030383028579426L, (Object[])objectArray2, (String)"NjNBMWhM", (String)"jqSlqqNtb2ptbWaCfXxYWXl4XFp1dFCTcVdzVUpLb0lJT2tNgGRHZkZHQ2J6fH9efr1bWnJzcFZ2d3NSamuqaWloa0pFY2BGZg==", (int)iliIiiliiiii[109], (int)iliIiiliiiii[110], (String)"oKSu", (int)iliIiiliiiii[111], (int)iliIiiliiiii[112], (String)"rZRuramqp6BoaG9ukJlVUlZfY0hbUFyTUVVcbkRJd0mMY0xyVXhOmXlPew==", (int)iliIiiliiiii[113], (String)"aomdjaScqp5rp5unX5Z1Z1hkZVWDlHBXaV1rmEp0SkyDYnJLeXpIkA==");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite lIIlliIIll(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        int n;
        int n2 = n = (0x77C96A63 | 0x2E84CD50) - (0x77C96A63 & 0x2E84CD50);
        if (160031419 >= n2 + 780455248 - (n2 & 0x2E84CD50) * 2) {
        }
        Object[] objectArray = new Object[18];
        try {
            objectArray[17] = MethodHandles.lookup();
            int n3 = (0x7221DA78 | 0x7D00BC8D) - (0x7221DA78 & 0x7D00BC8D);
            int cfr_ignored_0 = n3 + 2097200269;
            objectArray[7] = ((MethodHandles.Lookup)objectArray[17]).findStatic(liiiIIllIl.class, "IlIllllIll", MethodType.fromMethodDescriptorString("(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IILjava/lang/String;ILjava/lang/String;)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
            int n4 = (0x68018807 | 0x4B7DE3F4) - (0x68018807 & 0x4B7DE3F4);
            int cfr_ignored_1 = n4 + 1266541556;
            objectArray[13] = methodType.parameterCount();
            objectArray[3] = iliIiiliiiii[268];
            objectArray[10] = (int)((Integer)objectArray[13]);
            int n5 = (0x65B4BF6E | 0x506219BB) - (0x65B4BF6E & 0x506219BB);
            int cfr_ignored_2 = n5 + 1348606395;
            objectArray[1] = 2 * ((Integer)objectArray[10] & ~((Integer)objectArray[3]).intValue()) - ((Integer)objectArray[10] ^ (Integer)objectArray[3]);
            objectArray[14] = methodType.dropParameterTypes((Integer)objectArray[1], (Integer)objectArray[13]);
        }
        catch (IllegalAccessError illegalAccessError) {
            throw illegalAccessError;
        }
        catch (SyncFailedException syncFailedException) {
            throw syncFailedException;
        }
        objectArray[16] = MethodHandles.invoker((MethodType)objectArray[14]);
        Class[] classArray = new Class[iliIiiliiiii[269]];
        classArray[Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.iliIiiliiiii[270]] = MethodHandle.class;
        objectArray[8] = ((MethodType)objectArray[14]).appendParameterTypes(classArray);
        objectArray[3] = iliIiiliiiii[271];
        objectArray[10] = (int)((Integer)objectArray[1]);
        objectArray[12] = new int[(Integer)objectArray[10] - ~((Integer)objectArray[3]).intValue() - 1];
        ((int[])objectArray[12])[Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.iliIiiliiiii[272]] = (Integer)objectArray[1];
        int n6 = (0xF16A277B | 0xB26F54A) - (0xF16A277B & 0xB26F54A);
        int cfr_ignored_3 = n6 + 187102538;
        objectArray[5] = iliIiiliiiii[273];
        while (true) {
            objectArray[3] = iliIiiliiiii[274];
            objectArray[10] = (int)((Integer)objectArray[1]);
            if ((Integer)objectArray[5] >= ((Integer)objectArray[10] | (Integer)objectArray[3]) + ((Integer)objectArray[10] & (Integer)objectArray[3])) {
                objectArray[11] = MethodHandles.permuteArguments((MethodHandle)objectArray[16], (MethodType)objectArray[8], (int[])objectArray[12]);
                int n7 = (0xC1840AF8 | 0xB8419FC) - (0xC1840AF8 & 0xB8419FC);
                int cfr_ignored_4 = n7 + 193206780;
                objectArray[0] = MethodHandles.collectArguments((MethodHandle)objectArray[11], (Integer)objectArray[1], (MethodHandle)objectArray[7]);
                return new ConstantCallSite((MethodHandle)objectArray[0]);
            }
            objectArray[3] = iliIiiliiiii[275];
            objectArray[10] = (int)((Integer)objectArray[5]);
            ((int[])objectArray[12])[((Integer)objectArray[5]).intValue()] = (Integer)objectArray[10] + ~((Integer)objectArray[3]).intValue() + 1;
            objectArray[5] = (Integer)objectArray[5] + 1;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String ilIllIiIll(String var0, int var1_1, int var2_2) {
        if (Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.IlIlllIlilIl) {
            46 & 1;
        }
        var9_4 = new Object[6];
        var9_4[3] = Base64.getDecoder().decode(var0);
        var9_4[1] = Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.iliIiiliiiii[299];
        block8: while ((Integer)var9_4[1] >= ((byte[])var9_4[3]).length) {
            var8_3 = (-668293639 | 1435203951) - (-668293639 & 1435203951);
lbl9:
            // 2 sources

            while (true) {
                v0 = var8_3;
                switch (v0 + 1435203951 - (v0 & 1435203951) * 2) {
                    case -668293639: {
                        return new String((byte[])var9_4[3], StandardCharsets.UTF_8);
                    }
                }
                v1 = (byte[])var9_4[3];
                v2 = (Integer)var9_4[1];
                var9_4[2] = (int)((Integer)var9_4[1]);
                var9_4[0] = var1_1;
                var9_4[2] = ((Integer)var9_4[0] & ~((Integer)var9_4[2]).intValue()) - (~((Integer)var9_4[0]).intValue() & (Integer)var9_4[2]);
                var9_4[0] = (int)v1[v2];
                var9_4[2] = var2_2;
                var9_4[0] = ((Integer)var9_4[0] | (Integer)var9_4[2]) & (~((Integer)var9_4[0]).intValue() | ~((Integer)var9_4[2]).intValue());
                v1[v2] = (byte)(2 * ((Integer)var9_4[0] & ~((Integer)var9_4[2]).intValue()) - ((Integer)var9_4[0] ^ (Integer)var9_4[2]));
                var9_4[1] = (Integer)var9_4[1] + 1;
                continue block8;
                break;
            }
        }
        var8_3 = (1085719363 | 1435203951) - (1085719363 & 1435203951);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static UUID iliIiiliiiii(PlayerInventory playerInventory) {
        int n;
        int n2 = n = (0x5633C06E | 0xC56503B) - (0x5633C06E & 0xC56503B);
        if (892457179 >= n2 + 206983227 - (n2 & 0xC56503B) * 2) {
            int n3 = n = (0x46 | 0xC56503B) - (0x46 & 0xC56503B);
            int cfr_ignored_0 = n3 + 206983227 - (n3 & 0xC56503B) * 2;
        }
        Object[] objectArray = new Object[29];
        objectArray[6] = iliIiiliiiii[89];
        objectArray[9] = iliIiiliiiii[90];
        objectArray[11] = (int)((Integer)objectArray[6]);
        objectArray[6] = ((Integer)objectArray[11] ^ (Integer)objectArray[9]) + 2 * ((Integer)objectArray[11] & (Integer)objectArray[9]);
        objectArray[9] = iliIiiliiiii[91];
        objectArray[11] = (int)((Integer)objectArray[6]);
        objectArray[6] = ((Integer)objectArray[11] & ~((Integer)objectArray[9]).intValue()) - (~((Integer)objectArray[11]).intValue() & (Integer)objectArray[9]);
        Object[] objectArray2 = new Object[((Integer)objectArray[6]).intValue()];
        objectArray[5] = iliIiiliiiii[92];
        objectArray[9] = iliIiiliiiii[93];
        objectArray[11] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[11] ^ (Integer)objectArray[9]) + 2 * ((Integer)objectArray[11] & (Integer)objectArray[9]);
        objectArray[9] = iliIiiliiiii[94];
        objectArray[11] = (int)((Integer)objectArray[5]);
        objectArray[5] = 2 * ((Integer)objectArray[11] | (Integer)objectArray[9]) - ((Integer)objectArray[11] ^ (Integer)objectArray[9]);
        objectArray2[((Integer)objectArray[5]).intValue()] = playerInventory;
        return (UUID)((Object)Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("9bac9aa8-d05d-4689-b033-06687d0e0c54", (long)-2129621932764863368L, (Object[])objectArray2, (String)"T1pmazhs", (String)"j6ekpaJubm1sbmd9fH9ZXnh7XVV0d1GUcFRySktIbk5ITGpCgWdGYUdEQl17f35Zf75aVXNwcVF3dHJNa2irbmhrakVEYGFBZw==", (int)iliIiiliiiii[95], (int)iliIiiliiiii[96], (String)"oaev", (int)iliIiiliiiii[97], (int)iliIiiliiiii[98], (String)"rJdvoqippqdpa26RkZpUVVdcYkdaU12UUFZdcUVKdk6NYE19VHtPnnhMeg==", (int)iliIiiliiiii[99], (String)"a4qcgqWfq5lqpJpYXpV0YFlnZFqCl3FQaF5qh0t3S0uCYXNEeHlJlw=="));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        if (IlIlllIlilIl) {
            int n = (0x2B1CE402 | 0x21234DB5) - (0x2B1CE402 & 0x21234DB5);
        }
        Object[] objectArray = new Object[24];
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.liIlliiIll();
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("0809c315-5be8-4e3f-a0f1-09430f88a8c9", liiiIIllIl.class, (String)"dE9tQ0Jn", (String)"nbm6t7B4eH9+YGmPjomvrIqFo6eGgadmglp8WFleeFxaUnRQk3FQc1VKTG9JSUhrTYBkZ0FGR2NFenxfeX69fHp1dFdWdndTdQ==", (int)iliIiiliiiii[255], (int)iliIiiliiiii[256], (String)"vb+MiJu1", (int)iliIiiliiiii[257], (int)iliIiiliiiii[258], (String)"volxsLq/sLV7ZWBjY2yip6WinLWopatmolhTY1dcYFyfflNvRm1ZjGpCdA==", (int)iliIiiliiiii[259], (String)"eZK1j7uJerSKqK5lcK6QpaRzZIo=");
        objectArray[22] = iliIiiliiiii[260];
        objectArray[6] = iliIiiliiiii[261];
        objectArray[7] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[7] ^ (Integer)objectArray[6]) - 2 * (~((Integer)objectArray[7]).intValue() & (Integer)objectArray[6]);
        objectArray[6] = iliIiiliiiii[262];
        objectArray[7] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[7] ^ (Integer)objectArray[6]) - 2 * (~((Integer)objectArray[7]).intValue() & (Integer)objectArray[6]);
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("be9f9823-95e7-4c69-969d-3da1ab7de206", (long)487478649473140958L, (Object[])new Object[((Integer)objectArray[22]).intValue()], (String)"OEJVTVRq", (String)"nLa7tLF/eXx/f2iMj46ur4uKoqSHhqZlg6V9W1hZeV9bXXVTknZRcFRVTWxITkloTI9lZEBBRmBERX1ceHm8f3t6dVRXcXZQdA==", (int)iliIiiliiiii[263], (int)iliIiiliiiii[264], (String)"sraw", (int)iliIiiliiiii[265], (int)iliIiiliiiii[266], (String)"v4Zws7u4sbZ6emFgYmujpKStnbapoqplo6dSYFZbYV+ecVJsR2pYj2tddQ==", (int)iliIiiliiiii[267], (String)"eJuDk7aOvIh5tZWprWSDkaqWm6txZoahm69lllhmXFqRcGxVa2hehg==");
    }

    /*
     * Exception decompiling
     */
    public static String iiiIlIIIll(String var0) {
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
     */
    public static void IIlllIlliIll(PlayerInventory playerInventory) {
        if (IlIlllIlilIl) {
            int cfr_ignored_0 = 84 + 22;
        }
        Object[] objectArray = new Object[28];
        int n = (0xE33349B4 | 0x854A1652) - (0xE33349B4 & 0x854A1652);
        int cfr_ignored_1 = n + -2058742190;
        objectArray[24] = iliIiiliiiii[139];
        objectArray[15] = iliIiiliiiii[140];
        objectArray[14] = (int)((Integer)objectArray[24]);
        objectArray[24] = 2 * ((Integer)objectArray[14] | (Integer)objectArray[15]) - ((Integer)objectArray[14] ^ (Integer)objectArray[15]);
        objectArray[15] = iliIiiliiiii[141];
        objectArray[14] = (int)((Integer)objectArray[24]);
        objectArray[24] = (Integer)objectArray[14] + ~((Integer)objectArray[15]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[24]).intValue()];
        objectArray[20] = iliIiiliiiii[142];
        objectArray[15] = iliIiiliiiii[143];
        objectArray[14] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[14] + ~((Integer)objectArray[15]).intValue() + 1;
        objectArray[15] = iliIiiliiiii[144];
        objectArray[14] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[14] + ~((Integer)objectArray[15]).intValue() + 1;
        objectArray2[((Integer)objectArray[20]).intValue()] = playerInventory;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("78d6427b-b35e-4556-aa41-6fc432c4e19e", (long)259153347409945890L, (Object[])objectArray2, (String)"d2wwN2xy", (String)"i6Ogqa5iYmloamOBgIOlWnx/WVl4e12QdFB2VldUckpMSG5OjWtKZUNARmFHQ0Jde7peWX98fVVzcHZRd3S3amxvbklIbG1FYw==", (int)iliIiiliiiii[145], (int)iliIiiliiiii[146], (String)"paOr", (int)iliIiiliiiii[147], (int)iliIiiliiiii[148], (String)"qJNrrqSlqqNtb2ptbWaoUVNYZktWX1GQVFJZbVlWakqJZElxWHdDmnxIfg==", (int)iliIiiliiiii[149], (String)"b46YjqmTp51uoJ6kommIZF1jYFaOm31UbFpum1drV0+GZXdIdHVFkw==");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ItemStack iIlIlllllill(int n) {
        int n2;
        int n3 = n2 = (0x6BCFC5B | 0xC3955DB3) - (0x6BCFC5B & 0xC3955DB3);
        if (64543746 >= n3 + -1013621325 - (n3 & 0xC3955DB3) * 2) {
            throw new ConcurrentModificationException();
        }
        Object[] objectArray = new Object[27];
        objectArray[2] = iliIiiliiiii[38];
        objectArray[25] = iliIiiliiiii[39];
        objectArray[11] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[11] ^ (Integer)objectArray[25]) - 2 * (~((Integer)objectArray[11]).intValue() & (Integer)objectArray[25]);
        objectArray[25] = iliIiiliiiii[40];
        objectArray[11] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[11] ^ (Integer)objectArray[25]) - 2 * (~((Integer)objectArray[11]).intValue() & (Integer)objectArray[25]);
        Object[] objectArray2 = new Object[((Integer)objectArray[2]).intValue()];
        objectArray[3] = iliIiiliiiii[41];
        objectArray[25] = iliIiiliiiii[42];
        objectArray[11] = (int)((Integer)objectArray[3]);
        objectArray[3] = 2 * ((Integer)objectArray[11] & ~((Integer)objectArray[25]).intValue()) - ((Integer)objectArray[11] ^ (Integer)objectArray[25]);
        objectArray[25] = iliIiiliiiii[43];
        objectArray[11] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[11] ^ (Integer)objectArray[25]) - 2 * (~((Integer)objectArray[11]).intValue() & (Integer)objectArray[25]);
        objectArray2[((Integer)objectArray[3]).intValue()] = Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("3a9f51f4-fafd-4a5f-90c9-ac03ef62bbc4", (int)n, (String)"TVhhcHkx", (String)"ga2uo6SUlJOSlJ17enVTUHZxV1NybUuKbk5oTE1CZEBGRmBEh118X3l+eFt9dXRXcbRQU3Vqa09pbmhLbWKhYGZhYENCGhs/GQ==", (int)iliIiiliiiii[44], (int)iliIiiliiiii[45], (String)"q5mnr553YQ==", (int)iliIiiliiiii[46], (int)iliIiiliiiii[47], (String)"p5mtm2daZFpcnHheVWlWa18=", (int)iliIiiliiiii[48], (String)"ZYFghKNlUWeUXmBeWJ90UlltUm9bmw==");
        return (ItemStack)Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("4a996139-e5c1-4e80-a38d-928c068021b9", (long)3635963887230235313L, (Object[])objectArray2, (String)"QldWRmNm", (String)"gKqvoKVrlZCTk5x4e3pSU3d2VlBzckqJb0lpT0xNZUNHQWFHhmJ9XHh5eVh8enVUcLNRUHR1akxoaWlIbG2gY2dmYUBDZRo8GA==", (int)iliIiiliiiii[49], (int)iliIiiliiiii[50], (String)"rqqk", (int)iliIiiliiiii[51], (int)iliIiiliiiii[52], (String)"o5pkp6+sXVqWlpWUlp9fWFhRaUJdVkaJT0tGdEJPfUOCbUZ4U350o0dxQQ==", (int)iliIiiliiiii[53], (String)"ZIeXh6KaUGSVWWFdWZB/bVZqb1+FkmpNd0NxgkxyQEaNbHhBf3xyqg==");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean liiiIIllIl(ItemStack itemStack) {
        if (IlIlllIlilIl) {
        }
        Object[] objectArray = new Object[26];
        objectArray[10] = iliIiiliiiii[22];
        objectArray[15] = iliIiiliiiii[23];
        objectArray[23] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[23] | (Integer)objectArray[15]) & (~((Integer)objectArray[23]).intValue() | ~((Integer)objectArray[15]).intValue());
        objectArray[15] = iliIiiliiiii[24];
        objectArray[23] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[23] | (Integer)objectArray[15]) & (~((Integer)objectArray[23]).intValue() | ~((Integer)objectArray[15]).intValue());
        Object[] objectArray2 = new Object[((Integer)objectArray[10]).intValue()];
        objectArray[21] = iliIiiliiiii[25];
        objectArray[15] = iliIiiliiiii[26];
        objectArray[23] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[23] | (Integer)objectArray[15]) & ~((Integer)objectArray[23] & (Integer)objectArray[15]);
        objectArray[15] = iliIiiliiiii[27];
        objectArray[23] = (int)((Integer)objectArray[21]);
        objectArray[21] = (Integer)objectArray[23] & ~((Integer)objectArray[15]).intValue() | ~((Integer)objectArray[23]).intValue() & (Integer)objectArray[15];
        objectArray2[((Integer)objectArray[21]).intValue()] = itemStack;
        return (boolean)Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("02b798ae-0521-432c-a1f3-8d182c1227af", (Object)Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("23a96339-f863-4634-83f5-d40b9725632d", (long)8980193903136201210L, (Object[])objectArray2, (String)"R0hoSHZP", (String)"h6+sXVqWlpWUlp91dHdRVnBzVU1sb0mMaExqQkNAZkZARGJ6uV9+WX98elVzd3ZRd7ZSTWtoaUlvbGpFY2CjZmBjYj08GBk5Hw==", (int)iliIiiliiiii[28], (int)iliIiiliiiii[29], (String)"qa+n", (int)iliIiiliiiii[30], (int)iliIiiliiiii[31], (String)"pJ9nWlBRXl+Rk5aZmZJcXV9Ual9CS0WMSE5FeU1CfkaFaEVFbEN3pkB0Qg==", (int)iliIiiliiiii[32], (String)"Y4KUel1nU2GSXGJQVp18aFFvbEKaj2lIcEZyj0N/Q0OKaXt8QEFxrw=="), (String)"Y0NqUU1N", (String)"hqytoluVl5KVlZ56dXRQUXFwVFJtbEiLaU9rTUJDZ0FBR2NFuFx/Xn5/e1pydHdWdrVTUmpraE5ub2tKYmOiYWFgY0I9Gxg+Hg==", (int)iliIiiliiiii[33], (int)iliIiiliiiii[34], (String)"rqqDp1I=", (int)iliIiiliiiii[35], (int)iliIiiliiiii[36], (String)"pZxmpVFSX1iQkJeWmJFdWl5Xa0BDSESLSU1EdkxBf0GEa0R6bUB2oUF3Qw==", (int)iliIiiliiiii[37], (String)"YoeimlBklVlhXVmQf21Wam9fhZJt");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IliIlllilIi(IliIlllilIi iliIlllilIi) {
        int n;
        int n2 = n = (0x7F1059DF | 0x249E61E2) - (0x7F1059DF & 0x249E61E2);
        if (614626569 >= n2 + 614359522 - (n2 & 0x249E61E2) * 2) {
            n = (0xFA46DF8A | 0x249E61E2) - (0xFA46DF8A & 0x249E61E2);
        }
        Object[] objectArray = new Object[27];
        objectArray[14] = iliIiiliiiii[11];
        objectArray[21] = iliIiiliiiii[12];
        objectArray[24] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[24] | (Integer)objectArray[21]) & ~((Integer)objectArray[24] & (Integer)objectArray[21]);
        objectArray[21] = iliIiiliiiii[13];
        objectArray[24] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[24] | (Integer)objectArray[21]) & ~((Integer)objectArray[24] & (Integer)objectArray[21]);
        Object[] objectArray2 = new Object[((Integer)objectArray[14]).intValue()];
        objectArray[20] = iliIiiliiiii[14];
        objectArray[21] = iliIiiliiiii[15];
        objectArray[24] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[24] | (Integer)objectArray[21]) & ~((Integer)objectArray[24] & (Integer)objectArray[21]);
        objectArray[21] = iliIiiliiiii[16];
        objectArray[24] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[24] + ~((Integer)objectArray[21]).intValue() + 1;
        objectArray2[((Integer)objectArray[20]).intValue()] = iliIlllilIi;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("cf00d858-1b40-47be-8979-3cb0aaa375a3", (long)-3708234099176637679L, (Object[])objectArray2, (String)"R0ZuemN2", (String)"hK5TXFmXkZSXl5B0d3ZWV3NySkxvbk6Na01lQ0BBYUdDRV17ul55WHx9dVRwdnFQdLdNTGhpbkhsbWVEYGGkZ2NiHTw/GR44HA==", (int)iliIiiliiiii[17], (int)iliIiiliiiii[18], (String)"qq5Y", (int)iliIiiliiiii[19], (int)iliIiiliiiii[20], (String)"p56YW1NQWV6SkpmYmpNbXFxVdV5BSkKNS09KeE5DeUeGaXpEb0Jwp0N1TQ==", (int)iliIiiliiiii[21], (String)"YINre15mVGCRXW1RVZx7aVJuc0OZjm5Jc0d9jkB+REKJaER9Q0B2rg==");
        int n3 = (0x7711CC04 | 0x59F2CEB0) - (0x7711CC04 & 0x59F2CEB0);
        int cfr_ignored_0 = n3 + 1509084848;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static ItemStack Iilllilliill(PlayerInventory playerInventory) {
        if (IlIlllIlilIl) {
            int cfr_ignored_0 = 0x59 & 1;
        }
        Object[] objectArray = new Object[30];
        objectArray[28] = iliIiiliiiii[172];
        objectArray[18] = iliIiiliiiii[173];
        objectArray[17] = (int)((Integer)objectArray[28]);
        objectArray[28] = (Integer)objectArray[17] & ~((Integer)objectArray[18]).intValue() | ~((Integer)objectArray[17]).intValue() & (Integer)objectArray[18];
        objectArray[18] = iliIiiliiiii[174];
        objectArray[17] = (int)((Integer)objectArray[28]);
        objectArray[28] = ((Integer)objectArray[17] ^ (Integer)objectArray[18]) + 2 * ((Integer)objectArray[17] & (Integer)objectArray[18]);
        Object[] objectArray2 = new Object[((Integer)objectArray[28]).intValue()];
        objectArray[15] = iliIiiliiiii[175];
        objectArray[18] = iliIiiliiiii[176];
        objectArray[17] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[17] | (Integer)objectArray[18]) & ~((Integer)objectArray[17] & (Integer)objectArray[18]);
        objectArray[18] = iliIiiliiiii[177];
        objectArray[17] = (int)((Integer)objectArray[15]);
        objectArray[15] = (Integer)objectArray[17] - ~((Integer)objectArray[18]).intValue() - 1;
        objectArray2[((Integer)objectArray[15]).intValue()] = playerInventory;
        return (ItemStack)Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("1b456fa5-7c0d-4bb9-8893-766dfc8740b7", (long)8880305235204213642L, (Object[])objectArray2, (String)"R09QbGNL", (String)"lL6jrKlnYWRnZ2CEh4amp4OCWlx/fl6de111U1BRcVdTVW1Lim5JaExNRWRARkFgRIddXHh5flh8fXVUcHG0d3NybUxPaW5IbA==", (int)iliIiiliiiii[178], (int)iliIiiliiiii[179], (String)"ur6o", (int)iliIiiliiiii[180], (int)iliIiiliiiii[181], (String)"t45oq6Ogqa5iYmloamOrrKylZU5RWlKdW19aaF5TaVeWeUp0X3JAl3NFfQ==", (int)iliIiiliiiii[182], (String)"cJObi66WpJBhrZ2hpWyLmaKeY1OJnn5ZY1dtnlBuVFKZeHRNc3BGng==");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IiIlliIliiIl(PlayerInventory playerInventory, Location location) {
        if (IlIlllIlilIl) {
            int cfr_ignored_0 = 81 + 57;
        }
        Object[] objectArray = new Object[29];
        objectArray[17] = iliIiiliiiii[125];
        objectArray[19] = iliIiiliiiii[126];
        objectArray[23] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[23] & ~((Integer)objectArray[19]).intValue()) - (~((Integer)objectArray[23]).intValue() & (Integer)objectArray[19]);
        objectArray[19] = iliIiiliiiii[127];
        objectArray[23] = (int)((Integer)objectArray[17]);
        objectArray[17] = 2 * ((Integer)objectArray[23] & ~((Integer)objectArray[19]).intValue()) - ((Integer)objectArray[23] ^ (Integer)objectArray[19]);
        Object[] objectArray2 = new Object[((Integer)objectArray[17]).intValue()];
        objectArray[25] = iliIiiliiiii[128];
        objectArray[19] = iliIiiliiiii[129];
        objectArray[23] = (int)((Integer)objectArray[25]);
        objectArray[25] = (Integer)objectArray[23] + ~((Integer)objectArray[19]).intValue() + 1;
        objectArray[19] = iliIiiliiiii[130];
        objectArray[23] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[23] | (Integer)objectArray[19]) + ((Integer)objectArray[23] & (Integer)objectArray[19]);
        objectArray2[((Integer)objectArray[25]).intValue()] = playerInventory;
        objectArray[13] = iliIiiliiiii[131];
        objectArray[19] = iliIiiliiiii[132];
        objectArray[23] = (int)((Integer)objectArray[13]);
        objectArray[13] = (Integer)objectArray[23] & ~((Integer)objectArray[19]).intValue() | ~((Integer)objectArray[23]).intValue() & (Integer)objectArray[19];
        objectArray[19] = iliIiiliiiii[133];
        objectArray[23] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[23] | (Integer)objectArray[19]) & (~((Integer)objectArray[23]).intValue() | ~((Integer)objectArray[19]).intValue());
        objectArray2[((Integer)objectArray[13]).intValue()] = location;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("cdb75c5a-c0f4-4bed-99fb-99fadcb52920", (long)-5256395770568867170L, (Object[])objectArray2, (String)"b0FUN2ky", (String)"iKKnqK1jbWhra2SAg4JaW39+Xlh7elKRd1FxV1RVbUtPSWlPjmpFZEBBQWBEQn1ceLtZWHx9clRwcXFQdHWoa29uaUhLbWJEYA==", (int)iliIiiliiiii[134], (int)iliIiiliiiii[135], (String)"pqKs", (int)iliIiiliiiii[136], (int)iliIiiliiiii[137], (String)"q5Jsr6ekpaJubm1sbmdXUFBZYUpVXl6RV1NebFpXdUuKZU5wW3ZMm39JeQ==", (int)iliIiiliiiii[138], (String)"bI+fj6qSqJxtoZmloWh3ZV5iZ1eNmnJVb1tpmlRqSE6FZHBJd3RKkg==");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void Ililllililil(ItemMeta itemMeta) {
        if (IlIlllIlilIl) {
        }
        Object[] objectArray = new Object[28];
        int n = (0x4ECC56BE | 0xCF57E530) - (0x4ECC56BE & 0xCF57E530);
        int cfr_ignored_0 = n + -816323280;
        objectArray[9] = iliIiiliiiii[205];
        objectArray[23] = iliIiiliiiii[206];
        objectArray[4] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[4] & ~((Integer)objectArray[23]).intValue()) - (~((Integer)objectArray[4]).intValue() & (Integer)objectArray[23]);
        objectArray[23] = iliIiiliiiii[207];
        objectArray[4] = (int)((Integer)objectArray[9]);
        objectArray[9] = (Integer)objectArray[4] + ~((Integer)objectArray[23]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[9]).intValue()];
        objectArray[18] = iliIiiliiiii[208];
        objectArray[23] = iliIiiliiiii[209];
        objectArray[4] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[4] ^ (Integer)objectArray[23]) - 2 * (~((Integer)objectArray[4]).intValue() & (Integer)objectArray[23]);
        objectArray[23] = iliIiiliiiii[210];
        objectArray[4] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[4] | (Integer)objectArray[23]) & (~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[23]).intValue());
        objectArray2[((Integer)objectArray[18]).intValue()] = itemMeta;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("357c8224-a840-494e-a33c-93f8180fa04a", (long)-8214999546457140068L, (Object[])objectArray2, (String)"M2ZWVm04", (String)"kb2+s7RkZGNiZG2LioWjoIaBp6OCfVuafl54XF1SdFBWVnBUl21Mb0lOSGtNRURnQYRgY0V6e195fnhbfXKxcHZxcFNSamtPaQ==", (int)iliIiiliiiii[211], (int)iliIiiliiiii[212], (String)"v721", (int)iliIiiliiiii[213], (int)iliIiiliiiii[214], (String)"so11tL6jrKlnYWRnZ2Cuq6mmmLGsWVeaXlxXZ1NQbFCTeldrQnFFkHZGcA==", (int)iliIiiliiiii[215], (String)"dZCGlLOVoZdkrpCuqG+Onqednqx0nXteZlRgkV1tUVWce2lSbnNDmQ==");
    }

    /*
     * Enabled aggressive block sorting
     */
    private liiiIIllIl() {
        int n;
        int n2 = n = (0x7FEF6703 | 0x2FA447D6) - (0x7FEF6703 & 0x2FA447D6);
        if (610314574 >= n2 + 799295446 - (n2 & 0x2FA447D6) * 2) {
            throw null;
        }
        Object[] objectArray = new Object[26];
        objectArray[24] = iliIiiliiiii[0];
        objectArray[16] = iliIiiliiiii[1];
        objectArray[15] = (int)((Integer)objectArray[24]);
        objectArray[24] = (Integer)objectArray[15] + ~((Integer)objectArray[16]).intValue() + 1;
        objectArray[16] = iliIiiliiiii[2];
        objectArray[15] = (int)((Integer)objectArray[24]);
        objectArray[24] = 2 * ((Integer)objectArray[15] & ~((Integer)objectArray[16]).intValue()) - ((Integer)objectArray[15] ^ (Integer)objectArray[16]);
        Object[] objectArray2 = new Object[((Integer)objectArray[24]).intValue()];
        objectArray[1] = iliIiiliiiii[3];
        objectArray[16] = iliIiiliiiii[4];
        objectArray[15] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[15] | (Integer)objectArray[16]) & ~((Integer)objectArray[15] & (Integer)objectArray[16]);
        objectArray[16] = iliIiiliiiii[5];
        objectArray[15] = (int)((Integer)objectArray[1]);
        objectArray[1] = (Integer)objectArray[15] & ~((Integer)objectArray[16]).intValue() | ~((Integer)objectArray[15]).intValue() & (Integer)objectArray[16];
        objectArray2[((Integer)objectArray[1]).intValue()] = this;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("4c146cb9-cee6-48df-b260-b1a9d4d6f77b", (long)-7011443469939341480L, (Object[])objectArray2, (String)"dTlPZ29H", (String)"hVFSX1iQkJeWmJF3dnFXVHJtS09uaU+OakJkQEFGYERCelx4u1l4W31ydFdxcXBTdahMT2lub0ttYmRHYWalZGIdHD8+Hh87HQ==", (int)iliIiiliiiii[6], (int)iliIiiliiiii[7], (String)"q1FZ", (int)iliIiiliiiii[8], (int)iliIiiliiiii[9], (String)"pmGZWFJXWF2TnZibm5RaX11KdF1ATUOOSkBLe09EeESHVntHbkVxpEJ6TA==", (int)iliIiiliiiii[10], (String)"YXxqeF9hVWOQUmxSVJt6alNxckCYiW9Kckh8jUF5RUGIV0V+Qkd3rQ==");
    }

    private static /* synthetic */ void IlIillIiilIi(UUID uUID, ItemMeta itemMeta) {
        Object[] objectArray = new Object[28];
        objectArray[18] = iliIiiliiiii[241];
        objectArray[20] = iliIiiliiiii[242];
        objectArray[11] = (int)((Integer)objectArray[18]);
        objectArray[18] = 2 * ((Integer)objectArray[11] & ~((Integer)objectArray[20]).intValue()) - ((Integer)objectArray[11] ^ (Integer)objectArray[20]);
        objectArray[20] = iliIiiliiiii[243];
        objectArray[11] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[11] ^ (Integer)objectArray[20]) - 2 * (~((Integer)objectArray[11]).intValue() & (Integer)objectArray[20]);
        Object[] objectArray2 = new Object[((Integer)objectArray[18]).intValue()];
        objectArray[6] = iliIiiliiiii[244];
        objectArray[20] = iliIiiliiiii[245];
        objectArray[11] = (int)((Integer)objectArray[6]);
        objectArray[6] = ((Integer)objectArray[11] & ~((Integer)objectArray[20]).intValue()) - (~((Integer)objectArray[11]).intValue() & (Integer)objectArray[20]);
        objectArray[20] = iliIiiliiiii[246];
        objectArray[11] = (int)((Integer)objectArray[6]);
        objectArray[6] = (Integer)objectArray[11] - ~((Integer)objectArray[20]).intValue() - 1;
        objectArray2[((Integer)objectArray[6]).intValue()] = uUID;
        objectArray[19] = iliIiiliiiii[247];
        objectArray[20] = iliIiiliiiii[248];
        objectArray[11] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[11] & ~((Integer)objectArray[20]).intValue()) - (~((Integer)objectArray[11]).intValue() & (Integer)objectArray[20]);
        objectArray[20] = iliIiiliiiii[249];
        objectArray[11] = (int)((Integer)objectArray[19]);
        objectArray[19] = 2 * ((Integer)objectArray[11] | (Integer)objectArray[20]) - ((Integer)objectArray[11] ^ (Integer)objectArray[20]);
        objectArray2[((Integer)objectArray[19]).intValue()] = itemMeta;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.liiiIIllIl.lIIlliIIll("9c11f7e5-4d27-48df-a8f7-d4ffaa77d617", (long)-6745317894970646584L, (Object[])objectArray2, (String)"cnNwR2xL", (String)"kri5trd5e35hYWqOiYisrYWEoKaBgKRnfVt/WV5fe11VU3dRlHBTckpLT25OSEtqQoFnZkZHRGJ6e39efn++fXV0d1ZRd3RSag==", (int)iliIiiliiiii[250], (int)iliIiiliiiii[251], (String)"vLiy", (int)iliIiiliiiii[252], (int)iliIiiliiiii[253], (String)"sYhysb2+s7RkZGNiZG2hpqqjn7SvpKhnXVlQYlBdY12Qf1BuQWxajXVDdw==", (int)iliIiiliiiii[254], (String)"dpWBkbCIvopnq5erq2KBk6SYmal3YISjZVFnlF5gXliffm5XbW5chA==");
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Color
 *  org.bukkit.Location
 *  org.bukkit.entity.Player
 *  org.bukkit.scheduler.BukkitRunnable
 */
package Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.EmptyStackException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public final class iIlIlllllill
extends BukkitRunnable {
    static AtomicReferenceArray<MethodHandle> lIiiIiIlilli;
    public static int[] iliIiiliiiii;
    private double iIlIlllllill;
    private String liiiIIllIl;
    private Player IliIlllilIi;
    public static int IIIllIIliIIl;
    public static boolean IlIlllIlilIl;

    /*
     * Enabled aggressive block sorting
     */
    static {
        if (IlIlllIlilIl) {
            throw new NegativeArraySizeException();
        }
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.iIlIlllllill.IIillIiliIil();
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.iIlIlllllill.IIlllIlliIll("0fb71f16-c83a-4482-8372-d1b84bd87f05", iIlIlllllill.class, (String)"YZWWg4xMTFNSrLWben2ccHFxcJN9uHR3dolni4qNY2CjboCDbWpkh4ZWV5a6UrxQUV5fs11amVe2RqhERUJDQE5OTw==", (String)"czNCVlBr", (String)"WmRxTFhq", (int)iliIiiliiiii[92], (int)iliIiiliiiii[93], (int)iliIiiliiiii[94], (String)"TW6Be5d9Toh+dHqxnHKEaWivsIY=", (int)iliIiiliiiii[95], (String)"gYt4hHeJ", (String)"goVNjJaThIlPsayvr7B2a2l+iGFkeX+6dmR/b2NglGCjim+bcmFtgJ5OoA==");
    }

    /*
     * Enabled aggressive block sorting
     */
    private void swiftAura(Location location) {
        if (IlIlllIlilIl) {
            int n;
            int n2 = n = (0x12 | 0x4F075EE4) - (0x12 & 0x4F075EE4);
            int cfr_ignored_0 = n2 + 1325883108 - (n2 & 0x4F075EE4) * 2;
        }
        Object[] objectArray = new Object[42];
        objectArray[7] = iliIiiliiiii[39];
        objectArray[38] = iliIiiliiiii[40];
        objectArray[8] = (int)((Integer)objectArray[7]);
        objectArray[7] = 2 * ((Integer)objectArray[8] & ~((Integer)objectArray[38]).intValue()) - ((Integer)objectArray[8] ^ (Integer)objectArray[38]);
        objectArray[38] = iliIiiliiiii[41];
        objectArray[8] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[8] | (Integer)objectArray[38]) & (~((Integer)objectArray[8]).intValue() | ~((Integer)objectArray[38]).intValue());
        Object[] objectArray2 = new Object[((Integer)objectArray[7]).intValue()];
        objectArray[32] = iliIiiliiiii[42];
        objectArray[38] = iliIiiliiiii[43];
        objectArray[8] = (int)((Integer)objectArray[32]);
        objectArray[32] = ((Integer)objectArray[8] & ~((Integer)objectArray[38]).intValue()) - (~((Integer)objectArray[8]).intValue() & (Integer)objectArray[38]);
        objectArray[38] = iliIiiliiiii[44];
        objectArray[8] = (int)((Integer)objectArray[32]);
        objectArray[32] = ((Integer)objectArray[8] | (Integer)objectArray[38]) & (~((Integer)objectArray[8]).intValue() | ~((Integer)objectArray[38]).intValue());
        objectArray2[((Integer)objectArray[32]).intValue()] = this;
        objectArray[4] = iliIiiliiiii[45];
        objectArray[38] = iliIiiliiiii[46];
        objectArray[8] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[8] & ~((Integer)objectArray[38]).intValue()) - (~((Integer)objectArray[8]).intValue() & (Integer)objectArray[38]);
        objectArray[38] = iliIiiliiiii[47];
        objectArray[8] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[8] ^ (Integer)objectArray[38]) - 2 * (~((Integer)objectArray[8]).intValue() & (Integer)objectArray[38]);
        objectArray2[((Integer)objectArray[4]).intValue()] = location;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.iIlIlllllill.IIlllIlliIll("d64bbeac-add6-44f7-9169-ddf6ee7612ca", (long)2337226028135409917L, (Object[])objectArray2, (String)"apCRhnexs66pqbKecXCTfXp0d5ZmpWtqbYxgjoGAbG2oa4eGVldbur1TUJOxX7NdWltYtkZHhkqtQ69BTk9MTUVLSA==", (String)"a2hPdnpr", (String)"NUVNblNK", (int)iliIiiliiiii[48], (int)iliIiiliiiii[49], (int)iliIiiliiiii[50], (String)"RmV5aXiAboK3c4dzc7qZi3RwcWG3qIRrlXmXpG6YbmCvjp5nXV5MhA==", (int)iliIiiliiiii[51], (String)"jJCK", (String)"iYBKiW1ue3S0tKuqpL15ZmJ7j2R/ZGCnbWF4amhtm22oj2ieSVxSvaVLpw==");
    }

    /*
     * Exception decompiling
     */
    public static void IIillIiliIil() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [40[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    public static CallSite IIlllIlliIll(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        int n;
        int n2 = n = (0x967FE59 | 0xD936D954) - (0x967FE59 & 0xD936D954);
        IIIllIIliIIl = n2 + -650716844 - (n2 & 0xD936D954) * 2;
        if (730085284 <= IIIllIIliIIl) {
        }
        Object[] objectArray = new Object[17];
        objectArray[6] = MethodHandles.lookup();
        int n3 = (0x172A5140 | 0xDB87BCEA) - (0x172A5140 & 0xDB87BCEA);
        int cfr_ignored_0 = n3 + -611861270;
        objectArray[3] = ((MethodHandles.Lookup)objectArray[6]).findStatic(iIlIlllllill.class, "Illlllllilll", MethodType.fromMethodDescriptorString("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
        objectArray[1] = methodType.parameterCount();
        objectArray[5] = iliIiiliiiii[96];
        objectArray[2] = (int)((Integer)objectArray[1]);
        objectArray[13] = ((Integer)objectArray[2] ^ (Integer)objectArray[5]) - 2 * (~((Integer)objectArray[2]).intValue() & (Integer)objectArray[5]);
        objectArray[14] = methodType.dropParameterTypes((Integer)objectArray[13], (Integer)objectArray[1]);
        objectArray[7] = MethodHandles.invoker((MethodType)objectArray[14]);
        Class[] classArray = new Class[iliIiiliiiii[97]];
        classArray[Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.iIlIlllllill.iliIiiliiiii[98]] = MethodHandle.class;
        objectArray[0] = ((MethodType)objectArray[14]).appendParameterTypes(classArray);
        objectArray[5] = iliIiiliiiii[99];
        objectArray[2] = (int)((Integer)objectArray[13]);
        int n4 = (0xD3C74A92 | 0x2B4BC64B) - (0xD3C74A92 & 0x2B4BC64B);
        int cfr_ignored_1 = n4 + 726386251;
        objectArray[8] = new int[((Integer)objectArray[2] | (Integer)objectArray[5]) + ((Integer)objectArray[2] & (Integer)objectArray[5])];
        ((int[])objectArray[8])[Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.iIlIlllllill.iliIiiliiiii[100]] = (Integer)objectArray[13];
        objectArray[9] = iliIiiliiiii[101];
        while (true) {
            objectArray[5] = iliIiiliiiii[102];
            objectArray[2] = (int)((Integer)objectArray[13]);
            if ((Integer)objectArray[9] >= (Integer)objectArray[2] - ~((Integer)objectArray[5]).intValue() - 1) {
                int n5 = (0x256A1080 | 0x57BA90AB) - (0x256A1080 & 0x57BA90AB);
                int cfr_ignored_2 = n5 + 1471844523;
                objectArray[16] = MethodHandles.permuteArguments((MethodHandle)objectArray[7], (MethodType)objectArray[0], (int[])objectArray[8]);
                int n6 = (0x1B014A8A | 0xDE951C77) - (0x1B014A8A & 0xDE951C77);
                int cfr_ignored_3 = n6 + -560653193;
                objectArray[15] = MethodHandles.collectArguments((MethodHandle)objectArray[16], (Integer)objectArray[13], (MethodHandle)objectArray[3]);
                return new ConstantCallSite((MethodHandle)objectArray[15]);
            }
            objectArray[5] = iliIiiliiiii[103];
            objectArray[2] = (int)((Integer)objectArray[9]);
            ((int[])objectArray[8])[((Integer)objectArray[9]).intValue()] = (Integer)objectArray[2] + ~((Integer)objectArray[5]).intValue() + 1;
            objectArray[9] = (Integer)objectArray[9] + 1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void run() {
        if (IlIlllIlilIl) {
        }
        Object[] objectArray = new Object[30];
        int n = (0x8A8CA986 | 0x2DC76C54) - (0x8A8CA986 & 0x2DC76C54);
        int cfr_ignored_0 = n + 768044116;
        objectArray[3] = iliIiiliiiii[16];
        objectArray[26] = iliIiiliiiii[17];
        objectArray[16] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[16] | (Integer)objectArray[26]) - ((Integer)objectArray[16] & (Integer)objectArray[26]);
        objectArray[26] = iliIiiliiiii[18];
        objectArray[16] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[16] | (Integer)objectArray[26]) & ~((Integer)objectArray[16] & (Integer)objectArray[26]);
        Object[] objectArray2 = new Object[((Integer)objectArray[3]).intValue()];
        objectArray[9] = iliIiiliiiii[19];
        objectArray[26] = iliIiiliiiii[20];
        objectArray[16] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[16] | (Integer)objectArray[26]) - ((Integer)objectArray[16] & (Integer)objectArray[26]);
        objectArray[26] = iliIiiliiiii[21];
        objectArray[16] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[16] | (Integer)objectArray[26]) & (~((Integer)objectArray[16]).intValue() | ~((Integer)objectArray[26]).intValue());
        objectArray2[((Integer)objectArray[9]).intValue()] = this;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.iIlIlllllill.IIlllIlliIll("b0d6ba62-d673-40e1-86d9-266dc32e04d9", (long)3239395737464751219L, (Object[])objectArray2, (String)"aJJveHWztairq7yQc3KVe3h2aYhkp21sb45ugIOCamuqabm4VFVdvL9RXp2zXbVbWFlGqERFgEyvQaFPTE1KS0dJNg==", (String)"N3hsdFBx", (String)"Um5lSXk2", (int)iliIiiliiiii[22], (int)iliIiiliiiii[23], (int)iliIiiliiiii[24], (String)"RGeHl3qCaIS1cYl9cbifjXZyb3+1qoJtl3uZqmyaaGatjKBZX1xKgg==", (int)iliIiiliiiii[25], (String)"jpJ0", (String)"i4K0d29sfXK2tqWkpr9/YGB5kXp9Zmahb2N2ZGpvnWuqjVagS15Uu6dJqQ==");
    }

    /*
     * Exception decompiling
     */
    public static Class IlIlllIlilIl(String var0) {
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
    public static MethodHandle Illlllllilll(String var0, String var1_1, String var2_2, int var3_3, int var4_4, int var5_5, String var6_6, int var7_7, String var8_8, String var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [39[UNCONDITIONALDOLOOP]], but top level block is 1[TRYBLOCK]
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
    private void tankAura(Location location) {
        Object[] objectArray = new Object[42];
        objectArray[37] = iliIiiliiiii[65];
        objectArray[31] = iliIiiliiiii[66];
        objectArray[27] = (int)((Integer)objectArray[37]);
        objectArray[37] = ((Integer)objectArray[27] | (Integer)objectArray[31]) + ((Integer)objectArray[27] & (Integer)objectArray[31]);
        objectArray[31] = iliIiiliiiii[67];
        objectArray[27] = (int)((Integer)objectArray[37]);
        objectArray[37] = ((Integer)objectArray[27] & ~((Integer)objectArray[31]).intValue()) - (~((Integer)objectArray[27]).intValue() & (Integer)objectArray[31]);
        Object[] objectArray2 = new Object[((Integer)objectArray[37]).intValue()];
        objectArray[0] = iliIiiliiiii[68];
        objectArray[31] = iliIiiliiiii[69];
        objectArray[27] = (int)((Integer)objectArray[0]);
        objectArray[0] = (Integer)objectArray[27] + ~((Integer)objectArray[31]).intValue() + 1;
        objectArray[31] = iliIiiliiiii[70];
        objectArray[27] = (int)((Integer)objectArray[0]);
        objectArray[0] = 2 * ((Integer)objectArray[27] & ~((Integer)objectArray[31]).intValue()) - ((Integer)objectArray[27] ^ (Integer)objectArray[31]);
        objectArray2[((Integer)objectArray[0]).intValue()] = this;
        objectArray[36] = iliIiiliiiii[71];
        objectArray[31] = iliIiiliiiii[72];
        objectArray[27] = (int)((Integer)objectArray[36]);
        objectArray[36] = (Integer)objectArray[27] - ~((Integer)objectArray[31]).intValue() - 1;
        objectArray[31] = iliIiiliiiii[73];
        objectArray[27] = (int)((Integer)objectArray[36]);
        objectArray[36] = ((Integer)objectArray[27] | (Integer)objectArray[31]) - ((Integer)objectArray[27] & (Integer)objectArray[31]);
        objectArray2[((Integer)objectArray[36]).intValue()] = location;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.iIlIlllllill.IIlllIlliIll("29e2743b-c6dc-4ded-9cb3-03d02286c174", (long)-215691964370912029L, (Object[])objectArray2, (String)"bJaThIlPsayvr7Ccf36Rf3xydZR4u2loa4pijI+Obm+ubYWEaGlZuLtVUpG/UbFfXF1atFhZhEirRa1DQEFOT0NNSg==", (String)"NGpIeEdX", (String)"emFEeFdv", (int)iliIiiliiiii[74], (int)iliIiiliiiii[75], (int)iliIiiliiiii[76], (String)"QGN7a4Z+bICxdYVxfbSbiXJ2c2OptoZpk3+VpmCWbGKpiJxlY2BOhg==", (int)iliIiiliiiii[77], (String)"ipaI", (String)"j4ZIi5OQeXaysqmoqrN7ZGR9jWZhemKla2d6aGZjmW+uiWqcd2JQv6NNpQ==");
        int n = (0xB37F071D | 0x77A6A2BB) - (0xB37F071D & 0x77A6A2BB);
        int cfr_ignored_0 = n + 2007409339;
    }

    private void lifestealerAura(Location location) {
        Object[] objectArray = new Object[40];
        objectArray[4] = iliIiiliiiii[52];
        objectArray[12] = iliIiiliiiii[53];
        objectArray[22] = (int)((Integer)objectArray[4]);
        objectArray[4] = 2 * ((Integer)objectArray[22] | (Integer)objectArray[12]) - ((Integer)objectArray[22] ^ (Integer)objectArray[12]);
        objectArray[12] = iliIiiliiiii[54];
        objectArray[22] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[22] | (Integer)objectArray[12]) + ((Integer)objectArray[22] & (Integer)objectArray[12]);
        Object[] objectArray2 = new Object[((Integer)objectArray[4]).intValue()];
        objectArray[13] = iliIiiliiiii[55];
        objectArray[12] = iliIiiliiiii[56];
        objectArray[22] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[22] ^ (Integer)objectArray[12]) - 2 * (~((Integer)objectArray[22]).intValue() & (Integer)objectArray[12]);
        objectArray[12] = iliIiiliiiii[57];
        objectArray[22] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[22] | (Integer)objectArray[12]) - ((Integer)objectArray[22] & (Integer)objectArray[12]);
        objectArray2[((Integer)objectArray[13]).intValue()] = this;
        objectArray[0] = iliIiiliiiii[58];
        objectArray[12] = iliIiiliiiii[59];
        objectArray[22] = (int)((Integer)objectArray[0]);
        objectArray[0] = (Integer)objectArray[22] - ~((Integer)objectArray[12]).intValue() - 1;
        objectArray[12] = iliIiiliiiii[60];
        objectArray[22] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[22] | (Integer)objectArray[12]) + ((Integer)objectArray[22] & (Integer)objectArray[12]);
        objectArray2[((Integer)objectArray[0]).intValue()] = location;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.iIlIlllllill.IIlllIlliIll("12f3bba9-485b-4b7e-9c8b-5165a568e6b9", (long)5707554694958532645L, (Object[])objectArray2, (String)"bZGSh4iwsK+uqLGffnGQfH11dJd5pGhrao1jj46Bb2yvaoSHaVZYu7pSU5K+XrBcXVpbt1lGhUuqQqxAQU5PTEJKSw==", (String)"clpxaGpO", (String)"WTUxazI0", (int)iliIiiliiiii[61], (int)iliIiiliiiii[62], (int)iliIiiliiiii[63], (String)"QWR6aIeBbYOwcoRyfLuainNxcmCoqYdqkniUpWGZbWGoj51mYl9PhQ==", (int)iliIiiliiiii[64], (String)"i5GJ", (String)"joFJiJJveHWztairq7x6Z2V6jGVgZWOmamB7a2dsmGyvjmufdl1RvKJKpA==");
    }

    private static Color c(int n) {
        Object[] objectArray = new Object[26];
        objectArray[24] = iliIiiliiiii[78];
        objectArray[21] = iliIiiliiiii[79];
        objectArray[17] = (int)((Integer)objectArray[24]);
        objectArray[24] = (Integer)objectArray[17] + ~((Integer)objectArray[21]).intValue() + 1;
        objectArray[21] = iliIiiliiiii[80];
        objectArray[17] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[17] & ~((Integer)objectArray[21]).intValue()) - (~((Integer)objectArray[17]).intValue() & (Integer)objectArray[21]);
        Object[] objectArray2 = new Object[((Integer)objectArray[24]).intValue()];
        objectArray[2] = iliIiiliiiii[81];
        objectArray[21] = iliIiiliiiii[82];
        objectArray[17] = (int)((Integer)objectArray[2]);
        objectArray[2] = ((Integer)objectArray[17] | (Integer)objectArray[21]) & ~((Integer)objectArray[17] & (Integer)objectArray[21]);
        objectArray[21] = iliIiiliiiii[83];
        objectArray[17] = (int)((Integer)objectArray[2]);
        objectArray[2] = (Integer)objectArray[17] + ~((Integer)objectArray[21]).intValue() + 1;
        objectArray2[((Integer)objectArray[2]).intValue()] = Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.iIlIlllllill.IIlllIlliIll("d7a09377-1f77-4116-b4fe-a2092a8c3b19", (int)n, (String)"b5eUhYpOTq2srredfH+efn9zcpV7unZpaItljYyPYW6tbIKFa2hmubhUVZC8UL5eX1xdtVtYm0moRKpCQ0BBTkBMTQ==", (String)"ZjZnQ01H", (String)"a2NwQ0x2", (int)iliIiiliiiii[84], (int)iliIiiliiiii[85], (int)iliIiiliiiii[86], (String)"Q2NCaoV/k4GydIJwfrWefGd3cHF9qQ==", (int)iliIiiliiiii[87], (String)"lXuNkYBtgw==", (String)"gXuXfUmIfnR6tppwa3t8dXk=");
        return (Color)Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.iIlIlllllill.IIlllIlliIll("c6cc6373-2df4-4c31-aab0-6fba5c71514f", (long)6057640199700111387L, (Object[])objectArray2, (String)"bpSVgotNT1KtrbaafXyfcX5wc5J6uXd2aYhkio2MYGGsb4OCamtnhrlXVJe9U79RXl9cslpbmlapR6tFQkNAQUFPTA==", (String)"RmNIMVVV", (String)"RTRVc01X", (int)iliIiiliiiii[88], (int)iliIiiliiiii[89], (int)iliIiiliiiii[90], (String)"QmF9bYR8kn6zd4N3f7aVh3B0dWWrtJh3kX2ToGKUYmyrippjYWJwuA==", (int)iliIiiliiiii[91], (String)"iJSO", (String)"jYROjZGSh4iwsK+uqLF1amZ/i2BjeHy7aWV8bmRhl2Gsi2yadWBugaFPow==");
    }

    public iIlIlllllill(Player player, String string) {
        Object[] objectArray = new Object[30];
        objectArray[4] = iliIiiliiiii[0];
        objectArray[21] = iliIiiliiiii[1];
        objectArray[5] = (int)((Integer)objectArray[4]);
        objectArray[4] = 2 * ((Integer)objectArray[5] | (Integer)objectArray[21]) - ((Integer)objectArray[5] ^ (Integer)objectArray[21]);
        objectArray[21] = iliIiiliiiii[2];
        objectArray[5] = (int)((Integer)objectArray[4]);
        objectArray[4] = 2 * ((Integer)objectArray[5] & ~((Integer)objectArray[21]).intValue()) - ((Integer)objectArray[5] ^ (Integer)objectArray[21]);
        Object[] objectArray2 = new Object[((Integer)objectArray[4]).intValue()];
        objectArray[12] = iliIiiliiiii[3];
        objectArray[21] = iliIiiliiiii[4];
        objectArray[5] = (int)((Integer)objectArray[12]);
        objectArray[12] = (Integer)objectArray[5] & ~((Integer)objectArray[21]).intValue() | ~((Integer)objectArray[5]).intValue() & (Integer)objectArray[21];
        objectArray[21] = iliIiiliiiii[5];
        objectArray[5] = (int)((Integer)objectArray[12]);
        objectArray[12] = 2 * ((Integer)objectArray[5] | (Integer)objectArray[21]) - ((Integer)objectArray[5] ^ (Integer)objectArray[21]);
        objectArray2[((Integer)objectArray[12]).intValue()] = this;
        objectArray[18] = iliIiiliiiii[6];
        objectArray[21] = iliIiiliiiii[7];
        objectArray[5] = (int)((Integer)objectArray[18]);
        objectArray[18] = 2 * ((Integer)objectArray[5] | (Integer)objectArray[21]) - ((Integer)objectArray[5] ^ (Integer)objectArray[21]);
        objectArray[21] = iliIiiliiiii[8];
        objectArray[5] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[5] | (Integer)objectArray[21]) - ((Integer)objectArray[5] & (Integer)objectArray[21]);
        objectArray2[((Integer)objectArray[18]).intValue()] = player;
        objectArray[14] = iliIiiliiiii[9];
        objectArray[21] = iliIiiliiiii[10];
        objectArray[5] = (int)((Integer)objectArray[14]);
        objectArray[14] = (Integer)objectArray[5] & ~((Integer)objectArray[21]).intValue() | ~((Integer)objectArray[5]).intValue() & (Integer)objectArray[21];
        objectArray[21] = iliIiiliiiii[11];
        objectArray[5] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[5] ^ (Integer)objectArray[21]) + 2 * ((Integer)objectArray[5] & (Integer)objectArray[21]);
        objectArray2[((Integer)objectArray[14]).intValue()] = string;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.iIlIlllllill.IIlllIlliIll("e2db5443-2601-4180-ba0e-7878b1206b47", (long)3446293348759410657L, (Object[])objectArray2, (String)"aW1ue3S0tKuqpL2TcnWUeHlpaItloGxvboFvg4KFa2irVri7VVJcv75eX56yWrRYWUZHq0VCgU+uTqBMTUpLSEY2Nw==", (String)"a3haYUwz", (String)"Q0RVeUZL", (int)iliIiiliiiii[12], (int)iliIiiliiiii[13], (int)iliIiiliiiii[14], (String)"RZiGlHuFaYe0foh+cL+ejndtbny0rYNulnSYqW2daWWss6FaXltLgQ==", (int)iliIiiliiiii[15], (String)"j211", (String)"in21dG5rfHG3uaSnp7h+Y2FmkHl8YWeibmx3Z2tonGirslejSllVuKZGqA==");
    }

    /*
     * Exception decompiling
     */
    public static String IiIlliIliiIl(String var0) {
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
    private static String Iilllilliill(String string, int n, int n2) {
        if (IlIlllIlilIl) {
            throw new EmptyStackException();
        }
        Object[] objectArray = new Object[6];
        objectArray[5] = Base64.getDecoder().decode(string);
        objectArray[4] = iliIiiliiiii[127];
        while ((Integer)objectArray[4] < ((byte[])objectArray[5]).length) {
            byte[] byArray = (byte[])objectArray[5];
            int n3 = (Integer)objectArray[4];
            objectArray[2] = (int)((Integer)objectArray[4]);
            objectArray[0] = n;
            objectArray[2] = 2 * ((Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue()) - ((Integer)objectArray[0] ^ (Integer)objectArray[2]);
            objectArray[0] = (int)byArray[n3];
            objectArray[2] = n2;
            objectArray[0] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
            byArray[n3] = (byte)(((Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue()) - (~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2]));
            objectArray[4] = (Integer)objectArray[4] + 1;
        }
        try {
            return new String((byte[])objectArray[5], StandardCharsets.UTF_8);
        }
        catch (IllegalAccessError illegalAccessError) {
            throw illegalAccessError;
        }
        catch (InstantiationError instantiationError) {
            throw instantiationError;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void infernoAura(Location location) {
        if (IlIlllIlilIl) {
            throw new AssertionError();
        }
        Object[] objectArray = new Object[41];
        objectArray[34] = iliIiiliiiii[26];
        objectArray[37] = iliIiiliiiii[27];
        objectArray[9] = (int)((Integer)objectArray[34]);
        objectArray[34] = (Integer)objectArray[9] - ~((Integer)objectArray[37]).intValue() - 1;
        objectArray[37] = iliIiiliiiii[28];
        objectArray[9] = (int)((Integer)objectArray[34]);
        objectArray[34] = (Integer)objectArray[9] - ~((Integer)objectArray[37]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[34]).intValue()];
        objectArray[10] = iliIiiliiiii[29];
        objectArray[37] = iliIiiliiiii[30];
        objectArray[9] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[9] ^ (Integer)objectArray[37]) + 2 * ((Integer)objectArray[9] & (Integer)objectArray[37]);
        objectArray[37] = iliIiiliiiii[31];
        objectArray[9] = (int)((Integer)objectArray[10]);
        objectArray[10] = 2 * ((Integer)objectArray[9] | (Integer)objectArray[37]) - ((Integer)objectArray[9] ^ (Integer)objectArray[37]);
        objectArray2[((Integer)objectArray[10]).intValue()] = this;
        objectArray[39] = iliIiiliiiii[32];
        objectArray[37] = iliIiiliiiii[33];
        objectArray[9] = (int)((Integer)objectArray[39]);
        objectArray[39] = 2 * ((Integer)objectArray[9] & ~((Integer)objectArray[37]).intValue()) - ((Integer)objectArray[9] ^ (Integer)objectArray[37]);
        objectArray[37] = iliIiiliiiii[34];
        objectArray[9] = (int)((Integer)objectArray[39]);
        objectArray[39] = ((Integer)objectArray[9] | (Integer)objectArray[37]) - ((Integer)objectArray[9] & (Integer)objectArray[37]);
        objectArray2[((Integer)objectArray[39]).intValue()] = location;
        Lusik21556.IiiIlliiIl.iiiIlIIIll.lIIlliIIll.IlIllllIll.iIlIlllllill.IIlllIlliIll("8cb55d06-cc98-4fbf-b289-9de5e69ff97e", (long)8442710387162763147L, (Object[])objectArray2, (String)"a5OQeXaysqmoqrORcHOSent3dolnpmptbI9hgYCDbWqpaIa5V1RavbxQUZywXLJaW1hZqUdEh02sQK5OT0xNSkRISQ==", (String)"T2JPZFNz", (String)"d1VBa0Fy", (int)iliIiiliiiii[35], (int)iliIiiliiiii[36], (int)iliIiiliiiii[37], (String)"R2Z4lnmDb4W2cIZ8crmYjHVzcH62q4VslHqWq2+bb2eujZ9YXF1Ngw==", (int)iliIiiliiiii[38], (String)"jZOL", (String)"iINLdmxtenO1t6qlpb54YWN4jnt+Z2GgbGJ5ZWlummqpjGmhSF9TuqRIpg==");
        int n = (0x9F423EDC | 0x9227D905) - (0x9F423EDC & 0x9227D905);
        int cfr_ignored_0 = n + -1842882299;
    }
}


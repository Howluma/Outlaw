/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.entity.EntityDamageByEntityEvent
 */
package Lusik21556.IliIlllilIi.liiiIIllIl.iIlIlllllill.IilliliilIIi.lIiiIiIlilli.iliIiiliiiii;

import Lusik21556.Illlllllilll.Iilllilliill.IIillIiliIil.Ililllililil.Iiilliiliiil.IIIilIIiiIIi.IliIlllilIi;
import java.io.SyncFailedException;
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
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public final class Illlllllilll
implements Listener {
    private Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi IliIlllilIi;
    public static int[] IilliliilIIi;
    static AtomicReferenceArray<MethodHandle> iIlIlllllill;
    public static int lIiiIiIlilli;
    public static boolean iliIiiliiiii;

    @EventHandler(ignoreCancelled=true)
    public void onHit(EntityDamageByEntityEvent entityDamageByEntityEvent) {
        Object[] objectArray = new Object[58];
        objectArray[5] = IilliliilIIi[15];
        objectArray[2] = IilliliilIIi[16];
        objectArray[33] = (int)((Integer)objectArray[5]);
        objectArray[5] = (Integer)objectArray[33] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[33]).intValue() & (Integer)objectArray[2];
        objectArray[2] = IilliliilIIi[17];
        objectArray[33] = (int)((Integer)objectArray[5]);
        objectArray[5] = (Integer)objectArray[33] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[33]).intValue() & (Integer)objectArray[2];
        Object[] objectArray2 = new Object[((Integer)objectArray[5]).intValue()];
        objectArray[25] = IilliliilIIi[18];
        objectArray[2] = IilliliilIIi[19];
        objectArray[33] = (int)((Integer)objectArray[25]);
        objectArray[25] = (Integer)objectArray[33] - ~((Integer)objectArray[2]).intValue() - 1;
        objectArray[2] = IilliliilIIi[20];
        objectArray[33] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[33] & ~((Integer)objectArray[2]).intValue()) - (~((Integer)objectArray[33]).intValue() & (Integer)objectArray[2]);
        objectArray2[((Integer)objectArray[25]).intValue()] = this;
        objectArray[53] = IilliliilIIi[21];
        objectArray[2] = IilliliilIIi[22];
        objectArray[33] = (int)((Integer)objectArray[53]);
        objectArray[53] = ((Integer)objectArray[33] | (Integer)objectArray[2]) & (~((Integer)objectArray[33]).intValue() | ~((Integer)objectArray[2]).intValue());
        objectArray[2] = IilliliilIIi[23];
        objectArray[33] = (int)((Integer)objectArray[53]);
        objectArray[53] = ((Integer)objectArray[33] | (Integer)objectArray[2]) & ~((Integer)objectArray[33] & (Integer)objectArray[2]);
        objectArray2[((Integer)objectArray[53]).intValue()] = entityDamageByEntityEvent;
        Illlllllilll.iliIiiliiiii("c4706eda-10ef-49a2-b687-0d1e7476180e", (long)5094435406441741075L, (Object[])objectArray2, (String)"TXZ0amwzMjY2Ny9KbWpKbW1tam1Kai9tampqSkptbUptL2pKbUptbW1tbWptbS9Kam1tam1qam1KSmovbUpqakpqSm1qbW1qL2ptakpqam1qampqai9KbW1tbW1tbWptbW0=", (int)IilliliilIIi[24], (String)"c3Zv", (int)IilliliilIIi[25], (String)"KUtcTWtid2IwbWJvaDBQY2tmZHU8Kk1rYndiMG1ib2gwUGNrZmR1PA==", (String)"bmYvbXZ0amwzMjY2Ny9wdnVtYnh0bnEvam91ZnNvYm0vUW1iemZzRWJ1Yg==", (int)IilliliilIIi[26], (int)IilliliilIIi[27], (int)IilliliilIIi[28], (int)IilliliilIIi[29]);
    }

    /*
     * Exception decompiling
     */
    public static String lIiiIiIlilli(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[CASE]], but top level block is 0[TRYBLOCK]
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
        int n2 = n = (0x16B1F4BD | 0x1BEE96F1) - (0x16B1F4BD & 0x1BEE96F1);
        lIiiIiIlilli = n2 + 468621041 - (n2 & 0x1BEE96F1) * 2;
        if (1279572408 <= lIiiIiIlilli) {
            int n3 = n = (0xF | 0x1BEE96F1) - (0xF & 0x1BEE96F1);
            int cfr_ignored_0 = n3 + 468621041 - (n3 & 0x1BEE96F1) * 2;
        }
        int n4 = (0xDECB3E70 | 0xBEB86E96) - (0xDECB3E70 & 0xBEB86E96);
        int cfr_ignored_1 = n4 + -1095209322;
        Illlllllilll.IiIlliIliiIl();
        Illlllllilll.iliIiiliiiii("f5ed2cfc-4a3c-40b2-b9c6-a3e6bc3ad52e", Illlllllilll.class, (String)"T3h2bG41NDg4OTFMb2xMb29vbG9MbDFvbGxsTExvb0xvMWxMb0xvb29vb2xvbzFMbG9vbG9sbG9MTGwxb0xsbExsTG9sb29sMWxvbExsbG9sbGxsbDFMb29vb29vb2xvb28=", (int)IilliliilIIi[45], (String)"b3JkZ1lw", (int)IilliliilIIi[46], (String)"K09tZHlkMm9kcWoyRm9kdnY+LFk=", (String)"cGgxb3h2bG41NDg4OTFyeHdvZHp2cHMxbHF3aHVxZG8xU29kfGh1R2R3ZA==", (int)IilliliilIIi[47], (int)IilliliilIIi[48], (int)IilliliilIIi[49], (int)IilliliilIIi[50]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Illlllllilll(Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi iliIlllilIi) {
        if (iliIiiliiiii) {
        }
        Object[] objectArray = new Object[28];
        objectArray[16] = IilliliilIIi[0];
        objectArray[17] = IilliliilIIi[1];
        objectArray[19] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[19] & ~((Integer)objectArray[17]).intValue() | ~((Integer)objectArray[19]).intValue() & (Integer)objectArray[17];
        objectArray[17] = IilliliilIIi[2];
        objectArray[19] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[19] + ~((Integer)objectArray[17]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[16]).intValue()];
        objectArray[18] = IilliliilIIi[3];
        objectArray[17] = IilliliilIIi[4];
        objectArray[19] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[19] ^ (Integer)objectArray[17]) + 2 * ((Integer)objectArray[19] & (Integer)objectArray[17]);
        objectArray[17] = IilliliilIIi[5];
        objectArray[19] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[19] | (Integer)objectArray[17]) & (~((Integer)objectArray[19]).intValue() | ~((Integer)objectArray[17]).intValue());
        objectArray2[((Integer)objectArray[18]).intValue()] = this;
        objectArray[22] = IilliliilIIi[6];
        objectArray[17] = IilliliilIIi[7];
        objectArray[19] = (int)((Integer)objectArray[22]);
        objectArray[22] = (Integer)objectArray[19] & ~((Integer)objectArray[17]).intValue() | ~((Integer)objectArray[19]).intValue() & (Integer)objectArray[17];
        objectArray[17] = IilliliilIIi[8];
        objectArray[19] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[19] | (Integer)objectArray[17]) & (~((Integer)objectArray[19]).intValue() | ~((Integer)objectArray[17]).intValue());
        objectArray2[((Integer)objectArray[22]).intValue()] = iliIlllilIi;
        Illlllllilll.iliIiiliiiii("1b81211d-9382-482c-814f-b3d53f448346", (long)3827810432447863809L, (Object[])objectArray2, (String)"THVzaWsyMTU1Ni5JbGlJbGxsaWxJaS5saWlpSUlsbElsLmlJbElsbGxsbGlsbC5JaWxsaWxpaWxJSWkubElpaUlpSWxpbGxpLmlsaUlpaWxpaWlpaS5JbGxsbGxsbGlsbGw=", (int)IilliliilIIi[9], (String)"cnVu", (int)IilliliilIIi[10], (String)"KEpbTGphdmEvbGFuZy9PYmplY3Q7KUxqYXZhL2xhbmcvT2JqZWN0Ow==", (String)"bWUubHVzaWsyMTU1Ni5vdXRsYXdzbXAuaW50ZXJuYWwuUGxheWVyRGF0YQ==", (int)IilliliilIIi[11], (int)IilliliilIIi[12], (int)IilliliilIIi[13], (int)IilliliilIIi[14]);
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle IIIllIIliIIl(String var0, int var1_1, String var2_2, int var3_3, String var4_4, String var5_5, int var6_6, int var7_7, int var8_8, int var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK], 3[TRYBLOCK], 4[TRYBLOCK]], but top level block is 26[SWITCH]
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
    private static String IlIlllIlilIl(String var0, int var1_1, int var2_2) {
        block13: {
            if (Illlllllilll.iliIiiliiiii) {
                5 + 48;
            }
            var10_5 = new Object[7];
            var10_5[1] = Base64.getDecoder().decode(var0);
            var8_3 = (-1967159400 | -433970509) - (-1967159400 & -433970509);
            var8_3 + -433970509;
            var10_5[5] = Illlllllilll.IilliliilIIi[82];
            break block13;
            while (true) {
                try {
                    return new String((byte[])var10_5[1], StandardCharsets.UTF_8);
                }
                catch (SyncFailedException v0) {
                    throw v0;
                }
                catch (IllegalAccessError v1) {
                    throw v1;
                }
                break;
            }
        }
        while (true) {
            var9_4 = (506986497 | -1556839049) - (506986497 & -1556839049);
            v2 = var9_4;
            switch (v2 + -1556839049 - (v2 & -1556839049) * 2) {
                default: {
                    if ((Integer)var10_5[5] >= ((byte[])var10_5[1]).length) ** continue;
                    break;
                }
                case -1613152220: 
            }
            v3 = (byte[])var10_5[1];
            v4 = (Integer)var10_5[5];
            var10_5[6] = var1_1;
            var10_5[3] = (int)v3[v4];
            var10_5[6] = var2_2;
            var10_5[3] = ((Integer)var10_5[3] ^ (Integer)var10_5[6]) - 2 * (~((Integer)var10_5[3]).intValue() & (Integer)var10_5[6]);
            v3[v4] = (byte)(((Integer)var10_5[3] | (Integer)var10_5[6]) - ((Integer)var10_5[3] & (Integer)var10_5[6]));
            var10_5[5] = (Integer)var10_5[5] + 1;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void IiIlliIliiIl() {
        int n;
        int n2;
        int n3 = n2 = (0xC9A713F | 0x536A4B5D) - (0xC9A713F & 0x536A4B5D);
        lIiiIiIlilli = n3 + 1399475037 - (n3 & 0x536A4B5D) * 2;
        if (1029154225 < lIiiIiIlilli) {
            int n4 = n2 = (0x4B | 0x536A4B5D) - (0x4B & 0x536A4B5D);
            int cfr_ignored_0 = n4 + 1399475037 - (n4 & 0x536A4B5D) * 2;
        }
        Object[] objectArray = new Object[3];
        try {
            objectArray[2] = 65776;
            objectArray[0] = 65699;
            IilliliilIIi = new int[(Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2]];
            objectArray[2] = 26181;
            objectArray[0] = 26190;
            objectArray[2] = 26181;
            objectArray[0] = -1056378244;
            Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
            objectArray[2] = 41257;
            objectArray[0] = 41238;
            objectArray[2] = 41257;
            objectArray[0] = 41257;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
            objectArray[2] = 17273;
            objectArray[0] = 17215;
            objectArray[2] = 17273;
            objectArray[0] = 17277;
            Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
            objectArray[2] = 29318;
            objectArray[0] = 29319;
            objectArray[2] = 29318;
            objectArray[0] = 29340;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
            objectArray[2] = 39369;
            objectArray[0] = 39304;
            objectArray[2] = 39369;
            objectArray[0] = -39370;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
            objectArray[2] = 37281;
            objectArray[0] = 37345;
            objectArray[2] = 37281;
            objectArray[0] = 37281;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
            objectArray[2] = 43076;
            objectArray[0] = 43097;
            objectArray[2] = 43076;
            objectArray[0] = 43076;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
            objectArray[2] = 24616;
            objectArray[0] = 24608;
            objectArray[2] = 24616;
            objectArray[0] = -24630;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
            objectArray[2] = 30501;
            objectArray[0] = 30560;
            objectArray[2] = 30501;
            objectArray[0] = 30502;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
            objectArray[2] = 57380;
            objectArray[0] = 57378;
            objectArray[2] = 57380;
            objectArray[0] = -57355;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
            objectArray[2] = 19212;
            objectArray[0] = 19225;
            objectArray[2] = 19212;
            objectArray[0] = -19268;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue())] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
            n = (0x41516A40 | 0x9068C36) - (0x41516A40 & 0x9068C36);
        }
        catch (InstantiationError instantiationError) {
            throw instantiationError;
        }
        catch (SyncFailedException syncFailedException) {
            throw syncFailedException;
        }
        block20: while (true) {
            int n5 = n;
            switch (n5 + 151424054 - (n5 & 0x9068C36) * 2) {
                case -1845017227: {
                    objectArray[2] = 37629;
                    objectArray[0] = 37576;
                    objectArray[2] = 37629;
                    objectArray[0] = 37629;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
                    n = (0x62CF65C4 | 0x9068C36) - (0x62CF65C4 & 0x9068C36);
                    continue block20;
                }
                case 1657759172: {
                    objectArray[2] = 39689;
                    objectArray[0] = 39725;
                    objectArray[2] = 39689;
                    objectArray[0] = 39885;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 7156;
                    objectArray[0] = 7162;
                    objectArray[2] = 7156;
                    objectArray[0] = 7156;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 16457;
                    objectArray[0] = 16479;
                    objectArray[2] = 16457;
                    objectArray[0] = -16393;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
                    objectArray[2] = 65388;
                    objectArray[0] = 65315;
                    objectArray[2] = 65388;
                    objectArray[0] = 65389;
                    Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
                    objectArray[2] = 37568;
                    objectArray[0] = 37585;
                    objectArray[2] = 37568;
                    objectArray[0] = 37519;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 7280;
                    objectArray[0] = 7255;
                    objectArray[2] = 7280;
                    objectArray[0] = 7282;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue())] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
                    objectArray[2] = 42607;
                    objectArray[0] = 42557;
                    objectArray[2] = 42607;
                    objectArray[0] = 42607;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
                    objectArray[2] = 69026;
                    objectArray[0] = 69089;
                    objectArray[2] = 69026;
                    objectArray[0] = 69027;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 46579;
                    objectArray[0] = 46570;
                    objectArray[2] = 46579;
                    objectArray[0] = -1585033341;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 69170;
                    objectArray[0] = 69123;
                    objectArray[2] = 69170;
                    objectArray[0] = -1794776671;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 360;
                    objectArray[0] = 325;
                    objectArray[2] = 360;
                    objectArray[0] = 363;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
                    objectArray[2] = 54214;
                    objectArray[0] = 54212;
                    objectArray[2] = 54214;
                    objectArray[0] = 54252;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
                    objectArray[2] = 31832;
                    objectArray[0] = 31760;
                    objectArray[2] = 31832;
                    objectArray[0] = 31838;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
                    n = (0xC618BF96 | 0x9068C36) - (0xC618BF96 & 0x9068C36);
                    continue block20;
                }
                case -971456618: {
                    objectArray[2] = 19719;
                    objectArray[0] = 19737;
                    objectArray[2] = 19719;
                    objectArray[0] = 19912;
                    Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
                    objectArray[2] = 43453;
                    objectArray[0] = 43500;
                    objectArray[2] = 43453;
                    objectArray[0] = 43411;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 17802;
                    objectArray[0] = 17869;
                    objectArray[2] = 17802;
                    objectArray[0] = 17807;
                    Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
                    n = (0xBBE60684 | 0x9068C36) - (0xBBE60684 & 0x9068C36);
                    continue block20;
                }
                case -1142552956: {
                    return;
                }
                default: {
                    objectArray[2] = 56626;
                    objectArray[0] = 56606;
                    objectArray[2] = 56626;
                    objectArray[0] = 56626;
                    Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
                    objectArray[2] = 36098;
                    objectArray[0] = 36139;
                    objectArray[2] = 36098;
                    objectArray[0] = -1598766372;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 34208;
                    objectArray[0] = 34227;
                    objectArray[2] = 34208;
                    objectArray[0] = 34288;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 28829;
                    objectArray[0] = 28881;
                    objectArray[2] = 28829;
                    objectArray[0] = 28851;
                    Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
                    n = (0xE8D2B153 | 0x9068C36) - (0xE8D2B153 & 0x9068C36);
                    continue block20;
                }
                case -388845229: {
                    objectArray[2] = 65274;
                    objectArray[0] = 65214;
                    objectArray[2] = 65274;
                    objectArray[0] = 65272;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 6891;
                    objectArray[0] = 6888;
                    objectArray[2] = 6891;
                    objectArray[0] = -6856;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
                    objectArray[2] = 8336;
                    objectArray[0] = 8354;
                    objectArray[2] = 8336;
                    objectArray[0] = 8336;
                    Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 21006;
                    objectArray[0] = 21025;
                    objectArray[2] = 21006;
                    objectArray[0] = -1945785579;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
                    n = (0xFC1530C5 | 0x9068C36) - (0xFC1530C5 & 0x9068C36);
                    continue block20;
                }
                case -65720123: {
                    objectArray[2] = 28743;
                    objectArray[0] = 28767;
                    objectArray[2] = 28743;
                    objectArray[0] = 28742;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
                    objectArray[2] = 44922;
                    objectArray[0] = 44889;
                    objectArray[2] = 44922;
                    objectArray[0] = -44900;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
                    objectArray[2] = 34418;
                    objectArray[0] = 34386;
                    objectArray[2] = 34418;
                    objectArray[0] = -34329;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 56343;
                    objectArray[0] = 56332;
                    objectArray[2] = 56343;
                    objectArray[0] = 1392375033;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
                    objectArray[2] = 16338;
                    objectArray[0] = 16371;
                    objectArray[2] = 16338;
                    objectArray[0] = 16317;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
                    objectArray[2] = 66582;
                    objectArray[0] = 66587;
                    objectArray[2] = 66582;
                    objectArray[0] = 59869552;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 37938;
                    objectArray[0] = 37942;
                    objectArray[2] = 37938;
                    objectArray[0] = 38008;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
                    n = (0x1A242920 | 0x9068C36) - (0x1A242920 & 0x9068C36);
                    continue block20;
                }
                case 438577440: {
                    objectArray[2] = 4856;
                    objectArray[0] = 4776;
                    objectArray[2] = 4856;
                    objectArray[0] = 4823;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 16604;
                    objectArray[0] = 16588;
                    objectArray[2] = 16604;
                    objectArray[0] = 16598;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 3603;
                    objectArray[0] = 3643;
                    objectArray[2] = 3603;
                    objectArray[0] = -1584991133;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
                    objectArray[2] = 5972;
                    objectArray[0] = 5913;
                    objectArray[2] = 5972;
                    objectArray[0] = 5972;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
                    n = (0xA4F85250 | 0x9068C36) - (0xA4F85250 & 0x9068C36);
                    continue block20;
                }
                case -1527229872: {
                    objectArray[2] = 11400;
                    objectArray[0] = 11434;
                    objectArray[2] = 11400;
                    objectArray[0] = 11517;
                    Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 35149;
                    objectArray[0] = 35167;
                    objectArray[2] = 35149;
                    objectArray[0] = -35132;
                    Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
                    n = (0xAD52D35F | 0x9068C36) - (0xAD52D35F & 0x9068C36);
                    continue block20;
                }
                case -1387080865: {
                    objectArray[2] = 41488;
                    objectArray[0] = 41512;
                    objectArray[2] = 41488;
                    objectArray[0] = 41489;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
                    objectArray[2] = 59082;
                    objectArray[0] = 59093;
                    objectArray[2] = 59082;
                    objectArray[0] = 59011;
                    Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
                    objectArray[2] = 6913;
                    objectArray[0] = 6913;
                    objectArray[2] = 6913;
                    objectArray[0] = 6944;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 15937;
                    objectArray[0] = 15985;
                    objectArray[2] = 15937;
                    objectArray[0] = 1875704718;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 36968;
                    objectArray[0] = 36962;
                    objectArray[2] = 36968;
                    objectArray[0] = -1585026536;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
                    objectArray[2] = 15838;
                    objectArray[0] = 15850;
                    objectArray[2] = 15838;
                    objectArray[0] = 15839;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 29408;
                    objectArray[0] = 29406;
                    objectArray[2] = 29408;
                    objectArray[0] = 29408;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 32050;
                    objectArray[0] = 32038;
                    objectArray[2] = 32050;
                    objectArray[0] = -32021;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 6184;
                    objectArray[0] = 6183;
                    objectArray[2] = 6184;
                    objectArray[0] = 6210;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
                    n = (0x80B1FB7E | 0x9068C36) - (0x80B1FB7E & 0x9068C36);
                    continue block20;
                }
                case -2135819394: {
                    objectArray[2] = 13684;
                    objectArray[0] = 13645;
                    objectArray[2] = 13684;
                    objectArray[0] = 13685;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
                    objectArray[2] = 44420;
                    objectArray[0] = 44495;
                    objectArray[2] = 44420;
                    objectArray[0] = 44459;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
                    objectArray[2] = 64622;
                    objectArray[0] = 64576;
                    objectArray[2] = 64622;
                    objectArray[0] = -1585052130;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue())] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
                    objectArray[2] = 6629;
                    objectArray[0] = 6649;
                    objectArray[2] = 6629;
                    objectArray[0] = -1496016289;
                    Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
                    n = (0xA7A63D4E | 0x9068C36) - (0xA7A63D4E & 0x9068C36);
                    continue block20;
                }
                case -1482277554: {
                    objectArray[2] = 13777;
                    objectArray[0] = 13782;
                    objectArray[2] = 13777;
                    objectArray[0] = 13795;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
                    objectArray[2] = 614;
                    objectArray[0] = 556;
                    objectArray[2] = 614;
                    objectArray[0] = 615;
                    Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
                    objectArray[2] = 55722;
                    objectArray[0] = 55696;
                    objectArray[2] = 55722;
                    objectArray[0] = 55723;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
                    objectArray[2] = 51260;
                    objectArray[0] = 51200;
                    objectArray[2] = 51260;
                    objectArray[0] = 51260;
                    Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
                    n = (0x67EDB62 | 0x9068C36) - (0x67EDB62 & 0x9068C36);
                    continue block20;
                }
                case 108976994: 
            }
            objectArray[2] = 39770;
            objectArray[0] = 39704;
            objectArray[2] = 39770;
            objectArray[0] = 39770;
            Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
            objectArray[2] = 15299;
            objectArray[0] = 15242;
            objectArray[2] = 15299;
            objectArray[0] = 15298;
            Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
            objectArray[2] = 2467;
            objectArray[0] = 2474;
            objectArray[2] = 2467;
            objectArray[0] = 2467;
            Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
            objectArray[2] = 50173;
            objectArray[0] = 50118;
            objectArray[2] = 50173;
            objectArray[0] = 50169;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
            objectArray[2] = 12886;
            objectArray[0] = 12925;
            objectArray[2] = 12886;
            objectArray[0] = 411885963;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
            objectArray[2] = 13055;
            objectArray[0] = 13029;
            objectArray[2] = 13055;
            objectArray[0] = -993089728;
            Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
            objectArray[2] = 12063;
            objectArray[0] = 12085;
            objectArray[2] = 12063;
            objectArray[0] = 1553545912;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
            objectArray[2] = 23133;
            objectArray[0] = 23128;
            objectArray[2] = 23133;
            objectArray[0] = 23104;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
            objectArray[2] = 16597;
            objectArray[0] = 16616;
            objectArray[2] = 16597;
            objectArray[0] = 16597;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
            objectArray[2] = 45701;
            objectArray[0] = 45746;
            objectArray[2] = 45701;
            objectArray[0] = 45701;
            Illlllllilll.IilliliilIIi[((Integer)objectArray[0]).intValue() & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[2]).intValue()] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
            objectArray[2] = 56417;
            objectArray[0] = 56407;
            objectArray[2] = 56417;
            objectArray[0] = 56416;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) - (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue())] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
            objectArray[2] = 68551;
            objectArray[0] = 68555;
            objectArray[2] = 68551;
            objectArray[0] = -1083442141;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[2]).intValue());
            objectArray[2] = 50683;
            objectArray[0] = 50632;
            objectArray[2] = 50683;
            objectArray[0] = 50673;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
            objectArray[2] = 41361;
            objectArray[0] = 41350;
            objectArray[2] = 41361;
            objectArray[0] = 41374;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
            objectArray[2] = 33120;
            objectArray[0] = 33093;
            objectArray[2] = 33120;
            objectArray[0] = 33080;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) - ((Integer)objectArray[0] & (Integer)objectArray[2]);
            objectArray[2] = 42249;
            objectArray[0] = 42287;
            objectArray[2] = 42249;
            objectArray[0] = 42340;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() & ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[0] & ~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[0]).intValue() & (Integer)objectArray[2];
            objectArray[2] = 56221;
            objectArray[0] = 56275;
            objectArray[2] = 56221;
            objectArray[0] = 56220;
            Illlllllilll.IilliliilIIi[(((Integer)objectArray[0]).intValue() | ((Integer)objectArray[2]).intValue()) & (((Integer)objectArray[0]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[0] | (Integer)objectArray[2]) & ~((Integer)objectArray[0] & (Integer)objectArray[2]);
            n = (0x92074575 | 0x9068C36) - (0x92074575 & 0x9068C36);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private String equippedSkillName(IliIlllilIi iliIlllilIi) {
        if (iliIiiliiiii) {
            int n = (0xD13C729E | 0xB215336E) - (0xD13C729E & 0xB215336E);
        }
        Object[] objectArray = new Object[38];
        objectArray[15] = IilliliilIIi[30];
        objectArray[33] = IilliliilIIi[31];
        objectArray[22] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[22] | (Integer)objectArray[33]) & (~((Integer)objectArray[22]).intValue() | ~((Integer)objectArray[33]).intValue());
        objectArray[33] = IilliliilIIi[32];
        objectArray[22] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[22] | (Integer)objectArray[33]) + ((Integer)objectArray[22] & (Integer)objectArray[33]);
        Object[] objectArray2 = new Object[((Integer)objectArray[15]).intValue()];
        objectArray[4] = IilliliilIIi[33];
        objectArray[33] = IilliliilIIi[34];
        objectArray[22] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[22] | (Integer)objectArray[33]) - ((Integer)objectArray[22] & (Integer)objectArray[33]);
        objectArray[33] = IilliliilIIi[35];
        objectArray[22] = (int)((Integer)objectArray[4]);
        objectArray[4] = 2 * ((Integer)objectArray[22] | (Integer)objectArray[33]) - ((Integer)objectArray[22] ^ (Integer)objectArray[33]);
        objectArray2[((Integer)objectArray[4]).intValue()] = this;
        objectArray[36] = IilliliilIIi[36];
        objectArray[33] = IilliliilIIi[37];
        objectArray[22] = (int)((Integer)objectArray[36]);
        objectArray[36] = ((Integer)objectArray[22] ^ (Integer)objectArray[33]) - 2 * (~((Integer)objectArray[22]).intValue() & (Integer)objectArray[33]);
        objectArray[33] = IilliliilIIi[38];
        objectArray[22] = (int)((Integer)objectArray[36]);
        objectArray[36] = ((Integer)objectArray[22] | (Integer)objectArray[33]) & (~((Integer)objectArray[22]).intValue() | ~((Integer)objectArray[33]).intValue());
        objectArray2[((Integer)objectArray[36]).intValue()] = iliIlllilIi;
        return (String)((Object)Illlllllilll.iliIiiliiiii("46d8e2ea-a846-4105-9295-ab189b5ecd28", (long)-5098448535024492821L, (Object[])objectArray2, (String)"Tnd1a200Mzc3ODBLbmtLbm5ua25LazBua2trS0tubktuMGtLbktubm5ubmtubjBLa25ua25ra25LS2swbktra0trS25rbm5rMGtua0tra25ra2trazBLbm5ubm5ubmtubm4=", (int)IilliliilIIi[39], (String)"dHdw", (int)IilliliilIIi[40], (String)"KkxdTmxjeGMxbmNwaTFRZGxnZXY9K05sY3hjMW5jcGkxUWRsZ2V2PQ==", (String)"b2cwbnd1a200Mzc3ODBxd3ZuY3l1b3Iwa3B2Z3RwY24wUm5je2d0RmN2Yw==", (int)IilliliilIIi[41], (int)IilliliilIIi[42], (int)IilliliilIIi[43], (int)IilliliilIIi[44]));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1_1, MethodType var2_2) {
        block19: {
            var21_3 = new Object[18];
            var16_4 = (-403600298 | 730333889) - (-403600298 & 730333889);
            var16_4 + 730333889;
            var21_3[11] = MethodHandles.lookup();
            var21_3[17] = ((MethodHandles.Lookup)var21_3[11]).findStatic(Illlllllilll.class, "IIIllIIliIIl", MethodType.fromMethodDescriptorString("(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IIII)Ljava/lang/invoke/MethodHandle;", var0.lookupClass().getClassLoader()));
            var17_5 = (181823104 | -1812644500) - (181823104 & -1812644500);
            var17_5 + -1812644500;
            var21_3[10] = var2_2.parameterCount();
            var21_3[6] = Illlllllilll.IilliliilIIi[51];
            var21_3[14] = (int)((Integer)var21_3[10]);
            var21_3[8] = ((Integer)var21_3[14] ^ (Integer)var21_3[6]) - 2 * (~((Integer)var21_3[14]).intValue() & (Integer)var21_3[6]);
            try {
                var21_3[0] = var2_2.dropParameterTypes((Integer)var21_3[8], (Integer)var21_3[10]);
                var21_3[7] = MethodHandles.invoker((MethodType)var21_3[0]);
                v0 = new Class[Illlllllilll.IilliliilIIi[52]];
                v0[Illlllllilll.IilliliilIIi[53]] = MethodHandle.class;
                var21_3[13] = ((MethodType)var21_3[0]).appendParameterTypes(v0);
                var18_6 = (-1453747058 | 1655880973) - (-1453747058 & 1655880973);
            }
            catch (ThreadDeath v1) {
                throw v1;
            }
            catch (VerifyError v2) {
                throw v2;
            }
lbl29:
            // 1 sources

            while (true) {
                var21_3[4] = new int[2 * ((Integer)var21_3[14] | (Integer)var21_3[6]) - ((Integer)var21_3[14] ^ (Integer)var21_3[6])];
                var19_7 = (-819901385 | 135421314) - (-819901385 & 135421314);
                var19_7 + 135421314;
                ((int[])var21_3[4])[Illlllllilll.IilliliilIIi[55]] = (Integer)var21_3[8];
                var21_3[5] = Illlllllilll.IilliliilIIi[56];
lbl37:
                // 2 sources

                while (true) {
                    var21_3[6] = Illlllllilll.IilliliilIIi[57];
                    var21_3[14] = (int)((Integer)var21_3[8]);
                    if ((Integer)var21_3[5] < ((Integer)var21_3[14] | (Integer)var21_3[6]) + ((Integer)var21_3[14] & (Integer)var21_3[6])) {
                        var21_3[6] = Illlllllilll.IilliliilIIi[58];
                        var21_3[14] = (int)((Integer)var21_3[5]);
                        ((int[])var21_3[4])[((Integer)var21_3[5]).intValue()] = ((Integer)var21_3[14] & ~((Integer)var21_3[6]).intValue()) - (~((Integer)var21_3[14]).intValue() & (Integer)var21_3[6]);
                        var20_8 = (500601891 | 1389839855) - (500601891 & 1389839855);
                        break block19;
                    }
lbl47:
                    // 3 sources

                    while (true) {
                        var20_8 = (-1211784152 | 1389839855) - (-1211784152 & 1389839855);
                        break block19;
                        break;
                    }
                    break;
                }
                break;
            }
            var18_6 + 1655880973;
            var21_3[6] = Illlllllilll.IilliliilIIi[54];
            var21_3[14] = (int)((Integer)var21_3[8]);
            ** while (true)
        }
        v3 = var20_8;
        switch (v3 + 1389839855 - (v3 & 1389839855) * 2) {
            default: {
                var21_3[5] = (Integer)var21_3[5] + 1;
                ** continue;
            }
            case -1687513711: {
                ** continue;
            }
            case -1211784152: 
        }
        var21_3[9] = MethodHandles.permuteArguments((MethodHandle)var21_3[7], (MethodType)var21_3[13], (int[])var21_3[4]);
        var21_3[2] = MethodHandles.collectArguments((MethodHandle)var21_3[9], (Integer)var21_3[8], (MethodHandle)var21_3[17]);
        return new ConstantCallSite((MethodHandle)var21_3[2]);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Class IilliliilIIi(String var0) {
        block35: {
            if (Illlllllilll.iliIiiliiiii) {
                throw null;
            }
            if (Illlllllilll.iliIiiliiiii) {
                65 + 32;
            }
            if (Illlllllilll.iliIiiliiiii) {
                throw null;
            }
            v0 = var8_3 = (14626660 | -1702807430) - (14626660 & -1702807430);
            Illlllllilll.lIiiIiIlilli = v0 + -1702807430 - (v0 & -1702807430) * 2;
            if (1910125533 <= Illlllllilll.lIiiIiIlilli) {
            }
            var6_2 = new Object[5];
            if (var0 == null) break block35;
            if (var0.isEmpty()) break block35;
            ** GOTO lbl34
lbl19:
            // 3 sources

            while (true) {
                var5_4 = (1402253804 | 1825158014) - (1402253804 & 1825158014);
                ** GOTO lbl63
                break;
            }
        }
        var4_1 = (-135290545 | -1573165862) - (-135290545 & -1573165862);
        block30: while (true) {
            v1 = var4_1;
            switch (v1 + -1573165862 - (v1 & -1573165862) * 2) {
                case -727397109: {
                    return Double.TYPE;
                }
                case -1747988516: {
                    return Integer.TYPE;
                }
                case 1923810150: {
                    return Short.TYPE;
                }
lbl34:
                // 2 sources

                default: {
                    var4_1 = (-747841988 | -1573165862) - (-747841988 & -1573165862);
                    continue block30;
                }
                case -747841988: {
                    break;
                }
                case -135290545: {
                    throw new IllegalArgumentException("Input string cannot be null or empty");
                }
            }
            switch (var0.charAt(Illlllllilll.IilliliilIIi[77])) {
                case 'C': {
                    return Character.TYPE;
                }
                case 'D': {
                    return Double.TYPE;
                }
                case 'F': {
                    return Float.TYPE;
                }
                case 'I': {
                    return Integer.TYPE;
                }
                case 'J': {
                    return Long.TYPE;
                }
                case 'S': {
                    var4_1 = (1923810150 | -1573165862) - (1923810150 & -1573165862);
                    continue block30;
                }
                default: {
                    var6_2[2] = var0;
                    if (!((String)var6_2[2]).startsWith("L")) ** GOTO lbl19
                    var5_4 = (807272776 | 1825158014) - (807272776 & 1825158014);
lbl63:
                    // 2 sources

                    v2 = var5_4;
                    switch (v2 + 1825158014 - (v2 & 1825158014) * 2) {
                        default: {
                            if (!((String)var6_2[2]).endsWith(";")) ** GOTO lbl19
                            var6_2[4] = Illlllllilll.IilliliilIIi[79];
                            var6_2[1] = ((String)var6_2[2]).length();
                            var6_2[2] = ((String)var6_2[2]).substring(Illlllllilll.IilliliilIIi[78], 2 * ((Integer)var6_2[1] & ~((Integer)var6_2[4]).intValue()) - ((Integer)var6_2[1] ^ (Integer)var6_2[4])).replace(Illlllllilll.IilliliilIIi[80], Illlllllilll.IilliliilIIi[81]);
                            ** continue;
                        }
                        case 1402253804: 
                    }
                    return Class.forName((String)var6_2[2]);
                }
                case 'B': 
            }
            break;
        }
        return Byte.TYPE;
    }
}


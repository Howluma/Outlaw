/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.kyori.adventure.text.Component
 *  net.kyori.adventure.text.minimessage.MiniMessage
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.meta.ItemMeta
 */
package Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl;

import java.io.SyncFailedException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.sql.SQLNonTransientConnectionException;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicReferenceArray;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public final class IliIlllilIi {
    private static MiniMessage liiiIIllIl;
    public static int[] lIiiIiIlilli;
    static AtomicReferenceArray<MethodHandle> IilliliilIIi;
    public static Component IliIlllilIi;
    public static int iliIiiliiiii;
    public static boolean IIIllIIliIIl;

    /*
     * Enabled aggressive block sorting
     */
    private IliIlllilIi() {
        if (IIIllIIliIIl) {
            int cfr_ignored_0 = 0x35 & 1;
        }
        Object[] objectArray = new Object[26];
        objectArray[5] = lIiiIiIlilli[0];
        objectArray[0] = lIiiIiIlilli[1];
        objectArray[25] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[25] | (Integer)objectArray[0]) + ((Integer)objectArray[25] & (Integer)objectArray[0]);
        objectArray[0] = lIiiIiIlilli[2];
        objectArray[25] = (int)((Integer)objectArray[5]);
        objectArray[5] = (Integer)objectArray[25] & ~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[25]).intValue() & (Integer)objectArray[0];
        Object[] objectArray2 = new Object[((Integer)objectArray[5]).intValue()];
        objectArray[19] = lIiiIiIlilli[3];
        objectArray[0] = lIiiIiIlilli[4];
        objectArray[25] = (int)((Integer)objectArray[19]);
        objectArray[19] = (Integer)objectArray[25] & ~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[25]).intValue() & (Integer)objectArray[0];
        objectArray[0] = lIiiIiIlilli[5];
        objectArray[25] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[25] | (Integer)objectArray[0]) + ((Integer)objectArray[25] & (Integer)objectArray[0]);
        objectArray2[((Integer)objectArray[19]).intValue()] = this;
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.IlIillIiilIi("9db54447-ad21-40f5-8e57-c6207ff52a71", (long)2713369704072963372L, (Object[])objectArray2, (String)"NWNMMmhq", (int)lIiiIiIlilli[6], (String)"Pzd8PichOzlgY2dnZHw9JyY+MyUhPyJ8OzwmNyA8Mz58Aj4zKzcgFjMmMw==", (String)"ehgJHjgzJDN9PjM8NX0dMDg3MSZpex44MyQzfT4zPDV9HTA4NzEmaQ==", (int)lIiiIiIlilli[7], (String)"ICc8", (int)lIiiIiIlilli[8], (int)lIiiIiIlilli[9], (String)"HichOzlgY2dnZHw+PhsbPjs+Gxs+fBs7Gxs+PjsbGz58OzsbGz4bGz4bPnwbPjsbPj4+Oz4bOw==", (int)lIiiIiIlilli[10]);
    }

    private static /* synthetic */ void lIiiIiIlilli(String string, String string2, String[] stringArray, ItemMeta itemMeta) {
        Object[] objectArray = new Object[32];
        objectArray[18] = lIiiIiIlilli[61];
        objectArray[30] = lIiiIiIlilli[62];
        objectArray[31] = (int)((Integer)objectArray[18]);
        objectArray[18] = 2 * ((Integer)objectArray[31] & ~((Integer)objectArray[30]).intValue()) - ((Integer)objectArray[31] ^ (Integer)objectArray[30]);
        objectArray[30] = lIiiIiIlilli[63];
        objectArray[31] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[31] | (Integer)objectArray[30]) & ~((Integer)objectArray[31] & (Integer)objectArray[30]);
        Object[] objectArray2 = new Object[((Integer)objectArray[18]).intValue()];
        objectArray[26] = lIiiIiIlilli[64];
        objectArray[30] = lIiiIiIlilli[65];
        objectArray[31] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[31] | (Integer)objectArray[30]) & ~((Integer)objectArray[31] & (Integer)objectArray[30]);
        objectArray[30] = lIiiIiIlilli[66];
        objectArray[31] = (int)((Integer)objectArray[26]);
        objectArray[26] = 2 * ((Integer)objectArray[31] | (Integer)objectArray[30]) - ((Integer)objectArray[31] ^ (Integer)objectArray[30]);
        objectArray2[((Integer)objectArray[26]).intValue()] = string;
        objectArray[14] = lIiiIiIlilli[67];
        objectArray[30] = lIiiIiIlilli[68];
        objectArray[31] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[31] ^ (Integer)objectArray[30]) + 2 * ((Integer)objectArray[31] & (Integer)objectArray[30]);
        objectArray[30] = lIiiIiIlilli[69];
        objectArray[31] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[31] | (Integer)objectArray[30]) - ((Integer)objectArray[31] & (Integer)objectArray[30]);
        objectArray2[((Integer)objectArray[14]).intValue()] = string2;
        objectArray[12] = lIiiIiIlilli[70];
        objectArray[30] = lIiiIiIlilli[71];
        objectArray[31] = (int)((Integer)objectArray[12]);
        objectArray[12] = (Integer)objectArray[31] & ~((Integer)objectArray[30]).intValue() | ~((Integer)objectArray[31]).intValue() & (Integer)objectArray[30];
        objectArray[30] = lIiiIiIlilli[72];
        objectArray[31] = (int)((Integer)objectArray[12]);
        objectArray[12] = (Integer)objectArray[31] + ~((Integer)objectArray[30]).intValue() + 1;
        objectArray2[((Integer)objectArray[12]).intValue()] = stringArray;
        objectArray[2] = lIiiIiIlilli[73];
        objectArray[30] = lIiiIiIlilli[74];
        objectArray[31] = (int)((Integer)objectArray[2]);
        objectArray[2] = 2 * ((Integer)objectArray[31] | (Integer)objectArray[30]) - ((Integer)objectArray[31] ^ (Integer)objectArray[30]);
        objectArray[30] = lIiiIiIlilli[75];
        objectArray[31] = (int)((Integer)objectArray[2]);
        objectArray[2] = (Integer)objectArray[31] + ~((Integer)objectArray[30]).intValue() + 1;
        objectArray2[((Integer)objectArray[2]).intValue()] = itemMeta;
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.IlIillIiilIi("e119ae10-4e65-4039-81f4-c1ff7728132c", (long)-5713966175109187603L, (Object[])objectArray2, (String)"ZEE2TWtl", (int)lIiiIiIlilli[76], (String)"RDyBQywmQD5laGxsaYFCLCtDOComRCeBQEErPCVBOEOBB0M4MDwlGzgrOA==", (String)"fx0OIz04KTiCQzhBOoIiNT08NitugCM9OCk4gkM4QTqCIjU9PDYrbg==", (int)lIiiIiIlilli[77], (String)"JSxB", (int)lIiiIiIlilli[78], (int)lIiiIiIlilli[79], (String)"IywmQD5laGxsaYFDQyAgQ0BDICBDgSBAICBDQ0AgIEOBQEAgIEMgIEMgQ4EgQ0AgQ0NDQEMgQA==", (int)lIiiIiIlilli[80]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void IilliliilIIi(ItemMeta itemMeta) {
        Object[] objectArray = new Object[27];
        int n = (0xA1538619 | 0x267266AD) - (0xA1538619 & 0x267266AD);
        int cfr_ignored_0 = n + 645031597;
        objectArray[0] = lIiiIiIlilli[50];
        objectArray[6] = lIiiIiIlilli[51];
        objectArray[2] = (int)((Integer)objectArray[0]);
        objectArray[0] = 2 * ((Integer)objectArray[2] | (Integer)objectArray[6]) - ((Integer)objectArray[2] ^ (Integer)objectArray[6]);
        objectArray[6] = lIiiIiIlilli[52];
        objectArray[2] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[2] | (Integer)objectArray[6]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[6]).intValue());
        Object[] objectArray2 = new Object[((Integer)objectArray[0]).intValue()];
        objectArray[19] = lIiiIiIlilli[53];
        objectArray[6] = lIiiIiIlilli[54];
        objectArray[2] = (int)((Integer)objectArray[19]);
        objectArray[19] = (Integer)objectArray[2] & ~((Integer)objectArray[6]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[6];
        objectArray[6] = lIiiIiIlilli[55];
        objectArray[2] = (int)((Integer)objectArray[19]);
        objectArray[19] = 2 * ((Integer)objectArray[2] | (Integer)objectArray[6]) - ((Integer)objectArray[2] ^ (Integer)objectArray[6]);
        objectArray2[((Integer)objectArray[19]).intValue()] = itemMeta;
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.IlIillIiilIi("1f8d460b-2dc2-4203-b081-bda2703147b4", (long)-7500177538263812242L, (Object[])objectArray2, (String)"WExoWjFs", (int)lIiiIiIlilli[56], (String)"QzuAQislPz1kZ2traIBBKypCNyklQyaAP0AqOyRAN0KABkI3LzskGjcqNw==", (String)"fhwNIjw3KDeBQjdAOYEhNDw7NSptfyI8Nyg3gUI3QDmBITQ8OzUqbQ==", (int)lIiiIiIlilli[57], (String)"JCtA", (int)lIiiIiIlilli[58], (int)lIiiIiIlilli[59], (String)"IislPz1kZ2traIBCQh8fQj9CHx9CgB8/Hx9CQj8fH0KAPz8fH0IfH0IfQoAfQj8fQkJCP0IfPw==", (int)lIiiIiIlilli[60]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite IlIillIiilIi(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        if (IIIllIIliIIl) {
            int n;
            int n2 = n = (0x1A | 0xE444DF7F) - (0x1A & 0xE444DF7F);
            int cfr_ignored_0 = n2 + -465248385 - (n2 & 0xE444DF7F) * 2;
        }
        Object[] objectArray = new Object[14];
        objectArray[4] = MethodHandles.lookup();
        objectArray[1] = ((MethodHandles.Lookup)objectArray[4]).findStatic(IliIlllilIi.class, "IiIiliIiiiIi", MethodType.fromMethodDescriptorString("(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;I)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
        objectArray[2] = methodType.parameterCount();
        objectArray[0] = lIiiIiIlilli[108];
        objectArray[9] = (int)((Integer)objectArray[2]);
        objectArray[3] = (Integer)objectArray[9] + ~((Integer)objectArray[0]).intValue() + 1;
        objectArray[6] = methodType.dropParameterTypes((Integer)objectArray[3], (Integer)objectArray[2]);
        objectArray[13] = MethodHandles.invoker((MethodType)objectArray[6]);
        Class[] classArray = new Class[lIiiIiIlilli[109]];
        classArray[Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.lIiiIiIlilli[110]] = MethodHandle.class;
        objectArray[7] = ((MethodType)objectArray[6]).appendParameterTypes(classArray);
        objectArray[0] = lIiiIiIlilli[111];
        objectArray[9] = (int)((Integer)objectArray[3]);
        objectArray[11] = new int[((Integer)objectArray[9] ^ (Integer)objectArray[0]) + 2 * ((Integer)objectArray[9] & (Integer)objectArray[0])];
        int n = (0xC7664404 | 0x76018B9) - (0xC7664404 & 0x76018B9);
        int cfr_ignored_1 = n + 123738297;
        ((int[])objectArray[11])[Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.lIiiIiIlilli[112]] = (Integer)objectArray[3];
        objectArray[5] = lIiiIiIlilli[113];
        while (true) {
            objectArray[0] = lIiiIiIlilli[114];
            objectArray[9] = (int)((Integer)objectArray[3]);
            if ((Integer)objectArray[5] >= ((Integer)objectArray[9] ^ (Integer)objectArray[0]) + 2 * ((Integer)objectArray[9] & (Integer)objectArray[0])) {
                objectArray[8] = MethodHandles.permuteArguments((MethodHandle)objectArray[13], (MethodType)objectArray[7], (int[])objectArray[11]);
                objectArray[10] = MethodHandles.collectArguments((MethodHandle)objectArray[8], (Integer)objectArray[3], (MethodHandle)objectArray[1]);
                return new ConstantCallSite((MethodHandle)objectArray[10]);
            }
            objectArray[0] = lIiiIiIlilli[115];
            objectArray[9] = (int)((Integer)objectArray[5]);
            ((int[])objectArray[11])[((Integer)objectArray[5]).intValue()] = 2 * ((Integer)objectArray[9] & ~((Integer)objectArray[0]).intValue()) - ((Integer)objectArray[9] ^ (Integer)objectArray[0]);
            objectArray[5] = (Integer)objectArray[5] + 1;
        }
    }

    /*
     * Exception decompiling
     */
    public static void Illillliilli() {
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

    static {
        Object[] objectArray = new Object[24];
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.Illillliilli();
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.IlIillIiilIi("42fa216f-b626-41f3-96e7-7e84e0dd409d", IliIlllilIi.class, (String)"SDVUQzBB", (int)lIiiIiIlilli[95], (String)"Rj6DRS4oQkBnam5ua4NELi1FOiwoRimDQkMtPidDOkWDCUU6Mj4nHTotOg==", (String)"gSU/Ois6hEU6QzyEGEU6KChwggs=", (int)lIiiIiIlilli[96], (String)"RUQ6PQtG", (int)lIiiIiIlilli[97], (int)lIiiIiIlilli[98], (String)"JS4oQkBnam5ua4NFRSIiRUJFIiJFgyJCIiJFRUIiIkWDQkIiIkUiIkUiRYMiRUIiRUVFQkUiQg==", (int)lIiiIiIlilli[99]);
        objectArray[19] = lIiiIiIlilli[100];
        objectArray[21] = lIiiIiIlilli[101];
        objectArray[7] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[7] ^ (Integer)objectArray[21]) - 2 * (~((Integer)objectArray[7]).intValue() & (Integer)objectArray[21]);
        objectArray[21] = lIiiIiIlilli[102];
        objectArray[7] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[7] ^ (Integer)objectArray[21]) + 2 * ((Integer)objectArray[7] & (Integer)objectArray[21]);
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.IlIillIiilIi("4dc47cc3-140b-47c2-94f3-b4516709478d", (long)-108471468643528613L, (Object[])new Object[((Integer)objectArray[19]).intValue()], (String)"TVUweUFy", (int)lIiiIiIlilli[103], (String)"Rz+ERi8pQ0Foa29vbIRFLy5GOy0pRyqEQ0QuPyhEO0aECkY7Mz8oHjsuOw==", (String)"giARJkA7LDuFRjtEPYUlOEA/OS5xgyZAOyw7hUY7RD2FJThAPzkucQ==", (int)lIiiIiIlilli[104], (String)"KC9E", (int)lIiiIiIlilli[105], (int)lIiiIiIlilli[106], (String)"Ji8pQ0Foa29vbIRGRiMjRkNGIyNGhCNDIyNGRkMjI0aEQ0MjI0YjI0YjRoQjRkMjRkZGQ0YjQw==", (int)lIiiIiIlilli[107]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String IIlilIliiIli(String string, int n, int n2) {
        if (IIIllIIliIIl) {
            int n3 = (0x94D50414 | 0xE5D62EF1) - (0x94D50414 & 0xE5D62EF1);
        }
        Object[] objectArray = new Object[9];
        int n4 = (0x3DAEDCCB | 0x496A3EB9) - (0x3DAEDCCB & 0x496A3EB9);
        int cfr_ignored_0 = n4 + 1231699641;
        objectArray[7] = Base64.getDecoder().decode(string);
        int n5 = (0x757BD619 | 0x663D1FEF) - (0x757BD619 & 0x663D1FEF);
        int cfr_ignored_1 = n5 + 1715281903;
        objectArray[0] = lIiiIiIlilli[139];
        while ((Integer)objectArray[0] < ((byte[])objectArray[7]).length) {
            byte[] byArray = (byte[])objectArray[7];
            int n6 = (Integer)objectArray[0];
            objectArray[8] = n;
            objectArray[4] = (int)byArray[n6];
            objectArray[8] = n2;
            objectArray[4] = 2 * ((Integer)objectArray[4] & ~((Integer)objectArray[8]).intValue()) - ((Integer)objectArray[4] ^ (Integer)objectArray[8]);
            byArray[n6] = (byte)(((Integer)objectArray[4] | (Integer)objectArray[8]) & ~((Integer)objectArray[4] & (Integer)objectArray[8]));
            int n7 = (0x199A7B72 | 0xF66BF4DF) - (0x199A7B72 & 0xF66BF4DF);
            int cfr_ignored_2 = n7 + -160697121;
            objectArray[0] = (Integer)objectArray[0] + 1;
        }
        try {
            return new String((byte[])objectArray[7], StandardCharsets.UTF_8);
        }
        catch (SyncFailedException syncFailedException) {
            throw syncFailedException;
        }
        catch (UnsupportedClassVersionError unsupportedClassVersionError) {
            throw unsupportedClassVersionError;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void iliIiiliiiii(String string, ItemMeta itemMeta) {
        Object[] objectArray = new Object[29];
        int n = (0xD423A562 | 0xA1628812) - (0xD423A562 & 0xA1628812);
        int cfr_ignored_0 = n + -1587378158;
        objectArray[22] = lIiiIiIlilli[81];
        objectArray[27] = lIiiIiIlilli[82];
        objectArray[11] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[11] & ~((Integer)objectArray[27]).intValue()) - (~((Integer)objectArray[11]).intValue() & (Integer)objectArray[27]);
        objectArray[27] = lIiiIiIlilli[83];
        objectArray[11] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[11] ^ (Integer)objectArray[27]) + 2 * ((Integer)objectArray[11] & (Integer)objectArray[27]);
        Object[] objectArray2 = new Object[((Integer)objectArray[22]).intValue()];
        objectArray[0] = lIiiIiIlilli[84];
        objectArray[27] = lIiiIiIlilli[85];
        objectArray[11] = (int)((Integer)objectArray[0]);
        objectArray[0] = (Integer)objectArray[11] - ~((Integer)objectArray[27]).intValue() - 1;
        objectArray[27] = lIiiIiIlilli[86];
        objectArray[11] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[11] | (Integer)objectArray[27]) - ((Integer)objectArray[11] & (Integer)objectArray[27]);
        objectArray2[((Integer)objectArray[0]).intValue()] = string;
        objectArray[13] = lIiiIiIlilli[87];
        objectArray[27] = lIiiIiIlilli[88];
        objectArray[11] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[11] | (Integer)objectArray[27]) + ((Integer)objectArray[11] & (Integer)objectArray[27]);
        objectArray[27] = lIiiIiIlilli[89];
        objectArray[11] = (int)((Integer)objectArray[13]);
        objectArray[13] = 2 * ((Integer)objectArray[11] | (Integer)objectArray[27]) - ((Integer)objectArray[11] ^ (Integer)objectArray[27]);
        objectArray2[((Integer)objectArray[13]).intValue()] = itemMeta;
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.IlIillIiilIi("4014dbe7-b26f-4375-b008-c5376527db1b", (long)789853574381479948L, (Object[])objectArray2, (String)"bWlsQTlN", (int)lIiiIiIlilli[90], (String)"RT2CRC0nQT9maW1taoJDLSxEOSsnRSiCQUIsPSZCOUSCCEQ5MT0mHDksOQ==", (String)"gB4PJD45KjmDRDlCO4MjNj49NyxvgSQ+OSo5g0Q5QjuDIzY+PTcsbw==", (int)lIiiIiIlilli[91], (String)"Ji1C", (int)lIiiIiIlilli[92], (int)lIiiIiIlilli[93], (String)"JC0nQT9maW1taoJERCEhREFEISFEgiFBISFEREEhIUSCQUEhIUQhIUQhRIIhREEhREREQUQhQQ==", (int)lIiiIiIlilli[94]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static ItemStack liiiIIllIl(String string, String string2, String ... stringArray) {
        if (IIIllIIliIIl) {
            int n = (0x7920F4C0 | 0xCB01698C) - (0x7920F4C0 & 0xCB01698C);
        }
        Object[] objectArray = new Object[31];
        objectArray[29] = lIiiIiIlilli[22];
        objectArray[21] = lIiiIiIlilli[23];
        objectArray[3] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[3] | (Integer)objectArray[21]) & ~((Integer)objectArray[3] & (Integer)objectArray[21]);
        objectArray[21] = lIiiIiIlilli[24];
        objectArray[3] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[3] & ~((Integer)objectArray[21]).intValue()) - (~((Integer)objectArray[3]).intValue() & (Integer)objectArray[21]);
        Object[] objectArray2 = new Object[((Integer)objectArray[29]).intValue()];
        objectArray[13] = lIiiIiIlilli[25];
        objectArray[21] = lIiiIiIlilli[26];
        objectArray[3] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[3] | (Integer)objectArray[21]) - ((Integer)objectArray[3] & (Integer)objectArray[21]);
        objectArray[21] = lIiiIiIlilli[27];
        objectArray[3] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[3] | (Integer)objectArray[21]) + ((Integer)objectArray[3] & (Integer)objectArray[21]);
        objectArray2[((Integer)objectArray[13]).intValue()] = string;
        objectArray[9] = lIiiIiIlilli[28];
        objectArray[21] = lIiiIiIlilli[29];
        objectArray[3] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[3] | (Integer)objectArray[21]) - ((Integer)objectArray[3] & (Integer)objectArray[21]);
        objectArray[21] = lIiiIiIlilli[30];
        objectArray[3] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[3] | (Integer)objectArray[21]) & ~((Integer)objectArray[3] & (Integer)objectArray[21]);
        objectArray2[((Integer)objectArray[9]).intValue()] = string2;
        objectArray[17] = lIiiIiIlilli[31];
        objectArray[21] = lIiiIiIlilli[32];
        objectArray[3] = (int)((Integer)objectArray[17]);
        objectArray[17] = (Integer)objectArray[3] - ~((Integer)objectArray[21]).intValue() - 1;
        objectArray[21] = lIiiIiIlilli[33];
        objectArray[3] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[3] | (Integer)objectArray[21]) - ((Integer)objectArray[3] & (Integer)objectArray[21]);
        objectArray2[((Integer)objectArray[17]).intValue()] = stringArray;
        return (ItemStack)Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.IlIillIiilIi("6a3aacda-2fcc-45a6-9314-a50c1acc207e", (long)-2013558252271184500L, (Object[])objectArray2, (String)"T3JjOGlV", (int)lIiiIiIlilli[34], (String)"QTl+QCkjPTtiZWlpZn4/KShANScjQSR+PT4oOSI+NUB+BEA1LTkiGDUoNQ==", (String)"fBoLIDo1JjV/QDU+N38fMjo5MyhrfSA6NSY1f0A1Pjd/HzI6OTMoaw==", (int)lIiiIiIlilli[35], (String)"Iik+", (int)lIiiIiIlilli[36], (int)lIiiIiIlilli[37], (String)"ICkjPTtiZWlpZn5AQB0dQD1AHR1Afh09HR1AQD0dHUB+PT0dHUAdHUAdQH4dQD0dQEBAPUAdPQ==", (int)lIiiIiIlilli[38]);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Class Iiilliiliiil(String var0) {
        v0 = var7_1 = (920515184 | 746625460) - (920515184 & 746625460);
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.iliIiiliiiii = v0 + 746625460 - (v0 & 746625460) * 2;
        if (1533774750 < Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.iliIiiliiiii) {
            86 & 1;
        }
        v1 = var7_1 = (618576046 | 746625460) - (618576046 & 746625460);
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.iliIiiliiiii = v1 + 746625460 - (v1 & 746625460) * 2;
        if (1232494007 < Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.iliIiiliiiii) {
            throw new SQLNonTransientConnectionException();
        }
        v2 = var7_1 = (484262238 | 746625460) - (484262238 & 746625460);
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.iliIiiliiiii = v2 + 746625460 - (v2 & 746625460) * 2;
        if (1460770724 <= Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.iliIiiliiiii) {
            44 + 54;
        }
        v3 = var7_1 = (148547067 | 746625460) - (148547067 & 746625460);
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.iliIiiliiiii = v3 + 746625460 - (v3 & 746625460) * 2;
        if (357299900 <= Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.iliIiiliiiii) {
            var7_1 = (-1117220218 | 746625460) - (-1117220218 & 746625460);
        }
        var5_3 = new Object[4];
        if (var0 == null) throw new IllegalArgumentException("Input string cannot be null or empty");
        var4_2 = (-1459570110 | -1436784982) - (-1459570110 & -1436784982);
        if (true) ** GOTO lbl37
        block33: while (true) {
            var4_2 = (-1215648318 | -1436784982) - (-1215648318 & -1436784982);
            if (true) ** GOTO lbl37
            block34: while (true) {
                var4_2 = (1839962338 | -1436784982) - (1839962338 & -1436784982);
lbl37:
                // 3 sources

                block35: while (true) {
                    v4 = var4_2;
                    switch (v4 + -1436784982 - (v4 & -1436784982) * 2) {
                        case -310059169: {
                            return Double.TYPE;
                        }
                        case 1101358235: {
                            continue block33;
                        }
                        case -1215648318: {
                            return Float.TYPE;
                        }
                        case -1107939793: {
                            continue block34;
                        }
                        case 1839962338: {
                            return Long.TYPE;
                        }
                        case 935771432: {
                            return Short.TYPE;
                        }
                        default: {
                            var4_2 = (-811340260 | -1436784982) - (-811340260 & -1436784982);
                            continue block35;
                        }
                        case -811340260: {
                            if (var0.isEmpty() != false) throw new IllegalArgumentException("Input string cannot be null or empty");
                            var4_2 = (928874225 | -1436784982) - (928874225 & -1436784982);
                            continue block35;
                        }
                        case 928874225: {
                        }
                        case -1710946991: {
                            var4_2 = (-964870778 | -1436784982) - (-964870778 & -1436784982);
                            continue block35;
                        }
                        case -964870778: 
                    }
                    break;
                }
                switch (var0.charAt(Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.lIiiIiIlilli[134])) {
                    case 'C': {
                        return Character.TYPE;
                    }
                    case 'D': {
                        return Double.TYPE;
                    }
                    case 'F': {
                        continue block33;
                    }
                    case 'I': {
                        return Integer.TYPE;
                    }
                    case 'J': {
                        continue block34;
                    }
                    case 'S': {
                        return Short.TYPE;
                    }
                    default: {
                        var5_3[1] = var0;
                        if (((String)var5_3[1]).startsWith("L") == false) return Class.forName((String)var5_3[1]);
                        if (((String)var5_3[1]).endsWith(";") == false) return Class.forName((String)var5_3[1]);
                        var5_3[3] = Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.lIiiIiIlilli[136];
                        var5_3[2] = ((String)var5_3[1]).length();
                        var5_3[1] = ((String)var5_3[1]).substring(Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.lIiiIiIlilli[135], ((Integer)var5_3[2] ^ (Integer)var5_3[3]) - 2 * (~((Integer)var5_3[2]).intValue() & (Integer)var5_3[3])).replace(Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.lIiiIiIlilli[137], Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.lIiiIiIlilli[138]);
                        return Class.forName((String)var5_3[1]);
                    }
                    case 'B': 
                }
                break;
            }
            break;
        }
        return Byte.TYPE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static ItemStack IliIlllilIi(String string) {
        if (IIIllIIliIIl) {
            int n = (0xD16C50CE | 0xB6C787BB) - (0xD16C50CE & 0xB6C787BB);
        }
        Object[] objectArray = new Object[28];
        int n = (0x8A2C61A1 | 0x1505E8D1) - (0x8A2C61A1 & 0x1505E8D1);
        int cfr_ignored_0 = n + 352708817;
        objectArray[21] = lIiiIiIlilli[11];
        objectArray[26] = lIiiIiIlilli[12];
        objectArray[8] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[8] | (Integer)objectArray[26]) - ((Integer)objectArray[8] & (Integer)objectArray[26]);
        objectArray[26] = lIiiIiIlilli[13];
        objectArray[8] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[8] | (Integer)objectArray[26]) + ((Integer)objectArray[8] & (Integer)objectArray[26]);
        Object[] objectArray2 = new Object[((Integer)objectArray[21]).intValue()];
        objectArray[3] = lIiiIiIlilli[14];
        objectArray[26] = lIiiIiIlilli[15];
        objectArray[8] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[8] | (Integer)objectArray[26]) - ((Integer)objectArray[8] & (Integer)objectArray[26]);
        objectArray[26] = lIiiIiIlilli[16];
        objectArray[8] = (int)((Integer)objectArray[3]);
        objectArray[3] = (Integer)objectArray[8] + ~((Integer)objectArray[26]).intValue() + 1;
        objectArray2[((Integer)objectArray[3]).intValue()] = string;
        return (ItemStack)Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.IlIillIiilIi("b0bbe3b9-ec87-4f8f-8408-78006875076f", (long)7713074392638377723L, (Object[])objectArray2, (String)"Qldvelpv", (int)lIiiIiIlilli[17], (String)"QDh9PygiPDphZGhoZX0+KCc/NCYiQCN9PD0nOCE9ND99Az80LDghFzQnNA==", (String)"exkKHzk0JTR+PzQ9Nn4eMTk4MidqfB85NCU0fj80PTZ+HjE5ODInag==", (int)lIiiIiIlilli[18], (String)"ISg9", (int)lIiiIiIlilli[19], (int)lIiiIiIlilli[20], (String)"HygiPDphZGhoZX0/PxwcPzw/HBw/fRw8HBw/PzwcHD99PDwcHD8cHD8cP30cPzwcPz8/PD8cPA==", (int)lIiiIiIlilli[21]);
    }

    public static void iIlIlllllill(Player player) {
        Object[] objectArray = new Object[30];
        objectArray[16] = lIiiIiIlilli[39];
        objectArray[23] = lIiiIiIlilli[40];
        objectArray[8] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[8] ^ (Integer)objectArray[23]) + 2 * ((Integer)objectArray[8] & (Integer)objectArray[23]);
        objectArray[23] = lIiiIiIlilli[41];
        objectArray[8] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[8] | (Integer)objectArray[23]) - ((Integer)objectArray[8] & (Integer)objectArray[23]);
        Object[] objectArray2 = new Object[((Integer)objectArray[16]).intValue()];
        objectArray[27] = lIiiIiIlilli[42];
        objectArray[23] = lIiiIiIlilli[43];
        objectArray[8] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[8] | (Integer)objectArray[23]) - ((Integer)objectArray[8] & (Integer)objectArray[23]);
        objectArray[23] = lIiiIiIlilli[44];
        objectArray[8] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[8] & ~((Integer)objectArray[23]).intValue()) - (~((Integer)objectArray[8]).intValue() & (Integer)objectArray[23]);
        objectArray2[((Integer)objectArray[27]).intValue()] = player;
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.IliIlllilIi.IlIillIiilIi("9ca668d1-8725-4559-979b-892662472b4f", (long)-2022636321888930675L, (Object[])objectArray2, (String)"NG1keEYx", (int)lIiiIiIlilli[45], (String)"Qjp/QSokPjxjZmpqZ39AKilBNigkQiV/Pj8pOiM/NkF/BUE2LjojGTYpNg==", (String)"fRsMITs2JzaAQTY/OIAgMzs6NClsfiE7Nic2gEE2PziAIDM7OjQpbA==", (int)lIiiIiIlilli[46], (String)"Iyo/", (int)lIiiIiIlilli[47], (int)lIiiIiIlilli[48], (String)"ISokPjxjZmpqZ39BQR4eQT5BHh5Bfx4+Hh5BQT4eHkF/Pj4eHkEeHkEeQX8eQT4eQUFBPkEePg==", (int)lIiiIiIlilli[49]);
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle IiIiliIiiiIi(String var0, int var1_1, String var2_2, String var3_3, int var4_4, String var5_5, int var6_6, int var7_7, String var8_8, int var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [0 : 317->612)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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
    public static String IIIilIIiiIIi(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [18[CASE]], but top level block is 0[TRYBLOCK]
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


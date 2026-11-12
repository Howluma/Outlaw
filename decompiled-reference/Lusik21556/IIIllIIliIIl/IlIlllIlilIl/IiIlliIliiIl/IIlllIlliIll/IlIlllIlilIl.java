/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.kyori.adventure.text.minimessage.MiniMessage
 *  org.bukkit.Location
 *  org.bukkit.NamespacedKey
 *  org.bukkit.entity.Item
 *  org.bukkit.entity.Player
 *  org.bukkit.entity.TextDisplay
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.meta.ItemMeta
 *  org.bukkit.inventory.meta.SkullMeta
 */
package Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll;

import Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicReferenceArray;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.entity.TextDisplay;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public final class IlIlllIlilIl {
    public static NamespacedKey iIlIlllllill;
    public static int[] iliIiiliiiii;
    private static MiniMessage IliIlllilIi;
    public static NamespacedKey liiiIIllIl;
    static AtomicReferenceArray<MethodHandle> lIiiIiIlilli;
    public static int IIIllIIliIIl;
    public static boolean IlIlllIlilIl;

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void IlIlllIlilIl(Player player, SkullMeta skullMeta) {
        if (IlIlllIlilIl) {
            int n;
            int n2 = n = (0x946F81A1 | 0x46A73479) - (0x946F81A1 & 0x46A73479);
            IIIllIIliIIl = n2 + 1185363065 - (n2 & 0x46A73479) * 2;
        }
        Object[] objectArray = new Object[29];
        int n = (0x6426DCA3 | 0x18C089DA) - (0x6426DCA3 & 0x18C089DA);
        int cfr_ignored_0 = n + 415271386;
        objectArray[26] = iliIiiliiiii[105];
        objectArray[10] = iliIiiliiiii[106];
        objectArray[8] = (int)((Integer)objectArray[26]);
        objectArray[26] = (Integer)objectArray[8] - ~((Integer)objectArray[10]).intValue() - 1;
        objectArray[10] = iliIiiliiiii[107];
        objectArray[8] = (int)((Integer)objectArray[26]);
        objectArray[26] = (Integer)objectArray[8] + ~((Integer)objectArray[10]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[26]).intValue()];
        objectArray[9] = iliIiiliiiii[108];
        objectArray[10] = iliIiiliiiii[109];
        objectArray[8] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[8] ^ (Integer)objectArray[10]) + 2 * ((Integer)objectArray[8] & (Integer)objectArray[10]);
        objectArray[10] = iliIiiliiiii[110];
        objectArray[8] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[8] ^ (Integer)objectArray[10]) - 2 * (~((Integer)objectArray[8]).intValue() & (Integer)objectArray[10]);
        objectArray2[((Integer)objectArray[9]).intValue()] = player;
        objectArray[2] = iliIiiliiiii[111];
        objectArray[10] = iliIiiliiiii[112];
        objectArray[8] = (int)((Integer)objectArray[2]);
        objectArray[2] = (Integer)objectArray[8] & ~((Integer)objectArray[10]).intValue() | ~((Integer)objectArray[8]).intValue() & (Integer)objectArray[10];
        objectArray[10] = iliIiiliiiii[113];
        objectArray[8] = (int)((Integer)objectArray[2]);
        objectArray[2] = (Integer)objectArray[8] + ~((Integer)objectArray[10]).intValue() + 1;
        objectArray2[((Integer)objectArray[2]).intValue()] = skullMeta;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IlIlllIlilIl.Iilililiiili("fdad1c0a-e0cb-443d-86e4-30e4c4f6b184", (long)578253805479150158L, (Object[])objectArray2, (int)iliIiiliiiii[114], (String)"gYhOgZWKh4RMTK+urLVxanZ/i2R7fHi7dXlgbmBll22gg2CacWRuvZ1vow==", (String)"bpiJgoNJT1JRUbaamZh8fZ2ccHKRkHS7lXeLaWprj21tb4NhrIBnhmZnW7paWF++XpGzslJTVLZWV0uqSkuCrk6sQEFCoERGRqQ4", (int)iliIiiliiiii[115], (int)iliIiiliiiii[116], (int)iliIiiliiiii[117], (String)"Sm1xYYB4kn5Lh4N3f7aRh3x4iXmjsJR3jWGTpGqQYmijgppjZZpstA==", (int)iliIiiliiiii[118], (String)"hJiO", (String)"aUJkYllH");
    }

    /*
     * Exception decompiling
     */
    public static void Iiiiliiiiiii() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [53[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private IlIlllIlilIl() {
        int n;
        int n2 = n = (0x4009D383 | 0x1D2F6AED) - (0x4009D383 & 0x1D2F6AED);
        if (292580519 >= n2 + 489646829 - (n2 & 0x1D2F6AED) * 2) {
            n = (0x69073908 | 0x1D2F6AED) - (0x69073908 & 0x1D2F6AED);
        }
        Object[] objectArray = new Object[26];
        objectArray[17] = iliIiiliiiii[0];
        objectArray[23] = iliIiiliiiii[1];
        objectArray[2] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[2] | (Integer)objectArray[23]) + ((Integer)objectArray[2] & (Integer)objectArray[23]);
        objectArray[23] = iliIiiliiiii[2];
        objectArray[2] = (int)((Integer)objectArray[17]);
        objectArray[17] = (Integer)objectArray[2] - ~((Integer)objectArray[23]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[17]).intValue()];
        objectArray[11] = iliIiiliiiii[3];
        objectArray[23] = iliIiiliiiii[4];
        objectArray[2] = (int)((Integer)objectArray[11]);
        objectArray[11] = 2 * ((Integer)objectArray[2] | (Integer)objectArray[23]) - ((Integer)objectArray[2] ^ (Integer)objectArray[23]);
        objectArray[23] = iliIiiliiiii[5];
        objectArray[2] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[2] | (Integer)objectArray[23]) + ((Integer)objectArray[2] & (Integer)objectArray[23]);
        objectArray2[((Integer)objectArray[11]).intValue()] = this;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IlIlllIlilIl.Iilililiiili("932697e3-b2d7-4a9d-8d81-0fd73ec7d0ba", (long)4688682765339564066L, (Object[])objectArray2, (int)iliIiiliiiii[6], (String)"iH+3emx1fn+1u6alpbp4YX9okn9iY2GgbG5pZWlqnmaptFmhSFtXhqRYqg==", (String)"Z29weXq2tqmopr+RkJd1dpSLaWmIj22gjGCCYmNkhmZkWLpalb9evV9QUrFTV1a1V4aqqUtMTa1PQEKhQ0SLpUfbOTo73z09P9Mx", (int)iliIiiliiiii[7], (int)iliIiiliiiii[8], (int)iliIiiliiiii[9], (String)"Q5qImnmHa4WycIp8drmYjHVvkGK6r41slHaar2Ofa2OqtaNYXKVVjw==", (int)iliIiiliiiii[10], (String)"jW93", (String)"V1QwOXhV");
    }

    /*
     * Exception decompiling
     */
    public static Class IIlilIliiIli(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[CASE]], but top level block is 28[DOLOOP]
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

    private static /* synthetic */ void iliIiiliiiii(TextDisplay textDisplay, ItemMeta itemMeta) {
        Object[] objectArray = new Object[28];
        objectArray[3] = iliIiiliiiii[77];
        objectArray[13] = iliIiiliiiii[78];
        objectArray[12] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[12] ^ (Integer)objectArray[13]) - 2 * (~((Integer)objectArray[12]).intValue() & (Integer)objectArray[13]);
        objectArray[13] = iliIiiliiiii[79];
        objectArray[12] = (int)((Integer)objectArray[3]);
        objectArray[3] = (Integer)objectArray[12] + ~((Integer)objectArray[13]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[3]).intValue()];
        objectArray[8] = iliIiiliiiii[80];
        objectArray[13] = iliIiiliiiii[81];
        objectArray[12] = (int)((Integer)objectArray[8]);
        objectArray[8] = (Integer)objectArray[12] + ~((Integer)objectArray[13]).intValue() + 1;
        objectArray[13] = iliIiiliiiii[82];
        objectArray[12] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[12] | (Integer)objectArray[13]) & (~((Integer)objectArray[12]).intValue() | ~((Integer)objectArray[13]).intValue());
        objectArray2[((Integer)objectArray[8]).intValue()] = textDisplay;
        objectArray[18] = iliIiiliiiii[83];
        objectArray[13] = iliIiiliiiii[84];
        objectArray[12] = (int)((Integer)objectArray[18]);
        objectArray[18] = 2 * ((Integer)objectArray[12] | (Integer)objectArray[13]) - ((Integer)objectArray[12] ^ (Integer)objectArray[13]);
        objectArray[13] = iliIiiliiiii[85];
        objectArray[12] = (int)((Integer)objectArray[18]);
        objectArray[18] = (Integer)objectArray[12] - ~((Integer)objectArray[13]).intValue() - 1;
        objectArray2[((Integer)objectArray[18]).intValue()] = itemMeta;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IlIlllIlilIl.Iilililiiili("d8f139e7-f032-4fab-8531-48c936b830ca", (long)3341800426937346370L, (Object[])objectArray2, (int)iliIiiliiiii[86], (String)"j4ZMg5OMhYaysq2sqrNzaHhxiWZ9enq5a2dibGZjlW+ujWKYd2Jsv6NRoQ==", (String)"YJaLgIVPTVCvr7SYn55+f5OScnCXlna5i2mJa2xtjW9jYYFjqoZlhFhZWbhcXl28UJ+xsFRVVrRISUmoTE2ArECiQkNEpkZEONo6", (int)iliIiiliiiii[87], (int)iliIiiliiiii[88], (int)iliIiiliiiii[89], (String)"RGNzY4Z+kHy1eYF1ebCThXJ2i3ultpZ1k3+RpmyWYGqtjJhhY5xutg==", (int)iliIiiliiiii[90], (String)"ipaM", (String)"NEthbFZX");
    }

    /*
     * Exception decompiling
     */
    public static String Illillliilli(String var0) {
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
    public static void lIiiIiIlilli(Item item) {
        if (IlIlllIlilIl) {
            throw new IllegalStateException();
        }
        Object[] objectArray = new Object[30];
        objectArray[15] = iliIiiliiiii[66];
        objectArray[13] = iliIiiliiiii[67];
        objectArray[2] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[2] | (Integer)objectArray[13]) - ((Integer)objectArray[2] & (Integer)objectArray[13]);
        objectArray[13] = iliIiiliiiii[68];
        objectArray[2] = (int)((Integer)objectArray[15]);
        objectArray[15] = (Integer)objectArray[2] & ~((Integer)objectArray[13]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[13];
        Object[] objectArray2 = new Object[((Integer)objectArray[15]).intValue()];
        objectArray[12] = iliIiiliiiii[69];
        objectArray[13] = iliIiiliiiii[70];
        objectArray[2] = (int)((Integer)objectArray[12]);
        objectArray[12] = (Integer)objectArray[2] + ~((Integer)objectArray[13]).intValue() + 1;
        objectArray[13] = iliIiiliiiii[71];
        objectArray[2] = (int)((Integer)objectArray[12]);
        objectArray[12] = 2 * ((Integer)objectArray[2] | (Integer)objectArray[13]) - ((Integer)objectArray[2] ^ (Integer)objectArray[13]);
        objectArray2[((Integer)objectArray[12]).intValue()] = item;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IlIlllIlilIl.Iilililiiili("acda4245-6072-4f8c-8e7f-1fbba7653761", (long)5780222998211904681L, (Object[])objectArray2, (int)iliIiiliiiii[72], (String)"joVNhJKPhHmzsayrq7ByZ3lyiGF8eXumamRja2dglGCvjmOfdmFtgKJSoA==", (String)"YZWKh4RMTK+urLWfnp1/cJKRc3eWlXemimqIbG1ujGBiYoBkq4Vku1laWL9dXVyzUZywt1VWV6tJSkivTU6Bo0GhQ0RFpUc7Odk7", (int)iliIiiliiiii[73], (int)iliIiiliiiii[74], (int)iliIiiliiiii[75], (String)"RWByZId9kYO0eoByeLOSinN1inyktZdqknyQoW2VYWWsj5lmYp9viQ==", (int)iliIiiliiiii[76], (String)"i5WN", (String)"Mmsxbnoy");
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n;
        int n2 = n = (0x3251C1CE | 0xA1CFDD1A) - (0x3251C1CE & 0xA1CFDD1A);
        if (535696827 >= n2 + -1580212966 - (n2 & 0xA1CFDD1A) * 2) {
            int n3 = n = (0xB4F0B860 | 0xA1CFDD1A) - (0xB4F0B860 & 0xA1CFDD1A);
            IIIllIIliIIl = n3 + -1580212966 - (n3 & 0xA1CFDD1A) * 2;
        }
        Object[] objectArray = new Object[25];
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IlIlllIlilIl.Iiiiliiiiiii();
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IlIlllIlilIl.Iilililiiili("7d41ba0e-3ad8-4ed9-9d78-d737759162e6", IlIlllIlilIl.class, (int)iliIiiliiiii[119], (String)"golBgJaLgIVPTVCvr7R2a3V+hGV4fX+6dnh/b2NkkGyjgm+bcmVpvJ5unA==", (String)"bZmGg4BISFNSUEmbmpl7fJ6df3OSkXO6lnaUaGlqiGxuboxgr4Fgh2VmZLtZWVi/XZC8s1FSU7dVVlSrSUqFr02tT0BBoUNHRaVH", (int)iliIiiliiiii[120], (int)iliIiiliiiii[121], (int)iliIiiliiiii[122], (String)"SW6Ne5d5ToR+iIK1oHqAdXSvvIY=", (int)iliIiiliiiii[123], (String)"jYN0eHeN", (String)"VTE3Ykpq");
        int n4 = (0x322DE06C | 0xBCDEF726) - (0x322DE06C & 0xBCDEF726);
        int cfr_ignored_0 = n4 + -1126238426;
        objectArray[7] = iliIiiliiiii[124];
        objectArray[19] = iliIiiliiiii[125];
        objectArray[1] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[1] | (Integer)objectArray[19]) - ((Integer)objectArray[1] & (Integer)objectArray[19]);
        objectArray[19] = iliIiiliiiii[126];
        objectArray[1] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[1] ^ (Integer)objectArray[19]) - 2 * (~((Integer)objectArray[1]).intValue() & (Integer)objectArray[19]);
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IlIlllIlilIl.Iilililiiili("87b0467b-b3af-48d0-92a9-2aa9a5f08a2b", (long)-1693667510725196387L, (Object[])new Object[((Integer)objectArray[7]).intValue()], (int)iliIiiliiiii[127], (String)"g4pAj5eIgYJOTlFQrrd3bHR9hWp5fn69d3t+cGJnkWuigW6Uc2Zou59tnQ==", (String)"bJqHjIFLSVRTU0hkm5p6e5+efnyTknK9l3WVd2hpiWtvbY1vroJhgGRlZYRYWlm4XJO9vFBRUrBUVVW0SEmEqEyuTk9AokJARKZG", (int)iliIiiliiiii[128], (int)iliIiiliiiii[129], (int)iliIiiliiiii[130], (String)"SG9/b4J6lHhJhX2JfbSXgX56h3ehspJxj2ONumiSZG6hgJRtZ5hqsg==", (int)iliIiiliiiii[131], (String)"hpqA", (String)"cnphQ2lP");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ItemStack iIlIlllllill(Player player) {
        int n;
        int n2 = n = (0x10B7AB5E | 0x77DCC9B2) - (0x10B7AB5E & 0x77DCC9B2);
        IIIllIIliIIl = n2 + 2010958258 - (n2 & 0x77DCC9B2) * 2;
        if (1274778944 <= IIIllIIliIIl) {
            int cfr_ignored_0 = 0x4C & 1;
        }
        Object[] objectArray = new Object[27];
        objectArray[3] = iliIiiliiiii[38];
        objectArray[23] = iliIiiliiiii[39];
        objectArray[24] = (int)((Integer)objectArray[3]);
        objectArray[3] = (Integer)objectArray[24] - ~((Integer)objectArray[23]).intValue() - 1;
        objectArray[23] = iliIiiliiiii[40];
        objectArray[24] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[24] & ~((Integer)objectArray[23]).intValue()) - (~((Integer)objectArray[24]).intValue() & (Integer)objectArray[23]);
        Object[] objectArray2 = new Object[((Integer)objectArray[3]).intValue()];
        objectArray[7] = iliIiiliiiii[41];
        objectArray[23] = iliIiiliiiii[42];
        objectArray[24] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[24] ^ (Integer)objectArray[23]) - 2 * (~((Integer)objectArray[24]).intValue() & (Integer)objectArray[23]);
        objectArray[23] = iliIiiliiiii[43];
        objectArray[24] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[24] | (Integer)objectArray[23]) - ((Integer)objectArray[24] & (Integer)objectArray[23]);
        objectArray2[((Integer)objectArray[7]).intValue()] = player;
        return (ItemStack)Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IlIlllIlilIl.Iilililiiili("8f6f7cc7-175c-4ad1-ab15-ee49a4d5bf27", (long)-7914927637283072317L, (Object[])objectArray2, (int)iliIiiliiiii[44], (String)"jINLhpBxenuxt6qpqb58ZXt0jmN+Z2WkaGJlaWVummKtiGWddF9TgqBUpg==", (String)"Y5OMhYaysq2sqrOdnJNxcpCXdXWUi2mkiGyObm9ggmJgZIZmqbtauVtcXr1fU1KxU5q2tVdISalLTE6tT0CPoUOnRUZH2zk5O989", (int)iliIiiliiiii[45], (int)iliIiiliiiii[46], (int)iliIiiliiiii[47], (String)"R2Z0ZoWDb4G2fIZwer2ciHFzjH6mq4lokHqWo2+bb2euiZ9kYKFRiw==", (int)iliIiiliiiii[48], (String)"iZOL", (String)"azR1WFp1");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean liiiIIllIl(ItemStack itemStack) {
        if (IlIlllIlilIl) {
        }
        Object[] objectArray = new Object[26];
        objectArray[18] = iliIiiliiiii[22];
        objectArray[20] = iliIiiliiiii[23];
        objectArray[2] = (int)((Integer)objectArray[18]);
        objectArray[18] = 2 * ((Integer)objectArray[2] | (Integer)objectArray[20]) - ((Integer)objectArray[2] ^ (Integer)objectArray[20]);
        objectArray[20] = iliIiiliiiii[24];
        objectArray[2] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[2] | (Integer)objectArray[20]) - ((Integer)objectArray[2] & (Integer)objectArray[20]);
        Object[] objectArray2 = new Object[((Integer)objectArray[18]).intValue()];
        objectArray[11] = iliIiiliiiii[25];
        objectArray[20] = iliIiiliiiii[26];
        objectArray[2] = (int)((Integer)objectArray[11]);
        objectArray[11] = (Integer)objectArray[2] - ~((Integer)objectArray[20]).intValue() - 1;
        objectArray[20] = iliIiiliiiii[27];
        objectArray[2] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[2] | (Integer)objectArray[20]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[20]).intValue());
        objectArray2[((Integer)objectArray[11]).intValue()] = itemStack;
        return (boolean)Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IlIlllIlilIl.Iilililiiili("fcf4d851-9f8e-469e-bd57-103099890599", (Object)Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IlIlllIlilIl.Iilililiiili("de1d7cdd-2777-40ea-84bc-28510a4149fc", (long)6559093936075814356L, (Object[])objectArray2, (int)iliIiiliiiii[28], (String)"ioFJeG5zeH23tainp7x+Y312jH1gZWeibmBnZ2tsmGSrimejSl1RhKZWpA==", (String)"ZZGOe3iwsKuqqLGTkpFzdJaVd2uKiWuijm6MYGFigGRmZoRYl7lYv11eXLNRUVC3VZi0q0lKS69NTkyjQUKNp0WlRzg52Ts/Pd0/", (int)iliIiiliiiii[29], (int)iliIiiliiiii[30], (int)iliIiiliiiii[31], (String)"QWR2mHuBbYewfoR+dL+ejndxjmC4qYtulniUrWGZbWGoi51aXqNTjQ==", (int)iliIiiliiiii[32], (String)"j5GJ", (String)"OUhEbjFP"), (int)iliIiiliiiii[33], (String)"i4JIh29weXq2tqmopr9/ZHx1jWJhZmalb2NmaGpvmWOqiWacS15Qg6dVpQ==", (String)"ZJKPhHmzsayrq7Cck5Jyc5eWdnSLimqlj22Nb2BhgWNnZYVnlrpZuFxdXbxQUlGwVJu1tEhJSqhMTU2sQEGMoESmRkc42jo4PN4+", (int)iliIiiliiiii[34], (int)iliIiiliiiii[35], (int)iliIiiliiiii[36], (String)"QGWEfG6Ct3uHc3uynYtwdI19p7SL", (int)iliIiiliiiii[37], (String)"jIhliXA=", (String)"SFBRczRZ");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void IIIllIIliIIl(String string, TextDisplay textDisplay) {
        Object[] objectArray = new Object[29];
        int n = (0x3CBCB230 | 0x13C49C13) - (0x3CBCB230 & 0x13C49C13);
        int cfr_ignored_0 = n + 331652115;
        objectArray[3] = iliIiiliiiii[91];
        objectArray[11] = iliIiiliiiii[92];
        objectArray[8] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[8] | (Integer)objectArray[11]) & ~((Integer)objectArray[8] & (Integer)objectArray[11]);
        objectArray[11] = iliIiiliiiii[93];
        objectArray[8] = (int)((Integer)objectArray[3]);
        objectArray[3] = (Integer)objectArray[8] - ~((Integer)objectArray[11]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[3]).intValue()];
        objectArray[6] = iliIiiliiiii[94];
        objectArray[11] = iliIiiliiiii[95];
        objectArray[8] = (int)((Integer)objectArray[6]);
        objectArray[6] = ((Integer)objectArray[8] | (Integer)objectArray[11]) & (~((Integer)objectArray[8]).intValue() | ~((Integer)objectArray[11]).intValue());
        objectArray[11] = iliIiiliiiii[96];
        objectArray[8] = (int)((Integer)objectArray[6]);
        objectArray[6] = ((Integer)objectArray[8] ^ (Integer)objectArray[11]) - 2 * (~((Integer)objectArray[8]).intValue() & (Integer)objectArray[11]);
        objectArray2[((Integer)objectArray[6]).intValue()] = string;
        objectArray[16] = iliIiiliiiii[97];
        objectArray[11] = iliIiiliiiii[98];
        objectArray[8] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[8] - ~((Integer)objectArray[11]).intValue() - 1;
        objectArray[11] = iliIiiliiiii[99];
        objectArray[8] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[8] | (Integer)objectArray[11]) + ((Integer)objectArray[8] & (Integer)objectArray[11]);
        objectArray2[((Integer)objectArray[16]).intValue()] = textDisplay;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IlIlllIlilIl.Iilililiiili("0f67c606-c2e8-4c38-881e-60658a9708bc", (long)-6543318556939522435L, (Object[])objectArray2, (int)iliIiiliiiii[100], (String)"gIdPgpSNhodNs66trbJwaXdwimd6e3m4dGZhbWFilm6hjGGZcGNvvpxQog==", (String)"b5eIgYJOTlFQrreZmJ99fpyTcXGQl3W4lGiKamtsjm5sYIJirYdmhWdYWrlbX169X56ysVNUVbVXSEqpS0yDrU+jQUJDp0VFR9s5", (int)iliIiiliiiii[101], (int)iliIiiliiiii[102], (int)iliIiiliiiii[103], (String)"S2JwYoF/k31KeIJ0frGQhH13iHqit5V0jH6Sp2uXY2uijZtgZJ1ttw==", (int)iliIiiliiiii[104], (String)"hZeP", (String)"S25nUThK");
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle IIiilIiiiIii(int var0, String var1_1, String var2_2, int var3_3, int var4_4, int var5_5, String var6_6, int var7_7, String var8_8, String var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK], 3[TRYBLOCK], 4[TRYBLOCK]], but top level block is 27[SWITCH]
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
    private static String Iliilliiilii(String string, int n, int n2) {
        int n3;
        int n4 = n3 = (0x3CF1E4B | 0x95BE19E5) - (0x3CF1E4B & 0x95BE19E5);
        IIIllIIliIIl = n4 + -1782703643 - (n4 & 0x95BE19E5) * 2;
        if (1215708449 < IIIllIIliIIl) {
            int n5 = n3 = (0x87B3E89A | 0x95BE19E5) - (0x87B3E89A & 0x95BE19E5);
            IIIllIIliIIl = n5 + -1782703643 - (n5 & 0x95BE19E5) * 2;
        }
        Object[] objectArray = new Object[7];
        objectArray[4] = Base64.getDecoder().decode(string);
        int n6 = (0x6794C2D6 | 0x1F2F7EF4) - (0x6794C2D6 & 0x1F2F7EF4);
        int cfr_ignored_0 = n6 + 523206388;
        objectArray[5] = iliIiiliiiii[163];
        while ((Integer)objectArray[5] < ((byte[])objectArray[4]).length) {
            byte[] byArray = (byte[])objectArray[4];
            int n7 = (Integer)objectArray[5];
            objectArray[0] = (int)((Integer)objectArray[5]);
            objectArray[6] = n;
            objectArray[0] = (Integer)objectArray[6] + ~((Integer)objectArray[0]).intValue() + 1;
            objectArray[6] = (int)byArray[n7];
            objectArray[0] = n2;
            objectArray[6] = ((Integer)objectArray[6] | (Integer)objectArray[0]) & ~((Integer)objectArray[6] & (Integer)objectArray[0]);
            byArray[n7] = (byte)(((Integer)objectArray[6] ^ (Integer)objectArray[0]) - 2 * (~((Integer)objectArray[6]).intValue() & (Integer)objectArray[0]));
            int n8 = (0x262A9EC4 | 0xF15A303F) - (0x262A9EC4 & 0xF15A303F);
            int cfr_ignored_1 = n8 + -245747649;
            objectArray[5] = (Integer)objectArray[5] + 1;
        }
        try {
            return new String((byte[])objectArray[4], StandardCharsets.UTF_8);
        }
        catch (ThreadDeath threadDeath) {
            throw threadDeath;
        }
        catch (IllegalAccessError illegalAccessError) {
            throw illegalAccessError;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IliIlllilIi(IliIlllilIi iliIlllilIi) {
        int n;
        int n2 = n = (0x9AF378B | 0x44AECF96) - (0x9AF378B & 0x44AECF96);
        IIIllIIliIIl = n2 + 1152307094 - (n2 & 0x44AECF96) * 2;
        if (701413839 < IIIllIIliIIl) {
        }
        Object[] objectArray = new Object[26];
        objectArray[0] = iliIiiliiiii[11];
        objectArray[15] = iliIiiliiiii[12];
        objectArray[24] = (int)((Integer)objectArray[0]);
        objectArray[0] = 2 * ((Integer)objectArray[24] | (Integer)objectArray[15]) - ((Integer)objectArray[24] ^ (Integer)objectArray[15]);
        objectArray[15] = iliIiiliiiii[13];
        objectArray[24] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[24] & ~((Integer)objectArray[15]).intValue()) - (~((Integer)objectArray[24]).intValue() & (Integer)objectArray[15]);
        Object[] objectArray2 = new Object[((Integer)objectArray[0]).intValue()];
        objectArray[25] = iliIiiliiiii[14];
        objectArray[15] = iliIiiliiiii[15];
        objectArray[24] = (int)((Integer)objectArray[25]);
        objectArray[25] = 2 * ((Integer)objectArray[24] | (Integer)objectArray[15]) - ((Integer)objectArray[24] ^ (Integer)objectArray[15]);
        objectArray[15] = iliIiiliiiii[16];
        objectArray[24] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[24] | (Integer)objectArray[15]) & (~((Integer)objectArray[24]).intValue() | ~((Integer)objectArray[15]).intValue());
        objectArray2[((Integer)objectArray[25]).intValue()] = iliIlllilIi;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IlIlllIlilIl.Iilililiiili("35158227-1362-4768-a2cb-9f636aa52720", (long)-5132670385139921117L, (Object[])objectArray2, (int)iliIiiliiiii[17], (String)"iYC2eW1yf3y0tKempL15Yn53k3xjZGCjbWFoZmhtn2Woi1iiSVxWhaVXqw==", (String)"ZpBxenuxt6qpqb6SkZB0dZWUaGqJiGyjjW+DYWJjh2VlZ7tZlLhfvl5fU7JSUFe2VpmrqkpLTK5OT0OiQkOKpkakODk62Dw+Ptww", (int)iliIiiliiiii[18], (int)iliIiiliiiii[19], (int)iliIiiliiiii[20], (String)"QmWJmXiAaoazf4t/d76Zj3RwkWG7qIxvlXmbrGKYamCriqJbXaJUjA==", (int)iliIiiliiiii[21], (String)"jJB2", (String)"TEZicHZF");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite Iilililiiili(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        int n;
        int n2 = n = (0x15154ACE | 0xB82E8CAB) - (0x15154ACE & 0xB82E8CAB);
        IIIllIIliIIl = n2 + -1204908885 - (n2 & 0xB82E8CAB) * 2;
        if (634442210 <= IIIllIIliIIl) {
            int n3 = n = (0x2C | 0xB82E8CAB) - (0x2C & 0xB82E8CAB);
            int cfr_ignored_0 = n3 + -1204908885 - (n3 & 0xB82E8CAB) * 2;
        }
        Object[] objectArray = new Object[18];
        try {
            objectArray[16] = MethodHandles.lookup();
            int n4 = (0x158C5942 | 0x126D26F5) - (0x158C5942 & 0x126D26F5);
            int cfr_ignored_1 = n4 + 309143285;
            objectArray[10] = ((MethodHandles.Lookup)objectArray[16]).findStatic(IlIlllIlilIl.class, "IIiilIiiiIii", MethodType.fromMethodDescriptorString("(ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
            int n5 = (0x56E8CA55 | 0xF6F86ADF) - (0x56E8CA55 & 0xF6F86ADF);
            int cfr_ignored_2 = n5 + -151491873;
            objectArray[15] = methodType.parameterCount();
            objectArray[11] = iliIiiliiiii[132];
            objectArray[2] = (int)((Integer)objectArray[15]);
            objectArray[0] = 2 * ((Integer)objectArray[2] & ~((Integer)objectArray[11]).intValue()) - ((Integer)objectArray[2] ^ (Integer)objectArray[11]);
            int n6 = (0xFB57F882 | 0x520CD1E6) - (0xFB57F882 & 0x520CD1E6);
            int cfr_ignored_3 = n6 + 1376571878;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw cloneNotSupportedException;
        }
        catch (UnsupportedClassVersionError unsupportedClassVersionError) {
            throw unsupportedClassVersionError;
        }
        objectArray[9] = methodType.dropParameterTypes((Integer)objectArray[0], (Integer)objectArray[15]);
        objectArray[6] = MethodHandles.invoker((MethodType)objectArray[9]);
        Class[] classArray = new Class[iliIiiliiiii[133]];
        classArray[Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IlIlllIlilIl.iliIiiliiiii[134]] = MethodHandle.class;
        objectArray[17] = ((MethodType)objectArray[9]).appendParameterTypes(classArray);
        objectArray[11] = iliIiiliiiii[135];
        objectArray[2] = (int)((Integer)objectArray[0]);
        objectArray[13] = new int[((Integer)objectArray[2] | (Integer)objectArray[11]) + ((Integer)objectArray[2] & (Integer)objectArray[11])];
        ((int[])objectArray[13])[Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IlIlllIlilIl.iliIiiliiiii[136]] = (Integer)objectArray[0];
        objectArray[1] = iliIiiliiiii[137];
        while (true) {
            int n7 = (0x9F3AC765 | 0xAACBAA11) - (0x9F3AC765 & 0xAACBAA11);
            int cfr_ignored_4 = n7 + -1429493231;
            objectArray[11] = iliIiiliiiii[138];
            objectArray[2] = (int)((Integer)objectArray[0]);
            if ((Integer)objectArray[1] >= 2 * ((Integer)objectArray[2] | (Integer)objectArray[11]) - ((Integer)objectArray[2] ^ (Integer)objectArray[11])) {
                objectArray[12] = MethodHandles.permuteArguments((MethodHandle)objectArray[6], (MethodType)objectArray[17], (int[])objectArray[13]);
                int n8 = (0xE38C600F | 0x4D729F25) - (0xE38C600F & 0x4D729F25);
                int cfr_ignored_5 = n8 + 1299357477;
                objectArray[3] = MethodHandles.collectArguments((MethodHandle)objectArray[12], (Integer)objectArray[0], (MethodHandle)objectArray[10]);
                return new ConstantCallSite((MethodHandle)objectArray[3]);
            }
            objectArray[11] = iliIiiliiiii[139];
            objectArray[2] = (int)((Integer)objectArray[1]);
            ((int[])objectArray[13])[((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] & ~((Integer)objectArray[11]).intValue()) - (~((Integer)objectArray[2]).intValue() & (Integer)objectArray[11]);
            objectArray[1] = (Integer)objectArray[1] + 1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IilliliilIIi(IliIlllilIi iliIlllilIi, Location location, Player player) {
        Object[] objectArray = new Object[34];
        int n = (0x750EE211 | 0x487FB91E) - (0x750EE211 & 0x487FB91E);
        int cfr_ignored_0 = n + 1216330014;
        objectArray[3] = iliIiiliiiii[49];
        objectArray[4] = iliIiiliiiii[50];
        objectArray[20] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[20] & ~((Integer)objectArray[4]).intValue()) - (~((Integer)objectArray[20]).intValue() & (Integer)objectArray[4]);
        objectArray[4] = iliIiiliiiii[51];
        objectArray[20] = (int)((Integer)objectArray[3]);
        objectArray[3] = (Integer)objectArray[20] & ~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[20]).intValue() & (Integer)objectArray[4];
        Object[] objectArray2 = new Object[((Integer)objectArray[3]).intValue()];
        objectArray[25] = iliIiiliiiii[52];
        objectArray[4] = iliIiiliiiii[53];
        objectArray[20] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[20] ^ (Integer)objectArray[4]) - 2 * (~((Integer)objectArray[20]).intValue() & (Integer)objectArray[4]);
        objectArray[4] = iliIiiliiiii[54];
        objectArray[20] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[20] | (Integer)objectArray[4]) + ((Integer)objectArray[20] & (Integer)objectArray[4]);
        objectArray2[((Integer)objectArray[25]).intValue()] = iliIlllilIi;
        objectArray[11] = iliIiiliiiii[55];
        objectArray[4] = iliIiiliiiii[56];
        objectArray[20] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[20] | (Integer)objectArray[4]) & (~((Integer)objectArray[20]).intValue() | ~((Integer)objectArray[4]).intValue());
        objectArray[4] = iliIiiliiiii[57];
        objectArray[20] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[20] | (Integer)objectArray[4]) & (~((Integer)objectArray[20]).intValue() | ~((Integer)objectArray[4]).intValue());
        objectArray2[((Integer)objectArray[11]).intValue()] = location;
        objectArray[8] = iliIiiliiiii[58];
        objectArray[4] = iliIiiliiiii[59];
        objectArray[20] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[20] | (Integer)objectArray[4]) & (~((Integer)objectArray[20]).intValue() | ~((Integer)objectArray[4]).intValue());
        objectArray[4] = iliIiiliiiii[60];
        objectArray[20] = (int)((Integer)objectArray[8]);
        objectArray[8] = 2 * ((Integer)objectArray[20] & ~((Integer)objectArray[4]).intValue()) - ((Integer)objectArray[20] ^ (Integer)objectArray[4]);
        objectArray2[((Integer)objectArray[8]).intValue()] = player;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IlIlllIlilIl.Iilililiiili("5b2b0508-be70-4298-ac55-084668f2d8ad", (long)-4002397559469526622L, (Object[])objectArray2, (int)iliIiiliiiii[61], (String)"jYRKhZGOe3iwsKuqqLF9Znpzj2B/eGSnaWVkamRhm2Gsj2SedWBSgaFTpw==", (String)"YpSNhodNs66trbKenZxwcZGQdHaVlGiniWuPbW5vg2FhY4dlqIRbulpbX75eXFOyUp23tlZXSKpKS0+uTk+OokKgREVGpDg6Otg8", (int)iliIiiliiiii[62], (int)iliIiiliiiii[63], (int)iliIiiliiiii[64], (String)"RmF1ZYR8boK3e4dze7Kdi3B0jX2ntIhrkX2XoG6UbmSvjp5nYZ5QiA==", (int)iliIiiliiiii[65], (String)"iJSK", (String)"OGxYNUhz");
        int n2 = (0x2681253E | 0x7754A49D) - (0x2681253E & 0x7754A49D);
        int cfr_ignored_1 = n2 + 2002035869;
    }
}


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

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicReferenceArray;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public final class liiiIIllIl {
    public static Component IliIlllilIi;
    static AtomicReferenceArray<MethodHandle> IilliliilIIi;
    public static int[] lIiiIiIlilli;
    private static MiniMessage liiiIIllIl;
    public static int iliIiiliiiii;
    public static boolean IIIllIIliIIl;

    /*
     * Enabled aggressive block sorting
     */
    private liiiIIllIl() {
        int n;
        int n2 = n = (0x404FAC23 | 0xB1C1654) - (0x404FAC23 & 0xB1C1654);
        iliIiiliiiii = n2 + 186390100 - (n2 & 0xB1C1654) * 2;
        if (1176745826 <= iliIiiliiiii) {
            n = (0xDE38AB76 | 0xB1C1654) - (0xDE38AB76 & 0xB1C1654);
        }
        Object[] objectArray = new Object[26];
        objectArray[9] = lIiiIiIlilli[0];
        objectArray[21] = lIiiIiIlilli[1];
        objectArray[24] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[24] ^ (Integer)objectArray[21]) - 2 * (~((Integer)objectArray[24]).intValue() & (Integer)objectArray[21]);
        objectArray[21] = lIiiIiIlilli[2];
        objectArray[24] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[24] | (Integer)objectArray[21]) + ((Integer)objectArray[24] & (Integer)objectArray[21]);
        Object[] objectArray2 = new Object[((Integer)objectArray[9]).intValue()];
        objectArray[22] = lIiiIiIlilli[3];
        objectArray[21] = lIiiIiIlilli[4];
        objectArray[24] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[24] | (Integer)objectArray[21]) & (~((Integer)objectArray[24]).intValue() | ~((Integer)objectArray[21]).intValue());
        objectArray[21] = lIiiIiIlilli[5];
        objectArray[24] = (int)((Integer)objectArray[22]);
        objectArray[22] = (Integer)objectArray[24] - ~((Integer)objectArray[21]).intValue() - 1;
        objectArray2[((Integer)objectArray[22]).intValue()] = this;
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.liiiIIllIl.IlIillIiilIi("f8ef5975-289c-40e3-b7fe-12b65c92b5d4", (long)-4578902764485175706L, (Object[])objectArray2, (int)lIiiIiIlilli[6], (String)"bWUuIDlzaWsyfXk1Ni5vOThsYXdzITwuaW50KT5uYWwuHCBheWVyCC10YQ==", (int)lIiiIiIlilli[7], (String)"KEpbACZhdmEvIC1uZy9PLiZlY3Q7ZQBqYXZhYyBhbmcvAy5qZWN0dw==", (String)"THVzJScyMTU1emJsbElJICVsSUlsYgVpSUlsICVJSWwuJSVJSWxJBSBJbC5sJSVpSUlsIAVs", (String)"WkJ6Rlhx", (int)lIiiIiIlilli[8], (String)"cnVu", (int)lIiiIiIlilli[9], (int)lIiiIiIlilli[10]);
    }

    /*
     * Exception decompiling
     */
    public static void Illillliilli() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [48[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    private static /* synthetic */ void iliIiiliiiii(String string, ItemMeta itemMeta) {
        if (IIIllIIliIIl) {
            int cfr_ignored_0 = 0x1E & 1;
        }
        Object[] objectArray = new Object[29];
        objectArray[27] = lIiiIiIlilli[89];
        objectArray[12] = lIiiIiIlilli[90];
        objectArray[18] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[18] ^ (Integer)objectArray[12]) + 2 * ((Integer)objectArray[18] & (Integer)objectArray[12]);
        objectArray[12] = lIiiIiIlilli[91];
        objectArray[18] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[18] | (Integer)objectArray[12]) & (~((Integer)objectArray[18]).intValue() | ~((Integer)objectArray[12]).intValue());
        Object[] objectArray2 = new Object[((Integer)objectArray[27]).intValue()];
        objectArray[17] = lIiiIiIlilli[92];
        objectArray[12] = lIiiIiIlilli[93];
        objectArray[18] = (int)((Integer)objectArray[17]);
        objectArray[17] = 2 * ((Integer)objectArray[18] & ~((Integer)objectArray[12]).intValue()) - ((Integer)objectArray[18] ^ (Integer)objectArray[12]);
        objectArray[12] = lIiiIiIlilli[94];
        objectArray[18] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[18] | (Integer)objectArray[12]) - ((Integer)objectArray[18] & (Integer)objectArray[12]);
        objectArray2[((Integer)objectArray[17]).intValue()] = string;
        objectArray[25] = lIiiIiIlilli[95];
        objectArray[12] = lIiiIiIlilli[96];
        objectArray[18] = (int)((Integer)objectArray[25]);
        objectArray[25] = (Integer)objectArray[18] + ~((Integer)objectArray[12]).intValue() + 1;
        objectArray[12] = lIiiIiIlilli[97];
        objectArray[18] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[18] | (Integer)objectArray[12]) & (~((Integer)objectArray[18]).intValue() | ~((Integer)objectArray[12]).intValue());
        objectArray2[((Integer)objectArray[25]).intValue()] = itemMeta;
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.liiiIIllIl.IlIillIiilIi("9a8266a2-a2ca-45b6-ab93-f85de8d646b9", (long)-2477321843734274298L, (Object[])objectArray2, (int)lIiiIiIlilli[98], (String)"amIpID50bmw1fX4yMSloOT9rZnB0ITspbmlzKTlpZmspHCdmfmJ1CCpzZg==", (int)lIiiIiIlilli[99], (String)"L01cACFmcWYoICppYChILiFiZHM8ZQdtZnFmYydmaWAoAyltYmRzdw==", (String)"S3J0JSA1NjIyemVra05OICJrTk5rYgJuTk5rICJOTmspJSJOTmtOBSdOaylrJSJuTk5rIAJr", (String)"b2hvU2R0", (int)lIiiIiIlilli[100], (String)"dXJp", (int)lIiiIiIlilli[101], (int)lIiiIiIlilli[102]);
        int n = (0x3F623BA | 0xEFC1084E) - (0x3F623BA & 0xEFC1084E);
        int cfr_ignored_1 = n + -272562098;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lIiiIiIlilli(String string, String string2, String[] stringArray, ItemMeta itemMeta) {
        int n;
        int n2 = n = (0x22FC7962 | 0xDEEF9C6) - (0x22FC7962 & 0xDEEF9C6);
        iliIiiliiiii = n2 + 233765318 - (n2 & 0xDEEF9C6) * 2;
        if (727526278 <= iliIiiliiiii) {
            throw new MalformedURLException();
        }
        Object[] objectArray = new Object[32];
        objectArray[20] = lIiiIiIlilli[69];
        objectArray[25] = lIiiIiIlilli[70];
        objectArray[21] = (int)((Integer)objectArray[20]);
        objectArray[20] = ((Integer)objectArray[21] | (Integer)objectArray[25]) & (~((Integer)objectArray[21]).intValue() | ~((Integer)objectArray[25]).intValue());
        objectArray[25] = lIiiIiIlilli[71];
        objectArray[21] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[21] + ~((Integer)objectArray[25]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[20]).intValue()];
        objectArray[31] = lIiiIiIlilli[72];
        objectArray[25] = lIiiIiIlilli[73];
        objectArray[21] = (int)((Integer)objectArray[31]);
        objectArray[31] = (Integer)objectArray[21] - ~((Integer)objectArray[25]).intValue() - 1;
        objectArray[25] = lIiiIiIlilli[74];
        objectArray[21] = (int)((Integer)objectArray[31]);
        objectArray[31] = ((Integer)objectArray[21] | (Integer)objectArray[25]) & ~((Integer)objectArray[21] & (Integer)objectArray[25]);
        objectArray2[((Integer)objectArray[31]).intValue()] = string;
        objectArray[23] = lIiiIiIlilli[75];
        objectArray[25] = lIiiIiIlilli[76];
        objectArray[21] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[21] ^ (Integer)objectArray[25]) + 2 * ((Integer)objectArray[21] & (Integer)objectArray[25]);
        objectArray[25] = lIiiIiIlilli[77];
        objectArray[21] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[21] - ~((Integer)objectArray[25]).intValue() - 1;
        objectArray2[((Integer)objectArray[23]).intValue()] = string2;
        objectArray[7] = lIiiIiIlilli[78];
        objectArray[25] = lIiiIiIlilli[79];
        objectArray[21] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[21] | (Integer)objectArray[25]) & ~((Integer)objectArray[21] & (Integer)objectArray[25]);
        objectArray[25] = lIiiIiIlilli[80];
        objectArray[21] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[21] | (Integer)objectArray[25]) & ~((Integer)objectArray[21] & (Integer)objectArray[25]);
        objectArray2[((Integer)objectArray[7]).intValue()] = stringArray;
        objectArray[6] = lIiiIiIlilli[81];
        objectArray[25] = lIiiIiIlilli[82];
        objectArray[21] = (int)((Integer)objectArray[6]);
        objectArray[6] = ((Integer)objectArray[21] ^ (Integer)objectArray[25]) - 2 * (~((Integer)objectArray[21]).intValue() & (Integer)objectArray[25]);
        objectArray[25] = lIiiIiIlilli[83];
        objectArray[21] = (int)((Integer)objectArray[6]);
        objectArray[6] = 2 * ((Integer)objectArray[21] & ~((Integer)objectArray[25]).intValue()) - ((Integer)objectArray[21] ^ (Integer)objectArray[25]);
        objectArray2[((Integer)objectArray[6]).intValue()] = itemMeta;
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.liiiIIllIl.IlIillIiilIi("61c7539f-c5c1-497b-95bf-ba6b0a1d33c5", (long)5117803188589596367L, (Object[])objectArray2, (int)lIiiIiIlilli[84], (String)"a2MoID91b200fX8zMChpOT5qZ3F1IToob2hyKThoZ2ooHCZnf2N0CCtyZw==", (int)lIiiIiIlilli[85], (String)"LkxdACBncGcpICtoYSlJLiBjZXI9ZQZsZ3BnYyZnaGEpAyhsY2Vydw==", (String)"SnN1JSE0NzMzemRqak9PICNqT09qYgNvT09qICNPT2ooJSNPT2pPBSZPaihqJSNvT09qIANq", (String)"anpGeng1", (int)lIiiIiIlilli[86], (String)"dHNo", (int)lIiiIiIlilli[87], (int)lIiiIiIlilli[88]);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        if (IIIllIIliIIl) {
            int cfr_ignored_0 = 1 & 1;
        }
        Object[] objectArray = new Object[25];
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.liiiIIllIl.Illillliilli();
        int n = (0x1145A3D3 | 0x71CB6B4B) - (0x1145A3D3 & 0x71CB6B4B);
        int cfr_ignored_1 = n + 1909156683;
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.liiiIIllIl.IlIillIiilIi("09c1e618-7439-4564-af2a-253a73616947", liiiIIllIl.class, (int)lIiiIiIlilli[103], (String)"ZW0mIDF7YWM6fXE9PiZnOTBkaX97ITQmYWZ8KTZmaWQmHChpcW16CCV8aQ==", (int)lIiiIiIlilli[104], (String)"IERiLTJpJ2RpIiMnS2RpPzczIV4=", (String)"RH17JS86OT09empkZEFBIC1kQUFkYg1hQUFkIC1BQWQmJS1BQWRBBShBZCZkJS1hQUFkIA1k", (String)"bXVqZUJI", (int)lIiiIiIlilli[105], (String)"ZGdpKBJl", (int)lIiiIiIlilli[106], (int)lIiiIiIlilli[107]);
        objectArray[7] = lIiiIiIlilli[108];
        objectArray[13] = lIiiIiIlilli[109];
        objectArray[21] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[21] ^ (Integer)objectArray[13]) - 2 * (~((Integer)objectArray[21]).intValue() & (Integer)objectArray[13]);
        objectArray[13] = lIiiIiIlilli[110];
        objectArray[21] = (int)((Integer)objectArray[7]);
        objectArray[7] = 2 * ((Integer)objectArray[21] | (Integer)objectArray[13]) - ((Integer)objectArray[21] ^ (Integer)objectArray[13]);
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.liiiIIllIl.IlIillIiilIi("43f27f48-ee47-424e-83d1-29e626b95efd", (long)-4729387743798614683L, (Object[])new Object[((Integer)objectArray[7]).intValue()], (int)lIiiIiIlilli[111], (String)"ZGwnIDB6YGI7fXA8PydmOTFlaH56ITUnYGd9KTdnaGUnHClocGx7CCR9aA==", (int)lIiiIiIlilli[112], (String)"IUNSAC9of2gmICRnbiZGLi9san0yZQljaH9oYyloZ24mAydjbGp9dw==", (String)"RXx6JS47ODw8emtlZUBAICxlQEBlYgxgQEBlICxAQGUnJSxAQGVABSlAZSdlJSxgQEBlIAxl", (String)"S0Voak5i", (int)lIiiIiIlilli[113], (String)"e3xn", (int)lIiiIiIlilli[114], (int)lIiiIiIlilli[115]);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite IlIillIiilIi(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        if (IIIllIIliIIl) {
        }
        Object[] objectArray = new Object[16];
        objectArray[0] = MethodHandles.lookup();
        int n = (0xBB61AB5F | 0x4AC0051B) - (0xBB61AB5F & 0x4AC0051B);
        int cfr_ignored_1 = n + 1254098203;
        objectArray[8] = ((MethodHandles.Lookup)objectArray[0]).findStatic(liiiIIllIl.class, "IiIiliIiiiIi", MethodType.fromMethodDescriptorString("(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
        objectArray[9] = methodType.parameterCount();
        objectArray[10] = lIiiIiIlilli[116];
        objectArray[15] = (int)((Integer)objectArray[9]);
        objectArray[14] = 2 * ((Integer)objectArray[15] & ~((Integer)objectArray[10]).intValue()) - ((Integer)objectArray[15] ^ (Integer)objectArray[10]);
        objectArray[12] = methodType.dropParameterTypes((Integer)objectArray[14], (Integer)objectArray[9]);
        objectArray[13] = MethodHandles.invoker((MethodType)objectArray[12]);
        int n2 = (0xCFF1A803 | 0x9BB282EB) - (0xCFF1A803 & 0x9BB282EB);
        int cfr_ignored_2 = n2 + -1682799893;
        Class[] classArray = new Class[lIiiIiIlilli[117]];
        classArray[Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.liiiIIllIl.lIiiIiIlilli[118]] = MethodHandle.class;
        objectArray[2] = ((MethodType)objectArray[12]).appendParameterTypes(classArray);
        objectArray[10] = lIiiIiIlilli[119];
        objectArray[15] = (int)((Integer)objectArray[14]);
        objectArray[11] = new int[((Integer)objectArray[15] | (Integer)objectArray[10]) + ((Integer)objectArray[15] & (Integer)objectArray[10])];
        ((int[])objectArray[11])[Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.liiiIIllIl.lIiiIiIlilli[120]] = (Integer)objectArray[14];
        objectArray[3] = lIiiIiIlilli[121];
        block13: while (true) {
            objectArray[10] = lIiiIiIlilli[122];
            objectArray[15] = (int)((Integer)objectArray[14]);
            if ((Integer)objectArray[3] >= ((Integer)objectArray[15] ^ (Integer)objectArray[10]) + 2 * ((Integer)objectArray[15] & (Integer)objectArray[10])) {
                objectArray[1] = MethodHandles.permuteArguments((MethodHandle)objectArray[13], (MethodType)objectArray[2], (int[])objectArray[11]);
                objectArray[7] = MethodHandles.collectArguments((MethodHandle)objectArray[1], (Integer)objectArray[14], (MethodHandle)objectArray[8]);
                return new ConstantCallSite((MethodHandle)objectArray[7]);
            }
            int n3 = (0xE3DCB967 | 0xC60CA8C4) - (0xE3DCB967 & 0xC60CA8C4);
            boolean bl = true;
            block14: while (true) {
                if (!bl || (bl = false) || !true) {
                    objectArray[10] = lIiiIiIlilli[123];
                    objectArray[15] = (int)((Integer)objectArray[3]);
                    ((int[])objectArray[11])[((Integer)objectArray[3]).intValue()] = ((Integer)objectArray[15] ^ (Integer)objectArray[10]) - 2 * (~((Integer)objectArray[15]).intValue() & (Integer)objectArray[10]);
                    objectArray[3] = (Integer)objectArray[3] + 1;
                    n3 = (0xA4F9393E | 0xC60CA8C4) - (0xA4F9393E & 0xC60CA8C4);
                }
                int n4 = n3;
                switch (n4 + -972248892 - (n4 & 0xC60CA8C4) * 2) {
                    default: {
                        continue block13;
                    }
                    case -472073881: {
                        continue block14;
                    }
                    case -2059739066: {
                        continue block14;
                    }
                    case -1527170754: 
                }
                break;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static ItemStack IliIlllilIi(String string, int n) {
        int n2;
        int n3 = n2 = (0x2737380D | 0x3DD2B05E) - (0x2737380D & 0x3DD2B05E);
        iliIiiliiiii = n3 + 1037217886 - (n3 & 0x3DD2B05E) * 2;
        if (721081659 <= iliIiiliiiii) {
            int n4 = n2 = (0xE5771547 | 0x3DD2B05E) - (0xE5771547 & 0x3DD2B05E);
            iliIiiliiiii = n4 + 1037217886 - (n4 & 0x3DD2B05E) * 2;
        }
        Object[] objectArray = new Object[30];
        int n5 = (0xC3E2E35E | 0x428A21B7) - (0xC3E2E35E & 0x428A21B7);
        int cfr_ignored_0 = n5 + 1116348855;
        objectArray[29] = lIiiIiIlilli[11];
        objectArray[12] = lIiiIiIlilli[12];
        objectArray[2] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[2] | (Integer)objectArray[12]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[12]).intValue());
        objectArray[12] = lIiiIiIlilli[13];
        objectArray[2] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[2] ^ (Integer)objectArray[12]) + 2 * ((Integer)objectArray[2] & (Integer)objectArray[12]);
        Object[] objectArray2 = new Object[((Integer)objectArray[29]).intValue()];
        objectArray[3] = lIiiIiIlilli[14];
        objectArray[12] = lIiiIiIlilli[15];
        objectArray[2] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[2] | (Integer)objectArray[12]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[12]).intValue());
        objectArray[12] = lIiiIiIlilli[16];
        objectArray[2] = (int)((Integer)objectArray[3]);
        objectArray[3] = (Integer)objectArray[2] - ~((Integer)objectArray[12]).intValue() - 1;
        objectArray2[((Integer)objectArray[3]).intValue()] = string;
        objectArray[15] = lIiiIiIlilli[17];
        objectArray[12] = lIiiIiIlilli[18];
        objectArray[2] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[2] ^ (Integer)objectArray[12]) + 2 * ((Integer)objectArray[2] & (Integer)objectArray[12]);
        objectArray[12] = lIiiIiIlilli[19];
        objectArray[2] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[2] ^ (Integer)objectArray[12]) - 2 * (~((Integer)objectArray[2]).intValue() & (Integer)objectArray[12]);
        objectArray2[((Integer)objectArray[15]).intValue()] = Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.liiiIIllIl.IlIillIiilIi("24e0b365-56d6-4bf8-95e5-784da4045e0f", (int)n, (int)lIiiIiIlilli[20], (String)"a2B3LWNtYG9mYgRvdWRmKT8=", (int)lIiiIiIlilli[21], (String)"KUgoACdgd2AuICxvZi5IIjlkZmRzdw==", (String)"TXRyJSYzMDQ0emNtbUhIICRtSEhtYgRoSEhtICRISG0vJSRISG1IBSFIbS9tJSRoSEhtIARt", (String)"WHZWdFFB", (int)lIiiIiIlilli[22], (String)"d2BtOShOZw==", (int)lIiiIiIlilli[23], (int)lIiiIiIlilli[24]);
        return (ItemStack)Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.liiiIIllIl.IlIillIiilIi("cd3dc45d-023b-471e-969c-6fb9da5e9730", (long)2925989407283425925L, (Object[])objectArray2, (int)lIiiIiIlilli[25], (String)"b2csIDtxa2kwfXs3NCxtOTpuY3VxIT4sa2x2KTxsY24sHCJje2dwCC92Yw==", (int)lIiiIiIlilli[26], (String)"KkhZACRjdGMtIC9sZS1NLiRnYXY5ZQJoY3RjYyJjbGUtAyxoZ2F2dw==", (String)"TndxJSUwMzc3emBubktLICduS0tuYgdrS0tuICdLS24sJSdLS25LBSJLbixuJSdrS0tuIAdu", (String)"ZEo5VzFL", (int)lIiiIiIlilli[27], (String)"cHds", (int)lIiiIiIlilli[28], (int)lIiiIiIlilli[29]);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String IIlilIliiIli(String var0, int var1_1, int var2_2) {
        if (Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.liiiIIllIl.IIIllIIliIIl) {
            42 + 71;
        }
        if (Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.liiiIIllIl.IIIllIIliIIl) {
        }
        var10_5 = new Object[7];
        var10_5[1] = Base64.getDecoder().decode(var0);
        var10_5[4] = Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.liiiIIllIl.lIiiIiIlilli[147];
        if (true) ** GOTO lbl20
        block16: while (true) {
            var8_3 = (-820634984 | -1751174789) - (-820634984 & -1751174789);
            block17: while (true) {
                v0 = var8_3;
                switch (v0 + -1751174789 - (v0 & -1751174789) * 2) {
                    case -820634984: {
                        var10_5[4] = (Integer)var10_5[4] + 1;
                        ** GOTO lbl-1000
                    }
lbl20:
                    // 2 sources

                    default: lbl-1000:
                    // 2 sources

                    {
                        if ((Integer)var10_5[4] >= ((byte[])var10_5[1]).length) {
                            return new String((byte[])var10_5[1], StandardCharsets.UTF_8);
                        }
                    }
                    var8_3 = (547130291 | -1751174789) - (547130291 & -1751174789);
                    continue block17;
                    case 547130291: 
                }
                break;
            }
            switch ((Integer)var10_5[4] % Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.liiiIIllIl.lIiiIiIlilli[148]) {
                default: {
                    continue block16;
                }
                case 0: 
                case 1: 
                case 2: 
                case 5: {
                    v1 = (byte[])var10_5[1];
                    v2 = (Integer)var10_5[4];
                    var10_5[5] = var1_1;
                    var10_5[6] = (int)v1[v2];
                    v1[v2] = (byte)(((Integer)var10_5[6] | (Integer)var10_5[5]) & (~((Integer)var10_5[6]).intValue() | ~((Integer)var10_5[5]).intValue()));
                    continue block16;
                }
                case 3: {
                    v3 = (byte[])var10_5[1];
                    v4 = (Integer)var10_5[4];
                    var10_5[5] = var2_2;
                    var10_5[6] = (int)v3[v4];
                    v3[v4] = (byte)(((Integer)var10_5[6] | (Integer)var10_5[5]) - ((Integer)var10_5[6] & (Integer)var10_5[5]));
                    var9_4 = (-994159040 | 1496580409) - (-994159040 & 1496580409);
                    var9_4 + 1496580409;
                    continue block16;
                }
                case 4: 
            }
            v5 = (byte[])var10_5[1];
            v6 = (Integer)var10_5[4];
            var10_5[5] = var1_1;
            var10_5[6] = var2_2;
            var10_5[5] = (Integer)var10_5[6] & ~((Integer)var10_5[5]).intValue() | ~((Integer)var10_5[6]).intValue() & (Integer)var10_5[5];
            var10_5[6] = (int)v5[v6];
            v5[v6] = (byte)((Integer)var10_5[6] & ~((Integer)var10_5[5]).intValue() | ~((Integer)var10_5[6]).intValue() & (Integer)var10_5[5]);
        }
    }

    private static ItemStack liiiIIllIl(String string, String string2, String ... stringArray) {
        Object[] objectArray = new Object[31];
        objectArray[25] = lIiiIiIlilli[30];
        objectArray[13] = lIiiIiIlilli[31];
        objectArray[19] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[19] | (Integer)objectArray[13]) & ~((Integer)objectArray[19] & (Integer)objectArray[13]);
        objectArray[13] = lIiiIiIlilli[32];
        objectArray[19] = (int)((Integer)objectArray[25]);
        objectArray[25] = 2 * ((Integer)objectArray[19] & ~((Integer)objectArray[13]).intValue()) - ((Integer)objectArray[19] ^ (Integer)objectArray[13]);
        Object[] objectArray2 = new Object[((Integer)objectArray[25]).intValue()];
        objectArray[0] = lIiiIiIlilli[33];
        objectArray[13] = lIiiIiIlilli[34];
        objectArray[19] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[19] ^ (Integer)objectArray[13]) - 2 * (~((Integer)objectArray[19]).intValue() & (Integer)objectArray[13]);
        objectArray[13] = lIiiIiIlilli[35];
        objectArray[19] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[19] | (Integer)objectArray[13]) & (~((Integer)objectArray[19]).intValue() | ~((Integer)objectArray[13]).intValue());
        objectArray2[((Integer)objectArray[0]).intValue()] = string;
        objectArray[23] = lIiiIiIlilli[36];
        objectArray[13] = lIiiIiIlilli[37];
        objectArray[19] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[19] | (Integer)objectArray[13]) & (~((Integer)objectArray[19]).intValue() | ~((Integer)objectArray[13]).intValue());
        objectArray[13] = lIiiIiIlilli[38];
        objectArray[19] = (int)((Integer)objectArray[23]);
        objectArray[23] = 2 * ((Integer)objectArray[19] & ~((Integer)objectArray[13]).intValue()) - ((Integer)objectArray[19] ^ (Integer)objectArray[13]);
        objectArray2[((Integer)objectArray[23]).intValue()] = string2;
        objectArray[26] = lIiiIiIlilli[39];
        objectArray[13] = lIiiIiIlilli[40];
        objectArray[19] = (int)((Integer)objectArray[26]);
        objectArray[26] = (Integer)objectArray[19] + ~((Integer)objectArray[13]).intValue() + 1;
        objectArray[13] = lIiiIiIlilli[41];
        objectArray[19] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[19] | (Integer)objectArray[13]) - ((Integer)objectArray[19] & (Integer)objectArray[13]);
        objectArray2[((Integer)objectArray[26]).intValue()] = stringArray;
        return (ItemStack)Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.liiiIIllIl.IlIillIiilIi("d8587d63-8205-4175-8b74-dabb562ad106", (long)-2020019588245407034L, (Object[])objectArray2, (int)lIiiIiIlilli[42], (String)"bmYtIDpwamgxfXo2NS1sOTtvYnRwIT8tam13KT1tYm8tHCNiemZxCC53Yg==", (int)lIiiIiIlilli[43], (String)"K0lYACVidWIsIC5tZCxMLiVmYHc4ZQNpYnViYyNibWQsAy1pZmB3dw==", (String)"T3ZwJSQxMjY2emFvb0pKICZvSkpvYgZqSkpvICZKSm8tJSZKSm9KBSNKby1vJSZqSkpvIAZv", (String)"Mjh5THFC", (int)lIiiIiIlilli[44], (String)"cXZt", (int)lIiiIiIlilli[45], (int)lIiiIiIlilli[46]);
    }

    /*
     * Exception decompiling
     */
    public static String IIIilIIiiIIi(String var0) {
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
    private static /* synthetic */ void IilliliilIIi(ItemMeta itemMeta) {
        int n;
        int n2 = n = (0x27DA3E0A | 0x4AEDA5ED) - (0x27DA3E0A & 0x4AEDA5ED);
        iliIiiliiiii = n2 + 1257088493 - (n2 & 0x4AEDA5ED) * 2;
        if (1032254716 <= iliIiiliiiii) {
        }
        Object[] objectArray = new Object[26];
        objectArray[15] = lIiiIiIlilli[58];
        objectArray[0] = lIiiIiIlilli[59];
        objectArray[20] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[20] & ~((Integer)objectArray[0]).intValue()) - (~((Integer)objectArray[20]).intValue() & (Integer)objectArray[0]);
        objectArray[0] = lIiiIiIlilli[60];
        objectArray[20] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[20] ^ (Integer)objectArray[0]) + 2 * ((Integer)objectArray[20] & (Integer)objectArray[0]);
        Object[] objectArray2 = new Object[((Integer)objectArray[15]).intValue()];
        objectArray[16] = lIiiIiIlilli[61];
        objectArray[0] = lIiiIiIlilli[62];
        objectArray[20] = (int)((Integer)objectArray[16]);
        objectArray[16] = 2 * ((Integer)objectArray[20] & ~((Integer)objectArray[0]).intValue()) - ((Integer)objectArray[20] ^ (Integer)objectArray[0]);
        objectArray[0] = lIiiIiIlilli[63];
        objectArray[20] = (int)((Integer)objectArray[16]);
        objectArray[16] = 2 * ((Integer)objectArray[20] & ~((Integer)objectArray[0]).intValue()) - ((Integer)objectArray[20] ^ (Integer)objectArray[0]);
        objectArray2[((Integer)objectArray[16]).intValue()] = itemMeta;
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.liiiIIllIl.IlIillIiilIi("d9da100c-f781-460c-8d33-a68db87947bd", (long)5361157549695935496L, (Object[])objectArray2, (int)lIiiIiIlilli[64], (String)"aGArIDx2bG43fXwwMytqOT1pZHJ2ITkrbGtxKTtrZGkrHCVkfGB3CChxZA==", (int)lIiiIiIlilli[65], (String)"LU9eACNkc2QqIChrYipKLiNgZnE+ZQVvZHNkYyVka2IqAytvYGZxdw==", (String)"SXB2JSI3NDAwemdpaUxMICBpTExpYgBsTExpICBMTGkrJSBMTGlMBSVMaStpJSBsTExpIABp", (String)"V3NVOVZE", (int)lIiiIiIlilli[66], (String)"d3Br", (int)lIiiIiIlilli[67], (int)lIiiIiIlilli[68]);
    }

    /*
     * Exception decompiling
     */
    public static Class Iiilliiliiil(String var0) {
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

    public static void iIlIlllllill(Player player) {
        Object[] objectArray = new Object[28];
        objectArray[25] = lIiiIiIlilli[47];
        objectArray[9] = lIiiIiIlilli[48];
        objectArray[16] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[16] | (Integer)objectArray[9]) + ((Integer)objectArray[16] & (Integer)objectArray[9]);
        objectArray[9] = lIiiIiIlilli[49];
        objectArray[16] = (int)((Integer)objectArray[25]);
        objectArray[25] = (Integer)objectArray[16] - ~((Integer)objectArray[9]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[25]).intValue()];
        objectArray[21] = lIiiIiIlilli[50];
        objectArray[9] = lIiiIiIlilli[51];
        objectArray[16] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[16] | (Integer)objectArray[9]) - ((Integer)objectArray[16] & (Integer)objectArray[9]);
        objectArray[9] = lIiiIiIlilli[52];
        objectArray[16] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[16] ^ (Integer)objectArray[9]) + 2 * ((Integer)objectArray[16] & (Integer)objectArray[9]);
        objectArray2[((Integer)objectArray[21]).intValue()] = player;
        Lusik21556.llIIlilIIl.IiIIlliIIl.iiIIlIIlIl.liiiIIllIl.IlIillIiilIi("4854691e-5a42-4912-99c3-3ae55d3ef87c", (long)-309072542514509201L, (Object[])objectArray2, (int)lIiiIiIlilli[53], (String)"aWEqID13bW82fX0xMiprOTxoZXN3ITgqbWpwKTpqZWgqHCRlfWF2CClwZQ==", (int)lIiiIiIlilli[54], (String)"LE5fACJlcmUrIClqYytLLiJhZ3A/ZQRuZXJlYyRlamMrAypuYWdwdw==", (String)"SHF3JSM2NTExemZoaE1NICFoTU1oYgFtTU1oICFNTWgqJSFNTWhNBSRNaCpoJSFtTU1oIAFo", (String)"MGxSMndr", (int)lIiiIiIlilli[55], (String)"dnFq", (int)lIiiIiIlilli[56], (int)lIiiIiIlilli[57]);
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle IiIiliIiiiIi(int var0, String var1_1, int var2_2, String var3_3, String var4_4, String var5_5, int var6_6, String var7_7, int var8_8, int var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [39[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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


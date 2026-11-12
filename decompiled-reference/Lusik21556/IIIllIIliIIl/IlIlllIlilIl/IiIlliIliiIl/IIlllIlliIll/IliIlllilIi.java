/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.kyori.adventure.text.minimessage.MiniMessage
 *  org.bukkit.Location
 *  org.bukkit.NamespacedKey
 *  org.bukkit.entity.Item
 *  org.bukkit.entity.TextDisplay
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.meta.ItemMeta
 */
package Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.concurrent.atomic.AtomicReferenceArray;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Item;
import org.bukkit.entity.TextDisplay;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public final class IliIlllilIi {
    public static int[] iliIiiliiiii;
    public static NamespacedKey iIlIlllllill;
    static AtomicReferenceArray<MethodHandle> lIiiIiIlilli;
    private static MiniMessage IliIlllilIi;
    public static NamespacedKey liiiIIllIl;
    public static int IIIllIIliIIl;
    public static boolean IlIlllIlilIl;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite IIIIllIIIl(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        if (IlIlllIlilIl) {
            int n;
            int n2 = n = (0x96B62BC2 | 0x88DEE3BF) - (0x96B62BC2 & 0x88DEE3BF);
            IIIllIIliIIl = n2 + -1998658625 - (n2 & 0x88DEE3BF) * 2;
        }
        Object[] objectArray = new Object[16];
        objectArray[0] = MethodHandles.lookup();
        objectArray[3] = ((MethodHandles.Lookup)objectArray[0]).findStatic(IliIlllilIi.class, "iIIIlIlIIl", MethodType.fromMethodDescriptorString("(IILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
        objectArray[13] = methodType.parameterCount();
        objectArray[8] = iliIiiliiiii[202];
        objectArray[15] = (int)((Integer)objectArray[13]);
        objectArray[10] = (Integer)objectArray[15] + ~((Integer)objectArray[8]).intValue() + 1;
        objectArray[5] = methodType.dropParameterTypes((Integer)objectArray[10], (Integer)objectArray[13]);
        int n = (0x19590EC2 | 0x874A3307) - (0x19590EC2 & 0x874A3307);
        int cfr_ignored_0 = n + -2025180409;
        objectArray[4] = MethodHandles.invoker((MethodType)objectArray[5]);
        Class[] classArray = new Class[iliIiiliiiii[203]];
        classArray[Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.iliIiiliiiii[204]] = MethodHandle.class;
        objectArray[14] = ((MethodType)objectArray[5]).appendParameterTypes(classArray);
        objectArray[8] = iliIiiliiiii[205];
        objectArray[15] = (int)((Integer)objectArray[10]);
        objectArray[12] = new int[2 * ((Integer)objectArray[15] | (Integer)objectArray[8]) - ((Integer)objectArray[15] ^ (Integer)objectArray[8])];
        ((int[])objectArray[12])[Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.iliIiiliiiii[206]] = (Integer)objectArray[10];
        objectArray[11] = iliIiiliiiii[207];
        while (true) {
            int n3 = (0x518A6860 | 0x4558D3E0) - (0x518A6860 & 0x4558D3E0);
            block12: while (true) {
                int n4 = n3;
                switch (n4 + 1163449312 - (n4 & 0x4558D3E0) * 2) {
                    default: {
                        objectArray[8] = iliIiiliiiii[208];
                        objectArray[15] = (int)((Integer)objectArray[10]);
                        if ((Integer)objectArray[11] >= ((Integer)objectArray[15] | (Integer)objectArray[8]) + ((Integer)objectArray[15] & (Integer)objectArray[8])) {
                            objectArray[1] = MethodHandles.permuteArguments((MethodHandle)objectArray[4], (MethodType)objectArray[14], (int[])objectArray[12]);
                            objectArray[6] = MethodHandles.collectArguments((MethodHandle)objectArray[1], (Integer)objectArray[10], (MethodHandle)objectArray[3]);
                            int n5 = (0x3CDC6E20 | 0x36CB8A9C) - (0x3CDC6E20 & 0x36CB8A9C);
                            int cfr_ignored_1 = n5 + 919308956;
                            return new ConstantCallSite((MethodHandle)objectArray[6]);
                        }
                        objectArray[8] = iliIiiliiiii[209];
                        objectArray[15] = (int)((Integer)objectArray[11]);
                        ((int[])objectArray[12])[((Integer)objectArray[11]).intValue()] = ((Integer)objectArray[15] ^ (Integer)objectArray[8]) - 2 * (~((Integer)objectArray[15]).intValue() & (Integer)objectArray[8]);
                        n3 = (0x941742FD | 0x4558D3E0) - (0x941742FD & 0x4558D3E0);
                        continue block12;
                    }
                    case -1810414851: {
                        objectArray[11] = (Integer)objectArray[11] + 1;
                        n3 = (0x9C8311B8 | 0x4558D3E0) - (0x9C8311B8 & 0x4558D3E0);
                        continue block12;
                    }
                    case -1669131848: 
                }
                break;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public static String Iiiiliiiiiii(String var0) {
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

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void IIIllIIliIIl(TextDisplay textDisplay, ItemMeta itemMeta) {
        if (IlIlllIlilIl) {
            int n = (0x5339D622 | 0x27F54F86) - (0x5339D622 & 0x27F54F86);
        }
        Object[] objectArray = new Object[29];
        objectArray[13] = iliIiiliiiii[112];
        objectArray[28] = iliIiiliiiii[113];
        objectArray[22] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[22] | (Integer)objectArray[28]) & ~((Integer)objectArray[22] & (Integer)objectArray[28]);
        objectArray[28] = iliIiiliiiii[114];
        objectArray[22] = (int)((Integer)objectArray[13]);
        objectArray[13] = (Integer)objectArray[22] + ~((Integer)objectArray[28]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[13]).intValue()];
        objectArray[14] = iliIiiliiiii[115];
        objectArray[28] = iliIiiliiiii[116];
        objectArray[22] = (int)((Integer)objectArray[14]);
        objectArray[14] = (Integer)objectArray[22] & ~((Integer)objectArray[28]).intValue() | ~((Integer)objectArray[22]).intValue() & (Integer)objectArray[28];
        objectArray[28] = iliIiiliiiii[117];
        objectArray[22] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[22] ^ (Integer)objectArray[28]) - 2 * (~((Integer)objectArray[22]).intValue() & (Integer)objectArray[28]);
        objectArray2[((Integer)objectArray[14]).intValue()] = textDisplay;
        objectArray[18] = iliIiiliiiii[118];
        objectArray[28] = iliIiiliiiii[119];
        objectArray[22] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[22] | (Integer)objectArray[28]) & ~((Integer)objectArray[22] & (Integer)objectArray[28]);
        objectArray[28] = iliIiiliiiii[120];
        objectArray[22] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[22] | (Integer)objectArray[28]) - ((Integer)objectArray[22] & (Integer)objectArray[28]);
        objectArray2[((Integer)objectArray[18]).intValue()] = itemMeta;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("f5409e3b-0148-45ce-92a4-125aca624305", (long)6789442236352452168L, (Object[])objectArray2, (int)iliIiiliiiii[121], (int)iliIiiliiiii[122], (String)"OXlIamdP", (String)"Zm4lIDJ4YmA5fXI+PSVkOTNnanx4ITclYmV/KTVlamclHCtqcm55CCZ/ag==", (int)iliIiiliiiii[123], (int)iliIiiliiiii[124], (String)"I0FQAC1qfWokICZlbCRELi1uaH8wZQthan1qYytqZWwkAyVhbmh/dw==", (int)iliIiiliiiii[125], (String)"R354JSw5Oj4+emlCQkJnIA5CZ2JCBSslQmdCICtnQmdiIA5nJUJiBStnYkJnJS5CZyVCBStnZ0JnIC5CZ2clBStiQmdnIC5nQmI=", (String)"eX5l");
        int n = (0x26BEAEB | 0x428213CE) - (0x26BEAEB & 0x428213CE);
        int cfr_ignored_0 = n + 1115821006;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n;
        int n2 = n = (0x1E946752 | 0x84F75B00) - (0x1E946752 & 0x84F75B00);
        IIIllIIliIIl = n2 + -2064164096 - (n2 & 0x84F75B00) * 2;
        if (1069077135 <= IIIllIIliIIl) {
            n = (0x13945A50 | 0x84F75B00) - (0x13945A50 & 0x84F75B00);
        }
        Object[] objectArray = new Object[25];
        int n3 = (0xB778656F | 0x42D7DF22) - (0xB778656F & 0x42D7DF22);
        int cfr_ignored_0 = n3 + 1121443618;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IiIIlliIIl();
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("49b7b61d-296f-4928-924d-3827df46dbc8", IliIlllilIi.class, (int)iliIiiliiiii[189], (int)iliIiiliiiii[190], (String)"dGJia1NR", (String)"f3c8ICthe3kgfWsnJDx9OSp+c2VhIS48e3xmKSx8c348HDJza3dgCD9mcw==", (int)iliIiiliiiii[191], (int)iliIiiliiiii[192], (String)"Ol54LShzPX5zIjk9UX5zPy0pO0Q=", (int)iliIiiliiiii[193], (String)"XmdhJTUgIycnenBbW1t+IBdbfntbBTI8W35bIDJ+W357IBd+PFt7BTJ+e1t+JTdbfjxbBTJ+flt+IDdbfn48BTJ7W35+IDd+W3s=", (String)"fn1zKAh/");
        objectArray[16] = iliIiiliiiii[194];
        objectArray[22] = iliIiiliiiii[195];
        objectArray[21] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[21] & ~((Integer)objectArray[22]).intValue()) - (~((Integer)objectArray[21]).intValue() & (Integer)objectArray[22]);
        objectArray[22] = iliIiiliiiii[196];
        objectArray[21] = (int)((Integer)objectArray[16]);
        objectArray[16] = 2 * ((Integer)objectArray[21] & ~((Integer)objectArray[22]).intValue()) - ((Integer)objectArray[21] ^ (Integer)objectArray[22]);
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("5f9a1edf-9c70-4a42-9157-fc3eb3ef691c", (long)3164513388623809672L, (Object[])new Object[((Integer)objectArray[16]).intValue()], (int)iliIiiliiiii[197], (int)iliIiiliiiii[198], (String)"QllxUmc0", (String)"fnY9ICpgenghfWomJT18OSt/cmRgIS89en1nKS19cn89HDNyanZhCD5ncg==", (int)iliIiiliiiii[199], (int)iliIiiliiiii[200], (String)"O1lIADVyZXI8ID59dDxcLjV2cGcoZRN5cmVyYzNyfXQ8Az15dnBndw==", (int)iliIiiliiiii[201], (String)"X2ZgJTQhIiYmenFaWlp/IBZaf3paBTM9Wn9aIDN/Wn96IBZ/PVp6BTN/elp/JTZafz1aBTN/f1p/IDZaf389BTN6Wn9/IDZ/Wno=", (String)"YWZ9");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIiiIiIlilli(Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi iliIlllilIi, Location location, int n, String string) {
        if (IlIlllIlilIl) {
            int cfr_ignored_0 = 32 + 92;
        }
        Object[] objectArray = new Object[34];
        objectArray[22] = iliIiiliiiii[76];
        objectArray[10] = iliIiiliiiii[77];
        objectArray[3] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[3] | (Integer)objectArray[10]) + ((Integer)objectArray[3] & (Integer)objectArray[10]);
        objectArray[10] = iliIiiliiiii[78];
        objectArray[3] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[3] | (Integer)objectArray[10]) & ~((Integer)objectArray[3] & (Integer)objectArray[10]);
        Object[] objectArray2 = new Object[((Integer)objectArray[22]).intValue()];
        objectArray[21] = iliIiiliiiii[79];
        objectArray[10] = iliIiiliiiii[80];
        objectArray[3] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[3] | (Integer)objectArray[10]) - ((Integer)objectArray[3] & (Integer)objectArray[10]);
        objectArray[10] = iliIiiliiiii[81];
        objectArray[3] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[3] | (Integer)objectArray[10]) & (~((Integer)objectArray[3]).intValue() | ~((Integer)objectArray[10]).intValue());
        objectArray2[((Integer)objectArray[21]).intValue()] = iliIlllilIi;
        objectArray[17] = iliIiiliiiii[82];
        objectArray[10] = iliIiiliiiii[83];
        objectArray[3] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[3] ^ (Integer)objectArray[10]) - 2 * (~((Integer)objectArray[3]).intValue() & (Integer)objectArray[10]);
        objectArray[10] = iliIiiliiiii[84];
        objectArray[3] = (int)((Integer)objectArray[17]);
        objectArray[17] = 2 * ((Integer)objectArray[3] | (Integer)objectArray[10]) - ((Integer)objectArray[3] ^ (Integer)objectArray[10]);
        objectArray2[((Integer)objectArray[17]).intValue()] = location;
        objectArray[23] = iliIiiliiiii[85];
        objectArray[10] = iliIiiliiiii[86];
        objectArray[3] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[3] | (Integer)objectArray[10]) - ((Integer)objectArray[3] & (Integer)objectArray[10]);
        objectArray[10] = iliIiiliiiii[87];
        objectArray[3] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[3] + ~((Integer)objectArray[10]).intValue() + 1;
        objectArray2[((Integer)objectArray[23]).intValue()] = Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("5e538bf3-0133-458e-80ed-4ae707553e46", (int)n, (int)iliIiiliiiii[88], (int)iliIiiliiiii[89], (String)"cGVQR3Vn", (String)"Yml+LWpkaWZvYg1mfG1vKTY=", (int)iliIiiliiiii[90], (int)iliIiiliiiii[91], (String)"IEEhAC5pfmknICVmbydBIjBtb216dw==", (int)iliIiiliiiii[92], (String)"RH17JS86OT09empBQUFkIA1BZGFBBSgmQWRBIChkQWRhIA1kJkFhBShkYUFkJS1BZCZBBShkZEFkIC1BZGQmBShhQWRkIC1kQWE=", (String)"fmlkOSFHbg==");
        objectArray[27] = iliIiiliiiii[93];
        objectArray[10] = iliIiiliiiii[94];
        objectArray[3] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[3] | (Integer)objectArray[10]) & ~((Integer)objectArray[3] & (Integer)objectArray[10]);
        objectArray[10] = iliIiiliiiii[95];
        objectArray[3] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[3] ^ (Integer)objectArray[10]) + 2 * ((Integer)objectArray[3] & (Integer)objectArray[10]);
        objectArray2[((Integer)objectArray[27]).intValue()] = string;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("27142bfb-6e5f-4ac0-a146-7a004a07a039", (long)7492621187138953704L, (Object[])objectArray2, (int)iliIiiliiiii[96], (int)iliIiiliiiii[97], (String)"SzlySDdX", (String)"ZGwnIDB6YGI7fXA8PydmOTFlaH56ITUnYGd9KTdnaGUnHClocGx7CCR9aA==", (int)iliIiiliiiii[98], (int)iliIiiliiiii[99], (String)"IUNSAC9of2gmICRnbiZGLi9san0yZQljaH9oYyloZ24mAydjbGp9dw==", (int)iliIiiliiiii[100], (String)"RXx6JS47ODw8emtAQEBlIAxAZWBABSknQGVAICllQGVgIAxlJ0BgBSllYEBlJSxAZSdABSllZUBlICxAZWUnBSlgQGVlICxlQGA=", (String)"e3xn");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void IiIlliIliiIl(String string, int n, ItemMeta itemMeta) {
        int n2;
        int n3 = n2 = (0x163AD9FE | 0x6332298) - (0x163AD9FE & 0x6332298);
        IIIllIIliIIl = n3 + 104014488 - (n3 & 0x6332298) * 2;
        if (460073651 <= IIIllIIliIIl) {
            int n4 = n2 = (0x24 | 0x6332298) - (0x24 & 0x6332298);
            int cfr_ignored_0 = n4 + 104014488 - (n4 & 0x6332298) * 2;
        }
        Object[] objectArray = new Object[30];
        objectArray[10] = iliIiiliiiii[145];
        objectArray[5] = iliIiiliiiii[146];
        objectArray[4] = (int)((Integer)objectArray[10]);
        objectArray[10] = (Integer)objectArray[4] - ~((Integer)objectArray[5]).intValue() - 1;
        objectArray[5] = iliIiiliiiii[147];
        objectArray[4] = (int)((Integer)objectArray[10]);
        objectArray[10] = (Integer)objectArray[4] - ~((Integer)objectArray[5]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[10]).intValue()];
        objectArray[9] = iliIiiliiiii[148];
        objectArray[5] = iliIiiliiiii[149];
        objectArray[4] = (int)((Integer)objectArray[9]);
        objectArray[9] = 2 * ((Integer)objectArray[4] & ~((Integer)objectArray[5]).intValue()) - ((Integer)objectArray[4] ^ (Integer)objectArray[5]);
        objectArray[5] = iliIiiliiiii[150];
        objectArray[4] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[4] ^ (Integer)objectArray[5]) + 2 * ((Integer)objectArray[4] & (Integer)objectArray[5]);
        objectArray2[((Integer)objectArray[9]).intValue()] = string;
        objectArray[17] = iliIiiliiiii[151];
        objectArray[5] = iliIiiliiiii[152];
        objectArray[4] = (int)((Integer)objectArray[17]);
        objectArray[17] = 2 * ((Integer)objectArray[4] & ~((Integer)objectArray[5]).intValue()) - ((Integer)objectArray[4] ^ (Integer)objectArray[5]);
        objectArray[5] = iliIiiliiiii[153];
        objectArray[4] = (int)((Integer)objectArray[17]);
        objectArray[17] = (Integer)objectArray[4] - ~((Integer)objectArray[5]).intValue() - 1;
        objectArray2[((Integer)objectArray[17]).intValue()] = Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("9beb3c4f-79c7-444b-83e0-6e493ab5538f", (int)n, (int)iliIiiliiiii[154], (int)iliIiiliiiii[155], (String)"dDBhUnNE", (String)"ZG94LWxib2BpYgtgemtpKTA=", (int)iliIiiliiiii[156], (int)iliIiiliiiii[157], (String)"JkcnAChveG8hICNgaSFHIjZraWt8dw==", (int)iliIiiliiiii[158], (String)"Qnt9JSk8Pzs7emxHR0diIAtHYmdHBS4gR2JHIC5iR2JnIAtiIEdnBS5iZ0diJStHYiBHBS5iYkdiICtHYmIgBS5nR2JiICtiR2c=", (String)"eG9iOSdBaA==");
        objectArray[29] = iliIiiliiiii[159];
        objectArray[5] = iliIiiliiiii[160];
        objectArray[4] = (int)((Integer)objectArray[29]);
        objectArray[29] = 2 * ((Integer)objectArray[4] & ~((Integer)objectArray[5]).intValue()) - ((Integer)objectArray[4] ^ (Integer)objectArray[5]);
        objectArray[5] = iliIiiliiiii[161];
        objectArray[4] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[4] ^ (Integer)objectArray[5]) - 2 * (~((Integer)objectArray[4]).intValue() & (Integer)objectArray[5]);
        objectArray2[((Integer)objectArray[29]).intValue()] = itemMeta;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("9a9c9a79-42d9-4d49-986c-157c0cf6be24", (long)5674509870501756714L, (Object[])objectArray2, (int)iliIiiliiiii[162], (int)iliIiiliiiii[163], (String)"akw0cEEx", (String)"YmohIDZ8ZmQ9fXY6OSFgOTdjbnh8ITMhZmF7KTFhbmMhHC9udmp9CCJ7bg==", (int)iliIiiliiiii[164], (int)iliIiiliiiii[165], (String)"J0VUAClueW4gICJhaCBALilqbHs0ZQ9lbnluYy9uYWggAyFlamx7dw==", (int)iliIiiliiiii[166], (String)"Q3p8JSg9Pjo6em1GRkZjIApGY2ZGBS8hRmNGIC9jRmNmIApjIUZmBS9jZkZjJSpGYyFGBS9jY0ZjICpGY2MhBS9mRmNjICpjRmY=", (String)"fXph");
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle iIIIlIlIIl(int var0, int var1_1, String var2_2, String var3_3, int var4_4, int var5_5, String var6_6, int var7_7, String var8_8, String var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [17[CASE]], but top level block is 1[TRYBLOCK]
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
    public static void IiIIlliIIl() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [56[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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
    public static boolean liiiIIllIl(ItemStack itemStack) {
        if (IlIlllIlilIl) {
            int n;
            int n2 = n = (9 | 0xE2A43807) - (9 & 0xE2A43807);
            int cfr_ignored_0 = n2 + -492554233 - (n2 & 0xE2A43807) * 2;
        }
        Object[] objectArray = new Object[26];
        objectArray[14] = iliIiiliiiii[22];
        objectArray[12] = iliIiiliiiii[23];
        objectArray[6] = (int)((Integer)objectArray[14]);
        objectArray[14] = (Integer)objectArray[6] + ~((Integer)objectArray[12]).intValue() + 1;
        objectArray[12] = iliIiiliiiii[24];
        objectArray[6] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[6] | (Integer)objectArray[12]) + ((Integer)objectArray[6] & (Integer)objectArray[12]);
        Object[] objectArray2 = new Object[((Integer)objectArray[14]).intValue()];
        objectArray[0] = iliIiiliiiii[25];
        objectArray[12] = iliIiiliiiii[26];
        objectArray[6] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[6] ^ (Integer)objectArray[12]) + 2 * ((Integer)objectArray[6] & (Integer)objectArray[12]);
        objectArray[12] = iliIiiliiiii[27];
        objectArray[6] = (int)((Integer)objectArray[0]);
        objectArray[0] = ((Integer)objectArray[6] ^ (Integer)objectArray[12]) + 2 * ((Integer)objectArray[6] & (Integer)objectArray[12]);
        objectArray2[((Integer)objectArray[0]).intValue()] = itemStack;
        return (boolean)Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("b4432133-93c3-428b-b9af-0df5f5eca783", (Object)Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("3a7b3d53-b914-4951-a0df-4d6c7f9f811d", (long)-6151375229109953797L, (Object[])objectArray2, (int)iliIiiliiiii[28], (int)iliIiiliiiii[29], (String)"Vmc5cmNT", (String)"b2csIDtxa2kwfXs3NCxtOTpuY3VxIT4sa2x2KTxsY24sHCJje2dwCC92Yw==", (int)iliIiiliiiii[30], (int)iliIiiliiiii[31], (String)"KkhZACRjdGMtIC9sZS1NLiRnYXY5ZQJoY3RjYyJjbGUtAyxoZ2F2dw==", (int)iliIiiliiiii[32], (String)"TndxJSUwMzc3emBLS0tuIAdLbmtLBSIsS25LICJuS25rIAduLEtrBSJua0tuJSdLbixLBSJubktuICdLbm4sBSJrS25uICduS2s=", (String)"cHds"), (int)iliIiiliiiii[33], (int)iliIiiliiiii[34], (String)"bEQ4YVd0", (String)"bmYtIDpwamgxfXo2NS1sOTtvYnRwIT8tam13KT1tYm8tHCNiemZxCC53Yg==", (int)iliIiiliiiii[35], (int)iliIiiliiiii[36], (String)"K09pLTliLG9iIigsTGFpKSx3OCpK", (int)iliIiiliiiii[37], (String)"T3ZwJSQxMjY2emFKSkpvIAZKb2pKBSMtSm9KICNvSm9qIAZvLUpqBSNvakpvJSZKby1KBSNvb0pvICZKb28tBSNqSm9vICZvSmo=", (String)"d2xKIjs=");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ItemStack IilliliilIIi(int n, String string) {
        Object[] objectArray = new Object[30];
        int n2 = (0x4B98BA3D | 0xB99146C3) - (0x4B98BA3D & 0xB99146C3);
        int cfr_ignored_0 = n2 + -1181661501;
        objectArray[5] = iliIiiliiiii[57];
        objectArray[20] = iliIiiliiiii[58];
        objectArray[17] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[17] ^ (Integer)objectArray[20]) + 2 * ((Integer)objectArray[17] & (Integer)objectArray[20]);
        objectArray[20] = iliIiiliiiii[59];
        objectArray[17] = (int)((Integer)objectArray[5]);
        objectArray[5] = (Integer)objectArray[17] + ~((Integer)objectArray[20]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[5]).intValue()];
        objectArray[24] = iliIiiliiiii[60];
        objectArray[20] = iliIiiliiiii[61];
        objectArray[17] = (int)((Integer)objectArray[24]);
        objectArray[24] = 2 * ((Integer)objectArray[17] | (Integer)objectArray[20]) - ((Integer)objectArray[17] ^ (Integer)objectArray[20]);
        objectArray[20] = iliIiiliiiii[62];
        objectArray[17] = (int)((Integer)objectArray[24]);
        objectArray[24] = 2 * ((Integer)objectArray[17] & ~((Integer)objectArray[20]).intValue()) - ((Integer)objectArray[17] ^ (Integer)objectArray[20]);
        objectArray2[((Integer)objectArray[24]).intValue()] = Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("8009f03e-4f8d-4a27-85b2-1e0d2140849b", (int)n, (int)iliIiiliiiii[63], (int)iliIiiliiiii[64], (String)"cXU2Y29i", (String)"bGdwLWRqZ2hhYgNocmNhKTg=", (int)iliIiiliiiii[65], (int)iliIiiliiiii[66], (String)"Lk8vACBncGcpICtoYSlPIj5jYWN0dw==", (int)iliIiiliiiii[67], (String)"SnN1JSE0NzMzemRPT09qIANPam9PBSYoT2pPICZqT2pvIANqKE9vBSZqb09qJSNPaihPBSZqak9qICNPamooBSZvT2pqICNqT28=", (String)"cGdqOS9JYA==");
        objectArray[27] = iliIiiliiiii[68];
        objectArray[20] = iliIiiliiiii[69];
        objectArray[17] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[17] ^ (Integer)objectArray[20]) + 2 * ((Integer)objectArray[17] & (Integer)objectArray[20]);
        objectArray[20] = iliIiiliiiii[70];
        objectArray[17] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[17] | (Integer)objectArray[20]) & (~((Integer)objectArray[17]).intValue() | ~((Integer)objectArray[20]).intValue());
        objectArray2[((Integer)objectArray[27]).intValue()] = string;
        return (ItemStack)Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("0d07ada2-01cb-4a73-b986-eccd8d30814e", (long)348215997841658075L, (Object[])objectArray2, (int)iliIiiliiiii[71], (int)iliIiiliiiii[72], (String)"S2N1c3Ri", (String)"amIpID50bmw1fX4yMSloOT9rZnB0ITspbmlzKTlpZmspHCdmfmJ1CCpzZg==", (int)iliIiiliiiii[73], (int)iliIiiliiiii[74], (String)"L01cACFmcWYoICppYChILiFiZHM8ZQdtZnFmYydmaWAoAyltYmRzdw==", (int)iliIiiliiiii[75], (String)"S3J0JSA1NjIyemVOTk5rIAJOa25OBScpTmtOICdrTmtuIAJrKU5uBSdrbk5rJSJOaylOBSdra05rICJOa2spBSduTmtrICJrTm4=", (String)"dXJp");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void IIlllIlliIll(String string, int n, ItemMeta itemMeta) {
        if (IlIlllIlilIl) {
            int n2;
            int n3 = n2 = (0x1A5C208E | 0xF50E1935) - (0x1A5C208E & 0xF50E1935);
            IIIllIIliIIl = n3 + -183625419 - (n3 & 0xF50E1935) * 2;
        }
        Object[] objectArray = new Object[30];
        objectArray[21] = iliIiiliiiii[167];
        objectArray[8] = iliIiiliiiii[168];
        objectArray[1] = (int)((Integer)objectArray[21]);
        objectArray[21] = (Integer)objectArray[1] + ~((Integer)objectArray[8]).intValue() + 1;
        objectArray[8] = iliIiiliiiii[169];
        objectArray[1] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[1] ^ (Integer)objectArray[8]) - 2 * (~((Integer)objectArray[1]).intValue() & (Integer)objectArray[8]);
        Object[] objectArray2 = new Object[((Integer)objectArray[21]).intValue()];
        objectArray[16] = iliIiiliiiii[170];
        objectArray[8] = iliIiiliiiii[171];
        objectArray[1] = (int)((Integer)objectArray[16]);
        objectArray[16] = 2 * ((Integer)objectArray[1] | (Integer)objectArray[8]) - ((Integer)objectArray[1] ^ (Integer)objectArray[8]);
        objectArray[8] = iliIiiliiiii[172];
        objectArray[1] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[1] - ~((Integer)objectArray[8]).intValue() - 1;
        objectArray2[((Integer)objectArray[16]).intValue()] = string;
        objectArray[23] = iliIiiliiiii[173];
        objectArray[8] = iliIiiliiiii[174];
        objectArray[1] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[1] | (Integer)objectArray[8]) & (~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[8]).intValue());
        objectArray[8] = iliIiiliiiii[175];
        objectArray[1] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[1] ^ (Integer)objectArray[8]) - 2 * (~((Integer)objectArray[1]).intValue() & (Integer)objectArray[8]);
        objectArray2[((Integer)objectArray[23]).intValue()] = Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("6741e079-38d1-4d3f-a604-4fcf7aa20058", (int)n, (int)iliIiiliiiii[176], (int)iliIiiliiiii[177], (String)"a0VKQzVC", (String)"enFmLXJ8cX53YhV+ZHV3KS4=", (int)iliIiiliiiii[178], (int)iliIiiliiiii[179], (String)"OFk5ADZxZnE/ID1+dz9ZIih1d3Vidw==", (int)iliIiiliiiii[180], (String)"XGVjJTciISUlenJZWVl8IBVZfHlZBTA+WXxZIDB8WXx5IBV8Pll5BTB8eVl8JTVZfD5ZBTB8fFl8IDVZfHw+BTB5WXx8IDV8WXk=", (String)"ZnF8OTlfdg==");
        objectArray[24] = iliIiiliiiii[181];
        objectArray[8] = iliIiiliiiii[182];
        objectArray[1] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[1] | (Integer)objectArray[8]) & ~((Integer)objectArray[1] & (Integer)objectArray[8]);
        objectArray[8] = iliIiiliiiii[183];
        objectArray[1] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[1] | (Integer)objectArray[8]) & (~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[8]).intValue());
        objectArray2[((Integer)objectArray[24]).intValue()] = itemMeta;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("751176b2-cca7-4ee6-aed7-ddd07b64f5af", (long)-4338566220254192607L, (Object[])objectArray2, (int)iliIiiliiiii[184], (int)iliIiiliiiii[185], (String)"NmN4ZUdU", (String)"fHQ/IChieHojfWgkJz9+OSl9cGZiIS0/eH9lKS9/cH0/HDFwaHRjCDxlcA==", (int)iliIiiliiiii[186], (int)iliIiiliiiii[187], (String)"OVtKADdwZ3A+IDx/dj5eLjd0cmUqZRF7cGdwYzFwf3Y+Az97dHJldw==", (int)iliIiiliiiii[188], (String)"XWRiJTYjICQkenNYWFh9IBRYfXhYBTE/WH1YIDF9WH14IBR9P1h4BTF9eFh9JTRYfT9YBTF9fVh9IDRYfX0/BTF4WH19IDR9WHg=", (String)"Y2R/");
    }

    /*
     * Exception decompiling
     */
    public static Class Iliilliiilii(String var0) {
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
    private static String llIIlilIIl(String var0, int var1_1, int var2_2) {
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
    public static void iliIiiliiiii(Item item) {
        int n;
        int n2 = n = (0x152FB09F | 0x83503596) - (0x152FB09F & 0x83503596);
        if (289848026 >= n2 + -2091895402 - (n2 & 0x83503596) * 2) {
            int cfr_ignored_0 = 0x62 & 1;
        }
        Object[] objectArray = new Object[30];
        objectArray[15] = iliIiiliiiii[101];
        objectArray[4] = iliIiiliiiii[102];
        objectArray[5] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[5] ^ (Integer)objectArray[4]) - 2 * (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[4]);
        objectArray[4] = iliIiiliiiii[103];
        objectArray[5] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[5] | (Integer)objectArray[4]) & ~((Integer)objectArray[5] & (Integer)objectArray[4]);
        Object[] objectArray2 = new Object[((Integer)objectArray[15]).intValue()];
        objectArray[26] = iliIiiliiiii[104];
        objectArray[4] = iliIiiliiiii[105];
        objectArray[5] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[5] ^ (Integer)objectArray[4]) + 2 * ((Integer)objectArray[5] & (Integer)objectArray[4]);
        objectArray[4] = iliIiiliiiii[106];
        objectArray[5] = (int)((Integer)objectArray[26]);
        objectArray[26] = ((Integer)objectArray[5] | (Integer)objectArray[4]) + ((Integer)objectArray[5] & (Integer)objectArray[4]);
        objectArray2[((Integer)objectArray[26]).intValue()] = item;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("6970d213-bac7-4e64-93e7-d7ec29dd3425", (long)1617080854764054879L, (Object[])objectArray2, (int)iliIiiliiiii[107], (int)iliIiiliiiii[108], (String)"NXhoNGtS", (String)"Z28kIDN5Y2E4fXM/PCRlOTJma315ITYkY2R+KTRka2YkHCprc294CCd+aw==", (int)iliIiiliiiii[109], (int)iliIiiliiiii[110], (String)"IkBRACxrfGslICdkbSVFLixvaX4xZQpga3xrYyprZG0lAyRgb2l+dw==", (int)iliIiiliiiii[111], (String)"Rn95JS04Oz8/emhDQ0NmIA9DZmNDBSokQ2ZDICpmQ2ZjIA9mJENjBSpmY0NmJS9DZiRDBSpmZkNmIC9DZmYkBSpjQ2ZmIC9mQ2M=", (String)"eH9k");
    }

    /*
     * Enabled aggressive block sorting
     */
    private IliIlllilIi() {
        if (IlIlllIlilIl) {
            int cfr_ignored_0 = 0x62 & 1;
        }
        Object[] objectArray = new Object[28];
        int n = (0x46B907C0 | 0xBBF26F04) - (0x46B907C0 & 0xBBF26F04);
        int cfr_ignored_1 = n + -1141739772;
        objectArray[24] = iliIiiliiiii[0];
        objectArray[10] = iliIiiliiiii[1];
        objectArray[5] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[5] | (Integer)objectArray[10]) & (~((Integer)objectArray[5]).intValue() | ~((Integer)objectArray[10]).intValue());
        objectArray[10] = iliIiiliiiii[2];
        objectArray[5] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[5] | (Integer)objectArray[10]) + ((Integer)objectArray[5] & (Integer)objectArray[10]);
        Object[] objectArray2 = new Object[((Integer)objectArray[24]).intValue()];
        objectArray[11] = iliIiiliiiii[3];
        objectArray[10] = iliIiiliiiii[4];
        objectArray[5] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[5] ^ (Integer)objectArray[10]) + 2 * ((Integer)objectArray[5] & (Integer)objectArray[10]);
        objectArray[10] = iliIiiliiiii[5];
        objectArray[5] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[5] | (Integer)objectArray[10]) & (~((Integer)objectArray[5]).intValue() | ~((Integer)objectArray[10]).intValue());
        objectArray2[((Integer)objectArray[11]).intValue()] = this;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("cbe53f26-3521-4799-af01-cccdfc300f08", (long)-374363686151884511L, (Object[])objectArray2, (int)iliIiiliiiii[6], (int)iliIiiliiiii[7], (String)"Y2s3STZI", (String)"bWUuIDlzaWsyfXk1Ni5vOThsYXdzITwuaW50KT5uYWwuHCBheWVyCC10YQ==", (int)iliIiiliiiii[8], (int)iliIiiliiiii[9], (String)"KEpbACZhdmEvIC1uZy9PLiZlY3Q7ZQBqYXZhYyBhbmcvAy5qZWN0dw==", (int)iliIiiliiiii[10], (String)"THVzJScyMTU1emJJSUlsIAVJbGlJBSAuSWxJICBsSWxpIAVsLklpBSBsaUlsJSVJbC5JBSBsbElsICVJbGwuBSBpSWxsICVsSWk=", (String)"cnVu");
        int n2 = (0x59BF9E7F | 0xCA1A2BA) - (0x59BF9E7F & 0xCA1A2BA);
        int cfr_ignored_2 = n2 + 211919546;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void IlIlllIlilIl(int n, TextDisplay textDisplay) {
        int n2;
        int n3 = n2 = (0x3EC1A3D | 0xDD470C98) - (0x3EC1A3D & 0xDD470C98);
        IIIllIIliIIl = n3 + -582546280 - (n3 & 0xDD470C98) * 2;
        if (168707654 <= IIIllIIliIIl) {
            throw null;
        }
        Object[] objectArray = new Object[28];
        objectArray[23] = iliIiiliiiii[126];
        objectArray[17] = iliIiiliiiii[127];
        objectArray[2] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[2] & ~((Integer)objectArray[17]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[17];
        objectArray[17] = iliIiiliiiii[128];
        objectArray[2] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[2] & ~((Integer)objectArray[17]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[17];
        Object[] objectArray2 = new Object[((Integer)objectArray[23]).intValue()];
        objectArray[11] = iliIiiliiiii[129];
        objectArray[17] = iliIiiliiiii[130];
        objectArray[2] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[2] | (Integer)objectArray[17]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[17]).intValue());
        objectArray[17] = iliIiiliiiii[131];
        objectArray[2] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[2] | (Integer)objectArray[17]) - ((Integer)objectArray[2] & (Integer)objectArray[17]);
        objectArray2[((Integer)objectArray[11]).intValue()] = Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("0130d173-3fcf-4293-8f44-4e58900d7077", (int)n, (int)iliIiiliiiii[132], (int)iliIiiliiiii[133], (String)"d2dkRHhR", (String)"Zm16LW5gbWJrYglieGlrKTI=", (int)iliIiiliiiii[134], (int)iliIiiliiiii[135], (String)"JEUlACptem0jICFiayNFIjRpa2l+dw==", (int)iliIiiliiiii[136], (String)"QHl/JSs+PTk5em5FRUVgIAlFYGVFBSwiRWBFICxgRWBlIAlgIkVlBSxgZUVgJSlFYCJFBSxgYEVgIClFYGAiBSxlRWBgIClgRWU=", (String)"em1gOSVDag==");
        objectArray[25] = iliIiiliiiii[137];
        objectArray[17] = iliIiiliiiii[138];
        objectArray[2] = (int)((Integer)objectArray[25]);
        objectArray[25] = (Integer)objectArray[2] + ~((Integer)objectArray[17]).intValue() + 1;
        objectArray[17] = iliIiiliiiii[139];
        objectArray[2] = (int)((Integer)objectArray[25]);
        objectArray[25] = (Integer)objectArray[2] + ~((Integer)objectArray[17]).intValue() + 1;
        objectArray2[((Integer)objectArray[25]).intValue()] = textDisplay;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("f38d276e-6ef2-41e1-baef-0bb782c93c8c", (long)3833192035549099201L, (Object[])objectArray2, (int)iliIiiliiiii[140], (int)iliIiiliiiii[141], (String)"clIydmRa", (String)"YGgjIDR+ZGY/fXQ4OyNiOTVhbHp+ITEjZGN5KTNjbGEjHC1sdGh/CCB5bA==", (int)iliIiiliiiii[142], (int)iliIiiliiiii[143], (String)"JUdWACtse2wiICBjaiJCLitobnk2ZQ1nbHtsYy1sY2oiAyNnaG55dw==", (int)iliIiiliiiii[144], (String)"QXh+JSo/PDg4em9ERERhIAhEYWREBS0jRGFEIC1hRGFkIAhhI0RkBS1hZERhJShEYSNEBS1hYURhIChEYWEjBS1kRGFhIChhRGQ=", (String)"f3hj");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IliIlllilIi(Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi iliIlllilIi) {
        Object[] objectArray = new Object[27];
        int n = (0x74A51A6A | 0xA12283FE) - (0x74A51A6A & 0xA12283FE);
        int cfr_ignored_0 = n + -1591573506;
        objectArray[6] = iliIiiliiiii[11];
        objectArray[12] = iliIiiliiiii[12];
        objectArray[14] = (int)((Integer)objectArray[6]);
        objectArray[6] = (Integer)objectArray[14] - ~((Integer)objectArray[12]).intValue() - 1;
        objectArray[12] = iliIiiliiiii[13];
        objectArray[14] = (int)((Integer)objectArray[6]);
        objectArray[6] = ((Integer)objectArray[14] | (Integer)objectArray[12]) & ~((Integer)objectArray[14] & (Integer)objectArray[12]);
        Object[] objectArray2 = new Object[((Integer)objectArray[6]).intValue()];
        objectArray[15] = iliIiiliiiii[14];
        objectArray[12] = iliIiiliiiii[15];
        objectArray[14] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[14] | (Integer)objectArray[12]) + ((Integer)objectArray[14] & (Integer)objectArray[12]);
        objectArray[12] = iliIiiliiiii[16];
        objectArray[14] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[14] | (Integer)objectArray[12]) & ~((Integer)objectArray[14] & (Integer)objectArray[12]);
        objectArray2[((Integer)objectArray[15]).intValue()] = iliIlllilIi;
        Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("b286b4b5-54f4-48c3-82f9-564498b01211", (long)6748252725959170970L, (Object[])objectArray2, (int)iliIiiliiiii[17], (int)iliIiiliiiii[18], (String)"OU5kWU5W", (String)"bGQvIDhyaGozfXg0Ny9uOTltYHZyIT0vaG91KT9vYG0vHCFgeGRzCCx1YA==", (int)iliIiiliiiii[19], (int)iliIiiliiiii[20], (String)"KUtaACdgd2AuICxvZi5OLidkYnU6ZQFrYHdgYyFgb2YuAy9rZGJ1dw==", (int)iliIiiliiiii[21], (String)"TXRyJSYzMDQ0emNISEhtIARIbWhIBSEvSG1IICFtSG1oIARtL0hoBSFtaEhtJSRIbS9IBSFtbUhtICRIbW0vBSFoSG1tICRtSGg=", (String)"c3Rv");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ItemStack iIlIlllllill(int n, String string) {
        if (IlIlllIlilIl) {
            throw new IllegalMonitorStateException();
        }
        Object[] objectArray = new Object[30];
        int n2 = (0x3BFC125C | 0x824A4ED5) - (0x3BFC125C & 0x824A4ED5);
        int cfr_ignored_0 = n2 + -2109059371;
        objectArray[16] = iliIiiliiiii[38];
        objectArray[23] = iliIiiliiiii[39];
        objectArray[26] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[26] | (Integer)objectArray[23]) & ~((Integer)objectArray[26] & (Integer)objectArray[23]);
        objectArray[23] = iliIiiliiiii[40];
        objectArray[26] = (int)((Integer)objectArray[16]);
        objectArray[16] = (Integer)objectArray[26] - ~((Integer)objectArray[23]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[16]).intValue()];
        objectArray[7] = iliIiiliiiii[41];
        objectArray[23] = iliIiiliiiii[42];
        objectArray[26] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[26] & ~((Integer)objectArray[23]).intValue()) - (~((Integer)objectArray[26]).intValue() & (Integer)objectArray[23]);
        objectArray[23] = iliIiiliiiii[43];
        objectArray[26] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[26] | (Integer)objectArray[23]) - ((Integer)objectArray[26] & (Integer)objectArray[23]);
        objectArray2[((Integer)objectArray[7]).intValue()] = Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("5164db8b-e6c5-4011-9916-011fd32ce620", (int)n, (int)iliIiiliiiii[44], (int)iliIiiliiiii[45], (String)"SWZBWnFJ", (String)"bmVyLWZoZWpjYgFqcGFjKTo=", (int)iliIiiliiiii[46], (int)iliIiiliiiii[47], (String)"LE0tACJlcmUrIClqYytNIjxhY2F2dw==", (int)iliIiiliiiii[48], (String)"SHF3JSM2NTExemZNTU1oIAFNaG1NBSQqTWhNICRoTWhtIAFoKk1tBSRobU1oJSFNaCpNBSRoaE1oICFNaGgqBSRtTWhoICFoTW0=", (String)"cmVoOS1LYg==");
        objectArray[10] = iliIiiliiiii[49];
        objectArray[23] = iliIiiliiiii[50];
        objectArray[26] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[26] | (Integer)objectArray[23]) & ~((Integer)objectArray[26] & (Integer)objectArray[23]);
        objectArray[23] = iliIiiliiiii[51];
        objectArray[26] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[26] ^ (Integer)objectArray[23]) + 2 * ((Integer)objectArray[26] & (Integer)objectArray[23]);
        objectArray2[((Integer)objectArray[10]).intValue()] = string;
        return (ItemStack)Lusik21556.IIIllIIliIIl.IlIlllIlilIl.IiIlliIliiIl.IIlllIlliIll.IliIlllilIi.IIIIllIIIl("eeb421d1-a20e-4329-bf7b-5f8c001e723f", (long)8038540142682636332L, (Object[])objectArray2, (int)iliIiiliiiii[52], (int)iliIiiliiiii[53], (String)"V1VsOVg2", (String)"aGArIDx2bG43fXwwMytqOT1pZHJ2ITkrbGtxKTtrZGkrHCVkfGB3CChxZA==", (int)iliIiiliiiii[54], (int)iliIiiliiiii[55], (String)"LU9eACNkc2QqIChrYipKLiNgZnE+ZQVvZHNkYyVka2IqAytvYGZxdw==", (int)iliIiiliiiii[56], (String)"SXB2JSI3NDAwemdMTExpIABMaWxMBSUrTGlMICVpTGlsIABpK0xsBSVpbExpJSBMaStMBSVpaUxpICBMaWkrBSVsTGlpICBpTGw=", (String)"d3Br");
    }
}


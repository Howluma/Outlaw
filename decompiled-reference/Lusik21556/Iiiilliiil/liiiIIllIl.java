/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.inventory.ItemStack
 */
package Lusik21556.Iiiilliiil;

import Lusik21556.Illlllllilll.Iilllilliill.IIillIiliIil.Ililllililil.Iiilliiliiil.IIIilIIiiIIi.IliIlllilIi;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bukkit.inventory.ItemStack;

public final class liiiIIllIl {
    static AtomicReferenceArray<MethodHandle> liiiIIllIl;
    public static int[] iIlIlllllill;
    public static int IilliliilIIi;
    public static boolean lIiiIiIlilli;

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IliIlllilIi(IliIlllilIi iliIlllilIi, String string) {
        if (lIiiIiIlilli) {
            int n;
            int n2 = n = (0x3C | 0x8B417641) - (0x3C & 0x8B417641);
            int cfr_ignored_0 = n2 + -1958644159 - (n2 & 0x8B417641) * 2;
        }
        Object[] objectArray = new Object[38];
        objectArray[19] = iIlIlllllill[11];
        objectArray[15] = iIlIlllllill[12];
        objectArray[2] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[2] | (Integer)objectArray[15]) + ((Integer)objectArray[2] & (Integer)objectArray[15]);
        objectArray[15] = iIlIlllllill[13];
        objectArray[2] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[2] ^ (Integer)objectArray[15]) - 2 * (~((Integer)objectArray[2]).intValue() & (Integer)objectArray[15]);
        Object[] objectArray2 = new Object[((Integer)objectArray[19]).intValue()];
        objectArray[23] = iIlIlllllill[14];
        objectArray[15] = iIlIlllllill[15];
        objectArray[2] = (int)((Integer)objectArray[23]);
        objectArray[23] = 2 * ((Integer)objectArray[2] | (Integer)objectArray[15]) - ((Integer)objectArray[2] ^ (Integer)objectArray[15]);
        objectArray[15] = iIlIlllllill[16];
        objectArray[2] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[2] | (Integer)objectArray[15]) - ((Integer)objectArray[2] & (Integer)objectArray[15]);
        objectArray2[((Integer)objectArray[23]).intValue()] = iliIlllilIi;
        objectArray[16] = iIlIlllllill[17];
        objectArray[15] = iIlIlllllill[18];
        objectArray[2] = (int)((Integer)objectArray[16]);
        objectArray[16] = ((Integer)objectArray[2] | (Integer)objectArray[15]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[15]).intValue());
        objectArray[15] = iIlIlllllill[19];
        objectArray[2] = (int)((Integer)objectArray[16]);
        objectArray[16] = 2 * ((Integer)objectArray[2] | (Integer)objectArray[15]) - ((Integer)objectArray[2] ^ (Integer)objectArray[15]);
        objectArray2[((Integer)objectArray[16]).intValue()] = string;
        return (boolean)Lusik21556.Iiiilliiil.liiiIIllIl.IlIlllIlilIl("f9c7af94-f88e-45d9-999f-afabaf8b49f1", (Object)Lusik21556.Iiiilliiil.liiiIIllIl.IlIlllIlilIl("33f74b92-a861-4d8a-b4a6-20e26d8a69c7", (long)681396274671264030L, (Object[])objectArray2, (int)iIlIlllllill[20], (String)"RSc4IQcOGw5EAQ4DDEQkDwcKEBlYRiEHDhsORAEOAwxEJA8HChAZWA==", (String)"HxoD", (String)"AgpDARogBghfXlpaW0MEGhkBDhwgAh1DBgMZCh8DDgFDPQEOFgofKQ4ZDg==", (int)iIlIlllllill[21], (String)"Q3FxQm9j", (int)iIlIlllllill[22], (int)iIlIlllllill[23], (String)"IRogBghfXlpaW0MmBgYGAQEGBgYBQwEGBgYmJgEBJgE=", (int)iIlIlllllill[24]), (int)iIlIlllllill[25], (String)"RiIIDxwPRQIPBA1FJRAICxEaWUcn", (String)"GgUnBBo=", (String)"AwtEAhshBwlgX1tbXEQFGxoCDx0hAx5EBwQaCyAEDwJEPgIPFwsgKg8aDw==", (int)iIlIlllllill[26], (String)"clpiTHVX", (int)iIlIlllllill[27], (int)iIlIlllllill[28], (String)"IhshBwlgX1tbXEQnBwcHAgIHBwcCRAIHBwcnJwICJwI=", (int)iIlIlllllill[29]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String IIlllIlliIll(String string, int n, int n2) {
        if (lIiiIiIlilli) {
            throw null;
        }
        Object[] objectArray = new Object[6];
        objectArray[2] = Base64.getDecoder().decode(string);
        int n3 = (0xE58F111E | 0x78B272F8) - (0xE58F111E & 0x78B272F8);
        int cfr_ignored_0 = n3 + 2024960760;
        objectArray[3] = iIlIlllllill[85];
        while ((Integer)objectArray[3] < ((byte[])objectArray[2]).length) {
            byte[] byArray = (byte[])objectArray[2];
            int n4 = (Integer)objectArray[3];
            objectArray[0] = n;
            objectArray[5] = (int)byArray[n4];
            objectArray[0] = n2;
            objectArray[5] = ((Integer)objectArray[5] & ~((Integer)objectArray[0]).intValue()) - (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[0]);
            byArray[n4] = (byte)(((Integer)objectArray[5] | (Integer)objectArray[0]) & ~((Integer)objectArray[5] & (Integer)objectArray[0]));
            objectArray[3] = (Integer)objectArray[3] + 1;
        }
        try {
            return new String((byte[])objectArray[2], StandardCharsets.UTF_8);
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw cloneNotSupportedException;
        }
        catch (UnsupportedClassVersionError unsupportedClassVersionError) {
            throw unsupportedClassVersionError;
        }
    }

    static {
        int n;
        int n2 = n = (0x57DD439E | 0xA8C3513C) - (0x57DD439E & 0xA8C3513C);
        if (906716308 >= n2 + -1463594692 - (n2 & 0xA8C3513C) * 2) {
        }
        Lusik21556.Iiiilliiil.liiiIIllIl.Illlllllilll();
        Lusik21556.Iiiilliiil.liiiIIllIl.IlIlllIlilIl("4aa7e63d-02ec-4d6e-86b3-12c1f200a184", liiiIIllIl.class, (int)iIlIlllllill[49], (String)"SSULEh8SSAUSBxBINAUSJCRcSj8=", (String)"BQgSDT8G", (String)"Bg5HBR4kCgxjYl5eX0cIHh0FEiAkBiFHCgcdDiMHEgVHQQUSGg4jLRIdEg==", (int)iIlIlllllill[50], (String)"dUxpamkx", (int)iIlIlllllill[51], (int)iIlIlllllill[52], (String)"JR4kCgxjYl5eX0cqCgoKBQUKCgoFRwUKCgoqKgUFKgU=", (int)iIlIlllllill[53]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Illlllllilll() {
        if (lIiiIiIlilli) {
        }
        Object[] objectArray = new Object[3];
        objectArray[1] = 24097;
        objectArray[2] = 24183;
        iIlIlllllill = new int[(Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1]];
        objectArray[1] = 56376;
        objectArray[2] = 56362;
        objectArray[1] = 56376;
        objectArray[2] = -56372;
        Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
        objectArray[1] = 18581;
        objectArray[2] = 18561;
        objectArray[1] = 18581;
        objectArray[2] = -1610376624;
        Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[1]).intValue());
        objectArray[1] = 53622;
        objectArray[2] = 53554;
        objectArray[1] = 53622;
        objectArray[2] = -53623;
        Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
        objectArray[1] = 41168;
        objectArray[2] = 41089;
        objectArray[1] = 41168;
        objectArray[2] = 41169;
        Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
        objectArray[1] = 13194;
        objectArray[2] = 13248;
        objectArray[1] = 13194;
        objectArray[2] = 13199;
        Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
        objectArray[1] = 42255;
        objectArray[2] = 42270;
        objectArray[1] = 42255;
        objectArray[2] = -42262;
        Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
        objectArray[1] = 20995;
        objectArray[2] = 20992;
        objectArray[1] = 20995;
        objectArray[2] = 21106;
        Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
        objectArray[1] = 64702;
        objectArray[2] = 64758;
        objectArray[1] = 64702;
        objectArray[2] = 64701;
        Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
        objectArray[1] = 58394;
        objectArray[2] = 58411;
        objectArray[1] = 58394;
        objectArray[2] = -1610402081;
        Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
        objectArray[1] = 37224;
        objectArray[2] = 37213;
        objectArray[1] = 37224;
        objectArray[2] = 141923395;
        Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
        objectArray[1] = 45782;
        objectArray[2] = 45810;
        objectArray[1] = 45782;
        objectArray[2] = 45800;
        Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
        objectArray[1] = 18259;
        objectArray[2] = 18179;
        objectArray[1] = 18259;
        objectArray[2] = 18259;
        Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
        objectArray[1] = 14673;
        objectArray[2] = 14680;
        objectArray[1] = 14673;
        objectArray[2] = 14673;
        Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
        objectArray[1] = 16330;
        objectArray[2] = 16367;
        objectArray[1] = 16330;
        objectArray[2] = 16297;
        Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[1]).intValue());
        objectArray[1] = 58937;
        objectArray[2] = 58907;
        objectArray[1] = 58937;
        objectArray[2] = 58931;
        Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
        int n = (0xCE2D9D5E | 0x11BAE89F) - (0xCE2D9D5E & 0x11BAE89F);
        block21: while (true) {
            int n2 = n;
            switch (n2 + 297461919 - (n2 & 0x11BAE89F) * 2) {
                case -1875518123: {
                    objectArray[1] = 37250;
                    objectArray[2] = 37315;
                    objectArray[1] = 37250;
                    objectArray[2] = 37358;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
                    n = (0x18C0C54E | 0x11BAE89F) - (0x18C0C54E & 0x11BAE89F);
                    continue block21;
                }
                case 415286606: {
                    objectArray[1] = 7726;
                    objectArray[2] = 7803;
                    objectArray[1] = 7726;
                    objectArray[2] = 7726;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    n = (0xA112DCB6 | 0x11BAE89F) - (0xA112DCB6 & 0x11BAE89F);
                    continue block21;
                }
                case -1592599370: {
                    objectArray[1] = 16101;
                    objectArray[2] = 16085;
                    objectArray[1] = 16101;
                    objectArray[2] = 273169469;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 63048;
                    objectArray[2] = 62977;
                    objectArray[1] = 63048;
                    objectArray[2] = 63052;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 53740;
                    objectArray[2] = 53717;
                    objectArray[1] = 53740;
                    objectArray[2] = 53741;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 53753;
                    objectArray[2] = 53675;
                    objectArray[1] = 53753;
                    objectArray[2] = 53752;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 66734;
                    objectArray[2] = 66743;
                    objectArray[1] = 66734;
                    objectArray[2] = -1610426773;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue())] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 24285;
                    objectArray[2] = 24314;
                    objectArray[1] = 24285;
                    objectArray[2] = -1610380264;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 27975;
                    objectArray[2] = 27993;
                    objectArray[1] = 27975;
                    objectArray[2] = -28108;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 8258;
                    objectArray[2] = 8273;
                    objectArray[1] = 8258;
                    objectArray[2] = -8270;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 4068;
                    objectArray[2] = 4062;
                    objectArray[1] = 4068;
                    objectArray[2] = 4068;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 36827;
                    objectArray[2] = 36831;
                    objectArray[1] = 36827;
                    objectArray[2] = 36843;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 17530;
                    objectArray[2] = 17461;
                    objectArray[1] = 17530;
                    objectArray[2] = 17492;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 22579;
                    objectArray[2] = 22553;
                    objectArray[1] = 22579;
                    objectArray[2] = 22576;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 42064;
                    objectArray[2] = 42063;
                    objectArray[1] = 42064;
                    objectArray[2] = 41990;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 12620;
                    objectArray[2] = 12622;
                    objectArray[1] = 12620;
                    objectArray[2] = -12579;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 68231;
                    objectArray[2] = 68281;
                    objectArray[1] = 68231;
                    objectArray[2] = 68225;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue())] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    n = (0xB6299FD1 | 0x11BAE89F) - (0xB6299FD1 & 0x11BAE89F);
                    continue block21;
                }
                case -1238786095: {
                    objectArray[1] = 6154;
                    objectArray[2] = 6187;
                    objectArray[1] = 6154;
                    objectArray[2] = 6163;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 25632;
                    objectArray[2] = 25644;
                    objectArray[1] = 25632;
                    objectArray[2] = -25703;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
                    n = (0x1B27E554 | 0x11BAE89F) - (0x1B27E554 & 0x11BAE89F);
                    continue block21;
                }
                case 455599444: {
                    objectArray[1] = 56366;
                    objectArray[2] = 56344;
                    objectArray[1] = 56366;
                    objectArray[2] = 56356;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 26937;
                    objectArray[2] = 26903;
                    objectArray[1] = 26937;
                    objectArray[2] = 37611370;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[1]).intValue());
                    n = (0x58970FA1 | 0x11BAE89F) - (0x58970FA1 & 0x11BAE89F);
                    continue block21;
                }
                case 1486294945: {
                    objectArray[1] = 35897;
                    objectArray[2] = 35956;
                    objectArray[1] = 35897;
                    objectArray[2] = 35896;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 2787;
                    objectArray[2] = 2735;
                    objectArray[1] = 2787;
                    objectArray[2] = 2786;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 1686;
                    objectArray[2] = 1725;
                    objectArray[1] = 1686;
                    objectArray[2] = -238873635;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 36266;
                    objectArray[2] = 36234;
                    objectArray[1] = 36266;
                    objectArray[2] = -36322;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 58015;
                    objectArray[2] = 58001;
                    objectArray[1] = 58015;
                    objectArray[2] = -57884;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 44902;
                    objectArray[2] = 44902;
                    objectArray[1] = 44902;
                    objectArray[2] = -44857;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 2931;
                    objectArray[2] = 2923;
                    objectArray[1] = 2931;
                    objectArray[2] = 1241283077;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 8086;
                    objectArray[2] = 8145;
                    objectArray[1] = 8086;
                    objectArray[2] = 8084;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 43522;
                    objectArray[2] = 43543;
                    objectArray[1] = 43522;
                    objectArray[2] = 43630;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
                    n = (0xD4BA279C | 0x11BAE89F) - (0xD4BA279C & 0x11BAE89F);
                    continue block21;
                }
                case -725997668: {
                    objectArray[1] = 48140;
                    objectArray[2] = 48154;
                    objectArray[1] = 48140;
                    objectArray[2] = -1996451602;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 65266;
                    objectArray[2] = 65236;
                    objectArray[1] = 65266;
                    objectArray[2] = 65198;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 34790;
                    objectArray[2] = 34773;
                    objectArray[1] = 34790;
                    objectArray[2] = -1866294218;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[1]).intValue());
                    n = (0xF5492609 | 0x11BAE89F) - (0xF5492609 & 0x11BAE89F);
                    continue block21;
                }
                case -179755511: {
                    objectArray[1] = 64422;
                    objectArray[2] = 64395;
                    objectArray[1] = 64422;
                    objectArray[2] = 64458;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 6282;
                    objectArray[2] = 6337;
                    objectArray[1] = 6282;
                    objectArray[2] = 6284;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 35216;
                    objectArray[2] = 35234;
                    objectArray[1] = 35216;
                    objectArray[2] = 35324;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
                    n = (0xB65357F9 | 0x11BAE89F) - (0xB65357F9 & 0x11BAE89F);
                    continue block21;
                }
                case -1236051975: {
                    objectArray[1] = 36128;
                    objectArray[2] = 36105;
                    objectArray[1] = 36128;
                    objectArray[2] = 410852081;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 21508;
                    objectArray[2] = 21524;
                    objectArray[1] = 21508;
                    objectArray[2] = -21547;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
                    n = (0x5712CDA2 | 0x11BAE89F) - (0x5712CDA2 & 0x11BAE89F);
                    continue block21;
                }
                case 1460850082: {
                    objectArray[1] = 32784;
                    objectArray[2] = 32848;
                    objectArray[1] = 32784;
                    objectArray[2] = 32892;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 1958;
                    objectArray[2] = 1966;
                    objectArray[1] = 1958;
                    objectArray[2] = 1216871310;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
                    n = (0x7A8057EE | 0x11BAE89F) - (0x7A8057EE & 0x11BAE89F);
                    continue block21;
                }
                case 2055231470: {
                    objectArray[1] = 56289;
                    objectArray[2] = 56316;
                    objectArray[1] = 56289;
                    objectArray[2] = -269042800;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 1099;
                    objectArray[2] = 1048;
                    objectArray[1] = 1099;
                    objectArray[2] = 1124;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 55280;
                    objectArray[2] = 55287;
                    objectArray[1] = 55280;
                    objectArray[2] = 55196;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
                    n = (0x47338557 | 0x11BAE89F) - (0x47338557 & 0x11BAE89F);
                    continue block21;
                }
                case 1194558807: {
                    objectArray[1] = 2819;
                    objectArray[2] = 2859;
                    objectArray[1] = 2819;
                    objectArray[2] = 2927;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 56475;
                    objectArray[2] = 56487;
                    objectArray[1] = 56475;
                    objectArray[2] = 56474;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue())] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 35549;
                    objectArray[2] = 35483;
                    objectArray[1] = 35549;
                    objectArray[2] = 35548;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue())] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 47535;
                    objectArray[2] = 47500;
                    objectArray[1] = 47535;
                    objectArray[2] = 47520;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 32105;
                    objectArray[2] = 32099;
                    objectArray[1] = 32105;
                    objectArray[2] = -1950335834;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 34369;
                    objectArray[2] = 34421;
                    objectArray[1] = 34369;
                    objectArray[2] = 34372;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    return;
                }
                default: {
                    objectArray[1] = 8957;
                    objectArray[2] = 8914;
                    objectArray[1] = 8957;
                    objectArray[2] = 8953;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue())] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 5820;
                    objectArray[2] = 5817;
                    objectArray[1] = 5820;
                    objectArray[2] = -5885;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[1]).intValue());
                    objectArray[1] = 53722;
                    objectArray[2] = 53741;
                    objectArray[1] = 53722;
                    objectArray[2] = 53723;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 18308;
                    objectArray[2] = 18334;
                    objectArray[1] = 18308;
                    objectArray[2] = 18408;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 40815;
                    objectArray[2] = 40814;
                    objectArray[1] = 40815;
                    objectArray[2] = 40815;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    objectArray[1] = 53139;
                    objectArray[2] = 53201;
                    objectArray[1] = 53139;
                    objectArray[2] = 53247;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
                    n = (0x8BBD4779 | 0x11BAE89F) - (0x8BBD4779 & 0x11BAE89F);
                    continue block21;
                }
                case -1950529671: {
                    objectArray[1] = 437;
                    objectArray[2] = 440;
                    objectArray[1] = 437;
                    objectArray[2] = 410;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 18467;
                    objectArray[2] = 18551;
                    objectArray[1] = 18467;
                    objectArray[2] = 18445;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
                    n = (0xA5038F07 | 0x11BAE89F) - (0xA5038F07 & 0x11BAE89F);
                    continue block21;
                }
                case -1526493433: {
                    objectArray[1] = 63178;
                    objectArray[2] = 63221;
                    objectArray[1] = 63178;
                    objectArray[2] = 63142;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
                    objectArray[1] = 69008;
                    objectArray[2] = 69086;
                    objectArray[1] = 69008;
                    objectArray[2] = 69055;
                    Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
                    n = (0x1376A488 | 0x11BAE89F) - (0x1376A488 & 0x11BAE89F);
                    continue block21;
                }
                case 326542472: 
            }
            objectArray[1] = 55051;
            objectArray[2] = 55053;
            objectArray[1] = 55051;
            objectArray[2] = -1610414642;
            Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
            objectArray[1] = 38976;
            objectArray[2] = 39035;
            objectArray[1] = 38976;
            objectArray[2] = 38977;
            Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
            objectArray[1] = 492;
            objectArray[2] = 487;
            objectArray[1] = 492;
            objectArray[2] = 381;
            Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[1]).intValue());
            objectArray[1] = 39514;
            objectArray[2] = 39494;
            objectArray[1] = 39514;
            objectArray[2] = 39512;
            Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
            objectArray[1] = 9862;
            objectArray[2] = 9885;
            objectArray[1] = 9862;
            objectArray[2] = -1051629001;
            Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF | ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
            objectArray[1] = 60895;
            objectArray[2] = 60880;
            objectArray[1] = 60895;
            objectArray[2] = 60809;
            Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[1]).intValue());
            objectArray[1] = 37482;
            objectArray[2] = 37446;
            objectArray[1] = 37482;
            objectArray[2] = -1610399569;
            Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
            objectArray[1] = 9570;
            objectArray[2] = 9505;
            objectArray[1] = 9570;
            objectArray[2] = 9486;
            Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) - (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue())] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & ~((Integer)objectArray[2] & (Integer)objectArray[1]);
            objectArray[1] = 26679;
            objectArray[2] = 26639;
            objectArray[1] = 26679;
            objectArray[2] = 26679;
            Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[1]).intValue());
            objectArray[1] = 39527;
            objectArray[2] = 39458;
            objectArray[1] = 39527;
            objectArray[2] = 39527;
            Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = ((Integer)objectArray[2] | (Integer)objectArray[1]) - ((Integer)objectArray[2] & (Integer)objectArray[1]);
            objectArray[1] = 34581;
            objectArray[2] = 34562;
            objectArray[1] = 34581;
            objectArray[2] = 34580;
            Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[(((Integer)objectArray[2]).intValue() | ((Integer)objectArray[1]).intValue()) & (((Integer)objectArray[2]).intValue() & ((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF)] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
            objectArray[1] = 393;
            objectArray[2] = 436;
            objectArray[1] = 393;
            objectArray[2] = 392;
            Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[((Integer)objectArray[2]).intValue() & (((Integer)objectArray[1]).intValue() ^ 0xFFFFFFFF) | (((Integer)objectArray[2]).intValue() ^ 0xFFFFFFFF) & ((Integer)objectArray[1]).intValue()] = (Integer)objectArray[2] & ~((Integer)objectArray[1]).intValue() | ~((Integer)objectArray[2]).intValue() & (Integer)objectArray[1];
            n = (0x9035DD55 | 0x11BAE89F) - (0x9035DD55 & 0x11BAE89F);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite IlIlllIlilIl(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        if (lIiiIiIlilli) {
            int cfr_ignored_0 = 0x42 & 1;
        }
        Object[] objectArray = new Object[16];
        int n = (0xF4BC28E5 | 0x5A709296) - (0xF4BC28E5 & 0x5A709296);
        int cfr_ignored_1 = n + 1517326998;
        objectArray[11] = MethodHandles.lookup();
        objectArray[0] = ((MethodHandles.Lookup)objectArray[11]).findStatic(liiiIIllIl.class, "IiIlliIliiIl", MethodType.fromMethodDescriptorString("(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;I)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
        objectArray[6] = methodType.parameterCount();
        objectArray[13] = iIlIlllllill[54];
        objectArray[2] = (int)((Integer)objectArray[6]);
        objectArray[9] = 2 * ((Integer)objectArray[2] & ~((Integer)objectArray[13]).intValue()) - ((Integer)objectArray[2] ^ (Integer)objectArray[13]);
        objectArray[15] = methodType.dropParameterTypes((Integer)objectArray[9], (Integer)objectArray[6]);
        objectArray[3] = MethodHandles.invoker((MethodType)objectArray[15]);
        Class[] classArray = new Class[iIlIlllllill[55]];
        classArray[Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[56]] = MethodHandle.class;
        objectArray[7] = ((MethodType)objectArray[15]).appendParameterTypes(classArray);
        objectArray[13] = iIlIlllllill[57];
        objectArray[2] = (int)((Integer)objectArray[9]);
        objectArray[8] = new int[2 * ((Integer)objectArray[2] | (Integer)objectArray[13]) - ((Integer)objectArray[2] ^ (Integer)objectArray[13])];
        ((int[])objectArray[8])[Lusik21556.Iiiilliiil.liiiIIllIl.iIlIlllllill[58]] = (Integer)objectArray[9];
        objectArray[1] = iIlIlllllill[59];
        block11: while (true) {
            objectArray[13] = iIlIlllllill[60];
            objectArray[2] = (int)((Integer)objectArray[9]);
            if ((Integer)objectArray[1] >= ((Integer)objectArray[2] ^ (Integer)objectArray[13]) + 2 * ((Integer)objectArray[2] & (Integer)objectArray[13])) {
                objectArray[4] = MethodHandles.permuteArguments((MethodHandle)objectArray[3], (MethodType)objectArray[7], (int[])objectArray[8]);
                int n2 = (0x66FF8FD2 | 0xD629EABE) - (0x66FF8FD2 & 0xD629EABE);
                int cfr_ignored_2 = n2 + -701896002;
                objectArray[5] = MethodHandles.collectArguments((MethodHandle)objectArray[4], (Integer)objectArray[9], (MethodHandle)objectArray[0]);
                return new ConstantCallSite((MethodHandle)objectArray[5]);
            }
            block12: while (true) {
                objectArray[13] = iIlIlllllill[61];
                objectArray[2] = (int)((Integer)objectArray[1]);
                ((int[])objectArray[8])[((Integer)objectArray[1]).intValue()] = (Integer)objectArray[2] + ~((Integer)objectArray[13]).intValue() + 1;
                int n3 = (0x74A5798F | 0x30F62C97) - (0x74A5798F & 0x30F62C97);
                int n4 = n3;
                switch (n4 + 821439639 - (n4 & 0x30F62C97) * 2) {
                    case -1445911386: {
                        continue block12;
                    }
                    case 1957001615: {
                        objectArray[1] = (Integer)objectArray[1] + 1;
                        continue block11;
                    }
                }
                break;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public static Class iliIiiliiiii(String var0) {
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
    public static MethodHandle IiIlliIliiIl(int var0, String var1_1, String var2_2, String var3_3, int var4_4, String var5_5, int var6_6, int var7_7, String var8_8, int var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [47[UNCONDITIONALDOLOOP]], but top level block is 1[TRYBLOCK]
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
    public static boolean liiiIIllIl(ItemStack itemStack, String string) {
        int n;
        int n2 = n = (0x24FF50DE | 0xD008A7DD) - (0x24FF50DE & 0xD008A7DD);
        IilliliilIIi = n2 + -804739107 - (n2 & 0xD008A7DD) * 2;
        if (666644732 <= IilliliilIIi) {
            throw new IllegalStateException();
        }
        Object[] objectArray = new Object[32];
        objectArray[13] = iIlIlllllill[30];
        objectArray[23] = iIlIlllllill[31];
        objectArray[30] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[30] ^ (Integer)objectArray[23]) + 2 * ((Integer)objectArray[30] & (Integer)objectArray[23]);
        objectArray[23] = iIlIlllllill[32];
        objectArray[30] = (int)((Integer)objectArray[13]);
        objectArray[13] = 2 * ((Integer)objectArray[30] & ~((Integer)objectArray[23]).intValue()) - ((Integer)objectArray[30] ^ (Integer)objectArray[23]);
        Object[] objectArray2 = new Object[((Integer)objectArray[13]).intValue()];
        objectArray[19] = iIlIlllllill[33];
        objectArray[23] = iIlIlllllill[34];
        objectArray[30] = (int)((Integer)objectArray[19]);
        objectArray[19] = 2 * ((Integer)objectArray[30] & ~((Integer)objectArray[23]).intValue()) - ((Integer)objectArray[30] ^ (Integer)objectArray[23]);
        objectArray[23] = iIlIlllllill[35];
        objectArray[30] = (int)((Integer)objectArray[19]);
        objectArray[19] = ((Integer)objectArray[30] & ~((Integer)objectArray[23]).intValue()) - (~((Integer)objectArray[30]).intValue() & (Integer)objectArray[23]);
        objectArray2[((Integer)objectArray[19]).intValue()] = itemStack;
        objectArray[10] = iIlIlllllill[36];
        objectArray[23] = iIlIlllllill[37];
        objectArray[30] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[30] | (Integer)objectArray[23]) & ~((Integer)objectArray[30] & (Integer)objectArray[23]);
        objectArray[23] = iIlIlllllill[38];
        objectArray[30] = (int)((Integer)objectArray[10]);
        objectArray[10] = ((Integer)objectArray[30] | (Integer)objectArray[23]) & ~((Integer)objectArray[30] & (Integer)objectArray[23]);
        objectArray2[((Integer)objectArray[10]).intValue()] = string;
        return (boolean)Lusik21556.Iiiilliiil.liiiIIllIl.IlIlllIlilIl("e077fe97-16c3-4387-ae34-a17376952b79", (Object)Lusik21556.Iiiilliiil.liiiIIllIl.IlIlllIlilIl("03cb3e38-822e-4b56-9e48-d494b56ad4d3", (long)-3683067267949750170L, (Object[])objectArray2, (int)iIlIlllllill[39], (String)"Ryk6IwkQHRBGAxAFDkYmEQkMEhtaSCMJEB0QRgMQBQ5GJhEJDBIbWg==", (String)"IRwF", (String)"BAxFAxwiCAphYFxcXUUGHBsDEB4iBB9FCAUbDCEFEANFPwMQGAwhKxAbEA==", (int)iIlIlllllill[40], (String)"Q2Zmb0Jw", (int)iIlIlllllill[41], (int)iIlIlllllill[42], (String)"IxwiCAphYFxcXUUoCAgIAwMICAgDRQMICAgoKAMDKAM=", (int)iIlIlllllill[43]), (int)iIlIlllllill[44], (String)"SCQKER4RRwQRBg9HJxIKDRMcW0kp", (String)"HAcpBhw=", (String)"BQ1GBB0jCQtiYV1dXkYHHRwEER8jBSBGCQYcDSIGEQRGQAQRGQ0iLBEcEQ==", (int)iIlIlllllill[45], (String)"TVljNEZC", (int)iIlIlllllill[46], (int)iIlIlllllill[47], (String)"JB0jCQtiYV1dXkYpCQkJBAQJCQkERgQJCQkpKQQEKQQ=", (int)iIlIlllllill[48]);
    }

    /*
     * Exception decompiling
     */
    public static String IIIllIIliIIl(String var0) {
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
    private liiiIIllIl() {
        int n;
        int n2 = n = (0x77BDE18E | 0xAB6751BE) - (0x77BDE18E & 0xAB6751BE);
        if (486544188 >= n2 + -1419292226 - (n2 & 0xAB6751BE) * 2) {
            int cfr_ignored_0 = 0x40 & 1;
        }
        Object[] objectArray = new Object[28];
        int n3 = (0xC8C52D44 | 0x7A2706A0) - (0xC8C52D44 & 0x7A2706A0);
        int cfr_ignored_1 = n3 + 2049377952;
        objectArray[14] = iIlIlllllill[0];
        objectArray[6] = iIlIlllllill[1];
        objectArray[2] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[2] | (Integer)objectArray[6]) - ((Integer)objectArray[2] & (Integer)objectArray[6]);
        objectArray[6] = iIlIlllllill[2];
        objectArray[2] = (int)((Integer)objectArray[14]);
        objectArray[14] = 2 * ((Integer)objectArray[2] & ~((Integer)objectArray[6]).intValue()) - ((Integer)objectArray[2] ^ (Integer)objectArray[6]);
        Object[] objectArray2 = new Object[((Integer)objectArray[14]).intValue()];
        objectArray[18] = iIlIlllllill[3];
        objectArray[6] = iIlIlllllill[4];
        objectArray[2] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[2] | (Integer)objectArray[6]) & (~((Integer)objectArray[2]).intValue() | ~((Integer)objectArray[6]).intValue());
        objectArray[6] = iIlIlllllill[5];
        objectArray[2] = (int)((Integer)objectArray[18]);
        objectArray[18] = 2 * ((Integer)objectArray[2] | (Integer)objectArray[6]) - ((Integer)objectArray[2] ^ (Integer)objectArray[6]);
        objectArray2[((Integer)objectArray[18]).intValue()] = this;
        Lusik21556.Iiiilliiil.liiiIIllIl.IlIlllIlilIl("7dccf33d-a9ff-42ee-a003-36996683213b", (long)-2102362849758546920L, (Object[])objectArray2, (int)iIlIlllllill[6], (String)"RCY3IAYNGg1DAA0CC0MjDgYJDxhXRSAGDRoNQwANAgtDIw4GCQ8YVw==", (String)"HhkC", (String)"AQlCABkfBQdeXVlZWkIDGRgADRsfARxCBQIYCR4CDQBCPAANFQkeKA0YDQ==", (int)iIlIlllllill[7], (String)"STJQOVg2", (int)iIlIlllllill[8], (int)iIlIlllllill[9], (String)"IBkfBQdeXVlZWkIlBQUFAAAFBQUAQgAFBQUlJQAAJQA=", (int)iIlIlllllill[10]);
        int n4 = (0x92219A0B | 0x2F32E96B) - (0x92219A0B & 0x2F32E96B);
        int cfr_ignored_2 = n4 + 791865707;
    }
}


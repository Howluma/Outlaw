/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.server.network.ServerGamePacketListenerImpl
 *  org.bukkit.Location
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.java.JavaPlugin
 */
package Lusik21556.Iliilliiilii.Iiiiliiiiiii.IIIIllIIIl.iIIIlIlIIl;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class IliIlllilIi {
    public static int[] iIlIlllllill;
    static AtomicReferenceArray<MethodHandle> liiiIIllIl;
    public static int IilliliilIIi;
    public static boolean lIiiIiIlilli;

    /*
     * Enabled aggressive block sorting
     */
    public static void IilliliilIIi(int n) {
        if (lIiiIiIlilli) {
            int cfr_ignored_0 = 58 + 1;
        }
        Object[] objectArray = new Object[28];
        objectArray[8] = iIlIlllllill[71];
        objectArray[6] = iIlIlllllill[72];
        objectArray[9] = (int)((Integer)objectArray[8]);
        objectArray[8] = (Integer)objectArray[9] - ~((Integer)objectArray[6]).intValue() - 1;
        objectArray[6] = iIlIlllllill[73];
        objectArray[9] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[9] | (Integer)objectArray[6]) & (~((Integer)objectArray[9]).intValue() | ~((Integer)objectArray[6]).intValue());
        Object[] objectArray2 = new Object[((Integer)objectArray[8]).intValue()];
        objectArray[21] = iIlIlllllill[74];
        objectArray[6] = iIlIlllllill[75];
        objectArray[9] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[9] | (Integer)objectArray[6]) + ((Integer)objectArray[9] & (Integer)objectArray[6]);
        objectArray[6] = iIlIlllllill[76];
        objectArray[9] = (int)((Integer)objectArray[21]);
        objectArray[21] = ((Integer)objectArray[9] | (Integer)objectArray[6]) & ~((Integer)objectArray[9] & (Integer)objectArray[6]);
        objectArray2[((Integer)objectArray[21]).intValue()] = IliIlllilIi.Ililllililil("ab9b407e-57b0-4c9b-b48e-05e0daefc866", (int)n, (String)"QEhSThhbTV9FHXlTqlhfXqg=", (String)"ZlxfRkUdHRYXFRJ+UlxdUVZQUVaqVFVvS6iprqKsraKjoKGmeERFWlu/vF5fXLB3s1BRVopUiKqrj0KugoytgYaHgYWnhA==", (String)"dm1sdDFy", (int)iIlIlllllill[77], (int)iIlIlllllill[78], (String)"AmABZURMVkIdX0FTWRZ9V65cU1Kseg==", (int)iIlIlllllill[79], (String)"Z0dQSDZZ", (String)"XEhEUkN+Rg==", (int)iIlIlllllill[80]);
        IliIlllilIi.Ililllililil("e1bd8d3c-0d4d-4987-832f-d5d3175dd718", (long)-4203411055339284187L, (Object[])objectArray2, (String)"RE8ZRlBRRlsTExZpaxJUra1UWqOuq69sqK6nqaeiVqJnWKettKOxQqC0og==", (String)"ZV9cRUYeHhUUFhF9UV9eUlVTUlWpV1ZsSKuqraGvrqGgo6Kle0dGWVi8v11cX7N0sFNSVYlXi6mojEGtgY+ugoWEgoakhw==", (String)"bkFjQ3NW", (int)iIlIlllllill[81], (int)iIlIlllllill[82], (String)"AWJ0ZkdPVUEeXEJQWhV0WFNfXK5mF0uoUKZSY6FXpa9mWa2koKGzSw==", (int)iIlIlllllill[83], (String)"R1pvVVdD", (String)"W19Z", (int)iIlIlllllill[84]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite Ililllililil(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        int n;
        int n2 = n = (0x4DA0DE2C | 0xAEEB23F) - (0x4DA0DE2C & 0xAEEB23F);
        if (170363734 >= n2 + 183415359 - (n2 & 0xAEEB23F) * 2) {
            n = (0xF213B346 | 0xAEEB23F) - (0xF213B346 & 0xAEEB23F);
        }
        Object[] objectArray = new Object[17];
        objectArray[11] = MethodHandles.lookup();
        objectArray[15] = ((MethodHandles.Lookup)objectArray[11]).findStatic(IliIlllilIi.class, "Iiilliiliiil", MethodType.fromMethodDescriptorString("(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/invoke/MethodHandle;", lookup.lookupClass().getClassLoader()));
        objectArray[5] = methodType.parameterCount();
        int n3 = (0x410CDBAC | 0xAE9410AB) - (0x410CDBAC & 0xAE9410AB);
        int cfr_ignored_0 = n3 + -1366028117;
        objectArray[10] = iIlIlllllill[105];
        objectArray[13] = (int)((Integer)objectArray[5]);
        objectArray[8] = ((Integer)objectArray[13] & ~((Integer)objectArray[10]).intValue()) - (~((Integer)objectArray[13]).intValue() & (Integer)objectArray[10]);
        objectArray[0] = methodType.dropParameterTypes((Integer)objectArray[8], (Integer)objectArray[5]);
        objectArray[1] = MethodHandles.invoker((MethodType)objectArray[0]);
        int n4 = (0x5C61C2F1 | 0x52AF4843) - (0x5C61C2F1 & 0x52AF4843);
        int cfr_ignored_1 = n4 + 1387219011;
        Class[] classArray = new Class[iIlIlllllill[106]];
        classArray[IliIlllilIi.iIlIlllllill[107]] = MethodHandle.class;
        objectArray[16] = ((MethodType)objectArray[0]).appendParameterTypes(classArray);
        objectArray[10] = iIlIlllllill[108];
        objectArray[13] = (int)((Integer)objectArray[8]);
        objectArray[9] = new int[(Integer)objectArray[13] - ~((Integer)objectArray[10]).intValue() - 1];
        int n5 = (0x94561529 | 0x8A6F8BD2) - (0x94561529 & 0x8A6F8BD2);
        int cfr_ignored_2 = n5 + -1972401198;
        ((int[])objectArray[9])[IliIlllilIi.iIlIlllllill[109]] = (Integer)objectArray[8];
        objectArray[2] = iIlIlllllill[110];
        block13: while (true) {
            objectArray[10] = iIlIlllllill[111];
            objectArray[13] = (int)((Integer)objectArray[8]);
            if ((Integer)objectArray[2] >= ((Integer)objectArray[13] | (Integer)objectArray[10]) + ((Integer)objectArray[13] & (Integer)objectArray[10])) {
                objectArray[7] = MethodHandles.permuteArguments((MethodHandle)objectArray[1], (MethodType)objectArray[16], (int[])objectArray[9]);
                objectArray[6] = MethodHandles.collectArguments((MethodHandle)objectArray[7], (Integer)objectArray[8], (MethodHandle)objectArray[15]);
                return new ConstantCallSite((MethodHandle)objectArray[6]);
            }
            objectArray[10] = iIlIlllllill[112];
            objectArray[13] = (int)((Integer)objectArray[2]);
            ((int[])objectArray[9])[((Integer)objectArray[2]).intValue()] = (Integer)objectArray[13] + ~((Integer)objectArray[10]).intValue() + 1;
            int n6 = (0xB47BA786 | 0x5E4A116) - (0xB47BA786 & 0x5E4A116);
            int n7 = n6;
            switch (n7 + 98869526 - (n7 & 0x5E4A116) * 2) {
                default: {
                    continue block13;
                }
                case -1266964602: 
            }
            objectArray[2] = (Integer)objectArray[2] + 1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void iIlIlllllill(int n, UUID uUID, String string, Player player) {
        if (lIiiIiIlilli) {
            int n2;
            int n3 = n2 = (0x24 | 0x3A58068F) - (0x24 & 0x3A58068F);
            int cfr_ignored_0 = n3 + 978847375 - (n3 & 0x3A58068F) * 2;
        }
        Object[] objectArray = new Object[34];
        objectArray[15] = iIlIlllllill[48];
        objectArray[32] = iIlIlllllill[49];
        objectArray[31] = (int)((Integer)objectArray[15]);
        objectArray[15] = 2 * ((Integer)objectArray[31] & ~((Integer)objectArray[32]).intValue()) - ((Integer)objectArray[31] ^ (Integer)objectArray[32]);
        objectArray[32] = iIlIlllllill[50];
        objectArray[31] = (int)((Integer)objectArray[15]);
        objectArray[15] = ((Integer)objectArray[31] | (Integer)objectArray[32]) & (~((Integer)objectArray[31]).intValue() | ~((Integer)objectArray[32]).intValue());
        Object[] objectArray2 = new Object[((Integer)objectArray[15]).intValue()];
        objectArray[9] = iIlIlllllill[51];
        objectArray[32] = iIlIlllllill[52];
        objectArray[31] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[31] ^ (Integer)objectArray[32]) + 2 * ((Integer)objectArray[31] & (Integer)objectArray[32]);
        objectArray[32] = iIlIlllllill[53];
        objectArray[31] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[31] ^ (Integer)objectArray[32]) + 2 * ((Integer)objectArray[31] & (Integer)objectArray[32]);
        objectArray2[((Integer)objectArray[9]).intValue()] = IliIlllilIi.Ililllililil("f1681813-776d-4c35-9019-d5b6ae56256a", (int)n, (String)"Rk5USB5dS1lDG39VrF5ZWK4=", (String)"YFpZQEMbGxARExR4VFpbV1BWV1CsUlNpTa6vqKSqq6SlpqegfkJDXF25ulhZWrZxtVZXUIxSjqytiUSohIqrh4CBh4Ohgg==", (String)"MzVUZDVx", (int)iIlIlllllill[54], (int)iIlIlllllill[55], (String)"BGYHY0JKUEQbWUdVXxB7UahaVVSqfA==", (int)iIlIlllllill[56], (String)"dU5sRmxm", (String)"Wk5CVEV4QA==", (int)iIlIlllllill[57]);
        objectArray[14] = iIlIlllllill[58];
        objectArray[32] = iIlIlllllill[59];
        objectArray[31] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[31] | (Integer)objectArray[32]) & (~((Integer)objectArray[31]).intValue() | ~((Integer)objectArray[32]).intValue());
        objectArray[32] = iIlIlllllill[60];
        objectArray[31] = (int)((Integer)objectArray[14]);
        objectArray[14] = ((Integer)objectArray[31] | (Integer)objectArray[32]) & ~((Integer)objectArray[31] & (Integer)objectArray[32]);
        objectArray2[((Integer)objectArray[14]).intValue()] = uUID;
        objectArray[27] = iIlIlllllill[61];
        objectArray[32] = iIlIlllllill[62];
        objectArray[31] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[31] ^ (Integer)objectArray[32]) + 2 * ((Integer)objectArray[31] & (Integer)objectArray[32]);
        objectArray[32] = iIlIlllllill[63];
        objectArray[31] = (int)((Integer)objectArray[27]);
        objectArray[27] = ((Integer)objectArray[31] & ~((Integer)objectArray[32]).intValue()) - (~((Integer)objectArray[31]).intValue() & (Integer)objectArray[32]);
        objectArray2[((Integer)objectArray[27]).intValue()] = string;
        objectArray[23] = iIlIlllllill[64];
        objectArray[32] = iIlIlllllill[65];
        objectArray[31] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[31] | (Integer)objectArray[32]) - ((Integer)objectArray[31] & (Integer)objectArray[32]);
        objectArray[32] = iIlIlllllill[66];
        objectArray[31] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[31] ^ (Integer)objectArray[32]) - 2 * (~((Integer)objectArray[31]).intValue() & (Integer)objectArray[32]);
        objectArray2[((Integer)objectArray[23]).intValue()] = player;
        IliIlllilIi.Ililllililil("d25d8eed-2718-43bc-b720-5967b55b4df2", (long)-5015257360956593788L, (Object[])objectArray2, (String)"Rk0bRFJTRFkRERRraRBWr69WWKGsqa1uqqylq6WgVKBlWqWvtqGzQKK2oA==", (String)"Z11eR0QcHBcWFBN/U11cUFdRUFerVVRuSqmor6OtrKOioaCneUVEW1q+vV9eXbF2slFQV4tViauqjkOvg42sgIeGgISmhQ==", (String)"c0hiYXhI", (int)iIlIlllllill[67], (int)iIlIlllllill[68], (String)"A2B2ZEVNV0McXkBSWBd2WlFdXqxkFUmqUqRQYaNVp61kW6+moqOxSQ==", (int)iIlIlllllill[69], (String)"NUhkZmNx", (String)"WV1b", (int)iIlIlllllill[70]);
        int n4 = (0x29F52095 | 0x63C9903E) - (0x29F52095 & 0x63C9903E);
        int cfr_ignored_1 = n4 + 1674154046;
    }

    /*
     * Exception decompiling
     */
    public static String IIillIiliIil(String var0) {
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
     * Exception decompiling
     */
    public static void IlIillIiilIi() {
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
    static {
        int n;
        int n2 = n = (0x343FD4F2 | 0xC0E33226) - (0x343FD4F2 & 0xC0E33226);
        if (187895230 >= n2 + -1058852314 - (n2 & 0xC0E33226) * 2) {
            int cfr_ignored_0 = 0xA & 1;
        }
        int n3 = (0x4C768BA3 | 0xEFF4C4EF) - (0x4C768BA3 & 0xEFF4C4EF);
        int cfr_ignored_1 = n3 + -269171473;
        IliIlllilIi.IlIillIiilIi();
        IliIlllilIi.Ililllililil("667a505b-cf96-4e9e-a1dd-881ff89c0623", IliIlllilIi.class, (String)"SkEXSF5fSFUdHRhnZRxao6NaVK2gpaFipqCpp6msWKxpVqmjuq2/TK66rA==", (String)"a1FSS0gQEBsaGB9zX1FQXFtdXFunWVhiRqWko6+hoK+urayrdUlIV1aysVNSUb16vl1cW4dZhaemgk+jj4GgjIuKjIiqiQ==", (String)"Q0JyNU9I", (int)iIlIlllllill[101], (int)iIlIlllllill[102], (String)"D2pLQ11BElROUFYdaF5IpaRrHE4=", (int)iIlIlllllill[103], (String)"WlJ6V0Vs", (String)"S1dEQH1V", (int)iIlIlllllill[104]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void lIiiIiIlilli(Player player, ServerGamePacketListenerImpl serverGamePacketListenerImpl, ServerPlayer serverPlayer) {
        int n;
        int n2 = n = (0x1AE31AB8 | 0xA4185570) - (0x1AE31AB8 & 0xA4185570);
        IilliliilIIi = n2 + -1541909136 - (n2 & 0xA4185570) * 2;
        if (962187753 < IilliliilIIi) {
            int n3 = n = (0x83C4A3B1 | 0xA4185570) - (0x83C4A3B1 & 0xA4185570);
            IilliliilIIi = n3 + -1541909136 - (n3 & 0xA4185570) * 2;
        }
        Object[] objectArray = new Object[30];
        objectArray[21] = iIlIlllllill[85];
        objectArray[29] = iIlIlllllill[86];
        objectArray[26] = (int)((Integer)objectArray[21]);
        objectArray[21] = (Integer)objectArray[26] - ~((Integer)objectArray[29]).intValue() - 1;
        objectArray[29] = iIlIlllllill[87];
        objectArray[26] = (int)((Integer)objectArray[21]);
        objectArray[21] = (Integer)objectArray[26] - ~((Integer)objectArray[29]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[21]).intValue()];
        objectArray[11] = iIlIlllllill[88];
        objectArray[29] = iIlIlllllill[89];
        objectArray[26] = (int)((Integer)objectArray[11]);
        objectArray[11] = (Integer)objectArray[26] + ~((Integer)objectArray[29]).intValue() + 1;
        objectArray[29] = iIlIlllllill[90];
        objectArray[26] = (int)((Integer)objectArray[11]);
        objectArray[11] = (Integer)objectArray[26] + ~((Integer)objectArray[29]).intValue() + 1;
        objectArray2[((Integer)objectArray[11]).intValue()] = player;
        objectArray[5] = iIlIlllllill[91];
        objectArray[29] = iIlIlllllill[92];
        objectArray[26] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[26] | (Integer)objectArray[29]) + ((Integer)objectArray[26] & (Integer)objectArray[29]);
        objectArray[29] = iIlIlllllill[93];
        objectArray[26] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[26] ^ (Integer)objectArray[29]) - 2 * (~((Integer)objectArray[26]).intValue() & (Integer)objectArray[29]);
        objectArray2[((Integer)objectArray[5]).intValue()] = serverGamePacketListenerImpl;
        objectArray[23] = iIlIlllllill[94];
        objectArray[29] = iIlIlllllill[95];
        objectArray[26] = (int)((Integer)objectArray[23]);
        objectArray[23] = ((Integer)objectArray[26] ^ (Integer)objectArray[29]) + 2 * ((Integer)objectArray[26] & (Integer)objectArray[29]);
        objectArray[29] = iIlIlllllill[96];
        objectArray[26] = (int)((Integer)objectArray[23]);
        objectArray[23] = 2 * ((Integer)objectArray[26] | (Integer)objectArray[29]) - ((Integer)objectArray[26] ^ (Integer)objectArray[29]);
        objectArray2[((Integer)objectArray[23]).intValue()] = serverPlayer;
        IliIlllilIi.Ililllililil("3a01191e-906a-45a7-bb61-80a768c85e4f", (long)5791191832596567558L, (Object[])objectArray2, (String)"RU4YR1FQR1oSEhdoahNVrKxVW6Kvqq5tqa+mqKajV6NmWaastaKwQ6G1ow==", (String)"ZF5dREcfHxQVFxB8UF5fU1RSU1SoVldtSaqrrKCur6ChoqOkekZHWFm9vlxdXrJ1sVJTVIhWiqipjUCsgI6vg4SFg4elhg==", (String)"T1k1aUlu", (int)iIlIlllllill[97], (int)iIlIlllllill[98], (String)"AGN1Z0ZOVEAfXUNRWxR1WVJeXa9nFkqpUadTYqBWpK5nWKyloaCySg==", (int)iIlIlllllill[99], (String)"SVkyVmV3", (String)"Wl5Y", (int)iIlIlllllill[100]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Class Iilllilliill(String string) {
        int n;
        int n2 = n = (0x13628962 | 0x32DA2647) - (0x13628962 & 0x32DA2647);
        if (279435537 >= n2 + 853157447 - (n2 & 0x32DA2647) * 2) {
        }
        if (lIiiIiIlilli) {
            int n3 = n = (0x5E | 0x32DA2647) - (0x5E & 0x32DA2647);
            int cfr_ignored_0 = n3 + 853157447 - (n3 & 0x32DA2647) * 2;
        }
        if (lIiiIiIlilli) {
            int n4 = n = (0x4A | 0x32DA2647) - (0x4A & 0x32DA2647);
            int cfr_ignored_1 = n4 + 853157447 - (n4 & 0x32DA2647) * 2;
        }
        if (lIiiIiIlilli) {
            int n5 = n = (0x4B | 0x32DA2647) - (0x4B & 0x32DA2647);
            int cfr_ignored_2 = n5 + 853157447 - (n5 & 0x32DA2647) * 2;
        }
        Object[] objectArray = new Object[5];
        if (string == null) throw new IllegalArgumentException("Input string cannot be null or empty");
        int n6 = (0x2E077756 | 0x89F1B111) - (0x2E077756 & 0x89F1B111);
        int n7 = n6;
        switch (n7 + -1980649199 - (n7 & 0x89F1B111) * 2) {
            case 712164739: {
                return Integer.TYPE;
            }
        }
        if (string.isEmpty()) throw new IllegalArgumentException("Input string cannot be null or empty");
        switch (string.charAt(iIlIlllllill[131])) {
            case 'B': {
                return Byte.TYPE;
            }
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
                return Short.TYPE;
            }
        }
        objectArray[3] = string;
        if (!((String)objectArray[3]).startsWith("L")) return Class.forName((String)objectArray[3]);
        int n8 = (0x5D3E1C | 0x661E1363) - (0x5D3E1C & 0x661E1363);
        block23: while (true) {
            int n9 = n8;
            switch (n9 + 1713247075 - (n9 & 0x661E1363) * 2) {
                default: {
                    if (!((String)objectArray[3]).endsWith(";")) return Class.forName((String)objectArray[3]);
                    n8 = (0x1B72E4A4 | 0x661E1363) - (0x1B72E4A4 & 0x661E1363);
                    continue block23;
                }
                case 460514468: 
            }
            break;
        }
        objectArray[4] = iIlIlllllill[133];
        objectArray[1] = ((String)objectArray[3]).length();
        objectArray[3] = ((String)objectArray[3]).substring(iIlIlllllill[132], ((Integer)objectArray[1] & ~((Integer)objectArray[4]).intValue()) - (~((Integer)objectArray[1]).intValue() & (Integer)objectArray[4])).replace(iIlIlllllill[134], iIlIlllllill[135]);
        return Class.forName((String)objectArray[3]);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String IIIilIIiiIIi(String var0, int var1_1, int var2_2) {
        block16: {
            v0 = var12_3 = (1145678258 | -2065069794) - (1145678258 & -2065069794);
            IliIlllilIi.IilliliilIIi = v0 + -2065069794 - (v0 & -2065069794) * 2;
            if (1432528371 <= IliIlllilIi.IilliliilIIi) {
            }
            var10_6 = new Object[7];
            var10_6[0] = Base64.getDecoder().decode(var0);
            var10_6[5] = IliIlllilIi.iIlIlllllill[136];
lbl10:
            // 2 sources

            while ((Integer)var10_6[5] >= ((byte[])var10_6[0]).length) {
                try {
                    return new String((byte[])var10_6[0], StandardCharsets.UTF_8);
                }
                catch (CloneNotSupportedException v1) {
                    throw v1;
                }
                catch (InstantiationError v2) {
                    throw v2;
                }
            }
            break block16;
lbl18:
            // 1 sources

            block13: while (true) {
                v3 = var8_4;
                switch (v3 + 2042915300 - (v3 & 2042915300) * 2) {
                    default: {
                        var8_4 = (1361669072 | 2042915300) - (1361669072 & 2042915300);
                        continue block13;
                    }
                    case 1361669072: 
                }
                v4 = (byte[])var10_6[0];
                v5 = (Integer)var10_6[5];
                var10_6[4] = var1_1;
                var10_6[2] = (int)v4[v5];
                var10_6[4] = var2_2;
                var10_6[2] = ((Integer)var10_6[2] | (Integer)var10_6[4]) & (~((Integer)var10_6[2]).intValue() | ~((Integer)var10_6[4]).intValue());
                var10_6[4] = (int)((Integer)var10_6[5]);
                var10_6[2] = ((Integer)var10_6[2] | (Integer)var10_6[4]) & (~((Integer)var10_6[2]).intValue() | ~((Integer)var10_6[4]).intValue());
                v4[v5] = (byte)((Integer)var10_6[2] + ~((Integer)var10_6[4]).intValue() + 1);
                var9_5 = (-1567043556 | -2123059675) - (-1567043556 & -2123059675);
                block14: while (true) {
                    v6 = var9_5;
                    switch (v6 + -2123059675 - (v6 & -2123059675) * 2) {
                        default: {
                            var10_6[5] = (Integer)var10_6[5] + 1;
                            var9_5 = (1346944199 | -2123059675) - (1346944199 & -2123059675);
                            continue block14;
                        }
                        case 1346944199: 
                    }
                    break;
                }
                ** GOTO lbl10
                break;
            }
        }
        var8_4 = (1687318942 | 2042915300) - (1687318942 & 2042915300);
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle Iiilliiliiil(String var0, String var1_1, String var2_2, int var3_3, int var4_4, String var5_5, int var6_6, String var7_7, String var8_8, int var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK], 2[TRYBLOCK], 4[TRYBLOCK]], but top level block is 29[SWITCH]
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

    public static ServerPlayer IliIlllilIi(Location location, String string, String string2, String string3, Player player) {
        Object[] objectArray = new Object[41];
        objectArray[36] = iIlIlllllill[10];
        objectArray[3] = iIlIlllllill[11];
        objectArray[15] = (int)((Integer)objectArray[36]);
        objectArray[36] = ((Integer)objectArray[15] ^ (Integer)objectArray[3]) - 2 * (~((Integer)objectArray[15]).intValue() & (Integer)objectArray[3]);
        objectArray[3] = iIlIlllllill[12];
        objectArray[15] = (int)((Integer)objectArray[36]);
        objectArray[36] = ((Integer)objectArray[15] ^ (Integer)objectArray[3]) + 2 * ((Integer)objectArray[15] & (Integer)objectArray[3]);
        Object[] objectArray2 = new Object[((Integer)objectArray[36]).intValue()];
        objectArray[13] = iIlIlllllill[13];
        objectArray[3] = iIlIlllllill[14];
        objectArray[15] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[15] | (Integer)objectArray[3]) & ~((Integer)objectArray[15] & (Integer)objectArray[3]);
        objectArray[3] = iIlIlllllill[15];
        objectArray[15] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[15] | (Integer)objectArray[3]) & (~((Integer)objectArray[15]).intValue() | ~((Integer)objectArray[3]).intValue());
        objectArray2[((Integer)objectArray[13]).intValue()] = location;
        objectArray[27] = iIlIlllllill[16];
        objectArray[3] = iIlIlllllill[17];
        objectArray[15] = (int)((Integer)objectArray[27]);
        objectArray[27] = 2 * ((Integer)objectArray[15] | (Integer)objectArray[3]) - ((Integer)objectArray[15] ^ (Integer)objectArray[3]);
        objectArray[3] = iIlIlllllill[18];
        objectArray[15] = (int)((Integer)objectArray[27]);
        objectArray[27] = 2 * ((Integer)objectArray[15] & ~((Integer)objectArray[3]).intValue()) - ((Integer)objectArray[15] ^ (Integer)objectArray[3]);
        objectArray2[((Integer)objectArray[27]).intValue()] = string;
        objectArray[29] = iIlIlllllill[19];
        objectArray[3] = iIlIlllllill[20];
        objectArray[15] = (int)((Integer)objectArray[29]);
        objectArray[29] = ((Integer)objectArray[15] ^ (Integer)objectArray[3]) - 2 * (~((Integer)objectArray[15]).intValue() & (Integer)objectArray[3]);
        objectArray[3] = iIlIlllllill[21];
        objectArray[15] = (int)((Integer)objectArray[29]);
        objectArray[29] = (Integer)objectArray[15] + ~((Integer)objectArray[3]).intValue() + 1;
        objectArray2[((Integer)objectArray[29]).intValue()] = string2;
        objectArray[2] = iIlIlllllill[22];
        objectArray[3] = iIlIlllllill[23];
        objectArray[15] = (int)((Integer)objectArray[2]);
        objectArray[2] = (Integer)objectArray[15] & ~((Integer)objectArray[3]).intValue() | ~((Integer)objectArray[15]).intValue() & (Integer)objectArray[3];
        objectArray[3] = iIlIlllllill[24];
        objectArray[15] = (int)((Integer)objectArray[2]);
        objectArray[2] = 2 * ((Integer)objectArray[15] | (Integer)objectArray[3]) - ((Integer)objectArray[15] ^ (Integer)objectArray[3]);
        objectArray2[((Integer)objectArray[2]).intValue()] = string3;
        objectArray[22] = iIlIlllllill[25];
        objectArray[3] = iIlIlllllill[26];
        objectArray[15] = (int)((Integer)objectArray[22]);
        objectArray[22] = 2 * ((Integer)objectArray[15] & ~((Integer)objectArray[3]).intValue()) - ((Integer)objectArray[15] ^ (Integer)objectArray[3]);
        objectArray[3] = iIlIlllllill[27];
        objectArray[15] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[15] | (Integer)objectArray[3]) & (~((Integer)objectArray[15]).intValue() | ~((Integer)objectArray[3]).intValue());
        objectArray2[((Integer)objectArray[22]).intValue()] = player;
        return (ServerPlayer)IliIlllilIi.Ililllililil("9988c02c-ba39-4b77-8a63-6849ebbd288a", (long)4470358559909783524L, (Object[])objectArray2, (String)"Q0geQVdWQVwUFBFubBVTqqpTXaSprKhrr6mgrqClUaVgX6Cqs6S2RaezpQ==", (String)"YlhbQkEZGRITERZ6VlhZVVJUVVKuUFFrT6ytqqaoqaanpKWifEBBXl+7uFpbWLRzt1RVUo5QjK6vi0aqhoiphYKDhYGjgA==", (String)"Tmk2bTQ5", (int)iIlIlllllill[28], (int)iIlIlllllill[29], (String)"BmVzYUBIUkYZW0VXXRJzX1RYW6lhEEyvV6FVZKZQoqhhXqqjp6a0TA==", (int)iIlIlllllill[30], (String)"OHlkeUh4", (String)"XFhe", (int)iIlIlllllill[31]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private IliIlllilIi() {
        if (lIiiIiIlilli) {
            int cfr_ignored_0 = 0x1A & 1;
        }
        Object[] objectArray = new Object[26];
        objectArray[22] = iIlIlllllill[0];
        objectArray[24] = iIlIlllllill[1];
        objectArray[17] = (int)((Integer)objectArray[22]);
        objectArray[22] = (Integer)objectArray[17] - ~((Integer)objectArray[24]).intValue() - 1;
        objectArray[24] = iIlIlllllill[2];
        objectArray[17] = (int)((Integer)objectArray[22]);
        objectArray[22] = 2 * ((Integer)objectArray[17] & ~((Integer)objectArray[24]).intValue()) - ((Integer)objectArray[17] ^ (Integer)objectArray[24]);
        Object[] objectArray2 = new Object[((Integer)objectArray[22]).intValue()];
        objectArray[6] = iIlIlllllill[3];
        objectArray[24] = iIlIlllllill[4];
        objectArray[17] = (int)((Integer)objectArray[6]);
        objectArray[6] = (Integer)objectArray[17] & ~((Integer)objectArray[24]).intValue() | ~((Integer)objectArray[17]).intValue() & (Integer)objectArray[24];
        objectArray[24] = iIlIlllllill[5];
        objectArray[17] = (int)((Integer)objectArray[6]);
        objectArray[6] = ((Integer)objectArray[17] | (Integer)objectArray[24]) - ((Integer)objectArray[17] & (Integer)objectArray[24]);
        objectArray2[((Integer)objectArray[6]).intValue()] = this;
        IliIlllilIi.Ililllililil("035b9f21-6f43-4261-9b22-5577f5384021", (long)5292763409703248740L, (Object[])objectArray2, (String)"QkkfQFZXQF0VFRBvbRRSq6tSXKWoralqrqihr6GkUKRhXqGrsqW3RKaypA==", (String)"Y1laQ0AYGBMSEBd7V1lYVFNVVFOvUVBqTq2sq6epqKempaSjfUFAX166uVtaWbVytlVUU49Rja+uikerh4mohIOChICigQ==", (String)"bjNsZ056", (int)iIlIlllllill[6], (int)iIlIlllllill[7], (String)"B2RyYEFJU0cYWkRWXBNyXlVZWqhgEU2uVqBUZadRo6lgX6uipqe1TQ==", (int)iIlIlllllill[8], (String)"bU5jVWdE", (String)"XVlf", (int)iIlIlllllill[9]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void liiiIIllIl(JavaPlugin javaPlugin, ServerPlayer serverPlayer, Player player) {
        if (lIiiIiIlilli) {
            throw null;
        }
        Object[] objectArray = new Object[35];
        objectArray[22] = iIlIlllllill[32];
        objectArray[11] = iIlIlllllill[33];
        objectArray[32] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[32] | (Integer)objectArray[11]) & ~((Integer)objectArray[32] & (Integer)objectArray[11]);
        objectArray[11] = iIlIlllllill[34];
        objectArray[32] = (int)((Integer)objectArray[22]);
        objectArray[22] = (Integer)objectArray[32] + ~((Integer)objectArray[11]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[22]).intValue()];
        objectArray[17] = iIlIlllllill[35];
        objectArray[11] = iIlIlllllill[36];
        objectArray[32] = (int)((Integer)objectArray[17]);
        objectArray[17] = (Integer)objectArray[32] + ~((Integer)objectArray[11]).intValue() + 1;
        objectArray[11] = iIlIlllllill[37];
        objectArray[32] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[32] & ~((Integer)objectArray[11]).intValue()) - (~((Integer)objectArray[32]).intValue() & (Integer)objectArray[11]);
        objectArray2[((Integer)objectArray[17]).intValue()] = javaPlugin;
        objectArray[21] = iIlIlllllill[38];
        objectArray[11] = iIlIlllllill[39];
        objectArray[32] = (int)((Integer)objectArray[21]);
        objectArray[21] = 2 * ((Integer)objectArray[32] & ~((Integer)objectArray[11]).intValue()) - ((Integer)objectArray[32] ^ (Integer)objectArray[11]);
        objectArray[11] = iIlIlllllill[40];
        objectArray[32] = (int)((Integer)objectArray[21]);
        objectArray[21] = (Integer)objectArray[32] & ~((Integer)objectArray[11]).intValue() | ~((Integer)objectArray[32]).intValue() & (Integer)objectArray[11];
        objectArray2[((Integer)objectArray[21]).intValue()] = serverPlayer;
        objectArray[8] = iIlIlllllill[41];
        objectArray[11] = iIlIlllllill[42];
        objectArray[32] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[32] | (Integer)objectArray[11]) - ((Integer)objectArray[32] & (Integer)objectArray[11]);
        objectArray[11] = iIlIlllllill[43];
        objectArray[32] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[32] ^ (Integer)objectArray[11]) - 2 * (~((Integer)objectArray[32]).intValue() & (Integer)objectArray[11]);
        objectArray2[((Integer)objectArray[8]).intValue()] = player;
        IliIlllilIi.Ililllililil("6ea1ba15-78a1-4773-8540-56443785f2a5", (long)-9222464714162424621L, (Object[])objectArray2, (String)"QEsdQlRVQl8XFxJtbxZQqalQXqeqr6torKqjraOmUqZjXKOpsKe1RqSwpg==", (String)"YVtYQUIaGhEQEhV5VVtaVlFXVlGtU1JoTK+uqaWrqqWkp6ahf0NCXVy4u1lYW7dwtFdWUY1Tj62siEWphYuqhoGAhoKggw==", (String)"MW40M0Zw", (int)iIlIlllllill[44], (int)iIlIlllllill[45], (String)"BWZwYkNLUUUaWEZUXhFwXFdbWKpiE0+sVKJWZ6VToatiXamgpKW3Tw==", (int)iIlIlllllill[46], (String)"ZFBWOUtL", (String)"X1td", (int)iIlIlllllill[47]);
    }
}


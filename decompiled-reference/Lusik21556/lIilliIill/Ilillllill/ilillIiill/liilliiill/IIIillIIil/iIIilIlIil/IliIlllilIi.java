/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.java.JavaPlugin
 */
package Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.SyncFailedException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bukkit.plugin.java.JavaPlugin;

public final class IliIlllilIi {
    public ScheduledExecutorService iIlIlllllill;
    public static int[] iliIiiliiiii;
    static AtomicReferenceArray<MethodHandle> lIiiIiIlilli;
    private JavaPlugin IliIlllilIi;
    private String liiiIIllIl;
    public static int IIIllIIliIIl;
    public static boolean IlIlllIlilIl;

    /*
     * Exception decompiling
     */
    public static MethodHandle IIlilIliiIli(String var0, int var1_1, String var2_2, int var3_3, int var4_4, String var5_5, int var6_6, String var7_7, int var8_8, int var9_9) {
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private File iIlIlllllill() {
        int n;
        int n2 = n = (0x1EFAC773 | 0x9588DFE7) - (0x1EFAC773 & 0x9588DFE7);
        if (158932489 >= n2 + -1786191897 - (n2 & 0x9588DFE7) * 2) {
            n = (0x8F806A1B | 0x9588DFE7) - (0x8F806A1B & 0x9588DFE7);
        }
        Object[] objectArray = new Object[27];
        objectArray[18] = iliIiiliiiii[45];
        objectArray[23] = iliIiiliiiii[46];
        objectArray[8] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[8] | (Integer)objectArray[23]) & (~((Integer)objectArray[8]).intValue() | ~((Integer)objectArray[23]).intValue());
        objectArray[23] = iliIiiliiiii[47];
        objectArray[8] = (int)((Integer)objectArray[18]);
        objectArray[18] = (Integer)objectArray[8] - ~((Integer)objectArray[23]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[18]).intValue()];
        objectArray[24] = iliIiiliiiii[48];
        objectArray[23] = iliIiiliiiii[49];
        objectArray[8] = (int)((Integer)objectArray[24]);
        objectArray[24] = ((Integer)objectArray[8] ^ (Integer)objectArray[23]) - 2 * (~((Integer)objectArray[8]).intValue() & (Integer)objectArray[23]);
        objectArray[23] = iliIiiliiiii[50];
        objectArray[8] = (int)((Integer)objectArray[24]);
        objectArray[24] = 2 * ((Integer)objectArray[8] & ~((Integer)objectArray[23]).intValue()) - ((Integer)objectArray[8] ^ (Integer)objectArray[23]);
        objectArray2[((Integer)objectArray[24]).intValue()] = this;
        return (File)((Object)Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.IiIiliIiiiIi("a292253b-f365-4bf7-8256-bf4ac9c69461", (long)4434229731229352185L, (Object[])objectArray2, (String)"y/Pw6e62trG8vqPmxOPh4vjX+v73ut768PT19u/z8fKNx83Jx8juzcDExYS/w8bC29fa2dfYl/3w79LWz/P21avuqomMq6mNo3+ipuGDoaWYvL2+vLievQ==", (int)iliIiiliiiii[51], (String)"7OOr7vD17uu5t769uaLg+eP88uPm9+W48Pbt/e3y/vKN8M3B3L/T4sjcyg==", (int)iliIiiliiiii[52], (int)iliIiiliiiii[53], (String)"8fPr", (int)iliIiiliiiii[54], (String)"p8rYzu3j7+Wm5Ork6qHA7Pnz8Oauu9n8+O76s+/77/eO7b/IwMXRmw==", (int)iliIiiliiiii[55], (int)iliIiiliiiii[56]));
    }

    public static /* synthetic */ Thread IlIlllIlilIl(Runnable runnable) {
        Object[] objectArray = new Object[27];
        objectArray[13] = iliIiiliiiii[93];
        objectArray[26] = iliIiiliiiii[94];
        objectArray[15] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[15] & ~((Integer)objectArray[26]).intValue()) - (~((Integer)objectArray[15]).intValue() & (Integer)objectArray[26]);
        objectArray[26] = iliIiiliiiii[95];
        objectArray[15] = (int)((Integer)objectArray[13]);
        objectArray[13] = ((Integer)objectArray[15] | (Integer)objectArray[26]) + ((Integer)objectArray[15] & (Integer)objectArray[26]);
        Object[] objectArray2 = new Object[((Integer)objectArray[13]).intValue()];
        objectArray[20] = iliIiiliiiii[96];
        objectArray[26] = iliIiiliiiii[97];
        objectArray[15] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[15] - ~((Integer)objectArray[26]).intValue() - 1;
        objectArray[26] = iliIiiliiiii[98];
        objectArray[15] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[15] + ~((Integer)objectArray[26]).intValue() + 1;
        objectArray2[((Integer)objectArray[20]).intValue()] = runnable;
        return (Thread)((Object)Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.IiIiliIiiiIi("6f8c018c-8b6c-4a6c-9391-c60a3652d4d9", (long)1347604972536792787L, (Object[])objectArray2, (String)"v+fk3eKqqqWwspfauNfV1uzL7vLrrtLu5Ojp6uPn5eaBu8G9u7ziwbS4uXizt7q2z8vOzcvMi/Hk48bKw+fqyZ/inn2An52Bl3OWmtV3lZmMsLGysKySsQ==", (int)iliIiiliiiii[99], (String)"4Nef4uTp4t+tq7KxrZbU7dfw5tfa69ms5Orh8eHm8uaB5MG10LPH1rzQvg==", (int)iliIiiliiiii[100], (int)iliIiiliiiii[101], (String)"5eff", (int)iliIiiliiiii[102], (String)"m77MwuHX49ma2N7Y3pW04O3n5Nqir83w7OLup+Pv4+uC4bO8tLnFjw==", (int)iliIiiliiiii[103], (int)iliIiiliiiii[104]));
    }

    /*
     * Enabled aggressive block sorting
     */
    public /* synthetic */ void iliIiiliiiii() {
        if (IlIlllIlilIl) {
            throw new FileNotFoundException();
        }
        Object[] objectArray = new Object[26];
        objectArray[17] = iliIiiliiiii[69];
        objectArray[5] = iliIiiliiiii[70];
        objectArray[7] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[7] | (Integer)objectArray[5]) + ((Integer)objectArray[7] & (Integer)objectArray[5]);
        objectArray[5] = iliIiiliiiii[71];
        objectArray[7] = (int)((Integer)objectArray[17]);
        objectArray[17] = 2 * ((Integer)objectArray[7] & ~((Integer)objectArray[5]).intValue()) - ((Integer)objectArray[7] ^ (Integer)objectArray[5]);
        Object[] objectArray2 = new Object[((Integer)objectArray[17]).intValue()];
        objectArray[22] = iliIiiliiiii[72];
        objectArray[5] = iliIiiliiiii[73];
        objectArray[7] = (int)((Integer)objectArray[22]);
        objectArray[22] = (Integer)objectArray[7] - ~((Integer)objectArray[5]).intValue() - 1;
        objectArray[5] = iliIiiliiiii[74];
        objectArray[7] = (int)((Integer)objectArray[22]);
        objectArray[22] = ((Integer)objectArray[7] | (Integer)objectArray[5]) + ((Integer)objectArray[7] & (Integer)objectArray[5]);
        objectArray2[((Integer)objectArray[22]).intValue()] = this;
        Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.IiIiliIiiiIi("8e84e015-c9eb-42bf-9e57-e43507555939", (long)-1427051679027995021L, (Object[])objectArray2, (String)"yfHu5+y0tK+6vKHkwuHf4PbV+Pz1uNz47vLz9O3x7/CLxcvHxcbsy77Cw4K9wcTA2dXY19XWlfvu7dDUzfH006nsqIeKqaeLoX2gpN+Bn6OWuru8uracuw==", (int)iliIiiliiiii[75], (String)"6uGp7O7z7Om3tby7t6De9+H68OHk9eO27vTr++vw/PCL7su/2r3R4MbayA==", (int)iliIiiliiiii[76], (int)iliIiiliiiii[77], (String)"7/Hp", (int)iliIiiliiiii[78], (String)"pcjWzOvh7eOk4uji6J++6vfx7uSsudf69uz4se357fWM673GvsPPmQ==", (int)iliIiiliiiii[79], (int)iliIiiliiiii[80]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void liiiIIllIl() {
        int n;
        int n2 = n = (0x515EF50 | 0x352A0978) - (0x515EF50 & 0x352A0978);
        IIIllIIliIIl = n2 + 891947384 - (n2 & 0x352A0978) * 2;
        if (1300876241 < IIIllIIliIIl) {
            int n3 = n = (0x8FED3C39 | 0x352A0978) - (0x8FED3C39 & 0x352A0978);
            IIIllIIliIIl = n3 + 891947384 - (n3 & 0x352A0978) * 2;
        }
        Object[] objectArray = new Object[28];
        int n4 = (0x1824C68D | 0xD561B20C) - (0x1824C68D & 0xD561B20C);
        int cfr_ignored_0 = n4 + -715017716;
        objectArray[8] = iliIiiliiiii[33];
        objectArray[4] = iliIiiliiiii[34];
        objectArray[7] = (int)((Integer)objectArray[8]);
        objectArray[8] = ((Integer)objectArray[7] & ~((Integer)objectArray[4]).intValue()) - (~((Integer)objectArray[7]).intValue() & (Integer)objectArray[4]);
        objectArray[4] = iliIiiliiiii[35];
        objectArray[7] = (int)((Integer)objectArray[8]);
        objectArray[8] = (Integer)objectArray[7] & ~((Integer)objectArray[4]).intValue() | ~((Integer)objectArray[7]).intValue() & (Integer)objectArray[4];
        Object[] objectArray2 = new Object[((Integer)objectArray[8]).intValue()];
        objectArray[20] = iliIiiliiiii[36];
        objectArray[4] = iliIiiliiiii[37];
        objectArray[7] = (int)((Integer)objectArray[20]);
        objectArray[20] = 2 * ((Integer)objectArray[7] & ~((Integer)objectArray[4]).intValue()) - ((Integer)objectArray[7] ^ (Integer)objectArray[4]);
        objectArray[4] = iliIiiliiiii[38];
        objectArray[7] = (int)((Integer)objectArray[20]);
        objectArray[20] = (Integer)objectArray[7] + ~((Integer)objectArray[4]).intValue() + 1;
        objectArray2[((Integer)objectArray[20]).intValue()] = this;
        Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.IiIiliIiiiIi("8fcdcbd8-5906-4a13-8062-f972c64aedd7", (long)2677950874608138034L, (Object[])objectArray2, (String)"xOzp4uevr6q1t5zfvdza2/HQ8/fws9fz6e3u7+js6uuGwMbCwMHnxrm9vn24vL+71NDT0tDRkPbp6MvPyOzvzqTno4KFpKKGnHibn9p8mp6Rtba3tbGXtg==", (int)iliIiiliiiii[39], (String)"5dyk5+nu5+SysLe2spvZ8tz169zf8N6x6e/m9ubr9+uG6ca61bjM28HVww==", (int)iliIiiliiiii[40], (int)iliIiiliiiii[41], (String)"6uzk", (int)iliIiiliiiii[42], (String)"oMPRx+bc6N6f3ePd45q55fLs6d+ntNL18efzrOj06PCH5rjBub7KlA==", (int)iliIiiliiiii[43], (int)iliIiiliiiii[44]);
    }

    public /* synthetic */ void IIIllIIliIIl() {
        Object[] objectArray = new Object[27];
        objectArray[9] = iliIiiliiiii[81];
        objectArray[15] = iliIiiliiiii[82];
        objectArray[5] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[5] & ~((Integer)objectArray[15]).intValue()) - (~((Integer)objectArray[5]).intValue() & (Integer)objectArray[15]);
        objectArray[15] = iliIiiliiiii[83];
        objectArray[5] = (int)((Integer)objectArray[9]);
        objectArray[9] = ((Integer)objectArray[5] | (Integer)objectArray[15]) + ((Integer)objectArray[5] & (Integer)objectArray[15]);
        Object[] objectArray2 = new Object[((Integer)objectArray[9]).intValue()];
        objectArray[23] = iliIiiliiiii[84];
        objectArray[15] = iliIiiliiiii[85];
        objectArray[5] = (int)((Integer)objectArray[23]);
        objectArray[23] = 2 * ((Integer)objectArray[5] & ~((Integer)objectArray[15]).intValue()) - ((Integer)objectArray[5] ^ (Integer)objectArray[15]);
        objectArray[15] = iliIiiliiiii[86];
        objectArray[5] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[5] + ~((Integer)objectArray[15]).intValue() + 1;
        objectArray2[((Integer)objectArray[23]).intValue()] = this;
        Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.IiIiliIiiiIi("6a172ce6-cb84-4765-9867-289821ff6a57", (long)-3962149048263846620L, (Object[])objectArray2, (String)"yPDt5uuzs665u6DjweDe3/XU9/v0t9v37fHy8+zw7u+KxMrGxMXryr3BwoG8wMO/2NTX1tTVlPrt7M/TzPDz0qjrp4aJqKaKoHyfo96AnqKVubq7ubWbug==", (int)iliIiiliiiii[87], (String)"6eCo6+3y6+i2tLu6tp/d9uD57+Dj9OK17fPq+urv+++K7cq+2bzQ38XZxw==", (int)iliIiiliiiii[88], (int)iliIiiliiiii[89], (String)"7vDo", (int)iliIiiliiiii[90], (String)"pMfVy+rg7OKj4efh55696fbw7eOruNb59ev3sOz47PSL6rzFvcLOmA==", (int)iliIiiliiiii[91], (int)iliIiiliiiii[92]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public IliIlllilIi(JavaPlugin javaPlugin) {
        int n;
        int n2 = n = (0xA5BFB61 | 0x155977E8) - (0xA5BFB61 & 0x155977E8);
        if (151108604 >= n2 + 358184936 - (n2 & 0x155977E8) * 2) {
            n = (0x5C658ECB | 0x155977E8) - (0x5C658ECB & 0x155977E8);
        }
        Object[] objectArray = new Object[29];
        objectArray[17] = iliIiiliiiii[0];
        objectArray[8] = iliIiiliiiii[1];
        objectArray[27] = (int)((Integer)objectArray[17]);
        objectArray[17] = ((Integer)objectArray[27] ^ (Integer)objectArray[8]) + 2 * ((Integer)objectArray[27] & (Integer)objectArray[8]);
        objectArray[8] = iliIiiliiiii[2];
        objectArray[27] = (int)((Integer)objectArray[17]);
        objectArray[17] = (Integer)objectArray[27] + ~((Integer)objectArray[8]).intValue() + 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[17]).intValue()];
        objectArray[25] = iliIiiliiiii[3];
        objectArray[8] = iliIiiliiiii[4];
        objectArray[27] = (int)((Integer)objectArray[25]);
        objectArray[25] = (Integer)objectArray[27] & ~((Integer)objectArray[8]).intValue() | ~((Integer)objectArray[27]).intValue() & (Integer)objectArray[8];
        objectArray[8] = iliIiiliiiii[5];
        objectArray[27] = (int)((Integer)objectArray[25]);
        objectArray[25] = 2 * ((Integer)objectArray[27] & ~((Integer)objectArray[8]).intValue()) - ((Integer)objectArray[27] ^ (Integer)objectArray[8]);
        objectArray2[((Integer)objectArray[25]).intValue()] = this;
        objectArray[1] = iliIiiliiiii[6];
        objectArray[8] = iliIiiliiiii[7];
        objectArray[27] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[27] ^ (Integer)objectArray[8]) - 2 * (~((Integer)objectArray[27]).intValue() & (Integer)objectArray[8]);
        objectArray[8] = iliIiiliiiii[8];
        objectArray[27] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[27] ^ (Integer)objectArray[8]) + 2 * ((Integer)objectArray[27] & (Integer)objectArray[8]);
        objectArray2[((Integer)objectArray[1]).intValue()] = javaPlugin;
        Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.IiIiliIiiiIi("8b94102e-f345-498a-a57f-bb9ef45dfba5", (long)-8725725711301710507L, (Object[])objectArray2, (String)"x+/s5eqysq24up/iwN/d3vTT9vrzttr27PDx8uvv7e6Jw8nFw8TqybzAwYC7v8K+19PW1dPUk/ns687Sy+/y0afqpoWIp6WJn3ueot1/naGUuLm6uLSauQ==", (int)iliIiiliiiii[9], (String)"6N+n6uzx6ue1s7q5tZ7c9d/47t/i8+G07PLp+enu+u6J7Mm92LvP3sTYxg==", (int)iliIiiliiiii[10], (int)iliIiiliiiii[11], (String)"7e/n", (int)iliIiiliiiii[12], (String)"o8bUyunf6+Gi4Obg5p286PXv7OKqt9X49Or2r+v36/OK6bvEvMHNlw==", (int)iliIiiliiiii[13], (int)iliIiiliiiii[14]);
        int n3 = (0x4935A181 | 0xF5BEA5C6) - (0x4935A181 & 0xF5BEA5C6);
        int cfr_ignored_0 = n3 + -172055098;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String Illillliilli(String string, int n, int n2) {
        if (IlIlllIlilIl) {
            throw new FileNotFoundException();
        }
        Object[] objectArray = new Object[7];
        objectArray[2] = Base64.getDecoder().decode(string);
        objectArray[1] = iliIiiliiiii[142];
        while ((Integer)objectArray[1] < ((byte[])objectArray[2]).length) {
            byte[] byArray = (byte[])objectArray[2];
            int n3 = (Integer)objectArray[1];
            objectArray[3] = n2;
            objectArray[6] = n;
            objectArray[3] = ((Integer)objectArray[6] | (Integer)objectArray[3]) & (~((Integer)objectArray[6]).intValue() | ~((Integer)objectArray[3]).intValue());
            objectArray[6] = (int)byArray[n3];
            objectArray[3] = (int)((Integer)objectArray[1]);
            objectArray[6] = 2 * ((Integer)objectArray[6] & ~((Integer)objectArray[3]).intValue()) - ((Integer)objectArray[6] ^ (Integer)objectArray[3]);
            byArray[n3] = (byte)(((Integer)objectArray[6] | (Integer)objectArray[3]) & (~((Integer)objectArray[6]).intValue() | ~((Integer)objectArray[3]).intValue()));
            int n4 = (0xAB0A2895 | 0x2B87400E) - (0xAB0A2895 & 0x2B87400E);
            int cfr_ignored_0 = n4 + 730284046;
            objectArray[1] = (Integer)objectArray[1] + 1;
        }
        try {
            return new String((byte[])objectArray[2], StandardCharsets.UTF_8);
        }
        catch (InstantiationError instantiationError) {
            throw instantiationError;
        }
        catch (UnknownError unknownError) {
            throw unknownError;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IliIlllilIi() {
        if (IlIlllIlilIl) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object[] objectArray = new Object[28];
        objectArray[11] = iliIiiliiiii[15];
        objectArray[4] = iliIiiliiiii[16];
        objectArray[0] = (int)((Integer)objectArray[11]);
        objectArray[11] = ((Integer)objectArray[0] ^ (Integer)objectArray[4]) + 2 * ((Integer)objectArray[0] & (Integer)objectArray[4]);
        objectArray[4] = iliIiiliiiii[17];
        objectArray[0] = (int)((Integer)objectArray[11]);
        objectArray[11] = 2 * ((Integer)objectArray[0] | (Integer)objectArray[4]) - ((Integer)objectArray[0] ^ (Integer)objectArray[4]);
        Object[] objectArray2 = new Object[((Integer)objectArray[11]).intValue()];
        objectArray[25] = iliIiiliiiii[18];
        objectArray[4] = iliIiiliiiii[19];
        objectArray[0] = (int)((Integer)objectArray[25]);
        objectArray[25] = 2 * ((Integer)objectArray[0] | (Integer)objectArray[4]) - ((Integer)objectArray[0] ^ (Integer)objectArray[4]);
        objectArray[4] = iliIiiliiiii[20];
        objectArray[0] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[0] | (Integer)objectArray[4]) & (~((Integer)objectArray[0]).intValue() | ~((Integer)objectArray[4]).intValue());
        objectArray2[((Integer)objectArray[25]).intValue()] = this;
        return (boolean)Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.IiIiliIiiiIi("82d46375-c0ba-4ece-a535-359eea7bc424", (Object)Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.IiIiliIiiiIi("a01dc4a8-82e1-4c7d-84d1-d7bb3f2640b8", (long)4759828902148724275L, (Object[])objectArray2, (String)"xu7r5Omxsay3uZ7hv97c3fPS9fnytdn16+/w8eru7O2IwsjEwsPpyLu/wH+6vsG91tLV1NLTkvjr6s3Ryu7x0KbppYSHpqSInnqdodx+nKCTt7i5t7OZuA==", (int)iliIiiliiiii[21], (String)"596m6evw6ea0srm4tJ3b9N737d7h8uCz6/Ho+Ojt+e2I68i817rO3cPXxQ==", (int)iliIiiliiiii[22], (int)iliIiiliiiii[23], (String)"7O7m", (int)iliIiiliiiii[24], (String)"osXTyeje6uCh3+Xf5Zy75/Tu6+GpttT38+n1rur26vKJ6LrDu8DMlg==", (int)iliIiiliiiii[25], (int)iliIiiliiiii[26]), (String)"xe3q4+iwsKu2uJ3gvt3b3PLR9PjxtNj06u7v8Ont6+yHwcfDwcLox7q+v365vcC81dHU09HSkffq6czQye3wz6XopIOGpaOHnXmcoNt9m5+Stre4trKYtw==", (int)iliIiiliiiii[27], (String)"5t2l6Orv6OWzsbi3s5za89327N3g8d+y6vDn9+fs+OyH6se71rnN3MLWxA==", (int)iliIiiliiiii[28], (int)iliIiiliiiii[29], (String)"7efE5uk=", (int)iliIiiliiiii[30], (String)"ocbh2+vdouTi4OadvOjd4+zeorPW", (int)iliIiiliiiii[31], (int)iliIiiliiiii[32]);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n;
        int n2 = n = (0xB9505F | 0x326C063F) - (0xB9505F & 0x326C063F);
        IIIllIIliIIl = n2 + 845940287 - (n2 & 0x326C063F) * 2;
        if (90319854 <= IIIllIIliIIl) {
        }
        Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.Iilililiiili();
        int n3 = (0x873614A2 | 0xC670E5CB) - (0x873614A2 & 0xC670E5CB);
        while (true) {
            int n4 = n3;
            switch (n4 + -965679669 - (n4 & 0xC670E5CB) * 2) {
                case 210445150: {
                    return;
                }
            }
            Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.IiIiliIiiiIi("1b36f348-ba46-46b3-8352-ef72911166e6", IliIlllilIi.class, (String)"vubj3OGpqaSvsZbZt9bU1evK7fHqrdHt4+fo6eLm5OWAusC8urvhwLO3uHeytrm1zsrNzMrLivDj4sXJwubpyJ7hnXx/npyAlnKVmdR2lJiLr7Cxr6uRsA==", (int)iliIiiliiiii[105], (String)"39ae4ePo4d6sqrGwrJXT7Nbv5dbZ6tir4+ng8ODl8eWA48C0z7LG1bvPvQ==", (int)iliIiiliiiii[106], (int)iliIiiliiiii[107], (String)"3uDV2cTa", (int)iliIiiliiiii[108], (String)"mr/a1OTWm93b2d+WwdPh7tWcrbc=", (int)iliIiiliiiii[109], (int)iliIiiliiiii[110]);
            n3 = (0xC8B235E | 0xC670E5CB) - (0xC8B235E & 0xC670E5CB);
        }
    }

    /*
     * Exception decompiling
     */
    public static String IlIillIiilIi(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [55[UNCONDITIONALDOLOOP]], but top level block is 1[TRYBLOCK]
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
    public void lIiiIiIlilli() {
        int n;
        int n2 = n = (0x4D0E1515 | 0xE3A32748) - (0x4D0E1515 & 0xE3A32748);
        if (897132465 >= n2 + -475846840 - (n2 & 0xE3A32748) * 2) {
            int n3 = n = (0x16 | 0xE3A32748) - (0x16 & 0xE3A32748);
            int cfr_ignored_0 = n3 + -475846840 - (n3 & 0xE3A32748) * 2;
        }
        Object[] objectArray = new Object[26];
        objectArray[4] = iliIiiliiiii[57];
        objectArray[12] = iliIiiliiiii[58];
        objectArray[18] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[18] ^ (Integer)objectArray[12]) + 2 * ((Integer)objectArray[18] & (Integer)objectArray[12]);
        objectArray[12] = iliIiiliiiii[59];
        objectArray[18] = (int)((Integer)objectArray[4]);
        objectArray[4] = 2 * ((Integer)objectArray[18] & ~((Integer)objectArray[12]).intValue()) - ((Integer)objectArray[18] ^ (Integer)objectArray[12]);
        Object[] objectArray2 = new Object[((Integer)objectArray[4]).intValue()];
        objectArray[23] = iliIiiliiiii[60];
        objectArray[12] = iliIiiliiiii[61];
        objectArray[18] = (int)((Integer)objectArray[23]);
        objectArray[23] = 2 * ((Integer)objectArray[18] & ~((Integer)objectArray[12]).intValue()) - ((Integer)objectArray[18] ^ (Integer)objectArray[12]);
        objectArray[12] = iliIiiliiiii[62];
        objectArray[18] = (int)((Integer)objectArray[23]);
        objectArray[23] = (Integer)objectArray[18] - ~((Integer)objectArray[12]).intValue() - 1;
        objectArray2[((Integer)objectArray[23]).intValue()] = this;
        Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.IiIiliIiiiIi("de55e32e-39b5-4d41-94ab-0220db626516", (long)-7841636698108012078L, (Object[])objectArray2, (String)"yvLv6O21tbC7vaLlw+Lg4ffW+f32ud357/P09e7y8PGMxszIxsftzL/DxIO+wsXB2tbZ2NbXlvzv7tHVzvL11KrtqYiLqqiMon6hpeCCoKSXu7y9u7edvA==", (int)iliIiiliiiii[63], (String)"6+Kq7e/07eq4tr28uKHf+OL78eLl9uS37/Xs/Ozx/fGM78zA277S4cfbyQ==", (int)iliIiiliiiii[64], (int)iliIiiliiiii[65], (String)"8PLq", (int)iliIiiliiiii[66], (String)"psnXzezi7uSl4+nj6aC/6/jy7+Wtutj79+35su767vaN7L7Hv8TQmg==", (int)iliIiiliiiii[67], (int)iliIiiliiiii[68]);
    }

    /*
     * Exception decompiling
     */
    public static Class IIIilIIiiIIi(String var0) {
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

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1_1, MethodType var2_2) {
        if (Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.IlIlllIlilIl) {
        }
        var20_6 = new Object[17];
        try {
            var20_6[14] = MethodHandles.lookup();
            var20_6[12] = ((MethodHandles.Lookup)var20_6[14]).findStatic(IliIlllilIi.class, "IIlilIliiIli", MethodType.fromMethodDescriptorString("(Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;ILjava/lang/String;II)Ljava/lang/invoke/MethodHandle;", var0.lookupClass().getClassLoader()));
            var20_6[6] = var2_2.parameterCount();
            var20_6[8] = Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.iliIiiliiiii[111];
            var20_6[3] = (int)((Integer)var20_6[6]);
            var16_3 = (1383426193 | 984015468) - (1383426193 & 984015468);
            var16_3 + 984015468;
            var20_6[4] = ((Integer)var20_6[3] & ~((Integer)var20_6[8]).intValue()) - (~((Integer)var20_6[3]).intValue() & (Integer)var20_6[8]);
            var20_6[9] = var2_2.dropParameterTypes((Integer)var20_6[4], (Integer)var20_6[6]);
        }
        catch (InstantiationError v1) {
            throw v1;
        }
        catch (SyncFailedException v2) {
            throw v2;
        }
        var20_6[11] = MethodHandles.invoker((MethodType)var20_6[9]);
        v0 = new Class[Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.iliIiiliiiii[112]];
        v0[Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.iliIiiliiiii[113]] = MethodHandle.class;
        var20_6[5] = ((MethodType)var20_6[9]).appendParameterTypes(v0);
        var20_6[8] = Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.iliIiiliiiii[114];
        var20_6[3] = (int)((Integer)var20_6[4]);
        var20_6[0] = new int[((Integer)var20_6[3] ^ (Integer)var20_6[8]) + 2 * ((Integer)var20_6[3] & (Integer)var20_6[8])];
        ((int[])var20_6[0])[Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.iliIiiliiiii[115]] = (Integer)var20_6[4];
        var17_4 = (1601429169 | -87008234) - (1601429169 & -87008234);
        var17_4 + -87008234;
        var20_6[7] = Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.iliIiiliiiii[116];
        if (true) ** GOTO lbl57
        block13: while (true) {
            v3 = var18_5;
            switch (v3 + -1903128608 - (v3 & -1903128608) * 2) {
                default: {
                    var20_6[8] = Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.iliIiiliiiii[117];
                    var20_6[3] = (int)((Integer)var20_6[4]);
                    if ((Integer)var20_6[7] >= (Integer)var20_6[3] - ~((Integer)var20_6[8]).intValue() - 1) {
                        var20_6[16] = MethodHandles.permuteArguments((MethodHandle)var20_6[11], (MethodType)var20_6[5], (int[])var20_6[0]);
                        var20_6[1] = MethodHandles.collectArguments((MethodHandle)var20_6[16], (Integer)var20_6[4], (MethodHandle)var20_6[12]);
                        var19_7 = (-1311436508 | 1406192600) - (-1311436508 & 1406192600);
                        var19_7 + 1406192600;
                        return new ConstantCallSite((MethodHandle)var20_6[1]);
                    }
                }
                var18_5 = (-330148289 | -1903128608) - (-330148289 & -1903128608);
                continue block13;
                case -330148289: 
            }
            var20_6[8] = Lusik21556.lIilliIill.Ilillllill.ilillIiill.liilliiill.IIIillIIil.iIIilIlIil.IliIlllilIi.iliIiiliiiii[118];
            var20_6[3] = (int)((Integer)var20_6[7]);
            ((int[])var20_6[0])[((Integer)var20_6[7]).intValue()] = 2 * ((Integer)var20_6[3] & ~((Integer)var20_6[8]).intValue()) - ((Integer)var20_6[3] ^ (Integer)var20_6[8]);
            var20_6[7] = (Integer)var20_6[7] + 1;
lbl57:
            // 2 sources

            var18_5 = (29240587 | -1903128608) - (29240587 & -1903128608);
        }
    }

    /*
     * Exception decompiling
     */
    public static void Iilililiiili() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [42[UNCONDITIONALDOLOOP]], but top level block is 0[TRYBLOCK]
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


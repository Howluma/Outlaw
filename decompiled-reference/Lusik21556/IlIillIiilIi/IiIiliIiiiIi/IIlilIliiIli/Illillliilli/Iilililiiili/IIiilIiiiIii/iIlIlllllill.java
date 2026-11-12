/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 */
package Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii;

import Lusik21556.llIililIil.IiIilliIil.iiIilIIlil.lIliliIlil.Illillllil.IliIlllilIi;
import java.io.SyncFailedException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public final class iIlIlllllill
implements CommandExecutor {
    private IliIlllilIi IliIlllilIi;
    static AtomicReferenceArray<MethodHandle> iIlIlllllill;
    public static int[] IilliliilIIi;
    public static int lIiiIiIlilli;
    public static boolean iliIiiliiiii;

    /*
     * Exception decompiling
     */
    public static String IilliliilIIi(String var0) {
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
    public iIlIlllllill(IliIlllilIi iliIlllilIi) {
        int n;
        int n2 = n = (0x2C547590 | 0xF860B16) - (0x2C547590 & 0xF860B16);
        if (209455158 >= n2 + 260442902 - (n2 & 0xF860B16) * 2) {
            int n3 = n = (0x4F4710B1 | 0xF860B16) - (0x4F4710B1 & 0xF860B16);
            lIiiIiIlilli = n3 + 260442902 - (n3 & 0xF860B16) * 2;
        }
        Object[] objectArray = new Object[28];
        objectArray[5] = IilliliilIIi[0];
        objectArray[15] = IilliliilIIi[1];
        objectArray[21] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[21] | (Integer)objectArray[15]) + ((Integer)objectArray[21] & (Integer)objectArray[15]);
        objectArray[15] = IilliliilIIi[2];
        objectArray[21] = (int)((Integer)objectArray[5]);
        objectArray[5] = ((Integer)objectArray[21] ^ (Integer)objectArray[15]) + 2 * ((Integer)objectArray[21] & (Integer)objectArray[15]);
        Object[] objectArray2 = new Object[((Integer)objectArray[5]).intValue()];
        objectArray[1] = IilliliilIIi[3];
        objectArray[15] = IilliliilIIi[4];
        objectArray[21] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[21] ^ (Integer)objectArray[15]) + 2 * ((Integer)objectArray[21] & (Integer)objectArray[15]);
        objectArray[15] = IilliliilIIi[5];
        objectArray[21] = (int)((Integer)objectArray[1]);
        objectArray[1] = ((Integer)objectArray[21] ^ (Integer)objectArray[15]) + 2 * ((Integer)objectArray[21] & (Integer)objectArray[15]);
        objectArray2[((Integer)objectArray[1]).intValue()] = this;
        objectArray[7] = IilliliilIIi[6];
        objectArray[15] = IilliliilIIi[7];
        objectArray[21] = (int)((Integer)objectArray[7]);
        objectArray[7] = ((Integer)objectArray[21] | (Integer)objectArray[15]) & (~((Integer)objectArray[21]).intValue() | ~((Integer)objectArray[15]).intValue());
        objectArray[15] = IilliliilIIi[8];
        objectArray[21] = (int)((Integer)objectArray[7]);
        objectArray[7] = (Integer)objectArray[21] - ~((Integer)objectArray[15]).intValue() - 1;
        objectArray2[((Integer)objectArray[7]).intValue()] = iliIlllilIi;
        Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.lIiiIiIlilli("20632124-dc92-4896-ac2a-c114efb3ae7c", (long)3498261507518278996L, (Object[])objectArray2, (int)IilliliilIIi[9], (String)"zM7G", (int)IilliliilIIi[10], (int)IilliliilIIi[11], (String)"gqWzqci+ysCBv8W/xXybx9TOy8GJlrTX08nVjsrWytJpyJqjm6Csdg==", (int)IilliliilIIi[12], (int)IilliliilIIi[13], (int)IilliliilIIi[14], (String)"ps7LxMmRkYyXmX6cup7Bvday1dTSttmTq8qtzMrOsdCjosWkZMbJpZufvaGfnsGds3nVubK2tLWuqq2xqq5q0IOHhYmHg4mIe399v19egYCWcpWUl3aZmNCKbZFvi4yNZmdlaWI=", (String)"x76GycvQycaUkpmYlH271L7Xzb7B0sCTy9HI2MjN2c1oy6ict5quvaO3pQ==");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String IIIllIIliIIl(String string, int n, int n2) {
        int n3;
        int n4 = n3 = (0xB8299C3 | 0x1E08AA7B) - (0xB8299C3 & 0x1E08AA7B);
        lIiiIiIlilli = n4 + 503884411 - (n4 & 0x1E08AA7B) * 2;
        if (267671500 <= lIiiIiIlilli) {
        }
        Object[] objectArray = new Object[6];
        objectArray[0] = Base64.getDecoder().decode(string);
        objectArray[4] = IilliliilIIi[82];
        block11: while (true) {
            if ((Integer)objectArray[4] >= ((byte[])objectArray[0]).length) {
                try {
                    return new String((byte[])objectArray[0], StandardCharsets.UTF_8);
                }
                catch (InstantiationError instantiationError) {
                    throw instantiationError;
                }
                catch (SyncFailedException syncFailedException) {
                    throw syncFailedException;
                }
            }
            int n5 = (0xD8EF3CE7 | 0x90BCFD18) - (0xD8EF3CE7 & 0x90BCFD18);
            block12: while (true) {
                int n6 = n5;
                switch (n6 + -1866662632 - (n6 & 0x90BCFD18) * 2) {
                    case -655409945: {
                        n5 = (0xE93DE408 | 0x90BCFD18) - (0xE93DE408 & 0x90BCFD18);
                        continue block12;
                    }
                    case -381819896: {
                        byte[] byArray = (byte[])objectArray[0];
                        int n7 = (Integer)objectArray[4];
                        objectArray[5] = n2;
                        objectArray[2] = n;
                        objectArray[5] = ((Integer)objectArray[2] | (Integer)objectArray[5]) & ~((Integer)objectArray[2] & (Integer)objectArray[5]);
                        objectArray[2] = (int)byArray[n7];
                        objectArray[5] = (int)((Integer)objectArray[4]);
                        objectArray[2] = ((Integer)objectArray[2] ^ (Integer)objectArray[5]) - 2 * (~((Integer)objectArray[2]).intValue() & (Integer)objectArray[5]);
                        byArray[n7] = (byte)(((Integer)objectArray[2] | (Integer)objectArray[5]) & ~((Integer)objectArray[2] & (Integer)objectArray[5]));
                        objectArray[4] = (Integer)objectArray[4] + 1;
                        continue block11;
                    }
                }
                break;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Class iIlIlllllill(String var0) {
        block46: {
            block45: {
                block44: {
                    block43: {
                        block42: {
                            if (Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.iliIiiliiiii) {
                                var8_1 = (-222850789 | -282233647) - (-222850789 & -282233647);
                            }
                            v0 = var8_1 = (373927056 | -282233647) - (373927056 & -282233647);
                            Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.lIiiIiIlilli = v0 + -282233647 - (v0 & -282233647) * 2;
                            if (964634833 <= Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.lIiiIiIlilli) {
                                throw null;
                            }
                            v1 = var8_1 = (1489209923 | -282233647) - (1489209923 & -282233647);
                            Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.lIiiIiIlilli = v1 + -282233647 - (v1 & -282233647) * 2;
                            if (2097823195 < Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.lIiiIiIlilli) {
                                throw new ArrayStoreException();
                            }
                            v2 = var8_1 = (2079498768 | -282233647) - (2079498768 & -282233647);
                            if (1718852112 >= v2 + -282233647 - (v2 & -282233647) * 2) {
                                0 & 1;
                            }
                            var6_2 = new Object[5];
                            if (var0 == null) break block42;
                            if (var0.isEmpty()) break block42;
                            switch (var0.charAt(Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.IilliliilIIi[77])) {
                                case 'B': {
                                    break block43;
                                }
                                case 'C': {
                                    var4_3 = (-1403240370 | 193583926) - (-1403240370 & 193583926);
                                    ** GOTO lbl68
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
                                    break block44;
                                }
                                case 'S': {
                                    break block45;
                                }
                                default: {
                                    var6_2[0] = var0;
                                    if (((String)var6_2[0]).startsWith("L") == false) return Class.forName((String)var6_2[0]);
                                    var5_4 = (509032707 | -895387740) - (509032707 & -895387740);
                                    break;
                                }
                            }
                            break block46;
                        }
                        var4_3 = (-1058919539 | 193583926) - (-1058919539 & 193583926);
                        ** GOTO lbl68
                    }
lbl54:
                    // 2 sources

                    while (true) {
                        var4_3 = (1391622440 | 193583926) - (1391622440 & 193583926);
                        ** GOTO lbl68
                        break;
                    }
                }
lbl58:
                // 2 sources

                while (true) {
                    try {
                        return Long.TYPE;
                    }
                    catch (IllegalAccessError v3) {
                        throw v3;
                    }
                    catch (CloneNotSupportedException v4) {
                        throw v4;
                    }
                    break;
                }
            }
            block36: while (true) {
                var4_3 = (-618579769 | 193583926) - (-618579769 & 193583926);
lbl68:
                // 4 sources

                v5 = var4_3;
                switch (v5 + 193583926 - (v5 & 193583926) * 2) {
                    case -94516809: {
                        ** continue;
                    }
                    case 1391622440: {
                        return Byte.TYPE;
                    }
                    case -1403240370: {
                        return Character.TYPE;
                    }
                    case 272349234: {
                        ** continue;
                    }
                    case -1768968737: {
                        continue block36;
                    }
                    case -618579769: {
                        return Short.TYPE;
                    }
                }
                break;
            }
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }
        block37: while (true) {
            v6 = var5_4;
            switch (v6 + -895387740 - (v6 & -895387740) * 2) {
                default: {
                    if (((String)var6_2[0]).endsWith(";") == false) return Class.forName((String)var6_2[0]);
                    var5_4 = (663108515 | -895387740) - (663108515 & -895387740);
                    continue block37;
                }
                case 663108515: {
                    break block37;
                }
                case -1541937052: 
            }
            break;
        }
        var6_2[4] = Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.IilliliilIIi[79];
        var6_2[3] = ((String)var6_2[0]).length();
        var6_2[0] = ((String)var6_2[0]).substring(Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.IilliliilIIi[78], (Integer)var6_2[3] + ~((Integer)var6_2[4]).intValue() + 1).replace(Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.IilliliilIIi[80], Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.IilliliilIIi[81]);
        return Class.forName((String)var6_2[0]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] stringArray) {
        int n;
        int n2 = n = (0x14DF50B7 | 0x945AA634) - (0x14DF50B7 & 0x945AA634);
        lIiiIiIlilli = n2 + -1805998540 - (n2 & 0x945AA634) * 2;
        if (569769369 < lIiiIiIlilli) {
            n = (0x591263B6 | 0x945AA634) - (0x591263B6 & 0x945AA634);
        }
        Object[] objectArray = new Object[35];
        objectArray[3] = IilliliilIIi[15];
        objectArray[26] = IilliliilIIi[16];
        objectArray[30] = (int)((Integer)objectArray[3]);
        objectArray[3] = ((Integer)objectArray[30] | (Integer)objectArray[26]) + ((Integer)objectArray[30] & (Integer)objectArray[26]);
        objectArray[26] = IilliliilIIi[17];
        objectArray[30] = (int)((Integer)objectArray[3]);
        objectArray[3] = (Integer)objectArray[30] - ~((Integer)objectArray[26]).intValue() - 1;
        Object[] objectArray2 = new Object[((Integer)objectArray[3]).intValue()];
        objectArray[12] = IilliliilIIi[18];
        objectArray[26] = IilliliilIIi[19];
        objectArray[30] = (int)((Integer)objectArray[12]);
        objectArray[12] = ((Integer)objectArray[30] ^ (Integer)objectArray[26]) + 2 * ((Integer)objectArray[30] & (Integer)objectArray[26]);
        objectArray[26] = IilliliilIIi[20];
        objectArray[30] = (int)((Integer)objectArray[12]);
        objectArray[12] = (Integer)objectArray[30] - ~((Integer)objectArray[26]).intValue() - 1;
        objectArray2[((Integer)objectArray[12]).intValue()] = this;
        objectArray[27] = IilliliilIIi[21];
        objectArray[26] = IilliliilIIi[22];
        objectArray[30] = (int)((Integer)objectArray[27]);
        objectArray[27] = (Integer)objectArray[30] - ~((Integer)objectArray[26]).intValue() - 1;
        objectArray[26] = IilliliilIIi[23];
        objectArray[30] = (int)((Integer)objectArray[27]);
        objectArray[27] = (Integer)objectArray[30] - ~((Integer)objectArray[26]).intValue() - 1;
        objectArray2[((Integer)objectArray[27]).intValue()] = commandSender;
        objectArray[18] = IilliliilIIi[24];
        objectArray[26] = IilliliilIIi[25];
        objectArray[30] = (int)((Integer)objectArray[18]);
        objectArray[18] = ((Integer)objectArray[30] ^ (Integer)objectArray[26]) + 2 * ((Integer)objectArray[30] & (Integer)objectArray[26]);
        objectArray[26] = IilliliilIIi[26];
        objectArray[30] = (int)((Integer)objectArray[18]);
        objectArray[18] = (Integer)objectArray[30] + ~((Integer)objectArray[26]).intValue() + 1;
        objectArray2[((Integer)objectArray[18]).intValue()] = command;
        objectArray[25] = IilliliilIIi[27];
        objectArray[26] = IilliliilIIi[28];
        objectArray[30] = (int)((Integer)objectArray[25]);
        objectArray[25] = ((Integer)objectArray[30] & ~((Integer)objectArray[26]).intValue()) - (~((Integer)objectArray[30]).intValue() & (Integer)objectArray[26]);
        objectArray[26] = IilliliilIIi[29];
        objectArray[30] = (int)((Integer)objectArray[25]);
        objectArray[25] = 2 * ((Integer)objectArray[30] | (Integer)objectArray[26]) - ((Integer)objectArray[30] ^ (Integer)objectArray[26]);
        objectArray2[((Integer)objectArray[25]).intValue()] = string;
        objectArray[4] = IilliliilIIi[30];
        objectArray[26] = IilliliilIIi[31];
        objectArray[30] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[30] & ~((Integer)objectArray[26]).intValue()) - (~((Integer)objectArray[30]).intValue() & (Integer)objectArray[26]);
        objectArray[26] = IilliliilIIi[32];
        objectArray[30] = (int)((Integer)objectArray[4]);
        objectArray[4] = ((Integer)objectArray[30] ^ (Integer)objectArray[26]) + 2 * ((Integer)objectArray[30] & (Integer)objectArray[26]);
        objectArray2[((Integer)objectArray[4]).intValue()] = stringArray;
        return (boolean)Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.lIiiIiIlilli("1619872f-2505-42ce-9c33-1709bfaee814", (Object)Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.lIiiIiIlilli("af7eb60b-37c5-4fa5-9154-6a322c3e5b1c", (long)-3256733417136662012L, (Object[])objectArray2, (int)IilliliilIIi[33], (String)"zc/H", (int)IilliliilIIi[34], (int)IilliliilIIi[35], (String)"g6a0qsm/y8GCwMbAxn2cyNXPzMKKl7XY1MrWj8vXy9NqyZuknKGtdw==", (int)IilliliilIIi[36], (int)IilliliilIIi[37], (int)IilliliilIIi[38], (String)"p8/MxcqSko2Ymn+du5/Cvtez1tXTt9qUrMuuzcvPstGko8alZcfKppygvqKgn8KetHrWurO3tbavq66yq69r0YSIhoqIhIqJfIB+wGBfgoGXc5aVmHeamdGLbpJwjI2OZ2hmamM=", (String)"yL+HyszRyseVk5qZlX681b/Yzr/C08GUzNLJ2cnO2s5pzKmduJuvvqS4pg=="), (int)IilliliilIIi[39], (String)"zMajxcg=", (int)IilliliilIIi[40], (int)IilliliilIIi[41], (String)"gKXAusq8gcPBv8V8m8e8wsu9gZK1", (int)IilliliilIIi[42], (int)IilliliilIIi[43], (int)IilliliilIIi[44], (String)"pMzJwsePj4qVl3yauJy/u9Sw09LQtNeRqcirysjMr86hoMOiYsTHo5mdu5+dnL+bsXfTt7C0srOsqKuvqKxozoGFg4eFgYeGeX17vV1cf36UcJOSlXSXls6Ia49tiYqLZGVjZ2A=", (String)"xbyEx8nOx8SSkJeWknu50rzVy7y/0L6Ryc/G1sbL18tmyaaatZisu6G1ow==");
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n;
        int n2 = n = (0x4AA7F45E | 0x1428CB10) - (0x4AA7F45E & 0x1428CB10);
        lIiiIiIlilli = n2 + 338217744 - (n2 & 0x1428CB10) * 2;
        if (1293174430 <= lIiiIiIlilli) {
            n = (0x3505EA23 | 0x1428CB10) - (0x3505EA23 & 0x1428CB10);
        }
        Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.IlIlllIlilIl();
        int n3 = (0xB6AFCCB6 | 0xA9998C2C) - (0xB6AFCCB6 & 0xA9998C2C);
        while (true) {
            int n4 = n3;
            switch (n4 + -1449554900 - (n4 & 0xA9998C2C) * 2) {
                case -1339270354: {
                    return;
                }
            }
            Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.lIiiIiIlilli("f4312f93-b547-4826-a5fa-80cdb9e2d07a", iIlIlllllill.class, (int)IilliliilIIi[45], (String)"xce8wKvB", (int)IilliliilIIi[46], (int)IilliliilIIi[47], (String)"gabBu8u9gsTCwMZ9qLrI1byDlJ4=", (int)IilliliilIIi[48], (int)IilliliilIIi[49], (int)IilliliilIIi[50], (String)"pc3Kw8iQkIuWmH2buZ3AvNWx1NPRtdiSqsmsy8nNsM+iocSjY8XIpJqevKCencCcsnjUuLG1s7Stqaywqa1pz4KGhIiGgoiHen58vl5dgH+VcZSTlnWYl8+JbJBuiouMZWZkaGE=", (String)"xr2FyMrPyMWTkZiXk3y6073WzL3A0b+SytDH18fM2MxnyqebtpmtvKK2pA==");
            n3 = (0xB02C5B2E | 0xA9998C2C) - (0xB02C5B2E & 0xA9998C2C);
        }
    }

    /*
     * Exception decompiling
     */
    public static void IlIlllIlilIl() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[CASE]], but top level block is 0[TRYBLOCK]
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1_1, MethodType var2_2) {
        if (Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.iliIiiliiiii) {
            v0 = var19_3 = (36 | 1858198280) - (36 & 1858198280);
            v0 + 1858198280 - (v0 & 1858198280) * 2;
        }
        var17_4 = new Object[14];
        var17_4[8] = MethodHandles.lookup();
        var17_4[0] = ((MethodHandles.Lookup)var17_4[8]).findStatic(iIlIlllllill.class, "iliIiiliiiii", MethodType.fromMethodDescriptorString("(ILjava/lang/String;IILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/invoke/MethodHandle;", var0.lookupClass().getClassLoader()));
        var17_4[13] = var2_2.parameterCount();
        var17_4[3] = Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.IilliliilIIi[51];
        var17_4[6] = (int)((Integer)var17_4[13]);
        var17_4[4] = ((Integer)var17_4[6] & ~((Integer)var17_4[3]).intValue()) - (~((Integer)var17_4[6]).intValue() & (Integer)var17_4[3]);
        var17_4[12] = var2_2.dropParameterTypes((Integer)var17_4[4], (Integer)var17_4[13]);
        var17_4[5] = MethodHandles.invoker((MethodType)var17_4[12]);
        v1 = new Class[Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.IilliliilIIi[52]];
        v1[Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.IilliliilIIi[53]] = MethodHandle.class;
        var17_4[9] = ((MethodType)var17_4[12]).appendParameterTypes(v1);
        var17_4[3] = Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.IilliliilIIi[54];
        var17_4[6] = (int)((Integer)var17_4[4]);
        var17_4[1] = new int[((Integer)var17_4[6] ^ (Integer)var17_4[3]) + 2 * ((Integer)var17_4[6] & (Integer)var17_4[3])];
        ((int[])var17_4[1])[Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.IilliliilIIi[55]] = (Integer)var17_4[4];
        var17_4[2] = Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.IilliliilIIi[56];
        while (true) {
            var16_5 = (-1888280205 | 41486762) - (-1888280205 & 41486762);
            if (true) ** GOTO lbl45
            block13: while (true) {
                try {
                    var17_4[3] = Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.IilliliilIIi[58];
                    var17_4[6] = (int)((Integer)var17_4[2]);
                    ((int[])var17_4[1])[((Integer)var17_4[2]).intValue()] = (Integer)var17_4[6] + ~((Integer)var17_4[3]).intValue() + 1;
                    var17_4[2] = (Integer)var17_4[2] + 1;
                    var16_5 = (-453647373 | 41486762) - (-453647373 & 41486762);
                }
                catch (CloneNotSupportedException v2) {
                    throw v2;
                }
                catch (SyncFailedException v3) {
                    throw v3;
                }
                {
                    while (true) {
                        var17_4[10] = MethodHandles.permuteArguments((MethodHandle)var17_4[5], (MethodType)var17_4[9], (int[])var17_4[1]);
                        var17_4[7] = MethodHandles.collectArguments((MethodHandle)var17_4[10], (Integer)var17_4[4], (MethodHandle)var17_4[0]);
                        return new ConstantCallSite((MethodHandle)var17_4[7]);
                    }
                }
lbl45:
                // 2 sources

                v4 = var16_5;
                switch (v4 + 41486762 - (v4 & 41486762) * 2) {
                    default: {
                        var17_4[3] = Lusik21556.IlIillIiilIi.IiIiliIiiiIi.IIlilIliiIli.Illillliilli.Iilililiiili.IIiilIiiiIii.iIlIlllllill.IilliliilIIi[57];
                        var17_4[6] = (int)((Integer)var17_4[4]);
                        if ((Integer)var17_4[2] >= ((Integer)var17_4[6] | (Integer)var17_4[3]) + ((Integer)var17_4[6] & (Integer)var17_4[3])) ** continue;
                        continue block13;
                    }
                    case -127978511: {
                        continue block13;
                    }
                    case -453647373: 
                }
                break;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public static MethodHandle iliIiiliiiii(int var0, String var1_1, int var2_2, int var3_3, String var4_4, int var5_5, int var6_6, int var7_7, String var8_8, String var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: First case is not immediately after switch.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:442)
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
}


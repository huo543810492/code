package Theory.sqlRelated;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateSQL {
    public static void main(String[] args) {
        String[] oldSpotCodes = {
                "1INUSDT_CC1808","AAVUSDT_CC1808","AGIUSDT_CC1808","ALGUSDT_CC1808","ANKUSDT_CC1808","ANTUSDT_CC1808","APTUSDT_CC1808","ARBUSDT_CC1808","ATOUSDT_CC1808","AUDUSDT_CC1808","AVAUSDT_CC1808","AXSUSDT_CC1808","BALUSDT_CC1808","BATUSDT_CC1808","CAKUSDT_CC1808","CELUSDT_CC1808","CHZUSDT_CC1808","COMUSDT_CC1808","CRVUSDT_CC1808","DASUSDT_CC1808","DCRUSDT_CC1808","DOTUSDT_CC1808","DYDUSDT_CC1808","EGLUSDT_CC1808","ENJUSDT_CC1808","ENSUSDT_CC1808","EOSUSDT_CC1808","ETCUSDT_CC1808","FETUSDT_CC1808","FILUSDT_CC1808","FLOUSDT_CC1808","FTMUSDT_CC1808","GALUSDT_CC1808","GLMUSDT_CC1808","GMTUSDT_CC1808","GNOUSDT_CC1808","GRTUSDT_CC1808","ICPUSDT_CC1808","ILVUSDT_CC1808","IMXUSDT_CC1808","INJUSDT_CC1808","IOSUSDT_CC1808","IOTUSDT_CC1808","JASUSDT_CC1808","JSTUSDT_CC1808","KAVUSDT_CC1808","KLAUSDT_CC1808","KSMUSDT_CC1808","LDOUSDT_CC1808","LINUSDT_CC1808","LPTUSDT_CC1808","LRCUSDT_CC1808","LUUSDT_CC1808","LUNUSDT_CC1808","MANUSDT_CC1808","MASUSDT_CC1808","MINUSDT_CC1808","MKRUSDT_CC1808","NEAUSDT_CC1808","NEOUSDT_CC1808","OCEUSDT_CC1808","ONEUSDT_CC1808","ONTUSDT_CC1808","OPUSDT_CC1808","PAXUSDT_CC1808","PEPUSDT_CC1808","QNTUSDT_CC1808","QTUUSDT_CC1808","RNDUSDT_CC1808","ROSUSDT_CC1808","RUNUSDT_CC1808","RVNUSDT_CC1808","SANUSDT_CC1808","SCUSDT_CC1808","SFPUSDT_CC1808","SHIUSDT_CC1808","SNXUSDT_CC1808","STOUSDT_CC1808","STXUSDT_CC1808","SUIUSDT_CC1808","SUSUSDT_CC1808","SXPUSDT_CC1808","TFUUSDT_CC1808","THEUSDT_CC1808","TOMUSDT_CC1808","TRBUSDT_CC1808","UNIUSDT_CC1808","VETUSDT_CC1808","WAVUSDT_CC1808","WAXUSDT_CC1808","WLDUSDT_CC1808","WOOUSDT_CC1808","XDCUSDT_CC1808","XEMUSDT_CC1808","XMRUSDT_CC1808","XTZUSDT_CC1808","YFIUSDT_CC1808","ZECUSDT_CC1808","ZILUSDT_CC1808","USDUSDT_CC1808","BNBUSDT_CC1808","XLMUSDT_CC1808","BANUSDT_CC1808","JOEUSDT_CC1808","CEUSDT_CC1808","UMAUSDT_CC1808","SNTUSDT_CC1808"
        };

        String[] newSpotCodes = {
                "1INUSDT_CC","AAVUSDT_CC","AGIUSDT_CC","ALGUSDT_CC","ANKUSDT_CC","ANTUSDT_CC","APTUSDT_CC","ARBUSDT_CC","ATOUSDT_CC","AUDUSDT_CC","AVAUSDT_CC","AXSUSDT_CC","BALUSDT_CC","BATUSDT_CC","CAKUSDT_CC","CELUSDT_CC","CHZUSDT_CC","COMUSDT_CC","CRVUSDT_CC","DASUSDT_CC","DCRUSDT_CC","DOTUSDT_CC","DYDUSDT_CC","EGLUSDT_CC","ENJUSDT_CC","ENSUSDT_CC","EOSUSDT_CC","ETCUSDT_CC","FETUSDT_CC","FILUSDT_CC","FLOUSDT_CC","FTMUSDT_CC","GALUSDT_CC","GLMUSDT_CC","GMTUSDT_CC","GNOUSDT_CC","GRTUSDT_CC","ICPUSDT_CC","ILVUSDT_CC","IMXUSDT_CC","INJUSDT_CC","IOSUSDT_CC","IOTUSDT_CC","JASUSDT_CC","JSTUSDT_CC","KAVUSDT_CC","KLAUSDT_CC","KSMUSDT_CC","LDOUSDT_CC","LINUSDT_CC","LPTUSDT_CC","LRCUSDT_CC","LUUSDT_CC","LUNUSDT_CC","MANUSDT_CC","MASUSDT_CC","MINUSDT_CC","MKRUSDT_CC","NEAUSDT_CC","NEOUSDT_CC","OCEUSDT_CC","ONEUSDT_CC","ONTUSDT_CC","OPUSDT_CC","PAXUSDT_CC","PEPUSDT_CC","QNTUSDT_CC","QTUUSDT_CC","RNDUSDT_CC","ROSUSDT_CC","RUNUSDT_CC","RVNUSDT_CC","SANUSDT_CC","SCUSDT_CC","SFPUSDT_CC","SHIUSDT_CC","SNXUSDT_CC","STOUSDT_CC","STXUSDT_CC","SUIUSDT_CC","SUSUSDT_CC","SXPUSDT_CC","TFUUSDT_CC","THEUSDT_CC","TOMUSDT_CC","TRBUSDT_CC","UNIUSDT_CC","VETUSDT_CC","WAVUSDT_CC","WAXUSDT_CC","WLDUSDT_CC","WOOUSDT_CC","XDCUSDT_CC","XEMUSDT_CC","XMRUSDT_CC","XTZUSDT_CC","YFIUSDT_CC","ZECUSDT_CC","ZILUSDT_CC","USDUSDT_CC","BNBUSDT_CC","XLMUSDT_CC","BANUSDT_CC","JOEUSDT_CC","CEUSDT_CC","UMAUSDT_CC","SNTUSDT_CC"
        };

        String[] newCommodityCodes = {
                "1INUSD","AAVUSD","AGIUSD","ALGUSD","ANKUSD","ANTUSD","APTUSD","ARBUSD","ATOUSD","AUDUSD","AVAUSD","AXSUSD","BALUSD","BATUSD","CAKUSD","CELUSD","CHZUSD","COMUSD","CRVUSD","DASUSD","DCRUSD","DOTUSD","DYDUSD","EGLUSD","ENJUSD","ENSUSD","EOSUSD","ETCUSD","FETUSD","FILUSD","FLOUSD","FTMUSD","GALUSD","GLMUSD","GMTUSD","GNOUSD","GRTUSD","ICPUSD","ILVUSD","IMXUSD","INJUSD","IOSUSD","IOTUSD","JASUSD","JSTUSD","KAVUSD","KLAUSD","KSMUSD","LDOUSD","LINUSD","LPTUSD","LRCUSD","LUUSD","LUNUSD","MANUSD","MASUSD","MINUSD","MKRUSD","NEAUSD","NEOUSD","OCEUSD","ONEUSD","ONTUSD","OPUSD","PAXUSD","PEPUSD","QNTUSD","QTUUSD","RNDUSD","ROSUSD","RUNUSD","RVNUSD","SANUSD","SCUSD","SFPUSD","SHIUSD","SNXUSD","STOUSD","STXUSD","SUIUSD","SUSUSD","SXPUSD","TFUUSD","THEUSD","TOMUSD","TRBUSD","UNIUSD","VETUSD","WAVUSD","WAXUSD","WLDUSD","WOOUSD","XDCUSD","XEMUSD","XMRUSD","XTZUSD","YFIUSD","ZECUSD","ZILUSD","USDUSD","BNBUSD","XLMUSD","BANUSD","JOEUSD","CEUSD","UMAUSD","SNTUSD"
        };

        // 输出SQL文件路径
        String outputPath = System.getProperty("user.home") + "/Desktop/output.sql";

        try {
            // 创建输出流
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

            // 循环生成SQL语句
            for (int i = 0; i < oldSpotCodes.length; i++) {
                String oldSpotCode = oldSpotCodes[i];
                String newSpotCode = newSpotCodes[i];
                String newCommodityCode = newCommodityCodes[i];

                // kline_01,SQL语句
                String kline_01 = String.format(
                        "INSERT INTO public.kline_01 (\"contractCode\", \"dTime\", \"openPrice\", \"maxPrice\", \"minPrice\", \"closePrice\", stime, volume, \"commodityCode\")" +
                                " (SELECT '%s', \"dTime\", \"openPrice\", \"maxPrice\", \"minPrice\", \"closePrice\", stime, volume, '%s'" +
                                " FROM public.kline_01 WHERE \"contractCode\" = '%s' AND" +
                                " \"dTime\" NOT IN (SELECT \"dTime\" FROM public.kline_01 WHERE \"contractCode\" = '%s'));",
                        newSpotCode, newCommodityCode, oldSpotCode, newSpotCode
                );

                // kline_03,SQL语句
                String kline_03 = String.format(
                        "INSERT INTO public.kline_03 (\"contractCode\", \"dTime\", \"openPrice\", \"maxPrice\", \"minPrice\", \"closePrice\", stime, volume, \"commodityCode\")" +
                                " (SELECT '%s', \"dTime\", \"openPrice\", \"maxPrice\", \"minPrice\", \"closePrice\", stime, volume, '%s'" +
                                " FROM public.kline_03 WHERE \"contractCode\" = '%s' AND" +
                                " \"dTime\" NOT IN (SELECT \"dTime\" FROM public.kline_03 WHERE \"contractCode\" = '%s'));",
                        newSpotCode, newCommodityCode, oldSpotCode, newSpotCode
                );

                // kline_05,SQL语句
                String kline_05 = String.format(
                        "INSERT INTO public.kline_05 (\"contractCode\", \"dTime\", \"openPrice\", \"maxPrice\", \"minPrice\", \"closePrice\", stime, volume, \"commodityCode\")" +
                                " (SELECT '%s', \"dTime\", \"openPrice\", \"maxPrice\", \"minPrice\", \"closePrice\", stime, volume, '%s'" +
                                " FROM public.kline_05 WHERE \"contractCode\" = '%s' AND" +
                                " \"dTime\" NOT IN (SELECT \"dTime\" FROM public.kline_05 WHERE \"contractCode\" = '%s'));",
                        newSpotCode, newCommodityCode, oldSpotCode, newSpotCode
                );

                // kline_15,SQL语句
                String kline_15 = String.format(
                        "INSERT INTO public.kline_15 (\"contractCode\", \"dTime\", \"openPrice\", \"maxPrice\", \"minPrice\", \"closePrice\", stime, volume, \"commodityCode\")" +
                                " (SELECT '%s', \"dTime\", \"openPrice\", \"maxPrice\", \"minPrice\", \"closePrice\", stime, volume, '%s'" +
                                " FROM public.kline_15 WHERE \"contractCode\" = '%s' AND" +
                                " \"dTime\" NOT IN (SELECT \"dTime\" FROM public.kline_15 WHERE \"contractCode\" = '%s'));",
                        newSpotCode, newCommodityCode, oldSpotCode, newSpotCode
                );

                // kline_30,SQL语句
                String kline_30 = String.format(
                        "INSERT INTO public.kline_30 (\"contractCode\", \"dTime\", \"openPrice\", \"maxPrice\", \"minPrice\", \"closePrice\", stime, volume, \"commodityCode\")" +
                                " (SELECT '%s', \"dTime\", \"openPrice\", \"maxPrice\", \"minPrice\", \"closePrice\", stime, volume, '%s'" +
                                " FROM public.kline_30 WHERE \"contractCode\" = '%s' AND" +
                                " \"dTime\" NOT IN (SELECT \"dTime\" FROM public.kline_30 WHERE \"contractCode\" = '%s'));",
                        newSpotCode, newCommodityCode, oldSpotCode, newSpotCode
                );

                // 生成kline_60,SQL语句
                String kline_60 = String.format(
                        "INSERT INTO public.kline_60 (\"contractCode\", \"dTime\", \"openPrice\", \"maxPrice\", \"minPrice\", \"closePrice\", stime, volume, \"commodityCode\")" +
                                " (SELECT '%s', \"dTime\", \"openPrice\", \"maxPrice\", \"minPrice\", \"closePrice\", stime, volume, '%s'" +
                                " FROM public.kline_60 WHERE \"contractCode\" = '%s' AND" +
                                " \"dTime\" NOT IN (SELECT \"dTime\" FROM public.kline_60 WHERE \"contractCode\" = '%s'));",
                        newSpotCode, newCommodityCode, oldSpotCode, newSpotCode
                );

                // kline_day,SQL语句
                String kline_day = String.format(
                        "INSERT INTO public.kline_day (\"contractCode\", \"dTime\", \"openPrice\", \"maxPrice\", \"minPrice\", \"closePrice\", stime, volume, \"commodityCode\")" +
                                " (SELECT '%s', \"dTime\", \"openPrice\", \"maxPrice\", \"minPrice\", \"closePrice\", stime, volume, '%s'" +
                                " FROM public.kline_day WHERE \"contractCode\" = '%s' AND" +
                                " \"dTime\" NOT IN (SELECT \"dTime\" FROM public.kline_day WHERE \"contractCode\" = '%s'));",
                        newSpotCode, newCommodityCode, oldSpotCode, newSpotCode
                );

                // 写入SQL语句到文件
                writer.write(kline_01);
                writer.write(kline_03);
                writer.write(kline_05);
                writer.write(kline_15);
                writer.write(kline_30);
                writer.write(kline_60);
                writer.write(kline_day);
                writer.newLine();
            }

            // 关闭输出流
            writer.close();
            System.out.println("SQL 文件已生成：" + outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

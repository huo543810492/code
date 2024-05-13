package Theory.sqlRelated;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateTickerTableIndex {
    public static void main(String[] args) {


        String[] newSpotCodes = {
                "1INUSDT_CC","AAVUSDT_CC","AGIUSDT_CC","ALGUSDT_CC","ANKUSDT_CC","ANTUSDT_CC","APTUSDT_CC","ARBUSDT_CC","ATOUSDT_CC","AUDUSDT_CC","AVAUSDT_CC","AXSUSDT_CC","BALUSDT_CC","BATUSDT_CC","CAKUSDT_CC","CELUSDT_CC","CHZUSDT_CC","COMUSDT_CC","CRVUSDT_CC","DASUSDT_CC","DCRUSDT_CC","DOTUSDT_CC","DYDUSDT_CC","EGLUSDT_CC","ENJUSDT_CC","ENSUSDT_CC","EOSUSDT_CC","ETCUSDT_CC","FETUSDT_CC","FILUSDT_CC","FLOUSDT_CC","FTMUSDT_CC","GALUSDT_CC","GLMUSDT_CC","GMTUSDT_CC","GNOUSDT_CC","GRTUSDT_CC","ICPUSDT_CC","ILVUSDT_CC","IMXUSDT_CC","INJUSDT_CC","IOSUSDT_CC","IOTUSDT_CC","JASUSDT_CC","JSTUSDT_CC","KAVUSDT_CC","KLAUSDT_CC","KSMUSDT_CC","LDOUSDT_CC","LINUSDT_CC","LPTUSDT_CC","LRCUSDT_CC","LUUSDT_CC","LUNUSDT_CC","MANUSDT_CC","MASUSDT_CC","MINUSDT_CC","MKRUSDT_CC","NEAUSDT_CC","NEOUSDT_CC","OCEUSDT_CC","ONEUSDT_CC","ONTUSDT_CC","OPUSDT_CC","PAXUSDT_CC","PEPUSDT_CC","QNTUSDT_CC","QTUUSDT_CC","RNDUSDT_CC","ROSUSDT_CC","RUNUSDT_CC","RVNUSDT_CC","SANUSDT_CC","SCUSDT_CC","SFPUSDT_CC","SHIUSDT_CC","SNXUSDT_CC","STOUSDT_CC","STXUSDT_CC","SUIUSDT_CC","SUSUSDT_CC","SXPUSDT_CC","TFUUSDT_CC","THEUSDT_CC","TOMUSDT_CC","TRBUSDT_CC","UNIUSDT_CC","VETUSDT_CC","WAVUSDT_CC","WAXUSDT_CC","WLDUSDT_CC","WOOUSDT_CC","XDCUSDT_CC","XEMUSDT_CC","XMRUSDT_CC","XTZUSDT_CC","YFIUSDT_CC","ZECUSDT_CC","ZILUSDT_CC","USDUSDT_CC","BNBUSDT_CC","XLMUSDT_CC","BANUSDT_CC","JOEUSDT_CC","CEUSDT_CC","UMAUSDT_CC","SNTUSDT_CC"
        };



        // 输出SQL文件路径
        String outputPath = System.getProperty("user.home") + "/Desktop/GenTableIndex.sql";

        try {
            // 创建输出流
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

            // 循环生成SQL语句
            for (int i = 0; i < newSpotCodes.length; i++) {
                String newSpotCode = newSpotCodes[i].toLowerCase();
                String indexName = "ticker_"+ newSpotCode +"_1_contract_time_idx_newspot";
                String tableName = "ticker_"+ newSpotCode +"_1";

                String baseSql = "CREATE UNIQUE INDEX \"" + indexName + "\" ON \"public\".\"" + tableName + "\" USING btree (\"symbol\" COLLATE \"pg_catalog\".\"default\" \"pg_catalog\".\"text_ops\" ASC NULLS LAST, \"time\" \"pg_catalog\".\"int8_ops\" ASC NULLS LAST);";


                String sql = String.format(baseSql, newSpotCode);
                System.out.println(sql);

                // 写入SQL语句到文件
                writer.write(sql);
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

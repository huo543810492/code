package Theory.sqlRelated;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UpdateDepthConfig {
    public static void main(String[] args) {
        // 定义交易对和相应的深度配置
        Map<String, String> symbols = new HashMap<>();
        symbols.put("1inchusdt", "0.00005");
        symbols.put("aaveusdt", "0.005");
        symbols.put("adausdt", "0.001");
        // ...（其余的交易对和对应的值）
        symbols.put("zilusdt", "0.000005");

        // 文件名
        String fileName = "update_depth_config.sql";

        // 生成 SQL 并写入文件
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Map.Entry<String, String> entry : symbols.entrySet()) {
                String symbol = entry.getKey();
                String depthConfig = entry.getValue();
                String sql = String.format("UPDATE `spot_config` SET `depth_config` = '%s' WHERE `symbol` = '%s';\n", depthConfig, symbol);
                writer.write(sql);
            }
            System.out.println("SQL statements have been written to " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}

package Theory.streamRelated;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 委托订单
 * 注意：委托订单并没有写入数据库
 */
@Data
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class NewSpotOrder  implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long uid;

    private Integer userType;    // 0 user 1 system 2 robot

    private String symbol;                  //  合约ID

    private String orderNo;                 // 订单号

    protected Integer side;                  // 1买/2卖

    private BigDecimal price;               // 挂单价格

    private BigDecimal volume;              // 挂单交易数量

}

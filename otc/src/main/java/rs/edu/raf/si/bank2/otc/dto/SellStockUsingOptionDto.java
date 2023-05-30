package rs.edu.raf.si.bank2.otc.dto;

import lombok.Data;

@Data
public class SellStockUsingOptionDto {
    private String stockSymbol;
    private Integer optionAmount;
    private Double strikePrice;
}

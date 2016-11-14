package com.infiniteskills.data.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="STOCK")
@DiscriminatorValue("ST")
public class Stock extends Investment {

//	@Id
//	@GeneratedValue
//	@Column(name="STOCK_ID")
//	private Long stockId;

	@Column(name="SHARE_PRICE")
	private BigDecimal sharePrice;

	@Column(name="QUANTITY")
	private BigDecimal quantity;

//	@Column(name="PORTFOLIO_ID")
//	private Long portfolioId;

//	public Long getStockId() {
//		return stockId;
//	}
//
//	public void setStockId(Long stockId) {
//		this.stockId = stockId;
//	}

	public BigDecimal getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(BigDecimal sharePrice) {
		this.sharePrice = sharePrice;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

//	public Long getPortfolioId() {
//		return portfolioId;
//	}
//
//	public void setPortfolioId(Long portfolioId) {
//		this.portfolioId = portfolioId;
//	}
}

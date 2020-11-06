package com.rp.pojo;


public class TGoods {

  private long goodsId;
  private String title;
  private String subTitle;
  private double originalCost;
  private double currentPrice;
  private double discount;
  private long isFreeDelivery;
  private long categoryId;


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }


  public double getOriginalCost() {
    return originalCost;
  }

  public void setOriginalCost(double originalCost) {
    this.originalCost = originalCost;
  }


  public double getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(double currentPrice) {
    this.currentPrice = currentPrice;
  }


  public double getDiscount() {
    return discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }


  public long getIsFreeDelivery() {
    return isFreeDelivery;
  }

  public void setIsFreeDelivery(long isFreeDelivery) {
    this.isFreeDelivery = isFreeDelivery;
  }


  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }

}

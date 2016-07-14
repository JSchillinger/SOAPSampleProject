/**
 * InvestmentDetailsGetResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.sly.www.main.server.webservice.bindings;

public class InvestmentDetailsGetResponse  extends org.sly.www.main.server.webservice.bindings.MyResponse  implements java.io.Serializable {
    /* Strategy name. */
    private java.lang.String name;

    /* Strategy Sector. */
    private java.lang.String sector;

    /* Strategy Currency. */
    private java.lang.String currency;

    /* Date last value */
    private java.util.Date lastValueDate;

    /* Last value. */
    private double lastValue;

    /* Date last value */
    private java.util.Date firstValueDate;

    /* Last value. */
    private double firstValue;

    /* Strategy isin. */
    private java.lang.String isin;

    /* Strategy Live Start Date. */
    private java.util.Date inception;

    /* Strategy AUM. */
    private java.lang.String AUM;

    /* The simple returns (ie not annualized) of the
     * 									timeseries over different
     * 									time periods. */
    private org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] simpleReturnByTimeFrame;

    /* The annualized returns of the timeseries over
     * 									different
     * 									time periods. */
    private org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] annualizedReturnByTimeFrame;

    /* The volalatitlity of the timeseries over
     * 									different
     * 									time periods. */
    private org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] volatilityByTimeFrame;

    /* The downside volalatitlity of the timeseries
     * 									over
     * 									different
     * 									time periods. */
    private org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] downsideVolatilityByTimeFrame;

    /* Thesharpe ratio (assuming 0% risk free interest
     * 									rate) of the timeseries
     * 									over
     * 									different
     * 									time periods. */
    private org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] sharpeRatioByTimeFrame;

    /* The maximum drawdown in % (0.01 is 1.00%). The
     * 									maximum drawdown if the percentage loss if an investor would
     * have
     * 									invested at the highest point and sold at the lowest point
     * 									thereafter. */
    private java.math.BigDecimal maxDrawdownPercent;

    /* The value of the timeseries at the start of the
     * 									drawdown period. */
    private java.math.BigDecimal maxDrawdownPeakValue;

    /* The date at the start of the drawdown period. */
    private java.util.Date maxDrawdownPeakDate;

    /* The value of the timeseries at the end of the
     * 									drawdown period. */
    private java.math.BigDecimal maxDrawdownValleyValue;

    /* The date at the end of the drawdown period. */
    private java.util.Date maxDrawdownValleyDate;

    /* The percentage of negative months over the total
     * 									number of months. */
    private java.math.BigDecimal percentNegMonths;

    /* % of positive months over the total number of
     * 									months. */
    private java.math.BigDecimal percentPosMonths;

    /* The number of negative months over the total
     * 									number of months. */
    private java.math.BigDecimal numberNegMonths;

    /* The number of positive months over the total
     * 									number of
     * 									months. */
    private java.math.BigDecimal numberPosMonths;

    /* %-age return of best month (0.01 is 1.00%). */
    private java.math.BigDecimal returnBestMonth;

    /* %-age return of worst month (0.01 is 1.00%). */
    private java.math.BigDecimal returnWorstMonth;

    private java.lang.String assetClass;

    private java.lang.String region;

    private java.lang.String investmentType;

    private java.lang.String managerCompanyName;

    private java.lang.String managerPersonName;

    private java.math.BigDecimal minInvest;

    private java.math.BigDecimal minSubsequentInvest;

    private java.math.BigDecimal managementFeeRate;

    private java.math.BigDecimal ongoingChargeFeeRate;

    public InvestmentDetailsGetResponse() {
    }

    public InvestmentDetailsGetResponse(
           boolean success,
           java.lang.String errorMessage,
           java.lang.String name,
           java.lang.String sector,
           java.lang.String currency,
           java.util.Date lastValueDate,
           double lastValue,
           java.util.Date firstValueDate,
           double firstValue,
           java.lang.String isin,
           java.util.Date inception,
           java.lang.String AUM,
           org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] simpleReturnByTimeFrame,
           org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] annualizedReturnByTimeFrame,
           org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] volatilityByTimeFrame,
           org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] downsideVolatilityByTimeFrame,
           org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] sharpeRatioByTimeFrame,
           java.math.BigDecimal maxDrawdownPercent,
           java.math.BigDecimal maxDrawdownPeakValue,
           java.util.Date maxDrawdownPeakDate,
           java.math.BigDecimal maxDrawdownValleyValue,
           java.util.Date maxDrawdownValleyDate,
           java.math.BigDecimal percentNegMonths,
           java.math.BigDecimal percentPosMonths,
           java.math.BigDecimal numberNegMonths,
           java.math.BigDecimal numberPosMonths,
           java.math.BigDecimal returnBestMonth,
           java.math.BigDecimal returnWorstMonth,
           java.lang.String assetClass,
           java.lang.String region,
           java.lang.String investmentType,
           java.lang.String managerCompanyName,
           java.lang.String managerPersonName,
           java.math.BigDecimal minInvest,
           java.math.BigDecimal minSubsequentInvest,
           java.math.BigDecimal managementFeeRate,
           java.math.BigDecimal ongoingChargeFeeRate) {
        super(
            success,
            errorMessage);
        this.name = name;
        this.sector = sector;
        this.currency = currency;
        this.lastValueDate = lastValueDate;
        this.lastValue = lastValue;
        this.firstValueDate = firstValueDate;
        this.firstValue = firstValue;
        this.isin = isin;
        this.inception = inception;
        this.AUM = AUM;
        this.simpleReturnByTimeFrame = simpleReturnByTimeFrame;
        this.annualizedReturnByTimeFrame = annualizedReturnByTimeFrame;
        this.volatilityByTimeFrame = volatilityByTimeFrame;
        this.downsideVolatilityByTimeFrame = downsideVolatilityByTimeFrame;
        this.sharpeRatioByTimeFrame = sharpeRatioByTimeFrame;
        this.maxDrawdownPercent = maxDrawdownPercent;
        this.maxDrawdownPeakValue = maxDrawdownPeakValue;
        this.maxDrawdownPeakDate = maxDrawdownPeakDate;
        this.maxDrawdownValleyValue = maxDrawdownValleyValue;
        this.maxDrawdownValleyDate = maxDrawdownValleyDate;
        this.percentNegMonths = percentNegMonths;
        this.percentPosMonths = percentPosMonths;
        this.numberNegMonths = numberNegMonths;
        this.numberPosMonths = numberPosMonths;
        this.returnBestMonth = returnBestMonth;
        this.returnWorstMonth = returnWorstMonth;
        this.assetClass = assetClass;
        this.region = region;
        this.investmentType = investmentType;
        this.managerCompanyName = managerCompanyName;
        this.managerPersonName = managerPersonName;
        this.minInvest = minInvest;
        this.minSubsequentInvest = minSubsequentInvest;
        this.managementFeeRate = managementFeeRate;
        this.ongoingChargeFeeRate = ongoingChargeFeeRate;
    }


    /**
     * Gets the name value for this InvestmentDetailsGetResponse.
     * 
     * @return name   * Strategy name.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this InvestmentDetailsGetResponse.
     * 
     * @param name   * Strategy name.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the sector value for this InvestmentDetailsGetResponse.
     * 
     * @return sector   * Strategy Sector.
     */
    public java.lang.String getSector() {
        return sector;
    }


    /**
     * Sets the sector value for this InvestmentDetailsGetResponse.
     * 
     * @param sector   * Strategy Sector.
     */
    public void setSector(java.lang.String sector) {
        this.sector = sector;
    }


    /**
     * Gets the currency value for this InvestmentDetailsGetResponse.
     * 
     * @return currency   * Strategy Currency.
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this InvestmentDetailsGetResponse.
     * 
     * @param currency   * Strategy Currency.
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the lastValueDate value for this InvestmentDetailsGetResponse.
     * 
     * @return lastValueDate   * Date last value
     */
    public java.util.Date getLastValueDate() {
        return lastValueDate;
    }


    /**
     * Sets the lastValueDate value for this InvestmentDetailsGetResponse.
     * 
     * @param lastValueDate   * Date last value
     */
    public void setLastValueDate(java.util.Date lastValueDate) {
        this.lastValueDate = lastValueDate;
    }


    /**
     * Gets the lastValue value for this InvestmentDetailsGetResponse.
     * 
     * @return lastValue   * Last value.
     */
    public double getLastValue() {
        return lastValue;
    }


    /**
     * Sets the lastValue value for this InvestmentDetailsGetResponse.
     * 
     * @param lastValue   * Last value.
     */
    public void setLastValue(double lastValue) {
        this.lastValue = lastValue;
    }


    /**
     * Gets the firstValueDate value for this InvestmentDetailsGetResponse.
     * 
     * @return firstValueDate   * Date last value
     */
    public java.util.Date getFirstValueDate() {
        return firstValueDate;
    }


    /**
     * Sets the firstValueDate value for this InvestmentDetailsGetResponse.
     * 
     * @param firstValueDate   * Date last value
     */
    public void setFirstValueDate(java.util.Date firstValueDate) {
        this.firstValueDate = firstValueDate;
    }


    /**
     * Gets the firstValue value for this InvestmentDetailsGetResponse.
     * 
     * @return firstValue   * Last value.
     */
    public double getFirstValue() {
        return firstValue;
    }


    /**
     * Sets the firstValue value for this InvestmentDetailsGetResponse.
     * 
     * @param firstValue   * Last value.
     */
    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }


    /**
     * Gets the isin value for this InvestmentDetailsGetResponse.
     * 
     * @return isin   * Strategy isin.
     */
    public java.lang.String getIsin() {
        return isin;
    }


    /**
     * Sets the isin value for this InvestmentDetailsGetResponse.
     * 
     * @param isin   * Strategy isin.
     */
    public void setIsin(java.lang.String isin) {
        this.isin = isin;
    }


    /**
     * Gets the inception value for this InvestmentDetailsGetResponse.
     * 
     * @return inception   * Strategy Live Start Date.
     */
    public java.util.Date getInception() {
        return inception;
    }


    /**
     * Sets the inception value for this InvestmentDetailsGetResponse.
     * 
     * @param inception   * Strategy Live Start Date.
     */
    public void setInception(java.util.Date inception) {
        this.inception = inception;
    }


    /**
     * Gets the AUM value for this InvestmentDetailsGetResponse.
     * 
     * @return AUM   * Strategy AUM.
     */
    public java.lang.String getAUM() {
        return AUM;
    }


    /**
     * Sets the AUM value for this InvestmentDetailsGetResponse.
     * 
     * @param AUM   * Strategy AUM.
     */
    public void setAUM(java.lang.String AUM) {
        this.AUM = AUM;
    }


    /**
     * Gets the simpleReturnByTimeFrame value for this InvestmentDetailsGetResponse.
     * 
     * @return simpleReturnByTimeFrame   * The simple returns (ie not annualized) of the
     * 									timeseries over different
     * 									time periods.
     */
    public org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] getSimpleReturnByTimeFrame() {
        return simpleReturnByTimeFrame;
    }


    /**
     * Sets the simpleReturnByTimeFrame value for this InvestmentDetailsGetResponse.
     * 
     * @param simpleReturnByTimeFrame   * The simple returns (ie not annualized) of the
     * 									timeseries over different
     * 									time periods.
     */
    public void setSimpleReturnByTimeFrame(org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] simpleReturnByTimeFrame) {
        this.simpleReturnByTimeFrame = simpleReturnByTimeFrame;
    }

    public org.sly.www.main.server.webservice.bindings.TimeFrameStatistic getSimpleReturnByTimeFrame(int i) {
        return this.simpleReturnByTimeFrame[i];
    }

    public void setSimpleReturnByTimeFrame(int i, org.sly.www.main.server.webservice.bindings.TimeFrameStatistic _value) {
        this.simpleReturnByTimeFrame[i] = _value;
    }


    /**
     * Gets the annualizedReturnByTimeFrame value for this InvestmentDetailsGetResponse.
     * 
     * @return annualizedReturnByTimeFrame   * The annualized returns of the timeseries over
     * 									different
     * 									time periods.
     */
    public org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] getAnnualizedReturnByTimeFrame() {
        return annualizedReturnByTimeFrame;
    }


    /**
     * Sets the annualizedReturnByTimeFrame value for this InvestmentDetailsGetResponse.
     * 
     * @param annualizedReturnByTimeFrame   * The annualized returns of the timeseries over
     * 									different
     * 									time periods.
     */
    public void setAnnualizedReturnByTimeFrame(org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] annualizedReturnByTimeFrame) {
        this.annualizedReturnByTimeFrame = annualizedReturnByTimeFrame;
    }

    public org.sly.www.main.server.webservice.bindings.TimeFrameStatistic getAnnualizedReturnByTimeFrame(int i) {
        return this.annualizedReturnByTimeFrame[i];
    }

    public void setAnnualizedReturnByTimeFrame(int i, org.sly.www.main.server.webservice.bindings.TimeFrameStatistic _value) {
        this.annualizedReturnByTimeFrame[i] = _value;
    }


    /**
     * Gets the volatilityByTimeFrame value for this InvestmentDetailsGetResponse.
     * 
     * @return volatilityByTimeFrame   * The volalatitlity of the timeseries over
     * 									different
     * 									time periods.
     */
    public org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] getVolatilityByTimeFrame() {
        return volatilityByTimeFrame;
    }


    /**
     * Sets the volatilityByTimeFrame value for this InvestmentDetailsGetResponse.
     * 
     * @param volatilityByTimeFrame   * The volalatitlity of the timeseries over
     * 									different
     * 									time periods.
     */
    public void setVolatilityByTimeFrame(org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] volatilityByTimeFrame) {
        this.volatilityByTimeFrame = volatilityByTimeFrame;
    }

    public org.sly.www.main.server.webservice.bindings.TimeFrameStatistic getVolatilityByTimeFrame(int i) {
        return this.volatilityByTimeFrame[i];
    }

    public void setVolatilityByTimeFrame(int i, org.sly.www.main.server.webservice.bindings.TimeFrameStatistic _value) {
        this.volatilityByTimeFrame[i] = _value;
    }


    /**
     * Gets the downsideVolatilityByTimeFrame value for this InvestmentDetailsGetResponse.
     * 
     * @return downsideVolatilityByTimeFrame   * The downside volalatitlity of the timeseries
     * 									over
     * 									different
     * 									time periods.
     */
    public org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] getDownsideVolatilityByTimeFrame() {
        return downsideVolatilityByTimeFrame;
    }


    /**
     * Sets the downsideVolatilityByTimeFrame value for this InvestmentDetailsGetResponse.
     * 
     * @param downsideVolatilityByTimeFrame   * The downside volalatitlity of the timeseries
     * 									over
     * 									different
     * 									time periods.
     */
    public void setDownsideVolatilityByTimeFrame(org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] downsideVolatilityByTimeFrame) {
        this.downsideVolatilityByTimeFrame = downsideVolatilityByTimeFrame;
    }

    public org.sly.www.main.server.webservice.bindings.TimeFrameStatistic getDownsideVolatilityByTimeFrame(int i) {
        return this.downsideVolatilityByTimeFrame[i];
    }

    public void setDownsideVolatilityByTimeFrame(int i, org.sly.www.main.server.webservice.bindings.TimeFrameStatistic _value) {
        this.downsideVolatilityByTimeFrame[i] = _value;
    }


    /**
     * Gets the sharpeRatioByTimeFrame value for this InvestmentDetailsGetResponse.
     * 
     * @return sharpeRatioByTimeFrame   * Thesharpe ratio (assuming 0% risk free interest
     * 									rate) of the timeseries
     * 									over
     * 									different
     * 									time periods.
     */
    public org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] getSharpeRatioByTimeFrame() {
        return sharpeRatioByTimeFrame;
    }


    /**
     * Sets the sharpeRatioByTimeFrame value for this InvestmentDetailsGetResponse.
     * 
     * @param sharpeRatioByTimeFrame   * Thesharpe ratio (assuming 0% risk free interest
     * 									rate) of the timeseries
     * 									over
     * 									different
     * 									time periods.
     */
    public void setSharpeRatioByTimeFrame(org.sly.www.main.server.webservice.bindings.TimeFrameStatistic[] sharpeRatioByTimeFrame) {
        this.sharpeRatioByTimeFrame = sharpeRatioByTimeFrame;
    }

    public org.sly.www.main.server.webservice.bindings.TimeFrameStatistic getSharpeRatioByTimeFrame(int i) {
        return this.sharpeRatioByTimeFrame[i];
    }

    public void setSharpeRatioByTimeFrame(int i, org.sly.www.main.server.webservice.bindings.TimeFrameStatistic _value) {
        this.sharpeRatioByTimeFrame[i] = _value;
    }


    /**
     * Gets the maxDrawdownPercent value for this InvestmentDetailsGetResponse.
     * 
     * @return maxDrawdownPercent   * The maximum drawdown in % (0.01 is 1.00%). The
     * 									maximum drawdown if the percentage loss if an investor would
     * have
     * 									invested at the highest point and sold at the lowest point
     * 									thereafter.
     */
    public java.math.BigDecimal getMaxDrawdownPercent() {
        return maxDrawdownPercent;
    }


    /**
     * Sets the maxDrawdownPercent value for this InvestmentDetailsGetResponse.
     * 
     * @param maxDrawdownPercent   * The maximum drawdown in % (0.01 is 1.00%). The
     * 									maximum drawdown if the percentage loss if an investor would
     * have
     * 									invested at the highest point and sold at the lowest point
     * 									thereafter.
     */
    public void setMaxDrawdownPercent(java.math.BigDecimal maxDrawdownPercent) {
        this.maxDrawdownPercent = maxDrawdownPercent;
    }


    /**
     * Gets the maxDrawdownPeakValue value for this InvestmentDetailsGetResponse.
     * 
     * @return maxDrawdownPeakValue   * The value of the timeseries at the start of the
     * 									drawdown period.
     */
    public java.math.BigDecimal getMaxDrawdownPeakValue() {
        return maxDrawdownPeakValue;
    }


    /**
     * Sets the maxDrawdownPeakValue value for this InvestmentDetailsGetResponse.
     * 
     * @param maxDrawdownPeakValue   * The value of the timeseries at the start of the
     * 									drawdown period.
     */
    public void setMaxDrawdownPeakValue(java.math.BigDecimal maxDrawdownPeakValue) {
        this.maxDrawdownPeakValue = maxDrawdownPeakValue;
    }


    /**
     * Gets the maxDrawdownPeakDate value for this InvestmentDetailsGetResponse.
     * 
     * @return maxDrawdownPeakDate   * The date at the start of the drawdown period.
     */
    public java.util.Date getMaxDrawdownPeakDate() {
        return maxDrawdownPeakDate;
    }


    /**
     * Sets the maxDrawdownPeakDate value for this InvestmentDetailsGetResponse.
     * 
     * @param maxDrawdownPeakDate   * The date at the start of the drawdown period.
     */
    public void setMaxDrawdownPeakDate(java.util.Date maxDrawdownPeakDate) {
        this.maxDrawdownPeakDate = maxDrawdownPeakDate;
    }


    /**
     * Gets the maxDrawdownValleyValue value for this InvestmentDetailsGetResponse.
     * 
     * @return maxDrawdownValleyValue   * The value of the timeseries at the end of the
     * 									drawdown period.
     */
    public java.math.BigDecimal getMaxDrawdownValleyValue() {
        return maxDrawdownValleyValue;
    }


    /**
     * Sets the maxDrawdownValleyValue value for this InvestmentDetailsGetResponse.
     * 
     * @param maxDrawdownValleyValue   * The value of the timeseries at the end of the
     * 									drawdown period.
     */
    public void setMaxDrawdownValleyValue(java.math.BigDecimal maxDrawdownValleyValue) {
        this.maxDrawdownValleyValue = maxDrawdownValleyValue;
    }


    /**
     * Gets the maxDrawdownValleyDate value for this InvestmentDetailsGetResponse.
     * 
     * @return maxDrawdownValleyDate   * The date at the end of the drawdown period.
     */
    public java.util.Date getMaxDrawdownValleyDate() {
        return maxDrawdownValleyDate;
    }


    /**
     * Sets the maxDrawdownValleyDate value for this InvestmentDetailsGetResponse.
     * 
     * @param maxDrawdownValleyDate   * The date at the end of the drawdown period.
     */
    public void setMaxDrawdownValleyDate(java.util.Date maxDrawdownValleyDate) {
        this.maxDrawdownValleyDate = maxDrawdownValleyDate;
    }


    /**
     * Gets the percentNegMonths value for this InvestmentDetailsGetResponse.
     * 
     * @return percentNegMonths   * The percentage of negative months over the total
     * 									number of months.
     */
    public java.math.BigDecimal getPercentNegMonths() {
        return percentNegMonths;
    }


    /**
     * Sets the percentNegMonths value for this InvestmentDetailsGetResponse.
     * 
     * @param percentNegMonths   * The percentage of negative months over the total
     * 									number of months.
     */
    public void setPercentNegMonths(java.math.BigDecimal percentNegMonths) {
        this.percentNegMonths = percentNegMonths;
    }


    /**
     * Gets the percentPosMonths value for this InvestmentDetailsGetResponse.
     * 
     * @return percentPosMonths   * % of positive months over the total number of
     * 									months.
     */
    public java.math.BigDecimal getPercentPosMonths() {
        return percentPosMonths;
    }


    /**
     * Sets the percentPosMonths value for this InvestmentDetailsGetResponse.
     * 
     * @param percentPosMonths   * % of positive months over the total number of
     * 									months.
     */
    public void setPercentPosMonths(java.math.BigDecimal percentPosMonths) {
        this.percentPosMonths = percentPosMonths;
    }


    /**
     * Gets the numberNegMonths value for this InvestmentDetailsGetResponse.
     * 
     * @return numberNegMonths   * The number of negative months over the total
     * 									number of months.
     */
    public java.math.BigDecimal getNumberNegMonths() {
        return numberNegMonths;
    }


    /**
     * Sets the numberNegMonths value for this InvestmentDetailsGetResponse.
     * 
     * @param numberNegMonths   * The number of negative months over the total
     * 									number of months.
     */
    public void setNumberNegMonths(java.math.BigDecimal numberNegMonths) {
        this.numberNegMonths = numberNegMonths;
    }


    /**
     * Gets the numberPosMonths value for this InvestmentDetailsGetResponse.
     * 
     * @return numberPosMonths   * The number of positive months over the total
     * 									number of
     * 									months.
     */
    public java.math.BigDecimal getNumberPosMonths() {
        return numberPosMonths;
    }


    /**
     * Sets the numberPosMonths value for this InvestmentDetailsGetResponse.
     * 
     * @param numberPosMonths   * The number of positive months over the total
     * 									number of
     * 									months.
     */
    public void setNumberPosMonths(java.math.BigDecimal numberPosMonths) {
        this.numberPosMonths = numberPosMonths;
    }


    /**
     * Gets the returnBestMonth value for this InvestmentDetailsGetResponse.
     * 
     * @return returnBestMonth   * %-age return of best month (0.01 is 1.00%).
     */
    public java.math.BigDecimal getReturnBestMonth() {
        return returnBestMonth;
    }


    /**
     * Sets the returnBestMonth value for this InvestmentDetailsGetResponse.
     * 
     * @param returnBestMonth   * %-age return of best month (0.01 is 1.00%).
     */
    public void setReturnBestMonth(java.math.BigDecimal returnBestMonth) {
        this.returnBestMonth = returnBestMonth;
    }


    /**
     * Gets the returnWorstMonth value for this InvestmentDetailsGetResponse.
     * 
     * @return returnWorstMonth   * %-age return of worst month (0.01 is 1.00%).
     */
    public java.math.BigDecimal getReturnWorstMonth() {
        return returnWorstMonth;
    }


    /**
     * Sets the returnWorstMonth value for this InvestmentDetailsGetResponse.
     * 
     * @param returnWorstMonth   * %-age return of worst month (0.01 is 1.00%).
     */
    public void setReturnWorstMonth(java.math.BigDecimal returnWorstMonth) {
        this.returnWorstMonth = returnWorstMonth;
    }


    /**
     * Gets the assetClass value for this InvestmentDetailsGetResponse.
     * 
     * @return assetClass
     */
    public java.lang.String getAssetClass() {
        return assetClass;
    }


    /**
     * Sets the assetClass value for this InvestmentDetailsGetResponse.
     * 
     * @param assetClass
     */
    public void setAssetClass(java.lang.String assetClass) {
        this.assetClass = assetClass;
    }


    /**
     * Gets the region value for this InvestmentDetailsGetResponse.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this InvestmentDetailsGetResponse.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the investmentType value for this InvestmentDetailsGetResponse.
     * 
     * @return investmentType
     */
    public java.lang.String getInvestmentType() {
        return investmentType;
    }


    /**
     * Sets the investmentType value for this InvestmentDetailsGetResponse.
     * 
     * @param investmentType
     */
    public void setInvestmentType(java.lang.String investmentType) {
        this.investmentType = investmentType;
    }


    /**
     * Gets the managerCompanyName value for this InvestmentDetailsGetResponse.
     * 
     * @return managerCompanyName
     */
    public java.lang.String getManagerCompanyName() {
        return managerCompanyName;
    }


    /**
     * Sets the managerCompanyName value for this InvestmentDetailsGetResponse.
     * 
     * @param managerCompanyName
     */
    public void setManagerCompanyName(java.lang.String managerCompanyName) {
        this.managerCompanyName = managerCompanyName;
    }


    /**
     * Gets the managerPersonName value for this InvestmentDetailsGetResponse.
     * 
     * @return managerPersonName
     */
    public java.lang.String getManagerPersonName() {
        return managerPersonName;
    }


    /**
     * Sets the managerPersonName value for this InvestmentDetailsGetResponse.
     * 
     * @param managerPersonName
     */
    public void setManagerPersonName(java.lang.String managerPersonName) {
        this.managerPersonName = managerPersonName;
    }


    /**
     * Gets the minInvest value for this InvestmentDetailsGetResponse.
     * 
     * @return minInvest
     */
    public java.math.BigDecimal getMinInvest() {
        return minInvest;
    }


    /**
     * Sets the minInvest value for this InvestmentDetailsGetResponse.
     * 
     * @param minInvest
     */
    public void setMinInvest(java.math.BigDecimal minInvest) {
        this.minInvest = minInvest;
    }


    /**
     * Gets the minSubsequentInvest value for this InvestmentDetailsGetResponse.
     * 
     * @return minSubsequentInvest
     */
    public java.math.BigDecimal getMinSubsequentInvest() {
        return minSubsequentInvest;
    }


    /**
     * Sets the minSubsequentInvest value for this InvestmentDetailsGetResponse.
     * 
     * @param minSubsequentInvest
     */
    public void setMinSubsequentInvest(java.math.BigDecimal minSubsequentInvest) {
        this.minSubsequentInvest = minSubsequentInvest;
    }


    /**
     * Gets the managementFeeRate value for this InvestmentDetailsGetResponse.
     * 
     * @return managementFeeRate
     */
    public java.math.BigDecimal getManagementFeeRate() {
        return managementFeeRate;
    }


    /**
     * Sets the managementFeeRate value for this InvestmentDetailsGetResponse.
     * 
     * @param managementFeeRate
     */
    public void setManagementFeeRate(java.math.BigDecimal managementFeeRate) {
        this.managementFeeRate = managementFeeRate;
    }


    /**
     * Gets the ongoingChargeFeeRate value for this InvestmentDetailsGetResponse.
     * 
     * @return ongoingChargeFeeRate
     */
    public java.math.BigDecimal getOngoingChargeFeeRate() {
        return ongoingChargeFeeRate;
    }


    /**
     * Sets the ongoingChargeFeeRate value for this InvestmentDetailsGetResponse.
     * 
     * @param ongoingChargeFeeRate
     */
    public void setOngoingChargeFeeRate(java.math.BigDecimal ongoingChargeFeeRate) {
        this.ongoingChargeFeeRate = ongoingChargeFeeRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvestmentDetailsGetResponse)) return false;
        InvestmentDetailsGetResponse other = (InvestmentDetailsGetResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.sector==null && other.getSector()==null) || 
             (this.sector!=null &&
              this.sector.equals(other.getSector()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.lastValueDate==null && other.getLastValueDate()==null) || 
             (this.lastValueDate!=null &&
              this.lastValueDate.equals(other.getLastValueDate()))) &&
            this.lastValue == other.getLastValue() &&
            ((this.firstValueDate==null && other.getFirstValueDate()==null) || 
             (this.firstValueDate!=null &&
              this.firstValueDate.equals(other.getFirstValueDate()))) &&
            this.firstValue == other.getFirstValue() &&
            ((this.isin==null && other.getIsin()==null) || 
             (this.isin!=null &&
              this.isin.equals(other.getIsin()))) &&
            ((this.inception==null && other.getInception()==null) || 
             (this.inception!=null &&
              this.inception.equals(other.getInception()))) &&
            ((this.AUM==null && other.getAUM()==null) || 
             (this.AUM!=null &&
              this.AUM.equals(other.getAUM()))) &&
            ((this.simpleReturnByTimeFrame==null && other.getSimpleReturnByTimeFrame()==null) || 
             (this.simpleReturnByTimeFrame!=null &&
              java.util.Arrays.equals(this.simpleReturnByTimeFrame, other.getSimpleReturnByTimeFrame()))) &&
            ((this.annualizedReturnByTimeFrame==null && other.getAnnualizedReturnByTimeFrame()==null) || 
             (this.annualizedReturnByTimeFrame!=null &&
              java.util.Arrays.equals(this.annualizedReturnByTimeFrame, other.getAnnualizedReturnByTimeFrame()))) &&
            ((this.volatilityByTimeFrame==null && other.getVolatilityByTimeFrame()==null) || 
             (this.volatilityByTimeFrame!=null &&
              java.util.Arrays.equals(this.volatilityByTimeFrame, other.getVolatilityByTimeFrame()))) &&
            ((this.downsideVolatilityByTimeFrame==null && other.getDownsideVolatilityByTimeFrame()==null) || 
             (this.downsideVolatilityByTimeFrame!=null &&
              java.util.Arrays.equals(this.downsideVolatilityByTimeFrame, other.getDownsideVolatilityByTimeFrame()))) &&
            ((this.sharpeRatioByTimeFrame==null && other.getSharpeRatioByTimeFrame()==null) || 
             (this.sharpeRatioByTimeFrame!=null &&
              java.util.Arrays.equals(this.sharpeRatioByTimeFrame, other.getSharpeRatioByTimeFrame()))) &&
            ((this.maxDrawdownPercent==null && other.getMaxDrawdownPercent()==null) || 
             (this.maxDrawdownPercent!=null &&
              this.maxDrawdownPercent.equals(other.getMaxDrawdownPercent()))) &&
            ((this.maxDrawdownPeakValue==null && other.getMaxDrawdownPeakValue()==null) || 
             (this.maxDrawdownPeakValue!=null &&
              this.maxDrawdownPeakValue.equals(other.getMaxDrawdownPeakValue()))) &&
            ((this.maxDrawdownPeakDate==null && other.getMaxDrawdownPeakDate()==null) || 
             (this.maxDrawdownPeakDate!=null &&
              this.maxDrawdownPeakDate.equals(other.getMaxDrawdownPeakDate()))) &&
            ((this.maxDrawdownValleyValue==null && other.getMaxDrawdownValleyValue()==null) || 
             (this.maxDrawdownValleyValue!=null &&
              this.maxDrawdownValleyValue.equals(other.getMaxDrawdownValleyValue()))) &&
            ((this.maxDrawdownValleyDate==null && other.getMaxDrawdownValleyDate()==null) || 
             (this.maxDrawdownValleyDate!=null &&
              this.maxDrawdownValleyDate.equals(other.getMaxDrawdownValleyDate()))) &&
            ((this.percentNegMonths==null && other.getPercentNegMonths()==null) || 
             (this.percentNegMonths!=null &&
              this.percentNegMonths.equals(other.getPercentNegMonths()))) &&
            ((this.percentPosMonths==null && other.getPercentPosMonths()==null) || 
             (this.percentPosMonths!=null &&
              this.percentPosMonths.equals(other.getPercentPosMonths()))) &&
            ((this.numberNegMonths==null && other.getNumberNegMonths()==null) || 
             (this.numberNegMonths!=null &&
              this.numberNegMonths.equals(other.getNumberNegMonths()))) &&
            ((this.numberPosMonths==null && other.getNumberPosMonths()==null) || 
             (this.numberPosMonths!=null &&
              this.numberPosMonths.equals(other.getNumberPosMonths()))) &&
            ((this.returnBestMonth==null && other.getReturnBestMonth()==null) || 
             (this.returnBestMonth!=null &&
              this.returnBestMonth.equals(other.getReturnBestMonth()))) &&
            ((this.returnWorstMonth==null && other.getReturnWorstMonth()==null) || 
             (this.returnWorstMonth!=null &&
              this.returnWorstMonth.equals(other.getReturnWorstMonth()))) &&
            ((this.assetClass==null && other.getAssetClass()==null) || 
             (this.assetClass!=null &&
              this.assetClass.equals(other.getAssetClass()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.investmentType==null && other.getInvestmentType()==null) || 
             (this.investmentType!=null &&
              this.investmentType.equals(other.getInvestmentType()))) &&
            ((this.managerCompanyName==null && other.getManagerCompanyName()==null) || 
             (this.managerCompanyName!=null &&
              this.managerCompanyName.equals(other.getManagerCompanyName()))) &&
            ((this.managerPersonName==null && other.getManagerPersonName()==null) || 
             (this.managerPersonName!=null &&
              this.managerPersonName.equals(other.getManagerPersonName()))) &&
            ((this.minInvest==null && other.getMinInvest()==null) || 
             (this.minInvest!=null &&
              this.minInvest.equals(other.getMinInvest()))) &&
            ((this.minSubsequentInvest==null && other.getMinSubsequentInvest()==null) || 
             (this.minSubsequentInvest!=null &&
              this.minSubsequentInvest.equals(other.getMinSubsequentInvest()))) &&
            ((this.managementFeeRate==null && other.getManagementFeeRate()==null) || 
             (this.managementFeeRate!=null &&
              this.managementFeeRate.equals(other.getManagementFeeRate()))) &&
            ((this.ongoingChargeFeeRate==null && other.getOngoingChargeFeeRate()==null) || 
             (this.ongoingChargeFeeRate!=null &&
              this.ongoingChargeFeeRate.equals(other.getOngoingChargeFeeRate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSector() != null) {
            _hashCode += getSector().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getLastValueDate() != null) {
            _hashCode += getLastValueDate().hashCode();
        }
        _hashCode += new Double(getLastValue()).hashCode();
        if (getFirstValueDate() != null) {
            _hashCode += getFirstValueDate().hashCode();
        }
        _hashCode += new Double(getFirstValue()).hashCode();
        if (getIsin() != null) {
            _hashCode += getIsin().hashCode();
        }
        if (getInception() != null) {
            _hashCode += getInception().hashCode();
        }
        if (getAUM() != null) {
            _hashCode += getAUM().hashCode();
        }
        if (getSimpleReturnByTimeFrame() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSimpleReturnByTimeFrame());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSimpleReturnByTimeFrame(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAnnualizedReturnByTimeFrame() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnnualizedReturnByTimeFrame());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnnualizedReturnByTimeFrame(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVolatilityByTimeFrame() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVolatilityByTimeFrame());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVolatilityByTimeFrame(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDownsideVolatilityByTimeFrame() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDownsideVolatilityByTimeFrame());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDownsideVolatilityByTimeFrame(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSharpeRatioByTimeFrame() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSharpeRatioByTimeFrame());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSharpeRatioByTimeFrame(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxDrawdownPercent() != null) {
            _hashCode += getMaxDrawdownPercent().hashCode();
        }
        if (getMaxDrawdownPeakValue() != null) {
            _hashCode += getMaxDrawdownPeakValue().hashCode();
        }
        if (getMaxDrawdownPeakDate() != null) {
            _hashCode += getMaxDrawdownPeakDate().hashCode();
        }
        if (getMaxDrawdownValleyValue() != null) {
            _hashCode += getMaxDrawdownValleyValue().hashCode();
        }
        if (getMaxDrawdownValleyDate() != null) {
            _hashCode += getMaxDrawdownValleyDate().hashCode();
        }
        if (getPercentNegMonths() != null) {
            _hashCode += getPercentNegMonths().hashCode();
        }
        if (getPercentPosMonths() != null) {
            _hashCode += getPercentPosMonths().hashCode();
        }
        if (getNumberNegMonths() != null) {
            _hashCode += getNumberNegMonths().hashCode();
        }
        if (getNumberPosMonths() != null) {
            _hashCode += getNumberPosMonths().hashCode();
        }
        if (getReturnBestMonth() != null) {
            _hashCode += getReturnBestMonth().hashCode();
        }
        if (getReturnWorstMonth() != null) {
            _hashCode += getReturnWorstMonth().hashCode();
        }
        if (getAssetClass() != null) {
            _hashCode += getAssetClass().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getInvestmentType() != null) {
            _hashCode += getInvestmentType().hashCode();
        }
        if (getManagerCompanyName() != null) {
            _hashCode += getManagerCompanyName().hashCode();
        }
        if (getManagerPersonName() != null) {
            _hashCode += getManagerPersonName().hashCode();
        }
        if (getMinInvest() != null) {
            _hashCode += getMinInvest().hashCode();
        }
        if (getMinSubsequentInvest() != null) {
            _hashCode += getMinSubsequentInvest().hashCode();
        }
        if (getManagementFeeRate() != null) {
            _hashCode += getManagementFeeRate().hashCode();
        }
        if (getOngoingChargeFeeRate() != null) {
            _hashCode += getOngoingChargeFeeRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvestmentDetailsGetResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", ">InvestmentDetailsGetResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "Sector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastValueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "LastValueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "LastValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstValueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "FirstValueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "FirstValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "Isin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inception");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "Inception"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "AUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simpleReturnByTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "SimpleReturnByTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "TimeFrameStatistic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annualizedReturnByTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "AnnualizedReturnByTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "TimeFrameStatistic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volatilityByTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "VolatilityByTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "TimeFrameStatistic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downsideVolatilityByTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "DownsideVolatilityByTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "TimeFrameStatistic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharpeRatioByTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "SharpeRatioByTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "TimeFrameStatistic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDrawdownPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "MaxDrawdownPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDrawdownPeakValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "MaxDrawdownPeakValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDrawdownPeakDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "MaxDrawdownPeakDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDrawdownValleyValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "MaxDrawdownValleyValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDrawdownValleyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "MaxDrawdownValleyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentNegMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "PercentNegMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentPosMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "PercentPosMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberNegMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "NumberNegMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberPosMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "NumberPosMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnBestMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "ReturnBestMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnWorstMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "ReturnWorstMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "AssetClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "Region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("investmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "InvestmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerCompanyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "ManagerCompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerPersonName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "ManagerPersonName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minInvest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "MinInvest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minSubsequentInvest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "MinSubsequentInvest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managementFeeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "ManagementFeeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ongoingChargeFeeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sly.org/main/server/webservice/bindings", "OngoingChargeFeeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

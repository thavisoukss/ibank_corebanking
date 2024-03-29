
package com.internetbanking.soap.SMS;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ServicesSoap", targetNamespace = "http://Services.laotel.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicesSoap {


    /**
     * 
     * @param msg
     * @return
     *     returns com.internetbanking.soap.SMS.HeaderResult
     */
    @WebMethod(action = "http://Services.laotel.com/sendSMS")
    @WebResult(name = "sendSMSResult", targetNamespace = "http://Services.laotel.com/")
    @RequestWrapper(localName = "sendSMS", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.SendSMS")
    @ResponseWrapper(localName = "sendSMSResponse", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.SendSMSResponse")
    public HeaderResult sendSMS(
        @WebParam(name = "msg", targetNamespace = "http://Services.laotel.com/")
        SendSmsRequest msg);

    /**
     * 
     * @param msg
     * @return
     *     returns com.internetbanking.soap.SMS.HeaderResult
     */
    @WebMethod(action = "http://Services.laotel.com/sendSMSSP")
    @WebResult(name = "sendSMSSPResult", targetNamespace = "http://Services.laotel.com/")
    @RequestWrapper(localName = "sendSMSSP", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.SendSMSSP")
    @ResponseWrapper(localName = "sendSMSSPResponse", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.SendSMSSPResponse")
    public HeaderResult sendSMSSP(
        @WebParam(name = "msg", targetNamespace = "http://Services.laotel.com/")
        SendSmsRequest msg);

    /**
     * 
     * @param msg
     * @return
     *     returns com.internetbanking.soap.SMS.HeaderResult
     */
    @WebMethod(action = "http://Services.laotel.com/topup")
    @WebResult(name = "topupResult", targetNamespace = "http://Services.laotel.com/")
    @RequestWrapper(localName = "topup", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.Topup")
    @ResponseWrapper(localName = "topupResponse", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.TopupResponse")
    public HeaderResult topup(
        @WebParam(name = "msg", targetNamespace = "http://Services.laotel.com/")
        TopupRequest msg);

    /**
     * 
     * @param msg
     * @return
     *     returns com.internetbanking.soap.SMS.HeaderResult
     */
    @WebMethod(action = "http://Services.laotel.com/payment")
    @WebResult(name = "paymentResult", targetNamespace = "http://Services.laotel.com/")
    @RequestWrapper(localName = "payment", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.Payment")
    @ResponseWrapper(localName = "paymentResponse", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.PaymentResponse")
    public HeaderResult payment(
        @WebParam(name = "msg", targetNamespace = "http://Services.laotel.com/")
        PayemtRequest msg);

    /**
     * 
     * @param msg
     * @return
     *     returns com.internetbanking.soap.SMS.CheckBalanceResult
     */
    @WebMethod(action = "http://Services.laotel.com/checkBalance")
    @WebResult(name = "checkBalanceResult", targetNamespace = "http://Services.laotel.com/")
    @RequestWrapper(localName = "checkBalance", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.CheckBalance")
    @ResponseWrapper(localName = "checkBalanceResponse", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.CheckBalanceResponse")
    public CheckBalanceResult checkBalance(
        @WebParam(name = "msg", targetNamespace = "http://Services.laotel.com/")
        CheckBalanceRequest msg);

    /**
     * 
     * @param msg
     * @return
     *     returns com.internetbanking.soap.SMS.CheckBalanceSimasterResult
     */
    @WebMethod(action = "http://Services.laotel.com/checkBalanceSimMaster")
    @WebResult(name = "checkBalanceSimMasterResult", targetNamespace = "http://Services.laotel.com/")
    @RequestWrapper(localName = "checkBalanceSimMaster", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.CheckBalanceSimMaster")
    @ResponseWrapper(localName = "checkBalanceSimMasterResponse", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.CheckBalanceSimMasterResponse")
    public CheckBalanceSimasterResult checkBalanceSimMaster(
        @WebParam(name = "msg", targetNamespace = "http://Services.laotel.com/")
        HeaderRequest msg);

    /**
     * 
     * @param msg
     * @return
     *     returns com.internetbanking.soap.SMS.CheckTransactionResult
     */
    @WebMethod(action = "http://Services.laotel.com/checkTransaction")
    @WebResult(name = "checkTransactionResult", targetNamespace = "http://Services.laotel.com/")
    @RequestWrapper(localName = "checkTransaction", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.CheckTransaction")
    @ResponseWrapper(localName = "checkTransactionResponse", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.CheckTransactionResponse")
    public CheckTransactionResult checkTransaction(
        @WebParam(name = "msg", targetNamespace = "http://Services.laotel.com/")
        HeaderRequest msg);

    /**
     * 
     * @param msg
     * @return
     *     returns com.internetbanking.soap.SMS.HeaderResult
     */
    @WebMethod(action = "http://Services.laotel.com/cancelTransaction")
    @WebResult(name = "cancelTransactionResult", targetNamespace = "http://Services.laotel.com/")
    @RequestWrapper(localName = "cancelTransaction", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.CancelTransaction")
    @ResponseWrapper(localName = "cancelTransactionResponse", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.CancelTransactionResponse")
    public HeaderResult cancelTransaction(
        @WebParam(name = "msg", targetNamespace = "http://Services.laotel.com/")
        CancelTransactionRequest msg);

    /**
     * 
     * @param msg
     * @return
     *     returns com.internetbanking.soap.SMS.HeaderResult
     */
    @WebMethod(action = "http://Services.laotel.com/buyPackage")
    @WebResult(name = "buyPackageResult", targetNamespace = "http://Services.laotel.com/")
    @RequestWrapper(localName = "buyPackage", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.BuyPackage")
    @ResponseWrapper(localName = "buyPackageResponse", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.BuyPackageResponse")
    public HeaderResult buyPackage(
        @WebParam(name = "msg", targetNamespace = "http://Services.laotel.com/")
        BuyPackageRequest msg);

    /**
     * 
     * @param msg
     * @return
     *     returns com.internetbanking.soap.SMS.HeaderResult
     */
    @WebMethod(action = "http://Services.laotel.com/setPromotion")
    @WebResult(name = "setPromotionResult", targetNamespace = "http://Services.laotel.com/")
    @RequestWrapper(localName = "setPromotion", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.SetPromotion")
    @ResponseWrapper(localName = "setPromotionResponse", targetNamespace = "http://Services.laotel.com/", className = "com.internetbanking.soap.SMS.SetPromotionResponse")
    public HeaderResult setPromotion(
        @WebParam(name = "msg", targetNamespace = "http://Services.laotel.com/")
        SetPromotionRequest msg);

}

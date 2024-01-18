
package com.internetbanking.soap.transfer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TxnSetlDtls-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TxnSetlDtls-Create-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CONREFNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LATEVNSEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Contract-Settlement" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CUSTSPREAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="SPREADDEFN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EXRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="NETIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ERICCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ERIAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="GENMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RATECD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CLEARNW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COVERBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RTGSPMNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BANKPRIOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RTGSNW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PAYBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TRANSTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INSTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INSNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHGDET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PAYMNTDET1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PAYMNTDET2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PAYMNTDET3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PAYMNTDET4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SNDTRRCVINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SNDTRRCVINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SNDTRRCVINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SNDTRRCVINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SNDTRRCVINFO5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COVREQRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RECVCVR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RECEIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REIMINST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REIMINST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REIMINST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REIMINST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RCVRCORRS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RCVRCORRS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RCVRCORRS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RCVRCORRS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDIARY1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDIARY2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDIARY3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDIARY4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCWITHINST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCWITHINST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCWITHINST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCWITHINST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDINST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDINST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDINST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDINST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDCUST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDCUST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDCUST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDCUST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENINST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENINST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENINST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENINST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ULTBEN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ULTBEN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ULTBEN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ULTBEN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENINSTCOVR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENINSTCOVR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENINSTCOVR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENINSTCOVR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENINSTCOVR5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRPRYBIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRPRYACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRPRYNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AGID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="POSACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COUNTRCLGNW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SNDRTORECV6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCWITHINST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENINST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDIARY5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REIMINST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RCORRS15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDCUST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDINST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ULTBEN5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NEGOTIATEDRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="NEGOREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDINST6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDCUST6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENINST6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENINSTCOVR6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ULTBEN6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REIMINST6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDIARY6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RCVRCORRS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCWITHINST6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PAYABLEBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="WAIVEINSTCHARGES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PAYABLEBRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Settlement-Detail" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="INSTRCD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INSTRCD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INSTRCD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INSTRCD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ITIMEIND1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ITIMEIND2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ITIMEIND3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INSTRCD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BANKOPERCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INSTRCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TRNSTYPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REGREP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REGREP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REGREP3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ENVCONT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ENVCONT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ENVCONT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ENVCONT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ENVCONT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Lcl_Clearing" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FREETXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FREETXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="FREETXT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PMNTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADDINFOSORBNET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRCUSTNAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRCUSTNAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRCUSTNAME3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRCUSTNAME4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RCVRCUSTNAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RCVRCUSTNAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RCVRCUSTNAME3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RCVRCUSTNAME4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRRCVRPART" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="ULTBANDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADDLINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADDLINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADDLINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADDLINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NIPPAYER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="SUPPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PAYERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PMNTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOOFDEC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="ADDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRRCVRINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRRCVRINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRRCVRINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRRCVRINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRRCVRINFO5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRRCVRINFO6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DECLARTION" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="REPRES1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REPRES2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REPRES3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REPRES4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RCVRACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxnSetlDtls-Create-IO-Type", propOrder = {
    "conrefno",
    "latevnseqno",
    "contractSettlement"
})
public class TxnSetlDtlsCreateIOType {

    @XmlElement(name = "CONREFNO", required = true)
    protected String conrefno;
    @XmlElement(name = "LATEVNSEQNO")
    protected BigDecimal latevnseqno;
    @XmlElement(name = "Contract-Settlement")
    protected List<ContractSettlement> contractSettlement;

    /**
     * Gets the value of the conrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONREFNO() {
        return conrefno;
    }

    /**
     * Sets the value of the conrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONREFNO(String value) {
        this.conrefno = value;
    }

    /**
     * Gets the value of the latevnseqno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLATEVNSEQNO() {
        return latevnseqno;
    }

    /**
     * Sets the value of the latevnseqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLATEVNSEQNO(BigDecimal value) {
        this.latevnseqno = value;
    }

    /**
     * Gets the value of the contractSettlement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the contractSettlement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractSettlement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractSettlement }
     * 
     * 
     */
    public List<ContractSettlement> getContractSettlement() {
        if (contractSettlement == null) {
            contractSettlement = new ArrayList<ContractSettlement>();
        }
        return this.contractSettlement;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CUSTSPREAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="SPREADDEFN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EXRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="NETIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ERICCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ERIAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="GENMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RATECD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CLEARNW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COVERBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RTGSPMNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BANKPRIOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RTGSNW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PAYBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TRANSTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INSTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INSNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHGDET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PAYMNTDET1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PAYMNTDET2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PAYMNTDET3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PAYMNTDET4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SNDTRRCVINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SNDTRRCVINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SNDTRRCVINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SNDTRRCVINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SNDTRRCVINFO5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COVREQRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RECVCVR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RECEIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REIMINST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REIMINST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REIMINST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REIMINST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RCVRCORRS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RCVRCORRS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RCVRCORRS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RCVRCORRS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDIARY1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDIARY2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDIARY3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDIARY4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCWITHINST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCWITHINST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCWITHINST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCWITHINST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDINST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDINST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDINST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDINST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDCUST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDCUST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDCUST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDCUST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENINST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENINST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENINST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENINST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ULTBEN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ULTBEN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ULTBEN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ULTBEN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENINSTCOVR1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENINSTCOVR2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENINSTCOVR3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENINSTCOVR4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENINSTCOVR5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRPRYBIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRPRYACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRPRYNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AGID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="POSACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COUNTRCLGNW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SNDRTORECV6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCWITHINST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENINST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDIARY5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REIMINST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RCORRS15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDCUST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDINST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ULTBEN5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACC_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NEGOTIATEDRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="NEGOREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDINST6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDCUST6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENINST6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENINSTCOVR6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ULTBEN6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REIMINST6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDIARY6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RCVRCORRS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCWITHINST6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PAYABLEBANK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="WAIVEINSTCHARGES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PAYABLEBRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Settlement-Detail" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="INSTRCD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INSTRCD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INSTRCD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INSTRCD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ITIMEIND1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ITIMEIND2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ITIMEIND3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INSTRCD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BANKOPERCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INSTRCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TRNSTYPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REGREP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REGREP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REGREP3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ENVCONT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ENVCONT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ENVCONT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ENVCONT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ENVCONT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Lcl_Clearing" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FREETXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FREETXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="FREETXT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PMNTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADDINFOSORBNET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRCUSTNAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRCUSTNAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRCUSTNAME3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRCUSTNAME4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RCVRCUSTNAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RCVRCUSTNAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RCVRCUSTNAME3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RCVRCUSTNAME4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRRCVRPART" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="ULTBANDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADDLINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADDLINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADDLINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADDLINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NIPPAYER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="SUPPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PAYERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PMNTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOOFDEC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="ADDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRRCVRINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRRCVRINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRRCVRINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRRCVRINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRRCVRINFO5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRRCVRINFO6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DECLARTION" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="REPRES1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REPRES2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REPRES3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REPRES4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RCVRACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "custspread",
        "spreaddefn",
        "accbrn",
        "exrate",
        "netind",
        "ericcy",
        "eriamt",
        "genmsg",
        "ratecd",
        "clearnw",
        "coverby",
        "rtgspmnt",
        "bankprior",
        "rtgsnw",
        "payby",
        "transtyp",
        "instyp",
        "insno",
        "chgdet",
        "paymntdet1",
        "paymntdet2",
        "paymntdet3",
        "paymntdet4",
        "sndtrrcvinfo1",
        "sndtrrcvinfo2",
        "sndtrrcvinfo3",
        "sndtrrcvinfo4",
        "sndtrrcvinfo5",
        "covreqrd",
        "recvcvr",
        "receiver",
        "reiminst1",
        "reiminst2",
        "reiminst3",
        "reiminst4",
        "rcvrcorrs1",
        "rcvrcorrs2",
        "rcvrcorrs3",
        "rcvrcorrs4",
        "intermediary1",
        "intermediary2",
        "intermediary3",
        "intermediary4",
        "accwithinst1",
        "accwithinst2",
        "accwithinst3",
        "accwithinst4",
        "ordinst1",
        "ordinst2",
        "ordinst3",
        "ordinst4",
        "ordcust1",
        "ordcust2",
        "ordcust3",
        "ordcust4",
        "beninst1",
        "beninst2",
        "beninst3",
        "beninst4",
        "ultben1",
        "ultben2",
        "ultben3",
        "ultben4",
        "beninstcovr1",
        "beninstcovr2",
        "beninstcovr3",
        "beninstcovr4",
        "beninstcovr5",
        "countrprybic",
        "countrpryacc",
        "countrprynam",
        "agid",
        "posacc",
        "countrclgnw",
        "sndrtorecv6",
        "accwithinst5",
        "beninst5",
        "intermediary5",
        "reiminst5",
        "rcorrs15",
        "ordcust5",
        "ordinst5",
        "ultben5",
        "accdesc",
        "negotiatedrate",
        "negorefno",
        "ordinst6",
        "ordcust6",
        "beninst6",
        "beninstcovr6",
        "ultben6",
        "reiminst6",
        "intermediary6",
        "rcvrcorrs6",
        "accwithinst6",
        "payablebank",
        "waiveinstcharges",
        "payablebranch",
        "acc",
        "settlementDetail",
        "lclClearing"
    })
    public static class ContractSettlement {

        @XmlElement(name = "CUSTSPREAD")
        protected BigDecimal custspread;
        @XmlElement(name = "SPREADDEFN")
        protected String spreaddefn;
        @XmlElement(name = "ACCBRN")
        protected String accbrn;
        @XmlElement(name = "EXRATE")
        protected BigDecimal exrate;
        @XmlElement(name = "NETIND")
        protected String netind;
        @XmlElement(name = "ERICCY")
        protected String ericcy;
        @XmlElement(name = "ERIAMT")
        protected BigDecimal eriamt;
        @XmlElement(name = "GENMSG")
        protected String genmsg;
        @XmlElement(name = "RATECD")
        protected String ratecd;
        @XmlElement(name = "CLEARNW")
        protected String clearnw;
        @XmlElement(name = "COVERBY")
        protected String coverby;
        @XmlElement(name = "RTGSPMNT")
        protected String rtgspmnt;
        @XmlElement(name = "BANKPRIOR")
        protected String bankprior;
        @XmlElement(name = "RTGSNW")
        protected String rtgsnw;
        @XmlElement(name = "PAYBY")
        protected String payby;
        @XmlElement(name = "TRANSTYP")
        protected String transtyp;
        @XmlElement(name = "INSTYP")
        protected String instyp;
        @XmlElement(name = "INSNO")
        protected String insno;
        @XmlElement(name = "CHGDET")
        protected String chgdet;
        @XmlElement(name = "PAYMNTDET1")
        protected String paymntdet1;
        @XmlElement(name = "PAYMNTDET2")
        protected String paymntdet2;
        @XmlElement(name = "PAYMNTDET3")
        protected String paymntdet3;
        @XmlElement(name = "PAYMNTDET4")
        protected String paymntdet4;
        @XmlElement(name = "SNDTRRCVINFO1")
        protected String sndtrrcvinfo1;
        @XmlElement(name = "SNDTRRCVINFO2")
        protected String sndtrrcvinfo2;
        @XmlElement(name = "SNDTRRCVINFO3")
        protected String sndtrrcvinfo3;
        @XmlElement(name = "SNDTRRCVINFO4")
        protected String sndtrrcvinfo4;
        @XmlElement(name = "SNDTRRCVINFO5")
        protected String sndtrrcvinfo5;
        @XmlElement(name = "COVREQRD")
        protected String covreqrd;
        @XmlElement(name = "RECVCVR")
        protected String recvcvr;
        @XmlElement(name = "RECEIVER")
        protected String receiver;
        @XmlElement(name = "REIMINST1")
        protected String reiminst1;
        @XmlElement(name = "REIMINST2")
        protected String reiminst2;
        @XmlElement(name = "REIMINST3")
        protected String reiminst3;
        @XmlElement(name = "REIMINST4")
        protected String reiminst4;
        @XmlElement(name = "RCVRCORRS1")
        protected String rcvrcorrs1;
        @XmlElement(name = "RCVRCORRS2")
        protected String rcvrcorrs2;
        @XmlElement(name = "RCVRCORRS3")
        protected String rcvrcorrs3;
        @XmlElement(name = "RCVRCORRS4")
        protected String rcvrcorrs4;
        @XmlElement(name = "INTERMEDIARY1")
        protected String intermediary1;
        @XmlElement(name = "INTERMEDIARY2")
        protected String intermediary2;
        @XmlElement(name = "INTERMEDIARY3")
        protected String intermediary3;
        @XmlElement(name = "INTERMEDIARY4")
        protected String intermediary4;
        @XmlElement(name = "ACCWITHINST1")
        protected String accwithinst1;
        @XmlElement(name = "ACCWITHINST2")
        protected String accwithinst2;
        @XmlElement(name = "ACCWITHINST3")
        protected String accwithinst3;
        @XmlElement(name = "ACCWITHINST4")
        protected String accwithinst4;
        @XmlElement(name = "ORDINST1")
        protected String ordinst1;
        @XmlElement(name = "ORDINST2")
        protected String ordinst2;
        @XmlElement(name = "ORDINST3")
        protected String ordinst3;
        @XmlElement(name = "ORDINST4")
        protected String ordinst4;
        @XmlElement(name = "ORDCUST1")
        protected String ordcust1;
        @XmlElement(name = "ORDCUST2")
        protected String ordcust2;
        @XmlElement(name = "ORDCUST3")
        protected String ordcust3;
        @XmlElement(name = "ORDCUST4")
        protected String ordcust4;
        @XmlElement(name = "BENINST1")
        protected String beninst1;
        @XmlElement(name = "BENINST2")
        protected String beninst2;
        @XmlElement(name = "BENINST3")
        protected String beninst3;
        @XmlElement(name = "BENINST4")
        protected String beninst4;
        @XmlElement(name = "ULTBEN1")
        protected String ultben1;
        @XmlElement(name = "ULTBEN2")
        protected String ultben2;
        @XmlElement(name = "ULTBEN3")
        protected String ultben3;
        @XmlElement(name = "ULTBEN4")
        protected String ultben4;
        @XmlElement(name = "BENINSTCOVR1")
        protected String beninstcovr1;
        @XmlElement(name = "BENINSTCOVR2")
        protected String beninstcovr2;
        @XmlElement(name = "BENINSTCOVR3")
        protected String beninstcovr3;
        @XmlElement(name = "BENINSTCOVR4")
        protected String beninstcovr4;
        @XmlElement(name = "BENINSTCOVR5")
        protected String beninstcovr5;
        @XmlElement(name = "COUNTRPRYBIC")
        protected String countrprybic;
        @XmlElement(name = "COUNTRPRYACC")
        protected String countrpryacc;
        @XmlElement(name = "COUNTRPRYNAM")
        protected String countrprynam;
        @XmlElement(name = "AGID")
        protected String agid;
        @XmlElement(name = "POSACC")
        protected String posacc;
        @XmlElement(name = "COUNTRCLGNW")
        protected String countrclgnw;
        @XmlElement(name = "SNDRTORECV6")
        protected String sndrtorecv6;
        @XmlElement(name = "ACCWITHINST5")
        protected String accwithinst5;
        @XmlElement(name = "BENINST5")
        protected String beninst5;
        @XmlElement(name = "INTERMEDIARY5")
        protected String intermediary5;
        @XmlElement(name = "REIMINST5")
        protected String reiminst5;
        @XmlElement(name = "RCORRS15")
        protected String rcorrs15;
        @XmlElement(name = "ORDCUST5")
        protected String ordcust5;
        @XmlElement(name = "ORDINST5")
        protected String ordinst5;
        @XmlElement(name = "ULTBEN5")
        protected String ultben5;
        @XmlElement(name = "ACC_DESC")
        protected String accdesc;
        @XmlElement(name = "NEGOTIATEDRATE")
        protected BigDecimal negotiatedrate;
        @XmlElement(name = "NEGOREFNO")
        protected String negorefno;
        @XmlElement(name = "ORDINST6")
        protected String ordinst6;
        @XmlElement(name = "ORDCUST6")
        protected String ordcust6;
        @XmlElement(name = "BENINST6")
        protected String beninst6;
        @XmlElement(name = "BENINSTCOVR6")
        protected String beninstcovr6;
        @XmlElement(name = "ULTBEN6")
        protected String ultben6;
        @XmlElement(name = "REIMINST6")
        protected String reiminst6;
        @XmlElement(name = "INTERMEDIARY6")
        protected String intermediary6;
        @XmlElement(name = "RCVRCORRS6")
        protected String rcvrcorrs6;
        @XmlElement(name = "ACCWITHINST6")
        protected String accwithinst6;
        @XmlElement(name = "PAYABLEBANK")
        protected String payablebank;
        @XmlElement(name = "WAIVEINSTCHARGES")
        protected String waiveinstcharges;
        @XmlElement(name = "PAYABLEBRANCH")
        protected String payablebranch;
        @XmlElement(name = "ACC")
        protected String acc;
        @XmlElement(name = "Settlement-Detail")
        protected SettlementDetail settlementDetail;
        @XmlElement(name = "Lcl_Clearing")
        protected LclClearing lclClearing;

        /**
         * Gets the value of the custspread property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCUSTSPREAD() {
            return custspread;
        }

        /**
         * Sets the value of the custspread property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCUSTSPREAD(BigDecimal value) {
            this.custspread = value;
        }

        /**
         * Gets the value of the spreaddefn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSPREADDEFN() {
            return spreaddefn;
        }

        /**
         * Sets the value of the spreaddefn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSPREADDEFN(String value) {
            this.spreaddefn = value;
        }

        /**
         * Gets the value of the accbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCBRN() {
            return accbrn;
        }

        /**
         * Sets the value of the accbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCBRN(String value) {
            this.accbrn = value;
        }

        /**
         * Gets the value of the exrate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEXRATE() {
            return exrate;
        }

        /**
         * Sets the value of the exrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEXRATE(BigDecimal value) {
            this.exrate = value;
        }

        /**
         * Gets the value of the netind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNETIND() {
            return netind;
        }

        /**
         * Sets the value of the netind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNETIND(String value) {
            this.netind = value;
        }

        /**
         * Gets the value of the ericcy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getERICCY() {
            return ericcy;
        }

        /**
         * Sets the value of the ericcy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setERICCY(String value) {
            this.ericcy = value;
        }

        /**
         * Gets the value of the eriamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getERIAMT() {
            return eriamt;
        }

        /**
         * Sets the value of the eriamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setERIAMT(BigDecimal value) {
            this.eriamt = value;
        }

        /**
         * Gets the value of the genmsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGENMSG() {
            return genmsg;
        }

        /**
         * Sets the value of the genmsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGENMSG(String value) {
            this.genmsg = value;
        }

        /**
         * Gets the value of the ratecd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRATECD() {
            return ratecd;
        }

        /**
         * Sets the value of the ratecd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRATECD(String value) {
            this.ratecd = value;
        }

        /**
         * Gets the value of the clearnw property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCLEARNW() {
            return clearnw;
        }

        /**
         * Sets the value of the clearnw property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCLEARNW(String value) {
            this.clearnw = value;
        }

        /**
         * Gets the value of the coverby property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOVERBY() {
            return coverby;
        }

        /**
         * Sets the value of the coverby property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOVERBY(String value) {
            this.coverby = value;
        }

        /**
         * Gets the value of the rtgspmnt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRTGSPMNT() {
            return rtgspmnt;
        }

        /**
         * Sets the value of the rtgspmnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRTGSPMNT(String value) {
            this.rtgspmnt = value;
        }

        /**
         * Gets the value of the bankprior property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBANKPRIOR() {
            return bankprior;
        }

        /**
         * Sets the value of the bankprior property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBANKPRIOR(String value) {
            this.bankprior = value;
        }

        /**
         * Gets the value of the rtgsnw property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRTGSNW() {
            return rtgsnw;
        }

        /**
         * Sets the value of the rtgsnw property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRTGSNW(String value) {
            this.rtgsnw = value;
        }

        /**
         * Gets the value of the payby property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYBY() {
            return payby;
        }

        /**
         * Sets the value of the payby property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYBY(String value) {
            this.payby = value;
        }

        /**
         * Gets the value of the transtyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRANSTYP() {
            return transtyp;
        }

        /**
         * Sets the value of the transtyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRANSTYP(String value) {
            this.transtyp = value;
        }

        /**
         * Gets the value of the instyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTYP() {
            return instyp;
        }

        /**
         * Sets the value of the instyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTYP(String value) {
            this.instyp = value;
        }

        /**
         * Gets the value of the insno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSNO() {
            return insno;
        }

        /**
         * Sets the value of the insno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSNO(String value) {
            this.insno = value;
        }

        /**
         * Gets the value of the chgdet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGDET() {
            return chgdet;
        }

        /**
         * Sets the value of the chgdet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGDET(String value) {
            this.chgdet = value;
        }

        /**
         * Gets the value of the paymntdet1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYMNTDET1() {
            return paymntdet1;
        }

        /**
         * Sets the value of the paymntdet1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYMNTDET1(String value) {
            this.paymntdet1 = value;
        }

        /**
         * Gets the value of the paymntdet2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYMNTDET2() {
            return paymntdet2;
        }

        /**
         * Sets the value of the paymntdet2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYMNTDET2(String value) {
            this.paymntdet2 = value;
        }

        /**
         * Gets the value of the paymntdet3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYMNTDET3() {
            return paymntdet3;
        }

        /**
         * Sets the value of the paymntdet3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYMNTDET3(String value) {
            this.paymntdet3 = value;
        }

        /**
         * Gets the value of the paymntdet4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYMNTDET4() {
            return paymntdet4;
        }

        /**
         * Sets the value of the paymntdet4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYMNTDET4(String value) {
            this.paymntdet4 = value;
        }

        /**
         * Gets the value of the sndtrrcvinfo1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSNDTRRCVINFO1() {
            return sndtrrcvinfo1;
        }

        /**
         * Sets the value of the sndtrrcvinfo1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSNDTRRCVINFO1(String value) {
            this.sndtrrcvinfo1 = value;
        }

        /**
         * Gets the value of the sndtrrcvinfo2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSNDTRRCVINFO2() {
            return sndtrrcvinfo2;
        }

        /**
         * Sets the value of the sndtrrcvinfo2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSNDTRRCVINFO2(String value) {
            this.sndtrrcvinfo2 = value;
        }

        /**
         * Gets the value of the sndtrrcvinfo3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSNDTRRCVINFO3() {
            return sndtrrcvinfo3;
        }

        /**
         * Sets the value of the sndtrrcvinfo3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSNDTRRCVINFO3(String value) {
            this.sndtrrcvinfo3 = value;
        }

        /**
         * Gets the value of the sndtrrcvinfo4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSNDTRRCVINFO4() {
            return sndtrrcvinfo4;
        }

        /**
         * Sets the value of the sndtrrcvinfo4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSNDTRRCVINFO4(String value) {
            this.sndtrrcvinfo4 = value;
        }

        /**
         * Gets the value of the sndtrrcvinfo5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSNDTRRCVINFO5() {
            return sndtrrcvinfo5;
        }

        /**
         * Sets the value of the sndtrrcvinfo5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSNDTRRCVINFO5(String value) {
            this.sndtrrcvinfo5 = value;
        }

        /**
         * Gets the value of the covreqrd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOVREQRD() {
            return covreqrd;
        }

        /**
         * Sets the value of the covreqrd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOVREQRD(String value) {
            this.covreqrd = value;
        }

        /**
         * Gets the value of the recvcvr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRECVCVR() {
            return recvcvr;
        }

        /**
         * Sets the value of the recvcvr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRECVCVR(String value) {
            this.recvcvr = value;
        }

        /**
         * Gets the value of the receiver property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRECEIVER() {
            return receiver;
        }

        /**
         * Sets the value of the receiver property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRECEIVER(String value) {
            this.receiver = value;
        }

        /**
         * Gets the value of the reiminst1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREIMINST1() {
            return reiminst1;
        }

        /**
         * Sets the value of the reiminst1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREIMINST1(String value) {
            this.reiminst1 = value;
        }

        /**
         * Gets the value of the reiminst2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREIMINST2() {
            return reiminst2;
        }

        /**
         * Sets the value of the reiminst2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREIMINST2(String value) {
            this.reiminst2 = value;
        }

        /**
         * Gets the value of the reiminst3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREIMINST3() {
            return reiminst3;
        }

        /**
         * Sets the value of the reiminst3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREIMINST3(String value) {
            this.reiminst3 = value;
        }

        /**
         * Gets the value of the reiminst4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREIMINST4() {
            return reiminst4;
        }

        /**
         * Sets the value of the reiminst4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREIMINST4(String value) {
            this.reiminst4 = value;
        }

        /**
         * Gets the value of the rcvrcorrs1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRCVRCORRS1() {
            return rcvrcorrs1;
        }

        /**
         * Sets the value of the rcvrcorrs1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRCVRCORRS1(String value) {
            this.rcvrcorrs1 = value;
        }

        /**
         * Gets the value of the rcvrcorrs2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRCVRCORRS2() {
            return rcvrcorrs2;
        }

        /**
         * Sets the value of the rcvrcorrs2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRCVRCORRS2(String value) {
            this.rcvrcorrs2 = value;
        }

        /**
         * Gets the value of the rcvrcorrs3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRCVRCORRS3() {
            return rcvrcorrs3;
        }

        /**
         * Sets the value of the rcvrcorrs3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRCVRCORRS3(String value) {
            this.rcvrcorrs3 = value;
        }

        /**
         * Gets the value of the rcvrcorrs4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRCVRCORRS4() {
            return rcvrcorrs4;
        }

        /**
         * Sets the value of the rcvrcorrs4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRCVRCORRS4(String value) {
            this.rcvrcorrs4 = value;
        }

        /**
         * Gets the value of the intermediary1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDIARY1() {
            return intermediary1;
        }

        /**
         * Sets the value of the intermediary1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDIARY1(String value) {
            this.intermediary1 = value;
        }

        /**
         * Gets the value of the intermediary2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDIARY2() {
            return intermediary2;
        }

        /**
         * Sets the value of the intermediary2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDIARY2(String value) {
            this.intermediary2 = value;
        }

        /**
         * Gets the value of the intermediary3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDIARY3() {
            return intermediary3;
        }

        /**
         * Sets the value of the intermediary3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDIARY3(String value) {
            this.intermediary3 = value;
        }

        /**
         * Gets the value of the intermediary4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDIARY4() {
            return intermediary4;
        }

        /**
         * Sets the value of the intermediary4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDIARY4(String value) {
            this.intermediary4 = value;
        }

        /**
         * Gets the value of the accwithinst1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCWITHINST1() {
            return accwithinst1;
        }

        /**
         * Sets the value of the accwithinst1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCWITHINST1(String value) {
            this.accwithinst1 = value;
        }

        /**
         * Gets the value of the accwithinst2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCWITHINST2() {
            return accwithinst2;
        }

        /**
         * Sets the value of the accwithinst2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCWITHINST2(String value) {
            this.accwithinst2 = value;
        }

        /**
         * Gets the value of the accwithinst3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCWITHINST3() {
            return accwithinst3;
        }

        /**
         * Sets the value of the accwithinst3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCWITHINST3(String value) {
            this.accwithinst3 = value;
        }

        /**
         * Gets the value of the accwithinst4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCWITHINST4() {
            return accwithinst4;
        }

        /**
         * Sets the value of the accwithinst4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCWITHINST4(String value) {
            this.accwithinst4 = value;
        }

        /**
         * Gets the value of the ordinst1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDINST1() {
            return ordinst1;
        }

        /**
         * Sets the value of the ordinst1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDINST1(String value) {
            this.ordinst1 = value;
        }

        /**
         * Gets the value of the ordinst2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDINST2() {
            return ordinst2;
        }

        /**
         * Sets the value of the ordinst2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDINST2(String value) {
            this.ordinst2 = value;
        }

        /**
         * Gets the value of the ordinst3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDINST3() {
            return ordinst3;
        }

        /**
         * Sets the value of the ordinst3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDINST3(String value) {
            this.ordinst3 = value;
        }

        /**
         * Gets the value of the ordinst4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDINST4() {
            return ordinst4;
        }

        /**
         * Sets the value of the ordinst4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDINST4(String value) {
            this.ordinst4 = value;
        }

        /**
         * Gets the value of the ordcust1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDCUST1() {
            return ordcust1;
        }

        /**
         * Sets the value of the ordcust1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDCUST1(String value) {
            this.ordcust1 = value;
        }

        /**
         * Gets the value of the ordcust2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDCUST2() {
            return ordcust2;
        }

        /**
         * Sets the value of the ordcust2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDCUST2(String value) {
            this.ordcust2 = value;
        }

        /**
         * Gets the value of the ordcust3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDCUST3() {
            return ordcust3;
        }

        /**
         * Sets the value of the ordcust3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDCUST3(String value) {
            this.ordcust3 = value;
        }

        /**
         * Gets the value of the ordcust4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDCUST4() {
            return ordcust4;
        }

        /**
         * Sets the value of the ordcust4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDCUST4(String value) {
            this.ordcust4 = value;
        }

        /**
         * Gets the value of the beninst1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENINST1() {
            return beninst1;
        }

        /**
         * Sets the value of the beninst1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENINST1(String value) {
            this.beninst1 = value;
        }

        /**
         * Gets the value of the beninst2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENINST2() {
            return beninst2;
        }

        /**
         * Sets the value of the beninst2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENINST2(String value) {
            this.beninst2 = value;
        }

        /**
         * Gets the value of the beninst3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENINST3() {
            return beninst3;
        }

        /**
         * Sets the value of the beninst3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENINST3(String value) {
            this.beninst3 = value;
        }

        /**
         * Gets the value of the beninst4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENINST4() {
            return beninst4;
        }

        /**
         * Sets the value of the beninst4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENINST4(String value) {
            this.beninst4 = value;
        }

        /**
         * Gets the value of the ultben1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getULTBEN1() {
            return ultben1;
        }

        /**
         * Sets the value of the ultben1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setULTBEN1(String value) {
            this.ultben1 = value;
        }

        /**
         * Gets the value of the ultben2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getULTBEN2() {
            return ultben2;
        }

        /**
         * Sets the value of the ultben2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setULTBEN2(String value) {
            this.ultben2 = value;
        }

        /**
         * Gets the value of the ultben3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getULTBEN3() {
            return ultben3;
        }

        /**
         * Sets the value of the ultben3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setULTBEN3(String value) {
            this.ultben3 = value;
        }

        /**
         * Gets the value of the ultben4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getULTBEN4() {
            return ultben4;
        }

        /**
         * Sets the value of the ultben4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setULTBEN4(String value) {
            this.ultben4 = value;
        }

        /**
         * Gets the value of the beninstcovr1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENINSTCOVR1() {
            return beninstcovr1;
        }

        /**
         * Sets the value of the beninstcovr1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENINSTCOVR1(String value) {
            this.beninstcovr1 = value;
        }

        /**
         * Gets the value of the beninstcovr2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENINSTCOVR2() {
            return beninstcovr2;
        }

        /**
         * Sets the value of the beninstcovr2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENINSTCOVR2(String value) {
            this.beninstcovr2 = value;
        }

        /**
         * Gets the value of the beninstcovr3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENINSTCOVR3() {
            return beninstcovr3;
        }

        /**
         * Sets the value of the beninstcovr3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENINSTCOVR3(String value) {
            this.beninstcovr3 = value;
        }

        /**
         * Gets the value of the beninstcovr4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENINSTCOVR4() {
            return beninstcovr4;
        }

        /**
         * Sets the value of the beninstcovr4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENINSTCOVR4(String value) {
            this.beninstcovr4 = value;
        }

        /**
         * Gets the value of the beninstcovr5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENINSTCOVR5() {
            return beninstcovr5;
        }

        /**
         * Sets the value of the beninstcovr5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENINSTCOVR5(String value) {
            this.beninstcovr5 = value;
        }

        /**
         * Gets the value of the countrprybic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRPRYBIC() {
            return countrprybic;
        }

        /**
         * Sets the value of the countrprybic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRPRYBIC(String value) {
            this.countrprybic = value;
        }

        /**
         * Gets the value of the countrpryacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRPRYACC() {
            return countrpryacc;
        }

        /**
         * Sets the value of the countrpryacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRPRYACC(String value) {
            this.countrpryacc = value;
        }

        /**
         * Gets the value of the countrprynam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRPRYNAM() {
            return countrprynam;
        }

        /**
         * Sets the value of the countrprynam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRPRYNAM(String value) {
            this.countrprynam = value;
        }

        /**
         * Gets the value of the agid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAGID() {
            return agid;
        }

        /**
         * Sets the value of the agid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAGID(String value) {
            this.agid = value;
        }

        /**
         * Gets the value of the posacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPOSACC() {
            return posacc;
        }

        /**
         * Sets the value of the posacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPOSACC(String value) {
            this.posacc = value;
        }

        /**
         * Gets the value of the countrclgnw property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRCLGNW() {
            return countrclgnw;
        }

        /**
         * Sets the value of the countrclgnw property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRCLGNW(String value) {
            this.countrclgnw = value;
        }

        /**
         * Gets the value of the sndrtorecv6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSNDRTORECV6() {
            return sndrtorecv6;
        }

        /**
         * Sets the value of the sndrtorecv6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSNDRTORECV6(String value) {
            this.sndrtorecv6 = value;
        }

        /**
         * Gets the value of the accwithinst5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCWITHINST5() {
            return accwithinst5;
        }

        /**
         * Sets the value of the accwithinst5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCWITHINST5(String value) {
            this.accwithinst5 = value;
        }

        /**
         * Gets the value of the beninst5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENINST5() {
            return beninst5;
        }

        /**
         * Sets the value of the beninst5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENINST5(String value) {
            this.beninst5 = value;
        }

        /**
         * Gets the value of the intermediary5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDIARY5() {
            return intermediary5;
        }

        /**
         * Sets the value of the intermediary5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDIARY5(String value) {
            this.intermediary5 = value;
        }

        /**
         * Gets the value of the reiminst5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREIMINST5() {
            return reiminst5;
        }

        /**
         * Sets the value of the reiminst5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREIMINST5(String value) {
            this.reiminst5 = value;
        }

        /**
         * Gets the value of the rcorrs15 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRCORRS15() {
            return rcorrs15;
        }

        /**
         * Sets the value of the rcorrs15 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRCORRS15(String value) {
            this.rcorrs15 = value;
        }

        /**
         * Gets the value of the ordcust5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDCUST5() {
            return ordcust5;
        }

        /**
         * Sets the value of the ordcust5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDCUST5(String value) {
            this.ordcust5 = value;
        }

        /**
         * Gets the value of the ordinst5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDINST5() {
            return ordinst5;
        }

        /**
         * Sets the value of the ordinst5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDINST5(String value) {
            this.ordinst5 = value;
        }

        /**
         * Gets the value of the ultben5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getULTBEN5() {
            return ultben5;
        }

        /**
         * Sets the value of the ultben5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setULTBEN5(String value) {
            this.ultben5 = value;
        }

        /**
         * Gets the value of the accdesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCDESC() {
            return accdesc;
        }

        /**
         * Sets the value of the accdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCDESC(String value) {
            this.accdesc = value;
        }

        /**
         * Gets the value of the negotiatedrate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNEGOTIATEDRATE() {
            return negotiatedrate;
        }

        /**
         * Sets the value of the negotiatedrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNEGOTIATEDRATE(BigDecimal value) {
            this.negotiatedrate = value;
        }

        /**
         * Gets the value of the negorefno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNEGOREFNO() {
            return negorefno;
        }

        /**
         * Sets the value of the negorefno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNEGOREFNO(String value) {
            this.negorefno = value;
        }

        /**
         * Gets the value of the ordinst6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDINST6() {
            return ordinst6;
        }

        /**
         * Sets the value of the ordinst6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDINST6(String value) {
            this.ordinst6 = value;
        }

        /**
         * Gets the value of the ordcust6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDCUST6() {
            return ordcust6;
        }

        /**
         * Sets the value of the ordcust6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDCUST6(String value) {
            this.ordcust6 = value;
        }

        /**
         * Gets the value of the beninst6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENINST6() {
            return beninst6;
        }

        /**
         * Sets the value of the beninst6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENINST6(String value) {
            this.beninst6 = value;
        }

        /**
         * Gets the value of the beninstcovr6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENINSTCOVR6() {
            return beninstcovr6;
        }

        /**
         * Sets the value of the beninstcovr6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENINSTCOVR6(String value) {
            this.beninstcovr6 = value;
        }

        /**
         * Gets the value of the ultben6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getULTBEN6() {
            return ultben6;
        }

        /**
         * Sets the value of the ultben6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setULTBEN6(String value) {
            this.ultben6 = value;
        }

        /**
         * Gets the value of the reiminst6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREIMINST6() {
            return reiminst6;
        }

        /**
         * Sets the value of the reiminst6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREIMINST6(String value) {
            this.reiminst6 = value;
        }

        /**
         * Gets the value of the intermediary6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDIARY6() {
            return intermediary6;
        }

        /**
         * Sets the value of the intermediary6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDIARY6(String value) {
            this.intermediary6 = value;
        }

        /**
         * Gets the value of the rcvrcorrs6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRCVRCORRS6() {
            return rcvrcorrs6;
        }

        /**
         * Sets the value of the rcvrcorrs6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRCVRCORRS6(String value) {
            this.rcvrcorrs6 = value;
        }

        /**
         * Gets the value of the accwithinst6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCWITHINST6() {
            return accwithinst6;
        }

        /**
         * Sets the value of the accwithinst6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCWITHINST6(String value) {
            this.accwithinst6 = value;
        }

        /**
         * Gets the value of the payablebank property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYABLEBANK() {
            return payablebank;
        }

        /**
         * Sets the value of the payablebank property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYABLEBANK(String value) {
            this.payablebank = value;
        }

        /**
         * Gets the value of the waiveinstcharges property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWAIVEINSTCHARGES() {
            return waiveinstcharges;
        }

        /**
         * Sets the value of the waiveinstcharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWAIVEINSTCHARGES(String value) {
            this.waiveinstcharges = value;
        }

        /**
         * Gets the value of the payablebranch property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYABLEBRANCH() {
            return payablebranch;
        }

        /**
         * Sets the value of the payablebranch property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYABLEBRANCH(String value) {
            this.payablebranch = value;
        }

        /**
         * Gets the value of the acc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACC() {
            return acc;
        }

        /**
         * Sets the value of the acc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACC(String value) {
            this.acc = value;
        }

        /**
         * Gets the value of the settlementDetail property.
         * 
         * @return
         *     possible object is
         *     {@link SettlementDetail }
         *     
         */
        public SettlementDetail getSettlementDetail() {
            return settlementDetail;
        }

        /**
         * Sets the value of the settlementDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link SettlementDetail }
         *     
         */
        public void setSettlementDetail(SettlementDetail value) {
            this.settlementDetail = value;
        }

        /**
         * Gets the value of the lclClearing property.
         * 
         * @return
         *     possible object is
         *     {@link LclClearing }
         *     
         */
        public LclClearing getLclClearing() {
            return lclClearing;
        }

        /**
         * Sets the value of the lclClearing property.
         * 
         * @param value
         *     allowed object is
         *     {@link LclClearing }
         *     
         */
        public void setLclClearing(LclClearing value) {
            this.lclClearing = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="FREETXT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FREETXT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="FREETXT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PMNTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADDINFOSORBNET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRCUSTNAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRCUSTNAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRCUSTNAME3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRCUSTNAME4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RCVRCUSTNAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RCVRCUSTNAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RCVRCUSTNAME3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RCVRCUSTNAME4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRRCVRPART" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="ULTBANDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADDLINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADDLINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADDLINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADDLINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NIPPAYER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="SUPPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PAYERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PMNTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOOFDEC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="ADDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRRCVRINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRRCVRINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRRCVRINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRRCVRINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRRCVRINFO5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRRCVRINFO6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DECLARTION" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="REPRES1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REPRES2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REPRES3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REPRES4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RCVRACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "freetxt1",
            "freetxt2",
            "freetxt3",
            "pmntcd",
            "addinfosorbnet",
            "sndrcustname1",
            "sndrcustname2",
            "sndrcustname3",
            "sndrcustname4",
            "rcvrcustname1",
            "rcvrcustname2",
            "rcvrcustname3",
            "rcvrcustname4",
            "sndrrcvrpart",
            "ultbandcd",
            "addlinfo1",
            "addlinfo2",
            "addlinfo3",
            "addlinfo4",
            "nippayer",
            "suppid",
            "payerid",
            "pmnttyp",
            "noofdec",
            "addid",
            "sndrrcvrinfo1",
            "sndrrcvrinfo2",
            "sndrrcvrinfo3",
            "sndrrcvrinfo4",
            "sndrrcvrinfo5",
            "sndrrcvrinfo6",
            "declartion",
            "repres1",
            "repres2",
            "repres3",
            "repres4",
            "rcvracc"
        })
        public static class LclClearing {

            @XmlElement(name = "FREETXT1")
            protected String freetxt1;
            @XmlElement(name = "FREETXT2")
            protected String freetxt2;
            @XmlElement(name = "FREETXT3")
            protected String freetxt3;
            @XmlElement(name = "PMNTCD")
            protected String pmntcd;
            @XmlElement(name = "ADDINFOSORBNET")
            protected String addinfosorbnet;
            @XmlElement(name = "SNDRCUSTNAME1")
            protected String sndrcustname1;
            @XmlElement(name = "SNDRCUSTNAME2")
            protected String sndrcustname2;
            @XmlElement(name = "SNDRCUSTNAME3")
            protected String sndrcustname3;
            @XmlElement(name = "SNDRCUSTNAME4")
            protected String sndrcustname4;
            @XmlElement(name = "RCVRCUSTNAME1")
            protected String rcvrcustname1;
            @XmlElement(name = "RCVRCUSTNAME2")
            protected String rcvrcustname2;
            @XmlElement(name = "RCVRCUSTNAME3")
            protected String rcvrcustname3;
            @XmlElement(name = "RCVRCUSTNAME4")
            protected String rcvrcustname4;
            @XmlElement(name = "SNDRRCVRPART")
            protected BigDecimal sndrrcvrpart;
            @XmlElement(name = "ULTBANDCD")
            protected String ultbandcd;
            @XmlElement(name = "ADDLINFO1")
            protected String addlinfo1;
            @XmlElement(name = "ADDLINFO2")
            protected String addlinfo2;
            @XmlElement(name = "ADDLINFO3")
            protected String addlinfo3;
            @XmlElement(name = "ADDLINFO4")
            protected String addlinfo4;
            @XmlElement(name = "NIPPAYER")
            protected BigDecimal nippayer;
            @XmlElement(name = "SUPPID")
            protected String suppid;
            @XmlElement(name = "PAYERID")
            protected String payerid;
            @XmlElement(name = "PMNTTYP")
            protected String pmnttyp;
            @XmlElement(name = "NOOFDEC")
            protected BigDecimal noofdec;
            @XmlElement(name = "ADDID")
            protected String addid;
            @XmlElement(name = "SNDRRCVRINFO1")
            protected String sndrrcvrinfo1;
            @XmlElement(name = "SNDRRCVRINFO2")
            protected String sndrrcvrinfo2;
            @XmlElement(name = "SNDRRCVRINFO3")
            protected String sndrrcvrinfo3;
            @XmlElement(name = "SNDRRCVRINFO4")
            protected String sndrrcvrinfo4;
            @XmlElement(name = "SNDRRCVRINFO5")
            protected String sndrrcvrinfo5;
            @XmlElement(name = "SNDRRCVRINFO6")
            protected String sndrrcvrinfo6;
            @XmlElement(name = "DECLARTION")
            protected BigDecimal declartion;
            @XmlElement(name = "REPRES1")
            protected String repres1;
            @XmlElement(name = "REPRES2")
            protected String repres2;
            @XmlElement(name = "REPRES3")
            protected String repres3;
            @XmlElement(name = "REPRES4")
            protected String repres4;
            @XmlElement(name = "RCVRACC")
            protected String rcvracc;

            /**
             * Gets the value of the freetxt1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFREETXT1() {
                return freetxt1;
            }

            /**
             * Sets the value of the freetxt1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFREETXT1(String value) {
                this.freetxt1 = value;
            }

            /**
             * Gets the value of the freetxt2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFREETXT2() {
                return freetxt2;
            }

            /**
             * Sets the value of the freetxt2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFREETXT2(String value) {
                this.freetxt2 = value;
            }

            /**
             * Gets the value of the freetxt3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFREETXT3() {
                return freetxt3;
            }

            /**
             * Sets the value of the freetxt3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFREETXT3(String value) {
                this.freetxt3 = value;
            }

            /**
             * Gets the value of the pmntcd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPMNTCD() {
                return pmntcd;
            }

            /**
             * Sets the value of the pmntcd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPMNTCD(String value) {
                this.pmntcd = value;
            }

            /**
             * Gets the value of the addinfosorbnet property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDINFOSORBNET() {
                return addinfosorbnet;
            }

            /**
             * Sets the value of the addinfosorbnet property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDINFOSORBNET(String value) {
                this.addinfosorbnet = value;
            }

            /**
             * Gets the value of the sndrcustname1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRCUSTNAME1() {
                return sndrcustname1;
            }

            /**
             * Sets the value of the sndrcustname1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRCUSTNAME1(String value) {
                this.sndrcustname1 = value;
            }

            /**
             * Gets the value of the sndrcustname2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRCUSTNAME2() {
                return sndrcustname2;
            }

            /**
             * Sets the value of the sndrcustname2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRCUSTNAME2(String value) {
                this.sndrcustname2 = value;
            }

            /**
             * Gets the value of the sndrcustname3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRCUSTNAME3() {
                return sndrcustname3;
            }

            /**
             * Sets the value of the sndrcustname3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRCUSTNAME3(String value) {
                this.sndrcustname3 = value;
            }

            /**
             * Gets the value of the sndrcustname4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRCUSTNAME4() {
                return sndrcustname4;
            }

            /**
             * Sets the value of the sndrcustname4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRCUSTNAME4(String value) {
                this.sndrcustname4 = value;
            }

            /**
             * Gets the value of the rcvrcustname1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRCVRCUSTNAME1() {
                return rcvrcustname1;
            }

            /**
             * Sets the value of the rcvrcustname1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRCVRCUSTNAME1(String value) {
                this.rcvrcustname1 = value;
            }

            /**
             * Gets the value of the rcvrcustname2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRCVRCUSTNAME2() {
                return rcvrcustname2;
            }

            /**
             * Sets the value of the rcvrcustname2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRCVRCUSTNAME2(String value) {
                this.rcvrcustname2 = value;
            }

            /**
             * Gets the value of the rcvrcustname3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRCVRCUSTNAME3() {
                return rcvrcustname3;
            }

            /**
             * Sets the value of the rcvrcustname3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRCVRCUSTNAME3(String value) {
                this.rcvrcustname3 = value;
            }

            /**
             * Gets the value of the rcvrcustname4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRCVRCUSTNAME4() {
                return rcvrcustname4;
            }

            /**
             * Sets the value of the rcvrcustname4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRCVRCUSTNAME4(String value) {
                this.rcvrcustname4 = value;
            }

            /**
             * Gets the value of the sndrrcvrpart property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSNDRRCVRPART() {
                return sndrrcvrpart;
            }

            /**
             * Sets the value of the sndrrcvrpart property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSNDRRCVRPART(BigDecimal value) {
                this.sndrrcvrpart = value;
            }

            /**
             * Gets the value of the ultbandcd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getULTBANDCD() {
                return ultbandcd;
            }

            /**
             * Sets the value of the ultbandcd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setULTBANDCD(String value) {
                this.ultbandcd = value;
            }

            /**
             * Gets the value of the addlinfo1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDLINFO1() {
                return addlinfo1;
            }

            /**
             * Sets the value of the addlinfo1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDLINFO1(String value) {
                this.addlinfo1 = value;
            }

            /**
             * Gets the value of the addlinfo2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDLINFO2() {
                return addlinfo2;
            }

            /**
             * Sets the value of the addlinfo2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDLINFO2(String value) {
                this.addlinfo2 = value;
            }

            /**
             * Gets the value of the addlinfo3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDLINFO3() {
                return addlinfo3;
            }

            /**
             * Sets the value of the addlinfo3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDLINFO3(String value) {
                this.addlinfo3 = value;
            }

            /**
             * Gets the value of the addlinfo4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDLINFO4() {
                return addlinfo4;
            }

            /**
             * Sets the value of the addlinfo4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDLINFO4(String value) {
                this.addlinfo4 = value;
            }

            /**
             * Gets the value of the nippayer property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNIPPAYER() {
                return nippayer;
            }

            /**
             * Sets the value of the nippayer property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNIPPAYER(BigDecimal value) {
                this.nippayer = value;
            }

            /**
             * Gets the value of the suppid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSUPPID() {
                return suppid;
            }

            /**
             * Sets the value of the suppid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSUPPID(String value) {
                this.suppid = value;
            }

            /**
             * Gets the value of the payerid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYERID() {
                return payerid;
            }

            /**
             * Sets the value of the payerid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYERID(String value) {
                this.payerid = value;
            }

            /**
             * Gets the value of the pmnttyp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPMNTTYP() {
                return pmnttyp;
            }

            /**
             * Sets the value of the pmnttyp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPMNTTYP(String value) {
                this.pmnttyp = value;
            }

            /**
             * Gets the value of the noofdec property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNOOFDEC() {
                return noofdec;
            }

            /**
             * Sets the value of the noofdec property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNOOFDEC(BigDecimal value) {
                this.noofdec = value;
            }

            /**
             * Gets the value of the addid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDID() {
                return addid;
            }

            /**
             * Sets the value of the addid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDID(String value) {
                this.addid = value;
            }

            /**
             * Gets the value of the sndrrcvrinfo1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRRCVRINFO1() {
                return sndrrcvrinfo1;
            }

            /**
             * Sets the value of the sndrrcvrinfo1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRRCVRINFO1(String value) {
                this.sndrrcvrinfo1 = value;
            }

            /**
             * Gets the value of the sndrrcvrinfo2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRRCVRINFO2() {
                return sndrrcvrinfo2;
            }

            /**
             * Sets the value of the sndrrcvrinfo2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRRCVRINFO2(String value) {
                this.sndrrcvrinfo2 = value;
            }

            /**
             * Gets the value of the sndrrcvrinfo3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRRCVRINFO3() {
                return sndrrcvrinfo3;
            }

            /**
             * Sets the value of the sndrrcvrinfo3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRRCVRINFO3(String value) {
                this.sndrrcvrinfo3 = value;
            }

            /**
             * Gets the value of the sndrrcvrinfo4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRRCVRINFO4() {
                return sndrrcvrinfo4;
            }

            /**
             * Sets the value of the sndrrcvrinfo4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRRCVRINFO4(String value) {
                this.sndrrcvrinfo4 = value;
            }

            /**
             * Gets the value of the sndrrcvrinfo5 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRRCVRINFO5() {
                return sndrrcvrinfo5;
            }

            /**
             * Sets the value of the sndrrcvrinfo5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRRCVRINFO5(String value) {
                this.sndrrcvrinfo5 = value;
            }

            /**
             * Gets the value of the sndrrcvrinfo6 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRRCVRINFO6() {
                return sndrrcvrinfo6;
            }

            /**
             * Sets the value of the sndrrcvrinfo6 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRRCVRINFO6(String value) {
                this.sndrrcvrinfo6 = value;
            }

            /**
             * Gets the value of the declartion property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDECLARTION() {
                return declartion;
            }

            /**
             * Sets the value of the declartion property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDECLARTION(BigDecimal value) {
                this.declartion = value;
            }

            /**
             * Gets the value of the repres1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREPRES1() {
                return repres1;
            }

            /**
             * Sets the value of the repres1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREPRES1(String value) {
                this.repres1 = value;
            }

            /**
             * Gets the value of the repres2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREPRES2() {
                return repres2;
            }

            /**
             * Sets the value of the repres2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREPRES2(String value) {
                this.repres2 = value;
            }

            /**
             * Gets the value of the repres3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREPRES3() {
                return repres3;
            }

            /**
             * Sets the value of the repres3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREPRES3(String value) {
                this.repres3 = value;
            }

            /**
             * Gets the value of the repres4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREPRES4() {
                return repres4;
            }

            /**
             * Sets the value of the repres4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREPRES4(String value) {
                this.repres4 = value;
            }

            /**
             * Gets the value of the rcvracc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRCVRACC() {
                return rcvracc;
            }

            /**
             * Sets the value of the rcvracc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRCVRACC(String value) {
                this.rcvracc = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="INSTRCD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INSTRCD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INSTRCD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INSTRCD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ITIMEIND1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ITIMEIND2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ITIMEIND3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INSTRCD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BANKOPERCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INSTRCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TRNSTYPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REGREP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REGREP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REGREP3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ENVCONT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ENVCONT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ENVCONT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ENVCONT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ENVCONT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "instrcd1",
            "instrcd2",
            "instrcd3",
            "instrcd4",
            "itimeind1",
            "itimeind2",
            "itimeind3",
            "instrcd5",
            "bankopercd",
            "instrcd",
            "trnstypcd",
            "regrep1",
            "regrep2",
            "regrep3",
            "envcont1",
            "envcont2",
            "envcont3",
            "envcont4",
            "envcont5"
        })
        public static class SettlementDetail {

            @XmlElement(name = "INSTRCD1")
            protected String instrcd1;
            @XmlElement(name = "INSTRCD2")
            protected String instrcd2;
            @XmlElement(name = "INSTRCD3")
            protected String instrcd3;
            @XmlElement(name = "INSTRCD4")
            protected String instrcd4;
            @XmlElement(name = "ITIMEIND1")
            protected String itimeind1;
            @XmlElement(name = "ITIMEIND2")
            protected String itimeind2;
            @XmlElement(name = "ITIMEIND3")
            protected String itimeind3;
            @XmlElement(name = "INSTRCD5")
            protected String instrcd5;
            @XmlElement(name = "BANKOPERCD")
            protected String bankopercd;
            @XmlElement(name = "INSTRCD")
            protected String instrcd;
            @XmlElement(name = "TRNSTYPCD")
            protected String trnstypcd;
            @XmlElement(name = "REGREP1")
            protected String regrep1;
            @XmlElement(name = "REGREP2")
            protected String regrep2;
            @XmlElement(name = "REGREP3")
            protected String regrep3;
            @XmlElement(name = "ENVCONT1")
            protected String envcont1;
            @XmlElement(name = "ENVCONT2")
            protected String envcont2;
            @XmlElement(name = "ENVCONT3")
            protected String envcont3;
            @XmlElement(name = "ENVCONT4")
            protected String envcont4;
            @XmlElement(name = "ENVCONT5")
            protected String envcont5;

            /**
             * Gets the value of the instrcd1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINSTRCD1() {
                return instrcd1;
            }

            /**
             * Sets the value of the instrcd1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINSTRCD1(String value) {
                this.instrcd1 = value;
            }

            /**
             * Gets the value of the instrcd2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINSTRCD2() {
                return instrcd2;
            }

            /**
             * Sets the value of the instrcd2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINSTRCD2(String value) {
                this.instrcd2 = value;
            }

            /**
             * Gets the value of the instrcd3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINSTRCD3() {
                return instrcd3;
            }

            /**
             * Sets the value of the instrcd3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINSTRCD3(String value) {
                this.instrcd3 = value;
            }

            /**
             * Gets the value of the instrcd4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINSTRCD4() {
                return instrcd4;
            }

            /**
             * Sets the value of the instrcd4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINSTRCD4(String value) {
                this.instrcd4 = value;
            }

            /**
             * Gets the value of the itimeind1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getITIMEIND1() {
                return itimeind1;
            }

            /**
             * Sets the value of the itimeind1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setITIMEIND1(String value) {
                this.itimeind1 = value;
            }

            /**
             * Gets the value of the itimeind2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getITIMEIND2() {
                return itimeind2;
            }

            /**
             * Sets the value of the itimeind2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setITIMEIND2(String value) {
                this.itimeind2 = value;
            }

            /**
             * Gets the value of the itimeind3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getITIMEIND3() {
                return itimeind3;
            }

            /**
             * Sets the value of the itimeind3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setITIMEIND3(String value) {
                this.itimeind3 = value;
            }

            /**
             * Gets the value of the instrcd5 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINSTRCD5() {
                return instrcd5;
            }

            /**
             * Sets the value of the instrcd5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINSTRCD5(String value) {
                this.instrcd5 = value;
            }

            /**
             * Gets the value of the bankopercd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBANKOPERCD() {
                return bankopercd;
            }

            /**
             * Sets the value of the bankopercd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBANKOPERCD(String value) {
                this.bankopercd = value;
            }

            /**
             * Gets the value of the instrcd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINSTRCD() {
                return instrcd;
            }

            /**
             * Sets the value of the instrcd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setINSTRCD(String value) {
                this.instrcd = value;
            }

            /**
             * Gets the value of the trnstypcd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTRNSTYPCD() {
                return trnstypcd;
            }

            /**
             * Sets the value of the trnstypcd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTRNSTYPCD(String value) {
                this.trnstypcd = value;
            }

            /**
             * Gets the value of the regrep1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREGREP1() {
                return regrep1;
            }

            /**
             * Sets the value of the regrep1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREGREP1(String value) {
                this.regrep1 = value;
            }

            /**
             * Gets the value of the regrep2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREGREP2() {
                return regrep2;
            }

            /**
             * Sets the value of the regrep2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREGREP2(String value) {
                this.regrep2 = value;
            }

            /**
             * Gets the value of the regrep3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREGREP3() {
                return regrep3;
            }

            /**
             * Sets the value of the regrep3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREGREP3(String value) {
                this.regrep3 = value;
            }

            /**
             * Gets the value of the envcont1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getENVCONT1() {
                return envcont1;
            }

            /**
             * Sets the value of the envcont1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setENVCONT1(String value) {
                this.envcont1 = value;
            }

            /**
             * Gets the value of the envcont2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getENVCONT2() {
                return envcont2;
            }

            /**
             * Sets the value of the envcont2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setENVCONT2(String value) {
                this.envcont2 = value;
            }

            /**
             * Gets the value of the envcont3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getENVCONT3() {
                return envcont3;
            }

            /**
             * Sets the value of the envcont3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setENVCONT3(String value) {
                this.envcont3 = value;
            }

            /**
             * Gets the value of the envcont4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getENVCONT4() {
                return envcont4;
            }

            /**
             * Sets the value of the envcont4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setENVCONT4(String value) {
                this.envcont4 = value;
            }

            /**
             * Gets the value of the envcont5 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getENVCONT5() {
                return envcont5;
            }

            /**
             * Sets the value of the envcont5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setENVCONT5(String value) {
                this.envcont5 = value;
            }

        }

    }

}

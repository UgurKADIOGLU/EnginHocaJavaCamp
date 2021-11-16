package tr.gov.nvi.tckimlik.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.1 2015-09-08T16:04:37.326+03:00 Generated source version: 3.1.1
 * 
 */
@WebService(targetNamespace = "http://tckimlik.nvi.gov.tr/WS", name = "KPSPublicSoap")
@XmlSeeAlso({ ObjectFactory.class })
public interface KPSPublicSoap {

    @WebMethod(operationName = "TCKimlikNoDogrula", action = "http://tckimlik.nvi.gov.tr/WS/TCKimlikNoDogrula")
    @RequestWrapper(localName = "TCKimlikNoDogrula", targetNamespace = "http://tckimlik.nvi.gov.tr/WS", className = "tr.gov.nvi.tckimlik.ws.TCKimlikNoDogrula")
    @ResponseWrapper(localName = "TCKimlikNoDogrulaResponse", targetNamespace = "http://tckimlik.nvi.gov.tr/WS", className = "tr.gov.nvi.tckimlik.ws.TCKimlikNoDogrulaResponse")
    @WebResult(name = "TCKimlikNoDogrulaResult", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
    public boolean tcKimlikNoDogrula(@WebParam(name = "TCKimlikNo", targetNamespace = "http://tckimlik.nvi.gov.tr/WS") long tcKimlikNo,
            @WebParam(name = "Ad", targetNamespace = "http://tckimlik.nvi.gov.tr/WS") java.lang.String ad,
            @WebParam(name = "Soyad", targetNamespace = "http://tckimlik.nvi.gov.tr/WS") java.lang.String soyad,
            @WebParam(name = "DogumYili", targetNamespace = "http://tckimlik.nvi.gov.tr/WS") int dogumYili);
}

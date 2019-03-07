
package br.com.epica.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EpicaWebServiceInterface", targetNamespace = "http://WS.epica.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EpicaWebServiceInterface {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validaUsuario", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.ValidaUsuario")
    @ResponseWrapper(localName = "validaUsuarioResponse", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.ValidaUsuarioResponse")
    @Action(input = "http://WS.epica.com.br/EpicaWebServiceInterface/validaUsuarioRequest", output = "http://WS.epica.com.br/EpicaWebServiceInterface/validaUsuarioResponse")
    public List<String> validaUsuario(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<br.com.epica.ws.InumadoModel>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retornaListaGaveta", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaListaGaveta")
    @ResponseWrapper(localName = "retornaListaGavetaResponse", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaListaGavetaResponse")
    @Action(input = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaListaGavetaRequest", output = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaListaGavetaResponse")
    public List<InumadoModel> retornaListaGaveta(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retornaStatusPagtoWeb", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaStatusPagtoWeb")
    @ResponseWrapper(localName = "retornaStatusPagtoWebResponse", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaStatusPagtoWebResponse")
    @Action(input = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaStatusPagtoWebRequest", output = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaStatusPagtoWebResponse")
    public String retornaStatusPagtoWeb(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retornaParam", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaParam")
    @ResponseWrapper(localName = "retornaParamResponse", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaParamResponse")
    @Action(input = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaParamRequest", output = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaParamResponse")
    public String retornaParam(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retornaBoleto", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaBoleto")
    @ResponseWrapper(localName = "retornaBoletoResponse", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaBoletoResponse")
    @Action(input = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaBoletoRequest", output = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaBoletoResponse")
    public List<String> retornaBoleto(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.HelloResponse")
    @Action(input = "http://WS.epica.com.br/EpicaWebServiceInterface/helloRequest", output = "http://WS.epica.com.br/EpicaWebServiceInterface/helloResponse")
    public String hello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retornaCliente", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaCliente")
    @ResponseWrapper(localName = "retornaClienteResponse", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaClienteResponse")
    @Action(input = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaClienteRequest", output = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaClienteResponse")
    public List<String> retornaCliente(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<br.com.epica.ws.DebAcordoModel>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retornaDebAcordo", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaDebAcordo")
    @ResponseWrapper(localName = "retornaDebAcordoResponse", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaDebAcordoResponse")
    @Action(input = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaDebAcordoRequest", output = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaDebAcordoResponse")
    public List<DebAcordoModel> retornaDebAcordo(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<br.com.epica.ws.DebitoModel>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retornaDebito", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaDebito")
    @ResponseWrapper(localName = "retornaDebitoResponse", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaDebitoResponse")
    @Action(input = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaDebitoRequest", output = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaDebitoResponse")
    public List<DebitoModel> retornaDebito(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "gravaLogSMS", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.GravaLogSMS")
    @ResponseWrapper(localName = "gravaLogSMSResponse", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.GravaLogSMSResponse")
    @Action(input = "http://WS.epica.com.br/EpicaWebServiceInterface/gravaLogSMSRequest", output = "http://WS.epica.com.br/EpicaWebServiceInterface/gravaLogSMSResponse")
    public String gravaLogSMS(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<br.com.epica.ws.EnviaSMSModel>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retornaSMS", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaSMS")
    @ResponseWrapper(localName = "retornaSMSResponse", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaSMSResponse")
    @Action(input = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaSMSRequest", output = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaSMSResponse")
    public List<EnviaSMSModel> retornaSMS(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retornaGaveta", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaGaveta")
    @ResponseWrapper(localName = "retornaGavetaResponse", targetNamespace = "http://WS.epica.com.br/", className = "br.com.epica.ws.RetornaGavetaResponse")
    @Action(input = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaGavetaRequest", output = "http://WS.epica.com.br/EpicaWebServiceInterface/retornaGavetaResponse")
    public List<String> retornaGaveta(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
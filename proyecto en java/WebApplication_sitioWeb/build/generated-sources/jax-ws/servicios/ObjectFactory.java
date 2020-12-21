
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicios package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Autentificar_QNAME = new QName("http://servicios/", "Autentificar");
    private final static QName _AutentificarResponse_QNAME = new QName("http://servicios/", "AutentificarResponse");
    private final static QName _DatoMedico_QNAME = new QName("http://servicios/", "DatoMedico");
    private final static QName _DatoMedicoResponse_QNAME = new QName("http://servicios/", "DatoMedicoResponse");
    private final static QName _GetNombrePaciente_QNAME = new QName("http://servicios/", "GetNombrePaciente");
    private final static QName _GetNombrePacienteResponse_QNAME = new QName("http://servicios/", "GetNombrePacienteResponse");
    private final static QName _InsertarPaciente_QNAME = new QName("http://servicios/", "InsertarPaciente");
    private final static QName _InsertarPacienteResponse_QNAME = new QName("http://servicios/", "InsertarPacienteResponse");
    private final static QName _InsertarReserva_QNAME = new QName("http://servicios/", "InsertarReserva");
    private final static QName _InsertarReservaResponse_QNAME = new QName("http://servicios/", "InsertarReservaResponse");
    private final static QName _InsertarUsuario_QNAME = new QName("http://servicios/", "InsertarUsuario");
    private final static QName _InsertarUsuarioResponse_QNAME = new QName("http://servicios/", "InsertarUsuarioResponse");
    private final static QName _Hello_QNAME = new QName("http://servicios/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://servicios/", "helloResponse");
    private final static QName _ListaHorarios_QNAME = new QName("http://servicios/", "listaHorarios");
    private final static QName _ListaHorariosResponse_QNAME = new QName("http://servicios/", "listaHorariosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Autentificar }
     * 
     */
    public Autentificar createAutentificar() {
        return new Autentificar();
    }

    /**
     * Create an instance of {@link AutentificarResponse }
     * 
     */
    public AutentificarResponse createAutentificarResponse() {
        return new AutentificarResponse();
    }

    /**
     * Create an instance of {@link DatoMedico }
     * 
     */
    public DatoMedico createDatoMedico() {
        return new DatoMedico();
    }

    /**
     * Create an instance of {@link DatoMedicoResponse }
     * 
     */
    public DatoMedicoResponse createDatoMedicoResponse() {
        return new DatoMedicoResponse();
    }

    /**
     * Create an instance of {@link GetNombrePaciente }
     * 
     */
    public GetNombrePaciente createGetNombrePaciente() {
        return new GetNombrePaciente();
    }

    /**
     * Create an instance of {@link GetNombrePacienteResponse }
     * 
     */
    public GetNombrePacienteResponse createGetNombrePacienteResponse() {
        return new GetNombrePacienteResponse();
    }

    /**
     * Create an instance of {@link InsertarPaciente }
     * 
     */
    public InsertarPaciente createInsertarPaciente() {
        return new InsertarPaciente();
    }

    /**
     * Create an instance of {@link InsertarPacienteResponse }
     * 
     */
    public InsertarPacienteResponse createInsertarPacienteResponse() {
        return new InsertarPacienteResponse();
    }

    /**
     * Create an instance of {@link InsertarReserva }
     * 
     */
    public InsertarReserva createInsertarReserva() {
        return new InsertarReserva();
    }

    /**
     * Create an instance of {@link InsertarReservaResponse }
     * 
     */
    public InsertarReservaResponse createInsertarReservaResponse() {
        return new InsertarReservaResponse();
    }

    /**
     * Create an instance of {@link InsertarUsuario }
     * 
     */
    public InsertarUsuario createInsertarUsuario() {
        return new InsertarUsuario();
    }

    /**
     * Create an instance of {@link InsertarUsuarioResponse }
     * 
     */
    public InsertarUsuarioResponse createInsertarUsuarioResponse() {
        return new InsertarUsuarioResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link ListaHorarios }
     * 
     */
    public ListaHorarios createListaHorarios() {
        return new ListaHorarios();
    }

    /**
     * Create an instance of {@link ListaHorariosResponse }
     * 
     */
    public ListaHorariosResponse createListaHorariosResponse() {
        return new ListaHorariosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Autentificar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "Autentificar")
    public JAXBElement<Autentificar> createAutentificar(Autentificar value) {
        return new JAXBElement<Autentificar>(_Autentificar_QNAME, Autentificar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutentificarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "AutentificarResponse")
    public JAXBElement<AutentificarResponse> createAutentificarResponse(AutentificarResponse value) {
        return new JAXBElement<AutentificarResponse>(_AutentificarResponse_QNAME, AutentificarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatoMedico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "DatoMedico")
    public JAXBElement<DatoMedico> createDatoMedico(DatoMedico value) {
        return new JAXBElement<DatoMedico>(_DatoMedico_QNAME, DatoMedico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatoMedicoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "DatoMedicoResponse")
    public JAXBElement<DatoMedicoResponse> createDatoMedicoResponse(DatoMedicoResponse value) {
        return new JAXBElement<DatoMedicoResponse>(_DatoMedicoResponse_QNAME, DatoMedicoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNombrePaciente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "GetNombrePaciente")
    public JAXBElement<GetNombrePaciente> createGetNombrePaciente(GetNombrePaciente value) {
        return new JAXBElement<GetNombrePaciente>(_GetNombrePaciente_QNAME, GetNombrePaciente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNombrePacienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "GetNombrePacienteResponse")
    public JAXBElement<GetNombrePacienteResponse> createGetNombrePacienteResponse(GetNombrePacienteResponse value) {
        return new JAXBElement<GetNombrePacienteResponse>(_GetNombrePacienteResponse_QNAME, GetNombrePacienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarPaciente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "InsertarPaciente")
    public JAXBElement<InsertarPaciente> createInsertarPaciente(InsertarPaciente value) {
        return new JAXBElement<InsertarPaciente>(_InsertarPaciente_QNAME, InsertarPaciente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarPacienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "InsertarPacienteResponse")
    public JAXBElement<InsertarPacienteResponse> createInsertarPacienteResponse(InsertarPacienteResponse value) {
        return new JAXBElement<InsertarPacienteResponse>(_InsertarPacienteResponse_QNAME, InsertarPacienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "InsertarReserva")
    public JAXBElement<InsertarReserva> createInsertarReserva(InsertarReserva value) {
        return new JAXBElement<InsertarReserva>(_InsertarReserva_QNAME, InsertarReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "InsertarReservaResponse")
    public JAXBElement<InsertarReservaResponse> createInsertarReservaResponse(InsertarReservaResponse value) {
        return new JAXBElement<InsertarReservaResponse>(_InsertarReservaResponse_QNAME, InsertarReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "InsertarUsuario")
    public JAXBElement<InsertarUsuario> createInsertarUsuario(InsertarUsuario value) {
        return new JAXBElement<InsertarUsuario>(_InsertarUsuario_QNAME, InsertarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "InsertarUsuarioResponse")
    public JAXBElement<InsertarUsuarioResponse> createInsertarUsuarioResponse(InsertarUsuarioResponse value) {
        return new JAXBElement<InsertarUsuarioResponse>(_InsertarUsuarioResponse_QNAME, InsertarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaHorarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "listaHorarios")
    public JAXBElement<ListaHorarios> createListaHorarios(ListaHorarios value) {
        return new JAXBElement<ListaHorarios>(_ListaHorarios_QNAME, ListaHorarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaHorariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "listaHorariosResponse")
    public JAXBElement<ListaHorariosResponse> createListaHorariosResponse(ListaHorariosResponse value) {
        return new JAXBElement<ListaHorariosResponse>(_ListaHorariosResponse_QNAME, ListaHorariosResponse.class, null, value);
    }

}

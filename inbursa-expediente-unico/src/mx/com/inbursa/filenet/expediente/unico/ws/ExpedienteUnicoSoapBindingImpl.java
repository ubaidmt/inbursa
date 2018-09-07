package mx.com.inbursa.filenet.expediente.unico.ws;

import java.util.List;
import java.util.Arrays;

@javax.jws.WebService (endpointInterface="mx.com.inbursa.filenet.expediente.unico.ws.ExpedienteUnico", targetNamespace="http://ws.unico.expediente.filenet.inbursa.com.mx/", serviceName="ExpedienteUnico", portName="ExpedienteUnicoImplPort")
public class ExpedienteUnicoSoapBindingImpl{

    public ResponseReplicaExpedienteVo replicarExpediente(ReplicarExpedienteRequestVo replicarExpedienteVo, DatosOrigenVo datosOrigen) {
        // TODO Auto-generated method stub
        return null;
    }

    public ResponseDocumentoEliminadoVo eliminarDocumentosPorId(List<String> idsDocumento, DatosOrigenVo datosOrigen) {
        // TODO Auto-generated method stub
        return null;
    }

    public ResponseTiposDocumentosByTramiteVO getTiposDocumentosByTramite(String claveTramite) {
    	ResponseTiposDocumentosByTramiteVO response = new ResponseTiposDocumentosByTramiteVO();
    	
    	response.setError(false);
    	response.setErrorDescripcion("Descripcion de error para los documentos del tramite " + claveTramite);
    	
    	// documentos asociados al tramite
    	List<String> clavesTipoDcumento = Arrays.asList(new String[] {"1019", "1334", "1364", "1365", "1375", "223", "323", "39", "41", "501", "554", "555", "558", "559", "560", "561", "562", "676", "776", "837", "875", "91", "966", "98", "01"});
    	List<String> descripcionesTipoDcumento = Arrays.asList(new String[] {"COMPLEMENTO EXPEDIENTES", "IDENTIFICACIÓN OFICIAL REVERSO", "REGISTRO PUBLICO DE LA PROPIEDAD Y EL COMERCIO", "PODERES NOTARIALES", "ACTAS SUBSECUENTES", "PROMOCIONES", "COMPROBANTE DE TRAMITE TYS", "RFC", "IDENTIFICACION OFICIAL", "COMPROBANTE DE DOMICILIO", "ACTA CONSTITUTIVA", "CONTRATO GLOBAL", "CUADRO INFORMATIVO", "IFE TITULAR", "PASAPORTE TITULAR", "CEDULA PROFESIONAL TITULAR", "IFE TERCERO AUTORIZADO", "PASAPORTE TERCERO AUTORIZADO", "DICTAMEN JURIDICO", "CONSTANCIA DE SITUACION FISCAL VIGENTE", "EXPEDIENTE COMPLETO", "TARJETON DE FIRMAS", "FORMULARIO FATCA-CRS", "OTROS", "HISTORICO COLD"});

    	int index = 0;
    	for (String claveTipoDocumento : clavesTipoDcumento) {
        	TiposDocumentosVO tipoDoc = new TiposDocumentosVO();
    		tipoDoc.claveTipoDocumento = claveTipoDocumento;
    		tipoDoc.descripcionTipoDocumento = descripcionesTipoDcumento.get(index);
    		response.getListaTiposDocumentos().add(tipoDoc);
    		index++;
    	}
    	
        return response;
    }

    public ResponseExpedienteUnico getExpedientePorIdPersona(List<String> idspersona, DatosOrigenVo datosOrigen) {
        // TODO Auto-generated method stub
        return null;
    }

    public ResponseDocumentosFolder getDocumentosFolder(String idFolder, DatosOrigenVo datosOrigen) {
        // TODO Auto-generated method stub
        return null;
    }

}
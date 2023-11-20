package mijael.soa.impl;

import org.apache.cxf.annotations.SchemaValidation;
import org.springframework.stereotype.Service;
import pe.mijael.reservaservice.schema.ReservaRequest;
import pe.mijael.reservaservice.schema.ReservaResponse;
import pe.mijael.reservaservice.wsdl.ReservaServicePort;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.time.LocalDate;

@Service
@SchemaValidation(type = SchemaValidation.SchemaValidationType.REQUEST)
public class ReservaServiceImpl implements ReservaServicePort {
    @Override
    public ReservaResponse reserva(ReservaRequest parameters) {
        ReservaResponse response = new ReservaResponse();
        response.setIdReserva(1);
        response.setIdUsuario(1);
        response.setIdVehiculo(1);
        try {
            response.setFechaInicio(DatatypeFactory.newInstance().newXMLGregorianCalendar(String.valueOf(LocalDate.now())));
            response.setFechaFin(DatatypeFactory.newInstance().newXMLGregorianCalendar(String.valueOf(LocalDate.now())));
        } catch (Exception e) {
            throw new RuntimeException();
        }

        return response;
    }
}

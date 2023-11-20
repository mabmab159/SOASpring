package mijael.soa.impl;

import org.apache.cxf.annotations.SchemaValidation;
import org.springframework.stereotype.Service;
import pe.mijael.autosservice.schema.AutosRequest;
import pe.mijael.autosservice.schema.AutosResponse;
import pe.mijael.autosservice.wsdl.AutosServicePort;

import java.util.ArrayList;

@Service
@SchemaValidation(type = SchemaValidation.SchemaValidationType.REQUEST)
public class AutosServiceImpl implements AutosServicePort {
    @Override
    public AutosResponse autos(AutosRequest parameters) {
        AutosResponse response = new AutosResponse();
        response.setAutos(new ArrayList<>());
        return response;
    }
}

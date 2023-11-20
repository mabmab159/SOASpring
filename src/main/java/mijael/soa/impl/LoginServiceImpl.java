package mijael.soa.impl;

import org.apache.cxf.annotations.SchemaValidation;
import org.springframework.stereotype.Service;
import pe.mijael.loginservice.schema.LoginRequest;
import pe.mijael.loginservice.schema.LoginResponse;
import pe.mijael.loginservice.wsdl.LoginServicePort;

@Service
@SchemaValidation(type = SchemaValidation.SchemaValidationType.REQUEST)
public class LoginServiceImpl implements LoginServicePort {
    @Override
    public LoginResponse login(LoginRequest parameters) {
        LoginResponse response = new LoginResponse();
        response.setId(1);
        response.setNombres("Miguel Angel");
        response.setApellidos("Berrio Huamani");
        response.setUsuario("miguel");
        response.setPassword("miguel");
        response.setEmail("miguelberrioh@gmail.com");
        return response;
    }
}

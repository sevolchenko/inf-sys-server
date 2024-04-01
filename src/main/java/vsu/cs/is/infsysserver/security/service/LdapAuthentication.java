package vsu.cs.is.infsysserver.security.service;

import org.springframework.stereotype.Service;
import vsu.cs.is.infsysserver.security.entity.dto.request.AuthenticationRequest;

@Service
public class LdapAuthentication {

    public boolean isConnectionSuccess(AuthenticationRequest authenticationRequest){
        return true;
    }
}

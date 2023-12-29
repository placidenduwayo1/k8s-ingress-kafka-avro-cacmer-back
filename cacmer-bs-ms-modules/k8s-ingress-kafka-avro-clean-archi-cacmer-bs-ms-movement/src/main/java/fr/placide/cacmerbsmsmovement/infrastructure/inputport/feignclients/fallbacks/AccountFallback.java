package fr.placide.cacmerbsmsmovement.infrastructure.inputport.feignclients.fallbacks;

import fr.placide.cacmerbsmsmovement.infrastructure.inputport.feignclients.models.AccountModel;
import fr.placide.cacmerbsmsmovement.infrastructure.inputport.feignclients.proxies.AccountServiceProxy;
import org.springframework.stereotype.Service;

@Service
public class AccountFallback implements AccountServiceProxy {
    @Override
    public AccountModel getRemoteAccountById(String id) {
        return null;
    }
}

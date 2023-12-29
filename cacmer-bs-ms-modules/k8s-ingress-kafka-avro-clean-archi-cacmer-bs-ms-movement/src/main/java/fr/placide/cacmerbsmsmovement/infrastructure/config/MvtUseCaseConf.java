package fr.placide.cacmerbsmsmovement.infrastructure.config;

import fr.placide.cacmerbsmsmovement.domain.outputport.MovementOutputService;
import fr.placide.cacmerbsmsmovement.domain.outputport.MovementProducerService;
import fr.placide.cacmerbsmsmovement.domain.outputport.RemoteAccountService;
import fr.placide.cacmerbsmsmovement.domain.outputport.RemoteCustomerService;
import fr.placide.cacmerbsmsmovement.domain.usecase.MovementInputServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MvtUseCaseConf {
    @Bean
    public MovementInputServiceImpl config(RemoteAccountService remoteAccount, RemoteCustomerService remoteCustomer,
                                    MovementProducerService produceService, MovementOutputService outputService
    ){
        return new MovementInputServiceImpl(remoteAccount,remoteCustomer,produceService,outputService);
    }
}
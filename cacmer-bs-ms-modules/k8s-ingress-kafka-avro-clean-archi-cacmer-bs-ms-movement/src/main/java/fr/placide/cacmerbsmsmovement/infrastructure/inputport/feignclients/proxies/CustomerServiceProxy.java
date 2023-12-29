package fr.placide.cacmerbsmsmovement.infrastructure.inputport.feignclients.proxies;

import fr.placide.cacmerbsmsmovement.infrastructure.inputport.feignclients.fallbacks.CustomerFallback;
import fr.placide.cacmerbsmsmovement.infrastructure.inputport.feignclients.models.CustomerModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "k8s-ingress-kafka-avro-cacmer-bs-ms-customer",url = "http://k8s-ingress-kafka-avro-cacmer-bs-ms-customer:8882",
path = "/bs-ms-customer",fallback = CustomerFallback.class)
@Qualifier(value = "customerserviceproxy")
public interface CustomerServiceProxy {
    @GetMapping(value = "/customers/id/{id}")
    CustomerModel getRemoteCustomer(@PathVariable(name = "id") String id);
}

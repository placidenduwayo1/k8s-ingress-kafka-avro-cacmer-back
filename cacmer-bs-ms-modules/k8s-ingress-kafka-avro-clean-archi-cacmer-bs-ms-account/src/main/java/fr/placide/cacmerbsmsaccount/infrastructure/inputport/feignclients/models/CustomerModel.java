package fr.placide.cacmerbsmsaccount.infrastructure.inputport.feignclients.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder @Getter @Setter
public class CustomerModel {
    private String customerId;
    private String firstname;
    private String lastname;
    private String createdAt;
    private String risk;
    private String status;
}

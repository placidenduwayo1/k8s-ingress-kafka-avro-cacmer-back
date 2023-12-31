package fr.placide.cacmerriskevaluator.domain.usecase;

import fr.placide.cacmerriskevaluator.domain.beans.Account;
import fr.placide.cacmerriskevaluator.domain.beans.Customer;
import fr.placide.cacmerriskevaluator.domain.exceptions.RemoteAccountApiUnreachableException;
import fr.placide.cacmerriskevaluator.domain.exceptions.RemoteCustomerApiUnreachableException;
import fr.placide.cacmerriskevaluator.domain.inputport.InputPortRiskEvaluator;
import fr.placide.cacmerriskevaluator.domain.outputport.RemoteObjectsGetter;
public class InputPortRiskEvaluatorImpl implements InputPortRiskEvaluator {
    private final RemoteObjectsGetter remoteObjectsGetter;

    public InputPortRiskEvaluatorImpl(RemoteObjectsGetter remoteObjectsGetter) {
        this.remoteObjectsGetter = remoteObjectsGetter;
    }

    @Override
    public double evaluate(String accountId, String movementSens, double movementAmount) throws RemoteAccountApiUnreachableException,
            RemoteCustomerApiUnreachableException {
        Account account = remoteObjectsGetter.getRemoteAccountById(accountId);
        if (account == null) {
            throw new RemoteAccountApiUnreachableException();
        }
        Customer customer = remoteObjectsGetter.getRemoteCustomerById(account.getCustomerId());
        if (customer == null) {
            throw new RemoteCustomerApiUnreachableException();
        }
        double balance = account.getBalance();
        if (movementSens.equals("sell")) {
            balance += movementAmount;
        } else if (movementSens.equals("buy") && account.getBalance() >= movementAmount) {
            balance -= movementAmount;
        }
        return balance;
    }
}
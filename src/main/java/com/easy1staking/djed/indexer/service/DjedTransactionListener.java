package com.easy1staking.djed.indexer.service;

import com.bloxbean.cardano.yaci.store.events.TransactionEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class DjedTransactionListener {

    private final ObjectMapper objectMapper = new ObjectMapper();


    @EventListener
    public void processEvent(TransactionEvent transactionEvent) {

        transactionEvent.getTransactions()
                .stream()
                .filter(transaction -> transaction.getBody()
                        .getOutputs()
                        .stream()
                        .anyMatch(transactionOutput -> "addr1wypp5vhw2csaf62d78vmaa4652z20nr4hfgmkhacqnrvgug2vdyq4".equals(transactionOutput.getAddress())))
                .forEach(transaction -> {
                    try {
                        log.info("TX: {}", objectMapper.writeValueAsString(transaction.getBody()));
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                });


    }


}

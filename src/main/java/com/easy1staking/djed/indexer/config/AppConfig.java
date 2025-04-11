package com.easy1staking.djed.indexer.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import org.cardanofoundation.conversions.CardanoConverters;
import org.cardanofoundation.conversions.ClasspathConversionsFactory;
import org.cardanofoundation.conversions.domain.NetworkType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {

    @Bean
    public CardanoConverters cardanoConverters() {
        return ClasspathConversionsFactory.createConverters(NetworkType.MAINNET);
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

}

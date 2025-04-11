package com.easy1staking.djed.indexer;

import com.bloxbean.cardano.yaci.core.config.YaciConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.easy1staking.djed.indexer")
public class DjedIndexerApp {

    public static void main(String[] args) {
        YaciConfig.INSTANCE.setReturnBlockCbor(true);
        YaciConfig.INSTANCE.setReturnTxBodyCbor(true);
        SpringApplication.run(DjedIndexerApp.class, args);
    }


}

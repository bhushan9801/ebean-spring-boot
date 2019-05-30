package com.helios.ebean

import io.ebean.EbeanServer
import io.ebean.EbeanServerFactory
import io.ebean.config.ServerConfig
import io.ebean.spring.txn.SpringJdbcTransactionManager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class EbeanConfig {

    @Bean
    fun ebeanServer(dataSource: DataSource): EbeanServer {
        var config = ServerConfig()
        config.dataSource = dataSource
        config.name = "ebean-server"
        config.externalTransactionManager = SpringJdbcTransactionManager()
        config.dbSchema = "application"
        return EbeanServerFactory.create(config)
    }
}

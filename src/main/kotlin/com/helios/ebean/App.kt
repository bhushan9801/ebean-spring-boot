/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.helios.ebean

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
//@EnableConfigurationProperties(BlogProperties::class)
class EbeanApp

fun main(args: Array<String>) {
    runApplication<EbeanApp>(*args)
}

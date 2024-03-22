package micronaut.example.configuration

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("app")
interface AppConfiguration {
    String getMoviesIndexName()
}

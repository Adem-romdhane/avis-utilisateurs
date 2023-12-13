package tech.chillo.avis.securite;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.http.HttpMethod.POST;


@Configuration
@EnableWebSecurity
public class ConfigurationSecuriteApplication {

    //chaine de securite qu'on retourne
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(
                        authorize ->
                                authorize.requestMatchers( POST,  "/api/inscription").permitAll() // si on fait un post inscription on laisse passer sinon pr ttes autres requêtes on bloque
                                        .anyRequest().authenticated()
                ).build();
    }
}

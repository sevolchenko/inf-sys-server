package vsu.cs.is.infsysserver.security.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import vsu.cs.is.infsysserver.security.entity.temp.Permission;

import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;
import static vsu.cs.is.infsysserver.security.entity.temp.Permission.ADMIN_READ;
import static vsu.cs.is.infsysserver.security.entity.temp.Permission.USER_READ;
import static vsu.cs.is.infsysserver.security.entity.temp.Role.ADMIN;
import static vsu.cs.is.infsysserver.security.entity.temp.Role.USER;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    private final JwtFilter jwtAuthFilter;
    private final AuthenticationProvider authenticationProvider;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(req ->
                        req
                                .anyRequest()
                                .permitAll()
//                                .anyRequest().hasAnyAuthority(ADMIN_READ.getPermission()) //просто пример, как закрыть эндпоинт по пермиту
                )
                .sessionManagement(session -> session.sessionCreationPolicy(STATELESS))
                .authenticationProvider(authenticationProvider)
                .addFilterAt(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }


}

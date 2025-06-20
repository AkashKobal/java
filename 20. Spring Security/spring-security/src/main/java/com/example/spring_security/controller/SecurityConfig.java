package com.example.spring_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    private UserDetailsService userDetailsService;


    @Bean
    public AuthenticationProvider authProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
        return provider;
    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.csrf(customizer -> customizer.disable())
                .authorizeHttpRequests(request -> request.anyRequest().authenticated())
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        return http.build();
    }


    // this configuration class is used to configure security for the application
    // this will buypass the security for all the endpoints, without any authentication user can access the endpoints, so here we customize the security configuration according to our needs
    // here we use custom SecurityFilterChain bean to configure the security, instead of using the default security filter chain
    // we can also use the default security filter chain by using the @EnableWebSecurity annotation
    // this will allow us to customize the security configuration

    /*
    // we disable CSRF protection for all endpoints, and use custom authentication and authorization
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        // without lambda expression
        http.csrf(customizer -> customizer.disable())
                .authorizeHttpRequests(request -> request.anyRequest().authenticated())
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        // every time a user logs in, a new session is created, and the session id is saved in cookies
        // this is useful for REST APIs, where we don't want to maintain the session state on the server side
        // we disable CSRF protection, as it is not needed for REST APIs, and we use stateless session management

        return http.build();

*/
    // with lambda expression
    /*
     * Customizer<CsrfConfigurer<HttpSecurity>> custCsrf = new
     * Customizer<CsrfConfigurer<HttpSecurity>>() {
     *
     * @Override public void customize(CsrfConfigurer<HttpSecurity> configurer) {
     *
     * configurer.disable(); } };
     *
     * Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.
     * AuthorizationManagerRequestMatcherRegistry> custHttp = new
     * Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.
     * AuthorizationManagerRequestMatcherRegistry>() {
     *
     * @Override public void customize(
     * AuthorizeHttpRequestsConfigurer<HttpSecurity>.
     * AuthorizationManagerRequestMatcherRegistry registry) {
     * registry.anyRequest().authenticated();
     *
     * } };
     *
     * http.authorizeHttpRequests(custHttp); http.csrf(custCsrf);
     */

}

/*
    // use InMemoryUserDetailsManager to create a user details service
    // only for demonstration purposes, in real application we will use a database to store user details
   // Without database, we can use InMemoryUserDetailsManager to create a user details service
    @Bean
    public UserDetailsService userDetailsService(){
        // This method is used to create a user details service, which is used to load user details from the database
        // Here we can create a user with username and password, and assign roles to the user
        // This is just a sample, in real application we will load user details from the database

        // 1st user
        UserDetails user = User
                .withDefaultPasswordEncoder()
                .username("akash")
                .password("Akash@123")
                .roles("USER")
                .build();

        // 2nd user
        UserDetails admin = User
                .withDefaultPasswordEncoder()
                .username("admin")
                .password("admin@123")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }
*/
// Authentication Provider
// This is used to authenticate the user, and return the user details
// We can also use custom authentication provider, by implementing the AuthenticationProvider interface
// Here we are using the default authentication provider, which is the DaoAuthenticationProvider


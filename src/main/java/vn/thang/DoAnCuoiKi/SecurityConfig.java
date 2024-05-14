package vn.thang.DoAnCuoiKi;

import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import Service.CustomDangNhapDetailService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Autowired
	private CustomDangNhapDetailService dnService;
	
	@Bean
	PasswordEncoder mkEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/trangchu").permitAll() 
                .requestMatchers("/login").permitAll()
                .requestMatchers("/admin/**").hasAuthority("Quản trị viên")
                .requestMatchers("/user/**").hasAuthority("Nhân viên")
                .anyRequest().authenticated())
            .formLogin(login -> login
                .loginPage("/login")
                .loginProcessingUrl("/login")
                .usernameParameter("TenTaiKhoan")
                .passwordParameter("MatKhau")
                .defaultSuccessUrl("/trangchu", true)
                .successHandler(customAuthenticationSuccessHandler()));

        return http.build();
    }

    @Bean
    WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().requestMatchers("/static/**", "/assets/**");
    }

    @Bean
    AuthenticationSuccessHandler customAuthenticationSuccessHandler() {
        return new SimpleUrlAuthenticationSuccessHandler() {
            @Override
            public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                                Authentication authentication) throws IOException, ServletException {
                Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());

                if (roles.contains("Quản trị viên")) {
                    getRedirectStrategy().sendRedirect(request, response, "/admin");
                } else if (roles.contains("Nhân viên")) {
                    getRedirectStrategy().sendRedirect(request, response, "/user");
                } else {
                    super.onAuthenticationSuccess(request, response, authentication);
                }
            }
        };
    }
}

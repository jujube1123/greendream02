/*package com.kim.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

protected void LogoutSuccessHandler(HttpSecurity http) throws Exception {
	http.logout()
	.logoutUrl("/logout")
	.logoutSuccessUrl("/login")
	.deleteCookies("JSEEIONID", "remember-me")
	.addLogoutHandler(logoutHandler())
	.logoutSuccessHandler(logoutSuccessHandler())
}
*/
package com.mock_itsol.mockitsol.config;


import com.mock_itsol.mockitsol.entity.UserEntity;
import com.mock_itsol.mockitsol.service.iservice.UserService;
import io.jsonwebtoken.*;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Getter
public class JwtConfig {
    //Thoong tin JWT , tạo nên token
    private static final Logger logger = LoggerFactory.getLogger(JwtConfig.class);

    @Autowired
    UserService userService;

    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private int expiration;
    @Value("${jwt.header}")
    private String header;
    @Value("${jwt.prefix}")
    private String prefix;
    @Value("${jwt.auth-uri}")
    private String authUri;

    public JwtConfig() {}

    /**
     * Tạo và trả về jwt (token)
     * @param authentication
     * @return
     */

    public String generateToken(Authentication authentication){
        Date present = new Date();
        UserEntity userPrincipal = (UserEntity) authentication.getPrincipal();
        System.out.println(userPrincipal.toString());
        return Jwts.builder()
                .setSubject(userPrincipal.getUserName())
                .claim("admin_account", userPrincipal.getIs_Admin())
                .claim("userID",userPrincipal.getId())
                .claim("name",userPrincipal.getEmail())
                .setIssuedAt(present)
                .setExpiration(new Date(present.getTime() + expiration))
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    //kiểm tra tokken
    public boolean validationToken(String token){
        try {
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            return true;
        }catch (SignatureException e) {
            logger.error("Invalid JWT signature -> Message: {}", e.getMessage());
        } catch (MalformedJwtException e) {
            logger.error("Invalid JWT token -> Message: {}", e.getMessage());
        } catch (ExpiredJwtException e) {
            logger.error("Expired JWT token -> Message: {}", e.getMessage());
        } catch (UnsupportedJwtException e) {
            logger.error("Unsupported JWT token -> Message: {}", e.getMessage());
        } catch (IllegalArgumentException e) {
            logger.error("JWT claims string is empty -> Message: {}", e.getMessage());
        }
        return false;
    }

    /**
     * Trả về username trong jwt
     * @param token
     * @return
     */
    public String getUsernameFromJwtToken(String token) {
        return Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody().getSubject();
    }

    /**
     * Trả về thời gian hết hạn của jwt
     * @param token
     * @return
     */
    public Date getExpiryDate(String token){
        return Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody()
                .getExpiration();
    }
}

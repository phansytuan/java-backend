package com.tuancode.security;

import com.tuancode.utils.Constant;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// đánh dấu component để tạo bean
@Component
public class JwtService {

  @Value("${authen.jwt.secretkey}")
  private String secretKey;
  @Value("${authen.jwt.time.expire}")
  private String timeExpire; // 1 day

  /*
    method create token by
      + user infor
      + secret key
      + time expire

    userDetails in spring security: import org.springframework.security.core.userdetails.UserDetails;
      + have username
      + all role of spring security
  */
  public String generateToken(UserDetails userDetails) {
    /*
     have all user data:
       - username
       - roles
     */
    Map<String, Object> mapDataPayload = new HashMap<>();
    // get roles
    List<String> roles = userDetails.getAuthorities().stream().map(GrantedAuthority::getAuthority).toList();
  mapDataPayload.put(Constant.JWT.ROLES.name(), roles);
    mapDataPayload.put(Constant.JWT.USERNAME.name(), userDetails.getUsername());

    // create jwt
    return Jwts.builder()
        .setClaims(mapDataPayload) // load data to payload
        .setSubject(userDetails.getUsername())
        .setIssuedAt(new Date(System.currentTimeMillis())) // time create token
        .setExpiration(new Date(System.currentTimeMillis() + Long.valueOf(timeExpire))) // set time expire date == current time + timeExpire
        .signWith(SignatureAlgorithm.HS256, secretKey) // sign with secretKey and Algorithm HS256
        .compact();
  }

  public boolean validateToken(String token) {
    try {
      Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public String getUsername(String token) {
    return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody().getSubject();
  }

  public List<String> getRoles(String token) {
    Claims payload = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
    return payload.get(Constant.JWT.ROLES.name(),List.class);
  }
}

package com.hackaton.ws.request;

import com.hackaton.ws.response.SusApiResponse;
import org.apache.commons.codec.binary.Base64;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.nio.charset.Charset;

@Component
public class SusApiRequest implements Serializable {


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public String run() throws Exception {

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://elasticsearch-saps.saude.gov.br/desc-notificacoes-esusve-*/_search?pretty";
            ResponseEntity<String> susApiResponse =
                    restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<SusApiResponse>(createHeaders("user-public-notificacoes", "Za4qNXdyQNSa9YaA")), String.class);

            return  susApiResponse.toString();
    }

    HttpHeaders createHeaders(String username, String password){
        return new HttpHeaders() {{
            String auth = username + ":" + password;
            byte[] encodedAuth = Base64.encodeBase64(
                    auth.getBytes(Charset.forName("US-ASCII")) );
            String authHeader = "Basic " + new String( encodedAuth );
            set( "Authorization", authHeader );
        }};
    }
}

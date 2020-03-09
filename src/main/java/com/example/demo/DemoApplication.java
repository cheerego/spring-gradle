package com.example.demo;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.http.client.methods.HttpPost;


import java.io.File;
import java.io.IOException;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Controller
@Slf4j
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping(path = "/")
    @ResponseBody
    public CloseableHttpResponse index(@RequestParam(required = false) Integer user_id, @RequestParam(required = false) String key) throws IOException {
//        String a = "a";
//        String b = "";
//        log.error(StringUtils.isNumeric(a) + "");
//        log.error(StringUtils.isNumeric(b) + "");
//
//        log.error(StringUtils.isNumericSpace(a) + "");
//        log.error(StringUtils.isNumericSpace(b) + "");
////        List<I> is = Arrays.asList(new Number1(), new Number2(), new Number3(), new Number4());
////        is.stream()
////                .sorted((o1, o2) -> {
////                    if (o1.getWeight() < o2.getWeight())
////                        return 1;
////                    else
////                        return -1;
////                }).collect(Collectors.toList());

//        String appHost = "e.codingcorp.coding.9.134.66.12.xip.jojolocklock.com";
//        int start = StringUtils.indexOf(appHost,"." );

//
//        File file = new File(".");
//        log.error(file.getAbsolutePath());
//
//        DirectoryScanner scanner = new DirectoryScanner();
//
//        scanner.setIncludes(new String[]{"**/*.yaml"});
//        scanner.setBasedir(".");
//        scanner.setCaseSensitive(false);
//        scanner.scan();
//
//        String[] files = scanner.getIncludedFiles();


        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();

        CredentialsProvider provider = new BasicCredentialsProvider();

        AuthScope scope = new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT, AuthScope.ANY_REALM);

        UsernamePasswordCredentials credentials = new UsernamePasswordCredentials("coding@coding.com", "coding123");
        provider.setCredentials(scope, credentials);
        httpClientBuilder.setDefaultCredentialsProvider(provider);
        CloseableHttpClient client = httpClientBuilder.build();


        HttpPost post = new HttpPost("http://codingcorp-generic.pkg.coding.9.134.66.12.nip.io/test-1/generic/log");
        MultipartEntityBuilder entityBuilder = MultipartEntityBuilder.create();
        entityBuilder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);

        File file = new File("/Users/catchme/Downloads/轻松熊.png");
        entityBuilder.addBinaryBody(file.getName(), file);

        post.setEntity(entityBuilder.build());

        CloseableHttpResponse response = client.execute(post);
        return response;

    }

}

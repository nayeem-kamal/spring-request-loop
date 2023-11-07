package com.datadog.SpringTester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppController {

    private final RestTemplate restTemplate;

    @Autowired
    public AppController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/call")
    public String callReceiveEndpoint() {
        // Define the URL of the "receive" endpoint on localhost
        String receiveUrl = "http://localhost:8089/receive";

        // Make an HTTP GET request to the "receive" endpoint
        String response = restTemplate.getForObject(receiveUrl, String.class);

        // You can process the response or return it as is
        return "Response from /receive endpoint: " + response;
    }

    @GetMapping("/receive")
    public String receiveRequest() {
        // This endpoint handles the call from /call
        return "Received a request from /call endpoint with a 200 OK response";
    }
}

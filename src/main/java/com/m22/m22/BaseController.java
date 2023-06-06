package com.m22.m22;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController
public class BaseController {

    static class Base64Request {
        public String string;
    }

    static class Base64Response {
        public String string;
    }

    @PostMapping("/base64")
    public Base64Response encodeString(@RequestBody Base64Request request) {
        Base64Response response = new Base64Response();
        response.string = Base64.getEncoder().encodeToString(request.string.getBytes());
        return response;
    }
}

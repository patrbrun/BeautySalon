package com.grouptwo.saloon.api;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
@Api(value = "client")
public class ClientController {
}

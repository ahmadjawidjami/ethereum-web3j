package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.crypto.CipherException;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.concurrent.ExecutionException;

/**
 * Created by ahmadjawid on 5/23/17.
 */
@RestController
public class MainController {
    @Autowired
    Web3jSampleService web3jSampleService;


    @RequestMapping("/web3j")
    public String getWeb3j() throws IOException, ExecutionException, InterruptedException, CipherException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {



        return "connected successfully to + " + web3jSampleService.getClientVersion();

    }
}

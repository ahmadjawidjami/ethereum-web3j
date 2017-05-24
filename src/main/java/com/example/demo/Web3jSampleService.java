package com.example.demo;

/**
 * Created by ahmadjawid on 5/23/17.
 */
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletFile;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.parity.Parity;
import org.web3j.protocol.parity.methods.response.NewAccountIdentifier;

/**
 * Sample service to demonstrate web3j bean being correctly injected.
 */
@Service
public class Web3jSampleService {

    @Autowired
    private Web3j web3j;



    @Autowired
    Parity parity;

    public String getClientVersion() throws IOException, ExecutionException, InterruptedException, CipherException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
        Web3ClientVersion web3ClientVersion = web3j.web3ClientVersion().send();

        NewAccountIdentifier newAccountIdentifier = parity.personalNewAccount("test").send();

      //  WalletUtils.generateFullNewWalletFile("test", new java.io.File("/Users/ahmadjawid"));





     // newAccountIdentifier.setResult("0xa0086de99999926A3766664d3d27Aff0D4144444");



     //   String walletFile = "/Users/ahmadjawid/Library/Ethereum/testnet/keystore/UTC--2017-05-07T17-43-26.894790124Z--a0086de63efe926a3725bb4d3d27aff0d41a8e15";

//        file.setAddress("0xa0086de63efE926A3725BB4d3d27Aff0D41a8e15");


      //  Credentials credentials = WalletUtils.loadCredentials("test", walletFile);

      return String.valueOf(newAccountIdentifier.getAccountId());
      // return web3ClientVersion.getWeb3ClientVersion();
    }
}

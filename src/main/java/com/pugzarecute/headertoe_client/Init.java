package com.pugzarecute.headertoe_client;

import com.pugzarecute.headertoe_client.webclient.StartSession;

import java.io.IOException;
import java.net.URISyntaxException;

public class Init {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        // Initialize web client and start session with server
        StartSession session = new StartSession();
        session.init_session(args);
    }
}

package com.itbd.application.network;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;

public class ProxyConnectionTest {

    @Test
    public void testRun() throws IOException {
//        String[] proxyServers = {"103.23.41.110:30058", "43.231.22.228:80"};

        File proxyFile = new File("C:\\Users\\ridoy\\Downloads\\p.txt");
        String[] proxyServers = FileUtils.readFileToString(proxyFile, Charset.defaultCharset()).split("\n");

        for (String proxyServer : proxyServers) {
            testProxy(proxyServer.trim());
        }
    }

    public static void testProxy(String proxyServer) {
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyServer.split(":")[0], Integer.parseInt(proxyServer.split(":")[1])));
            URL url = new URL("http://172.16.50.5/FTP-1/"); // Replace with the URL you want to test
//            http://172.16.50.5/FTP-1/English%20Movies%20%281080p%29/
//            URL url = new URL("http://www.google.com"); // Replace with the URL you want to test

            HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxy);
            connection.setConnectTimeout(5000); // Set connection timeout to 5 seconds
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                System.out.println("Proxy " + proxyServer + " is working fine.");
            } else {
                System.out.println("Proxy " + proxyServer + " returned response code: " + responseCode);
            }

            connection.disconnect();
        } catch (Exception e){
            System.out.println("Proxy " + proxyServer + " could not be reached: " + e.getMessage());
        }
    }
}

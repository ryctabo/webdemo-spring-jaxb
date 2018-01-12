package com.github.ryctabo.webdemo.rest;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * @author Gustavo Pacheco (ryctabo at gmail.com)
 * @version 1.0-SNAPSHOT
 */
@ApplicationPath("v1")
public class ConfigApp extends ResourceConfig {

    public ConfigApp() {
        packages("com.github.ryctabo.webdemo.rest");
    }

}

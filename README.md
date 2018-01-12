# Webdemo Spring and JAXB
This example demostrates how to create simple Jersey Application, package it into WAR file and how to run it using [Gretty](http://akhikhl.github.io/gretty-doc/).

## Contents
The mapping of the URI path space is presented int the following table:

URI path | Resource class | Http methods
---------|----------------|-------------
/v1/persons|PersonResource|GET
/v1/persons/:id|PersonResource|GET

Application is configured by **ConfigApp** class, which registers [org.glassfish.jersey.server.ResourceConfig](https://jersey.github.io/apidocs/latest/jersey/index.html) descendant to get classes and singletons from it (see class ConfigApp).

## Running the example
Run the example as follows:
```bash
./gradlew appRun
```

This deploys the example using [Gretty](http://akhikhl.github.io/gretty-doc/) container. You can access the application at:
* http://localhost:8080/v1/persons/
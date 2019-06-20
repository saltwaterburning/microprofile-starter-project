package org.arj.thornbird.demo.app;

import javax.enterprise.inject.Default;

/**
 * Example bean.
 */
@Default
public class Greeter {

	// SwaggerArchivePreparer
    public String getGreeting() {
        return "hello: Thorntail + gradle + java";
    }
}
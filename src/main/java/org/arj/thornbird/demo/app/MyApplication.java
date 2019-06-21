package org.arj.thornbird.demo.app;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.security.SecurityRequirement;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

// https://blog.payara.fish/building-your-next-microservice-with-eclipse-microprofile
//@LoginConfig(authMethod = "MP-JWT", realmName = "admin-realm")
//@ApplicationScoped

// https://www.phillip-kruger.com/post/microprofile_openapi_swaggerui/
// https://github.com/phillip-kruger/microprofile-extensions
// https://github.com/eclipse/microprofile-config
// https://apis.guru/awesome-openapi3/category.html
@ApplicationPath("api")
@OpenAPIDefinition(info =
  @Info(title = "Sample Project",
      version = "0.0.1",
  description = "Demo API",
      license = @License(name = "Apache 2.0", url = "http://foo.bar"),
      contact = @Contact(url = "http://gigantic-server.com", name = "Fred", email = "Fred@gigagantic-server.com")
  ),
//  tags = {
//    @Tag(name = "Administration", description = "Admin API", externalDocs = @ExternalDocumentation(description = "docs desc")),
//    @Tag(name = "User", description = "User API", externalDocs = @ExternalDocumentation(description = "docs desc 2"))
//  },
  externalDocs = @ExternalDocumentation(description = "definition docs desc"),
  security = {
    @SecurityRequirement(name = "foo", scopes = {})
  },
  servers = {
		    @Server(description = "local-http",
                    url = "http://localhost:8080/"),
    @Server(description = "local-https",
                    url = "https://localhost:8080/")
  }
)
public class MyApplication extends Application {
	;
}

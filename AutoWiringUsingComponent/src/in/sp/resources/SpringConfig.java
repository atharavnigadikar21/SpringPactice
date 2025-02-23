package in.sp.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.sp.beans")  // ✅ Scans for @Component classes
public class SpringConfig {
}


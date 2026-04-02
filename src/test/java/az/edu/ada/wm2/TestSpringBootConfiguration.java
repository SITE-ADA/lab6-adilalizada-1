package az.edu.ada.wm2;

import az.edu.ada.wm2.lab6.Lab6Application;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootConfiguration
@Import(Lab6Application.class)
public class TestSpringBootConfiguration {
}

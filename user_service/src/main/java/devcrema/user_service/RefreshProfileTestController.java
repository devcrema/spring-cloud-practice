package devcrema.user_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/refresh/test")
@RefreshScope
public class RefreshProfileTestController {
    @Value("${server.port}")
    private int port;
    @Value("${spring.message}")
    private String message;

    @GetMapping("")
    public String refreshTest() {
        return "refresh - Port " + port + " - " + message;
    }
}

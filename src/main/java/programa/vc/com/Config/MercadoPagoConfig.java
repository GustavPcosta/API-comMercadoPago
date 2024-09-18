package programa.vc.com.Config;


import jakarta.annotation.PostConstruct;
import com.mercadopago.MercadoPago;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MercadoPagoConfig {

	@Value("${mercado-pago.access-token}")
    private String accessToken;

    @PostConstruct
    public void init() {
        MercadoPago.SDK.setAccessToken(accessToken);
    }
}
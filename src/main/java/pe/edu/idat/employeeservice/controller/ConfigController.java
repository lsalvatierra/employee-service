package pe.edu.idat.employeeservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    // Inyectamos los valores directamente desde el Config Server
    @Value("${messages.error-database}")
    private String errorDatabaseMsg;

    @Value("${messages.error-product-not-found}")
    private String errorProductNotFoundMsg;

    @GetMapping("/mensajes-error")
    public String obtenerMensajes() {
        return "Mensaje BD: " + errorDatabaseMsg + " | Mensaje Producto: " + errorProductNotFoundMsg;
    }
}

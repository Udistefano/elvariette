package distefano.elvariette.Contoller;

import distefano.elvariette.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;
public class ProductoController {
    @GetMapping("/productos")
    public String productos(Model model) {
        List<Producto> products = List.of(
                new Producto(1L, "Cuadro Personalizado", "Cuadro decorativo hecho a medida con tu foto favorita", 4500.0, "/images/cuadro1.jpg"),
                new Producto(2L, "Marco de Madera Natural", "Marco artesanal de madera natural para fotos 20x30", 2800.0, "/images/cuadro2.jpg"),
                new Producto(3L, "Collage de Fotos", "Composición artística con varias fotos en un solo cuadro", 6200.0, "/images/cuadro3.jpg"),
                new Producto(4L, "Cuadro Canvas", "Impresión de alta calidad sobre tela canvas estirada", 3900.0, "/images/cuadro4.jpg")
        );
        model.addAttribute("products", products);
        return "productos";
    }
}

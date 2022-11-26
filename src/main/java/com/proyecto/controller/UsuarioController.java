
package com.proyecto.controller;

import com.proyecto.entity.Usuario;
import com.proyecto.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UsuarioController {
    
    
    @Autowired
    private IUsuarioService usuarioService;
    
    @GetMapping("/usuario") //lo que esta dentro del aprentesis es un endpoint
    public String index(Model model) {
        List<Usuario> listaUsuario = usuarioService.getAllUsuario();
        model.addAttribute("titulo", "Tabla Usuarios");
        model.addAttribute("usuarios", listaUsuario);
        return "usuarios";

    }

    @GetMapping("/usuarioNAdministrador")
    public String crearUsuario(Model model) {
        
        
        model.addAttribute("usuario", new Usuario());
        
        
        return "crear_usuario";

    }
    
    @GetMapping("/usuarioNCliente")
    public String crearUsuario2(Model model) {
        
        
        model.addAttribute("usuario", new Usuario());
        
        
        return "login";

    }

    @PostMapping("/save")
    public String guardarUsuarioAdministrador(@ModelAttribute Usuario usuario) {
        usuarioService.saveUsuario(usuario);
        return "redirect:/usuario";
    }
    
    @PostMapping("/save2")
    public String guardarUsuarioCliente(@ModelAttribute Usuario usuario) {
        usuarioService.saveUsuario(usuario);
        return "redirect:/home.html";
    }

    @GetMapping("/editUsuario/{id}")
    public String editarUsuario(@PathVariable("id") Long idUsuario, Model model) {
        Usuario usuario = usuarioService.getUsuarioById(idUsuario);
       
        model.addAttribute("usuario", usuario);
        
        return "crear_usuario";
    }

    @GetMapping("/delete/{id}")
    public String eliminarUsuario(@PathVariable("id") Long idUsuario) {
        usuarioService.delete(idUsuario);
        return "redirect:/usuario";
    }
}

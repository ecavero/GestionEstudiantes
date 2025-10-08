package com.isil.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.isil.app.model.Estudiante;
import com.isil.app.repository.EstudianteRepository;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
   @Autowired private EstudianteRepository estudianteRepository;

   @GetMapping("/")
   String listarEstudiantes(Model model) {
      List<Estudiante> estudiantes = estudianteRepository.findAll();
      estudiantes.stream().forEach(e -> System.out.println(e));
      model.addAttribute("estudiantes", estudiantes);
      return "lista-estudiantes";
   }
}

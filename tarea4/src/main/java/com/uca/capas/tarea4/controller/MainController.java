package com.uca.capas.tarea4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.tarea4.domain.Producto;

@Controller
public class MainController {

	@RequestMapping("/producto")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("producto");
		return mav;
	}
	
	
	@RequestMapping("/resultado")
	public ModelAndView resultado(@Valid @ModelAttribute Producto prod, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) { 
			mav.setViewName("producto");
		}
		else {
			mav.addObject("codigo", prod.getCodigo());
			mav.addObject("nombre", prod.getNombre());
			mav.addObject("marca", prod.getMarca());
			mav.addObject("descripcion", prod.getDescripcion());
			mav.addObject("existencia", prod.getExistencia());
			mav.addObject("fecha", prod.getFecha());
			mav.setViewName("resultado");
		}
		return mav;
	}
}

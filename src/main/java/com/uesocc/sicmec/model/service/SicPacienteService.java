package com.uesocc.sicmec.model.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.uesocc.sicmec.framework.general.BaseService;
import com.uesocc.sicmec.model.dto.SicPacienteDto;


public interface SicPacienteService extends BaseService<SicPacienteDto, Integer>
{

	List<SicPacienteDto> findAllByEstado(String descripcion);
	/**
	* @param exp
	* @return paciente que se corresponda con este expediente
	*/
	SicPacienteDto findOneBynumeroExpediente(String exp);
	
	boolean validacionExpedientePaciente(String expediente);
	
	/**
	 * @param expediente
	 * @return Lista de pacientes cuyo expediente
	 * sea similar o contenga los caracteres ingresados
	 */
	List<SicPacienteDto> findAllByExp(String expediente);
	
	List<SicPacienteDto> findAll(Pageable page);
	
	/**
	 * @param page
	 * @param tipoBusqueda
	 * @return Lista de pacientes que respondan ya sea al nombre, apellido, expediente o DUI.
	 */
	List<SicPacienteDto> findAll(Pageable page,String tipoBusqueda, String criterio);
	
}

package com.sena.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.ecommerce.model.Usuario;
import com.sena.ecommerce.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

	// instancia de obejetos tipo privado del repository
	@Autowired
	private IUsuarioRepository usuariorepository;

	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuariorepository.save(usuario);
	}

	@Override
	public Optional<Usuario> get(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<Usuario> FinbyId(Integer id) {
		// TODO Auto-generated method stub
		return usuariorepository.findById(id);
	}

	@Override
	public Optional<Usuario> FinByEmail(String Email) {
		// TODO Auto-generated method stub
		return usuariorepository.findByEmail(Email);
	}

	@Override
	public List<Usuario> Findall() {
		// TODO Auto-generated method stub
		return usuariorepository.findAll();
	}

}

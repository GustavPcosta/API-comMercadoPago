package programa.vc.com.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class mercadoPagoModel {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	
	 
	 	private String nome;
	 	private String sobrenome;
	 	private String Cpf;
	 	private boolean statusPagamento;
	 	
	 	
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSobrenome() {
			return sobrenome;
		}
		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
		public String getCpf() {
			return Cpf;
		}
		public void setCpf(String cpf) {
			Cpf = cpf;
		}
		public boolean isStatusPagamento() {
			return statusPagamento;
		}
		public void setStatusPagamento(boolean statusPagamento) {
			this.statusPagamento = statusPagamento;
		}
		public mercadoPagoModel(Long id, String nome, String sobrenome, String cpf, boolean statusPagamento) {
			super();
			this.id = id;
			this.nome = nome;
			this.sobrenome = sobrenome;
			Cpf = cpf;
			this.statusPagamento = statusPagamento;
		}
		
		
		public mercadoPagoModel() {
			super();
			
		}
	 	
		
		
	 	
	 	
	 	
	
	
}

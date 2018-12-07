package mx.company.code.model;

public class TokenValidoResponse {
	private String token;
	private boolean valido;
	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
	/**
	 * @return the valido
	 */
	public boolean isValido() {
		return valido;
	}
	/**
	 * @param valido the valido to set
	 */
	public void setValido(boolean valido) {
		this.valido = valido;
	}
}

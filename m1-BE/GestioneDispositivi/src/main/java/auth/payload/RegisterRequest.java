package auth.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RegisterRequest {

	private String username;
	private String nome;
	private String cognome;
	private String email;
	private String passwprd;
}

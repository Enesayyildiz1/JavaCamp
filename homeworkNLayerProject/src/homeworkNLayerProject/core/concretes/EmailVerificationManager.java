package homeworkNLayerProject.core.concretes;

import homeworkNLayerProject.core.abstracts.EmailVerificationService;

public class EmailVerificationManager implements EmailVerificationService {

	@Override
	public void SendVerificationEmail(String email) {
		System.out.println(email+"adrese yollad���m�z maili do�rulay�n�z");
		
	}

}

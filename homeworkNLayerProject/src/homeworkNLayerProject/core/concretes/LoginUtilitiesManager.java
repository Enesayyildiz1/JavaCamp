package homeworkNLayerProject.core.concretes;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

import homeworkNLayerProject.core.abstracts.LoginUtilities;

public class LoginUtilitiesManager implements LoginUtilities{

	@Override
	public boolean checkName(String name) {
		if(!(name.isEmpty())&&name.length()<2)
		{
			System.out.println("Geçersiz isim");
			return false;
		}
			
		else {
			return true;
		}
	}

	@Override
	public boolean checkSurname(String surname) {
		if(!(surname.isEmpty())&&surname.length()<2)
		{
			System.out.println("Geçersiz soyisim");
			return false;
		}
			
		else {
			return true;
		}
	}

	@Override
	public boolean checkPassword(String password) {
		if(!(password.isEmpty())&&password.length()<6)
		{
			System.out.println("Geçersiz þifre");
			return false;
		}
		else {
			return true;
		}
			
		
	}

	@Override
	public boolean checkEmail(String email) {
		
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		 
		Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(email);
		
		if(!(email.isEmpty())&&!matcher.find())
		{
			System.out.println("Geçersiz Email");
			return false;
		}
		else {
			
			return true;
		}
	}

}

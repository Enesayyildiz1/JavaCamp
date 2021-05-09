package homeworkNLayerProject.business.concretes;

import homeworkNLayerProject.business.abstracts.UserService;
import homeworkNLayerProject.core.abstracts.EmailVerificationService;
import homeworkNLayerProject.core.abstracts.LoginUtilities;
import homeworkNLayerProject.core.abstracts.jOutSideServices;
import homeworkNLayerProject.dataAccess.abstracts.UserDao;
import homeworkNLayerProject.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private LoginUtilities loginUtilities;
	private EmailVerificationService verificationService;
	private jOutSideServices outsideService;

	




	public UserManager(UserDao userDao, LoginUtilities loginUtilities, EmailVerificationService verificationService,jOutSideServices outsideService) {
		
		this.userDao = userDao;
		this.loginUtilities = loginUtilities;
		this.verificationService = verificationService;
		this.outsideService = outsideService;
	}




	@Override
	public void login(String email, String password) {
		
		if(!loginUtilities.checkEmail(email))
		{
		return;
		}
		if(!loginUtilities.checkPassword(password))
		{
			return;
		}
		for(User user:userDao.getAll())
			{
			if(user.getEmail()==email&&user.getPassword()==password)
			{
				System.out.println("Sisteme giriþ baþarýlý");
				return;
			}
			else
			{
				System.out.println("Yanlýþ email veya parola");
			}
					
			}
		outsideService.loginWith();
		
	}

	@Override
	public void register(User user) {
		if(checkEmail(user.getEmail()))
				{
			return;
				}
		if(!loginUtilities.checkEmail(user.getEmail()))
		{
			return;
		}
		if(!loginUtilities.checkPassword(user.getPassword()))
		{
			return;
			
		}
		if(!loginUtilities.checkName(user.getName()))
		{
			return;
		}
		if(!loginUtilities.checkSurname(user.getSurname()))
		{
			return;
		}	
		outsideService.registerWith();
		verificationService.SendVerificationEmail(user.getEmail());
		userDao.register(user);
		System.out.println("Kayýt Baþarýlý");
		
	
		
	}

	@Override
	public boolean checkEmail(String email) {
		
		for(User user:userDao.getAll())
		{
			if(user.getEmail()==email)
			{
				System.out.println("Email mevcut");
				return true;
				
			}
			else {
				return false;
			}
			
		}
		return false;
			
		
	}
	
}

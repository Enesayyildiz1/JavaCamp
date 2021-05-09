package homeworkNLayerProject.core.concretes;
import homeworkNLayerProject.jLogger.jGoogleManager;
import homeworkNLayerProject.core.abstracts.jOutSideServices;

public class jGoogleAdapter implements jOutSideServices{
	jGoogleManager GoogleManager = new jGoogleManager();
	@Override
	public void registerWith() {
		
		GoogleManager.register();
	}

	@Override
	public void loginWith() {
		// TODO Auto-generated method stub
		GoogleManager.login();
	}

}

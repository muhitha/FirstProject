package PageClass;

import UtilPackage.SeleniumBaseClass;

public class LinkedinLoginPage extends SeleniumBaseClass {
		public static void Enter_Username_password(String UserName,String Password) {
		sendvalue("id", "session_username",UserName);
		sendvalue("id", "session_password",Password);
		}
		}

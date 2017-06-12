using System;

namespace TodoAWSSimpleDB
{
	public static class Constants
	{
		public static string AppName = "TodoListApp";

		// AWS
		// Sign up for an AWS account at https://aws.amazon.com/
		// Configure at https://console.aws.amazon.com/cognito/
		public static string CognitoIdentityPoolId = "us-east-2:337e8559-527f-47d9-af11-6e31f13bb280";

		// OAuth
		// For Google login, configure at https://console.developers.google.com/
		public static string ClientId = "294172294327666";
		public static string ClientSecret = "O87aIO_BM3wJfgnsFMXHlzmA";

		// These values do not need changing
		public static string Scope = "";
		public static string AuthorizeUrl = "https://m.facebook.com/dialog/oauth/";
		//public static string AccessTokenUrl = "https://accounts.google.com/o/oauth2/token";
	    public static string UserInfoUrl = "https://graph.facebook.com/v2.9/me?fields=id,name,link,gender,picture";

		// Set this property to the location the user will be redirected too after successfully authenticating
		public static string RedirectUrl = "http://www.facebook.com/connect/login_success.html";
	}
}

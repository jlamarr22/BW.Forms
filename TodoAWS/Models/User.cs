using System;
using Newtonsoft.Json;
using TodoAWSSimpleDB.Models;

namespace TodoAWSSimpleDB
{
	[JsonObject]
	public class User
	{
		[JsonProperty ("id")]
		public string Id { get; set; }

		[JsonProperty ("email")]
		public string Email { get; set; }

		[JsonProperty ("verified_email")]
		public bool VerifiedEmail { get; set; }

		[JsonProperty ("name")]
		public string Name { get; set; }

		[JsonProperty ("given_name")]
		public string GivenName { get; set; }

		[JsonProperty ("family_name")]
		public string FamilyName { get; set; }

		[JsonProperty ("link")]
		public string Link { get; set; }

		[JsonProperty ("picture")]
		public Picture Picture { get; set; }

		[JsonProperty ("gender")]
		public string Gender { get; set; }

	    public string GetWelcomeText()
	    {
	        return $"Welcome to ButtWasted, {Name}!";
	    }
	}
}

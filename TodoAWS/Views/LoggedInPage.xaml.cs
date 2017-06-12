using System;
using System.Diagnostics;
using System.Linq;
using Xamarin.Forms;
using Xamarin.Auth;
using Newtonsoft.Json;

namespace TodoAWSSimpleDB
{
	public partial class LoggedInPage : ContentPage
	{
		Account account;
		AccountStore store;

		public LoggedInPage()
		{
			InitializeComponent();

			store = AccountStore.Create();
			account = store.FindAccountsForService(Constants.AppName).FirstOrDefault();
		}

        protected override async void OnAppearing()
        {
            base.OnAppearing();
            Username.Text = App.User.GetWelcomeText();
            Picture.Source = new Uri(App.User.Picture.Url.ToString());
        }

	    async void PictureClicked(object sender, EventArgs e)
	    {
	        
	    }
    }
}

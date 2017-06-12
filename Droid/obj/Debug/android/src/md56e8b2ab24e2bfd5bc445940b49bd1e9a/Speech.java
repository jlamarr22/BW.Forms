package md56e8b2ab24e2bfd5bc445940b49bd1e9a;


public class Speech
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.speech.tts.TextToSpeech.OnInitListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInit:(I)V:GetOnInit_IHandler:Android.Speech.Tts.TextToSpeech/IOnInitListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("TodoAWSSimpleDB.Droid.Speech, TodoAWS-SimpleDB.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Speech.class, __md_methods);
	}


	public Speech () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Speech.class)
			mono.android.TypeManager.Activate ("TodoAWSSimpleDB.Droid.Speech, TodoAWS-SimpleDB.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onInit (int p0)
	{
		n_onInit (p0);
	}

	private native void n_onInit (int p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}

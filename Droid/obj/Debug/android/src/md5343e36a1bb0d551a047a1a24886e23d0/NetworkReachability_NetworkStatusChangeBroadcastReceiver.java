package md5343e36a1bb0d551a047a1a24886e23d0;


public class NetworkReachability_NetworkStatusChangeBroadcastReceiver
	extends android.content.BroadcastReceiver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onReceive:(Landroid/content/Context;Landroid/content/Intent;)V:GetOnReceive_Landroid_content_Context_Landroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("Amazon.Util.Internal.PlatformServices.NetworkReachability+NetworkStatusChangeBroadcastReceiver, AWSSDK.Core, Version=3.1.0.0, Culture=neutral, PublicKeyToken=885c28607f98e604", NetworkReachability_NetworkStatusChangeBroadcastReceiver.class, __md_methods);
	}


	public NetworkReachability_NetworkStatusChangeBroadcastReceiver () throws java.lang.Throwable
	{
		super ();
		if (getClass () == NetworkReachability_NetworkStatusChangeBroadcastReceiver.class)
			mono.android.TypeManager.Activate ("Amazon.Util.Internal.PlatformServices.NetworkReachability+NetworkStatusChangeBroadcastReceiver, AWSSDK.Core, Version=3.1.0.0, Culture=neutral, PublicKeyToken=885c28607f98e604", "", this, new java.lang.Object[] {  });
	}


	public void onReceive (android.content.Context p0, android.content.Intent p1)
	{
		n_onReceive (p0, p1);
	}

	private native void n_onReceive (android.content.Context p0, android.content.Intent p1);

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

package md546c5e78f838042973048a226c3fadeec;


public class TranslationHistoryActivity
	extends android.app.ListActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("Phoneword.TranslationHistoryActivity, Phoneword", TranslationHistoryActivity.class, __md_methods);
	}


	public TranslationHistoryActivity ()
	{
		super ();
		if (getClass () == TranslationHistoryActivity.class)
			mono.android.TypeManager.Activate ("Phoneword.TranslationHistoryActivity, Phoneword", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

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

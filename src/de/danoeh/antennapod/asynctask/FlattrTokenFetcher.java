package de.danoeh.antennapod.asynctask;


import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import de.danoeh.antennapod.AppConfig;
import de.danoeh.antennapod.R;
import de.danoeh.antennapod.util.FlattrUtils;

/** Fetches the access token in the background in order to avoid networkOnMainThread exception. */
/*
public class FlattrTokenFetcher extends AsyncTask<Void, Void, AccessToken> {
	private static final String TAG = "FlattrTokenFetcher";
	Context context;
	AndroidAuthenticator auth;
	AccessToken token;
	Uri uri;
	ProgressDialog dialog;
	FlattrException exception;
	
	public FlattrTokenFetcher(Context context, AndroidAuthenticator auth, Uri uri) {
		super();
		this.context = context;
		this.auth = auth;
		this.uri = uri;
	}

	@Override
	protected void onPostExecute(AccessToken result) {
		if (result != null) {
			FlattrUtils.storeToken(result);
		}
		dialog.dismiss();
		if (exception == null) {
			FlattrAuthActivity instance = FlattrAuthActivity.getInstance();
			if (instance != null) {
				instance.handleAuthenticationSuccess();
			} else {
				Log.e(TAG, "FlattrAuthActivity instance was null");
			}
		} else {
			FlattrUtils.showErrorDialog(context, exception.getMessage());
		}
	}



	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		dialog = new ProgressDialog(context);
		dialog.setMessage(context.getString(R.string.processing_label));
		dialog.setIndeterminate(true);
		dialog.setCancelable(false);
		dialog.show();			
	}



	@Override
	protected AccessToken doInBackground(Void... params) {
		try {
			token = auth.fetchAccessToken(uri);
		} catch (FlattrException e) {
			e.printStackTrace();
			exception = e;
			return null;
		}
		if (token != null) {
			if (AppConfig.DEBUG) Log.d(TAG, "Successfully got token");
			return token;
		} else {
			Log.w(TAG, "Flattr token was null");
			return null;
		}
	}

	@SuppressLint("NewApi")
	public void executeAsync() {
		if (android.os.Build.VERSION.SDK_INT > android.os.Build.VERSION_CODES.GINGERBREAD_MR1) {
			executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
		} else {
			execute();
		}
	}
	
}
*/
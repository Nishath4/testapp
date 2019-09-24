import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.catalyst.Context;
import com.catalyst.basic.BasicIO;
import com.catalyst.basic.ZCFunction;
import com.zc.api.APIRequest;
import com.zc.api.APIResponse;
import com.zc.api.APIConstants.RequestMethod;
import com.zc.common.ZCProject;
import com.zc.component.cache.ZCCache;
import com.zc.component.cache.ZCSegment;
import com.zc.component.object.ZCObject;
import com.zc.component.object.ZCRowObject;
import com.zc.component.object.ZCTable;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MyBasicIOFunction implements ZCFunction {
	
	private static final Logger LOGGER = Logger.getLogger(MyBasicIOFunction.class.getName());
	
	@Override
	public void runner(Context context, BasicIO basicIO) throws Exception {
	
		String name = (String) basicIO.getParameter("name");
		try{
			
			LOGGER.log(Level.SEVERE,"Inside in Basic IO Function");
			//ZCProject.initProject();
			//ZCCache.getInstance().putCacheValue("InsertedFromSDK", name, 1L);
		}
		catch(Exception e){
			LOGGER.log(Level.SEVERE,"Exception in Basic IO Function",e);
		}
	   
	    basicIO.setStatus(200);
	    basicIO.write("Hello"+ name +" This is a sample Java Function. Your cache value is Inserted.");
	
	    }
}
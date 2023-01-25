package diagnosa.tanaman.gambas;


import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

    public class connection {
        private static connection vInstance;
        private RequestQueue requestQueue;
        private static Context vCtx;

        private connection (Context context) {
            vCtx = context;
            requestQueue = getRequestQueue();
        }

        private RequestQueue getRequestQueue() {
            if (requestQueue == null) {
                requestQueue = Volley.newRequestQueue(vCtx.getApplicationContext());
            }
            return requestQueue;
        }

        public static synchronized connection getInstance(Context context) {
            if (vInstance == null) {
                vInstance = new connection(context);
            }
            return vInstance;
        }

        public<T> void addToRequestQue (Request<T> request) {
            getRequestQueue().add(request);
        }
    }
package com.udacity.gradle.builditbigger;

import android.os.Handler;
import android.os.Looper;
import android.test.AndroidTestCase;

import java.util.concurrent.ExecutionException;

public class AsyncNonNullTest extends AndroidTestCase {

    public void test() {

        String result;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext(), null) {
            @Override
            protected void onPostExecute(String result) {
                // Overriding onPostExecute
            }
        };
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
        } catch (InterruptedException e) {
            result = null;
        } catch (ExecutionException e) {
            result = null;
        }

        final String finalResult = result;

        new Thread(new Runnable() {
            @Override
            public void run() {
                Looper.prepare();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        assertNotNull(finalResult);
                    }
                }, 10000);
            }
        }).run();
    }
}
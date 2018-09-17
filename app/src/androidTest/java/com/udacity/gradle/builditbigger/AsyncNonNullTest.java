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
        assertNotNull(finalResult);
    }
}